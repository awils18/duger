package back9.com.duger;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alexwilson on 11/3/16.
 */

public class ListAdapter extends RecyclerView.Adapter
{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homepage_card, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView();
    }

    @Override
    public int getItemCount() {
        // Get total amount of cards that we would like to display
        return 3;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder
    {

        public ListViewHolder(View itemView)
        {
            super(itemView);
        }

        public void bindView()
        {
            // Set view with cards
        }
    }
}


