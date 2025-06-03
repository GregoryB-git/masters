package d2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import b.z;
import b8.g;
import b8.p;
import c2.f;
import c8.k1;
import c8.m;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e7.a1;
import e7.b1;
import e7.c3;
import e7.e2;
import e7.e3;
import e7.f1;
import e7.g3;
import e7.h;
import e7.i6;
import e7.j2;
import e7.k3;
import e7.l1;
import e7.r6;
import e7.t6;
import e7.w1;
import e7.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m6.j;
import nc.g0;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;
import v6.b;

public class q
  implements ServiceWorkerClientBoundaryInterface, zzv, c3, t6, f1, Continuation, h8.a
{
  public Object b;
  
  public q()
  {
    b = new ArrayList();
  }
  
  public q(j2 paramj2)
  {
    j.i(paramj2);
    b = paramj2;
  }
  
  public static q g(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.length() <= 1)) {
      paramString = e3.e(paramString.charAt(0));
    } else {
      paramString = g3.b;
    }
    return new q(paramString, 2);
  }
  
  public void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      paramString1 = (k3)b;
      ((z)paramString1.zzb()).getClass();
      paramString1.E("auto", paramString2, paramBundle, true, true, System.currentTimeMillis());
      return;
    }
    ((j2)b).b).getClass();
    throw new IllegalStateException("Unexpected call on client side");
  }
  
  public final void c(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map paramMap)
  {
    ((i6)b).s(paramString, paramInt, paramThrowable, paramArrayOfByte, paramMap);
  }
  
  public final void d(Bundle paramBundle)
  {
    ((w7.a)b).b("clx", "_ae", paramBundle);
  }
  
  public final void e(Object paramObject)
  {
    ((ArrayList)b).add(String.valueOf(paramObject));
  }
  
  public final void f(Object paramObject, String paramString)
  {
    ArrayList localArrayList = (ArrayList)b;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("=");
    localStringBuilder.append(paramObject);
    localArrayList.add(localStringBuilder.toString());
  }
  
  public final String[] getSupportedFeatures()
  {
    return new String[] { "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST" };
  }
  
  public final h h()
  {
    return b).o;
  }
  
  public final x0 i()
  {
    return b).u;
  }
  
  public final l1 j()
  {
    return ((j2)b).j();
  }
  
  public final r6 k()
  {
    return ((j2)b).m();
  }
  
  public void l()
  {
    ((j2)b).zzl().l();
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebResourceRequest paramWebResourceRequest)
  {
    return ((f)b).shouldInterceptRequest(paramWebResourceRequest);
  }
  
  public final Object then(Task paramTask)
  {
    if (b).d == null) {
      return paramTask;
    }
    if (paramTask.isSuccessful())
    {
      paramTask = (g)paramTask.getResult();
      return Tasks.forResult(new k1(paramTask.z(), paramTask.s(), b).d));
    }
    paramTask = paramTask.getException();
    if ((paramTask instanceof p)) {
      b = b).d;
    }
    return Tasks.forException(paramTask);
  }
  
  public final String toString()
  {
    switch (a)
    {
    default: 
      return super.toString();
    }
    return ((ArrayList)b).toString();
  }
  
  public final Context zza()
  {
    return b).a;
  }
  
  public final void zza(zzs paramzzs, String paramString, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = e7.c2.a[paramzzs.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            paramzzs = b).zzj().u;
          } else {
            paramzzs = b).zzj().w;
          }
        }
        else
        {
          paramzzs = ((w1)b).zzj();
          if (paramBoolean1) {
            paramzzs = s;
          } else if (!paramBoolean2) {
            paramzzs = t;
          } else {
            paramzzs = r;
          }
        }
      }
      else
      {
        paramzzs = ((w1)b).zzj();
        if (paramBoolean1) {
          paramzzs = p;
        } else if (!paramBoolean2) {
          paramzzs = q;
        } else {
          paramzzs = o;
        }
      }
    }
    else {
      paramzzs = b).zzj().v;
    }
    i = paramList.size();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          paramzzs.b(paramString);
          return;
        }
        paramzzs.a(paramList.get(0), paramList.get(1), paramList.get(2), paramString);
        return;
      }
      paramzzs.d(paramString, paramList.get(0), paramList.get(1));
      return;
    }
    paramzzs.c(paramString, paramList.get(0));
  }
  
  public final b zzb()
  {
    return b).v;
  }
  
  public final g0 zzd()
  {
    return b).f;
  }
  
  public final a1 zzj()
  {
    return ((j2)b).zzj();
  }
  
  public final e2 zzl()
  {
    return ((j2)b).zzl();
  }
}

/* Location:
 * Qualified Name:     d2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */