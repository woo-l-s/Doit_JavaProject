/*
OOP에서 인스턴스를 단 하나만 생성하는 디자인 패턴
예시 ) 회사에 대한 프로젝트를 만들 떄, 직원은 여러명(여러개의 인스턴스)이지만, 회사는 단 하나이기 떄문에(한 개의 인스턴스)이다

*** 싱글톤 패턴의 단계 ***
1. 생성자를 private로 만들기

2. 클래스 내부의 static으로 유일한 인스턴스 생성하기

3. 외부에서 참조할 수 있는 public 메서드 만들기

4. 실제로 사용하는 코드 만들기


 */


public class singleton_pattern {
    private static singleton_pattern instance = new singleton_pattern();
    private singleton_pattern(){}
    //인스턴스를 외부에서 참조할 수 있도록 public get()메소드 구현
    public static singleton_pattern getInstance(){
        if(instance == null){
            instance = new singleton_pattern();
        }
        //유일하게 생성된 인스턴스를 반환
        return instance;
    }
}
