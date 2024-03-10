class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int h : happiness) {
            maxHeap.offer(h);
        }

        long sum = 0;
        int count = 0;
        int remainingChildren = k;

        while (!maxHeap.isEmpty() && remainingChildren > 0) {
            int happinessValue = maxHeap.poll();
            sum += Math.max(happinessValue - count, 0);
            count++;
            remainingChildren--;
        }

        return sum;
    }
}
