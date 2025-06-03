/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.yandex.metrica.billing_interface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c {
    private static final Pattern c = Pattern.compile((String)"P(\\d+)(\\S+)");
    public final int a;
    @NonNull
    public final a b;

    public c(int n, @NonNull a a2) {
        this.a = n;
        this.b = a2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static c a(@NonNull String object) {
        Matcher matcher = c.matcher((CharSequence)object);
        if (!matcher.find()) return null;
        String string2 = matcher.group(1);
        String string3 = matcher.group(2);
        if (string2 == null) return null;
        if (string3 == null) return null;
        try {
            void var0_7;
            int n = Integer.parseInt((String)string2);
            char c3 = string3.charAt(0);
            if (c3 != 'D') {
                if (c3 != 'M') {
                    if (c3 != 'W') {
                        if (c3 != 'Y') {
                            a a2 = com.yandex.metrica.billing_interface.c$a.a;
                            return new c(n, (a)var0_7);
                        } else {
                            a a3 = com.yandex.metrica.billing_interface.c$a.e;
                        }
                        return new c(n, (a)var0_7);
                    }
                    a a4 = com.yandex.metrica.billing_interface.c$a.c;
                    return new c(n, (a)var0_7);
                }
                a a5 = com.yandex.metrica.billing_interface.c$a.d;
                return new c(n, (a)var0_7);
            }
            a a6 = com.yandex.metrica.billing_interface.c$a.b;
            return new c(n, (a)var0_7);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.a != ((c)object).a) {
                return false;
            }
            return this.b == ((c)object).b;
        }
        return false;
    }

    public int hashCode() {
        int n = this.a;
        return this.b.hashCode() + (n + 0) * 31;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("Period{number=");
        stringBuilder.append(this.a);
        stringBuilder.append("timeUnit=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
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
            a a4;
            a a5;
            a a6;
            a = a6 = new a();
            b = a5 = new a();
            c = a4 = new a();
            d = a3 = new a();
            e = a2 = new a();
            f = new a[]{a6, a5, a4, a3, a2};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }
}

