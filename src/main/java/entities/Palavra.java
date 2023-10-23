package entities;

public class Palavra {
    private String palavraDodia;

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
            } else {
                System.out.print("X ");
            }
        }
    }


    @Override
    public String toString() {
        return palavraDodia;
    }
}
