     /**
     * Classe de exemplo para o exercício da Aula 4.
     */

    public class ConversoesExercicios {

        public static void main(String[] args) {

            byte b1;
            short s1 = 1000;  /*short até 32767 */
            b1 = (byte) s1;   /*downcast ou reducao de s1 com perda de info*/
            /* downcast explito porque precisa inf tipo de dado da conversao... */

            long l1;
            int i1 = 10;   /*upcast é implicito, nao precisa decl tipo de dado, porque sobra espaço em memoria */
            l1 = i1;  /*upcast int pra long com sobra de espaço */

            int i2;    /*int vai ate 2.147.483.647 */
            long l2 = 1000000000000000000L;
            i2 = (int) l2;  /*downcast de long pra int com perda de info */

            int i3;
            long l3 = 10000L;
            i3 = (int) l3;  /*downcast de long pra int sem perda de info */

            double d1;
            float f1 = 10.5f;
            d1 = f1;   /*upcast de float pra double com sobra de espaço de apresentacao */

            float f2;
            float f3;
            double d2 = 10000.58d;
            f2 = (float) d2;  /*downcast de double pra float sem perda de casas decimais */
            double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
            f3 = (float) d3;  /*downcast de d3 pra f3 com perda de casas decimais excedentes no float */

            int i4;
            float f4 = 11.5697f;
            i4 = (int) f4;  /*downcast de float pra int com perda de casas decimais, valor é trucado */

            System.out.println("b1:" + b1);
            System.out.println("l1:" + l1);
            System.out.println("i2:" + i2);
            System.out.println("i3:" + i3);
            System.out.println("d1:" + d1);
            System.out.println("f2:" + f2);
            System.out.println("f3:" + f3);
            System.out.println("i4:" + i4);

            b1 = (byte) d3; /*downcast de double em byte com perda de dados*/

            System.out.println("b1:" + b1);

            /* calculo de expresao */
            int i;   /* resposta = 2 */
            i = 3;
            int z = 10 - 5 * 2 + --i;
            System.out.println("z = " + z);
        }
    }
