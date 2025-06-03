/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package M4;

import F4.a;
import G4.h;
import M4.b;
import com.google.firebase.perf.metrics.Trace;

public abstract class j {
    public static final a a = a.e();

    public static Trace a(Trace trace, h.a a8) {
        if (a8.d() > 0) {
            trace.putMetric(b.s.toString(), a8.d());
        }
        if (a8.c() > 0) {
            trace.putMetric(b.t.toString(), a8.c());
        }
        if (a8.b() > 0) {
            trace.putMetric(b.u.toString(), a8.b());
        }
        a a9 = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Screen trace: ");
        stringBuilder.append(trace.k());
        stringBuilder.append(" _fr_tot:");
        stringBuilder.append(a8.d());
        stringBuilder.append(" _fr_slo:");
        stringBuilder.append(a8.c());
        stringBuilder.append(" _fr_fzn:");
        stringBuilder.append(a8.b());
        a9.a(stringBuilder.toString());
        return trace;
    }
}

