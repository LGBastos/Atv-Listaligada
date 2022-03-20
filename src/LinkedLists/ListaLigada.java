package LinkedLists;

public class ListaLigada {
	private No inicio;
	private int tamanho = 0;

	public No busca(int pos) {
		if (pos == tamanho) {
			throw new IndexOutOfBoundsException("A posição requisitada (" + pos + ") encontra-se fora da lista!");
		}
		No no = inicio;
		for (int i = 0; i < pos; i++) {
			no = no.getProximo();
		}
		return no;
	}
//	Busca e retorna o primeiro nó com a informação passada
//  Lança InfoNotFoundExeption, caso não exista um nó com dada informação
	public No busca(String info) throws InfoNotFoundExeption{
		No no = inicio;
		while (no != null && !no.getInfo().equals(info)) {
			no = no.getProximo();
		}
		if (no == null) {
			throw new InfoNotFoundExeption("Essa informação não existe nessa lista!");
		}
		return no;
	}

	public void inserirInicio(String info) {
		No no = new No(info);
		no.setProximo(inicio);
		inicio = no;
		tamanho++;
	}

	public void inserirMeio(String info, int pos) {
		No no = new No(info);
		No noAnterior = busca(pos - 1);
		No noProximo = busca(pos);
		noAnterior.setProximo(no);
		no.setProximo(noProximo);
		tamanho++;
	}

	public void inserirMeio (String novaInfo, String buscarInfo) throws InfoNotFoundExeption {
		No no = new No(novaInfo);
		No noAnterior = busca(buscarInfo);
		No noProximo = noAnterior.getProximo();
		noAnterior.setProximo(no);
		no.setProximo(noProximo);
		tamanho++;
	}

	public void inserirFim(String info) {
		No no = new No(info);
		No noFinal = busca(tamanho - 1);
		noFinal.setProximo(no);
		tamanho++;
	}

	public No remover(int pos) {
		No noRemovido;
		if (pos == 0) {
			noRemovido = inicio;

			inicio = inicio.getProximo();

		} else {
			noRemovido = busca(pos);
			No noAnterior = busca(pos - 1);
			noAnterior.setProximo(noRemovido.getProximo());
		}
		tamanho--;

		return noRemovido;
	}
//	Remove o primeiro nó cuja informação seja igual à passada
	public No remover(String info) throws InfoNotFoundExeption{
		No noRemovido = busca(info);
		int indexNoRemovido = temNo(noRemovido);
		if (indexNoRemovido == 0) {

			inicio = inicio.getProximo();

		} else {
			No noAnterior = busca(indexNoRemovido - 1);
			noAnterior.setProximo(noRemovido.getProximo());
		}
		tamanho--;

		return noRemovido;
	}
	public No removerInicio() {
		No noRemovido = inicio;
		inicio = inicio.getProximo();
		tamanho--;
		return noRemovido;
	}
//	Remove o ultimo nó, via método remover(pos) onde pos é iguam à ultima posição(tamanho-1)
//	Por usar outro metodo de remoção, não é necessário o comando tamanho--
	public No removerFim() {
		No noRemovido = remover(this.tamanho-1);
		return noRemovido;
	}
//  Recebe um nó e retorna a posição em que ele se encontra na lista ligada
//	Retorna -1 caso não exista o nó
	public int temNo(No no) {
		No noLocal = inicio;
		int count = 0;
		while (noLocal != null && !noLocal.equals(no)) {
			noLocal = noLocal.getProximo();
			count++;
		}
		if (noLocal == null) {
			return -1;
		}
		return count;
	}

	public String toString() {
		String str = "(" + tamanho + ")\n";
		No local = inicio;
		while (local != null) {
			str += local.getInfo() + "\n";
			local = local.getProximo();
		}
		return str;
	}

	public No getInicio() {
		return inicio;
	}
	public int getTamanho() {
		return this.tamanho;
	}

	public void iniciarLista() {
		this.inserirInicio("Lucas Bastos");
		this.inserirInicio("Guilerme Duque");
		this.inserirInicio("Lucas Moreno");
		this.inserirInicio("Eduardo Donadon");
	}
}
