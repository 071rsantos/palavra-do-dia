package entities;

public class Palavra {
    private final String palavraDodia;

    public Palavra() {
        this.palavraDodia = "CASA";
    }

    public String getPalavraDodia() {
        return palavraDodia;
    }


    public void verificaLetra(String chute, String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
             if (chute.charAt(i) == palavra.charAt(i)) {
                System.out.print("V ");
            }else if (letraCerta(chute.charAt(i), palavra)){
                 System.out.print("Q ");
             } else if (chute.charAt(i) != palavra.charAt(i)){
                 System.out.print("X ");
             }
        }
    }

    public boolean letraCerta(char letra, String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            if (letra == palavra.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return palavraDodia;
    }
}
