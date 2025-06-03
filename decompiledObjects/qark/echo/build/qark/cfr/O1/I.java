/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.EnumSet
 */
package O1;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class I
extends Enum {
    public static final a p;
    public static final EnumSet q;
    public static final /* enum */ I r;
    public static final /* enum */ I s;
    public static final /* enum */ I t;
    public static final /* synthetic */ I[] u;
    public final long o;

    static {
        r = new I(0L);
        s = new I(1L);
        t = new I(2L);
        u = I.c();
        p = new a(null);
        EnumSet enumSet = EnumSet.allOf(I.class);
        Intrinsics.checkNotNullExpressionValue((Object)enumSet, "allOf(SmartLoginOption::class.java)");
        q = enumSet;
    }

    public I(long l8) {
        this.o = l8;
    }

    public static final /* synthetic */ I[] c() {
        return new I[]{r, s, t};
    }

    public static I valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (I)Enum.valueOf(I.class, (String)string2);
    }

    public static I[] values() {
        I[] arri = u;
        return (I[])Arrays.copyOf((Object[])arri, (int)arri.length);
    }

    public final long h() {
        return this.o;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final EnumSet a(long l8) {
            EnumSet enumSet = EnumSet.noneOf(I.class);
            for (I i8 : q) {
                if ((i8.h() & l8) == 0L) continue;
                enumSet.add((Object)i8);
            }
            Intrinsics.checkNotNullExpressionValue((Object)enumSet, "result");
            return enumSet;
        }
    }

}

