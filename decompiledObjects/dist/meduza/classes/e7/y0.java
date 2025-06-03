package e7;

import android.content.Context;
import android.os.SystemClock;
import c5.e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import m6.g;
import m6.m;
import m6.n;
import m6.n.a;
import o6.c;

public final class y0
{
  public static y0 d;
  public static final Duration e = Duration.ofMinutes(30L);
  public final j2 a;
  public final c b;
  public final AtomicLong c = new AtomicLong(-1L);
  
  public y0(Context paramContext, j2 paramj2)
  {
    Object localObject = n.b;
    localObject = new n.a();
    a = "measurement:api";
    b = new c(paramContext, new n(a));
    a = paramj2;
  }
  
  public static y0 a(j2 paramj2)
  {
    if (d == null) {
      d = new y0(a, paramj2);
    }
    return d;
  }
  
  public final void b(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    try
    {
      a.v.getClass();
      long l1 = SystemClock.elapsedRealtime();
      if (c.get() != -1L)
      {
        long l2 = c.get();
        long l3 = e.toMillis();
        if (l1 - l2 <= l3) {}
      }
      else
      {
        i = 1;
        break label72;
      }
      int i = 0;
      label72:
      if (i == 0) {
        return;
      }
      Object localObject1 = b;
      m localm = new m6/m;
      Object localObject3 = new m6/g;
      ((g)localObject3).<init>(36301, paramInt1, 0, paramLong1, paramLong2, null, null, 0, paramInt2);
      localm.<init>(0, Arrays.asList(new g[] { localObject3 }));
      localObject1 = ((c)localObject1).a(localm);
      localObject3 = new c5/e;
      ((e)localObject3).<init>(this, l1);
      ((Task)localObject1).addOnFailureListener((OnFailureListener)localObject3);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     e7.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */