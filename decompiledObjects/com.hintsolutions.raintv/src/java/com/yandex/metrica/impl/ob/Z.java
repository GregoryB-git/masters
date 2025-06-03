/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;

public class z {
    @Nullable
    public final a a;
    @Nullable
    public final Boolean b;

    public z(@Nullable a a2, @Nullable Boolean bl) {
        this.a = a2;
        this.b = bl;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && z.class == object.getClass()) {
            object = (z)object;
            if (this.a != ((z)object).a) {
                return false;
            }
            Boolean bl2 = this.b;
            if (bl2 != null) {
                bl = bl2.equals((Object)((z)object).b);
            } else if (((z)object).b != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        a a2 = this.a;
        int n7 = 0;
        int n8 = a2 != null ? a2.hashCode() : 0;
        a2 = this.b;
        if (a2 != null) {
            n7 = a2.hashCode();
        }
        return n8 * 31 + n7;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        public static final /* enum */ a e;
        private static final a[] f;

        static {
            a a2;
            a a3;
            a a7;
            a a9;
            a a10;
            a = a10 = new a();
            b = a9 = new a();
            c = a7 = new a();
            d = a3 = new a();
            e = a2 = new a();
            f = new a[]{a10, a9, a7, a3, a2};
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }
}

