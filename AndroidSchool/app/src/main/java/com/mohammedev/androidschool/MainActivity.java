package com.mohammedev.androidschool;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */


    //Student    s1 , s2 , s3
    // index      0 , 1 , 2

    ArrayList<Student> students = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */


        TextView studentsname , studentsage ,studentGrade ;
        ImageView studentsPhoto;
        Button ChangeStudentBtn;

        studentsname = findViewById(R.id.studentName);
        studentsage = findViewById(R.id.studentAge);
        studentGrade = findViewById(R.id.studentGrade);
        studentsPhoto = findViewById(R.id.studentImage);

        Student m1 = new Student("mohammad",15 , 10 , R.drawable.boy);
        Student m2 = new Student("ali",16 , 11 , R.drawable.boy1);
        Student m3 = new Student("fahad",17 , 12 , R.drawable.boy2);


        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}