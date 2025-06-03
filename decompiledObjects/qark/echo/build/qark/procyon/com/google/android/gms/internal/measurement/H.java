// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public abstract class H
{
    public static g a(final g g, final f3 f3, final n n) {
        return b(g, f3, n, null, null);
    }
    
    public static g b(final g g, final f3 f3, final n n, final Boolean obj, final Boolean obj2) {
        final g g2 = new g();
        final Iterator z = g.Z();
        while (z.hasNext()) {
            final int intValue = z.next();
            if (g.Y(intValue)) {
                final s b = n.b(f3, Arrays.asList(g.M(intValue), new k((double)intValue), g));
                if (b.d().equals(obj)) {
                    return g2;
                }
                if (obj2 != null && !b.d().equals(obj2)) {
                    continue;
                }
                g2.X(intValue, b);
            }
        }
        return g2;
    }
    
    public static s c(final g g, final f3 f3, final List list, final boolean b) {
        C2.k("reduce", 1, list);
        C2.n("reduce", 2, list);
        final s b2 = f3.b(list.get(0));
        if (b2 instanceof n) {
            s b3;
            if (list.size() == 2) {
                b3 = f3.b(list.get(1));
                if (b3 instanceof l) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            }
            else {
                if (g.U() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                }
                b3 = null;
            }
            final n n = (n)b2;
            final int u = g.U();
            int n2;
            if (b) {
                n2 = 0;
            }
            else {
                n2 = u - 1;
            }
            int n3;
            if (b) {
                n3 = u - 1;
            }
            else {
                n3 = 0;
            }
            int n4;
            if (b) {
                n4 = 1;
            }
            else {
                n4 = -1;
            }
            int n5 = n3;
            int n6 = n2;
            s s = b3;
            int n7 = n4;
            while (true) {
                s s2 = null;
                Label_0294: {
                    if (b3 == null) {
                        s2 = g.M(n2);
                        break Label_0294;
                    }
                    if ((n5 - n6) * n7 < 0) {
                        return s;
                    }
                    n3 = n5;
                    n2 = n6;
                    s2 = s;
                    n4 = n7;
                    if (g.Y(n6)) {
                        s2 = n.b(f3, Arrays.asList(s, g.M(n6), new k((double)n6), g));
                        if (s2 instanceof l) {
                            throw new IllegalStateException("Reduce operation failed");
                        }
                        n3 = n5;
                        n2 = n6;
                        n4 = n7;
                    }
                }
                n6 = n2 + n4;
                n5 = n3;
                s = s2;
                n7 = n4;
                continue;
            }
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
    
    public static s d(String g, final g g2, final f3 f3, final List list) {
        g.hashCode();
        int n = 0;
        Label_0202: {
            switch (g) {
                case "indexOf": {
                    n = 19;
                    break Label_0202;
                }
                case "reverse": {
                    n = 18;
                    break Label_0202;
                }
                case "reduceRight": {
                    n = 17;
                    break Label_0202;
                }
                case "slice": {
                    n = 16;
                    break Label_0202;
                }
                case "shift": {
                    n = 15;
                    break Label_0202;
                }
                case "every": {
                    n = 14;
                    break Label_0202;
                }
                case "sort": {
                    n = 13;
                    break Label_0202;
                }
                case "some": {
                    n = 12;
                    break Label_0202;
                }
                case "push": {
                    n = 11;
                    break Label_0202;
                }
                case "join": {
                    n = 10;
                    break Label_0202;
                }
                case "pop": {
                    n = 9;
                    break Label_0202;
                }
                case "map": {
                    n = 8;
                    break Label_0202;
                }
                case "unshift": {
                    n = 7;
                    break Label_0202;
                }
                case "lastIndexOf": {
                    n = 6;
                    break Label_0202;
                }
                case "forEach": {
                    n = 5;
                    break Label_0202;
                }
                case "splice": {
                    n = 4;
                    break Label_0202;
                }
                case "reduce": {
                    n = 3;
                    break Label_0202;
                }
                case "filter": {
                    n = 2;
                    break Label_0202;
                }
                case "concat": {
                    n = 1;
                    break Label_0202;
                }
                case "toString": {
                    n = 0;
                    break Label_0202;
                }
                default:
                    break;
            }
            n = -1;
        }
        double a = 0.0;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 19: {
                C2.n("indexOf", 2, list);
                s s = com.google.android.gms.internal.measurement.s.d;
                if (!list.isEmpty()) {
                    s = f3.b(list.get(0));
                }
                if (list.size() > 1) {
                    a = C2.a(f3.b(list.get(1)).f());
                    if (a >= g2.U()) {
                        return new k(-1.0);
                    }
                    if (a < 0.0) {
                        a += g2.U();
                    }
                }
                final Iterator z = g2.Z();
                while (z.hasNext()) {
                    final int intValue = z.next();
                    final double d = intValue;
                    if (d >= a && C2.h(g2.M(intValue), s)) {
                        return new k(d);
                    }
                }
                return new k(-1.0);
            }
            case 18: {
                C2.g("reverse", 0, list);
                final int u = g2.U();
                if (u != 0) {
                    for (int i = 0; i < u / 2; ++i) {
                        if (g2.Y(i)) {
                            final s m = g2.M(i);
                            g2.X(i, null);
                            final int n2 = u - 1 - i;
                            if (g2.Y(n2)) {
                                g2.X(i, g2.M(n2));
                            }
                            g2.X(n2, m);
                        }
                    }
                }
                return g2;
            }
            case 17: {
                return c(g2, f3, list, false);
            }
            case 16: {
                C2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return g2.c();
                }
                final double n3 = g2.U();
                final double a2 = C2.a(f3.b(list.get(0)).f());
                double n4;
                if (a2 < 0.0) {
                    n4 = Math.max(a2 + n3, 0.0);
                }
                else {
                    n4 = Math.min(a2, n3);
                }
                double n5 = n3;
                if (list.size() == 2) {
                    final double a3 = C2.a(f3.b(list.get(1)).f());
                    if (a3 < 0.0) {
                        n5 = Math.max(n3 + a3, 0.0);
                    }
                    else {
                        n5 = Math.min(n3, a3);
                    }
                }
                final g g3 = new g();
                for (int n6 = (int)n4; n6 < n5; ++n6) {
                    g3.T(g2.M(n6));
                }
                return g3;
            }
            case 15: {
                C2.g("shift", 0, list);
                if (g2.U() == 0) {
                    return s.d;
                }
                final s j = g2.M(0);
                g2.W(0);
                return j;
            }
            case 14: {
                C2.g("every", 1, list);
                final s b = f3.b(list.get(0));
                if (!(b instanceof t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (g2.U() != 0 && b(g2, f3, (n)b, Boolean.FALSE, Boolean.TRUE).U() != g2.U()) {
                    return s.j;
                }
                return s.i;
            }
            case 13: {
                C2.n("sort", 1, list);
                if (g2.U() >= 2) {
                    final List a4 = g2.a0();
                    n n7;
                    if (!list.isEmpty()) {
                        final s b2 = f3.b(list.get(0));
                        if (!(b2 instanceof n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        n7 = (n)b2;
                    }
                    else {
                        n7 = null;
                    }
                    Collections.sort((List<Object>)a4, new K(n7, f3));
                    g2.b0();
                    final Iterator<s> iterator = a4.iterator();
                    int n8 = 0;
                    while (iterator.hasNext()) {
                        g2.X(n8, iterator.next());
                        ++n8;
                    }
                }
                return g2;
            }
            case 12: {
                C2.g("some", 1, list);
                final s b3 = f3.b(list.get(0));
                if (b3 instanceof n) {
                    if (g2.U() != 0) {
                        final n n9 = (n)b3;
                        final Iterator z2 = g2.Z();
                        while (z2.hasNext()) {
                            final int intValue2 = z2.next();
                            if (g2.Y(intValue2)) {
                                if (n9.b(f3, Arrays.asList(g2.M(intValue2), new k((double)intValue2), g2)).d()) {
                                    return s.i;
                                }
                                continue;
                            }
                        }
                    }
                    return s.j;
                }
                throw new IllegalArgumentException("Callback should be a method");
            }
            case 11: {
                if (!list.isEmpty()) {
                    final Iterator<s> iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        g2.T(f3.b(iterator2.next()));
                    }
                }
                return new k((double)g2.U());
            }
            case 10: {
                C2.n("join", 1, list);
                if (g2.U() == 0) {
                    return s.k;
                }
                if (!list.isEmpty()) {
                    final s b4 = f3.b(list.get(0));
                    if (!(b4 instanceof q) && !(b4 instanceof z)) {
                        g = b4.g();
                    }
                    else {
                        g = "";
                    }
                }
                else {
                    g = ",";
                }
                return new u(g2.V(g));
            }
            case 9: {
                C2.g("pop", 0, list);
                final int u2 = g2.U();
                if (u2 == 0) {
                    return s.d;
                }
                final int n10 = u2 - 1;
                final s k = g2.M(n10);
                g2.W(n10);
                return k;
            }
            case 8: {
                C2.g("map", 1, list);
                final s b5 = f3.b(list.get(0));
                if (!(b5 instanceof t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (g2.U() == 0) {
                    return new g();
                }
                return a(g2, f3, (n)b5);
            }
            case 7: {
                if (!list.isEmpty()) {
                    final g g4 = new g();
                    final Iterator<s> iterator3 = list.iterator();
                    while (iterator3.hasNext()) {
                        final s b6 = f3.b(iterator3.next());
                        if (b6 instanceof l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        g4.T(b6);
                    }
                    final int u3 = g4.U();
                    final Iterator z3 = g2.Z();
                    while (z3.hasNext()) {
                        final Integer n11 = z3.next();
                        g4.X(n11 + u3, g2.M(n11));
                    }
                    g2.b0();
                    final Iterator z4 = g4.Z();
                    while (z4.hasNext()) {
                        final Integer n12 = z4.next();
                        g2.X(n12, g4.M(n12));
                    }
                }
                return new k((double)g2.U());
            }
            case 6: {
                C2.n("lastIndexOf", 2, list);
                s s2 = s.d;
                if (!list.isEmpty()) {
                    s2 = f3.b(list.get(0));
                }
                double b7 = g2.U() - 1;
                if (list.size() > 1) {
                    final s b8 = f3.b(list.get(1));
                    double a5;
                    if (Double.isNaN(b8.f())) {
                        a5 = g2.U() - 1;
                    }
                    else {
                        a5 = C2.a(b8.f());
                    }
                    final double n13 = b7 = a5;
                    if (n13 < 0.0) {
                        b7 = n13 + g2.U();
                    }
                }
                if (b7 < 0.0) {
                    return new k(-1.0);
                }
                for (int l = (int)Math.min(g2.U(), b7); l >= 0; --l) {
                    if (g2.Y(l) && C2.h(g2.M(l), s2)) {
                        return new k((double)l);
                    }
                }
                return new k(-1.0);
            }
            case 5: {
                C2.g("forEach", 1, list);
                final s b9 = f3.b(list.get(0));
                if (!(b9 instanceof t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (g2.D() == 0) {
                    return s.d;
                }
                a(g2, f3, (n)b9);
                return s.d;
            }
            case 4: {
                if (list.isEmpty()) {
                    return new g();
                }
                final int n14 = (int)C2.a(f3.b(list.get(0)).f());
                int n15;
                if (n14 < 0) {
                    n15 = Math.max(0, n14 + g2.U());
                }
                else if ((n15 = n14) > g2.U()) {
                    n15 = g2.U();
                }
                final int u4 = g2.U();
                final g g5 = new g();
                int n16 = n15;
                if (list.size() > 1) {
                    final int max = Math.max(0, (int)C2.a(f3.b(list.get(1)).f()));
                    if (max > 0) {
                        for (int n17 = n15; n17 < Math.min(u4, n15 + max); ++n17) {
                            g5.T(g2.M(n15));
                            g2.W(n15);
                        }
                    }
                    if (list.size() > 2) {
                        for (int n18 = 2; n18 < list.size(); ++n18) {
                            final s b10 = f3.b(list.get(n18));
                            if (b10 instanceof l) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            g2.S(n15 + n18 - 2, b10);
                        }
                    }
                    return g5;
                }
                while (n16 < u4) {
                    g5.T(g2.M(n16));
                    g2.X(n16, null);
                    ++n16;
                }
                return g5;
            }
            case 3: {
                return c(g2, f3, list, true);
            }
            case 2: {
                C2.g("filter", 1, list);
                final s b11 = f3.b(list.get(0));
                if (!(b11 instanceof t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (g2.D() == 0) {
                    return new g();
                }
                final g g6 = (g)g2.c();
                final g b12 = b(g2, f3, (n)b11, null, Boolean.TRUE);
                final g g7 = new g();
                final Iterator z5 = b12.Z();
                while (z5.hasNext()) {
                    g7.T(g6.M(z5.next()));
                }
                return g7;
            }
            case 1: {
                final g g8 = (g)g2.c();
                if (!list.isEmpty()) {
                    final Iterator<s> iterator4 = list.iterator();
                    while (iterator4.hasNext()) {
                        final s b13 = f3.b(iterator4.next());
                        if (b13 instanceof l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        final int u5 = g8.U();
                        if (b13 instanceof g) {
                            final g g9 = (g)b13;
                            final Iterator z6 = g9.Z();
                            while (z6.hasNext()) {
                                final Integer n19 = z6.next();
                                g8.X(n19 + u5, g9.M(n19));
                            }
                        }
                        else {
                            g8.X(u5, b13);
                        }
                    }
                }
                return g8;
            }
            case 0: {
                C2.g("toString", 0, list);
                return new u(g2.toString());
            }
        }
    }
}
