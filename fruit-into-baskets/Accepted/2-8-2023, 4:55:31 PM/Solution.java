// https://leetcode.com/problems/fruit-into-baskets

class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruit = 0;
        int windowStart = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
            int rightFruit = fruits[windowEnd];
            frequency.put(rightFruit, frequency.getOrDefault(rightFruit, 0) + 1);

            while (frequency.size() > 2) {
                int leftFruit = fruits[windowStart];
                frequency.put(leftFruit, frequency.get(leftFruit) - 1);

                if (frequency.get(leftFruit) == 0) {
                    frequency.remove(leftFruit);
                }
                windowStart++;
            }
            maxFruit = Math.max(maxFruit, windowEnd - windowStart + 1);
        }
        return maxFruit;
    }
}