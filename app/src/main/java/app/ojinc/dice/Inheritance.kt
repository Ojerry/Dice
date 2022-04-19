    package app.ojinc.dice

    class Inheritance {
        val jeep = Jeep(2019)
    }

 abstract class car(var releaseYear: Int){
     abstract val  color: String
         abstract val name: String
            fun cost(DollarPrice: Int): Int {
                val NairaToDollar = 567
                return DollarPrice * NairaToDollar
         }
    }

    class Jeep(releaseYear: Int): car(releaseYear){
        override val color = "Black"
        override val name = "PathFinder"
    }