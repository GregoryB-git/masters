// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public abstract class L
{
    public static final J a;
    public static final J b;
    
    static {
        a = c();
        b = new K();
    }
    
    public static J a() {
        return L.a;
    }
    
    public static J b() {
        return L.b;
    }
    
    public static J c() {
        try {
            return (J)Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
