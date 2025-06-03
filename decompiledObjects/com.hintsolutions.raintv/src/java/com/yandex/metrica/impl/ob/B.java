/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Sl
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  kotlin.io.FilesKt
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.g;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Sl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.io.FilesKt;
import org.json.JSONObject;

public class b {
    public static long a() {
        return Sl.c().a();
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String string) {
        long l3;
        block9: {
            block8: {
                StringBuilder stringBuilder;
                SQLiteDatabase sQLiteDatabase2;
                SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2 = null;
                sQLiteDatabase3 = sQLiteDatabase2;
                try {
                    stringBuilder = new StringBuilder();
                    sQLiteDatabase3 = sQLiteDatabase2;
                }
                catch (Throwable throwable) {
                    A2.a(sQLiteDatabase3);
                    throw throwable;
                }
                stringBuilder.append("SELECT count() FROM ");
                sQLiteDatabase3 = sQLiteDatabase2;
                stringBuilder.append(string);
                sQLiteDatabase3 = sQLiteDatabase2;
                sQLiteDatabase3 = sQLiteDatabase = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
                if (!sQLiteDatabase.moveToFirst()) break block8;
                sQLiteDatabase3 = sQLiteDatabase;
                l3 = sQLiteDatabase.getLong(0);
                break block9;
            }
            l3 = 0L;
        }
        A2.a((Cursor)sQLiteDatabase);
        return l3;
    }

    public static SharedPreferences a(Context context, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(string);
        return context.getSharedPreferences(stringBuilder.toString(), 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g a(String string) {
        g g3 = new g();
        if (TextUtils.isEmpty((CharSequence)string)) return g3;
        try {
            JSONObject jSONObject = new JSONObject(string);
            g3.b(jSONObject.optString("UserInfo.UserId", null));
            g3.a(jSONObject.optString("UserInfo.Type", null));
            g3.a((Map<String, String>)Gl.b(jSONObject.optJSONObject("UserInfo.Options")));
        }
        finally {
            return g3;
        }
    }

    public static String a(@NonNull Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append("-crashpad_new_crash_socket");
        return stringBuilder.toString();
    }

    public static String a(String string, String string2) {
        String string3 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string3 = string2;
        }
        return string3;
    }

    public static String a(@NonNull byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte by : byArray) {
            stringBuilder.append("0123456789abcdef".charAt((by & 0xF0) >> 4));
            stringBuilder.append("0123456789abcdef".charAt(by & 0xF));
        }
        return stringBuilder.toString();
    }

    @NonNull
    public static List<Integer> a(@NonNull int[] nArray) {
        ArrayList arrayList = new ArrayList(nArray.length);
        int n2 = nArray.length;
        for (int i6 = 0; i6 < n2; ++i6) {
            arrayList.add((Object)nArray[i6]);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(SharedPreferences sharedPreferences, String string, int n2) {
        if (sharedPreferences == null) return;
        if (!sharedPreferences.contains(string)) return;
        try {
            long l3 = sharedPreferences.getInt(string, n2);
            sharedPreferences.edit().remove(string).putLong(string, l3).apply();
            return;
        }
        catch (ClassCastException classCastException) {
            return;
        }
    }

    public static void a(Cursor cursor, ContentValues contentValues) {
        String[] stringArray = cursor.getColumnNames();
        int n2 = stringArray.length;
        for (int i6 = 0; i6 < n2; ++i6) {
            int n3 = cursor.getType(i6);
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                contentValues.put(stringArray[i6], cursor.getString(i6));
                                continue;
                            }
                            contentValues.put(stringArray[i6], cursor.getBlob(i6));
                            continue;
                        }
                        contentValues.put(stringArray[i6], cursor.getString(i6));
                        continue;
                    }
                    contentValues.put(stringArray[i6], Double.valueOf((double)cursor.getDouble(i6)));
                    continue;
                }
                contentValues.put(stringArray[i6], Long.valueOf((long)cursor.getLong(i6)));
                continue;
            }
            contentValues.put(stringArray[i6], cursor.getString(i6));
        }
    }

    public static boolean a(@NonNull File file, @NonNull File file2) {
        try {
            FilesKt.a((File)file, (File)file2);
            file.delete();
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public static boolean a(@Nullable Boolean bl) {
        return Boolean.TRUE.equals((Object)bl);
    }

    public static boolean a(@Nullable Collection<?> hashSet, @Nullable Collection<?> iterator) {
        if (hashSet == null && iterator == null) {
            return true;
        }
        if (hashSet != null && iterator != null && hashSet.size() == iterator.size()) {
            if (hashSet instanceof HashSet) {
                hashSet = hashSet;
            } else if (iterator instanceof HashSet) {
                HashSet hashSet2 = (HashSet)iterator;
                iterator = hashSet;
                hashSet = hashSet2;
            } else {
                hashSet = new HashSet((Collection)hashSet);
            }
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                if (hashSet.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @NonNull
    public static int[] a(@NonNull List<Integer> iterator) {
        int[] nArray = new int[iterator.size()];
        iterator = iterator.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            nArray[n2] = (Integer)iterator.next();
            ++n2;
        }
        return nArray;
    }

    public static boolean b(@Nullable String string, @Nullable String string2) {
        boolean bl = string == null && string2 == null ? true : (string != null && string2 != null ? string.equals((Object)string2) : false);
        return bl ^ true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] b(@Nullable String object) {
        if (object == null) return new byte[0];
        try {
            return object.getBytes("UTF-8");
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static Integer c(@Nullable String string) {
        if (string == null) return null;
        try {
            return Integer.valueOf((String)string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    @NonNull
    public static e d(@NonNull String string) {
        if ("inapp".equals((Object)string)) {
            return e.a;
        }
        if ("subs".equals((Object)string)) {
            return e.b;
        }
        return e.c;
    }

    @NonNull
    public static byte[] e(@Nullable String object) {
        object = object == null ? (Object)new byte[0] : (Object)object.getBytes();
        return object;
    }
}

