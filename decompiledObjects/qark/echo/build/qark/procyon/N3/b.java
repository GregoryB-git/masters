// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N3;

import V2.j;
import H3.v;
import java.nio.charset.Charset;
import c2.g;
import f2.f;
import f2.u;
import H3.H;
import O3.i;
import android.content.Context;
import J3.B;
import c2.e;
import K3.h;

public class b
{
    public static final h c;
    public static final String d;
    public static final String e;
    public static final e f;
    public final N3.e a;
    public final e b;
    
    static {
        c = new h();
        d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
        e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
        f = new a();
    }
    
    public b(final N3.e a, final e b) {
        this.a = a;
        this.b = b;
    }
    
    public static b b(final Context context, final i i, final H h) {
        u.f(context);
        final g g = u.c().g(new d2.a(b.d, b.e));
        final c2.b b = c2.b.b("json");
        final e f = N3.b.f;
        return new b(new N3.e(g.a("FIREBASE_CRASHLYTICS_REPORT", B.class, b, f), i.b(), h), f);
    }
    
    public static String e(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s.length() + s2.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
    
    public j c(final v v, final boolean b) {
        return this.a.i(v, b).a();
    }
}
