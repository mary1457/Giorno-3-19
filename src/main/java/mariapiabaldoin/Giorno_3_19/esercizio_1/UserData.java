package mariapiabaldoin.Giorno_3_19.esercizio_1;


import lombok.ToString;

@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void setData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
