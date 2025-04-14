package ir.anishehparsi.tu5eve.VariantsModel

data class AscsModel(
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

val variantInboxAscs = listOf(
    AscsModel(
        "ABZ",
        "موتور TU5P - گیربکس MT6",
        "دستی",
        "ایپکو MT6 207",
        "IK020609680",
        "TU5P",
        "برقی",
        "191B",
        "188B",
        "تهران - مونتاژ 4",
        "ECS (ایپکو)",

        "IK01301280",
        "K911841948\n" +
                "IK60175180",
        "IK60121380",
        "YG22245048(سبز)\n" +
                "9636777180",
        "YG20249911\n" +
                "YG22245042",
        "9639381480\nIK60175080",
        "9635885080",
        "K914561008A",
        "9674212280",
        "YG23249819",
        "YG22249823\n9678202080",
        "YG22249831",
        "9651177380",
        "9824998180",
        "YG22249830\n9676515780",
        "YG22249832\n9674614480",
        "YG22249851",
        "YG20293540",
        "IK60121480",
        "9641930780",
        "YG22249835",
        "YG22249816\n9676516480",
        "YG22249807\n" +
                "9677062180",
        "YG22249836\n" +
                "9636956980",
        "K914561458A\nIK00600032\n9674461480",
        "9643414880",
        "YG22249829\n9674617680",
        "YG22249837\n" +
                "9674199380",
        "9639840480\n" +
                "9648492180",
        "",
        "IK60121580"

    ),
    AscsModel(
        "AAZ",
        "موتور TU5P - گیربکس اتوماتیک 6 دنده",
        "اتوماتیک",
        "ایپکو 207 اتوماتیک",
        "IK01706980",
        "TU5P",
        "برقی",
        "191B",
        "185B",
        "تهران - مونتاژ 4",
        "AECS (ایپکو)",

        "IK01301280",
        "9645311480",
        "IK60121380",
        "YG22245048(مشکی)\n" +
                "YG20246695",
        "YG20249911\n" +
                "YG22245042",
        "9639381480",
        "9635885080",
        "IK60123580",
        "9674212280",
        "YG22245047 (درایوپلیت)",
        "YG22249823\n" +
                "9678202080",
        "YG22249831",
        "9651177380",
        "9824998180",
        "YG22249830\n" +
                "9676515780",
        "YG22249832\n" +
                "9674614480",
        "9676118680",
        "",
        "IK60121480",
        "9810083080",
        "YG22249835",
        "YG22249816\n" +
                "9676516480",
        "9810523680",
        "YG22249836\n" +
                "9636956980",
        "K914561458A\n" +
                "IK00600032\n" +
                "9674461480",
        "9643414880",
        "YG22249829\n" +
                "9674617680",
        "YG22249837\n" +
                "9674199380",
        "9639840480\n" +
                "9648492180",
        "",
        "IK60121580"
    ),
    AscsModel(
        "AAT",
        "تارا اتوماتیک",
        "اتوماتیک",
        "تارا اتوماتیک ایپکو",
        "IK02421980",
        "TU5P",
        "برقی",
        "185B",
        "185B",
        "تهران - مونتاژ 4",
        "AECS (ایپکو)",

        "IK01301280",
        "K911841948\nIK60175180",
        "IK60121380",
        "YG22245048(سبز)\n" +
                "9636777180",
        "YG20249911\n" +
                "YG22245042",
        "9639381480\n" +
                "IK60175080",
        "9635885080",
        "K914561008A",
        "9674212280",
        "YG22245047 (درایوپلیت)",
        "YG22249823\n" +
                "9678202080",
        "YG22249831",
        "9651177380",
        "9824998180",
        "YG22249830\n" +
                "9676515780",
        "YG22249832\n" +
                "9674614480",
        "9676118680",
        "",
        "IK60121480",
        "9810083080",
        "YG22249835",
        "YG22249816\n" +
                "9676516480",
        "9810523680",
        "YG22249836\n" +
                "9636956980",
        "K914561458A\n" +
                "IK00600032\n" +
                "9674461480",
        "9643414880",
        "YG22249829\n" +
                "9674617680",
        "YG22249837\n" +
                "9674199380",
        "9639840480\n" +
                "9648492180",
        "",
        "IK60121580"
    ),
    AscsModel(
        "ABX",
        "موتور TU5P گیربکس دستی",
        "دستی",
        "تارا دستی ایپکو",
        "IK02190480",
        "TU5P",
        "برقی",
        "187B",
        "187B",
        "تهران - مونتاژ 4",
        "AECS (ایپکو)",

        "IK01301280",
        "K911841948\n" +
                "IK60175180",
        "IK60121380",
        "YG22245048(سبز)\n" +
                "9636777180",
        "YG20249911\n" +
                "YG22245042",
        "9639381480\n" +
                "IK60175080",
        "9635885080",
        "K914561008A",
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
        "9676118680",
        "YG20293540",
        "IK60121480",
        "9641930780",
        "YG22249835",
        "YG22249816\n" +
                "9676516480",
        "YG22249807\n" +
                "9677062180",
        "YG22249836\n" +
                "9636956980",
        "K914561458A\n" +
                "IK00600032\n" +
                "9674461480",
        "9643414880",
        "YG22249829\n" +
                "9674617680",
        "YG22249837\n" +
                "9674199380",
        "9639840480\n" +
                "9648492180",
        "",
        "IK60121580"
    )
)
