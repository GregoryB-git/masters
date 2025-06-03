// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public class w implements N
{
    public static final w a;
    
    static {
        a = new w();
    }
    
    public static w c() {
        return w.a;
    }
    
    @Override
    public M a(final Class clazz) {
        if (x.class.isAssignableFrom(clazz)) {
            try {
                return (M)x.v(clazz.asSubclass(x.class)).k();
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
        return x.class.isAssignableFrom(clazz);
    }
}
