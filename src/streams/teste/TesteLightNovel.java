package streams.teste;

import streams.introduction.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLightNovel {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 5.95),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no life", 7.99),
            new LightNovel("Fullmetal Alchemist", 5.50)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();

        for(LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
