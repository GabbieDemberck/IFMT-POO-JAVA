package game_play;
import java.util.*;
public class StartPlay {

	public static void main(String[] args) {
		boolean exit = false;
		Scanner teclado = new Scanner(System.in);
		
        System.out.println("Nick: ");
        String nick= teclado.nextLine();
        System.out.println("XP: ");
        int xp= teclado.nextInt();
        System.out.println("Level: ");
        int level= teclado.nextInt();
        System.out.println("hp: ");
        int hp= teclado.nextInt();
      
		Player player = new Player(nick,xp,level,hp);
		
		while (!exit)   {
	        System.out.println("Lutar com Boss (1) | Farmar (2) | Sair do jogo (3)");
	        int opcao = teclado.nextInt();
	        

	        
	        if (opcao == 1) {
	        	
	            System.out.println(" Digite: 0 - Pedra | 1 - Tesoura | 2 - Papel ");
	            int escolha= teclado.nextInt();
	            
	        	 int resultado = player.BossFight(escolha);
	        	 
	        	if (resultado == 0) {
	        		System.out.println("Você ganhou 500 de Xp");
                   player.setXp(player.getXp()+500);
	        	} else {
	        		System.out.println("Você perdeu 200 de Hp");
	               player.setHp(player.getHp()-200);
	        	}
	        	
	        } if (opcao == 2) {
	        	
	        	player.Farm(player.getXp(),player.getHp(),player.getLevel());
	            System.out.println(" Xp: "+player.getXp()+" Hp: "+player.getHp()+" Level: "+player.getLevel());
	            
	        } if (opcao == 3) {
	        	exit = true;
	        }
	        
	        exit = (player.getHp() <= 0);
	        
	        if (exit == true) {
	        	System.out.println("O jogo acabou!");
	        	System.out.println(" Xp: "+player.getXp()+" Hp: "+player.getHp()+" Level: "+player.getLevel());
	        }
		}

		teclado.close();
	}
 

}

