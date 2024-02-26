package nz.ac.uclive.dsi61.connect440

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val friends = arrayOf<Friend>(
        Friend("Ben Adams", "bta47", "Christchurch, NZ", "benjamin.adams@canterbury.ac.nz", "#######"),
        Friend("Danielle Sim", "dsi61", "Rolleston, NZ", "dsi61.@uclive.ac.nz", "0221523531"),
        Friend("Priscilla Ishida-Foale", "pis19", "Christchurch, NZ", "pis19@uclive.ac.nz", "#######"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val friendAdapter = FriendsAdapter(friends)
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = friendAdapter
    }
}


