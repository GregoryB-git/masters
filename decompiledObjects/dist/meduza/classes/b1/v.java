package b1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import c8.r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.b1;
import e7.e2;
import e7.i6;
import e7.j2;
import e7.t6;
import e7.y4;
import g;
import gb.q1;
import i6.t;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import mobileproxy.LogWriter;
import mobileproxy.Mobileproxy;
import mobileproxy.Proxy;
import p6.a;
import p9.b;
import r9.e;
import z4.d0;

public final class v
  implements d0, t6, OnFailureListener, OnSuccessListener, Continuation, q1, b
{
  public Object a;
  
  public static v f(Object paramObject)
  {
    if (paramObject != null) {
      return new v(paramObject);
    }
    throw new NullPointerException("instance cannot be null");
  }
  
  public void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      paramString1 = a;
      if (t != null) {
        t.zzj().o.c("AppId not known when logging event", paramString2);
      }
    }
    else
    {
      ((i6)a).zzl().u(new y4(this, paramString1, paramString2, paramBundle));
    }
  }
  
  public void b()
  {
    ((AtomicLong)a).getAndAdd(1L);
  }
  
  public long c()
  {
    d0[] arrayOfd0 = (d0[])a;
    int i = arrayOfd0.length;
    int j = 0;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfd0[j].c();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    long l3 = l1;
    if (l1 == Long.MAX_VALUE) {
      l3 = Long.MIN_VALUE;
    }
    return l3;
  }
  
  public boolean d(long paramLong)
  {
    int i = 0;
    int m;
    int i3;
    do
    {
      long l1 = c();
      if (l1 == Long.MIN_VALUE) {
        break;
      }
      d0[] arrayOfd0 = (d0[])a;
      int j = arrayOfd0.length;
      int k = 0;
      int i2;
      for (m = k; k < j; m = i2)
      {
        d0 locald0 = arrayOfd0[k];
        long l2 = locald0.c();
        int n;
        if ((l2 != Long.MIN_VALUE) && (l2 <= paramLong)) {
          n = 1;
        } else {
          n = 0;
        }
        if (l2 != l1)
        {
          int i1 = m;
          if (n == 0) {}
        }
        else
        {
          i2 = m | locald0.d(paramLong);
        }
        k++;
      }
      i3 = i | m;
      i = i3;
    } while (m != 0);
    i = i3;
    return i;
  }
  
  public long g()
  {
    d0[] arrayOfd0 = (d0[])a;
    int i = arrayOfd0.length;
    int j = 0;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfd0[j].g();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    long l3 = l1;
    if (l1 == Long.MAX_VALUE) {
      l3 = Long.MIN_VALUE;
    }
    return l3;
  }
  
  public Object get()
  {
    return a;
  }
  
  public void h(long paramLong)
  {
    d0[] arrayOfd0 = (d0[])a;
    int i = arrayOfd0.length;
    for (int j = 0; j < i; j++) {
      arrayOfd0[j].h(paramLong);
    }
  }
  
  public boolean isLoading()
  {
    d0[] arrayOfd0 = (d0[])a;
    int i = arrayOfd0.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfd0[j].isLoading()) {
        return true;
      }
    }
    return false;
  }
  
  public String k(String paramString1, String paramString2)
  {
    LogWriter localLogWriter = Mobileproxy.newStderrLogWriter();
    ec.i.d(localLogWriter, "newStderrLogWriter(...)");
    paramString1 = Mobileproxy.runProxy("127.0.0.1:", Mobileproxy.newSmartStreamDialer(Mobileproxy.newListFromLines(paramString2), paramString1, localLogWriter));
    a = paramString1;
    ec.i.b(paramString1);
    paramString1 = paramString1.address();
    ec.i.d(paramString1, "address(...)");
    return paramString1;
  }
  
  public boolean m()
  {
    return (TextUtils.isEmpty(a).b)) && (((j2)a).zzj().u(3));
  }
  
  public void onFailure(Exception paramException)
  {
    if ((paramException instanceof u7.i))
    {
      r.g.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
      paramException = (r)a).c;
      int i = (int)b;
      if ((i != 30) && (i != 60) && (i != 120) && (i != 240) && (i != 480))
      {
        if (i != 960) {
          l = 30L;
        } else {
          l = 960L;
        }
      }
      else {
        l = 2L * b;
      }
      b = l;
      long l = System.currentTimeMillis();
      a = (b * 1000L + l);
      a locala = r.g;
      l = a;
      StringBuilder localStringBuilder = new StringBuilder("Scheduling refresh for ");
      localStringBuilder.append(l);
      locala.e(localStringBuilder.toString(), new Object[0]);
      e.postDelayed(f, b * 1000L);
    }
  }
  
  public void onSuccess(Object paramObject)
  {
    paramObject = (String)paramObject;
    ((TaskCompletionSource)a).setResult(new c8.a1((String)paramObject, null, null));
  }
  
  public Object then(Task paramTask)
  {
    ((e)a).getClass();
    Bundle localBundle = (Bundle)paramTask.getResult(IOException.class);
    if (localBundle != null)
    {
      paramTask = localBundle.getString("registration_id");
      if (paramTask == null)
      {
        paramTask = localBundle.getString("unregistered");
        if (paramTask == null) {}
      }
      else
      {
        return paramTask;
      }
      paramTask = localBundle.getString("error");
      if (!"RST".equals(paramTask))
      {
        if (paramTask != null) {
          throw new IOException(paramTask);
        }
        paramTask = String.valueOf(localBundle);
        Log.w("FirebaseInstanceId", g.f(new StringBuilder(paramTask.length() + 21), "Unexpected response: ", paramTask), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
      throw new IOException("INSTANCE_ID_RESET");
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
}

/* Location:
 * Qualified Name:     b1.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */