package vk;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollHistoryQuery;
import java.util.List;

public class VKCore {
    private VkApiClient vk;
    private static int ts;
    private GroupActor actor;
    private static int maxMsgId = -1;

    public VKCore() throws ClientException, ApiException {
        TransportClient transportClient = HttpTransportClient.getInstance();
        vk = new VkApiClient(transportClient);
        int groupId = 218062129;
        String access_token = "vk1.a.RLPrhfLc2bj1k3aqUtmfSXNCZxTLl4m7i__OmtWwjUZTGBTsNo1Xwc32bUPZtu25FTCOccm3Aen1zxRnDMjxzONh9013LYmK_t1Q2c-d6t0YYCM_0mnbfS_VMVKAQj17W-FtW_Urn2VWW6bZKgdWqBcRcrPQ-4F53Espd2U46_yp0XgglmS74n5plk5e4sK8iGv__FmB607LUiuM-Q8xLA";
        actor = new GroupActor(groupId, access_token);
        ts = getVk().messages().getLongPollServer(actor).execute().getTs();
    }
    public GroupActor getActor() {
        return actor;
    }
    public VkApiClient getVk() {
        return vk;
    }

    public Message getMessage() throws ClientException, ApiException {
        MessagesGetLongPollHistoryQuery eventsQuery = getVk().messages()
                .getLongPollHistory(actor)
                .ts(ts);
        if (maxMsgId > 0){
            eventsQuery.maxMsgId(maxMsgId);
        }
        List<Message> messages = eventsQuery
                .execute()
                .getMessages().getItems();

        if (!messages.isEmpty()){
            try {
                ts =  getVk().messages()
                        .getLongPollServer(actor)
                        .execute()
                        .getTs();
            } catch (ClientException e) {
                e.printStackTrace();
            }
        }
        if (!messages.isEmpty() && !messages.get(0).isOut()) {
                /*
                messageId - максимально полученный ID, нужен, чтобы не было ошибки 10 internal server error,
                который является ограничением в API VK. В случае, если ts слишком старый (больше суток),
                а max_msg_id не передан, метод может вернуть ошибку 10 (Internal server error).
                 */
            int messageId = messages.get(0).getId();
            if (messageId > maxMsgId){
                maxMsgId = messageId;
            }
            return messages.get(0);
        }
        return null;
    }
}