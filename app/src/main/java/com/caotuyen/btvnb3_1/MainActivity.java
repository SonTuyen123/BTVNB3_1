package com.caotuyen.btvnb3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvDate;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvDate = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvDate.setLayoutManager(linearLayoutManager);

        userAdapter = new UserAdapter(getListUser());
        rcvDate.setAdapter(userAdapter);

    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.avatar1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "NHÓM ĐÔNG"));
        list.add(new User(R.drawable.img2, "Ăn để lăn", "8k Fan", "+10 bài viết mới nhất", "NHÓM KÍN"));
        list.add(new User(R.drawable.img3, "Chia sẻ kiến thức tài liệu Montessori", "1,7K Fan", "+10 bài viết mới nhất", "NHÓM MơỞ"));
        list.add(new User(R.drawable.img4, "Thực đơn Eat-Clean giảm cân khỏe đẹp", "11k Fan", "+10 bài viết mới nhất", "NHÓM MỞ"));
        list.add(new User(R.drawable.img5, "Easy Kento for busy People", "8k Fan", "+10 bài viết mới nhất", "NHÓM KÍN"));
        list.add(new User(R.drawable.img6, "OFFB", "8k Fan", "+10 bài viết mới nhất", "NHÓM MỞ"));
        list.add(new User(R.drawable.img4, "Thực đơn Eat-Clean giảm cân khỏe đẹp", "11k Fan", "+10 bài viết mới nhất", "NHÓM MỞ"));
        list.add(new User(R.drawable.img5, "Easy Kento for busy People", "8k Fan", "+10 bài viết mới nhất", "NHÓM KÍN"));

        return list;
    }

}
