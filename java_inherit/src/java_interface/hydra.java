package java_interface;

public class hydra implements unit{

	private int hp;
	private int atk;
	private String damageType;
	
	public hydra() {
		this.hp=80;
		this.atk=10;
		this.damageType="����";
	}

	public void attack() {
		System.out.println("����� ����");
	}
	public void move() {
		System.out.println("����� �̵�");
	}
	public void dead() {
		System.out.println("����� ���...");
	}
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getDamageType() {
		return damageType;
	}

	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}
}
