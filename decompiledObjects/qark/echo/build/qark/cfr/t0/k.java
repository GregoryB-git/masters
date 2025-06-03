/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package t0;

import android.content.Context;
import android.content.pm.PackageManager;
import d0.q;
import d0.z;
import g0.M;
import g0.o;
import t0.K;
import t0.b;
import t0.m;

public final class k
implements m.b {
    public final Context a;
    public int b;
    public boolean c;

    public k(Context context) {
        this.a = context;
        this.b = 0;
        this.c = true;
    }

    @Override
    public m a(m.a a8) {
        int n8;
        if (M.a >= 23 && ((n8 = this.b) == 1 || n8 == 0 && this.b())) {
            n8 = z.k(a8.c.n);
            Object object = new StringBuilder();
            object.append("Creating an asynchronous MediaCodec adapter for track type ");
            object.append(M.p0(n8));
            o.f("DMCodecAdapterFactory", object.toString());
            object = new b.b(n8);
            object.e(this.c);
            return object.d(a8);
        }
        return new K.b().a(a8);
    }

    public final boolean b() {
        int n8 = M.a;
        if (n8 >= 31) {
            return true;
        }
        Context context = this.a;
        if (context != null && n8 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")) {
            return true;
        }
        return false;
    }
}

