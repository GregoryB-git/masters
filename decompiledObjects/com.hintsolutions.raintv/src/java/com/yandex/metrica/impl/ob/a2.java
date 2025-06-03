/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2$a
 *  com.yandex.metrica.networktasks.api.NetworkTask$ShouldTryNextHostCondition
 *  java.io.Closeable
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.util.AbstractMap$SimpleEntry
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeSet
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Zm;
import com.yandex.metrica.impl.ob.bm;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public final class A2 {
    private static final Zm a = new Zm();

    public static double a(double d2, double d3) {
        double d4;
        block3: {
            block2: {
                if (Double.isNaN((double)d2)) break block2;
                d4 = d2;
                if (!Double.isInfinite((double)d2)) break block3;
            }
            d4 = d3;
        }
        return d4;
    }

    public static NetworkTask.ShouldTryNextHostCondition a() {
        return new a();
    }

    @Nullable
    public static <T, S> S a(@NonNull bm<T, S> object, @NonNull Context context, @NonNull String string, @NonNull String string2, @NonNull String string3) {
        try {
            object = A2.a(object, context.getSystemService(string));
        }
        catch (Throwable throwable) {
            return null;
        }
        return (S)object;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static Object a(@NonNull bm bm2, @Nullable Object object) {
        void var1_3;
        if (var1_3 == null) return null;
        try {
            return bm2.a(var1_3);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static String a(Context object, String string) {
        try {
            object = object.getPackageManager().getPackageInfo(string, 0);
        }
        catch (Throwable throwable) {
            object = null;
        }
        object = object == null ? "0.0" : object.versionName;
        return object;
    }

    @NonNull
    public static String a(@Nullable String string) {
        if (!TextUtils.isEmpty((CharSequence)string) && string.length() == 36) {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.replace(8, string.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
            string = stringBuilder.toString();
        } else {
            string = "";
        }
        return string;
    }

    @Nullable
    public static String a(@Nullable String string, int n2) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (string.length() > n2) {
            string2 = string.substring(0, n2);
        }
        return string2;
    }

    @NonNull
    public static BigDecimal a(long l2) {
        return new BigDecimal(l2).divide(new BigDecimal(1000000), 6, 6);
    }

    @Nullable
    public static <T> List<T> a(@Nullable Collection<T> object) {
        object = object == null ? null : new ArrayList(object);
        return object;
    }

    @Nullable
    public static <K, V> List<Map.Entry<K, V>> a(@Nullable Map<K, V> iterator) {
        if (iterator == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iterator.size());
        iterator = iterator.entrySet().iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)new AbstractMap.SimpleEntry((Map.Entry)iterator.next()));
        }
        return arrayList;
    }

    @NonNull
    public static List<String> a(String ... stringArray) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll((Collection)treeSet, (Object[])stringArray);
        return A2.c(treeSet);
    }

    @NonNull
    public static <K, V> Map<K, V> a(@Nullable List<Map.Entry<K, V>> iterator) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iterator != null) {
            for (Map.Entry entry : iterator) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NonNull
    public static Set<Integer> a(@NonNull int[] nArray) {
        HashSet hashSet = new HashSet();
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            hashSet.add((Object)nArray[i2]);
        }
        return hashSet;
    }

    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) return;
        try {
            sQLiteDatabase.endTransaction();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean a(int n2) {
        boolean bl = Build.VERSION.SDK_INT >= n2;
        return bl;
    }

    public static boolean a(Object object) {
        boolean bl = object != null;
        return bl;
    }

    public static boolean a(Object object, Object object2) {
        if (object == null && object2 == null) {
            return true;
        }
        if (object != null && object2 != null) {
            return object.equals(object2);
        }
        return false;
    }

    public static boolean a(@Nullable byte[] byArray) {
        boolean bl = byArray == null || byArray.length == 0;
        return bl;
    }

    public static int b(Context context, String string) {
        int n2 = 0;
        try {
            context = context.getPackageManager().getPackageInfo(string, 0);
        }
        catch (Throwable throwable) {
            context = null;
        }
        if (context != null) {
            n2 = context.versionCode;
        }
        return n2;
    }

    public static boolean b(int n2) {
        boolean bl = n2 == 400;
        return bl;
    }

    public static boolean b(Collection collection) {
        boolean bl = collection == null || collection.size() == 0;
        return bl;
    }

    public static boolean b(Map map) {
        boolean bl = map == null || map.size() == 0;
        return bl;
    }

    @NonNull
    public static <T> List<T> c(@NonNull Collection<T> collection) {
        return Collections.unmodifiableList((List)new ArrayList(collection));
    }

    @Nullable
    public static <K, V> Map<K, V> c(@Nullable Map<K, V> object) {
        object = object == null ? null : new HashMap(object);
        return object;
    }

    @NonNull
    public static <K, V> Map<K, V> d(@NonNull Map<K, V> map) {
        return Collections.unmodifiableMap((Map)new HashMap(map));
    }

    @NonNull
    public static <K, V> Map<K, V> e(@NonNull Map<K, V> map) {
        return Collections.unmodifiableMap((Map)new LinkedHashMap(map));
    }
}

