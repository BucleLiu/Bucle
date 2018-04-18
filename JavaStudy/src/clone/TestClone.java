package clone;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo original = new CloneDemo("原始人",24);
        CloneDemo cloneOB = (CloneDemo) original.clone();
        cloneOB.setName("克隆人");
        System.out.println(original);
        System.out.println(cloneOB);
    }
}

class CloneDemo implements Cloneable{
    String name;
    int age;
    public CloneDemo(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name+","+this.age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
