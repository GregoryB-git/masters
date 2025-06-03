// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import G4.h;
import com.google.firebase.perf.metrics.Trace;
import F4.a;

public abstract class j
{
    public static final a a;
    
    static {
        a = F4.a.e();
    }
    
    public static Trace a(final Trace trace, final h.a a) {
        if (a.d() > 0) {
            trace.putMetric(b.s.toString(), a.d());
        }
        if (a.c() > 0) {
            trace.putMetric(b.t.toString(), a.c());
        }
        if (a.b() > 0) {
            trace.putMetric(b.u.toString(), a.b());
        }
        final a a2 = j.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Screen trace: ");
        sb.append(trace.k());
        sb.append(" _fr_tot:");
        sb.append(a.d());
        sb.append(" _fr_slo:");
        sb.append(a.c());
        sb.append(" _fr_fzn:");
        sb.append(a.b());
        a2.a(sb.toString());
        return trace;
    }
}
