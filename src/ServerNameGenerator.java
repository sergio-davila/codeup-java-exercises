public class ServerNameGenerator {

    String[] adjectives = {"super", "mega", "ultimate", "best", "great", "crazy", "dedicated", "motivated", "galactic", "powerful"};
    String[] nouns = {"galaxy", "universe", "forest", "city", "jungle", "desert", "cave", "mountain", "park", "island"};

    public String serverName() {
        int randomNum = (int) (Math.random() * 11);
        int randomNum2 = (int) (Math.random() * 11);
        return adjectives[randomNum] + nouns[randomNum2];
    }

    public static void main(String[] args) {

    }
}
