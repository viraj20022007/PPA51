
class WrapperDemo
{
    public static void main(String arg[])
    {
        int no1 = 11;

        Integer no2 = 11;

        System.out.println(no1);
        System.out.println(no2); 

        int x = no2;            // auto unboxing
        System.out.println(x);

        Integer y = no1;        // auto boxing'
        System.out.println(y);     
    }
}