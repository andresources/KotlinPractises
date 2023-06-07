package com.kotlinpractises.javainteroperability;
public class JavaMain {
    public static void main(String[] arg){
        AppConstants.INSTANCE.f1();//with out @JVMStatic annotation
        AppConst.Companion.f2();//with out @JVMStatic annotation

        AppConstants.f1();//with @JVMStatic annotation
        AppConst.f2();//with @JVMStatic annotation

        new MyStudent("KSR","UKG");//@JVMOverloads - default params
        new MyStudent("KSR","UKG","NJS");//@JVMOverloads - default params

        MyEmp obj = new MyEmp(10,20);
        int a = obj.a; //@JVMField
        int b = obj.getB();

        new MyStd1().getMyA();//Change setter getter name
        new MyStd1().getB();

    }
}
