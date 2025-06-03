// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import Q0.a;

public final class f
{
    public final a[] a;
    public final long[] b;
    public final String c;
    public final String d;
    public final long e;
    
    public f(final String c, final String d, final long e, final long[] b, final a[] a) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = b;
        this.a = a;
    }
    
    public String a() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append("/");
        sb.append(this.d);
        return sb.toString();
    }
}
