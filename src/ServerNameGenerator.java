public class ServerNameGenerator {

    public static String[] adjectives = {"super", "mega", "ultimate", "best", "great", "crazy", "dedicated", "motivated", "galactic", "powerful"};
    public static String[] nouns = {"galaxy", "universe", "forest", "city", "jungle", "desert", "cave", "mountain", "park", "island"};

    public static void serverName() {
        int randomNum = (int) (Math.random() * 10);
        int randomNum2 = (int) (Math.random() * 10);
        String newServer = adjectives[randomNum] + "-" + nouns[randomNum2];
        System.out.println("Here is your server name: " + newServer);
    }

    public static void main(String[] args) {

        serverName();
    }
}
