package ir.anishehparsi.tu5eve.VariantsModel

data class SiemensModel(
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
val variantInboxSiemens: List<SiemensModel>
    get() = listOf(
        SiemensModel(
            "RBH",
            "موتور TU5 کروز تراتل برقی",
            "دستی",
            "رانا زیمنس",
            "IK00668780",
            "TU5",
            "برقی",
            "172B",
            "172B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "RBK",
            "موتور TU5 کروز تراتل برقی",
            "دستی",
            "207 زیمنس",
            "IK00771080",
            "TU5",
            "برقی",
            "178B",
            "172B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "PBC",
            "موتور TU5 کروز تراتل مکانیکی",
            "دستی",
            "پارس زیمنس",
            "YG20249993",
            "TU5",
            "سیمی",
            "164B",
            "172B",
            "کرمانشاه - خراسان",
            "SIEMENS"
        ),
        SiemensModel(
            "PBZ",
            "موتور TU5 کروز",
            "دستی",
            "پارس زیمنس",
            "IK00843680",
            "TU5",
            "دستی",
            "164B",
            "172B",
            "مازندران",
            "SIEMENS"
        ),
        SiemensModel(
            "PEC",
            "موتور TU5P کروز تراتل برقی شش سرعته",
            "دستی",
            "پارس زیمنس",
            "YG22249806",
            "TU5P",
            "برقی",
            "175B",
            "188B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "RAP",
            "موتور TU5P گیربکس اتوماتیک",
            "اتوماتیک",
            "207 اتوماتیک",
            "IK00878480",
            "TU5P",
            "برقی",
            "185B",
            "185B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "REE",
            "موتور TU5P کروز",
            "دستی",
            "TU5P",
            "IK01472980",
            "TU5P",
            "برقی",
            "188B",
            "188B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "REC",
            "موتور TU5P کروز",
            "دستی",
            "رانا زیمنس شش سرعته",
            "IK01392380",
            "TU5P",
            "برقی",
            "188B",
            "188B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "RSS",
            "موتور TU5P کروز صادراتی",
            "دستی",
            "رانا صادراتی",
            "YG22245080",
            "TU5P",
            "برقی",
            "188B",
            "188B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        ),
        SiemensModel(
            "REA",
            "موتور TU5P گیربکس نیمه اتوماتیک 6 سرعته",
            "نیم اتوماتیک",
            "رانا 6 سرعته با گیربکس AMT",
            "IK01612680",
            "TU5P",
            "برقی",
            "188B",
            "188B",
            "تهران - مونتاژ 4",
            "SIEMENS"
        )
    )