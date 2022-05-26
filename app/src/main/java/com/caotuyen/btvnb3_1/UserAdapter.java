package com.caotuyen.btvnb3_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> mListUser;

    public UserAdapter(List<User> mListUser) {
        this.mListUser = mListUser;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);

        return new UserViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
     User user = mListUser.get(position);
     if(user == null){
         return;
     }
     holder.img_1.setImageResource(user.getResourceId());
     holder.tv_baiviet.setText(user.getBaiviet());
     holder.tv_name1.setText(user.getName());
     holder.tv_fan.setText(user.getFan());
     holder.tv_nhom.setText(user.getNhom());
    }

    @Override
    public int getItemCount() {
        if(mListUser != null){
            return  mListUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_1;
        private TextView tv_name1;
        private TextView tv_fan;
        private TextView tv_baiviet;
        private TextView tv_nhom;


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            img_1 = itemView.findViewById(R.id.img_1);
            tv_name1 = itemView.findViewById(R.id.tv_name1);
            tv_fan = itemView.findViewById(R.id.tv_fan);
            tv_baiviet = itemView.findViewById(R.id.tv_bai_viet1);
            tv_nhom = itemView.findViewById(R.id.tv_nhomdong1);
        }
    }
}
