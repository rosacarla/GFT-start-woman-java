package dio.com.debugging;

/*
Foram criados metodos main, a, b, c. Os tres ultimos omitem
por default o modificador de acesso "public".
 */

public class Main { //iniciada a classe principal do programa
    public static void main(String[] args) { //programa Java comeca e termina pelo metodo main
        System.out.println("Iniciou do programa no metodo main."); //imprime msg de inicio do main
        a();  //chamada do metodo a()
        System.out.println("Finalizou o programa no metodo main.");
    }

    static void a() {
        System.out.println("Entrou no metodo a."); //apos chamada no main, imprime msg de inicio do metodo a()
        b();  //chamada do metodo b()
        System.out.println("Finalizou o metodo a.");
    }

    static void b() {
        System.out.println("Entrou no metodo b."); //apos chamada no a(), imprime msg de inicio do metodo b()
        for(int i = 0; i <= 4; i++) 
        	System.out.println(i);  //imprime a variavel i,seus valores de 0 a 3
        c(); //chamada do metodo b()
        System.out.println("Finalizou o metodo b.");
    }

    static void c(){
        System.out.println("Entrou no metodo c."); //apos chamada no b(), imprime msg de inicio do metodo c()
        //Thread.dumpStack();  //metodo mostra a pilha de execucao para depuracao do codigo
        //imprime a stack trace (rastreio) da pilha de execucao do metodo c()
        System.out.println("Finalizou o metodo c.");  //imprime msg de finalizacao do metodo c() e dos anteriores
    }
/* Saída do Thread.dumpStack();

Iniciou o programa no metodo main.
Entrou no metodo a.
Entrou no metodo b.
0
1
2
3
4
Entrou no metodo c.
Finalizou o metodo c.
Finalizou o metodo b.
Finalizou o metodo a.
Finalizou o programa no metodo main.
java.lang.Exception: Stack trace  //leitura de baixo pra cima, de Main.main ate Main.c//
	at java.base/java.lang.Thread.dumpStack(Thread.java:1383)
	at dio.com.debugging.Main.c(Main.java:30)
	at dio.com.debugging.Main.b(Main.java:24)
	at dio.com.debugging.Main.a(Main.java:17)
	at dio.com.debugging.Main.main(Main.java:11)

Process finished with exit code 0
*/
}