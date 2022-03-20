package LinkedLists;

public class No {
	private String info;
	private No proximo = null;
	
	public No(String info) {
		this.setInfo(info);
	}
	public No getProximo() {
		return this.proximo;
	}
	public void setProximo(No no) {
		this.proximo = no;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
