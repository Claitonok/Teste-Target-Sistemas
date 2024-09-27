import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
        /*Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
        Imprimir(SOMA);
        Ao final do processamento, qual será o valor da variável SOMA?
        */
    int indice = 13, soma = 0, k = 0;
    
    if(k < indice){
        k = k + 1;
        soma = soma + k;
	System.out.println("Valor da soma: " + soma);
    }
    
  //2)Dado a sequência de Fibonacci,
  //onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
  //(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
  //informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o 
  //número informado pertence ou não a sequência.

  //IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência 
  //ou pode ser previamente definido no código;
  
  //Valor Fibonacci
    int valor = 5;
    
    int n = 10;
    //Valores que percore o Fibonacci
    int i = 1;
    int j = 0;
    int t;
    
    for(int G = 0; G <= n; G++){
        t = i + j;
        i = j;
        j = t;
    }
    
    if(j != valor){
        
    System.out.println("\nFibonacci encontrado:");
    }
  
     
  //3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
  //O menor valor de faturamento ocorrido em um dia do mês;
  // O maior valor de faturamento ocorrido em um dia do mês;
  //Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

//IMPORTANTE:
//a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//b) Podem existir dias sem faturamento, como nos finais de semana e feriados. 
//Estes dias devem ser ignorados no cálculo da média;
     Scanner leitor = new Scanner(System.in);
    
    System.out.println("O menor valor de faturamento ocorrido em um dia do mês: ");
    float MenorValor = leitor.nextFloat();
    
    System.out.println("Quantos dias do mês que teve faturamento: ");
    float DiasDoMes = leitor.nextFloat();
    
    
    System.out.println("O maior valor de faturamento ocorrido em um dia do mês: ");
    float MaiorValor = leitor.nextFloat();
    
    System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: ");
    float NumeroDeDiasNoMes = leitor.nextFloat();
    
    float vetor[] = {MenorValor}; 
    float TotalValores = vetor[0] + MaiorValor * DiasDoMes / 2;
    
    System.out.println("\nMedia faturamento mensal: " + TotalValores);
    System.out.println("\n Menor valor de faturamento ocorrido em um dia do mês: " + MenorValor);
    System.out.println("\n O maior valor de faturamento ocorrido em um dia do mês: " + MaiorValor);
    System.out.println("\n Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + NumeroDeDiasNoMes);
    
    
    
    
    
  //4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
     /*SP – R$67.836,43
     RJ – R$36.678,66
     MG – R$29.229,88
     ES – R$27.165,48
     Outros – R$19.849,53
     
     Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada
     estado teve dentro do valor total mensal da distribuidora.
     */
     
      double sp = 67.83643;
    double rj = 36.67866;
    double mg = 29.22988;
    double es = 27.16548;
    double out = 19.84953;
    
   
   double total = sp + rj + mg + es + out;

   // System.out.println(sp);
    
   double psp = ((sp/total)*100);
   double prj = ((rj/total)*100);
   double pmg = ((mg/total)*100);
   double pes = ((es/total)*100);
   double pout = ((out/total)*100);

    System.out.print("Porcentagem de SP : "  + psp);
    System.out.print("\nPorcentagem de RJ : " + prj);
    System.out.print("\nPorcentagem de MG : " + pmg);
    System.out.print("\nPorcentagem de ES : " + pes);
    System.out.print("\nPorcentagem de OUT : " + pout + "\n");

     
  //5) Escreva um programa que inverta os caracteres de um string:
    //IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;

String frase = "::::JAVA É BOM DEMAIS:::::";
System.out.println("\nFrase usada: " + frase);
System.out.print("\nString modificada: " + frase.toCharArray());

	}

}
