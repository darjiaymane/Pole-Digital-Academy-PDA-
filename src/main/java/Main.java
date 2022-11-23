public class Main {
    public static void main(String[] args) {
      test test = new test();
       String result=test.userName("admin");
        System.out.println("case One using admin UserName :  "+result);
     String result2=test.userName("Mohamed");
        System.out.println("case tow using Mohamed UserName  : "+result2);

    }
}
  class  test{
    public  String userName(String username){
        String expectedResult =null;

      if(username.equals("admin")){
        expectedResult ="valid username";
      }else {
          expectedResult ="invalid username ";
      }


        return expectedResult;
    }
}