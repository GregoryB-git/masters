/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class mn<D> {
    @NonNull
    public final a a;
    @Nullable
    public final D b;

    public mn(@NonNull a a2, @Nullable D d4) {
        this.a = a2;
        this.b = d4;
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

