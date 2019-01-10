/*
 * Method canPack has three parameters of type int named bigCount, smallCount and goal. 
 * The sum of the kilos of bigCount and smallCount must be at least equal to 
 * the value of goal. The method should return true if it is possible to make a 
 * package with goal kilos of flour, and it's okay if there are additional bags 
 * left over.
 */
package flourpack;

/**
 *
 * @author AJC
 */
public class Package {

    /**
     *
     * @param bigCount
     * @param smallCount
     * @param goal
     * @return
     */
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        for (int i = bigCount; i >= 0; i--) {
            if ((i * 5) <= goal && (i * 5) + smallCount >= goal) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println(canPack(2, 0, 10));//true
        System.out.println(canPack(2, 2, 12)); //true
        System.out.println(canPack(2, 0, 6)); //false
        System.out.println(canPack(2, 0, 5)); // true
        System.out.println(canPack(0, 3, 2)); // true
        System.out.println(canPack(3, 2, 12)); // true
        System.out.println(canPack(3, 2, 11)); // true
        System.out.println(canPack(2, 3, 7)); // true
        System.out.println(canPack(2, 3, 9)); // false
    }
}
