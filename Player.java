package game_play;import java.util.Random;

public class Player {
	private int level;
	private int xp;
	private String nick;
	private int hp;
	
	Player(String nick, int xp, int level, int hp){
		this.nick = nick;
		this.xp = xp;
		this.level = level;
		this.hp = hp;
	}
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int BossFight(int escolha) {   
		
		String pedraTesouraPapel [];
		pedraTesouraPapel = new String [3];
		
		Random gerador = new Random();
		
		pedraTesouraPapel [0] = "Pedra";
		pedraTesouraPapel [1] = "Tesoura";
		pedraTesouraPapel [2] = "Papel";
		
		boolean venceu = false;
		int resultado;
		int escolhaBoss = (gerador.nextInt(3));
        
		if(escolhaBoss == escolha) {
			System.out.println("Empate!");
			venceu = false;
		} else if (escolhaBoss == 0 && escolha == 1){
			System.out.println("Derrota!");
			venceu = false;
		} else if (escolhaBoss == 0 && escolha == 2) {
			System.out.println("Vitória!");
			venceu = true;
		} else if (escolhaBoss == 1 && escolha == 0) {
			System.out.println("Vitória!");
			venceu = true;
		}else if (escolhaBoss == 1 && escolha == 2) {
			System.out.println("Derrota!");
			venceu = false;
		}else if (escolhaBoss == 2 && escolha == 0) {
			System.out.println("Derrota!");
			venceu = false;
		}else if (escolhaBoss == 2 && escolha == 1) {
			System.out.println("Vitória!");
			venceu = true;
		}
		
		if (venceu) {
			resultado = 0;
		}else {
			resultado = 1;
		}
		return resultado;
	 } 
	
	public int Farm(int xp , int hp , int level) {     
		this.xp = xp + 10;
		this.hp = hp + 100;
		this.level = level + 1;
		return (this.xp);
		
	 }  
}