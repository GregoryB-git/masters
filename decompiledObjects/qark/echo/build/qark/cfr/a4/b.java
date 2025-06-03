/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a4;

import Q3.c;
import V3.h;
import V3.k;
import a4.e;

public class b
implements e {
    public final k a;
    public final h b;
    public final c c;

    public b(h h8, c c8, k k8) {
        this.b = h8;
        this.a = k8;
        this.c = c8;
    }

    @Override
    public void a() {
        this.b.c(this.c);
    }

    public k b() {
        return this.a;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.b());
        stringBuilder.append(":CANCEL");
        return stringBuilder.toString();
    }
}

