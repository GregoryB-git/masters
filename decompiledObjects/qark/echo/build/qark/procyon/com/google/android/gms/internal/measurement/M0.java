// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import R2.H2;
import H2.b;
import com.google.android.gms.dynamite.DynamiteModule;
import android.util.Log;
import A2.n;
import android.os.Bundle;
import android.content.Context;

public final class M0 extends a
{
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Context u;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ J0 w;
    
    public M0(final J0 w, final String s, final String t, final Context u, final Bundle v) {
        this.w = w;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        w.super();
    }
    
    @Override
    public final void a() {
    Label_0132_Outer:
        while (true) {
            while (true) {
            Label_0236:
                while (true) {
                    Label_0214: {
                        while (true) {
                            try {
                                if (!J0.y(this.w, this.s, this.t)) {
                                    break Label_0214;
                                }
                                final String t = this.t;
                                final String s = this.s;
                                final String a = J0.A(this.w);
                                n.i(this.u);
                                final J0 w = this.w;
                                J0.o(w, w.c(this.u, true));
                                if (J0.d(this.w) == null) {
                                    Log.w(J0.A(this.w), "Failed to connect to measurement client.");
                                    return;
                                }
                                final int a2 = DynamiteModule.a(this.u, "com.google.android.gms.measurement.dynamite");
                                final int b = DynamiteModule.b(this.u, "com.google.android.gms.measurement.dynamite");
                                final int max = Math.max(a2, b);
                                if (b < a2) {
                                    final boolean b2 = true;
                                    ((x0)n.i(J0.d(this.w))).initialize(H2.b.Z0(this.u), new H0(82001L, max, b2, a, s, t, this.v, H2.a(this.u)), super.o);
                                    return;
                                }
                                break Label_0236;
                                final Exception ex;
                                J0.q(this.w, ex, true, false);
                                return;
                            }
                            catch (Exception ex) {
                                continue;
                            }
                            break;
                        }
                    }
                    final String a = null;
                    String s;
                    final String t = s = a;
                    continue Label_0132_Outer;
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
}
