package designerPdfViewer

fun designerPdfViewer(h: Array<Int>, word: String): Int {

    val alphabet:List<Char> = ('a'..'z').toList()
    var maxCharHeight = 0
    word.forEach {
        var i = alphabet.indexOf(it)
        if (maxCharHeight < h[i]) maxCharHeight = h[i]
    }
    return maxCharHeight * word.length

}

fun main() {
    val h = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}