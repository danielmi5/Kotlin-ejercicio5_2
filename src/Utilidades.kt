class Utilidades {
    companion object{
        fun Double.decimales(numDecimales: Int): Double{
            return "%.${numDecimales}f".format(this).replace(",",".").toDouble()
        }
    }
}