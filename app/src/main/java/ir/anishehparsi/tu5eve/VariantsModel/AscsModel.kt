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
    val electricalType: String
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
        "AECS (ایپکو)"
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
        "AECS (ایپکو)"
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
        "AECS (ایپکو)"
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
        "AECS (ایپکو)"
    )
)
