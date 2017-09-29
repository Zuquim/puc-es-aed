

class Pilha {
    NoPilha topo = new NoPilha();
    public static boolean concatena(Pilha A, Pilha B, Pilha C) {
	boolean sucesso = alse;
	if(!A.estaVazia() && !B.estaVazia()) {
	    NoPilha no;
	    while(!A.estaVazia()) {
		no = A.desempilha();
		C.empilha(no);
	    }
	    while(!B.estaVazia()) {
		no = B.desempilha();
		C.empilha(no);
	    }
	    sucesso = true;
	}
    }
}
