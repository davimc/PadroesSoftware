package state.dois_caixaEletronico;

public enum ContaState {
    NEGATIVADA{
        public ContaState saque(double valor) {
            System.out.println("Sua conta está negativada! Saldo bloqueado.");
            return NEGATIVADA;
        }
        public ContaState deposito(double valor) {
            System.out.println("Pendência paga! Saque liberado." +
                    " Valor depositado(95% valor total): " + valor *0.95);
            return NORMAL;
        }
    },
    NORMAL {
      public ContaState saque(double valor) {
          System.out.println("Sua conta está negativada! Próximo saque será recusado!!!");
          return NEGATIVADA;
      }
      public ContaState deposito(double valor) {
          System.out.println("Valor depositado(98% valor total): " + valor * 0.98);
          return NORMAL;
      }
    };
    public abstract ContaState saque(double valor);
    public abstract ContaState deposito(double valor);
}
