# 2016.02.16

## 참여인원
하성일, 임형태, 김성우, 신원

## 참여일정
* 장소 : SK PLANET 804호 회의실
* 일시 : 19:00 ~ 21:00

## 함수와 클로저

### 메소드
객체 멥버인 함수 = 메소드

### 지역 함수
도우미 함수: 네임스페이스 오염 방비, 클래스 유연성 추구
- private 사용
- 함수 안에 함수를 정의

### 1급 계층 함수
스칼라는 1급 계층 함수를 제공: 이름 없이 리터럴로 표기해 값처럼 주고 받을 수 있다.
- 선언과 할당이 가능
- 파라미터로 전달
- 함수의 반환값으로 전달 

### 간단한 형태의 함수 리터럴
타깃 타이핑에 근거한 코드 노이즈(반복, 중복) 제거

### 위치 표시자 문법
하나 이상의 파라미터에 대한 위치 표시자(_)로 대체할 수 있음

### 부분 적용한 함수
위치 표시자를 이용하여 함수의 전체 파라니터를 밑줄(_)로 대체

### 클로저
클로져(closure):주어진 함수 리터럴로부터 실행 시점에 만들어낸 객체인 함수 값
- 자유 번수(닫히 코드 조각 밖에 선언된 변수)를 포함한 함수

### 특별한 형태의 함수 호출
- 반복 파라미터
- 이름 붙인 인자
- 디폴트 인자 값

### 꼬리 재귀
마지막에 자신을 재귀 호출하는 경우의 함수

컴파일러에 의해 최적화가 일어남

#### 컴파일러가 최적화 하기 못하는 경우
- 함수를 분기하여 반복 처리한 경우
- 함수 값(val/var)을 호출하는 경우

## 흐름 제어 추상화

### 코드 중복 줄이기
고차함수(high-order function)을 이용하여 코드 중복 최소화

### 클라이언트 코드 단순하게 만들기
스칼라 표준 라이브러리의 루프 메소드를 이용하여 코드를 단순홯 ㅏㅁ
- List.exist()

### 커링
함수에 파라미터를 전달하는 방식을 고차함수를 이용하여 전달

### 새로운 제어 구조 작성
커링을 이용하여 제어 구조를 역전할 수 있도록 제공

### 이름에 의한 호출 파라미터
파라미터가 없는 함수 호출에 대한 ()를 생략

값 파라미터와 함수 파라미터를 전달하는데 있어 실행 시점의 차이 확인
