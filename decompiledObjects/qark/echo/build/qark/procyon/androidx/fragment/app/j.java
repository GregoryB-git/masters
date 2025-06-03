// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import t.h;

public abstract class j
{
    public static final h a;
    
    static {
        a = new h();
    }
    
    public static boolean b(final ClassLoader classLoader, final String s) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, s));
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static Class c(final ClassLoader loader, final String name) {
        final h a = j.a;
        h h;
        if ((h = (h)a.get(loader)) == null) {
            h = new h();
            a.put(loader, h);
        }
        Class<?> forName;
        if ((forName = (Class<?>)h.get(name)) == null) {
            forName = Class.forName(name, false, loader);
            h.put(name, forName);
        }
        return forName;
    }
    
    public static Class d(final ClassLoader classLoader, final String s) {
        try {
            return c(classLoader, s);
        }
        catch (ClassCastException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.i(sb.toString(), ex);
        }
        catch (ClassNotFoundException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": make sure class name exists");
            throw new Fragment.i(sb2.toString(), ex2);
        }
    }
    
    public abstract Fragment a(final ClassLoader p0, final String p1);
}
