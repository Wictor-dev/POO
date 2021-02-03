
public class TestaAnimal {
	public static void main(String[] args) {
		// o problema é que não existe producaoLeite na classe Animal
		Animal a = new Bovino();
		((Bovino) a).setProducaoLeite(5);
		System.out.println(((Bovino) a).getProducaoLeite());
		
		//Peixe p = new Animal();
		//não é possível
		
		Animal[] animais = new Animal[7]; 
		animais[0] = new Animal();
		animais[1] = new Animal();
		animais[2] = new Bovino();
		animais[3] = new Bovino();
		animais[4] = new Bovino();
		animais[5] = new Peixe();
		animais[6] = new Peixe();
		
		for (int i = 0; i < animais.length;i++) {
			if (animais[i] instanceof Animal) {
				System.out.println("Animal");
			} 
			if (animais[i] instanceof Bovino) {
				System.out.println("Bovino");
			} 
			if (animais[i] instanceof Peixe) {
				System.out.println("Peixe");
			}
			
			System.out.println("---------");
			
		}
		
	}
}