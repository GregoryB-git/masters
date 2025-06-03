// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class n
{
    public static final l a;
    public static final l b;
    
    static {
        a = new m();
        b = c();
    }
    
    public static l a() {
        final l b = n.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    
    public static l b() {
        return n.a;
    }
    
    public static l c() {
        try {
            return (l)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
