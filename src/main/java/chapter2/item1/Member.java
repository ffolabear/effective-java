package chapter2.item1;

public class Member {

    private final Integer id;
    private final String name;
    private final String email;
    private final TeamAuthority authority;

    public static Member of(int memberId, String name, String email, TeamAuthority teamAuthority) {
        if (teamAuthority.equals(TeamAuthority.LEADER)) {
            return new Leader(memberId, name, email, teamAuthority);
        }
        return new Member(memberId, name, email, teamAuthority);
    }

    Member(Integer id, String name, String email, TeamAuthority authority) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "\nMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", authority=" + authority +
                '}';
    }
}
