import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.logobook.ru/").get();

            Elements imgElements = doc.select("img");
            Elements aElements = doc.select("a");
            Elements divElements = doc.select("div.cl_l");

            divElements.forEach(divElement ->{
                String onclick = divElement.attr("onclick");


                System.out.println("Ссылки на котегории книг: " + "https://www.logobook.ru/prod_show." + " | " + onclick); //йоптыть
            });

            aElements.forEach(aElement ->{
                String a = aElement.attr("href");
                System.out.println("Ссылка: " + a);
            });

            imgElements.forEach(imgElement ->{
                String onclick = imgElement.attr("src");
                if (onclick.contains("https://www."))
                    return;
                else
                    System.out.println("Картинка: " + "https://www.logobook.ru/"+onclick);
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}