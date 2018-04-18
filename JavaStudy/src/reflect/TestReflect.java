package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args){
        ReflectDemo demo = new ReflectDemo("Nomal");
        try {
            //反射方式获取类
            Class<?> cls = Class.forName("reflect.ReflectDemo");
            //反射方式,对象没有无參构造函数时会抛异常
            //Object obk = cls.getConstructor();
            //反射方式获取构造函数
            Constructor<?> con = cls.getConstructor(String.class);
            Object obj = con.newInstance("ReflectDemo");
            //反射方式初始化方法
            Method set = cls.getMethod("setName", String.class);
            Method get = cls.getMethod("getName");
            //方法调用
            set.invoke(obj,"haha");
            System.out.println(get.invoke(obj));
            //获取属性值
            Field f = cls.getDeclaredField("name");
            f.setAccessible(true);
            f.set(obj,"DeclaredField set");
            System.out.println(get.invoke(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
}

class ReflectDemo{
    String name;
    public ReflectDemo(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
