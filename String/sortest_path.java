public class sortest_path {
    public static void main(String[] args) {
        String path = "WNEENESEEENN";
        System.out.println(sortestPathFun(path));
    }

    private static Float sortestPathFun(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // East
            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        Float sortPath = (float) Math.sqrt(X2 + Y2);
        return sortPath;
    }

}
