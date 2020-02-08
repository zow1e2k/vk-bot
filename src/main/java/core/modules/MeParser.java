package core.modules;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MeParser {
    private int id;
    private Document doc;

    public MeParser() throws IOException {
        doc = Jsoup.connect("https://vk.com/donchambers").get();
    }

    private MeParser(int id) throws IOException {
        this();
        this.id = id;
    }

    public String getName() {
        Elements elements = doc.getElementsByClass("page_name");
        return elements.text();
    }
}
