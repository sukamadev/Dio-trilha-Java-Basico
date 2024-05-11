
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo  {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }

    }
    static  void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println(candidato + " atendeu na " + tentativasRealizadas + "ª tentativa.");
        else
            System.out.println("NÃO CONSEGUIMOS ENTRAR EM CONTATO COM " + candidato + " APÓS O NÚMERO MÁXIMO DE TENTATIVAS.");
    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static  void imprimindoSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos por indice.");
        for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println((indice+1) + "º candidato é " + candidatos[indice]);
        }
        System.out.println("Sem índice");
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", " Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println(candidato + " solicitou " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println(candidato + " foi selecionado!");
            }else{
                System.out.println(candidato + " NÃO FOI selecionado.");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisandoCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) 
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
        
    }
    
}
