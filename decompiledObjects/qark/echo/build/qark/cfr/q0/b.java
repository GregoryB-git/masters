/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package q0;

import F0.L;
import F0.r;
import F0.s;
import F0.t;
import Y0.f;
import Z0.h;
import c1.t;
import d0.q;
import g0.E;
import g0.a;
import l1.J;
import l1.e;
import q0.k;
import q0.w;

public final class b
implements k {
    public static final L f = new L();
    public final r a;
    public final q b;
    public final E c;
    public final t.a d;
    public final boolean e;

    public b(r r8, q q8, E e8, t.a a8, boolean bl) {
        this.a = r8;
        this.b = q8;
        this.c = e8;
        this.d = a8;
        this.e = bl;
    }

    @Override
    public boolean a() {
        r r8 = this.a.d();
        if (!(r8 instanceof l1.h || r8 instanceof l1.b || r8 instanceof e || r8 instanceof f)) {
            return false;
        }
        return true;
    }

    @Override
    public void b(t t8) {
        this.a.b(t8);
    }

    @Override
    public boolean c(s s8) {
        if (this.a.i(s8, f) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void d() {
        this.a.a(0L, 0L);
    }

    @Override
    public boolean e() {
        r r8 = this.a.d();
        if (!(r8 instanceof J) && !(r8 instanceof h)) {
            return false;
        }
        return true;
    }

    @Override
    public k f() {
        Object object;
        block9 : {
            block5 : {
                block8 : {
                    block7 : {
                        block6 : {
                            block4 : {
                                boolean bl = this.e();
                                boolean bl2 = true;
                                a.f(bl ^ true);
                                if (this.a.d() != this.a) {
                                    bl2 = false;
                                }
                                object = new StringBuilder();
                                object.append("Can't recreate wrapped extractors. Outer type: ");
                                object.append((Object)this.a.getClass());
                                a.g(bl2, object.toString());
                                object = this.a;
                                if (!(object instanceof w)) break block4;
                                object = new w(this.b.d, this.c, this.d, this.e);
                                break block5;
                            }
                            if (!(object instanceof l1.h)) break block6;
                            object = new l1.h();
                            break block5;
                        }
                        if (!(object instanceof l1.b)) break block7;
                        object = new l1.b();
                        break block5;
                    }
                    if (!(object instanceof e)) break block8;
                    object = new e();
                    break block5;
                }
                if (!(object instanceof f)) break block9;
                object = new f();
            }
            return new b((r)object, this.b, this.c, this.d, this.e);
        }
        object = new StringBuilder();
        object.append("Unexpected extractor type for recreation: ");
        object.append(this.a.getClass().getSimpleName());
        throw new IllegalStateException(object.toString());
    }
}

