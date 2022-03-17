public class singleton_pattern_Test {
    public static void main(String[] args){
        singleton_pattern ins1 = singleton_pattern.getInstance();
        singleton_pattern ins2 = singleton_pattern.getInstance();

        System.out.println(ins1 == ins2);
    }
}
