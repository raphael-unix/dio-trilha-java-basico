public class SmartTv {
    public static void main(String[] args) {
        boolean ligada  = false;
        int canal       = 0;
        int volume      = 0;

        public boolean ligarDesligar(boolean estado){
            estado = estado == true ? ligada = true : ligada = false;

            return estado;

        }
        public void mudarVolume(boolean volumetv){
             volume = volumetv == true ? volume ++: volume --;

            return volume;

        }
        public int mudarCanal(boolean mudar) {
            canal = mudar == true ? canal ++ : canal --;


        }
        System.out.println();
    }
}
