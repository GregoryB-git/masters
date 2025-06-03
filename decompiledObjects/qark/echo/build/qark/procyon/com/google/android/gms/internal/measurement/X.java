// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class X extends A
{
    public X() {
        super.a.add(Z.s);
        super.a.add(Z.D);
        super.a.add(Z.G);
        super.a.add(Z.H);
        super.a.add(Z.N);
        super.a.add(Z.W);
        super.a.add(Z.Y);
        super.a.add(Z.Z);
        super.a.add(Z.m0);
        super.a.add(Z.v0);
        super.a.add(Z.z0);
        super.a.add(Z.A0);
        super.a.add(Z.B0);
    }
    
    @Override
    public final s b(String s, final f3 f3, final List list) {
        final int n = W.a[C2.c(s).ordinal()];
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        switch (n) {
            default: {
                return super.a(s);
            }
            case 13: {
                C2.j(Z.B0, 1, list);
                final Iterator<s> iterator = list.iterator();
                while (iterator.hasNext()) {
                    final s b = f3.b(iterator.next());
                    if (!(b instanceof u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b.getClass().getCanonicalName()));
                    }
                    f3.e(b.g(), s.d);
                }
                return s.d;
            }
            case 12: {
                C2.f(Z.A0, 0, list);
                return s.d;
            }
            case 11: {
                C2.f(Z.z0, 1, list);
                final s b2 = f3.b(list.get(0));
                if (b2 instanceof z) {
                    s = "undefined";
                }
                else if (b2 instanceof h) {
                    s = "boolean";
                }
                else if (b2 instanceof k) {
                    s = "number";
                }
                else if (b2 instanceof u) {
                    s = "string";
                }
                else if (b2 instanceof t) {
                    s = "function";
                }
                else {
                    if (b2 instanceof v || b2 instanceof l) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b2));
                    }
                    s = "object";
                }
                return new u(s);
            }
            case 10: {
                C2.f(Z.v0, 3, list);
                final s b3 = f3.b(list.get(0));
                final s b4 = f3.b(list.get(1));
                final s b5 = f3.b(list.get(2));
                if (b3 == s.d || b3 == s.e) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", b4.g(), b3.g()));
                }
                if (b3 instanceof g && b4 instanceof k) {
                    ((g)b3).X(b4.f().intValue(), b5);
                    return b5;
                }
                if (b3 instanceof m) {
                    ((g)b3).a(b4.g(), b5);
                }
                return b5;
            }
            case 9: {
                C2.f(Z.m0, 0, list);
                return s.e;
            }
            case 7:
            case 8: {
                C2.f(Z.Z, 2, list);
                final s b6 = f3.b(list.get(0));
                final s b7 = f3.b(list.get(1));
                if (b6 instanceof g && C2.l(b7)) {
                    return ((g)b6).M(b7.f().intValue());
                }
                if (b6 instanceof m) {
                    return ((g)b6).i(b7.g());
                }
                if (b6 instanceof u) {
                    if ("length".equals(b7.g())) {
                        return new k((double)b6.g().length());
                    }
                    if (C2.l(b7) && b7.f() < b6.g().length()) {
                        return new u(String.valueOf(b6.g().charAt(b7.f().intValue())));
                    }
                }
                return s.d;
            }
            case 6: {
                C2.f(Z.W, 1, list);
                final s b8 = f3.b(list.get(0));
                if (b8 instanceof u) {
                    return f3.c(b8.g());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b8.getClass().getCanonicalName()));
            }
            case 5: {
                C2.j(Z.N, 1, list);
                s s2 = s.d;
                while (i < list.size()) {
                    s2 = f3.b(list.get(i));
                    if (s2 instanceof l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    ++i;
                }
                return s2;
            }
            case 4: {
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 == 0) {
                    final r r = new r();
                    for (int j = n2; j < list.size() - 1; j += 2) {
                        final s b9 = f3.b(list.get(j));
                        final s b10 = f3.b(list.get(j + 1));
                        if (b9 instanceof l || b10 instanceof l) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        r.a(b9.g(), b10);
                    }
                    return r;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
            }
            case 3: {
                if (list.isEmpty()) {
                    return new g();
                }
                final g g = new g();
                final Iterator<s> iterator2 = list.iterator();
                int n4 = n3;
                while (iterator2.hasNext()) {
                    final s b11 = f3.b(iterator2.next());
                    if (b11 instanceof l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    g.X(n4, b11);
                    ++n4;
                }
                return g;
            }
            case 2: {
                C2.j(Z.D, 2, list);
                if (list.size() % 2 == 0) {
                    for (int k = 0; k < list.size() - 1; k += 2) {
                        final s b12 = f3.b(list.get(k));
                        if (!(b12 instanceof u)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b12.getClass().getCanonicalName()));
                        }
                        f3.f(b12.g(), f3.b(list.get(k + 1)));
                    }
                    return s.d;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
            }
            case 1: {
                C2.f(Z.s, 2, list);
                final s b13 = f3.b(list.get(0));
                if (!(b13 instanceof u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b13.getClass().getCanonicalName()));
                }
                if (f3.g(b13.g())) {
                    final s b14 = f3.b(list.get(1));
                    f3.h(b13.g(), b14);
                    return b14;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b13.g()));
            }
        }
    }
}
