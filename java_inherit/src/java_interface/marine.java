package java_interface;

public class marine implements unit{

	private int hp;
	private int atk;
	private String damageType;
	
	public marine() {
		this.hp=40;
		this.atk=6;
		this.damageType="�Ϲ�";
	}
	
	@Override
	public void attack() {
		System.out.println("���� ����");
	}
	@Override
	public void move() {
		System.out.println("���� �̵�");
	}
	@Override
	public void dead() {
		System.out.println("���� ���...");
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
