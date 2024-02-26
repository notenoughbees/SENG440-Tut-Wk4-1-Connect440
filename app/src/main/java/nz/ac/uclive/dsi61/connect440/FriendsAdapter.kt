package nz.ac.uclive.dsi61.connect440

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FriendsAdapter(private val friends: Array<Friend>)
    : RecyclerView.Adapter<FriendsAdapter.FriendViewHolder>() {

    // class defined inside a class
    class FriendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView
        init {
            textView = itemView.findViewById(R.id.friend_text)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.friend_item, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: FriendViewHolder, position: Int) {
        viewHolder.textView.text = friends[position].toString()
    }

    override fun getItemCount() = friends.size




}