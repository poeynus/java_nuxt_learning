# java_nuxt_learning
회사에서 살아남기

회사에서 주는 공부를 수월하게 진행 하기 위한 공간

java, spring security, nuxt, vue를 위주로 진행한다.

지금 죽을 거 가타요 ㅠㅠ 자바를 미리 할 걸 왜 안했을까

22.07.18

간단하게 오늘은 환경 설정만 하기

22.07.20

요즘 회사에서 내준 공부가 좀 빡셉니다.. 허허허
오늘은 sql을 보충 해야 해서 좀만 더 있다 봅시다.

22.07.25

nuxt 프레임 워크의 vue와 스프링 부트를 사용하는데 스프링 부트는 이제 감을 좀 잡았고, vue도 괜찮은데
컴포넌트 분리하는게 좀 어렵다. 잘 될거야 할 수있다.

22.07.26

nuxt 컴포넌트 분리를 성공적으로 마무리했다. 겪었던 오류를 적고자 한다.
1. 원시 값이 아닌 객체는 항상 얕은 복사가 되니 깊은 복사를 하자. => 이거 진짜 주의
2. 중복 값을 비교할때는 데이터를 넣고 중복을 제거하기 말고 넣기 전에 확인하고 넣지 않던가 넣던가 하자 => 1시간 삽질했는데 바로 해결하시더라 ;;;
역시 짬에서 나오는 연륜은 무시하지 못하는 것이구나 빨리 배워서 흡수해야겠다.

22.07.27

jenkins를 이용해서 배포를 하는데 잘 되던 것이 배포만 하면 에러가 났다.
확인해보니 svg 아이콘의 경로가 틀렸던건데 왜 로컬에서는 잘 되었을까?
데이터 베이스 덤프를 처음 해보았는데 3트나 했다. 어떤 것을 원하는지 잘 몰랐는데 이제는 잘 할 수 있다.

22.08.01

벨로그 시작했다. 이제 README에 안적고 벨로그에 적으려고...
github는 진짜 개발 공간으로만 간다.
알고리즘 공부도 매일 할 수 있을 체력이 곧 오겠지 운동 열심히 하자.
[오늘 한 거 주소](https://velog.io/@poeynus/Spring-Security-Step-1)

22.08.02

[오늘 한 거 주소](https://velog.io/@poeynus/Spring-Security-Step-2)

22.08.03

까먹고 커밋을 안했네
[오늘 한 거 주소](https://velog.io/@poeynus/Spring-Security-Step-3)

22.08.08

[오늘 한 거 주소](https://velog.io/@poeynus/Spring-Security-Step-4)

22.08.09

[오늘 한 거 주소](https://velog.io/@poeynus/Spring-Security-Step-5)

22.08.11

오늘 너무 피곤해서 조금밖에 못했다.
일단 간단하게만 여기 적고 정리는 내일 집 내려가서 블로그에써야겠다.

Config 에서 DataSource를 매개변수로 쓸 때 Intellij에서 Could not autowire. No beans of 'DataSource' type found. 에러가 발생한다.
이것은 Intellij의 버그로 가끔 인식을 못하는 것이다. 실행 해보면 잘만 된다.

강의에서는 Aws를 사용해 mysql을 구성 했는데 나는 Docker에 Mysql 올려서 사용 했다.

JPA를 적용했고, entity와 interface를 만들었다.

(진짜 별로 못했네. 내일 집 내려가서 벨로그도 갈고 좀 많이 해야겠다. 원래 오늘 spark 강의도 보려 했는데 내일 회사 가서 봐야겠다.)

22.08.22

히히 오랜만이다. 인수인계 받고 좀 쉬다 왔어
오늘 한 것은 약간 간단해서 블로그에 적기가 좀 그렇네

22.08.23

인코딩, 암호화, 해싱 각각의 차이는?
password encoder
스프링 시큐리티에서 제공하는 패스워드 인코더들의 종류

오늘은 이론 위주의 설명이었네