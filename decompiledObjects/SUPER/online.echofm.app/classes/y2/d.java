package y2;

import A2.c;
import A2.n;
import V2.j;
import V2.k;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import z2.C;
import z2.M;
import z2.b;
import z2.i;
import z2.m;
import z2.p;
import z2.x;

public abstract class d
{
  public final Context a;
  public final String b;
  public final a c;
  public final a.d d;
  public final b e;
  public final Looper f;
  public final int g;
  public final e h;
  public final z2.l i;
  public final z2.e j;
  
  public d(Context paramContext, Activity paramActivity, a parama, a.d paramd, a parama1)
  {
    n.j(paramContext, "Null context is not permitted.");
    n.j(parama, "Api must not be null.");
    n.j(parama1, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    a = paramContext.getApplicationContext();
    boolean bool = E2.l.k();
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (bool) {}
    try
    {
      localObject2 = (String)Context.class.getMethod("getAttributionTag", new Class[0]).invoke(paramContext, new Object[0]);
      b = ((String)localObject2);
      c = parama;
      d = paramd;
      f = b;
      paramContext = b.a(parama, paramd, (String)localObject2);
      e = paramContext;
      h = new C(this);
      parama = z2.e.x(a);
      j = parama;
      g = parama.m();
      i = a;
      if ((paramActivity != null) && (!(paramActivity instanceof GoogleApiActivity)) && (Looper.myLooper() == Looper.getMainLooper())) {
        p.u(paramActivity, parama, paramContext);
      }
      parama.b(this);
      return;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramContext)
    {
      for (;;)
      {
        localObject2 = localObject1;
      }
    }
  }
  
  public d(Context paramContext, a parama, a.d paramd, a parama1)
  {
    this(paramContext, null, parama, paramd, parama1);
  }
  
  public A2.d.a b()
  {
    A2.d.a locala = new A2.d.a();
    locala.d(null);
    locala.c(Collections.emptySet());
    locala.e(a.getClass().getName());
    locala.b(a.getPackageName());
    return locala;
  }
  
  public j c(m paramm)
  {
    return i(2, paramm);
  }
  
  public final b d()
  {
    return e;
  }
  
  public String e()
  {
    return b;
  }
  
  public final int f()
  {
    return g;
  }
  
  public final a.f g(Looper paramLooper, x paramx)
  {
    A2.d locald = b().a();
    paramx = ((a.a)n.i(c.a())).a(a, paramLooper, locald, d, paramx, paramx);
    paramLooper = e();
    if ((paramLooper != null) && ((paramx instanceof c))) {
      ((c)paramx).P(paramLooper);
    }
    if ((paramLooper != null) && ((paramx instanceof i)))
    {
      paramLooper = (i)paramx;
      throw null;
    }
    return paramx;
  }
  
  public final M h(Context paramContext, Handler paramHandler)
  {
    return new M(paramContext, paramHandler, b().a());
  }
  
  public final j i(int paramInt, m paramm)
  {
    k localk = new k();
    j.D(this, paramInt, paramm, localk, i);
    return localk.a();
  }
  
  public static class a
  {
    public static final a c = new a().a();
    public final z2.l a;
    public final Looper b;
    
    public a(z2.l paraml, Account paramAccount, Looper paramLooper)
    {
      a = paraml;
      b = paramLooper;
    }
    
    public static class a
    {
      public z2.l a;
      public Looper b;
      
      public d.a a()
      {
        if (a == null) {
          a = new z2.a();
        }
        if (b == null) {
          b = Looper.getMainLooper();
        }
        return new d.a(a, null, b, null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     y2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */