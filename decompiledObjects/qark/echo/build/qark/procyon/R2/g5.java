// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import E2.e;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Locale;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import s2.a;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

public final class g5 extends C5
{
    public final Map d;
    public final q2 e;
    public final q2 f;
    public final q2 g;
    public final q2 h;
    public final q2 i;
    
    public g5(final D5 d5) {
        super(d5);
        this.d = new HashMap();
        final l2 i = this.i();
        i.getClass();
        this.e = new q2(i, "last_delete_stale", 0L);
        final l2 j = this.i();
        j.getClass();
        this.f = new q2(j, "backoff", 0L);
        final l2 k = this.i();
        k.getClass();
        this.g = new q2(k, "last_upload", 0L);
        final l2 l = this.i();
        l.getClass();
        this.h = new q2(l, "last_upload_attempt", 0L);
        final l2 m = this.i();
        m.getClass();
        this.i = new q2(m, "midnight_offset", 0L);
    }
    
    private final Pair y(final String s) {
        this.n();
        final long b = this.b().b();
        Object a = this.d.get(s);
        if (a != null && b < ((f5)a).c) {
            return new Pair((Object)((f5)a).a, (Object)((f5)a).b);
        }
        s2.a.b(true);
        final long n = this.f().C(s) + b;
        long x;
        g5 g5;
        Context context;
        a.a a2;
        f5 f5;
        final Exception ex;
        Label_0266_Outer:Label_0118_Outer:
        while (true) {
            Label_0238: {
                try {
                    x = this.f().x(s, K.d);
                    if (x > 0L) {
                        g5 = this;
                        context = g5.a();
                        a2 = s2.a.a(context);
                        break Label_0166;
                    }
                    break Label_0238;
                }
                catch (Exception ex) {
                    break Label_0238;
                }
                while (true) {
                    try {
                        g5 = this;
                        context = g5.a();
                        a2 = s2.a.a(context);
                        if (a2 == null) {
                            return new Pair((Object)"00000000-0000-0000-0000-000000000000", (Object)Boolean.FALSE);
                        }
                        a = a2.a();
                        if (a != null) {
                            f5 = new f5((String)a, a2.b(), n);
                        }
                        else {
                            f5 = new f5("", a2.b(), n);
                        }
                        // iftrue(Label_0309:, a == null || b >= a.c + x)
                        while (true) {
                            this.d.put(s, f5);
                            s2.a.b(false);
                            return new Pair((Object)f5.a, (Object)f5.b);
                            return new Pair((Object)((f5)a).a, (Object)((f5)a).b);
                            this.j().F().b("Unable to get advertising id", ex);
                            f5 = new f5("", false, n);
                            continue Label_0118_Outer;
                        }
                        a2 = s2.a.a(this.a());
                        continue Label_0266_Outer;
                    }
                    catch (PackageManager$NameNotFoundException ex2) {
                        continue;
                        Label_0309: {
                            a2 = null;
                        }
                        continue Label_0118_Outer;
                    }
                    break;
                }
            }
            break;
        }
    }
    
    public final String A(String s, final boolean b) {
        this.n();
        if (b) {
            s = (String)this.y(s).first;
        }
        else {
            s = "00000000-0000-0000-0000-000000000000";
        }
        final MessageDigest t0 = S5.T0();
        if (t0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, t0.digest(s.getBytes())));
    }
    
    @Override
    public final boolean x() {
        return false;
    }
    
    public final Pair z(final String s, final q3 q3) {
        if (q3.x()) {
            return this.y(s);
        }
        return new Pair((Object)"", (Object)Boolean.FALSE);
    }
}
