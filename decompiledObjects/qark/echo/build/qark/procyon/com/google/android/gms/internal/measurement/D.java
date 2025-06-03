// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class D extends A
{
    public D() {
        super.a.add(Z.M);
        super.a.add(Z.a0);
        super.a.add(Z.b0);
        super.a.add(Z.c0);
        super.a.add(Z.d0);
        super.a.add(Z.f0);
        super.a.add(Z.g0);
        super.a.add(Z.l0);
    }
    
    public static boolean c(final s s, s s2) {
        s s3 = s;
        while (!s3.getClass().equals(s2.getClass())) {
            if (s3 instanceof z || s3 instanceof q) {
                if (s2 instanceof z) {
                    return true;
                }
                if (s2 instanceof q) {
                    return true;
                }
            }
            final boolean b = s3 instanceof k;
            s s5 = null;
            Label_0229: {
                if (!b || !(s2 instanceof u)) {
                    final boolean b2 = s3 instanceof u;
                    s s4;
                    if (b2 && s2 instanceof k) {
                        s4 = new k(s3.f());
                    }
                    else if (s3 instanceof h) {
                        s4 = new k(s3.f());
                    }
                    else {
                        if (s2 instanceof h) {
                            s5 = new k(s2.f());
                            break Label_0229;
                        }
                        if ((b2 || b) && s2 instanceof m) {
                            s5 = new u(s2.g());
                            break Label_0229;
                        }
                        if (!(s3 instanceof m) || (!(s2 instanceof u) && !(s2 instanceof k))) {
                            return false;
                        }
                        s4 = new u(s3.g());
                    }
                    s3 = s4;
                    continue;
                }
                s5 = new k(s2.f());
            }
            s2 = s5;
        }
        if (s3 instanceof z) {
            return true;
        }
        if (s3 instanceof q) {
            return true;
        }
        if (s3 instanceof k) {
            if (!Double.isNaN(s3.f())) {
                if (Double.isNaN(s2.f())) {
                    return false;
                }
                if (s3.f() == (double)s2.f()) {
                    return true;
                }
            }
            return false;
        }
        if (s3 instanceof u) {
            return s3.g().equals(s2.g());
        }
        if (s3 instanceof h) {
            return s3.d().equals(s2.d());
        }
        return s3 == s2;
    }
    
    public static boolean d(s o, final s s) {
        Object o2 = o;
        if (o instanceof m) {
            o2 = new u(((s)o).g());
        }
        o = s;
        if (s instanceof m) {
            o = new u(s.g());
        }
        if (o2 instanceof u && o instanceof u) {
            return ((s)o2).g().compareTo(((s)o).g()) < 0;
        }
        final double doubleValue = ((s)o2).f();
        final double doubleValue2 = ((s)o).f();
        if (!Double.isNaN(doubleValue)) {
            if (Double.isNaN(doubleValue2)) {
                return false;
            }
            if ((doubleValue == 0.0 && doubleValue2 == 0.0) || (doubleValue == 0.0 && doubleValue2 == 0.0)) {
                return false;
            }
            if (Double.compare(doubleValue, doubleValue2) < 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean e(s o, final s s) {
        Object o2 = o;
        if (o instanceof m) {
            o2 = new u(((s)o).g());
        }
        o = s;
        if (s instanceof m) {
            o = new u(s.g());
        }
        if (!(o2 instanceof u) || !(o instanceof u)) {
            if (Double.isNaN(((s)o2).f())) {
                return false;
            }
            if (Double.isNaN(((s)o).f())) {
                return false;
            }
        }
        if (!d((s)o, (s)o2)) {
            return true;
        }
        return false;
    }
    
    @Override
    public final s b(final String s, final f3 f3, final List list) {
        C2.f(C2.c(s), 2, list);
        final s b = f3.b(list.get(0));
        final s b2 = f3.b(list.get(1));
        boolean b4 = false;
        Label_0193: {
            boolean b3 = false;
            switch (G.a[C2.c(s).ordinal()]) {
                default: {
                    return super.a(s);
                }
                case 8: {
                    b3 = c(b, b2);
                    break;
                }
                case 7: {
                    b4 = e(b, b2);
                    break Label_0193;
                }
                case 6: {
                    b4 = d(b, b2);
                    break Label_0193;
                }
                case 5: {
                    b3 = C2.h(b, b2);
                    break;
                }
                case 4: {
                    b4 = C2.h(b, b2);
                    break Label_0193;
                }
                case 3: {
                    b4 = e(b2, b);
                    break Label_0193;
                }
                case 2: {
                    b4 = d(b2, b);
                    break Label_0193;
                }
                case 1: {
                    b4 = c(b, b2);
                    break Label_0193;
                }
            }
            b4 = (b3 ^ true);
        }
        if (b4) {
            return s.i;
        }
        return s.j;
    }
}
