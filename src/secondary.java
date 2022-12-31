import java.util.Calendar;

public class secondary {

    public Integer tamanhoVetor = 10;
    public String[] nomesNV = new String[tamanhoVetor];
    public String[] nomesFV = new String[tamanhoVetor];
    public String[] nomesPV = new String[tamanhoVetor];
    public Integer[] idadeNV = new Integer[tamanhoVetor];
    public Integer[] idadeFV = new Integer[tamanhoVetor];
    public Integer[] idadePV = new Integer[tamanhoVetor];
    public Integer qtdRegistros;
    Integer contNomeNV = 0;
    Integer contNomeFV = 0;
    Integer contNomePV = 0;
    Integer contIdadeNV = 0;
    Integer contIdadeFV = 0;
    Integer contIdadePV = 0;
    public String nome;
    public Integer anoNsc;
    public Calendar calendario = Calendar.getInstance();
    public Integer anoAtual = calendario.get(calendario.YEAR);

    public Integer calcIdade() {
        return anoAtual - anoNsc;
    }

    public String calcSituacao() {
        if (calcIdade() < 16) {
            nomesNV[contNomeNV] = nome;
            idadeNV[contIdadeNV] = calcIdade();
            ++contNomeNV;
            ++contIdadeNV;
        } else if (calcIdade() >= 16 && calcIdade() < 18) {
            nomesFV[contNomeFV] = nome;
            idadeFV[contIdadeFV] = calcIdade();
            ++contNomeFV;
            ++contIdadeFV;
        } else if (calcIdade() >= 18 && calcIdade() < 65) {
            nomesPV[contNomePV] = nome;
            idadePV[contIdadePV] = calcIdade();
            ++contNomePV;
            ++contIdadePV;
        } else {
            System.out.print("\nAlgo de errado aconteceu\n");
        }
        return "\nAlgo de errado aconteceu\n";
    }

    public void obrigatorioVoto(){
        System.out.print("Usuários de Voto Obrigatório\n");
        for (int i=0; i<nomesPV.length; i++){
            if (nomesPV[i] != null){
                System.out.print("\t"+ (i+1)+ ". Nome..: "+ nomesPV[i]+ "\n\t   Idade.: "+ idadePV[i]+ "\n");
            }
        };
    }

    public void facultativoVoto(){
        System.out.print("Usuários de Voto Facultativo\n");
        for (int i=0; i<nomesFV.length; i++){
            if (nomesFV[i] != null){
                System.out.print("\t"+ (i+1)+ ". Nome..: "+ nomesFV[i]+ "\n\t   Idade.: "+ idadeFV[i]+ "\n");
            }
        }
    }

    public void proibidoVoto(){
        System.out.print("Usuários que não podem Votar\n");
        for (int i=0; i<nomesNV.length; i++){
            if (nomesNV[i] != null){
                System.out.print("\t"+ (i+1)+ ". Nome..: "+ nomesNV[i]+ "\n\t   Idade.: "+ idadeNV[i]+ "\n");
            }
        }
    }

}
