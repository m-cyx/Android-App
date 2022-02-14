package com.example.suhanovapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.suhanovapp.adapter.CategoryAdapter;
import com.example.suhanovapp.adapter.CourseAdapter;
import com.example.suhanovapp.model.Category;
import com.example.suhanovapp.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //тут плашки
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "1 course"));
        categoryList.add(new Category(2, "2 couse"));
        categoryList.add(new Category(3, "3 course"));
        categoryList.add(new Category(4, "Kafedra"));

        setCategoryRecycler(categoryList);

        // тут большие плашки
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "suh2", "Maxim Suhanov", "Student", "02.03.02", "#302341", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam faucibus nisl ultrices egestas laoreet. Curabitur ac consequat velit, non maximus purus. Cras vitae fermentum tellus." ));
        courseList.add(new Course(2, "suh2_1", "Ivan Ivanov", "Student", "03.09.02", "#017374", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam faucibus nisl ultrices egestas laoreet. Curabitur ac consequat velit, non maximus purus. Cras vitae fermentum tellus." ));
        courseList.add(new Course(3, "suh3_1", "Vitaly Petrov", "Professor", "Kafedra", "#CF6679", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam faucibus nisl ultrices egestas laoreet. Curabitur ac consequat velit, non maximus purus. Cras vitae fermentum tellus." ));
        courseList.add(new Course(4, "suh4_1", "Anna Denisova", "Friend", "02.03.02", "#3700B3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam faucibus nisl ultrices egestas laoreet. Curabitur ac consequat velit, non maximus purus. Cras vitae fermentum tellus." ));

        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);


    }
}