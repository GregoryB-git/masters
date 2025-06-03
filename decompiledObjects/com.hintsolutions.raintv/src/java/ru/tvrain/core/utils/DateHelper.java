/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.format.DateUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 */
package ru.tvrain.core.utils;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateHelper {
    public static final String DATE = "yyyy-MM-dd";
    public static final String DATE_TIME = "EEE, dd MMM yy HH:mm:ss Z";
    public static final String RFC822 = "EEE, d MMM yy HH:mm:ss Z";
    public static final String TIME = "HH:mm";

    public static String format(String string2, Date date) {
        return new SimpleDateFormat(string2, Locale.getDefault()).format(date);
    }

    public static String formatDate(Date date) {
        return DateHelper.formatWithLocale(DATE, date, Locale.US);
    }

    public static String formatScheduleTitle(Date date) {
        return DateHelper.format("d MMMM", date);
    }

    public static String formatScheduleTitleDayOfWeek(Date date) {
        return DateHelper.format("EEEE", date);
    }

    public static String formatWithLocale(String string2, Date date, Locale locale) {
        return new SimpleDateFormat(string2, locale).format(date);
    }

    public static long getProgramNextAirTime(String string2) throws ParseException {
        return DateHelper.parse(DATE_TIME, string2).getTime();
    }

    public static String getRelativeDateString(Context context, Date date) {
        if (date == null) {
            return "";
        }
        return DateUtils.getRelativeDateTimeString((Context)context, (long)date.getTime(), (long)86400000L, (long)604800000L, (int)0).toString().split(",")[0];
    }

    public static CharSequence getRelativeDateTimeString(Context context, String string2) throws ParseException {
        return DateUtils.getRelativeDateTimeString((Context)context, (long)DateHelper.parse(DATE_TIME, string2).getTime(), (long)86400000L, (long)604800000L, (int)0);
    }

    public static String getRelativeDateTimeString(Context context, Date date) {
        if (date == null) {
            return "";
        }
        return DateUtils.getRelativeDateTimeString((Context)context, (long)date.getTime(), (long)86400000L, (long)604800000L, (int)0).toString();
    }

    public static Date now() {
        return new Date();
    }

    public static Date parse(String string2) {
        return DateHelper.parse(string2, false);
    }

    public static Date parse(String string2, String string3) throws ParseException {
        return new SimpleDateFormat(string2, Locale.US).parse(string3);
    }

    public static Date parse(String string2, boolean bl) {
        StringBuilder stringBuilder = z2.t("yyyy-MM-dd HH:mm:ss");
        String string3 = "Z";
        String string4 = bl ? "Z" : "";
        stringBuilder.append(string4);
        string4 = stringBuilder.toString();
        Locale locale = Locale.ENGLISH;
        stringBuilder = new SimpleDateFormat(string4, locale);
        StringBuilder stringBuilder2 = z2.t("EEE, dd MMM yyyy HH:mm:ss");
        string4 = bl ? "Z" : "";
        stringBuilder2.append(string4);
        stringBuilder2 = new SimpleDateFormat(stringBuilder2.toString(), locale);
        StringBuilder stringBuilder3 = z2.t("EEE, dd MMM yy HH:mm:ss");
        string4 = bl ? "Z" : "";
        stringBuilder3.append(string4);
        stringBuilder3 = new SimpleDateFormat(stringBuilder3.toString(), locale);
        StringBuilder stringBuilder4 = z2.t("yyyy-MM-dd'T'HH:mm:ss");
        string4 = bl ? string3 : "";
        stringBuilder4.append(string4);
        stringBuilder4 = new SimpleDateFormat(stringBuilder4.toString(), locale);
        locale = new SimpleDateFormat(DATE, locale);
        if (string2 == null) {
            return null;
        }
        string4 = string3 = string2.trim().replaceAll("(?m)\\s*\\+[0-9]+\\s*$", "");
        if (bl) {
            string4 = string3;
            if (string3.equals((Object)string2)) {
                string4 = z2.o(string3, "+0300");
            }
        }
        try {
            string2 = stringBuilder.parse(string4);
            return string2;
        }
        catch (ParseException parseException) {
            try {
                Date date = stringBuilder2.parse(string4);
                return date;
            }
            catch (ParseException parseException2) {
                try {
                    Date date = stringBuilder3.parse(string4);
                    return date;
                }
                catch (ParseException parseException3) {
                    try {
                        Date date = stringBuilder4.parse(string4);
                        return date;
                    }
                    catch (ParseException parseException4) {
                        try {
                            Date date = locale.parse(string4);
                            return date;
                        }
                        catch (ParseException parseException5) {
                            return null;
                        }
                    }
                }
            }
        }
    }

    public static Date parseRFC822(String string2) throws ParseException {
        return DateHelper.parseWithLocale(RFC822, string2, Locale.US);
    }

    public static Date parseWithLocale(String string2, String string3, Locale locale) throws ParseException {
        return new SimpleDateFormat(string2, locale).parse(string3);
    }
}

