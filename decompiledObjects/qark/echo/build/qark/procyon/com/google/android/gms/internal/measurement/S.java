// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class S extends A
{
    public S() {
        super.a.add(Z.p);
        super.a.add(Z.K);
        super.a.add(Z.h0);
        super.a.add(Z.i0);
        super.a.add(Z.j0);
        super.a.add(Z.p0);
        super.a.add(Z.q0);
        super.a.add(Z.s0);
        super.a.add(Z.t0);
        super.a.add(Z.w0);
    }
    
    @Override
    public final s b(String g, final f3 f3, final List list) {
        switch (V.a[C2.c(g).ordinal()]) {
            default: {
                return super.a(g);
            }
            case 10: {
                C2.f(Z.w0, 2, list);
                return new k(f3.b(list.get(0)).f() + new k(f3.b(list.get(1)).f() * -1.0).f());
            }
            case 8:
            case 9: {
                C2.g(g, 1, list);
                return f3.b(list.get(0));
            }
            case 6:
            case 7: {
                C2.g(g, 2, list);
                final s b = f3.b(list.get(0));
                f3.b(list.get(1));
                return b;
            }
            case 5: {
                C2.f(Z.j0, 1, list);
                return new k(f3.b(list.get(0)).f() * -1.0);
            }
            case 4: {
                C2.f(Z.i0, 2, list);
                return new k(f3.b(list.get(0)).f() * f3.b(list.get(1)).f());
            }
            case 3: {
                C2.f(Z.h0, 2, list);
                return new k(f3.b(list.get(0)).f() % f3.b(list.get(1)).f());
            }
            case 2: {
                C2.f(Z.K, 2, list);
                return new k(f3.b(list.get(0)).f() / f3.b(list.get(1)).f());
            }
            case 1: {
                C2.f(Z.p, 2, list);
                final s b2 = f3.b(list.get(0));
                final s b3 = f3.b(list.get(1));
                if (!(b2 instanceof m) && !(b2 instanceof u) && !(b3 instanceof m) && !(b3 instanceof u)) {
                    return new k(b2.f() + b3.f());
                }
                g = b2.g();
                final String g2 = b3.g();
                final StringBuilder sb = new StringBuilder();
                sb.append(g);
                sb.append(g2);
                return new u(sb.toString());
            }
        }
    }
}
