class Modulo{


    private var notas: Array<Array<Int>>
    var numAlumno=0
    var alumnos: Array<Alumno?>
    
    fun matriculaAlumno(unAlumno: Alumno) {
        alumnos[1]=unAlumno
    }

    fun rellenaNotas(numeroEvaluaciones:Int,numMyAlumno:Int  ) {
        for (i in 1..numeroEvaluaciones-1)
        notas[i][numMyAlumno]=(0..10).random()
    }
fun notaFinal(){

}

constructor(size:Int,evaluaciones:Int){
    notas=   Array(evaluaciones) { Array(size) { 0 } }
    alumnos = Array(size) { null }

}
}