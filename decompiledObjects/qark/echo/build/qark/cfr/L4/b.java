/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package L4;

import L4.a;
import N4.i;
import c2.c;
import c2.e;
import c2.f;
import c2.g;

public final class b {
    public static final F4.a d = F4.a.e();
    public final String a;
    public final r4.b b;
    public f c;

    public b(r4.b b8, String string2) {
        this.a = string2;
        this.b = b8;
    }

    public final boolean a() {
        if (this.c == null) {
            g g8 = (g)this.b.get();
            if (g8 != null) {
                this.c = g8.a(this.a, i.class, c2.b.b("proto"), new a());
            } else {
                d.j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public void b(i i8) {
        if (!this.a()) {
            d.j("Unable to dispatch event because Flg Transport is not available");
            return;
        }
        this.c.b(c.d(i8));
    }
}

