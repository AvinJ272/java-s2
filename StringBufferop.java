public class StringBufferop{
    public StringBufferop(){
    }
        public static void main(String[] var0){
            StringBuffer var1= new StringBuffer("Java programming");
            System.out.println("(i) The capacity of String buffer object is "+ var1.capacity());
            String var2=var1.reverse().toString();
            System.out.println("(ii) The reversed string buffer object is "+ var2.toUpperCase());
            System.out.println("(iii) The string after append is "+ String.valueOf(var1.append("Language")));

        }
}