public final class MonSingleton {


    private static MonSingleton instance;
    private MonSingleton(){

    }

    public static MonSingleton getInstance(){
        if (instance == null) {
            instance = new MonSingleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        MonSingleton ref1= MonSingleton.getInstance();
        MonSingleton ref2 = MonSingleton.getInstance();

        System.out.println(ref1);

        System.out.println( ref1==ref2);
        System.out.println(4+"2");
    }
}

