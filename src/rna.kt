/**
 * Created by ericl on 7/19/2017.
 */

fun transcribeToRna(code: String) =
        code.map { transcribe(it) }
            .joinToString(separator = "")

fun transcribe(c: Char) : String {

    val rna = when(c) {
        'C' -> "G"
        'G' -> "C"
        'T' -> "A"
        'A' -> "U"
        else -> throw IllegalArgumentException("Unknown DNA")
    }

    return rna
}