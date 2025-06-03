// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class H4
{
    public static final F4 a;
    public static final F4 b;
    
    static {
        a = c();
        b = new E4();
    }
    
    public static F4 a() {
        return H4.a;
    }
    
    public static F4 b() {
        return H4.b;
    }
    
    public static F4 c() {
        try {
            return (F4)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
