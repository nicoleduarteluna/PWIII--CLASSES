import java.util.Date;

public class Feriado {
	public Long id;
	public String tipoFeriado;
	public String descricao;
	public Date data;
	
	public String toString () {
		return String.format("Tipo do Feriado: %s - Descri��o: %s - Data: %s", tipoFeriado, descricao, data);
	}
}
