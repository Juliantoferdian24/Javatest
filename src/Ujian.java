public class Ujian {
    public static void main(String[] args) {
        {
            try{
                System.out.print("A");
                foo();
                System.out.print("B");
            } catch (Exception ex){
                System.out.println("C");
            }finally {
                System.out.println("D");
            }
            System.out.println("E");
        }
    }

    public static void foo(){
        throw new IllegalStateException();
    }
}
