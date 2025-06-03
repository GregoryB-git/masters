package H3;

import J3.B;
import J3.B.a;
import J3.B.a.a;
import J3.B.a.a.a;
import J3.B.a.b;
import J3.B.b;
import J3.B.e;
import J3.B.e.a;
import J3.B.e.a.a;
import J3.B.e.b;
import J3.B.e.c;
import J3.B.e.c.a;
import J3.B.e.d;
import J3.B.e.d.a;
import J3.B.e.d.a.a;
import J3.B.e.d.a.b;
import J3.B.e.d.a.b.a;
import J3.B.e.d.a.b.a.a;
import J3.B.e.d.a.b.b;
import J3.B.e.d.a.b.c;
import J3.B.e.d.a.b.c.a;
import J3.B.e.d.a.b.d;
import J3.B.e.d.a.b.d.a;
import J3.B.e.d.a.b.e;
import J3.B.e.d.a.b.e.a;
import J3.B.e.d.a.b.e.b;
import J3.B.e.d.a.b.e.b.a;
import J3.B.e.d.b;
import J3.B.e.d.c;
import J3.B.e.d.c.a;
import J3.B.e.e;
import J3.B.e.e.a;
import O3.d.a;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class u
{
  public static final Map f;
  public static final String g = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] { "18.5.1" });
  public final Context a;
  public final C b;
  public final a c;
  public final P3.d d;
  public final O3.i e;
  
  static
  {
    HashMap localHashMap = new HashMap();
    f = localHashMap;
    localHashMap.put("armeabi", Integer.valueOf(5));
    localHashMap.put("armeabi-v7a", Integer.valueOf(6));
    localHashMap.put("arm64-v8a", Integer.valueOf(9));
    localHashMap.put("x86", Integer.valueOf(0));
    localHashMap.put("x86_64", Integer.valueOf(1));
  }
  
  public u(Context paramContext, C paramC, a parama, P3.d paramd, O3.i parami)
  {
    a = paramContext;
    b = paramC;
    c = parama;
    d = paramd;
    e = parami;
  }
  
  public static long f(long paramLong)
  {
    if (paramLong <= 0L) {
      paramLong = 0L;
    }
    return paramLong;
  }
  
  public static int g()
  {
    Object localObject = Build.CPU_ABI;
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return 7;
    }
    localObject = (Integer)f.get(((String)localObject).toLowerCase(Locale.US));
    if (localObject == null) {
      return 7;
    }
    return ((Integer)localObject).intValue();
  }
  
  public final B.a a(B.a parama)
  {
    Object localObject;
    if ((e.b().b.c) && (c.c.size() > 0))
    {
      ArrayList localArrayList = new ArrayList();
      localObject = c.c.iterator();
      while (((Iterator)localObject).hasNext())
      {
        f localf = (f)((Iterator)localObject).next();
        localArrayList.add(B.a.a.a().d(localf.c()).b(localf.a()).c(localf.b()).a());
      }
      localObject = J3.C.a(localArrayList);
    }
    else
    {
      localObject = null;
    }
    return B.a.a().c(parama.c()).e(parama.e()).g(parama.g()).i(parama.i()).d(parama.d()).f(parama.f()).h(parama.h()).j(parama.j()).b((J3.C)localObject).a();
  }
  
  public final B.b b()
  {
    return B.b().k("18.5.1").g(c.a).h(b.a().c()).f(b.a().d()).d(c.f).e(c.g).j(4);
  }
  
  public B.e.d c(B.a parama)
  {
    int i = a.getResources().getConfiguration().orientation;
    return B.e.d.a().f("anr").e(parama.i()).b(j(i, a(parama))).c(l(i)).a();
  }
  
  public B.e.d d(Throwable paramThrowable, Thread paramThread, String paramString, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = a.getResources().getConfiguration().orientation;
    paramThrowable = P3.e.a(paramThrowable, d);
    return B.e.d.a().f(paramString).e(paramLong).b(k(i, paramThrowable, paramThread, paramInt1, paramInt2, paramBoolean)).c(l(i)).a();
  }
  
  public B e(String paramString, long paramLong)
  {
    return b().l(t(paramString, paramLong)).a();
  }
  
  public final B.e.d.a.b.a h()
  {
    return B.e.d.a.b.a.a().b(0L).d(0L).c(c.e).e(c.b).a();
  }
  
  public final J3.C i()
  {
    return J3.C.d(new B.e.d.a.b.a[] { h() });
  }
  
  public final B.e.d.a j(int paramInt, B.a parama)
  {
    boolean bool;
    if (parama.c() != 100) {
      bool = true;
    } else {
      bool = false;
    }
    return B.e.d.a.a().b(Boolean.valueOf(bool)).f(paramInt).d(o(parama)).a();
  }
  
  public final B.e.d.a k(int paramInt1, P3.e parame, Thread paramThread, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject = i.i(c.e, a);
    if (localObject != null)
    {
      boolean bool;
      if (importance != 100) {
        bool = true;
      } else {
        bool = false;
      }
      localObject = Boolean.valueOf(bool);
    }
    else
    {
      localObject = null;
    }
    return B.e.d.a.a().b((Boolean)localObject).f(paramInt1).d(p(parame, paramThread, paramInt2, paramInt3, paramBoolean)).a();
  }
  
  public final B.e.d.c l(int paramInt)
  {
    e locale = e.a(a);
    Object localObject = locale.b();
    if (localObject != null) {
      localObject = Double.valueOf(((Float)localObject).doubleValue());
    } else {
      localObject = null;
    }
    int i = locale.c();
    boolean bool = i.o(a);
    long l1 = f(i.b(a) - i.a(a));
    long l2 = i.c(Environment.getDataDirectory().getPath());
    return B.e.d.c.a().b((Double)localObject).c(i).f(bool).e(paramInt).g(l1).d(l2).a();
  }
  
  public final B.e.d.a.b.c m(P3.e parame, int paramInt1, int paramInt2)
  {
    return n(parame, paramInt1, paramInt2, 0);
  }
  
  public final B.e.d.a.b.c n(P3.e parame, int paramInt1, int paramInt2, int paramInt3)
  {
    String str1 = b;
    String str2 = a;
    StackTraceElement[] arrayOfStackTraceElement = c;
    int i = 0;
    int j = 0;
    if (arrayOfStackTraceElement == null) {
      arrayOfStackTraceElement = new StackTraceElement[0];
    }
    P3.e locale = d;
    if (paramInt3 >= paramInt2)
    {
      parame = locale;
      for (;;)
      {
        i = j;
        if (parame == null) {
          break;
        }
        parame = d;
        j++;
      }
    }
    parame = B.e.d.a.b.c.a().f(str1).e(str2).c(J3.C.a(r(arrayOfStackTraceElement, paramInt1))).d(i);
    if ((locale != null) && (i == 0)) {
      parame.b(n(locale, paramInt1, paramInt2, paramInt3 + 1));
    }
    return parame.a();
  }
  
  public final B.e.d.a.b o(B.a parama)
  {
    return B.e.d.a.b.a().b(parama).e(w()).c(i()).a();
  }
  
  public final B.e.d.a.b p(P3.e parame, Thread paramThread, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return B.e.d.a.b.a().f(z(parame, paramThread, paramInt1, paramBoolean)).d(m(parame, paramInt1, paramInt2)).e(w()).c(i()).a();
  }
  
  public final B.e.d.a.b.e.b q(StackTraceElement paramStackTraceElement, B.e.d.a.b.e.b.a parama)
  {
    boolean bool = paramStackTraceElement.isNativeMethod();
    long l1 = 0L;
    long l2;
    if (bool) {
      l2 = Math.max(paramStackTraceElement.getLineNumber(), 0L);
    } else {
      l2 = 0L;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramStackTraceElement.getClassName());
    ((StringBuilder)localObject).append(".");
    ((StringBuilder)localObject).append(paramStackTraceElement.getMethodName());
    localObject = ((StringBuilder)localObject).toString();
    String str = paramStackTraceElement.getFileName();
    long l3 = l1;
    if (!paramStackTraceElement.isNativeMethod())
    {
      l3 = l1;
      if (paramStackTraceElement.getLineNumber() > 0) {
        l3 = paramStackTraceElement.getLineNumber();
      }
    }
    return parama.e(l2).f((String)localObject).b(str).d(l3).a();
  }
  
  public final J3.C r(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfStackTraceElement.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(q(paramArrayOfStackTraceElement[j], B.e.d.a.b.e.b.a().c(paramInt)));
    }
    return J3.C.a(localArrayList);
  }
  
  public final B.e.a s()
  {
    return B.e.a.a().e(b.f()).g(c.f).d(c.g).f(b.a().c()).b(c.h.d()).c(c.h.e()).a();
  }
  
  public final B.e t(String paramString, long paramLong)
  {
    return B.e.a().m(paramLong).j(paramString).h(g).b(s()).l(v()).e(u()).i(3).a();
  }
  
  public final B.e.c u()
  {
    Object localObject = new StatFs(Environment.getDataDirectory().getPath());
    int i = g();
    int j = Runtime.getRuntime().availableProcessors();
    long l1 = i.b(a);
    long l2 = ((StatFs)localObject).getBlockCount();
    long l3 = ((StatFs)localObject).getBlockSize();
    boolean bool = i.x();
    int k = i.m();
    localObject = Build.MANUFACTURER;
    String str = Build.PRODUCT;
    return B.e.c.a().b(i).f(Build.MODEL).c(j).h(l1).d(l2 * l3).i(bool).j(k).e((String)localObject).g(str).a();
  }
  
  public final B.e.e v()
  {
    return B.e.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.y()).a();
  }
  
  public final B.e.d.a.b.d w()
  {
    return B.e.d.a.b.d.a().d("0").c("0").b(0L).a();
  }
  
  public final B.e.d.a.b.e x(Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement)
  {
    return y(paramThread, paramArrayOfStackTraceElement, 0);
  }
  
  public final B.e.d.a.b.e y(Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    return B.e.d.a.b.e.a().d(paramThread.getName()).c(paramInt).b(J3.C.a(r(paramArrayOfStackTraceElement, paramInt))).a();
  }
  
  public final J3.C z(P3.e parame, Thread paramThread, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(y(paramThread, c, paramInt));
    if (paramBoolean)
    {
      Iterator localIterator = Thread.getAllStackTraces().entrySet().iterator();
      while (localIterator.hasNext())
      {
        parame = (Map.Entry)localIterator.next();
        Thread localThread = (Thread)parame.getKey();
        if (!localThread.equals(paramThread)) {
          localArrayList.add(x(localThread, d.a((StackTraceElement[])parame.getValue())));
        }
      }
    }
    return J3.C.a(localArrayList);
  }
}

/* Location:
 * Qualified Name:     H3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */