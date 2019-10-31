package com.example.lab3x.utilities;

import com.example.lab3x.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SampleData {

    private static final String SAMPLE_TEXT_1 = "A simple note";
    private static final String SAMPLE_TEXT_2 = "A note with a/nline feed";
    private static final String SAMPLE_TEXT_3 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lacinia vel orci id tempor. Etiam pretium erat dui, feugiat pulvinar nisl ultricies et. Cras eu efficitur tellus. Vestibulum fringilla vehicula tellus vitae bibendum. Nam porta quis nibh eget accumsan. Nulla malesuada leo eu libero molestie sodales. Duis id arcu euismod, lacinia metus non, dapibus nibh. Maecenas eget accumsan massa, tristique luctus purus. Curabitur est purus, posuere eu scelerisque sed, efficitur vel risus. Ut non faucibus dui. Cras gravida urna a risus dapibus, vel convallis quam maximus. Sed semper magna eget ex fringilla interdum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;";
    private static final String SAMPLE_TEXT_4 = "A simple note";
    private static final String SAMPLE_TEXT_5 = "A note with a/nline feed";
    private static final String SAMPLE_TEXT_6 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lacinia vel orci id tempor. Etiam pretium erat dui, feugiat pulvinar nisl ultricies et. Cras eu efficitur tellus. Vestibulum fringilla vehicula tellus vitae bibendum. Nam porta quis nibh eget accumsan. Nulla malesuada leo eu libero molestie sodales. Duis id arcu euismod, lacinia metus non, dapibus nibh. Maecenas eget accumsan massa, tristique luctus purus. Curabitur est purus, posuere eu scelerisque sed, efficitur vel risus. Ut non faucibus dui. Cras gravida urna a risus dapibus, vel convallis quam maximus. Sed semper magna eget ex fringilla interdum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;";
    private static final String SAMPLE_TEXT_7 = "A simple note";
    private static final String SAMPLE_TEXT_8 = "A note with a/nline feed";
    private static final String SAMPLE_TEXT_9 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lacinia vel orci id tempor. Etiam pretium erat dui, feugiat pulvinar nisl ultricies et. Cras eu efficitur tellus. Vestibulum fringilla vehicula tellus vitae bibendum. Nam porta quis nibh eget accumsan. Nulla malesuada leo eu libero molestie sodales. Duis id arcu euismod, lacinia metus non, dapibus nibh. Maecenas eget accumsan massa, tristique luctus purus. Curabitur est purus, posuere eu scelerisque sed, efficitur vel risus. Ut non faucibus dui. Cras gravida urna a risus dapibus, vel convallis quam maximus. Sed semper magna eget ex fringilla interdum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;";
    private static final String SAMPLE_TEXT_10 = "A simple note";
    private static final String SAMPLE_TEXT_11 = "A note with a/nline feed";
    private static final String SAMPLE_TEXT_12 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lacinia vel orci id tempor. Etiam pretium erat dui, feugiat pulvinar nisl ultricies et. Cras eu efficitur tellus. Vestibulum fringilla vehicula tellus vitae bibendum. Nam porta quis nibh eget accumsan. Nulla malesuada leo eu libero molestie sodales. Duis id arcu euismod, lacinia metus non, dapibus nibh. Maecenas eget accumsan massa, tristique luctus purus. Curabitur est purus, posuere eu scelerisque sed, efficitur vel risus. Ut non faucibus dui. Cras gravida urna a risus dapibus, vel convallis quam maximus. Sed semper magna eget ex fringilla interdum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;";


    private static Date getDate(int diff){
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.MILLISECOND, diff);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes() {
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(1, getDate(0), SAMPLE_TEXT_1));
        notes.add(new NoteEntity(2, getDate(-1), SAMPLE_TEXT_2));
        notes.add(new NoteEntity(3, getDate(-2), SAMPLE_TEXT_3));
        notes.add(new NoteEntity(4, getDate(-3), SAMPLE_TEXT_4));
        notes.add(new NoteEntity(5, getDate(-4), SAMPLE_TEXT_5));
        notes.add(new NoteEntity(6, getDate(-5), SAMPLE_TEXT_6));
        notes.add(new NoteEntity(7, getDate(-6), SAMPLE_TEXT_7));
        notes.add(new NoteEntity(8, getDate(-7), SAMPLE_TEXT_8));
        notes.add(new NoteEntity(9, getDate(-8), SAMPLE_TEXT_9));
        notes.add(new NoteEntity(10, getDate(-9), SAMPLE_TEXT_10));
        notes.add(new NoteEntity(11, getDate(-10), SAMPLE_TEXT_11));
        notes.add(new NoteEntity(12, getDate(-11), SAMPLE_TEXT_12));
        return notes;
    }
}
