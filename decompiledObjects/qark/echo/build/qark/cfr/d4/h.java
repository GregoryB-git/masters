/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 */
package d4;

import V3.k;
import d4.b;
import d4.j;
import d4.m;
import d4.n;
import d4.p;
import d4.u;
import java.util.Comparator;

public abstract class h
implements Comparator {
    public static h b(String string2) {
        if (string2.equals((Object)".value")) {
            return u.j();
        }
        if (string2.equals((Object)".key")) {
            return j.j();
        }
        if (!string2.equals((Object)".priority")) {
            return new p(new k(string2));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public int a(m m8, m m9, boolean bl) {
        if (bl) {
            return this.compare((Object)m9, (Object)m8);
        }
        return this.compare((Object)m8, (Object)m9);
    }

    public abstract String c();

    public boolean d(n n8, n n9) {
        if (this.compare((Object)new m(b.n(), n8), (Object)new m(b.n(), n9)) != 0) {
            return true;
        }
        return false;
    }

    public abstract boolean e(n var1);

    public abstract m f(b var1, n var2);

    public abstract m g();

    public m h() {
        return m.b();
    }
}

