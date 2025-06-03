package y0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import sb.u;
import w.g;
import x0.t;
import x0.y;

public final class b
{
  public static c a = c.c;
  
  public static c a(x0.i parami)
  {
    while (parami != null)
    {
      if (parami.isAdded()) {
        ec.i.d(parami.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
      }
      parami = parami.getParentFragment();
    }
    return a;
  }
  
  public static void b(c paramc, k paramk)
  {
    x0.i locali = a;
    String str = locali.getClass().getName();
    if (a.contains(a.a))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Policy violation in ");
      localStringBuilder.append(str);
      Log.d("FragmentStrictMode", localStringBuilder.toString(), paramk);
    }
    paramc.getClass();
    if (a.contains(a.b)) {
      e(locali, new g(4, str, paramk));
    }
  }
  
  public static void c(k paramk)
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = f.l("StrictMode violation in ");
      localStringBuilder.append(a.getClass().getName());
      Log.d("FragmentManager", localStringBuilder.toString(), paramk);
    }
  }
  
  public static final void d(x0.i parami, String paramString)
  {
    ec.i.e(parami, "fragment");
    ec.i.e(paramString, "previousFragmentId");
    paramString = new a(parami, paramString);
    c(paramString);
    c localc = a(parami);
    if ((a.contains(a.c)) && (f(localc, parami.getClass(), a.class))) {
      b(localc, paramString);
    }
  }
  
  public static void e(x0.i parami, Runnable paramRunnable)
  {
    if (parami.isAdded())
    {
      parami = getParentFragmentManagerw.c;
      if (!ec.i.a(parami.getLooper(), Looper.myLooper()))
      {
        parami.post(paramRunnable);
        return;
      }
    }
    paramRunnable.run();
  }
  
  public static boolean f(c paramc, Class paramClass1, Class paramClass2)
  {
    paramClass1 = paramClass1.getName();
    paramc = (Set)b.get(paramClass1);
    if (paramc == null) {
      return true;
    }
    if ((!ec.i.a(paramClass2.getSuperclass(), k.class)) && (paramc.contains(paramClass2.getSuperclass()))) {
      return false;
    }
    return paramc.contains(paramClass2) ^ true;
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("PENALTY_LOG", 0);
      a = locala1;
      a locala2 = new a("PENALTY_DEATH", 1);
      b = locala2;
      a locala3 = new a("DETECT_FRAGMENT_REUSE", 2);
      c = locala3;
      a locala4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
      d = locala4;
      a locala5 = new a("DETECT_WRONG_NESTED_HIERARCHY", 4);
      e = locala5;
      a locala6 = new a("DETECT_RETAIN_INSTANCE_USAGE", 5);
      f = locala6;
      a locala7 = new a("DETECT_SET_USER_VISIBLE_HINT", 6);
      o = locala7;
      a locala8 = new a("DETECT_TARGET_FRAGMENT_USAGE", 7);
      p = locala8;
      a locala9 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
      q = locala9;
      r = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9 };
    }
    
    public a() {}
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
  
  public static final class c
  {
    public static final c c = new c();
    public final Set<b.a> a;
    public final LinkedHashMap b;
    
    public c()
    {
      a = localu;
      b = new LinkedHashMap();
    }
  }
}

/* Location:
 * Qualified Name:     y0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */