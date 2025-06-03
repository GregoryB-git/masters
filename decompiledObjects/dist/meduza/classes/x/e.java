package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b0.a;
import b0.b;
import b0.c;
import b0.k;
import b0.l.a;
import b0.p;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.b0.a;
import p2.m0;
import w.d.b;
import w.d.c;
import w.d.e;
import w.f.e;

public final class e
{
  public static final l a;
  public static final r.f<String, Typeface> b = new r.f(16);
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 29) {
      localObject = new j();
    }
    for (;;)
    {
      a = (l)localObject;
      break;
      if (i >= 28)
      {
        localObject = new i();
      }
      else if (i >= 26)
      {
        localObject = new h();
      }
      else
      {
        if (i >= 24)
        {
          localObject = g.c;
          if (localObject == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
          }
          if (localObject != null) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            localObject = new g();
            continue;
          }
        }
        localObject = new f();
      }
    }
  }
  
  public static Typeface a(Context paramContext, d.b arg1, Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3, b0.a parama)
  {
    if ((??? instanceof d.e))
    {
      Object localObject1 = (d.e)???;
      ??? = d;
      Object localObject2 = null;
      int i = 0;
      if ((??? != null) && (!???.isEmpty()))
      {
        ??? = Typeface.create(???, 0);
        localObject3 = Typeface.create(Typeface.DEFAULT, 0);
        if ((??? != null) && (!???.equals(localObject3))) {}
      }
      else
      {
        ??? = null;
      }
      if (??? != null)
      {
        parama.b(???);
        return (Typeface)???;
      }
      if (c == 0) {
        i = 1;
      }
      int j = b;
      Object localObject3 = new Handler(Looper.getMainLooper());
      Object localObject4 = new a(parama);
      localObject1 = a;
      parama = new c((a)localObject4, (Handler)localObject3);
      String str;
      if (i != 0)
      {
        ??? = b0.l.a;
        ??? = new StringBuilder();
        ???.append(e);
        ???.append("-");
        ???.append(paramInt3);
        str = ???.toString();
        ??? = (Typeface)b0.l.a.get(str);
        if (??? != null)
        {
          ((Handler)localObject3).post(new a((m0)localObject4, ???));
          paramContext = ???;
        }
        else if (j == -1)
        {
          paramContext = b0.l.a(str, paramContext, (b0.g)localObject1, paramInt3);
          parama.a(paramContext);
          paramContext = a;
        }
        else
        {
          paramContext = new b0.h(str, paramContext, (b0.g)localObject1, paramInt3);
          try
          {
            paramContext = b0.l.b.submit(paramContext);
            long l = j;
            try
            {
              paramContext = paramContext.get(l, TimeUnit.MILLISECONDS);
              paramContext = (l.a)paramContext;
              parama.a(paramContext);
              paramContext = a;
            }
            catch (TimeoutException paramContext)
            {
              paramContext = new java/lang/InterruptedException;
              paramContext.<init>("timeout");
              throw paramContext;
            }
            catch (InterruptedException paramContext)
            {
              throw paramContext;
            }
            catch (ExecutionException paramContext)
            {
              ??? = new java/lang/RuntimeException;
              ???.<init>(paramContext);
              throw ???;
            }
            ??? = b0.l.a;
          }
          catch (InterruptedException paramContext)
          {
            paramContext = a;
            b.post(new b(paramContext, -3));
            paramContext = (Context)localObject2;
          }
        }
      }
      else
      {
        ??? = new StringBuilder();
        ???.append(e);
        ???.append("-");
        ???.append(paramInt3);
        str = ???.toString();
        ??? = (Typeface)b0.l.a.get(str);
        if (??? != null)
        {
          ((Handler)localObject3).post(new a((m0)localObject4, ???));
          paramContext = ???;
        }
        else
        {
          parama = new b0.i(parama);
          synchronized (b0.l.c)
          {
            localObject3 = b0.l.d;
            localObject4 = (ArrayList)((r.h)localObject3).getOrDefault(str, null);
            if (localObject4 != null)
            {
              ((ArrayList)localObject4).add(parama);
              paramContext = (Context)localObject2;
            }
            else
            {
              localObject4 = new java/util/ArrayList;
              ((ArrayList)localObject4).<init>();
              ((ArrayList)localObject4).add(parama);
              ((r.h)localObject3).put(str, localObject4);
              parama = new b0.j(str, paramContext, (b0.g)localObject1, paramInt3);
              ??? = b0.l.b;
              localObject1 = new k(str);
              if (Looper.myLooper() == null) {
                paramContext = new Handler(Looper.getMainLooper());
              } else {
                paramContext = new Handler();
              }
              ???.execute(new p(paramContext, parama, (k)localObject1));
              paramContext = (Context)localObject2;
            }
          }
        }
      }
    }
    else
    {
      paramContext = a.a(paramContext, (d.c)???, paramResources, paramInt3);
      if (paramContext != null) {
        parama.b(paramContext);
      } else {
        parama.a();
      }
    }
    if (paramContext != null) {
      b.put(b(paramResources, paramInt1, paramString, paramInt2, paramInt3), paramContext);
    }
    return paramContext;
  }
  
  public static String b(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    localStringBuilder.append('-');
    localStringBuilder.append(paramString);
    localStringBuilder.append('-');
    localStringBuilder.append(paramInt2);
    localStringBuilder.append('-');
    localStringBuilder.append(paramInt1);
    localStringBuilder.append('-');
    localStringBuilder.append(paramInt3);
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends m0
  {
    public f.e E;
    
    public a(b0.a parama)
    {
      E = parama;
    }
  }
}

/* Location:
 * Qualified Name:     x.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */