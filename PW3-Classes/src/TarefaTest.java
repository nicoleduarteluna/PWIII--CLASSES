public class TarefaTest {
	public static void main(String[] args) {
		Tarefa obj = new Tarefa();
		obj.titulo = "TCC";
		obj.descricao = "Important�ssimo";
		obj.dataPrevista = DateTimeUtils.toDate(01, 03, 2020);
		
		
		//LocalDate ld = LocalDate.of(2020, 03, 01);
		//obj.dataPrevista = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		System.out.println(obj.toString());
		
		// System.out.println("T�tulo: " + trf.titulo + "\nDescri��o: " + trf.descricao + "\nData Prevista: " + trf.dataPrevista); 
	}
}
