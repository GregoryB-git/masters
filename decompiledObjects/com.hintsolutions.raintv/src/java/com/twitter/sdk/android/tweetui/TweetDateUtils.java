/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  androidx.collection.SparseArrayCompat
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Locale
 */
package com.twitter.sdk.android.tweetui;

import android.content.res.Resources;
import androidx.collection.SparseArrayCompat;
import com.twitter.sdk.android.tweetui.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

final class TweetDateUtils {
    public static final SimpleDateFormat DATE_TIME_RFC822 = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
    public static final long INVALID_DATE = -1L;
    public static final DateFormatter RELATIVE_DATE_FORMAT = new DateFormatter();

    private TweetDateUtils() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long apiTimeToLong(String string2) {
        long l = -1L;
        if (string2 == null) {
            return -1L;
        }
        try {
            return DATE_TIME_RFC822.parse(string2).getTime();
        }
        catch (ParseException parseException) {
            return l;
        }
    }

    public static String dotPrefix(String string2) {
        return z2.o("\u2022 ", string2);
    }

    public static String getRelativeTimeString(Resources resources, long l, long l2) {
        long l3 = l - l2;
        if (l3 >= 0L) {
            if (l3 < 60000L) {
                int n = (int)(l3 / 1000L);
                return resources.getQuantityString(R.plurals.tw__time_secs, n, new Object[]{n});
            }
            if (l3 < 3600000L) {
                int n = (int)(l3 / 60000L);
                return resources.getQuantityString(R.plurals.tw__time_mins, n, new Object[]{n});
            }
            if (l3 < 86400000L) {
                int n = (int)(l3 / 3600000L);
                return resources.getQuantityString(R.plurals.tw__time_hours, n, new Object[]{n});
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(l2);
            Date date = new Date(l2);
            if (calendar.get(1) == calendar2.get(1)) {
                return RELATIVE_DATE_FORMAT.formatShortDateString(resources, date);
            }
            return RELATIVE_DATE_FORMAT.formatLongDateString(resources, date);
        }
        return RELATIVE_DATE_FORMAT.formatLongDateString(resources, new Date(l2));
    }

    public static boolean isValidTimestamp(String string2) {
        boolean bl = TweetDateUtils.apiTimeToLong(string2) != -1L;
        return bl;
    }

    public static class DateFormatter {
        private Locale currentLocale;
        private final SparseArrayCompat<SimpleDateFormat> dateFormatArray = new SparseArrayCompat();

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private DateFormat getDateFormat(Resources object, int n) {
            DateFormatter dateFormatter = this;
            synchronized (dateFormatter) {
                Locale locale = this.currentLocale;
                if (locale == null || locale != object.getConfiguration().locale) {
                    this.currentLocale = object.getConfiguration().locale;
                    this.dateFormatArray.clear();
                }
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat)this.dateFormatArray.get(n);
                locale = simpleDateFormat;
                if (simpleDateFormat == null) {
                    String string2 = object.getString(n);
                    locale = new SimpleDateFormat(string2, Locale.getDefault());
                    this.dateFormatArray.put(n, (Object)locale);
                }
                return locale;
            }
        }

        public String formatLongDateString(Resources object, Date date) {
            DateFormatter dateFormatter = this;
            synchronized (dateFormatter) {
                object = this.getDateFormat((Resources)object, R.string.tw__relative_date_format_long).format(date);
                return object;
            }
        }

        public String formatShortDateString(Resources object, Date date) {
            DateFormatter dateFormatter = this;
            synchronized (dateFormatter) {
                object = this.getDateFormat((Resources)object, R.string.tw__relative_date_format_short).format(date);
                return object;
            }
        }
    }
}

