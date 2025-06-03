/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.H0;

public final class x3 {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public H0 g;
    public boolean h = true;
    public Long i;
    public String j;

    public x3(Context context, H0 h02, Long l8) {
        n.i((Object)context);
        context = context.getApplicationContext();
        n.i((Object)context);
        this.a = context;
        this.i = l8;
        if (h02 != null) {
            this.g = h02;
            this.b = h02.t;
            this.c = h02.s;
            this.d = h02.r;
            this.h = h02.q;
            this.f = h02.p;
            this.j = h02.v;
            context = h02.u;
            if (context != null) {
                this.e = context.getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}

