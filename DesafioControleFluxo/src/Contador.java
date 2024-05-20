
import java.util.concurrent.ThreadLocalRandom;

public class Contador {

    public static void main(String[] args ) {

        selecaoCandidatos();

    System.out.println("Processo Seletivo");

   }
 
 static void selecaoCandidatos () {   
        String [] candidatos = { "João", "Maria", "Paula", "Lucas", "Pedro", "Jéssica", "carlos", "Laura", "Enzo", "Miguel" };

        int  candidatoSelecionados = 0;
        int  candidatoAtual = 0;
        double salarioBase = 2000.0 ; 
        while  ( candidatoSelecionados < 5 ) {
           String candidato = candidatos [candidatoAtual];
        double salarioPretendido =  valorPretendido();


        
    System.out.println("O candidato "  + candidato +  " solicitou este valor de salario "  + salarioPretendido);
      if (salarioBase >= salarioPretendido) {  
        System.out.println("O candidato foi selecionado para a vaga ");

        candidatoSelecionados++;
      }
      candidatoAtual++;
    }
    }
 static  double valorPretendido (){ 
        return ThreadLocalRandom.current().nextDouble(1800.0, 2300.0);
     }
 
 static void analisarCandidato ( double salarioPretendido ) { 
    double salarioBase = 2000.0;

    if (salarioBase > salarioPretendido)
     System.out.println("Ligar para o candidato ");

   else if (salarioBase == salarioPretendido)
     System.out.println("Ligar para o candidato e fazer uma contra Proposta ");
    
   else {
    System.out.println("Aguardando os demais candidatos");
       }
      
}
}
