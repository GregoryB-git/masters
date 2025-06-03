// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import V5.c;
import g6.q;
import g6.p;
import g6.l;
import h6.b;
import h6.a;
import java.util.List;

public abstract class y
{
    public static List a(final Object o) {
        if (o instanceof a && !(o instanceof b)) {
            h(o, "kotlin.collections.MutableList");
        }
        return c(o);
    }
    
    public static Object b(final Object o, final int i) {
        if (o != null && !e(o, i)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.functions.Function");
            sb.append(i);
            h(o, sb.toString());
        }
        return o;
    }
    
    public static List c(final Object o) {
        try {
            return (List)o;
        }
        catch (ClassCastException ex) {
            throw g(ex);
        }
    }
    
    public static int d(final Object o) {
        if (o instanceof h) {
            return ((h)o).getArity();
        }
        if (o instanceof g6.a) {
            return 0;
        }
        if (o instanceof l) {
            return 1;
        }
        if (o instanceof p) {
            return 2;
        }
        if (o instanceof q) {
            return 3;
        }
        return -1;
    }
    
    public static boolean e(final Object o, final int n) {
        return o instanceof c && d(o) == n;
    }
    
    public static Throwable f(final Throwable t) {
        return Intrinsics.h(t, y.class.getName());
    }
    
    public static ClassCastException g(final ClassCastException ex) {
        throw (ClassCastException)f(ex);
    }
    
    public static void h(final Object o, final String str) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        i(sb.toString());
    }
    
    public static void i(final String s) {
        throw g(new ClassCastException(s));
    }
}
