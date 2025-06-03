// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C2;

import z2.k;
import z2.m;
import V2.j;
import A2.r;
import A2.u;
import android.content.Context;
import y2.a;
import A2.t;

public final class d extends y2.d implements t
{
    public static final a.g k;
    public static final a.a l;
    public static final a m;
    
    static {
        m = new a("ClientTelemetry.API", l = new c(), k = new a.g());
    }
    
    public d(final Context context, final u u) {
        super(context, d.m, u, y2.d.a.c);
    }
    
    @Override
    public final j a(final r r) {
        final m.a a = z2.m.a();
        a.d(K2.d.a);
        a.c(false);
        a.b(new b(r));
        return this.c(a.a());
    }
}
