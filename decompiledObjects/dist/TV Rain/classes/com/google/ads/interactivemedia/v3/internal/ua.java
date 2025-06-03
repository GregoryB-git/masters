package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ua
  implements tt
{
  private final Context a;
  private final List<vc> b;
  private final tt c;
  private tt d;
  private tt e;
  private tt f;
  private tt g;
  private tt h;
  private tt i;
  private tt j;
  private tt k;
  
  public ua(Context paramContext, tt paramtt)
  {
    a = paramContext.getApplicationContext();
    c = ((tt)rp.a(paramtt));
    b = new ArrayList();
  }
  
  private final void a(tt paramtt)
  {
    for (int m = 0; m < b.size(); m++) {
      paramtt.a((vc)b.get(m));
    }
  }
  
  private static void a(tt paramtt, vc paramvc)
  {
    if (paramtt != null) {
      paramtt.a(paramvc);
    }
  }
  
  private final tt d()
  {
    if (e == null)
    {
      tn localtn = new tn(a);
      e = localtn;
      a(localtn);
    }
    return e;
  }
  
  private final tt e()
  {
    if (g == null)
    {
      try
      {
        tt localtt = (tt)Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
        g = localtt;
        a(localtt);
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Error instantiating RTMP extension", localException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
      }
      if (g == null) {
        g = c;
      }
    }
    return g;
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    return ((tt)rp.a(k)).a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final long a(tx paramtx)
    throws IOException
  {
    boolean bool;
    if (k == null) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    Object localObject = a.getScheme();
    if (wl.a(a))
    {
      localObject = a.getPath();
      if ((localObject != null) && (((String)localObject).startsWith("/android_asset/")))
      {
        k = d();
      }
      else
      {
        if (d == null)
        {
          localObject = new uf();
          d = ((tt)localObject);
          a((tt)localObject);
        }
        k = d;
      }
    }
    else if ("asset".equals(localObject))
    {
      k = d();
    }
    else if ("content".equals(localObject))
    {
      if (f == null)
      {
        localObject = new tr(a);
        f = ((tt)localObject);
        a((tt)localObject);
      }
      k = f;
    }
    else if ("rtmp".equals(localObject))
    {
      k = e();
    }
    else if ("udp".equals(localObject))
    {
      if (h == null)
      {
        localObject = new vf();
        h = ((tt)localObject);
        a((tt)localObject);
      }
      k = h;
    }
    else if ("data".equals(localObject))
    {
      if (i == null)
      {
        localObject = new tq();
        i = ((tt)localObject);
        a((tt)localObject);
      }
      k = i;
    }
    else if ("rawresource".equals(localObject))
    {
      if (j == null)
      {
        localObject = new vb(a);
        j = ((tt)localObject);
        a((tt)localObject);
      }
      k = j;
    }
    else
    {
      k = c;
    }
    return k.a(paramtx);
  }
  
  public final Uri a()
  {
    tt localtt = k;
    if (localtt == null) {
      return null;
    }
    return localtt.a();
  }
  
  public final void a(vc paramvc)
  {
    c.a(paramvc);
    b.add(paramvc);
    a(d, paramvc);
    a(e, paramvc);
    a(f, paramvc);
    a(g, paramvc);
    a(h, paramvc);
    a(i, paramvc);
    a(j, paramvc);
  }
  
  public final Map<String, List<String>> b()
  {
    tt localtt = k;
    if (localtt == null) {
      return Collections.emptyMap();
    }
    return localtt.b();
  }
  
  public final void c()
    throws IOException
  {
    tt localtt = k;
    if (localtt != null) {
      try
      {
        localtt.c();
        return;
      }
      finally
      {
        k = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ua
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */