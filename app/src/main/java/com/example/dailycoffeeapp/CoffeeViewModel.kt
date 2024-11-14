package com.example.dailycoffeeapp

import androidx.lifecycle.ViewModel

class CoffeeViewModel: ViewModel() {

    private var coffeeList = arrayListOf(
        Coffee(
            "Americano",
            R.drawable.americano,
            "In Italy, caffè americano may mean either espresso with hot water or long-filtered coffee."
        ),
        Coffee(
            "Americano",
            R.drawable.americano,
            "Caffè americano specifically is Italian for \"American coffee\"."
        ),
        Coffee(
            "Americano",
            R.drawable.americano,
            "During the war, American soldiers in Italy found espresso too strong, so they diluted it with hot water to make it milder. This is how it originated."
        ),
        Coffee(
            "Cafe Au Lait",
            R.drawable.cafe_au_lait,
            "Café au lait is coffee with hot milk added for French."
        ),
        Coffee(
            "Cafe Au Lait",
            R.drawable.cafe_au_lait,
            "Café au lait is coffee with hot milk added for French."
        ),
        Coffee(
            "Cafe Au Lait",
            R.drawable.cafe_au_lait,
            "In France it is typically served as a breakfast drink, often as a large portion in a handleless bowl."
        ),
        Coffee("Cafe Crema", R.drawable.cafe_crema, "An old name for espresso (1940s and 1950s)."),
        Coffee(
            "Cafe Crema",
            R.drawable.cafe_crema,
            "In Italy caffè crema is sometimes used for a crema rich espresso."
        ),
        Coffee(
            "Cafe Crema",
            R.drawable.cafe_crema,
            "As a colorful synonym for \"espresso\", the term and variants find occasional use in coffee branding, as in \"Jacobs Caffè Crema\" and \"Kenco Café Crema\"."
        ),
        Coffee(
            "Cappuccino",
            R.drawable.cappucino,
            "Cappuccino is an espresso-based coffee drink that is traditionally prepared with steamed milk including a layer of milk foam."
        ),
        Coffee(
            "Cappuccino",
            R.drawable.cappucino,
            "The name comes from the Capuchin friars, referring to the color of their habits, and in this context, referring to the color of the beverage when milk is added in small portion to dark, brewed coffee"
        ),
        Coffee(
            "Cappuccino",
            R.drawable.cappucino,
            "A cappuccino is served in a small cup with a handle with a thick layer of foam, while a caffè latte is just espresso and milk, with the milk steamed to be hot and to form microfoam, and is usually served in a large glass."
        ),
        Coffee(
            "Espresso",
            R.drawable.espresso,
            "Originating in Italy, espresso has become one of the most popular coffee-brewing methods worldwide."
        ),
        Coffee(
            "Espresso",
            R.drawable.espresso,
            "Originating in Italy, espresso has become one of the most popular coffee-brewing methods worldwide."
        ),
        Coffee(
            "Espresso",
            R.drawable.espresso,
            "It is characterized by its small serving size, typically 25–30 ml, and its distinctive layers: a dark body topped with a lighter-colored foam called crema."
        ),
        Coffee(
            "Flat White",
            R.drawable.flat_white,
            "It generally has a higher proportion of espresso to milk than a caffè latte, and lacks the thick layer of foam in a cappuccino."
        ),
        Coffee(
            "Flat White",
            R.drawable.flat_white,
            "It generally has a higher proportion of espresso to milk than a caffè latte, and lacks the thick layer of foam in a cappuccino."
        ),
        Coffee(
            "Flat White",
            R.drawable.flat_white,
            "It generally has a higher proportion of espresso to milk than a caffè latte, and lacks the thick layer of foam in a cappuccino."
        ),
        Coffee(
            "Cafe Latte",
            R.drawable.latte,
            "The term comes from the Italian caffè latte, from caffè e latte, literally 'coffee and milk'"
        ),
        Coffee(
            "Cafe Latte",
            R.drawable.latte,
            "A caffè latte is much milkier than a cappuccino, resulting in a milder coffee taste."
        ),
        Coffee(
            "Cafe Latte",
            R.drawable.latte,
            "Variants include the chocolate-flavored mocha or replacing the coffee with another beverage base such as masala chai, matcha; alternatives to milk, such as coconut, almond or oat milk, are also used."
        ),
        Coffee(
            "Latte Macchiato",
            R.drawable.latte_macchiato,
            "In a latte macchiato, espresso is added to milk, rather than milk to espresso."
        ),
        Coffee(
            "Latte Macchiato",
            R.drawable.latte_macchiato,
            "A latte macchiato often uses only half an espresso shot or less."
        ),
        Coffee(
            "Latte Macchiato",
            R.drawable.latte_macchiato,
            "A latte macchiato is often a layered drink, rather than being mixed."
        )
    )

    fun getRandomCoffee(): Coffee{
        return coffeeList.random()
    }
}