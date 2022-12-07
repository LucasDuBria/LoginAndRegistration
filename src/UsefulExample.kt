 fun main(){
     val input = readInput("numbers")
     println("Sum: ${sumAllNum(input)}")
     println("Min: ${findMin(input)}")
     println("Add2Smallest: ${addTwoSmallest(input)}")
     val wordInput = readInput("sentences")
     println("totalWords: ${countWords(wordInput)}")
     println("totalHWords: ${countHWords(wordInput)}")
 }

 fun sumAllNum(input : List<String>) : Int {
//     var total = 0
//     for(num in input){
//         total += num.toInt()
//     }
//     return total
   return input.map { it.toInt() }.sum()
 }
 fun findMin(input : List<String>) : Int {
     return input.map {it.toInt()}.min()
 }
 fun addTwoSmallest(input : List<String>) : Int {
     val sorted = input.map { it.toInt() }.sorted()
     println(sorted.take(2))
     return  input.map { it.toInt() }.sorted().take(2).sum()
 }
 fun countWords(input : List<String>) : Int {
     var wordCount = 0
     for (line in input) {
         wordCount += line.split(" ").size
     }
     return wordCount
 }
 fun countHWords(input : List<String>) : Int {
     var count = 0
     for(line in input){
         count += line.split(" ").count {
             it.startsWith("h", true)
         }
     }
     return count
 }