import java.util.*


fun main() {
 val input = Scanner(System.`in`) // Demande action utilisateur
 println("Choisir un nombre") // Demande d'un nombre à l'utilisateur
 var nbre = input.nextInt()
 var flag = false
 for (i in 2.. nbre / 2) {
   if (nbre % i == 0) {
     flag = true
     break
   }
 }
if (!flag)
  println("$nbre est un nombre premier")
else
  println("$nbre n'est pas un nombre premier")
}