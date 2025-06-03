// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public abstract class W
{
    public static final U a;
    public static final U b;
    
    static {
        a = c();
        b = new V();
    }
    
    public static U a() {
        return W.a;
    }
    
    public static U b() {
        return W.b;
    }
    
    public static U c() {
        try {
            return (U)Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
