package school.sptech;

public class Time {
    String nome;
    int vitorias,empates,derrotas;
    Integer pontos;
    Integer totalPartidas;
    Integer aproveitamento;
    public Time(){}

    public Time(int vitorias, int empates, int derrotas, String nome){
            this.vitorias = 0;
            this.empates = 0;
            this.derrotas = 0;
            this.nome = nome;


    }


    public void registrarVitoria(){
        this.vitorias++;
    }
   public void registrarEmpate(){
        this.empates++;
   }

   public void registrarDerrota(){
        this.derrotas++;
   }

   public Integer getPontos(){
        return pontos = (vitorias * 3) + empates;
   }

   public Integer getTotalPartidas(){
        return totalPartidas = vitorias + empates + derrotas;
   }

   public Integer getAproveitamento(){
        int totalPartidas = getTotalPartidas();

        return aproveitamento = (int) (((double) vitorias / totalPartidas) * 100);
   }
    public void compararAproveitamento(Time adversario){
           Integer aproveitamento = getAproveitamento();
           Integer aproveitamentoTimeAdversario = adversario.getAproveitamento();

           String timeMaiorAproveitamento = ( aproveitamento >aproveitamentoTimeAdversario ? this.nome :
                   adversario.nome );
           String timeMenorAproveitamento =
                   (aproveitamento > aproveitamentoTimeAdversario ?adversario.nome : this.nome);
    }

   public void exibirInformacoes(){

       System.out.println("NOME: "+ this.nome + "Número Vitórias: " + this.vitorias + "Empates: " + this.empates +
               "Derrotas: " + this.derrotas + "Total de Pontos: "+this.pontos + "Total Partidas: "+this.totalPartidas + "Aproveitamento: " + this.aproveitamento);
    }

}
