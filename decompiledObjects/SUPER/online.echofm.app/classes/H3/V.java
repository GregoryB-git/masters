package H3;

import E3.f;
import I3.c;
import J3.B;
import J3.B.a;
import J3.B.a.b;
import J3.B.c;
import J3.B.c.a;
import J3.B.d;
import J3.B.d.a;
import J3.B.e.d;
import J3.B.e.d.a;
import J3.B.e.d.a.a;
import J3.B.e.d.b;
import J3.B.e.d.d;
import J3.B.e.d.d.a;
import M3.e;
import M3.g;
import N3.b;
import P3.d;
import V2.j;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class V
{
  public final u a;
  public final e b;
  public final b c;
  public final c d;
  public final I3.i e;
  public final C f;
  
  public V(u paramu, e parame, b paramb, c paramc, I3.i parami, C paramC)
  {
    a = paramu;
    b = parame;
    c = paramb;
    d = paramc;
    e = parami;
    f = paramC;
  }
  
  public static B.a e(ApplicationExitInfo paramApplicationExitInfo)
  {
    Object localObject1 = null;
    Object localObject4;
    try
    {
      localObject2 = L.a(paramApplicationExitInfo);
      Object localObject3 = localObject1;
      if (localObject2 != null) {
        localObject3 = f((InputStream)localObject2);
      }
    }
    catch (IOException localIOException)
    {
      f localf = f.f();
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Could not get input trace in application exit info: ");
      ((StringBuilder)localObject2).append(M.a(paramApplicationExitInfo));
      ((StringBuilder)localObject2).append(" Error: ");
      ((StringBuilder)localObject2).append(localIOException);
      localf.k(((StringBuilder)localObject2).toString());
      localObject4 = localObject1;
    }
    return B.a.a().c(N.a(paramApplicationExitInfo)).e(O.a(paramApplicationExitInfo)).g(K.a(paramApplicationExitInfo)).i(J.a(paramApplicationExitInfo)).d(P.a(paramApplicationExitInfo)).f(Q.a(paramApplicationExitInfo)).h(S.a(paramApplicationExitInfo)).j((String)localObject4).a();
  }
  
  public static String f(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[' '];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
  }
  
  public static V g(Context paramContext, C paramC, g paramg, a parama, c paramc, I3.i parami, d paramd, O3.i parami1, H paramH, m paramm)
  {
    return new V(new u(paramContext, paramC, parama, paramd, parami1), new e(paramg, parami1, paramm), b.b(paramContext, parami1, paramH), paramc, parami, paramC);
  }
  
  public static List l(Map paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.ensureCapacity(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localArrayList.add(B.c.a().b((String)paramMap.getKey()).c((String)paramMap.getValue()).a());
    }
    Collections.sort(localArrayList, new T());
    return localArrayList;
  }
  
  public final B.e.d c(B.e.d paramd)
  {
    return d(paramd, d, e);
  }
  
  public final B.e.d d(B.e.d paramd, c paramc, I3.i parami)
  {
    B.e.d.b localb = paramd.g();
    paramc = paramc.c();
    if (paramc != null) {
      localb.d(B.e.d.d.a().b(paramc).a());
    } else {
      f.f().i("No log data to include with this event.");
    }
    paramc = l(parami.e());
    parami = l(parami.f());
    if ((!paramc.isEmpty()) || (!parami.isEmpty())) {
      localb.b(paramd.b().g().c(J3.C.a(paramc)).e(J3.C.a(parami)).a());
    }
    return localb.a();
  }
  
  public final v h(v paramv)
  {
    Object localObject = paramv;
    if (paramv.b().g() == null)
    {
      localObject = f.d();
      localObject = v.a(paramv.b().r((String)localObject), paramv.d(), paramv.c());
    }
    return (v)localObject;
  }
  
  public void i(String paramString, List paramList, B.a parama)
  {
    f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = ((F)localIterator.next()).k();
      if (paramList != null) {
        localArrayList.add(paramList);
      }
    }
    b.l(paramString, B.d.a().b(J3.C.a(localArrayList)).a(), parama);
  }
  
  public void j(long paramLong, String paramString)
  {
    b.k(paramString, paramLong);
  }
  
  public final ApplicationExitInfo k(String paramString, List paramList)
  {
    long l = b.q(paramString);
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramList = I.a(paramString.next());
      if (J.a(paramList) < l) {
        return null;
      }
      if (K.a(paramList) == 6) {
        return paramList;
      }
    }
    return null;
  }
  
  public boolean m()
  {
    return b.r();
  }
  
  public SortedSet o()
  {
    return b.p();
  }
  
  public void p(String paramString, long paramLong)
  {
    paramString = a.e(paramString, paramLong);
    b.z(paramString);
  }
  
  public final boolean q(j paramj)
  {
    if (paramj.n())
    {
      Object localObject = (v)paramj.j();
      f localf = f.f();
      paramj = new StringBuilder();
      paramj.append("Crashlytics report successfully enqueued to DataTransport: ");
      paramj.append(((v)localObject).d());
      localf.b(paramj.toString());
      paramj = ((v)localObject).c();
      if (paramj.delete())
      {
        localf = f.f();
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Deleted report file: ");
        ((StringBuilder)localObject).append(paramj.getPath());
        localf.b(((StringBuilder)localObject).toString());
      }
      else
      {
        localf = f.f();
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Crashlytics could not delete report file: ");
        ((StringBuilder)localObject).append(paramj.getPath());
        localf.k(((StringBuilder)localObject).toString());
      }
      return true;
    }
    f.f().l("Crashlytics report could not be enqueued to DataTransport", paramj.i());
    return false;
  }
  
  public final void r(Throwable paramThrowable, Thread paramThread, String paramString1, String paramString2, long paramLong, boolean paramBoolean)
  {
    boolean bool = paramString2.equals("crash");
    paramThrowable = a.d(paramThrowable, paramThread, paramString2, paramLong, 4, 8, paramBoolean);
    b.y(c(paramThrowable), paramString1, bool);
  }
  
  public void s(Throwable paramThrowable, Thread paramThread, String paramString, long paramLong)
  {
    f localf = f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Persisting fatal event for session ");
    localStringBuilder.append(paramString);
    localf.i(localStringBuilder.toString());
    r(paramThrowable, paramThread, paramString, "crash", paramLong, true);
  }
  
  public void t(Throwable paramThrowable, Thread paramThread, String paramString, long paramLong)
  {
    f localf = f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Persisting non-fatal event for session ");
    localStringBuilder.append(paramString);
    localf.i(localStringBuilder.toString());
    r(paramThrowable, paramThread, paramString, "error", paramLong, false);
  }
  
  public void u(String paramString, List paramList, c paramc, I3.i parami)
  {
    paramList = k(paramString, paramList);
    if (paramList == null)
    {
      paramList = f.f();
      paramc = new StringBuilder();
      paramc.append("No relevant ApplicationExitInfo occurred during session: ");
      paramc.append(paramString);
      paramList.i(paramc.toString());
      return;
    }
    B.e.d locald = a.c(e(paramList));
    paramList = f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Persisting anr for session ");
    localStringBuilder.append(paramString);
    paramList.b(localStringBuilder.toString());
    b.y(d(locald, paramc, parami), paramString, true);
  }
  
  public void v()
  {
    b.i();
  }
  
  public j w(Executor paramExecutor)
  {
    return x(paramExecutor, null);
  }
  
  public j x(Executor paramExecutor, String paramString)
  {
    Object localObject = b.w();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      v localv = (v)localIterator.next();
      if ((paramString == null) || (paramString.equals(localv.d())))
      {
        localObject = c;
        localv = h(localv);
        boolean bool;
        if (paramString != null) {
          bool = true;
        } else {
          bool = false;
        }
        localArrayList.add(((b)localObject).c(localv, bool).g(paramExecutor, new U(this)));
      }
    }
    return V2.m.f(localArrayList);
  }
}

/* Location:
 * Qualified Name:     H3.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */