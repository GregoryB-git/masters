/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.WeakHashMap
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

public class r {
    @NonNull
    private final WeakHashMap<Activity, a> a = new WeakHashMap();

    public boolean a(@Nullable Activity activity, @NonNull a a2) {
        if (activity != null && this.a.get((Object)activity) == a2) {
            return false;
        }
        if (activity != null) {
            this.a.put((Object)activity, (Object)a2);
        }
        return true;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        private static final a[] d;

        static {
            a a2;
            a a3;
            a a5;
            a = a5 = new a();
            b = a3 = new a();
            c = a2 = new a();
            d = new a[]{a5, a3, a2};
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])d.clone();
        }
    }
}

