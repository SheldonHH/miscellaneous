public class Hanoi1 {
    /**
    * 
    * @param n 盘子的数目
    * @param origin 源座
    * @param assist 辅助座
    * @param destination 目的座
    */
    private static int count=0;
    private static int lastNum = 0;

    public static int init(int n, char origin, char assist, char destination) {
        if (n <= 1) {
            lastNum = move(origin, destination);
        } else {
            init(n - 1, origin, destination, assist);
            lastNum = move(origin, destination);
            init(n - 1, assist, origin, destination);
        }
        return lastNum;
    }
 
    // Print the route of the movement
    private static int move(char origin, char destination) {      
        System.out.println("Direction:" + origin + "--->" + destination);
        count++;
       System.out.println(count);
        return count;
    }
 
    public static void main(String[] args) {
        int totalTime = Hanoi1.init(4, 'A', 'B', 'C');
        System.out.println("totalTime is "+totalTime);
    }
}