/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Kl
 *  com.yandex.metrica.impl.ob.j3
 *  com.yandex.metrica.impl.ob.k3$a
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Map
 *  java.util.TreeMap
 */
package com.yandex.metrica.impl.ob;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Kl;
import com.yandex.metrica.impl.ob.Ol;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.Yl;
import com.yandex.metrica.impl.ob.j3;
import com.yandex.metrica.impl.ob.k3;
import com.yandex.metrica.impl.ob.r6;
import com.yandex.metrica.impl.ob.z6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class k3 {
    private final c a;
    private final Yl<Thread, StackTraceElement[], z6> b;
    private final Ol c;

    public k3() {
        this((c)new a(), (Yl<Thread, StackTraceElement[], z6>)new j3(), P.g().j());
    }

    @VisibleForTesting
    public k3(@NonNull c c3, @NonNull Yl<Thread, StackTraceElement[], z6> yl2, @NonNull Ol ol2) {
        this.a = c3;
        this.b = yl2;
        this.c = ol2;
    }

    private List<z6> a(@NonNull Thread thread, @Nullable Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap((Comparator)new Comparator<Thread>(this){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public int compare(Object object, Object object2) {
                Thread thread = (Thread)object;
                if (thread == (object = (Thread)object2)) return 0;
                object2 = thread.getName();
                object = object.getName();
                if (object2 == null) {
                    if (object != null) return -1;
                    return 0;
                }
                if (object != null) return object2.compareTo((String)object);
                return 1;
            }
        });
        try {
            ((a)this.a).getClass();
            map = Thread.getAllStackTraces();
        }
        catch (SecurityException securityException) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove((Object)thread2);
        }
        for (StackTraceElement[] stackTraceElementArray : treeMap.entrySet()) {
            map = (Thread)stackTraceElementArray.getKey();
            if (map == thread || map == thread2) continue;
            stackTraceElementArray = (StackTraceElement[])stackTraceElementArray.getValue();
            arrayList.add((Object)this.b.a((Thread)map, stackTraceElementArray));
        }
        return arrayList;
    }

    public r6 a() {
        StackTraceElement[] stackTraceElementArray;
        ((a)this.a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTraceElementArray = thread.getStackTrace();
        }
        catch (SecurityException securityException) {
            stackTraceElementArray = null;
        }
        return new r6(this.b.a(thread, stackTraceElementArray), this.a(thread, null), ((Kl)this.c).b());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<z6> a(@Nullable Thread object) {
        ((a)this.a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        List<z6> list = this.a(thread, (Thread)object);
        if (object != thread) {
            void var1_4;
            Object var1_2 = null;
            try {
                StackTraceElement[] stackTraceElementArray;
                StackTraceElement[] stackTraceElementArray2 = stackTraceElementArray = thread.getStackTrace();
            }
            catch (SecurityException securityException) {}
            z6 z62 = this.b.a(thread, (StackTraceElement[])var1_4);
            ((ArrayList)list).add(0, (Object)z62);
        }
        return list;
    }

    public static interface c {
    }
}

