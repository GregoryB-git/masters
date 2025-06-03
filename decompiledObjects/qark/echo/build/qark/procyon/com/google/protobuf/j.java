// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class j
{
    public static final Class a;
    
    static {
        a = c();
    }
    
    public static k a() {
        final k b = b("getEmptyRegistry");
        if (b != null) {
            return b;
        }
        return k.d;
    }
    
    public static final k b(final String name) {
        final Class a = j.a;
        if (a == null) {
            return null;
        }
        try {
            return (k)a.getDeclaredMethod(name, (Class[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
}
