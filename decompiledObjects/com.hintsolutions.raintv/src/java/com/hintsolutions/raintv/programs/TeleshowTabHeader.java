/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 *  ru.tvrain.core.data.Program
 */
package com.hintsolutions.raintv.programs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hintsolutions.raintv.interfaces.AdapterViewItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ru.tvrain.core.data.Program;

public class TeleshowTabHeader
implements AdapterViewItem {
    private Context context;
    private Program program;

    public TeleshowTabHeader(Context context, Program program) {
        this.context = context;
        this.program = program;
    }

    public static String renderSchedule(Context context, Program program) {
        program = program.next_air;
        if (program != null) {
            Date date = program.getStartDate();
            if (date == null) {
                return null;
            }
            program = new SimpleDateFormat("dd MMMM \u0432 HH:mm", new Locale("ru"));
            return context.getResources().getString(2131755609, new Object[]{program.format(date)});
        }
        return null;
    }

    @Override
    public View getView(ViewGroup viewGroup) {
        View view = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(2131493155, viewGroup, false);
        ((TextView)view.findViewById(2131296946)).setText((CharSequence)this.program.name);
        viewGroup = (TextView)view.findViewById(2131297081);
        viewGroup.setVisibility(8);
        String string = TeleshowTabHeader.renderSchedule(this.context, this.program);
        if (string != null) {
            viewGroup.setText((CharSequence)string);
            viewGroup.setVisibility(0);
        }
        return view;
    }
}

