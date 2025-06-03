/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.tc;
import com.yandex.metrica.impl.ob.w;

public class hc {
    @NonNull
    public final fc a;
    @NonNull
    public final tc b;

    public hc(@NonNull fc fc2, @NonNull tc tc2) {
        this.a = fc2;
        this.b = tc2;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("LocationCollectionConfig{arguments=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", preconditions=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a b;
        @Deprecated
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        public static final /* enum */ a e;
        private static final a[] f;
        private final String a;

        static {
            a a2;
            a a3;
            a a5;
            a a7;
            b = a7 = new a("unknown");
            c = a5 = new a("fg");
            d = a3 = new a("bg");
            e = a2 = new a("visible");
            f = new a[]{a7, a5, a3, a2};
        }

        private a(String string2) {
            this.a = string2;
        }

        @NonNull
        public static a a(@Nullable w.a a2) {
            a a3;
            a a5 = a3 = b;
            if (a2 != null) {
                int n4 = a2.ordinal();
                a5 = n4 != 1 ? (n4 != 2 ? a3 : e) : d;
            }
            return a5;
        }

        @NonNull
        public static a a(@Nullable String string) {
            a a2 = b;
            a[] aArray = com.yandex.metrica.impl.ob.hc$a.values();
            for (int i3 = 0; i3 < 4; ++i3) {
                a a3 = aArray[i3];
                if (!a3.a.equals((Object)string)) continue;
                a2 = a3;
            }
            return a2;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }

        @NonNull
        public String a() {
            return this.a;
        }

        @NonNull
        public String toString() {
            return this.a;
        }
    }
}

