// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class H
{
    public static final F a;
    public static final F b;
    
    static {
        a = c();
        b = new G();
    }
    
    public static F a() {
        return H.a;
    }
    
    public static F b() {
        return H.b;
    }
    
    public static F c() {
        try {
            return (F)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
