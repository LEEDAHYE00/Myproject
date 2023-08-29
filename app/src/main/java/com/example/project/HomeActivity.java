package com.example.project;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import com.example.project.Post;
public class HomeActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private List<Post> postList = new ArrayList<>();
    private List<Post> filteredPostList = new ArrayList<>();
    private RecyclerView recyclerView;
    private PostAdapter postAdapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);
        postAdapter = new PostAdapter(postList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postAdapter);

        searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);

        // 예시 데이터 추가
        // ...

        postAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        // 검색어 제출 시 동작
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // 검색어 입력 변화 시 동작
        filteredPostList.clear();

        if (newText.isEmpty()) {
            filteredPostList.addAll(postList); // 검색어가 없을 경우 전체 목록 보여주기
        } else {
            // 검색 로직 구현 (예: postList에서 필터링)
            // filteredPostList에 검색 결과 추가
        }

        postAdapter.setPosts(filteredPostList);
        postAdapter.notifyDataSetChanged();

        return false;
    }
}
