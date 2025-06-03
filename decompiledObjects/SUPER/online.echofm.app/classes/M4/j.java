package M4;

import F4.a;
import G4.h.a;
import com.google.firebase.perf.metrics.Trace;

public abstract class j
{
  public static final a a = ;
  
  public static Trace a(Trace paramTrace, h.a parama)
  {
    if (parama.d() > 0) {
      paramTrace.putMetric(b.s.toString(), parama.d());
    }
    if (parama.c() > 0) {
      paramTrace.putMetric(b.t.toString(), parama.c());
    }
    if (parama.b() > 0) {
      paramTrace.putMetric(b.u.toString(), parama.b());
    }
    a locala = a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Screen trace: ");
    localStringBuilder.append(paramTrace.k());
    localStringBuilder.append(" _fr_tot:");
    localStringBuilder.append(parama.d());
    localStringBuilder.append(" _fr_slo:");
    localStringBuilder.append(parama.c());
    localStringBuilder.append(" _fr_fzn:");
    localStringBuilder.append(parama.b());
    locala.a(localStringBuilder.toString());
    return paramTrace;
  }
}

/* Location:
 * Qualified Name:     M4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */