package a0714;

public class Member1 {
    private String id;
    private String name;

    public Member1(String id) {
        this.id = id;
        System.out.println("Member(String id )");
    }

    public Member1(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name )");
    }


    //디버깅에서 유용하게 사용
    @Override
    public String toString() {
        String info = "{id :  " + id  + ", name : " + name + "}";
        return info;
    }
}
