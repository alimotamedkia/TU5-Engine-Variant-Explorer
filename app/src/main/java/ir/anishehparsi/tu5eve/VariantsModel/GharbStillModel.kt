package ir.anishehparsi.tu5eve.VariantsModel

data class GharbStillModel(
    val title: String,
    val description: String,
    val gearboxType: String,
    val productType: String,
    val technicalNumber: String,
    val engineType: String,
    val throttleType: String,
    val oldCode: String,
    val newCode: String,
    val customerSite: String,
    val electricalType: String,

    val oxygenSensor: String,
    val knockSensor: String,
    val throttle: String,
    val wob: String,
    val wib: String,
    val tmapSensor: String,
    val manifold: String,
    val injector: String,
    val underCover: String,
    val flywheel: String,
    val sparkPlugProtector: String,
    val airCamshaftSeal: String,
    val exhaustCamshaftSeal: String,
    val waterPump: String,
    val airCamshaft: String,
    val exhaustCamshaft: String,
    val engineHandel: String,
    val diskPlate: String,
    val positionSensor: String,
    val crankShaft: String,
    val valveSpring: String,
    val cylinderHead: String,
    val cylinder: String,
    val tHydraulic: String,
    val airCamshaftGear: String,
    val exhaustCamshaftGear: String,
    val crankshaftGear: String,
    val oilPump: String,
    val oilPumpCasing: String,
    val connectingRodPiston: String,
    val coil: String,
)

val variantInboxGharbStill = listOf(
    GharbStillModel(
        "RGF",
        "موتور TU5",
        "دستی",
        "207 غرب استیل",
        "IK01275480",
        "TU5",
        "دستی",
        "167B",
        "172B",
        "تهران - مونتاژ 4",
        "غرب استیل",

        "9635978280",
        "YG20246677\nK911841648",
        "YG20246673",
        "YG22249858 (فشنگی آب سبز)\n 9636777180",
        "YG20249911\n" +
                "YG22245042",
        "YG20246675",
        "9635885080",
        "YG20246680",
        "9637026580",
        "YG23249819",
        "9683472980",
        "9651177380",
        "9651177380",
        "9635710580",
        "9636452980",
        "9636457380",
        "YG22249851",
        "YG20293540\n" +
                "YG20297540",
        "---",
        "9641930780",
        "9635454580",
        "9656359280",
        "YG20247513",
        "9635323080\n" +
                "YG20246672\n" +
                "YG20246650",
        "9643414980",
        "9643414880",
        "9655547680",
        "9652619580",
        "9621113980",
        "YG20246681",
        "YG20246674"

    ),
    GharbStillModel(
        "GEB",
        "موتور TU5P",
        "دستی",
        "207 غرب استیل شش سرعته",
        "IK01826880",
        "TU5P",
        "برقی",
        "175B",
        "188B",
        "تهران - مونتاژ 4",
        "غرب استیل",

        "9635978280",
        "YG20246677\nK911841648",
        "YG20246673",
        "YG22245048(سبز)\n" +
                "9636777180",
        "YG20249911\n" +
                "YG22245042",
        "9639381480",
        "9635885080",
        "YG20246680",
        "9674212280",
        "YG23249819",
        "YG22249823\n" +
                "9678202080",
        "YG22249831",
        "9651177380",
        "9824998180",
        "YG22249830\n" +
                "9676515780",
        "YG22249832\n" +
                "9674614480",
        "YG22249851",
        "YG20293540",
        "IK60121480",
        "9641930780",
        "YG22249835",
        "YG22249816\n9676516480",
        "YG22249807\n9677062180",
        "YG22249836\n" +
                "9636956980",
        "K914561458A\n" +
                "IK00600032\n" +
                "9674461480",
        "9643414880",
        "YG22249829\n" +
                "9674617680",
        "YG22249837\n9674199380",
        "9639840480\n" +
                "9648492180",
        "YG20246720",
        "YG23249897\n" +
                "YG23249907"

    )
)