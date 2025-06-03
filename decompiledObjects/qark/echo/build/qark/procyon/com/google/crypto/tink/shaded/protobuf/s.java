// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public abstract class s
{
    public static final q a;
    public static final q b;
    
    static {
        a = new r();
        b = c();
    }
    
    public static q a() {
        final q b = s.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    
    public static q b() {
        return s.a;
    }
    
    public static q c() {
        try {
            return (q)Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
