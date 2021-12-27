package hello.core.member;

public class MemberServiceImpl implements MemberService {

		private final MemberRepository memberRerRepository = new MemoryMemberRepository();

		@Override
		public void join(Member member) {
			memberRerRepository.save(member);
		}

		@Override
		public Member findMember(Long memberId) {
			return memberRerRepository.findById(memberId);
		}
		
		
}
