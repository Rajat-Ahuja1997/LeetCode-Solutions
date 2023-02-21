// https://leetcode.com/problems/fruit-into-baskets

class Solution {
    public int totalFruit(int[] fruits) {
        int windowStart = 0;
        int maxFruitSize = 0;
        Map<Integer, Integer> fruitFrequency = new HashMap<>();
        for (int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
            int rightFruit = fruits[windowEnd];
            fruitFrequency.put(rightFruit, fruitFrequency.getOrDefault(rightFruit, 0) + 1);

            while (fruitFrequency.size() > 2) {
                int leftFruit = fruits[windowStart];
                fruitFrequency.put(leftFruit, fruitFrequency.get(leftFruit) - 1);
                if (fruitFrequency.get(leftFruit) == 0) {
                    fruitFrequency.remove(leftFruit);
                }
                windowStart++;
            }
            int currentWindowSize = windowEnd - windowStart + 1;
            maxFruitSize = Math.max(maxFruitSize, currentWindowSize);
        }
        return maxFruitSize;
    }
}