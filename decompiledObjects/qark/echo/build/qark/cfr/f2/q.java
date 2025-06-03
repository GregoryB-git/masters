/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package f2;

import c2.b;
import c2.e;
import c2.f;
import c2.g;
import f2.p;
import f2.s;
import f2.t;
import java.util.Set;

public final class q
implements g {
    public final Set a;
    public final p b;
    public final t c;

    public q(Set set, p p8, t t8) {
        this.a = set;
        this.b = p8;
        this.c = t8;
    }

    @Override
    public f a(String string2, Class class_, b b8, e e8) {
        if (this.a.contains((Object)b8)) {
            return new s(this.b, string2, b8, e8, this.c);
        }
        throw new IllegalArgumentException(String.format((String)"%s is not supported byt this factory. Supported encodings are: %s.", (Object[])new Object[]{b8, this.a}));
    }
}

