package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        try {

            //System.out.println("=== 벅스 ===");

            /*Document bugs =  Jsoup.connect("https://sports.news.naver.com/wfootball/record/index.nhn?category=epl&tab=team&year=2018").get();
            System.out.println(bugs);
            //System.out.println(doc.html());
            Elements result_bugs = bugs.select("[class=\"team\"]")
                    .select("a")
                    .select("span");
                    *//*.select("a")
                    .select("span");*//*

            // 벅스 차트 저장되는 배열
            List<String> list_bugs = result_bugs.eachText();
            int i=0;
            for(String title : list_bugs) {
                System.out.printf("%d. %s\n", ++i, title);
            }*/

//            Document test =  Jsoup.connect("https://www.melon.com/chart/index.htm").get();
//
//            Elements links = test.select("[id=lst50]")
//                    .select("td")
//                    .select("div")
//                    .select("div")
//                    .select("div")
//                    .select("span")
//                    .select("a[href]");
//
////            String[] words;
//
//            for(Element link : links) {
////                words = link.attr("href").substring(16, 19);
//                String a = link.attr("href").substring(17, 21);
//                System.out.println(a);
//                if(a.equals("play")) {
//                    System.out.println("text: " + link.text());
//                }
//            }

//            System.out.println("\n\n\n=== 멜론 ===");
//
//            // 멜론 차트 저장되는 배열
//            List<String> list_melon = new ArrayList<>();
//
//            Document melon =  Jsoup.connect("https://www.melon.com/chart/index.htm").get();
//            //System.out.println(doc.html());
//            Elements result_melon = melon.select("[id=lst50]")
//                    .select("td")
//                    .select("div")
//                    .select("div")
//                    .select("div")
//                    .select("span")
//                    .select("a[href]");
//            int j=0;
//            for(Element link : result_melon) {
////                words = link.attr("href").substring(16, 19);
//                String a = link.attr("href").substring(17, 21);
////                System.out.println(a);
//                if(a.equals("play")) {
//                    System.out.println(++j + ". " + link.text());
//                    list_melon.add(a);
//                }
//            }
//
//            melon =  Jsoup.connect("https://www.melon.com/chart/index.htm#params%5Bidx%5D=51").get();
//            //System.out.println(doc.html());
//            result_melon = melon.select("[id=lst100]")
//                    .select("td")
//                    .select("div")
//                    .select("div")
//                    .select("div")
//                    .select("span")
//                    .select("a[href]");
//            for(Element link : result_melon) {
////                words = link.attr("href").substring(16, 19);
//                String a = link.attr("href").substring(17, 21);
////                System.out.println(a);
//                if(a.equals("play")) {
//                    System.out.println(++j + ". " + link.text());
//                    list_melon.add(a);
//                }
//            }

            Document bugs =  Jsoup.connect("https://dimigo.in/").get();
            System.out.println(bugs);
            //System.out.println(doc.html());
            Elements result_bugs = bugs.select("[class=\"meal-item__title\"]")
                    .select("div");

            // 벅스 차트 저장되는 배열
            List<String> list_bugs = result_bugs.eachText();
            System.out.println(list_bugs);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
