package day13;

public class Person {
    private String name;
    private  int age;
    private  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws Exception{
        if (sex.equals("男")|| sex.equals("女")){
        this.sex = sex;
        }else {
            //抛出异常
            throw new Exception("性别只能为男女");
        }
    }
    //输出个人信息
    public void print(){
        System.out.println(this.getName()+" "+this.getAge()+" "+this.getSex()+" ");
    }

    public static void main(String[] args) {
        Person p=new Person();
        try {
            p.setSex("boy");
            p.print();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
