package chapter2.item1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class MemberRepository {

    static HashSet<Integer> memberIdPool = new HashSet<>();
    static List<Member> memberList = new ArrayList<>();

    public void addNewMember(String name, String email, TeamAuthority teamAuthority) {
        memberList.add(Member.of(createId(), name, email, teamAuthority));
    }

    private static Integer createId() {
        Random random = new Random();
        int createdId = random.nextInt(10000);
        while (memberIdPool.contains(createdId)) {
            createdId = random.nextInt(10000);
        }
        memberIdPool.add(createdId);
        return createdId;
    }
}
