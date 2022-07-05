package com.example.submissiondicodingjdmcars

object JdmCarsData {
    private val carNames: Array<String> = arrayOf(
        "Corolla AE86",
        "Civic Type R",
        "350Z",
        "GTR Nismo",
        "RX 7",
        "Lancer Evo 4",
        "240SX",
        "RX8",
        "S2000",
        "Silvia S13",
        "Skyline R34",
        "Supra MK4",
        "Impereza WRX STI"
    )

    private val carMachines: Array<String> = arrayOf(
        "4A-GE",
        "VTEC Turbo DOHC",
        "VQ35DE V6",
        "VR38DETT twin-turbo V6",
        "Rotary / Wankel",
        "4G63T",
        "KA24E",
        "RENESIS Rotary",
        "VTEC",
        "KA24DE",
        "twin-turbo RB28DETT",
        "2JZ-GTE",
        "EJ205 WRX"
    )

    private val carBrand: Array<String> = arrayOf(
        "Toyota",
        "Honda",
        "Nissan",
        "Nissan",
        "Mazda",
        "Mitsubishi",
        "Nissan",
        "Mazda",
        "Honda",
        "Nissan",
        "Nissan",
        "Toyota",
        "Subaru"
    )

    private val carImages = intArrayOf(
        R.drawable.ae_86,
        R.drawable.civic_type_r,
        R.drawable.fairlady_350z,
        R.drawable.gtr_nismo,
        R.drawable.rx7,
        R.drawable.lancer_evo4jpg,
        R.drawable.nissan_240sx,
        R.drawable.rx8,
        R.drawable.s2000,
        R.drawable.silvia_s13,
        R.drawable.skyline_r34,
        R.drawable.supra_mk4,
        R.drawable.wrx_sti
    )

    private val carDesc: Array<String> = arrayOf(
        "The AE86 series of the Toyota Corolla Levin and Toyota Sprinter Trueno are small, front-engine/rear-wheel-drive models within the front-engine/front-wheel-drive fifth generation Corolla (E80) range—marketed by Toyota from 1983 to 1987 in coupé and liftback configurations.",
        "The Honda Civic Type R is a series of high-performance hatchback/sedan models based on the Civic, developed and produced by Honda since September 1997. The first Civic Type R was the third model to receive Honda's Type R badge (after the NSX and Integra). Type R versions of the Civic typically feature a lightened and stiffened body, specially tuned engine, and upgraded brakes and chassis, and are offered only in five- or six-speed manual transmission. Like every other Type R models, red is used in the Honda badge background to give it a special sporting distinction and to separate it from lesser models.",
        "The Nissan 350Z (known as Nissan Fairlady Z (Z33) in Japan) is a two-door, two-seater sports car that was manufactured by Nissan Motor Corporation from 2002 until 2009 and marks the fifth generation of Nissan's Z-car line. The 350Z entered production in 2002 and was sold and marketed as a 2003 model from August 2002. The first year there was only a coupe, as the roadster did not debut until the following year. Initially, the coupe came in Base, Enthusiast, Performance, Touring and Track versions, while the Roadster was limited to Enthusiast and Touring trim levels. The Track trim came with lightweight wheels and Brembo brakes, but its suspension tuning was the same as all other coupes. The Nissan 350Z was succeeded by the 370Z for the 2009 model year.",
        "The Nissan GT-R is a high-performance sports car and grand tourer produced by Nissan unveiled in 2007.[3][4][5] It is the successor to the Skyline GT-R, a high performance variant of the Nissan Skyline. Although this car was the sixth-generation model to bear the GT-R name, the model is no longer part of the Nissan Skyline model lineup since that name is now reserved for Nissan's luxury-sport vehicles. The GT-R built on the exclusively developed Nissan PM platform, which is an enhanced evolution of the Nissan FM platform used in the separate Nissan Skyline luxury car and the Nissan Z sports car. The GT-R abbreviation stands for Gran Turismo–Racing, obtained from the Skyline GT-R.[6]",
        "The Mazda RX-7 is a front-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 to 2002 across three generations, all of which made use of a compact, lightweight Wankel rotary engine.",
        "The Lancer Evo IV was launched in two versions: the RS and the GSR. The RS was the base model to be transformed as a rally car. It was white, with the cheapest seats in the house and bare steel wheels. It was just easy to buy and to transform. It featured all the important technology included. The GSR version was the road-going model, with more comfort options, alloy wheels, and a better interior.",
        "The Nissan 240SX is a sport compact car that was introduced to the North American market by Nissan in 1989 for the 1990 model year. It replaced the outgoing 200SX (S12) model. Most of the 240SX were equipped with the 2.4-liter inline 4 engine (KA24E from 1989 to 1990 and KA24DE from 1990 to 1998). The KA24E had a single overhead cam and KA24DE had dual overhead cams. Two distinct generations of the 240SX, the S13 (1989–1994) the S14 (1994-1998) were produced based on the Nissan S platform.",
        "The Mazda RX-8 is a sports car manufactured by Japanese automobile manufacturer Mazda between 2002 and 2012. It was first shown in 2001 at the North American International Auto Show. It is the successor to the RX-7[citation needed] and, like its predecessors in the RX range, it is powered by a rotary Wankel engine. The RX-8 was available for sale in North America from the 2003 model year.",
        "The Honda S2000 is an open top sports car that was manufactured by Japanese automobile manufacturer Honda, from 1999 to 2009. First shown as a concept car called the SSM at the Tokyo Motor Show in 1995, the production version was launched on April 15, 1999, to celebrate the company's 50th anniversary. The S2000 is named for its engine displacement of two liters, carrying on in the tradition of the S500, S600, and S800 roadsters of the 1960s.",
        "The Nissan Silvia (Japanese: 日産・シルビア, Hepburn: Nissan Shirubia) is the series of small sports cars produced by Nissan. Versions of the Silvia have been marketed as the 200SX or 240SX for export, with some export versions being sold under the Datsun brand.The name \"Silvia\" is derived from Sylvia, the name of the nymph who served Diana, the Roman goddess of the hunt and chastity. The name also means \"forest\" in Latin.",
        "The Nissan Skyline GT-R is a sports car based on the Nissan Skyline range. The first cars named \"Skyline GT-R\" were produced between 1969 and 1972 under the model code KPGC10, and were successful in Japanese touring car racing events. This model was followed by a brief production run of second-generation cars, under model code KPGC110, in 1973.",
        "The first Toyota Supra's appeared in Japan in 1978, and production continued until 2002, with the car undergoing three major revisions culminating in the Mk IV twin turbo Toyota Supra of 1993 - 2002.The Mark IV Toyota Supra was offered with two different engine options; a naturally aspirated 2JZ-GE, 3.0 litre, straight 6 with 220 horsepower and 210 ft/lbs of torque, and a 2JZ-GTE 3.0 litre twin turbocharged straight 6 with 320 horsepower and 315 ft/lbs of torque.",
        "Debuting at the Tokyo Auto Show in October 2007, WRX STI versions build further on the standard WRX cars. The STI available in Japan is fitted with the 2.0-liter EJ207 engine with twin scroll turbocharger generating 227 kW (308 PS) at 6,500 rpm and 422 N⋅m (311 lb⋅ft) of torque at 4,400 rpm. Export markets receive the higher-displacement 2.5-liter EJ257 unit with the single-scroll VF48 turbocharger rated at 221 kW (300 PS) and 407 N⋅m (300 lb⋅ft) of torque. The turbocharger directs air through a larger top-mount intercooler which has lost the red \"STI\" that was on previous generations. The STI (3,395 lbs) is heavier than the WRX (3,174- 3,240 lbs depending on trim) due to a more robust transmission, rear differential and other chassis reinforcements."
    )

    private val driveWheelSystemType: Array<DriveWheelSystemType> = arrayOf(
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.FWD,
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.AWD,
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.AWD,
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.FRWD,
        DriveWheelSystemType.AWD,
        DriveWheelSystemType.RWD,
        DriveWheelSystemType.FRWD
    )

    fun getCarList(): ArrayList<JdmCarsModel> {
        var list = arrayListOf<JdmCarsModel>()

        for (index in carNames.indices) {
            val car = JdmCarsModel(
                carImages[index], carNames[index], carBrand[index], carDesc[index],
                driveWheelSystemType[index], carMachines[index]
            )

            list.add(car)
        }

        return list
    }


}