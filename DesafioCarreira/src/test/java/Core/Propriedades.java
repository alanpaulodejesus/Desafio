package Core;

public class Propriedades {

    public static final String URL = "https://localhost/mantis";
    public static final String USUARIO = "administrator";
    public static final String SENHA = "123";

    public static final String SENHA_INVALIDA = "1234";

    public static final Browsers browser = Browsers.CHROME;

    public static final TipoExecucao TIPO_EXECUCAO = TipoExecucao.GRID;

    public  static enum Browsers {
        CHROME,
        FIREFOX

    }

    public static enum TipoExecucao{
        LOCAL,
        GRID
    }
}
