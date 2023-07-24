package a0714;

public class Person5 {
    public Member1 getMember2 (Creatable1 creatable) {
        String id = "winter";
        Member1 member1 = creatable.create(id);
        return member1;
    }

    public Member1 getMember3(Creatable2 creatable) {

        String id = "winter";
        String name = "한겨울";
        Member1 member1 = creatable.create(id, name);
        return member1;
    }
}
