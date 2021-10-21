import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Set set = new Set();
		set.stdInfo();
	}
}

class Student {
	private int id, grade, phone, score;	// 학번, 학년, 전화번호, 학점
	private String name;	// 이름
	private String depart;	// 학과
	
	public Student(int argId, int argGrade, int argPhone, int score, String argName, String argDepart) {
		this.id = argId;
		this.grade = argGrade;
		this.phone = argPhone;
		this.score = score;
		this.name = argName;
		this.depart = argDepart;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public int getPhone() {
		return this.phone;
	}

	public int getScore() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDepart() {
		return this.depart;
	}	
}

class Professor {
	private String name;	// 교수 이름
	private String depart;	// 학과
	private int phone, id;	// 전화번호, 인사번호
	
	public Professor(int argId, String argName, String argDepart, int argPhone) {
		this.id = argId;
		this.name = argName;
		this.depart = argDepart;	
		this.phone = argPhone;
	}
	
	public int getPhone() {
		return this.phone;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDepart() {
		return this.depart;
	}
}

class Subject {
	private String name, pName;		// 과목 명, 교수 이름
	private int id, score;	// 과목 코드, 학점, 연번
	
	public Subject(int argId, int argScore, String argName, String argPName) {
		this.id = argId;
		this.score = argScore;
		this.name = argName;
		this.pName = argPName;
	}

	public int getId() {
		return this.id;
	}

	public int getScore() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}

	public String getPName() {
		return this.pName;
	}
}

class Set {
	private String name, depart, pName, choice, s_choice, p_choice, sub;
	private int id, grade, phone, score;
	Student[] std_array = new Student[10];	// 학생 정보 리스트
	Professor[] pro_array = new Professor[3];	// 교수 정보 리스트
	Subject[] sub_array = new Subject[5];		// 과목 정보 리스트	
	
	public void stdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력 (10명)");
		System.out.println("");
		
		for(int i = 1; i < 11; i++) {
			System.out.println(i + "번째 학생의 학번을 입력하세요 >>");
			id = sc.nextInt();
			
			System.out.println(i + "번째 학생의 학년을 입력하세요 >>");
			grade = sc.nextInt();

			System.out.println(i + "번째 학생의 전화번호를 입력하세요 >>");
			phone = sc.nextInt();
			
			System.out.println(i + "번째 학생의 이름을 입력하세요 >>");
			name = sc.next();
			
			System.out.println(i + "번째 학생의 학과를 입력하세요 >>");
			depart = sc.next();
			
			score = 0;
			std_array[i] = new Student(id, grade, phone, score, name, depart);
		}
		proInfo();
		subInfo();
		management();
		sc.close();
	}
	
	public void proInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("교수 정보 입력 (3명)");
		System.out.println("");
		
		for(int i = 1; i < 4; i++) {
			System.out.println(i + "번째 교수의 학번을 입력하세요 >>");
			id = sc.nextInt();
			
			System.out.println(i + "번째 교수의 이름을 입력하세요 >>");
			name = sc.next();
			
			System.out.println(i + "번째 교수의 학과를 입력하세요 >>");
			depart = sc.next();
			
			System.out.println(i + "번째 교수의 전화번호를 입력하세요 >>");
			phone = sc.nextInt();
			
			pro_array[i] = new Professor(id, name, depart, phone);
		}
		sc.close();
	}
	
	public void subInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 정보 입력 (5개)");
		System.out.println("");
		
		for(int i = 1; i < 6; i++) {
			System.out.println(i + "번째 과목의 과목 코드를 입력하세요 >>");
			id = sc.nextInt();
			
			System.out.println(i + "번째 과목의 학점을 입력하세요 >>");
			grade = sc.nextInt();
			
			System.out.println(i + "번째 과목의 이름을 입력하세요 >>");
			name = sc.next();
						
			System.out.println(i + "번째 과목의 교수를 입력하세요 >>");
			pName = sc.next();
			
			sub_array[i] = new Subject(id, grade, name, pName);
		}
		sc.close();
	}
	
	public void management() {
		Scanner sc = new Scanner(System.in);
		String[] sub = new String[3];
		
		while(true) {	
			System.out.println("모드를 선택하세요 (학생, 교수, 종료)");
			System.out.println("");		
			choice = sc.next();
			
			if(choice.equals("종료")) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(choice.equals("학생")) {
				System.out.println("학생 모드를 선택하셨습니다.");
				System.out.println("====== 메뉴 ======");
				System.out.println("신청, 확인 중 하나를 선택하세요.");
				s_choice = sc.next();
				
				if(s_choice.equals("신청")) {
					System.out.println("학번을 입력하세요");
					id = sc.nextInt();
					
					for(int i = 1; i < 4; i++) {
						System.out.println(i + "번째 신청할 과목을 입력하세요(3번 반복)");
						sub[i-1] = sc.next();
					}
				}
				else if(s_choice.equals("확인")) {
					System.out.println("학번을 입력하세요");
					id = sc.nextInt();
				
				}
			}
			if(choice.equals("교수")) {
				System.out.println("교수 모드를 선택하셨습니다.");
				System.out.println("인사 번호를 입력하세요");
				id = sc.nextInt();
				
				System.out.println("과목 코드를 입력하세요");
				id = sc.nextInt();
			}
		}
		
		sc.close();
	}
}




