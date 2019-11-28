class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for (int i=0; i < colors.length; i++) {
            if (colors[i] == 0) {
                if (!dfs(graph, i, colors, 1))
                    return false;
            }
        }
        return true;
    }
    boolean dfs(int[][] graph, int current, int[] colors, int color) {
        if (colors[current] == -color)
            return false;
        colors[current] = color;
        for (int other: graph[current]) {
            if (colors[other] == color)
                return false;
            if (colors[other] == 0)
                if (!dfs(graph, other, colors, -color))
                    return false;
        }
        return true;
    }
}
