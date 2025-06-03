package H3;

import E3.f;
import I3.c;
import J3.B.a;
import J3.D;
import J3.D.b;
import J3.D.c;
import O3.d;
import O3.d.a;
import V2.j;
import V2.k;
import android.app.ActivityManager;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class q
{
  public static final FilenameFilter t = new p();
  public final Context a;
  public final y b;
  public final t c;
  public final I3.i d;
  public final n e;
  public final C f;
  public final M3.g g;
  public final a h;
  public final c i;
  public final E3.a j;
  public final F3.a k;
  public final m l;
  public final V m;
  public w n;
  public O3.i o = null;
  public final k p = new k();
  public final k q = new k();
  public final k r = new k();
  public final AtomicBoolean s = new AtomicBoolean(false);
  
  public q(Context paramContext, n paramn, C paramC, y paramy, M3.g paramg, t paramt, a parama, I3.i parami, c paramc, V paramV, E3.a parama1, F3.a parama2, m paramm)
  {
    a = paramContext;
    e = paramn;
    f = paramC;
    b = paramy;
    g = paramg;
    c = paramt;
    h = parama;
    d = parami;
    i = paramc;
    j = parama1;
    k = parama2;
    l = paramm;
    m = paramV;
  }
  
  public static boolean C()
  {
    try
    {
      Class.forName("com.google.firebase.crash.FirebaseCrash");
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  public static long E()
  {
    return H(System.currentTimeMillis());
  }
  
  public static List F(E3.g paramg, String paramString, M3.g paramg1, byte[] paramArrayOfByte)
  {
    File localFile = paramg1.o(paramString, "user-data");
    paramString = paramg1.o(paramString, "keys");
    paramg1 = new ArrayList();
    paramg1.add(new g("logs_file", "logs", paramArrayOfByte));
    paramg1.add(new B("crash_meta_file", "metadata", paramg.g()));
    paramg1.add(new B("session_meta_file", "session", paramg.f()));
    paramg1.add(new B("app_meta_file", "app", paramg.a()));
    paramg1.add(new B("device_meta_file", "device", paramg.c()));
    paramg1.add(new B("os_meta_file", "os", paramg.b()));
    paramg1.add(S(paramg));
    paramg1.add(new B("user_meta_file", "user", localFile));
    paramg1.add(new B("keys_file", "keys", paramString));
    return paramg1;
  }
  
  public static long H(long paramLong)
  {
    return paramLong / 1000L;
  }
  
  public static boolean R(String paramString, File paramFile, B.a parama)
  {
    f localf;
    StringBuilder localStringBuilder;
    if ((paramFile == null) || (!paramFile.exists()))
    {
      localf = f.f();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("No minidump data found for session ");
      localStringBuilder.append(paramString);
      localf.k(localStringBuilder.toString());
    }
    if (parama == null)
    {
      localf = f.f();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("No Tombstones data found for session ");
      localStringBuilder.append(paramString);
      localf.g(localStringBuilder.toString());
    }
    boolean bool;
    if (((paramFile == null) || (!paramFile.exists())) && (parama == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static F S(E3.g paramg)
  {
    paramg = paramg.e();
    if ((paramg != null) && (paramg.exists())) {
      paramg = new B("minidump_file", "minidump", paramg);
    } else {
      paramg = new g("minidump_file", "minidump", new byte[] { 0 });
    }
    return paramg;
  }
  
  public static byte[] U(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i1 = paramInputStream.read(arrayOfByte);
      if (i1 == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i1);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static J3.D.a p(C paramC, a parama)
  {
    return J3.D.a.b(paramC.f(), f, g, paramC.a().c(), z.c(d).e(), h);
  }
  
  public static D.b q(Context paramContext)
  {
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    long l1 = localStatFs.getBlockCount();
    long l2 = localStatFs.getBlockSize();
    return D.b.c(i.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(paramContext), l1 * l2, i.x(), i.m(), Build.MANUFACTURER, Build.PRODUCT);
  }
  
  public static D.c r()
  {
    return D.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.y());
  }
  
  public static void s(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((File)paramList.next()).delete();
    }
  }
  
  public final void A(String paramString)
  {
    Object localObject1 = f.f();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Finalizing native report for session ");
    ((StringBuilder)localObject2).append(paramString);
    ((f)localObject1).i(((StringBuilder)localObject2).toString());
    Object localObject3 = j.a(paramString);
    localObject1 = ((E3.g)localObject3).e();
    localObject2 = ((E3.g)localObject3).d();
    if (R(paramString, (File)localObject1, (B.a)localObject2))
    {
      f.f().k("No native core present");
      return;
    }
    long l1 = ((File)localObject1).lastModified();
    localObject1 = new c(g, paramString);
    File localFile = g.i(paramString);
    if (!localFile.isDirectory())
    {
      f.f().k("Couldn't create directory to store native session files, aborting.");
      return;
    }
    y(l1);
    localObject3 = F((E3.g)localObject3, paramString, g, ((c)localObject1).b());
    G.b(localFile, (List)localObject3);
    f.f().b("CrashlyticsController#finalizePreviousNativeSession");
    m.i(paramString, (List)localObject3, (B.a)localObject2);
    ((c)localObject1).a();
  }
  
  public boolean B(O3.i parami)
  {
    e.b();
    if (L())
    {
      f.f().k("Skipping session finalization because a crash has already occurred.");
      return false;
    }
    f.f().i("Finalizing previously open sessions.");
    try
    {
      w(true, parami);
      f.f().i("Closed all previously open sessions.");
      return true;
    }
    catch (Exception parami)
    {
      f.f().e("Unable to finalize previously open sessions.", parami);
    }
    return false;
  }
  
  public final String D()
  {
    Object localObject = m.o();
    if (!((Set)localObject).isEmpty()) {
      localObject = (String)((SortedSet)localObject).first();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public final InputStream G(String paramString)
  {
    ClassLoader localClassLoader = getClass().getClassLoader();
    if (localClassLoader == null)
    {
      f.f().k("Couldn't get Class Loader");
      return null;
    }
    paramString = localClassLoader.getResourceAsStream(paramString);
    if (paramString == null)
    {
      f.f().g("No version control information found");
      return null;
    }
    return paramString;
  }
  
  public String I()
  {
    InputStream localInputStream = G("META-INF/version-control-info.textproto");
    if (localInputStream == null) {
      return null;
    }
    f.f().b("Read version control info");
    return Base64.encodeToString(U(localInputStream), 0);
  }
  
  public void J(O3.i parami, Thread paramThread, Throwable paramThrowable)
  {
    K(parami, paramThread, paramThrowable, false);
  }
  
  public void K(O3.i parami, Thread paramThread, Throwable paramThrowable, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = f.f();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Handling uncaught exception \"");
      ((StringBuilder)localObject2).append(paramThrowable);
      ((StringBuilder)localObject2).append("\" from thread ");
      ((StringBuilder)localObject2).append(paramThread.getName());
      ((f)localObject1).b(((StringBuilder)localObject2).toString());
      long l1 = System.currentTimeMillis();
      localObject1 = e;
      localObject2 = new H3/q$b;
      ((b)localObject2).<init>(this, l1, paramThrowable, paramThread, parami, paramBoolean);
      parami = ((n)localObject1).i((Callable)localObject2);
    }
    finally
    {
      try
      {
        c0.f(parami);
      }
      catch (Exception parami)
      {
        f.f().e("Error handling uncaught exception", parami);
      }
      catch (TimeoutException parami)
      {
        f.f().d("Cannot send reports. Timed out while fetching settings.");
      }
      parami = finally;
      break label138;
    }
    return;
    label138:
    throw parami;
  }
  
  public boolean L()
  {
    w localw = n;
    boolean bool;
    if ((localw != null) && (localw.a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public List N()
  {
    return g.f(t);
  }
  
  public final j O(final long paramLong)
  {
    if (C())
    {
      f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
      return V2.m.e(null);
    }
    f.f().b("Logging app exception event to Firebase Analytics");
    return V2.m.c(new ScheduledThreadPoolExecutor(1), new h(paramLong));
  }
  
  public final j P()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = N().iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      try
      {
        localArrayList.add(O(Long.parseLong(localFile.getName().substring(3))));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        f localf = f.f();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Could not parse app exception timestamp from file ");
        localStringBuilder.append(localFile.getName());
        localf.k(localStringBuilder.toString());
      }
      localFile.delete();
    }
    return V2.m.f(localArrayList);
  }
  
  public void Q(Thread paramThread, Throwable paramThrowable)
  {
    O3.i locali = o;
    if (locali == null)
    {
      f.f().k("settingsProvider not set");
      return;
    }
    K(locali, paramThread, paramThrowable, true);
  }
  
  public void T(final String paramString)
  {
    e.h(new g(paramString));
  }
  
  public void V()
  {
    try
    {
      String str = I();
      if (str != null)
      {
        Y("com.crashlytics.version-control-info", str);
        f.f().g("Saved version control info");
      }
    }
    catch (IOException localIOException)
    {
      f.f().l("Unable to save version control info", localIOException);
    }
  }
  
  public j W()
  {
    q.e(Boolean.TRUE);
    return r.a();
  }
  
  public void X(String paramString1, String paramString2)
  {
    try
    {
      d.l(paramString1, paramString2);
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString2 = a;
      if ((paramString2 != null) && (i.v(paramString2))) {
        throw paramString1;
      }
      f.f().d("Attempting to set custom attribute with null key, ignoring.");
    }
  }
  
  public void Y(String paramString1, String paramString2)
  {
    try
    {
      d.m(paramString1, paramString2);
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString2 = a;
      if ((paramString2 != null) && (i.v(paramString2))) {
        throw paramString1;
      }
      f.f().d("Attempting to set custom attribute with null key, ignoring.");
    }
  }
  
  public void Z(String paramString)
  {
    d.o(paramString);
  }
  
  public j a0(final j paramj)
  {
    if (!m.m())
    {
      f.f().i("No crash reports are available to be sent.");
      p.e(Boolean.FALSE);
      return V2.m.e(null);
    }
    f.f().i("Crash reports are available to be sent.");
    return b0().o(new d(paramj));
  }
  
  public final j b0()
  {
    if (b.d())
    {
      f.f().b("Automatic data collection is enabled. Allowing upload.");
      p.e(Boolean.FALSE);
      return V2.m.e(Boolean.TRUE);
    }
    f.f().b("Automatic data collection is disabled.");
    f.f().i("Notifying that unsent reports are available.");
    p.e(Boolean.TRUE);
    j localj = b.j().o(new c());
    f.f().b("Waiting for send/deleteUnsentReports to be called.");
    return c0.n(localj, q.a());
  }
  
  public final void c0(String paramString)
  {
    int i1 = Build.VERSION.SDK_INT;
    Object localObject2;
    if (i1 >= 30)
    {
      List localList = o.a((ActivityManager)a.getSystemService("activity"), null, 0, 0);
      Object localObject1;
      if (localList.size() != 0)
      {
        localObject1 = new c(g, paramString);
        localObject2 = I3.i.i(paramString, g, e);
        m.u(paramString, localList, (c)localObject1, (I3.i)localObject2);
      }
      else
      {
        localObject1 = f.f();
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("No ApplicationExitInfo available. Session: ");
        ((StringBuilder)localObject2).append(paramString);
        ((f)localObject1).i(((StringBuilder)localObject2).toString());
      }
    }
    else
    {
      localObject2 = f.f();
      paramString = new StringBuilder();
      paramString.append("ANR feature enabled, but device is API ");
      paramString.append(i1);
      ((f)localObject2).i(paramString.toString());
    }
  }
  
  public void d0(final Thread paramThread, Throwable paramThrowable)
  {
    final long l1 = System.currentTimeMillis();
    e.g(new f(l1, paramThrowable, paramThread));
  }
  
  public void e0(final long paramLong, String paramString)
  {
    e.h(new e(paramLong, paramString));
  }
  
  public j o()
  {
    if (!s.compareAndSet(false, true))
    {
      f.f().k("checkForUnsentReports should only be called once per execution.");
      return V2.m.e(Boolean.FALSE);
    }
    return p.a();
  }
  
  public j t()
  {
    q.e(Boolean.FALSE);
    return r.a();
  }
  
  public boolean u()
  {
    boolean bool1 = c.c();
    boolean bool2 = true;
    if (!bool1)
    {
      String str = D();
      if ((str == null) || (!j.d(str))) {
        bool2 = false;
      }
      return bool2;
    }
    f.f().i("Found previous crash marker.");
    c.d();
    return true;
  }
  
  public void v(O3.i parami)
  {
    w(false, parami);
  }
  
  public final void w(boolean paramBoolean, O3.i parami)
  {
    ArrayList localArrayList = new ArrayList(m.o());
    if (localArrayList.size() <= paramBoolean)
    {
      f.f().i("No open sessions to be closed.");
      return;
    }
    String str = (String)localArrayList.get(paramBoolean);
    if (bb.b) {
      c0(str);
    } else {
      f.f().i("ANR feature disabled.");
    }
    if (j.d(str)) {
      A(str);
    }
    if (paramBoolean)
    {
      parami = (String)localArrayList.get(0);
    }
    else
    {
      l.e(null);
      parami = null;
    }
    m.j(E(), parami);
  }
  
  public final void x(String paramString, Boolean paramBoolean)
  {
    long l1 = E();
    Object localObject1 = f.f();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Opening a new session with ID ");
    ((StringBuilder)localObject2).append(paramString);
    ((f)localObject1).b(((StringBuilder)localObject2).toString());
    String str = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] { s.l() });
    localObject2 = p(f, h);
    localObject1 = r();
    D.b localb = q(a);
    j.c(paramString, str, l1, D.b((J3.D.a)localObject2, (D.c)localObject1, localb));
    if ((paramBoolean.booleanValue()) && (paramString != null)) {
      d.n(paramString);
    }
    i.e(paramString);
    l.e(paramString);
    m.p(paramString, l1);
  }
  
  public final void y(long paramLong)
  {
    try
    {
      M3.g localg = g;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(".ae");
      ((StringBuilder)localObject).append(paramLong);
      if (!localg.e(((StringBuilder)localObject).toString()).createNewFile())
      {
        localObject = new java/io/IOException;
        ((IOException)localObject).<init>("Create new file failed.");
        throw ((Throwable)localObject);
      }
    }
    catch (IOException localIOException)
    {
      f.f().l("Could not create app exception marker file.", localIOException);
    }
  }
  
  public void z(String paramString, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, O3.i parami)
  {
    o = parami;
    T(paramString);
    paramString = new w(new a(), parami, paramUncaughtExceptionHandler, j);
    n = paramString;
    Thread.setDefaultUncaughtExceptionHandler(paramString);
  }
  
  public class a
    implements w.a
  {
    public a() {}
    
    public void a(O3.i parami, Thread paramThread, Throwable paramThrowable)
    {
      J(parami, paramThread, paramThrowable);
    }
  }
  
  public class b
    implements Callable
  {
    public b(long paramLong, Throwable paramThrowable, Thread paramThread, O3.i parami, boolean paramBoolean) {}
    
    public j a()
    {
      long l = q.b(o);
      final String str = q.c(q.this);
      if (str == null)
      {
        f.f().d("Tried to write a fatal exception while no session was open.");
        return V2.m.e(null);
      }
      q.g(q.this).a();
      q.h(q.this).s(p, q, str, l);
      q.i(q.this, o);
      v(r);
      q.k(q.this, new h(q.j(q.this)).toString(), Boolean.valueOf(s));
      if (!q.l(q.this).d()) {
        return V2.m.e(null);
      }
      final Executor localExecutor = q.m(q.this).c();
      return r.a().p(localExecutor, new a(localExecutor, str));
    }
    
    public class a
      implements V2.i
    {
      public a(Executor paramExecutor, String paramString) {}
      
      public j b(d paramd)
      {
        Object localObject = null;
        if (paramd == null)
        {
          f.f().k("Received null app settings, cannot send reports at crash time.");
          return V2.m.e(null);
        }
        j localj = q.n(q.this);
        V localV = q.h(q.this);
        Executor localExecutor = localExecutor;
        paramd = (d)localObject;
        if (s) {
          paramd = str;
        }
        return V2.m.g(new j[] { localj, localV.x(localExecutor, paramd) });
      }
    }
  }
  
  public class c
    implements V2.i
  {
    public c() {}
    
    public j b(Void paramVoid)
    {
      return V2.m.e(Boolean.TRUE);
    }
  }
  
  public class d
    implements V2.i
  {
    public d(j paramj) {}
    
    public j b(final Boolean paramBoolean)
    {
      return q.m(q.this).i(new a(paramBoolean));
    }
    
    public class a
      implements Callable
    {
      public a(Boolean paramBoolean) {}
      
      public j a()
      {
        if (!paramBoolean.booleanValue())
        {
          f.f().i("Deleting cached crash reports...");
          q.d(N());
          q.h(q.this).v();
          r.e(null);
          return V2.m.e(null);
        }
        f.f().b("Sending cached crash reports...");
        boolean bool = paramBoolean.booleanValue();
        q.l(q.this).c(bool);
        final Executor localExecutor = q.m(q.this).c();
        return a.p(localExecutor, new a(localExecutor));
      }
      
      public class a
        implements V2.i
      {
        public a(Executor paramExecutor) {}
        
        public j b(d paramd)
        {
          if (paramd == null) {
            f.f().k("Received null app settings at app startup. Cannot send cached reports");
          }
          for (;;)
          {
            return V2.m.e(null);
            q.n(q.this);
            q.h(q.this).w(localExecutor);
            r.e(null);
          }
        }
      }
    }
  }
  
  public class e
    implements Callable
  {
    public e(long paramLong, String paramString) {}
    
    public Void a()
    {
      if (!L()) {
        q.e(q.this).g(paramLong, p);
      }
      return null;
    }
  }
  
  public class f
    implements Runnable
  {
    public f(long paramLong, Throwable paramThrowable, Thread paramThread) {}
    
    public void run()
    {
      if (!L())
      {
        long l = q.b(l1);
        String str = q.c(q.this);
        if (str == null)
        {
          f.f().k("Tried to write a non-fatal exception while no session was open.");
          return;
        }
        q.h(q.this).t(paramThread, q, str, l);
      }
    }
  }
  
  public class g
    implements Callable
  {
    public g(String paramString) {}
    
    public Void a()
    {
      q.k(q.this, paramString, Boolean.FALSE);
      return null;
    }
  }
  
  public class h
    implements Callable
  {
    public h(long paramLong) {}
    
    public Void a()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("fatal", 1);
      localBundle.putLong("timestamp", paramLong);
      q.f(q.this).a("_ae", localBundle);
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     H3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */