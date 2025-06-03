package R2;

import A2.n;
import com.google.android.gms.internal.measurement.n6;

public final class d3
  implements Runnable
{
  public d3(R2 paramR2, W5 paramW5) {}
  
  public final void run()
  {
    R2.o(p).o0();
    D5 localD5 = R2.o(p);
    W5 localW5 = o;
    localD5.e().n();
    localD5.p0();
    n.e(o);
    int i;
    if ((n6.a()) && (localD5.c0().s(K.T0))) {
      i = O;
    } else {
      i = 100;
    }
    Object localObject = q3.f(J, i);
    q3 localq3 = localD5.Q(o);
    localD5.j().K().c("Setting consent, package, consent", o, localObject);
    localD5.B(o, (q3)localObject);
    if (((q3)localObject).t(localq3)) {
      localD5.b0(localW5);
    }
    if ((n6.a()) && (localD5.c0().s(K.T0)))
    {
      localObject = z.c(P);
      if (!z.f.equals(localObject))
      {
        localD5.j().K().c("Setting DMA consent. package, consent", o, localObject);
        localD5.A(o, (z)localObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     R2.d3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */