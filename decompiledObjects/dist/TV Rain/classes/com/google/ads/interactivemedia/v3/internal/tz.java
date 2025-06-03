package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.SparseArray;
import java.util.Map;

public final class tz
{
  private final Context a;
  private SparseArray<Long> b;
  private int c;
  private vh d;
  private boolean e;
  
  public tz(Context paramContext)
  {
    if (paramContext == null) {
      localObject = null;
    } else {
      localObject = paramContext.getApplicationContext();
    }
    a = ((Context)localObject);
    paramContext = wl.b(paramContext);
    Object localObject = (int[])tw.a.get(paramContext);
    paramContext = (Context)localObject;
    if (localObject == null)
    {
      paramContext = new int[4];
      Context tmp52_51 = paramContext;
      tmp52_51[0] = 2;
      Context tmp56_52 = tmp52_51;
      tmp56_52[1] = 2;
      Context tmp60_56 = tmp56_52;
      tmp60_56[2] = 2;
      Context tmp64_60 = tmp60_56;
      tmp64_60[3] = 2;
      tmp64_60;
    }
    localObject = new SparseArray(6);
    ((SparseArray)localObject).append(0, Long.valueOf(1000000L));
    long[] arrayOfLong = tw.b;
    ((SparseArray)localObject).append(2, Long.valueOf(arrayOfLong[paramContext[0]]));
    ((SparseArray)localObject).append(3, Long.valueOf(tw.c[paramContext[1]]));
    ((SparseArray)localObject).append(4, Long.valueOf(tw.d[paramContext[2]]));
    ((SparseArray)localObject).append(5, Long.valueOf(tw.e[paramContext[3]]));
    ((SparseArray)localObject).append(7, Long.valueOf(arrayOfLong[paramContext[0]]));
    b = ((SparseArray)localObject);
    c = 2000;
    d = vh.a;
    e = true;
  }
  
  public final tw a()
  {
    return new tw(a, b, c, d, e, (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */