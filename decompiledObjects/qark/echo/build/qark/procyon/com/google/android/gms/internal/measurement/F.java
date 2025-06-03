// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class F extends A
{
    public F() {
        super.a.add(Z.r);
        super.a.add(Z.A);
        super.a.add(Z.B);
        super.a.add(Z.C);
        super.a.add(Z.I);
        super.a.add(Z.E);
        super.a.add(Z.J);
        super.a.add(Z.O);
        super.a.add(Z.e0);
        super.a.add(Z.r0);
        super.a.add(Z.u0);
        super.a.add(Z.x0);
        super.a.add(Z.y0);
    }
    
    public static s c(final f3 f3, final List list) {
        C2.j(Z.O, 2, list);
        final s b = f3.b(list.get(0));
        final s b2 = f3.b(list.get(1));
        if (b2 instanceof g) {
            final List a0 = ((g)b2).a0();
            List<s> subList = new ArrayList<s>();
            if (list.size() > 2) {
                subList = list.subList(2, list.size());
            }
            return new t(b.g(), a0, subList, f3);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", ((g)b2).getClass().getCanonicalName()));
    }
    
    @Override
    public final s b(String e, final f3 f3, final List list) {
        final int n = I.a[C2.c(e).ordinal()];
        int i = 0;
        switch (n) {
            default: {
                return super.a(e);
            }
            case 13: {
                C2.f(Z.y0, 3, list);
                if (f3.b(list.get(0)).d()) {
                    return f3.b(list.get(1));
                }
                return f3.b(list.get(2));
            }
            case 12: {
                C2.f(Z.x0, 3, list);
                final s b = f3.b(list.get(0));
                final s b2 = f3.b(list.get(1));
                final s b3 = f3.b(list.get(2));
                if (!(b2 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(b3 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                final g g = (g)b2;
                final g g2 = (g)b3;
                int n2 = 0;
                while (i < g.U()) {
                    if (n2 != 0 || b.equals(f3.b(g.M(i)))) {
                        final s b4 = f3.b(g2.M(i));
                        if (b4 instanceof l) {
                            if (!((l)b4).b().equals("break")) {
                                return b4;
                            }
                            return s.d;
                        }
                        else {
                            n2 = 1;
                        }
                    }
                    ++i;
                }
                if (g.U() + 1 != g2.U()) {
                    return s.d;
                }
                final s b5 = f3.b(g2.M(g.U()));
                if (!(b5 instanceof l)) {
                    return s.d;
                }
                final String b6 = ((l)b5).b();
                if (b6.equals("return") || b6.equals("continue")) {
                    return b5;
                }
                return s.d;
            }
            case 11: {
                if (list.isEmpty()) {
                    return s.h;
                }
                C2.f(Z.u0, 1, list);
                return new l("return", f3.b(list.get(0)));
            }
            case 10: {
                return new g(list);
            }
            case 9: {
                C2.j(Z.e0, 2, list);
                final s b7 = f3.b(list.get(0));
                final s b8 = f3.b(list.get(1));
                s b9;
                if (list.size() > 2) {
                    b9 = f3.b(list.get(2));
                }
                else {
                    b9 = null;
                }
                final s d = s.d;
                s s;
                if (b7.d()) {
                    s = f3.a((g)b8);
                }
                else if (b9 != null) {
                    s = f3.a((g)b9);
                }
                else {
                    s = d;
                }
                if (s instanceof l) {
                    return s;
                }
                return d;
            }
            case 8: {
                return c(f3, list);
            }
            case 7: {
                C2.j(Z.J, 2, list);
                final t t = (t)c(f3, list);
                if (t.e() == null) {
                    e = "";
                }
                else {
                    e = t.e();
                }
                f3.h(e, t);
                return t;
            }
            case 6: {
                C2.f(Z.B, 0, list);
                return s.f;
            }
            case 4:
            case 5: {
                if (!list.isEmpty()) {
                    final s b10 = f3.b(list.get(0));
                    if (b10 instanceof g) {
                        return f3.a((g)b10);
                    }
                }
                return s.d;
            }
            case 3: {
                C2.f(Z.B, 0, list);
                return s.g;
            }
            case 2: {
                return f3.d().a(new g(list));
            }
            case 1: {
                C2.f(Z.r, 3, list);
                final s b11 = f3.b(list.get(0));
                final String g3 = f3.b(list.get(1)).g();
                final s b12 = f3.b(list.get(2));
                if (!(b12 instanceof g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", ((g)b12).getClass().getCanonicalName()));
                }
                if (!g3.isEmpty()) {
                    return b11.s(g3, f3, ((g)b12).a0());
                }
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
        }
    }
}
