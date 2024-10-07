public class Operadores {
    public static void main(String[] args){
        // x repeticao
        int numero = 5;
        //numero = numero + 1;
        numero++;
        //numero = numero - 1;
        numero--;
        int a, b;

        a = 5;
        b = 6;
        String resultado ="";
        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }




}