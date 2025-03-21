import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < recipes.length; i++) queue.add(i);

        List<String> result = new ArrayList<>();
        int lastSize = -1;

        while (available.size() > lastSize) {
            lastSize = available.size();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int idx = queue.poll();
                if (ingredients.get(idx).stream().allMatch(available::contains)) {
                    available.add(recipes[idx]);
                    result.add(recipes[idx]);
                } else {
                    queue.add(idx);
                }
            }
        }
        return result;
    }
}