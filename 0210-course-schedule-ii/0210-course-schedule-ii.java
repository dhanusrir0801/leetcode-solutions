class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            indegree[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while (!queue.isEmpty()) {

            int course = queue.poll();
            result[index++] = course;

            for (int[] p : prerequisites) {

                if (p[1] == course) {
                    indegree[p[0]]--;

                    if (indegree[p[0]] == 0) {
                        queue.offer(p[0]);
                    }
                }
            }
        }

        if (index == numCourses) {
            return result;
        }

        return new int[0];
    }
}