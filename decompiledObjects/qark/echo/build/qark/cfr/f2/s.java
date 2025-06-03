/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package f2;

import c2.b;
import c2.c;
import c2.e;
import c2.f;
import c2.h;
import f2.o;
import f2.p;
import f2.r;
import f2.t;

public final class s
implements f {
    public final p a;
    public final String b;
    public final b c;
    public final e d;
    public final t e;

    public s(p p8, String string2, b b8, e e8, t t8) {
        this.a = p8;
        this.b = string2;
        this.c = b8;
        this.d = e8;
        this.e = t8;
    }

    public static /* synthetic */ void c(Exception exception) {
        s.e(exception);
    }

    public static /* synthetic */ void e(Exception exception) {
    }

    @Override
    public void a(c c8, h h8) {
        this.e.a(o.a().e(this.a).c(c8).f(this.b).d(this.d).b(this.c).a(), h8);
    }

    @Override
    public void b(c c8) {
        this.a(c8, new r());
    }

    public p d() {
        return this.a;
    }
}

