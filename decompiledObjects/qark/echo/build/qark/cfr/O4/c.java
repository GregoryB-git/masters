/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Set
 */
package O4;

import B3.c;
import B3.e;
import B3.h;
import B3.r;
import O4.b;
import O4.d;
import O4.f;
import O4.i;
import java.util.Iterator;
import java.util.Set;

public class c
implements i {
    public final String a;
    public final d b;

    public c(Set set, d d8) {
        this.a = c.e(set);
        this.b = d8;
    }

    public static /* synthetic */ i b(e e8) {
        return c.d(e8);
    }

    public static B3.c c() {
        return B3.c.e(i.class).b(r.n(f.class)).f(new b()).d();
    }

    public static /* synthetic */ i d(e e8) {
        return new c(e8.c(f.class), d.a());
    }

    public static String e(Set set) {
        StringBuilder stringBuilder = new StringBuilder();
        set = set.iterator();
        while (set.hasNext()) {
            f f8 = (f)set.next();
            stringBuilder.append(f8.b());
            stringBuilder.append('/');
            stringBuilder.append(f8.c());
            if (!set.hasNext()) continue;
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    @Override
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(' ');
        stringBuilder.append(c.e(this.b.b()));
        return stringBuilder.toString();
    }
}

