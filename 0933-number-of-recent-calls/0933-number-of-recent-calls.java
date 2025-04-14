import java.util.*;

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t); // Add current ping time

        // Remove pings that are older than t - 3000
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        // Return the number of recent pings in the last 3000ms
        return queue.size();
    }
}
