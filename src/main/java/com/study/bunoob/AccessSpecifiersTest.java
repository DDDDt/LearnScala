package com.study.bunoob;

/**
 * 和scala相比
 */
public class AccessSpecifiersTest {

    private static class TestAccess{

        private String bol = "私有的";

        protected String bolPro = "受保护的";

        public String bolPub = "公共的";

    }

    public static class TestAccessImp extends TestAccess{



    }

    public static void main(String[] args) {

        TestAccess testAccess = new TestAccess();

        /*都可以访问到*/
        System.out.println(testAccess.bol);
        System.out.println(testAccess.bolPro);
        System.out.println(testAccess.bolPub);

        TestAccess testAccess1 = new TestAccessImp();
        System.out.println(testAccess1.bolPub);
        /*私有类型可以访问，如果改为 TestAccessImp testAccess1 = new TestAccessImp() 就不可以访问了*/
        System.out.println(testAccess1.bol);
        System.out.println(testAccess1.bolPro);

    }

}
