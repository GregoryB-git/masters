/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.W6;

public class w7 {
    private static final w7 c = new w7(new W6());
    @NonNull
    private final W6 a;
    private a b = com.yandex.metrica.impl.ob.w7$a.a;

    @VisibleForTesting
    public w7(@NonNull W6 w62) {
        this.a = w62;
    }

    public static w7 a() {
        return c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b() {
        w7 w72 = this;
        synchronized (w72) {
            Object object = this.b;
            a a2 = com.yandex.metrica.impl.ob.w7$a.c;
            if (object == a2) {
                return true;
            }
            a a3 = com.yandex.metrica.impl.ob.w7$a.b;
            if (object == a3) {
                return false;
            }
            try {
                object = this.a;
                object.getClass();
                System.loadLibrary((String)"appmetrica-service-native");
                this.b = a2;
                return true;
            }
            catch (Throwable throwable) {
                this.b = com.yandex.metrica.impl.ob.w7$a.b;
                return false;
            }
        }
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
            a a7;
            a = a7 = new a();
            b = a3 = new a();
            c = a2 = new a();
            d = new a[]{a7, a3, a2};
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])d.clone();
        }
    }
}

