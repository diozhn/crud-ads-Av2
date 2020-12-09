package univs.edu.table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import univs.edu.model.PodCast;

public class PodcastTableModel extends AbstractTableModel {

    private List<PodCast> podcasts = new ArrayList<>();
    private String[] colunas = {"Código" , "Título", "Descrição", "Data", "Avaliações", "Categoria", "Id do postador", "Link"};

    public PodcastTableModel(List<PodCast> pcs) {
        this.podcasts = pcs;
    }

    @Override
    public int getRowCount() {
        return podcasts.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PodCast pc = podcasts.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pc.getIdPC();
            case 1:
                return pc.getNomePC();
            case 2:
                return pc.getDescriptionPC();
            case 3:
                return pc.getDataPC();
            case 4:
                return pc.getAvaliacoesPC();
            case 5:
                return pc.getCategoriaPC();
            case 6:
                return pc.getIdCadastrante();
            case 7:
                return pc.getLinkPC();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];  
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];

        }
        return null;
    }

}
