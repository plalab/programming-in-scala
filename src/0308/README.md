# 2016.03.08

## 참여인원
하성일, 임형태, 신원, 김성우

## 참여일정
* 장소 : SK PLANET 804호 회의실
* 일시 : 19:00 ~ 21:00

## 트레이트

코드 재사용의 근간을 이루는 단위 > 행위에 대한 코드 재사용 방식 중 하나

### 트레이트의 동작 원리

trait 키워드를 제외하고는 클래스 정의와 같음

트레이트를 사용할 때 상속보다는 -믹스인-을 사용하려고 하며 이는 다중 상속과 매우 중요한 차이가 있음

트레이트 간 믹스인 할 때는 extends 키워드를 사용

트레이트를 어떤 슈퍼클래스를 명시적으로 상속한 클래스에 혼합할 수도 있다.

```scala

class Animal

class Frog extneds Animal with Philogophical {
	ovrrid def toString = "green"
}

```

#### 트레이트 예외 
- 트레이트는 '클래스' 파라미터를 가질 수 없음
- super의 호출을 동적 바인딩 함(자바는 정적 바인딩)

### 간결한 인터페이스와 풍부한 인터페이스
간결한 인터페이스(thin interface)를 풍부한 인터페이스(rich interface)로 만들 때 사용 가능

### Ordered 트레이트

대소 연산자(<, >, <=, >=)에 대한 트레이트

```scala
trait Ordered[X] {
	abstract def compare(that: X) = {}
}
```

Ordered를 믹스인 한 이후 compare를 정의하면 대소 연산자를 모두 재사용 가능

### 트레이트를 이용해 변경 쌓아올리기
super 이용하여 믹스인 된 트레이트를 '연속적으로' 호출

### 왜 다중 상속은 안되는가?
super의 대상에 대한 복잡성이 높아짐 > 스칼라는 선형화(linerization)를 통해 해결

### 트레이트냐 아니냐, 이것이 문제로다

트레이트 vs 추상 클래스
- 어떤 행위를 자새용 할 때
- 서로 관련이 없는 클래스에서 어떤 행위를 여러 번 재사용해야 할 때
- 판단이 안 설때 

## 패키지와 임포트

### 패키지 안에 코드 작성하기

package 절 다음에 중괄호 작성 가능 > 패키징(packaging)

### 관련 코드에 간결하게 접근하기

- 클래스가 속한 패키지는 접두사가 없이도 해당 클래스에 접근 가능
- 어떤 패키지를 포함하는 부모 패키지는 그 자식 패키지에 어떤 접두어도 붙이지 않고 접근 가능
- 중괄호 패키징 문법 사용 시, 패키징 스코프 밖에서 접근 가능한 모든 이름을 그 패키징 안에서도 쓸 수 있음

```scala
package bobsrockets {
	clss Ship
}

package bobsrockets.sleets {
	class Fleet {
		// 컴파일 불가
		def addShip() { new Ship }
	}
}
```

'_root_' > 모든 최상위 패키지


### 임포트

```scala
import bobsdelights.Fruit

import bobsdelight._

import bobsdelights.Fruits._

```

스칼라 임포트는 코드 어디에라도 들어갈 수 있음

#### 임포트 셀럭터
임포트 멤버를 감추거나 이름을 바꿀 수 있는 기능 : '<원래 이름> => <새 이름>'

```scala
import Fruits.{Apple, Orange} // Apple, Orange 만 참조

import Fruits.{Apple -> McIntosh, Orange} // McIntosh, Orange 만 참조

import java.sql.{Date => SDate} // SDate 로 참조

import java.{sql => S} // S 로 참조

import Furits.{Apple => McIntosh, _} // McIntosh 와 모든 멤버

import Fruits. {Pear => _, _} // Pear 를 제외한 모든 멤버

```

'<어떤 이름> => _' : '<어떤 이름>'만 제외하는 효과


### 암시적 임포트

스칼라에 항상 추가되는 임포트

```scala
import java.lang._
import scala._
import Predef._
```

### 접근 수식자

#### 비공개 멤버
private 키워드를 사용, 정의를 포함한 클래스나 객체 내부에서만 접근

#### 보호 멤버
protected 키워드를 사용, 서브 클래스에서만 접근 가능

#### 공개 멤버
private, protected가 없는 모든 경우

#### 보호 스코프

private[X], protected[X]와 같이 지정자(qualifier)로 확장
* X 는 패키지, 클래스, 싱글톤 객체

#### 가시성과 동반 객체
동박 객체도 접근 지정자를 동일하게 정의 가능

_정적 보호(protected static) 멤버는 스칼라에서는 허용이 안됨 > 싱글톤 객체의 서브 클래스를 만들수가 없음_


### 패키지 객체

``` scala
package obejct bobsdelights {
	def showFruit(fruit: Fruit) {
		import fruit._
		println(name +"s are " + color)
	}
}
```

