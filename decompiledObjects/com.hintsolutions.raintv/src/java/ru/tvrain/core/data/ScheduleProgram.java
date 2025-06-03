/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.text.ParseException
 *  java.util.Calendar
 *  java.util.Date
 */
package ru.tvrain.core.data;

import android.text.TextUtils;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import ru.tvrain.core.utils.DateHelper;

public class ScheduleProgram
implements Serializable {
    public String age_restricted;
    public Date date_end;
    public Date date_start;
    public String detail_img;
    public int is_favorite;
    public int program_id;
    public String program_name;
    public String suffix_name;
    public String tv_img;
    public String type;

    public boolean equals(Object object) {
        if (!(object instanceof ScheduleProgram)) {
            return false;
        }
        Date date = this.date_end;
        object = (ScheduleProgram)object;
        if (!date.equals((Object)((ScheduleProgram)object).date_end)) {
            return false;
        }
        if (!this.date_start.equals((Object)((ScheduleProgram)object).date_start)) {
            return false;
        }
        return this.program_id == ((ScheduleProgram)object).program_id;
    }

    public int getDayStart() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date_start);
        return calendar.get(6);
    }

    public String getFullName() {
        if (this.suffix_name.isEmpty()) {
            return String.format((String)"%s (%s)", (Object[])new Object[]{this.program_name, this.age_restricted});
        }
        return String.format((String)"%s (%s): %s", (Object[])new Object[]{this.program_name, this.age_restricted, this.suffix_name});
    }

    public int getHourStart() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date_start);
        return calendar.get(11);
    }

    public String getImage() {
        if (!TextUtils.isEmpty((CharSequence)this.detail_img)) {
            return this.detail_img;
        }
        return this.getPreview();
    }

    public String getPreview() {
        return this.tv_img;
    }

    public String getScheduleStart() {
        return DateHelper.format("HH:mm", this.date_start);
    }
}

