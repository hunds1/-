import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class One {
    private String img;
    private String a;
    private String div;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    @Override
    public String toString() {
        return "One{" +
                "img='" + img + '\'' +
                ", a='" + a + '\'' +
                ", div='" + div + '\'' +
                '}';
    }
}
