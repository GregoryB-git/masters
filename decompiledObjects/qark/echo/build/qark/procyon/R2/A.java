// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import android.text.TextUtils;
import A2.n;

public final class A
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final D f;
    
    public A(final N2 n2, final String s, final String a, final String b, final long d, final long e, final D f) {
        n.e(a);
        n.e(b);
        n.i(f);
        this.a = a;
        this.b = b;
        String c = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            c = null;
        }
        this.c = c;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            n2.j().L().c("Event created with reverse previous/current timestamps. appId, name", Y1.v(a), Y1.v(b));
        }
        this.f = f;
    }
    
    public A(final N2 n2, final String s, final String a, String s2, final long d, final long e, final Bundle bundle) {
        n.e(a);
        n.e(s2);
        this.a = a;
        this.b = s2;
        s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = null;
        }
        this.c = s2;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            n2.j().L().b("Event created with reverse previous/current timestamps. appId", Y1.v(a));
        }
        D f;
        if (bundle != null && !((BaseBundle)bundle).isEmpty()) {
            final Bundle bundle2 = new Bundle(bundle);
            final Iterator iterator = ((BaseBundle)bundle2).keySet().iterator();
            while (iterator.hasNext()) {
                s2 = iterator.next();
                if (s2 == null) {
                    n2.j().G().a("Param name can't be null");
                }
                else {
                    final Object s3 = n2.L().s0(s2, ((BaseBundle)bundle2).get(s2));
                    if (s3 != null) {
                        n2.L().R(bundle2, s2, s3);
                        continue;
                    }
                    n2.j().L().b("Param value can't be null", n2.D().f(s2));
                }
                iterator.remove();
            }
            f = new D(bundle2);
        }
        else {
            f = new D(new Bundle());
        }
        this.f = f;
    }
    
    public final A a(final N2 n2, final long n3) {
        return new A(n2, this.c, this.a, this.b, this.d, n3, this.f);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String value = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder("Event{appId='");
        sb.append(a);
        sb.append("', name='");
        sb.append(b);
        sb.append("', params=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
