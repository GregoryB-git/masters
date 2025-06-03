package R3;

import T3.h.a;
import T3.n;
import V3.l;
import V3.r;
import X3.b;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import c4.a;
import c4.d.a;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import s3.e.a;

public class i
  implements l
{
  public final Context a;
  public final Set b = new HashSet();
  public final s3.e c;
  
  public i(s3.e parame)
  {
    c = parame;
    if (parame != null)
    {
      a = parame.m();
      return;
    }
    Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
    Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
  }
  
  public r a(V3.f paramf)
  {
    return new a(paramf.q("RunLoop"));
  }
  
  public c4.d b(V3.f paramf, d.a parama, List paramList)
  {
    return new a(parama, paramList);
  }
  
  public File c()
  {
    return a.getApplicationContext().getDir("sslcache", 0);
  }
  
  public T3.h d(final V3.f paramf, T3.c paramc, T3.f paramf1, h.a parama)
  {
    paramf = new n(paramc, paramf1, parama);
    c.g(new b(paramf));
    return paramf;
  }
  
  public String e(V3.f paramf)
  {
    paramf = new StringBuilder();
    paramf.append(Build.VERSION.SDK_INT);
    paramf.append("/Android");
    return paramf.toString();
  }
  
  public X3.e f(V3.f paramf, String paramString)
  {
    String str = paramf.x();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("_");
    localStringBuilder.append(str);
    paramString = localStringBuilder.toString();
    if (!b.contains(paramString))
    {
      b.add(paramString);
      return new b(paramf, new j(a, paramf, paramString), new X3.c(paramf.s()));
    }
    paramf = new StringBuilder();
    paramf.append("SessionPersistenceKey '");
    paramf.append(str);
    paramf.append("' has already been used.");
    throw new Q3.d(paramf.toString());
  }
  
  public V3.j g(V3.f paramf)
  {
    return new h();
  }
  
  public class a
    extends Y3.c
  {
    public a(c4.c paramc) {}
    
    public void g(final Throwable paramThrowable)
    {
      final String str = Y3.c.h(paramThrowable);
      b.c(str, paramThrowable);
      new Handler(i.h(i.this).getMainLooper()).post(new a(str, paramThrowable));
      d().shutdownNow();
    }
    
    public class a
      implements Runnable
    {
      public a(String paramString, Throwable paramThrowable) {}
      
      public void run()
      {
        throw new RuntimeException(str, paramThrowable);
      }
    }
  }
  
  public class b
    implements e.a
  {
    public b(T3.h paramh) {}
    
    public void a(boolean paramBoolean)
    {
      if (paramBoolean) {
        paramf.j("app_in_background");
      } else {
        paramf.p("app_in_background");
      }
    }
  }
}

/* Location:
 * Qualified Name:     R3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */