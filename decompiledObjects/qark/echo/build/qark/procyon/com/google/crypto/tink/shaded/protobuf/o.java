// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public abstract class o
{
    public static final Class a;
    
    static {
        a = c();
    }
    
    public static p a() {
        final p b = b("getEmptyRegistry");
        if (b != null) {
            return b;
        }
        return p.d;
    }
    
    public static final p b(final String name) {
        final Class a = o.a;
        if (a == null) {
            return null;
        }
        try {
            return (p)a.getDeclaredMethod(name, (Class[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
}
