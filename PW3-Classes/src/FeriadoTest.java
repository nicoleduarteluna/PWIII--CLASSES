public class FeriadoTest {
	public static void main(String[] args) {
		Feriado obj = new Feriado ();
		obj.tipoFeriado = "Nacional";
		obj.descricao = "Natal";
		obj.data = DateTimeUtils.toDate(25, 12, 2020);
		
		// 1 
		//LocalDate ld = LocalDate.of(2020, 12, 25);
		//obj.data = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		// 2
		//	Date dataFeriado = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		//	obj.data = dataFeriado;
		
		
		System.out.println(obj.toString());
		
		// System.out.println("Tipo Feriado: " + obj.tipoFeriado + "\nDescri��o:  " + obj.descricao + "\nData prevista: " + obj.data);
	}
}
