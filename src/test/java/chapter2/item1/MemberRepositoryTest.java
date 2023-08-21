package chapter2.item1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {

    @Test
    @DisplayName("반환 타입의 하위 타입 객체를 반환")
    void addMemberTest() {
        //given
        MemberRepository memberRepository = new MemberRepository();

        //when
        memberRepository.addNewMember("김팀원", "aaaa@gmail.com", TeamAuthority.MEMBER);
        memberRepository.addNewMember("박팀원", "bbbb@gmail.com", TeamAuthority.MEMBER);
        memberRepository.addNewMember("최팀원", "cccc@gmail.com", TeamAuthority.MEMBER);
        memberRepository.addNewMember("이팀장", "dddd@gmail.com", TeamAuthority.LEADER);
        memberRepository.addNewMember("강팀원", "eeee@gmail.com", TeamAuthority.LEADER);

        //then
        for (Member member : MemberRepository.memberList) {
            Assertions.assertInstanceOf(Member.class, member);
        }
    }

}