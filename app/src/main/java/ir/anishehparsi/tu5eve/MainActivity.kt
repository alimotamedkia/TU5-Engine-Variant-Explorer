package ir.anishehparsi.tu5eve

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.compose.TU5EVETheme
import com.ramcosta.composedestinations.DestinationsNavHost
import ir.anishehparsi.tu5eve.destinations.AecsListDestination
import ir.anishehparsi.tu5eve.destinations.GharbStillListDestination
import ir.anishehparsi.tu5eve.destinations.InfoDestination
import ir.anishehparsi.tu5eve.destinations.S4ListDestination
import ir.anishehparsi.tu5eve.destinations.SiemensListDestination
import ir.anishehparsi.tu5eve.destinations.SsatListDestination


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TU5EVETheme {
                val navController = rememberNavController()
                val currentBackStageEntry by navController.currentBackStackEntryAsState()
                val currentRoute = currentBackStageEntry?.destination?.route
                val title = when (currentRoute) {
                    SiemensListDestination.route -> "Siemens"
                    GharbStillListDestination.route -> "غرب استیل"
                    SsatListDestination.route -> "SSAT"
                    AecsListDestination.route -> "AECS (ایپکو)"
                    S4ListDestination.route -> "S4"
                    else -> "TU5 EVE"
                }

                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = title,
                                    fontFamily = FontFamily(
                                        Font(R.font.vazirmatn_bold)
                                    )
                                )
                            },
                            actions = {
                                IconButton(onClick = { navController.navigate(InfoDestination.route) }) {
                                    Icon(
                                        imageVector = Icons.Default.Info,
                                        contentDescription = ""
                                    )
                                }
                            }
                        )
                    },
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = currentRoute == SiemensListDestination.route,
                                onClick = { navController.navigate(SiemensListDestination.route) },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.car),
                                        contentDescription = ""
                                    )
                                },
                                label = { Text(text = "SIEMENS") }
                            )
                            NavigationBarItem(
                                selected = currentRoute == GharbStillListDestination.route,
                                onClick = { navController.navigate(GharbStillListDestination.route) },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.car),
                                        contentDescription = ""
                                    )
                                },
                                label = { Text(text = "غرب استیل") }
                            )
                            NavigationBarItem(
                                selected = currentRoute == SsatListDestination.route,
                                onClick = { navController.navigate(SsatListDestination.route) },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.car),
                                        contentDescription = ""
                                    )
                                },
                                label = { Text(text = "SSAT") }
                            )
                            NavigationBarItem(
                                selected = currentRoute == AecsListDestination.route,
                                onClick = { navController.navigate(AecsListDestination.route) },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.car),
                                        contentDescription = ""
                                    )
                                },
                                label = { Text(text = "ایپکو") }
                            )
                            NavigationBarItem(
                                selected = currentRoute == S4ListDestination.route,
                                onClick = { navController.navigate(S4ListDestination.route) },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.car),
                                        contentDescription = ""
                                    )
                                },
                                label = { Text(text = "S4") }
                            )
                        }
                    }
                ) { innerPadding ->
                    DestinationsNavHost(
                        navGraph = NavGraphs.root,
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
