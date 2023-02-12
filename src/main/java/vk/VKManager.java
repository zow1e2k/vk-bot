package vk;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.queries.messages.MessagesSendQuery;
import core.enums.Admins;

public class VKManager {
    public static VKCore vkCore;

    static {
        try {
            vkCore = new VKCore();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg, int peerId){
        if (msg == null){
            System.out.println("null");
            return;
        }
        try {
            vkCore.getVk()
                    .messages()
                    .send(vkCore.getActor())
                    .peerId(peerId)
                    .message(msg)
                    .execute();
        }
        catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public void sendButtonMessage(String msg, int peerId, String keyboard){
        if (msg == null){
            System.out.println("null");
            return;
        }
        try {
            vkCore
                    .getVk()
                    .messages()
                    .send(vkCore.getActor())
                    .peerId(peerId)
                    .message(msg)
                    .unsafeParam("keyboard", keyboard)
                    .execute();
        }
        catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public void sendMessageToAdm(String msg){
        if (msg == null){
            System.out.println("null");
            return;
        }
        try {
            vkCore
                    .getVk()
                    .messages()
                    .send(vkCore.getActor())
                    .peerId(Admins.Admin.getId())
                    .message(msg)
                    .execute();
        }
        catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public void sendMessageToDesigner(String msg){
        if (msg == null){
            System.out.println("null");
            return;
        }
        try {
            //vkCore.getVk().messages().send(vkCore.getActor()).peerId(493775105).message(msg).execute();
            vkCore.getVk().messages().send(vkCore.getActor()).peerId(Admins.Admin.getId()).message(msg).execute();
        }
        catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public static int getPeerId() {
        int peer = vkCore.getActor().getId();
        return peer;
    }

    public MessagesSendQuery getSendQuery(){
        return vkCore.getVk().messages().send(vkCore.getActor());
    }

    /**
     * Обращается к VK API и получает объект, описывающий пользователя.
     * @param id идентификатор пользователя в VK
     * @return {@link UserXtrCounters} информацию о пользователе
     * @see UserXtrCounters
     */
    /*public static UserXtrCounters getUserInfo(int id){
        try {
            return vkCore.getVk().users()
                    .get(vkCore.getActor())
                    .userIds(String.valueOf(id))
                    .execute()
                    .get(0);
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
