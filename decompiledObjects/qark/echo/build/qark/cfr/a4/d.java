/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a4;

import Q3.b;
import V3.h;
import V3.k;
import a4.e;

public class d
implements e {
    public final e.a a;
    public final h b;
    public final b c;
    public final String d;

    public d(e.a a8, h h8, b b8, String string2) {
        this.a = a8;
        this.b = h8;
        this.c = b8;
        this.d = string2;
    }

    @Override
    public void a() {
        this.b.d(this);
    }

    public e.a b() {
        return this.a;
    }

    public k c() {
        k k8 = this.c.g().s();
        if (this.a == e.a.s) {
            return k8;
        }
        return k8.a0();
    }

    public String d() {
        return this.d;
    }

    public b e() {
        return this.c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder;
        if (this.a == e.a.s) {
            stringBuilder = new StringBuilder();
            stringBuilder.append((Object)this.c());
            stringBuilder.append(": ");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(": ");
            stringBuilder.append(this.c.i(true));
            do {
                return stringBuilder.toString();
                break;
            } while (true);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.c());
        stringBuilder.append(": ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(": { ");
        stringBuilder.append(this.c.e());
        stringBuilder.append(": ");
        stringBuilder.append(this.c.i(true));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

