package LinkedLists;

public class Exe {

	public static void main(String[] args) {
		ListaLigada ll = new ListaLigada();
		ll.iniciarLista();
		System.out.println(ll);
//		ll.inserirMeio("teste", 1);
//		System.out.println(ll);
//		ll.inserirMeio("teste2", "teste");
//		System.out.println(ll);
//		ll.inserirFim("testeFim");
//		System.out.println(ll);
//		ll.remover(2);
//		System.out.println(ll);
//		No no = new No("temNo");
//		No no2 = ll.busca("Lucas Bastos");
//		System.out.println(ll.temNo(no2));
//		ll.inserirMeio("teste", 4);
//		System.out.println(ll);
//		ll.remover("teste");
//		System.out.println(ll);
		
//		Q1.a
		ll.inserirInicio("Hamilton Sobrinho");
		System.out.println(ll);
//		Q1.b
		ll.inserirFim("Iago Novais");
		ll.inserirFim("Gabriela Castro");
		ll.inserirFim("Pedro Macedo");
		System.out.println(ll);
//		Q1.c
		System.out.println(ll.getTamanho());
		System.out.println("\n\n");
//		Q1.d
		ll.remover(5);
		System.out.println(ll);
//		Q1.e
		try {
			ll.busca("Lucas Bastos");
			System.out.println("Nome na lista!");
			
		} catch (InfoNotFoundExeption e) {
			System.out.println("Nome não encontrado na lista");
		}
		

	}

}
