/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package H3;

import E3.f;
import H3.l;
import H3.y;
import M3.g;
import S4.b;

public class m
implements b {
    public final y a;
    public final l b;

    public m(y y8, g g8) {
        this.a = y8;
        this.b = new l(g8);
    }

    @Override
    public b.a a() {
        return b.a.o;
    }

    @Override
    public void b(b.b b8) {
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App Quality Sessions session changed: ");
        stringBuilder.append((Object)b8);
        f8.b(stringBuilder.toString());
        this.b.h(b8.a());
    }

    @Override
    public boolean c() {
        return this.a.d();
    }

    public String d(String string2) {
        return this.b.c(string2);
    }

    public void e(String string2) {
        this.b.i(string2);
    }
}

