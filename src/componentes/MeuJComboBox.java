package componentes;

import javax.swing.JComboBox;

public class MeuJComboBox extends JComboBox implements MeuComponente {
    private String dica;

    public MeuJComboBox(String[] dados, String dica) {
        this.dica = dica;

        for (String dado : dados) {
            addItem(dado);
        }
    }

    @Override
    public void limpar() {
        setSelectedIndex(-1);
    }

    @Override
    public void habilitar(Boolean status) {
        setEnabled(status);
    }

    @Override
    public String getDica() {
        return dica;
    }
}
