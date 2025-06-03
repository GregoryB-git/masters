/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.C3;
import R2.K;
import R2.P1;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import R2.l5;
import R2.o2;
import R2.p5;
import R2.q5;
import R2.r5;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.m7;

public final class s5
implements Runnable {
    public /* synthetic */ p5 o;

    public /* synthetic */ s5(p5 p52) {
        this.o = p52;
    }

    public final void run() {
        p5 p52 = this.o;
        q5 q52 = p52.q;
        long l8 = p52.o;
        long l9 = p52.p;
        q52.b.n();
        q52.b.j().F().a("Application going to the background");
        q52.b.i().s.a(true);
        q52.b.D(true);
        if (!q52.b.f().Q()) {
            q52.b.f.e(l9);
            q52.b.E(false, false, l9);
        }
        if (m7.a() && q52.b.f().s(K.K0)) {
            q52.b.j().J().b("Application backgrounded at: timestamp_millis", l8);
            return;
        }
        q52.b.r().U("auto", "_ab", l8, new Bundle());
    }
}

