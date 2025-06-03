// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class L extends A
{
    public L() {
        super.a.add(Z.P);
        super.a.add(Z.Q);
        super.a.add(Z.R);
        super.a.add(Z.S);
        super.a.add(Z.T);
        super.a.add(Z.U);
        super.a.add(Z.V);
        super.a.add(Z.C0);
    }
    
    public static s c(final P p3, final s s, final s s2) {
        return d(p3, s.k(), s2);
    }
    
    public static s d(final P p3, final Iterator iterator, final s s) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                final s a = p3.a(iterator.next()).a((g)s);
                if (a instanceof l) {
                    final l l = (l)a;
                    if ("break".equals(l.b())) {
                        return s.d;
                    }
                    if ("return".equals(l.b())) {
                        return l;
                    }
                    continue;
                }
            }
        }
        return s.d;
    }
    
    public static s e(final P p3, final s s, final s s2) {
        if (s instanceof Iterable) {
            return d(p3, ((Iterable)s).iterator(), s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }
    
    @Override
    public final s b(String s, final f3 f3, final List list) {
        switch (O.a[C2.c(s).ordinal()]) {
            default: {
                return super.a(s);
            }
            case 8: {
                C2.f(Z.C0, 4, list);
                final s s2 = list.get(0);
                final s s3 = list.get(1);
                final s s4 = list.get(2);
                final s b = f3.b(list.get(3));
                if (f3.b(s4).d()) {
                    final s a = f3.a((g)b);
                    if (a instanceof l) {
                        final l l = (l)a;
                        if ("break".equals(l.b())) {
                            return s.d;
                        }
                        if ("return".equals(l.b())) {
                            return l;
                        }
                    }
                }
                while (f3.b(s2).d()) {
                    final s a2 = f3.a((g)b);
                    if (a2 instanceof l) {
                        final l i = (l)a2;
                        if ("break".equals(i.b())) {
                            break;
                        }
                        if ("return".equals(i.b())) {
                            return i;
                        }
                    }
                    f3.b(s3);
                }
                return s.d;
            }
            case 7: {
                C2.f(Z.V, 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).g();
                    return e(new Q(f3, s), f3.b(list.get(1)), f3.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            }
            case 6: {
                C2.f(Z.U, 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).g();
                    return e(new N(f3, s), f3.b(list.get(1)), f3.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            }
            case 5: {
                C2.f(Z.T, 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).g();
                    return e(new T(f3, s), f3.b(list.get(1)), f3.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            }
            case 4: {
                C2.f(Z.S, 4, list);
                final s b2 = f3.b(list.get(0));
                if (b2 instanceof g) {
                    final g g = (g)b2;
                    final s s5 = list.get(1);
                    final s s6 = list.get(2);
                    final s b3 = f3.b(list.get(3));
                    final f3 d = f3.d();
                    int n = 0;
                    f3 f4;
                    while (true) {
                        f4 = d;
                        if (n >= g.U()) {
                            break;
                        }
                        s = g.M(n).g();
                        d.h(s, f3.c(s));
                        ++n;
                    }
                    while (f3.b(s5).d()) {
                        final s a3 = f3.a((g)b3);
                        if (a3 instanceof l) {
                            final l j = (l)a3;
                            if ("break".equals(j.b())) {
                                break;
                            }
                            if ("return".equals(j.b())) {
                                return j;
                            }
                        }
                        final f3 d2 = f3.d();
                        for (int k = 0; k < g.U(); ++k) {
                            final String g2 = g.M(k).g();
                            d2.h(g2, f4.c(g2));
                        }
                        d2.b(s6);
                        f4 = d2;
                    }
                    return s.d;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            }
            case 3: {
                C2.f(Z.R, 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).g();
                    return c(new Q(f3, s), f3.b(list.get(1)), f3.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            }
            case 2: {
                C2.f(Z.Q, 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).g();
                    return c(new N(f3, s), f3.b(list.get(1)), f3.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            }
            case 1: {
                C2.f(Z.P, 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).g();
                    return c(new T(f3, s), f3.b(list.get(1)), f3.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            }
        }
    }
}
