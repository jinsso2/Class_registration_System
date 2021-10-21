import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Set set = new Set();
		set.stdInfo();
	}
}

class Student {
	private int id, grade, phone, score;	// �й�, �г�, ��ȭ��ȣ, ����
	private String name;	// �̸�
	private String depart;	// �а�
	
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
	private String name;	// ���� �̸�
	private String depart;	// �а�
	private int phone, id;	// ��ȭ��ȣ, �λ��ȣ
	
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
	private String name, pName;		// ���� ��, ���� �̸�
	private int id, score;	// ���� �ڵ�, ����, ����
	
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
	Student[] std_array = new Student[10];	// �л� ���� ����Ʈ
	Professor[] pro_array = new Professor[3];	// ���� ���� ����Ʈ
	Subject[] sub_array = new Subject[5];		// ���� ���� ����Ʈ	
	
	public void stdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� ���� �Է� (10��)");
		System.out.println("");
		
		for(int i = 1; i < 11; i++) {
			System.out.println(i + "��° �л��� �й��� �Է��ϼ��� >>");
			id = sc.nextInt();
			
			System.out.println(i + "��° �л��� �г��� �Է��ϼ��� >>");
			grade = sc.nextInt();

			System.out.println(i + "��° �л��� ��ȭ��ȣ�� �Է��ϼ��� >>");
			phone = sc.nextInt();
			
			System.out.println(i + "��° �л��� �̸��� �Է��ϼ��� >>");
			name = sc.next();
			
			System.out.println(i + "��° �л��� �а��� �Է��ϼ��� >>");
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
		System.out.println("���� ���� �Է� (3��)");
		System.out.println("");
		
		for(int i = 1; i < 4; i++) {
			System.out.println(i + "��° ������ �й��� �Է��ϼ��� >>");
			id = sc.nextInt();
			
			System.out.println(i + "��° ������ �̸��� �Է��ϼ��� >>");
			name = sc.next();
			
			System.out.println(i + "��° ������ �а��� �Է��ϼ��� >>");
			depart = sc.next();
			
			System.out.println(i + "��° ������ ��ȭ��ȣ�� �Է��ϼ��� >>");
			phone = sc.nextInt();
			
			pro_array[i] = new Professor(id, name, depart, phone);
		}
		sc.close();
	}
	
	public void subInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� (5��)");
		System.out.println("");
		
		for(int i = 1; i < 6; i++) {
			System.out.println(i + "��° ������ ���� �ڵ带 �Է��ϼ��� >>");
			id = sc.nextInt();
			
			System.out.println(i + "��° ������ ������ �Է��ϼ��� >>");
			grade = sc.nextInt();
			
			System.out.println(i + "��° ������ �̸��� �Է��ϼ��� >>");
			name = sc.next();
						
			System.out.println(i + "��° ������ ������ �Է��ϼ��� >>");
			pName = sc.next();
			
			sub_array[i] = new Subject(id, grade, name, pName);
		}
		sc.close();
	}
	
	public void management() {
		Scanner sc = new Scanner(System.in);
		String[] sub = new String[3];
		
		while(true) {	
			System.out.println("��带 �����ϼ��� (�л�, ����, ����)");
			System.out.println("");		
			choice = sc.next();
			
			if(choice.equals("����")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			if(choice.equals("�л�")) {
				System.out.println("�л� ��带 �����ϼ̽��ϴ�.");
				System.out.println("====== �޴� ======");
				System.out.println("��û, Ȯ�� �� �ϳ��� �����ϼ���.");
				s_choice = sc.next();
				
				if(s_choice.equals("��û")) {
					System.out.println("�й��� �Է��ϼ���");
					id = sc.nextInt();
					
					for(int i = 1; i < 4; i++) {
						System.out.println(i + "��° ��û�� ������ �Է��ϼ���(3�� �ݺ�)");
						sub[i-1] = sc.next();
					}
				}
				else if(s_choice.equals("Ȯ��")) {
					System.out.println("�й��� �Է��ϼ���");
					id = sc.nextInt();
				
				}
			}
			if(choice.equals("����")) {
				System.out.println("���� ��带 �����ϼ̽��ϴ�.");
				System.out.println("�λ� ��ȣ�� �Է��ϼ���");
				id = sc.nextInt();
				
				System.out.println("���� �ڵ带 �Է��ϼ���");
				id = sc.nextInt();
			}
		}
		
		sc.close();
	}
}




