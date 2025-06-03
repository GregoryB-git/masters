// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public class q implements J
{
    public static final q a;
    
    static {
        a = new q();
    }
    
    public static q c() {
        return q.a;
    }
    
    @Override
    public I a(final Class clazz) {
        if (r.class.isAssignableFrom(clazz)) {
            try {
                return (I)r.A(clazz.asSubclass(r.class)).m();
            }
            catch (Exception cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to get message info for ");
                sb.append(clazz.getName());
                throw new RuntimeException(sb.toString(), cause);
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unsupported message type: ");
        sb2.append(clazz.getName());
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    public boolean b(final Class clazz) {
        return r.class.isAssignableFrom(clazz);
    }
}
