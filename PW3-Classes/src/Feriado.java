import java.util.Date;

public class Feriado {
	public Long id;
	public String tipoFeriado;
	public String descricao;
	public Date data;
	
	public String toString () {
		return String.format("Tipo do Feriado: %s - Descrição: %s - Data: %s", tipoFeriado, descricao, data);
	}
}
