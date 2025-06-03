/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video$Media
 *  android.provider.Settings$Secure
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.widget.EditText
 *  com.google.firebase.crashlytics.FirebaseCrashlytics
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.DecimalFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.TimeZone
 *  ru.tvrain.core.utils.CustomTypefaceSpan
 */
package com.hintsolutions.raintv.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.EditText;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import ru.tvrain.core.utils.CustomTypefaceSpan;

public class CommonUtils {
    public static int dpToPx(Context context, int n) {
        float f2 = n;
        try {
            f2 = TypedValue.applyDimension((int)1, (float)f2, (DisplayMetrics)context.getResources().getDisplayMetrics());
        }
        catch (Exception exception) {
            return n;
        }
        return (int)f2;
    }

    public static long getAvailableSpace(Context context) {
        int n;
        long l;
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getPath());
            l = statFs.getAvailableBlocks();
            n = statFs.getBlockSize();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            l = -1L;
        }
        l *= (long)n;
        return l;
    }

    public static Calendar getCalendar(String string2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(simpleDateFormat.parse(string2));
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        return calendar;
    }

    public static String getCuteDouble(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###,###,###");
        long l = (long)d2;
        if (d2 == (double)l) {
            return decimalFormat.format(l).replaceAll(",", " ");
        }
        return String.format((String)"%.2f", (Object[])new Object[]{d2}).replaceAll(",", ".");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String getDataColumn(Context context, Uri uri, String string2, String[] stringArray) {
        block9: {
            block10: {
                block8: {
                    Object var4_8;
                    block7: {
                        var4_8 = null;
                        context = context.getContentResolver().query(uri, new String[]{"_data"}, string2, stringArray, null);
                        if (context == null) break block7;
                        uri = context;
                        try {
                            if (!context.moveToFirst()) break block7;
                            uri = context;
                            string2 = context.getString(context.getColumnIndexOrThrow("_data"));
                        }
                        catch (Exception exception) {
                            break block8;
                        }
                        context.close();
                        return string2;
                    }
                    if (context == null) return null;
                    break block10;
                    catch (Throwable throwable) {
                        context = var4_8;
                        break block9;
                    }
                    catch (Exception exception) {
                        context = null;
                    }
                }
                uri = context;
                try {
                    FirebaseCrashlytics.getInstance().recordException((Throwable)string2);
                    if (context == null) return null;
                }
                catch (Throwable throwable) {
                    context = uri;
                    uri = throwable;
                }
            }
            context.close();
            return null;
        }
        if (context == null) throw uri;
        context.close();
        throw uri;
    }

    public static String getDateString(Calendar object, DateFormat dateFormat) {
        int n = 1.$SwitchMap$com$hintsolutions$raintv$utils$CommonUtils$DateFormat[dateFormat.ordinal()];
        dateFormat = n != 1 ? (n != 2 ? (n != 3 ? new SimpleDateFormat("yyyy-MM-dd") : new SimpleDateFormat("yyyy-MM-dd")) : new SimpleDateFormat("dd.MM.yyyy")) : new SimpleDateFormat("dd MMMM yyyy");
        try {
            object = dateFormat.format(object.getTime());
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String getDeviceInfo() {
        Object object;
        String string2;
        String string3;
        block9: {
            try {
                string3 = Build.MANUFACTURER.toUpperCase();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                string3 = "";
            }
            string2 = Build.MODEL;
            object = null;
            if (!string2.startsWith(string3)) break block9;
            string3 = string2;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            string3 = stringBuilder.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            string3 = object;
        }
        try {
            object = new StringBuilder();
            object.append(string3);
            object.append(" with Android v");
            object.append(Build.VERSION.SDK_INT);
            object = object.toString();
            string3 = object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = new StringBuilder();
            object.append(string3);
            object.append(" \n\u0412\u0435\u0440\u0441\u0438\u044f \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u044f: 2.11.2");
            object = object.toString();
            string3 = object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return string3;
    }

    public static String getDeviceUid(Context object) {
        try {
            object = Settings.Secure.getString((ContentResolver)object.getContentResolver(), (String)"android_id");
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String getDownloadedVideoFolderPath(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().getAbsolutePath());
        stringBuilder.append("/TvRain/Downloads/");
        return stringBuilder.toString();
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String getFilePath(Context object, Uri object2) {
        try {
            void var1_4;
            if (DocumentsContract.isDocumentUri((Context)object, (Uri)var1_4)) {
                void var1_12;
                boolean bl = CommonUtils.isExternalStorageDocument((Uri)var1_4);
                if (bl) {
                    String[] stringArray = DocumentsContract.getDocumentId((Uri)var1_4).split(":");
                    if (!"primary".equalsIgnoreCase(stringArray[0])) return null;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((Object)Environment.getExternalStorageDirectory());
                    stringBuilder.append("/");
                    stringBuilder.append(stringArray[1]);
                    return stringBuilder.toString();
                }
                if (CommonUtils.isDownloadsDocument((Uri)var1_4)) {
                    String string2 = DocumentsContract.getDocumentId((Uri)var1_4);
                    return CommonUtils.getDataColumn(object, ContentUris.withAppendedId((Uri)Uri.parse((String)"content://downloads/public_downloads"), (long)Long.valueOf((String)string2)), null, null);
                }
                if (!CommonUtils.isMediaDocument((Uri)var1_4)) return null;
                String[] stringArray = DocumentsContract.getDocumentId((Uri)var1_4).split(":");
                String string3 = stringArray[0];
                if ("image".equals((Object)string3)) {
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    return CommonUtils.getDataColumn(object, (Uri)var1_12, "_id=?", new String[]{stringArray[1]});
                } else if ("video".equals((Object)string3)) {
                    Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    return CommonUtils.getDataColumn(object, (Uri)var1_12, "_id=?", new String[]{stringArray[1]});
                } else if ("audio".equals((Object)string3)) {
                    Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    return CommonUtils.getDataColumn(object, (Uri)var1_12, "_id=?", new String[]{stringArray[1]});
                } else {
                    Object var1_11 = null;
                }
                return CommonUtils.getDataColumn(object, (Uri)var1_12, "_id=?", new String[]{stringArray[1]});
            }
            if ("content".equalsIgnoreCase(var1_4.getScheme())) {
                return CommonUtils.getDataColumn(object, (Uri)var1_4, null, null);
            }
            if (!"file".equalsIgnoreCase(var1_4.getScheme())) return null;
            return var1_4.getPath();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
        }
        return null;
    }

    public static String getFullDownloadedVideoPath(Context context, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CommonUtils.getDownloadedVideoFolderPath(context));
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String getFullVideoPath(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CommonUtils.getVideoFolderPath());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static SpannableStringBuilder getSpannableString(Context context, String string2) {
        context = Typeface.createFromAsset((AssetManager)context.getAssets(), (String)"fonts/rouble.ttf");
        string2 = new SpannableStringBuilder((CharSequence)string2);
        for (int j = 0; j < string2.length(); ++j) {
            try {
                if (string2.charAt(j) != '\u20bd') continue;
                CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan((Typeface)context);
                string2.setSpan((Object)customTypefaceSpan, j, j + 1, 0);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return string2;
    }

    public static String getStringFromEditText(EditText editText) {
        if (editText != null && editText.getText() != null) {
            return editText.getText().toString();
        }
        return "";
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String getTimezoneString() {
        int n = TimeZone.getDefault().getRawOffset();
        StringBuilder stringBuilder = new StringBuilder(TimeZone.getDefault().getDisplayName());
        String string2 = n >= 0 ? "+" : "-";
        {
            catch (Exception exception) {
                exception.printStackTrace();
                return TimeZone.getDefault().getDisplayName();
            }
        }
        try {
            string2 = String.format((String)"GMT%s%02d%02d", (Object[])new Object[]{string2, n / 3600000, n / 60000 % 60});
            stringBuilder.append(" (");
            stringBuilder.append(string2);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return stringBuilder.toString();
        }
    }

    public static String getVideoFolderPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_MOVIES).getAbsolutePath());
        stringBuilder.append("/TvRain/");
        return stringBuilder.toString();
    }

    public static boolean isDownloadsDocument(Uri uri) {
        boolean bl = uri != null && "com.android.providers.downloads.documents".equals((Object)uri.getAuthority());
        return bl;
    }

    public static boolean isEditTextEmpty(EditText editText) {
        return TextUtils.isEmpty((CharSequence)CommonUtils.getStringFromEditText(editText));
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        boolean bl = uri != null && "com.android.externalstorage.documents".equals((Object)uri.getAuthority());
        return bl;
    }

    public static boolean isMediaDocument(Uri uri) {
        boolean bl = uri != null && "com.android.providers.media.documents".equals((Object)uri.getAuthority());
        return bl;
    }

    public static String repeatString(String string2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < n; ++j) {
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static final class DateFormat
    extends Enum<DateFormat> {
        private static final DateFormat[] $VALUES;
        public static final /* enum */ DateFormat SERVER;
        public static final /* enum */ DateFormat VIEW;
        public static final /* enum */ DateFormat VIEW_FULL_MONTH;

        static {
            DateFormat dateFormat;
            DateFormat dateFormat2;
            DateFormat dateFormat3;
            VIEW = dateFormat3 = new DateFormat();
            SERVER = dateFormat2 = new DateFormat();
            VIEW_FULL_MONTH = dateFormat = new DateFormat();
            $VALUES = new DateFormat[]{dateFormat3, dateFormat2, dateFormat};
        }

        public static DateFormat valueOf(String string2) {
            return (DateFormat)Enum.valueOf(DateFormat.class, (String)string2);
        }

        public static DateFormat[] values() {
            return (DateFormat[])$VALUES.clone();
        }
    }
}

