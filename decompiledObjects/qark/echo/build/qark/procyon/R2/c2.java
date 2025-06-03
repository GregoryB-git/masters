// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Bundle;

public final class c2
{
    public String a;
    public String b;
    public long c;
    public Bundle d;
    
    public c2(final String a, final String b, final Bundle bundle, final long c) {
        this.a = a;
        this.b = b;
        Bundle d = bundle;
        if (bundle == null) {
            d = new Bundle();
        }
        this.d = d;
        this.c = c;
    }
    
    public static c2 b(final I i) {
        return new c2(i.o, i.q, i.p.g(), i.r);
    }
    
    public final I a() {
        return new I(this.a, new D(new Bundle(this.d)), this.b, this.c);
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String a = this.a;
        final String value = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("origin=");
        sb.append(b);
        sb.append(",name=");
        sb.append(a);
        sb.append(",params=");
        sb.append(value);
        return sb.toString();
    }
}
