package com.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class NoteEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_edit)

        val mainActivity = MainActivity();
        var TitlePreload = mainActivity.TitlePreload;
        var EditTextPreload = mainActivity.EditTextPreload;

        val title: EditText = findViewById(R.id.title)
        title.setText(TitlePreload)

        val editText: EditText = findViewById(R.id.editTextNote)
        editText.setText(EditTextPreload);
    }
}