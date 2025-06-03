/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;

public class hi {
    @Nullable
    public final a a;
    @Nullable
    public final a b;

    public hi(@Nullable a a2, @Nullable a a3) {
        this.a = a2;
        this.b = a3;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ThrottlingConfig{cell=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", wifi=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class a {
        public final int a;
        public final long b;

        public a(int n4, long l5) {
            this.a = n4;
            this.b = l5;
        }

        public String toString() {
            StringBuilder stringBuilder = z2.t("Item{refreshEventCount=");
            stringBuilder.append(this.a);
            stringBuilder.append(", refreshPeriodSeconds=");
            return a.o(stringBuilder, this.b, '}');
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        private static final b[] c;

        static {
            b b2;
            b b3;
            a = b3 = new b();
            b = b2 = new b();
            c = new b[]{b3, b2};
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])c.clone();
        }
    }
}

