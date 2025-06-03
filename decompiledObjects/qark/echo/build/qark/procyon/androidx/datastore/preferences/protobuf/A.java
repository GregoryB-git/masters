// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public enum A
{
    A("MESSAGE", 9, (Class)Object.class, (Class)Object.class, (Object)null), 
    r("VOID", 0, (Class)Void.class, (Class)Void.class, (Object)null), 
    s("INT", 1, (Class)type, (Class)Integer.class, (Object)0), 
    t("LONG", 2, (Class)Long.TYPE, (Class)Long.class, (Object)0L), 
    u("FLOAT", 3, (Class)Float.TYPE, (Class)Float.class, (Object)0.0f), 
    v("DOUBLE", 4, (Class)Double.TYPE, (Class)Double.class, (Object)0.0), 
    w("BOOLEAN", 5, (Class)Boolean.TYPE, (Class)Boolean.class, (Object)Boolean.FALSE), 
    x("STRING", 6, (Class)String.class, (Class)String.class, (Object)""), 
    y("BYTE_STRING", 7, (Class)g.class, (Class)g.class, (Object)g.p), 
    z("ENUM", 8, (Class)type, (Class)Integer.class, (Object)null);
    
    public final Class o;
    public final Class p;
    public final Object q;
    
    static {
        final Class<Integer> type = Integer.TYPE;
    }
    
    public A(final String name, final int ordinal, final Class o, final Class p5, final Object q) {
        this.o = o;
        this.p = p5;
        this.q = q;
    }
    
    public Class c() {
        return this.p;
    }
}
