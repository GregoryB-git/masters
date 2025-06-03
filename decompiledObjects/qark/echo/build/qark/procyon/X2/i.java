// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;

public abstract class i
{
    public static void a(final Object obj, final Object obj2) {
        if (obj == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("null value in entry: ");
        sb2.append(obj);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }
    
    public static int b(final int i, final String str) {
        if (i >= 0) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void c(final boolean b) {
        m.p(b, "no calls to next() since the last call to remove()");
    }
}
