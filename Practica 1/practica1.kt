import java.util.Scanner
import java.time.LocalDateTime
import java.time.Period
import java.time.Duration
import java.time.temporal.ChronoUnit

fun main(){
	val scanner = Scanner(System.`in`)
	var salir = false
	var opcion = 0

	while(salir == false){
		println("\nManu")
		println("1.- Ingresar 3 numeros")
		println("2.- Ingresar nombre")
		println("3.- Ingresar fecha")
		println("4.- Salir")
		
		opcion = scanner.nextInt()
		
		when(opcion){
			1 -> numeros()
			2 -> nombre()
			3 -> fecha()
			4 -> salir = true
			else -> println("Opcion invalida")
		}
	}
}

fun numeros(){
	val scanner = Scanner(System.`in`)
	var total = 0.0
	var num1 = 0.0
	var num2 = 0.0
	var num3 = 0.0
	
	println("Ingrese primer numero")
	num1 = scanner.nextDouble()
	println("Ingrese el segundo numero")
	num2 = scanner.nextDouble()
	println("Ingrese el tercer numero")
	num3 = scanner.nextDouble()
	
	total = num1 + num2 + num3
	println("El total es: $total")
}

fun nombre(){
	val scanner = Scanner(System.`in`)
	var nombre = ""
	var apeP = ""
	var apeM = ""
	
	println("Ingrese su nombre")
	nombre = scanner.nextLine()
	println("Ingrese su apellido paterno")
	apeP = scanner.nextLine()
	println("Ingrese su apellido materno")
	apeM = scanner.nextLine()
	
	println("Su nombre es: $nombre $apeP $apeM")
}

fun fecha(){
	val scanner = Scanner(System.`in`)
	val fechaActu : LocalDateTime = LocalDateTime.now()
	var fechaNac : LocalDateTime
	var nacimiento : String
 
	println("Ingrese su fecha de nacimiento en aaaa-mm-dd")
	nacimiento = scanner.nextLine()
	fechaNac = LocalDateTime.parse("${nacimiento}T00:00:00")
	
	val meses = ChronoUnit.MONTHS.between(fechaNac,fechaActu)
	val semanas = ChronoUnit.WEEKS.between(fechaNac,fechaActu)
	val dias = ChronoUnit.DAYS.between(fechaNac,fechaActu)
	val horas = ChronoUnit.HOURS.between(fechaNac,fechaActu)
	val minutos = ChronoUnit.MINUTES.between(fechaNac,fechaActu)
	val segundos = ChronoUnit.SECONDS.between(fechaNac,fechaActu)
	
	println("Meses vividos: $meses")
	println("Semanas vividas: $semanas")
	println("Dias vividos: $dias")
	println("Horas vividas: $horas")
	println("Minutos vividos: $minutos")
	println("Segundos vividos: $segundos")
}