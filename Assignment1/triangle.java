public class triangle {
    int base;
    int height;
    triangle(int base, int height)
    {
        this.base=base;
        this.height=height;

    }   
    void area(int base, int height){
        Double area=0.5*base*height;
        System.out.println("triangle area "+area);
    } 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in)
        System.out.println("enter base");
         int base=sc.nextint;
         System.out.println("");

        System.out.println("");
    }
}
