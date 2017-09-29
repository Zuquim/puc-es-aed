

public boolean enfileiraCabeca(Item no) {
    NoDeque noD = new NoDeque(no);
    boolean sucesso = false;
    if(this.getCabeca() > 0) {
	sucesso = true;
	this.setCabeca(this.getCabeca() - 1);
	deque[cabeca] = noD;
    }
    return sucesso;
}

public boolean desenfileiraCabeca() {
    boolean sucesso = false;
    if(this.dequeVazio()) {
	sucesso = true;
	cabeca++;
    }
    return sucesso;
}


public boolean enfileiraCauda(Item no) {
    NoDeque noD = new NoDeque(no);
    boolean sucesso = false;
    if(cauda < Deque.length - 1) {
	sucesso = true;
	cauda++;
	deque[cauda] = noD;
    }
    return sucesso;
}

public boolean desenfileiraCauda() {
    boolean sucesso = false;
    if(this.dequeVazio()) {
	sucesso = true;
	cauda++;
    }
    return sucesso;
}


 
