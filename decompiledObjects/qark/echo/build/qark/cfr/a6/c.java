/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Enum
 *  java.lang.Object
 */
package a6;

import W5.c;
import W5.g;
import a6.a;
import a6.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class c
extends W5.c
implements a,
Serializable {
    public final Enum[] p;

    public c(Enum[] arrenum) {
        Intrinsics.checkNotNullParameter(arrenum, "entries");
        this.p = arrenum;
    }

    private final Object writeReplace() {
        return new d(this.p);
    }

    @Override
    public int a() {
        return this.p.length;
    }

    public boolean d(Enum enum_) {
        Intrinsics.checkNotNullParameter(enum_, "element");
        if ((Enum)g.l(this.p, enum_.ordinal()) == enum_) {
            return true;
        }
        return false;
    }

    public Enum f(int n8) {
        W5.c.o.a(n8, this.p.length);
        return this.p[n8];
    }

    public int g(Enum enum_) {
        Intrinsics.checkNotNullParameter(enum_, "element");
        int n8 = enum_.ordinal();
        if ((Enum)g.l(this.p, n8) == enum_) {
            return n8;
        }
        return -1;
    }

    public int i(Enum enum_) {
        Intrinsics.checkNotNullParameter(enum_, "element");
        return this.indexOf(enum_);
    }
}

