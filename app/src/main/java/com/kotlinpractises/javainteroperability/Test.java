package com.kotlinpractises.javainteroperability;
public class Test {
    //https://www.baeldung.com/kotlin/jvm-annotations
    private void myFun(){
        AppUtils.f1();
        int a = AppUtils.a;

        JVMFieldDataClass obj = new JVMFieldDataClass(10,"22");
        obj.myBValue();

    }
    public static void main(String[] arg){
        /*DataClasswithDefaulArg d=new DataClasswithDefaulArg(10,"20");
        DataClasswithDefaulArg c=new DataClasswithDefaulArg(10);
        System.out.println(d.getB());
        System.out.println(c.getB());
        int b=NormalClass.a;
        new NormalClass().myNewFun();
        NormalClass.f2();*/
    }
}


