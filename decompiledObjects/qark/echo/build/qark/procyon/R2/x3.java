// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import A2.n;
import com.google.android.gms.internal.measurement.H0;
import android.content.Context;

public final class x3
{
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public H0 g;
    public boolean h;
    public Long i;
    public String j;
    
    public x3(Context applicationContext, final H0 g, final Long i) {
        this.h = true;
        n.i(applicationContext);
        applicationContext = applicationContext.getApplicationContext();
        n.i(applicationContext);
        this.a = applicationContext;
        this.i = i;
        if (g != null) {
            this.g = g;
            this.b = g.t;
            this.c = g.s;
            this.d = g.r;
            this.h = g.q;
            this.f = g.p;
            this.j = g.v;
            final Bundle u = g.u;
            if (u != null) {
                this.e = ((BaseBundle)u).getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}
