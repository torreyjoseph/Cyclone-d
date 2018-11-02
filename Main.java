public class Main {

    public static void main(String[] args) {
        double d1 = calcDist(25,-15,23,-20);
        double d2 = calcDist(23,-20,21,-24);
        double d3 = calcDist(21,-24,20,-27);
        double d4 = calcDist(20,-27,19,-35);
        double d5 = calcDist(19,-35,21,-46);
        double d6 = calcDist(21,-46,23,-56);
        double d7 = calcDist(23,-56,25,-65);
        double d8 = calcDist(25,-65,28,-70);
        double d9 = calcDist(28,-70,32,-73);
        double d10 = calcDist(32,-73,34,-74);
        double d11 = calcDist(34,-74,36,-74);
        double d12 = calcDist(36,-74,39,-74);
        double tDist = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12;
        System.out.printf("The total distance travelled by Hurricane Gloria was %,.4f km.", tDist);
}
    public static double calcDist(double x1, double y1, double x2, double y2) {
        double radX1 = Math.toRadians(x1);
        double radX2 = Math.toRadians(x2);
        double radY1 = Math.toRadians(y1);
        double radY2 = Math.toRadians(y2);
        double a = Math.pow(Math.sin((radX1 - radX2)/2), 2) + Math.cos(radX1) * Math.cos(radX2) * Math.pow(Math.sin((radY1 - radY2)/2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = 6371 * c;
        return d;
    }
}
