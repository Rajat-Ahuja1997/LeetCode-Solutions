// https://leetcode.com/problems/fruit-into-baskets

class Solution {
    public int totalFruit(int[] fruits) {
        int treeStart = 0;
        int maxFruit = 0;
        Map<Integer, Integer> fruitFrequency = new HashMap<>();
        for (int treeEnd = 0; treeEnd < fruits.length; treeEnd++) {
            int rightFruit = fruits[treeEnd];
            fruitFrequency.put(rightFruit, fruitFrequency.getOrDefault(rightFruit, 0) + 1);

            while (fruitFrequency.size() > 2) {
                int leftFruit = fruits[treeStart];
                fruitFrequency.put(leftFruit, fruitFrequency.get(leftFruit) - 1);
                if (fruitFrequency.get(leftFruit) == 0) {
                    fruitFrequency.remove(leftFruit);
                }
                treeStart++;
            }
            maxFruit = Math.max(maxFruit, treeEnd - treeStart + 1);
        }
        return maxFruit;
    }
}