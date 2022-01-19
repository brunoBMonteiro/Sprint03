package streams.collectors;

import streams.withStreamsWithoutStreams.Category;
import streams.withStreamsWithoutStreams.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 5.95, Category.FANTASY),
            new LightNovel("Violet Evergarden", 3.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.50, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        // Without Collector
        /*
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels){
            switch (lightNovel.getCategory()){
                case DRAMA : drama.add(lightNovel); break;
                case FANTASY : fantasy.add(lightNovel); break;
                case ROMANCE : romance.add(lightNovel); break;
            }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);

        System.out.println(categoryLightNovelMap);
         */

        // With collector
        System.out.println();
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
