package l6;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ConcurrentHashMap;
import m6.g;
import m6.k;
import m6.l;

public final class k0
  implements OnCompleteListener
{
  public final d a;
  public final int b;
  public final a c;
  public final long d;
  public final long e;
  
  public k0(d paramd, int paramInt, a parama, long paramLong1, long paramLong2)
  {
    a = paramd;
    b = paramInt;
    c = parama;
    d = paramLong1;
    e = paramLong2;
  }
  
  public static m6.b a(d0 paramd0, com.google.android.gms.common.internal.a parama, int paramInt)
  {
    parama = parama.getTelemetryConfiguration();
    if ((parama != null) && (b))
    {
      int[] arrayOfInt = d;
      int i = 0;
      int j = 0;
      int k;
      int m;
      if (arrayOfInt == null)
      {
        arrayOfInt = f;
        if (arrayOfInt != null)
        {
          for (k = 0;; k++)
          {
            m = j;
            if (k >= arrayOfInt.length) {
              break;
            }
            if (arrayOfInt[k] == paramInt)
            {
              m = 1;
              break;
            }
          }
          if (m != 0) {
            break label140;
          }
        }
      }
      else
      {
        for (k = 0;; k++)
        {
          m = i;
          if (k >= arrayOfInt.length) {
            break;
          }
          if (arrayOfInt[k] == paramInt)
          {
            m = 1;
            break;
          }
        }
        if (m == 0) {
          break label140;
        }
      }
      if (z < e) {
        return parama;
      }
    }
    label140:
    return null;
  }
  
  public final void onComplete(Task paramTask)
  {
    if (a.b())
    {
      Object localObject1 = aa;
      if ((localObject1 == null) || (b))
      {
        Object localObject2 = a;
        Object localObject3 = c;
        localObject3 = (d0)r.get(localObject3);
        if (localObject3 != null)
        {
          localObject2 = b;
          if ((localObject2 instanceof com.google.android.gms.common.internal.a))
          {
            localObject2 = (com.google.android.gms.common.internal.a)localObject2;
            long l1 = d;
            int i = 1;
            int j = 0;
            int k;
            if (l1 > 0L) {
              k = 1;
            } else {
              k = 0;
            }
            int m = ((com.google.android.gms.common.internal.a)localObject2).getGCoreServiceId();
            int n = 100;
            int i2;
            int i3;
            int i4;
            int i5;
            if (localObject1 != null)
            {
              int i1 = k & c;
              i2 = d;
              i3 = e;
              i4 = a;
              k = i1;
              i5 = i3;
              if (((com.google.android.gms.common.internal.a)localObject2).hasConnectionInfo())
              {
                k = i1;
                i5 = i3;
                if (!((com.google.android.gms.common.internal.a)localObject2).isConnecting())
                {
                  localObject1 = a((d0)localObject3, (com.google.android.gms.common.internal.a)localObject2, b);
                  if (localObject1 == null) {
                    return;
                  }
                  if ((c) && (d > 0L)) {
                    k = i;
                  } else {
                    k = 0;
                  }
                  i5 = e;
                }
              }
              i = i5;
              i3 = k;
            }
            else
            {
              i4 = 0;
              i = 100;
              i2 = 5000;
              i3 = k;
            }
            localObject1 = a;
            if (paramTask.isSuccessful())
            {
              i5 = 0;
              k = j;
            }
            else
            {
              if (paramTask.isCanceled())
              {
                k = n;
              }
              else
              {
                paramTask = paramTask.getException();
                if (!(paramTask instanceof k6.b)) {
                  break label335;
                }
                paramTask = ((k6.b)paramTask).getStatus();
                k = a;
                paramTask = d;
                if (paramTask == null) {
                  break label339;
                }
              }
              i5 = b;
              break label342;
              label335:
              k = 101;
              label339:
              i5 = -1;
            }
            label342:
            long l2;
            long l3;
            if (i3 != 0)
            {
              l2 = d;
              l3 = e;
              l1 = System.currentTimeMillis();
              i3 = (int)(SystemClock.elapsedRealtime() - l3);
              l3 = l1;
            }
            else
            {
              l1 = 0L;
              l3 = l1;
              i3 = -1;
              l2 = l1;
            }
            paramTask = new g(b, k, i5, l2, l3, null, null, m, i3);
            l1 = i2;
            localObject1.getClass();
            paramTask = new l0(paramTask, i4, l1, i);
            paramTask = v.obtainMessage(18, paramTask);
            v.sendMessage(paramTask);
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     l6.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */