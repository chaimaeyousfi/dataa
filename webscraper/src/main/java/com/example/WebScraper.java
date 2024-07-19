package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScraper {

    public static class Product {
        String name;
        String price;
        String description;
        String stock;

        public Product(String name, String price, String description, String stock) {
            this.name = name;
            this.price = price;
            this.description = description;
            this.stock = stock;
        }
    }

    public List<Product> scrapeData() {
        List<Product> products = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("https://scrapeme.live/shop/").get();
            Elements items = doc.select(".product");

            for (Element item : items) {
                String name = item.select(".woocommerce-loop-product__title").text();
                String price = item.select(".price").text();
                String description = item.select(".product-description").text();
                String stock = item.select(".stock").text();
                products.add(new Product(name, price, description, stock));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
