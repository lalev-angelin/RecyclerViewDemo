package bg.uni_svishtov.bi2016.recyclerviewdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter {

    class ContactsViewHolder extends RecyclerView.ViewHolder {
        private TextView sipTextView;
        private TextView nameTextView;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            sipTextView = itemView.findViewById(R.id.sipTextView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
