// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.g;
import m6.f;
import m6.d;
import m6.e;
import m6.c;

public abstract class v
{
    public static final w a;
    public static final c[] b;
    
    static {
        w a2 = null;
        while (true) {
            try {
                a2 = (w)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
                if (a2 == null) {
                    a2 = new w();
                }
                a = a2;
                b = new c[0];
            }
            catch (ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                continue;
            }
            break;
        }
    }
    
    public static e a(final i i) {
        return v.a.a(i);
    }
    
    public static c b(final Class clazz) {
        return v.a.b(clazz);
    }
    
    public static d c(final Class clazz) {
        return v.a.c(clazz, "");
    }
    
    public static f d(final n n) {
        return v.a.d(n);
    }
    
    public static g e(final p p) {
        return v.a.e(p);
    }
    
    public static String f(final h h) {
        return v.a.f(h);
    }
    
    public static String g(final l l) {
        return v.a.g(l);
    }
}
