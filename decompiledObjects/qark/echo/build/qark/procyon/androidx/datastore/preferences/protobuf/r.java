// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public abstract class r
{
    public static final p a;
    public static final p b;
    
    static {
        a = new q();
        b = c();
    }
    
    public static p a() {
        final p b = r.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    
    public static p b() {
        return r.a;
    }
    
    public static p c() {
        try {
            return (p)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
