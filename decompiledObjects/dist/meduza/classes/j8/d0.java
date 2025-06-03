package j8;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import k3.w;
import l8.k;
import l8.n.a;
import m8.b.a;
import m8.f0;
import m8.f0.c;
import m8.f0.e.d;
import m8.f0.e.d.a;
import m8.f0.e.d.a.b.c;
import m8.f0.e.d.a.c;
import m8.l.a;
import m8.m;
import m8.m.a;
import m8.q;
import m8.r;
import m8.v;
import m8.w.a;
import m8.x;
import m8.y;

public final class d0
{
  public final t a;
  public final p8.c b;
  public final q8.a c;
  public final l8.f d;
  public final l8.n e;
  public final a0 f;
  public final k8.i g;
  
  public d0(t paramt, p8.c paramc, q8.a parama, l8.f paramf, l8.n paramn, a0 parama0, k8.i parami)
  {
    a = paramt;
    b = paramc;
    c = parama;
    d = paramf;
    e = paramn;
    f = parama0;
    g = parami;
  }
  
  public static m8.l a(m8.l paraml, l8.f paramf, l8.n paramn, Map paramMap)
  {
    l.a locala = new l.a(paraml);
    paramf = b.b();
    int i = 0;
    if (paramf != null) {
      e = new v(paramf);
    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
      Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
    }
    paramn.getClass();
    if (paramMap.isEmpty())
    {
      paramf = d.a();
    }
    else
    {
      paramf = new HashMap(d.a());
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramMap = l8.e.a(1024, (String)localEntry.getKey());
        if ((paramf.size() >= 64) && (!paramf.containsKey(paramMap))) {
          i++;
        } else {
          paramf.put(paramMap, l8.e.a(1024, (String)localEntry.getValue()));
        }
      }
      if (i > 0) {
        Log.w("FirebaseCrashlytics", f.i("Ignored ", i, " keys when adding event specific keys. Maximum allowable: ", 1024), null);
      }
      paramf = Collections.unmodifiableMap(paramf);
    }
    paramf = d(paramf);
    paramn = d(e.a());
    if ((!paramf.isEmpty()) || (!paramn.isEmpty()))
    {
      paraml = c.h();
      b = paramf;
      c = paramn;
      c = paraml.a();
    }
    return locala.a();
  }
  
  public static f0.e.d b(m8.l paraml, l8.n arg1)
  {
    synchronized (f)
    {
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(a);
      localObject = Collections.unmodifiableList((List)localObject);
      ??? = new ArrayList();
      int i = 0;
      while (i < ((List)localObject).size())
      {
        k localk = (k)((List)localObject).get(i);
        w.a locala = new w.a();
        String str1 = localk.f();
        if (str1 != null)
        {
          String str2 = localk.d();
          if (str2 != null)
          {
            a = new x(str2, str1);
            str1 = localk.b();
            if (str1 != null)
            {
              b = str1;
              str1 = localk.c();
              if (str1 != null)
              {
                c = str1;
                d = localk.e();
                e = ((byte)(byte)(e | 0x1));
                ???.add(locala.a());
                i++;
              }
              else
              {
                throw new NullPointerException("Null parameterValue");
              }
            }
            else
            {
              throw new NullPointerException("Null parameterKey");
            }
          }
          else
          {
            throw new NullPointerException("Null rolloutId");
          }
        }
        else
        {
          throw new NullPointerException("Null variantId");
        }
      }
      if (???.isEmpty()) {
        return paraml;
      }
      paraml = new l.a(paraml);
      f = new y(???);
      return paraml.a();
    }
  }
  
  public static d0 c(Context paramContext, a0 parama0, p8.e parame, a parama, l8.f paramf, l8.n paramn, s8.a parama1, r8.f paramf1, l.l paraml, j paramj, k8.i parami)
  {
    parama = new t(paramContext, parama0, parama, parama1, paramf1);
    parame = new p8.c(parame, paramf1, paramj);
    parama1 = q8.a.b;
    w.b(paramContext);
    return new d0(parama, parame, new q8.a(new q8.c(w.a().c(new i3.a(q8.a.c, q8.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new h3.c("json"), q8.a.e), paramf1.b(), paraml)), paramf, paramn, parama0, parami);
  }
  
  public static List<f0.c> d(Map<String, String> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.ensureCapacity(paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      if (str != null)
      {
        localObject = (String)((Map.Entry)localObject).getValue();
        if (localObject != null) {
          localArrayList.add(new m8.e(str, (String)localObject));
        } else {
          throw new NullPointerException("Null value");
        }
      }
      else
      {
        throw new NullPointerException("Null key");
      }
    }
    Collections.sort(localArrayList, new v4.d(7));
    return Collections.unmodifiableList(localArrayList);
  }
  
  public final void e(Throwable paramThrowable, Thread paramThread, String paramString, l8.c paramc, boolean paramBoolean)
  {
    boolean bool1 = paramString.equals("crash");
    t localt = a;
    long l = b;
    int i = a.getResources().getConfiguration().orientation;
    Object localObject1 = d;
    Object localObject2 = new Stack();
    while (paramThrowable != null)
    {
      ((Stack)localObject2).push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    for (paramThrowable = null; !((AbstractCollection)localObject2).isEmpty(); paramThrowable = new z5.j(((Throwable)localObject3).getLocalizedMessage(), localObject3.getClass().getName(), ((s8.c)localObject1).b(((Throwable)localObject3).getStackTrace()), paramThrowable)) {
      localObject3 = (Throwable)((Stack)localObject2).pop();
    }
    localObject1 = new l.a();
    b = paramString;
    a = l;
    g = ((byte)(byte)(g | 0x1));
    Object localObject3 = g8.e.a.c(a);
    if (((f0.e.d.a.c)localObject3).a() > 0)
    {
      boolean bool2;
      if (((f0.e.d.a.c)localObject3).a() != 100) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      paramString = Boolean.valueOf(bool2);
    }
    else
    {
      paramString = null;
    }
    ArrayList localArrayList = g8.e.b(a);
    int j = (byte)(0x1 | 0x0);
    Object localObject4 = new ArrayList();
    Object localObject5 = (StackTraceElement[])c;
    localObject2 = paramThread.getName();
    if (localObject2 != null)
    {
      int k = (byte)1;
      localObject5 = t.d((StackTraceElement[])localObject5, 4);
      if (localObject5 != null)
      {
        if (k == 1)
        {
          ((ArrayList)localObject4).add(new r((String)localObject2, 4, (List)localObject5));
          if (paramBoolean)
          {
            localObject2 = Thread.getAllStackTraces().entrySet().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              Object localObject6 = (Map.Entry)((Iterator)localObject2).next();
              localObject5 = (Thread)((Map.Entry)localObject6).getKey();
              if (!localObject5.equals(paramThread))
              {
                localObject6 = d.b((StackTraceElement[])((Map.Entry)localObject6).getValue());
                localObject5 = ((Thread)localObject5).getName();
                if (localObject5 != null)
                {
                  localObject6 = t.d((StackTraceElement[])localObject6, 0);
                  if (localObject6 != null)
                  {
                    if (k == 1)
                    {
                      ((ArrayList)localObject4).add(new r((String)localObject5, 0, (List)localObject6));
                    }
                    else
                    {
                      paramThrowable = new StringBuilder();
                      if ((k & 0x1) == 0) {
                        paramThrowable.append(" importance");
                      }
                      throw new IllegalStateException(a0.j.l("Missing required properties:", paramThrowable));
                    }
                  }
                  else {
                    throw new NullPointerException("Null frames");
                  }
                }
                else
                {
                  throw new NullPointerException("Null name");
                }
              }
            }
          }
          paramThread = Collections.unmodifiableList((List)localObject4);
          paramThrowable = t.c(paramThrowable, 0);
          if (k == 1)
          {
            localObject2 = new q("0", "0", 0L);
            localObject4 = localt.a();
            if (localObject4 != null)
            {
              paramThrowable = new m8.n(paramThread, paramThrowable, null, (f0.e.d.a.b.c)localObject2, (List)localObject4);
              if (j == 1)
              {
                c = new m(paramThrowable, null, null, paramString, (f0.e.d.a.c)localObject3, localArrayList, i);
                d = localt.b(i);
                paramThread = ((l.a)localObject1).a();
                paramThrowable = c;
                paramThrowable = b(a(paramThread, d, e, paramThrowable), e);
                if (!paramBoolean)
                {
                  g.b.a(new c0(this, paramThrowable, paramc, bool1));
                  return;
                }
                b.c(paramThrowable, a, bool1);
                return;
              }
              paramThrowable = new StringBuilder();
              if ((j & 0x1) == 0) {
                paramThrowable.append(" uiOrientation");
              }
              throw new IllegalStateException(a0.j.l("Missing required properties:", paramThrowable));
            }
            throw new NullPointerException("Null binaries");
          }
          paramThrowable = new StringBuilder();
          if ((k & 0x1) == 0) {
            paramThrowable.append(" address");
          }
          throw new IllegalStateException(a0.j.l("Missing required properties:", paramThrowable));
        }
        paramThrowable = new StringBuilder();
        if ((k & 0x1) == 0) {
          paramThrowable.append(" importance");
        }
        throw new IllegalStateException(a0.j.l("Missing required properties:", paramThrowable));
      }
      throw new NullPointerException("Null frames");
    }
    throw new NullPointerException("Null name");
  }
  
  public final void f(String paramString, List<ApplicationExitInfo> paramList, l8.f paramf, l8.n paramn)
  {
    long l = b.b.b(paramString, "start-time").lastModified();
    Object localObject1 = paramList.iterator();
    boolean bool;
    Object localObject3;
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      localObject2 = null;
      if (!bool) {
        break;
      }
      localObject3 = (ApplicationExitInfo)((Iterator)localObject1).next();
      if (((ApplicationExitInfo)localObject3).getTimestamp() < l) {
        break;
      }
      paramList = (List<ApplicationExitInfo>)localObject3;
      if (((ApplicationExitInfo)localObject3).getReason() == 6) {
        break label88;
      }
    }
    paramList = null;
    label88:
    if (paramList == null)
    {
      paramString = g.d("No relevant ApplicationExitInfo occurred during session: ", paramString);
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", paramString, null);
      }
      return;
    }
    localObject1 = a;
    Object localObject5;
    int i;
    try
    {
      InputStream localInputStream = paramList.getTraceInputStream();
      localObject3 = localObject2;
      if (localInputStream != null)
      {
        localObject3 = new java/io/ByteArrayOutputStream;
        ((ByteArrayOutputStream)localObject3).<init>();
        localObject5 = new byte[' '];
        for (;;)
        {
          i = localInputStream.read((byte[])localObject5);
          if (i == -1) {
            break;
          }
          ((ByteArrayOutputStream)localObject3).write((byte[])localObject5, 0, i);
        }
        localObject3 = ((ByteArrayOutputStream)localObject3).toString(StandardCharsets.UTF_8.name());
      }
    }
    catch (IOException localIOException)
    {
      localObject3 = f.l("Could not get input trace in application exit info: ");
      ((StringBuilder)localObject3).append(paramList.toString());
      ((StringBuilder)localObject3).append(" Error: ");
      ((StringBuilder)localObject3).append(localIOException);
      Log.w("FirebaseCrashlytics", ((StringBuilder)localObject3).toString(), null);
      localObject3 = localObject2;
    }
    Object localObject2 = new m8.c.a();
    d = paramList.getImportance();
    j = ((byte)(byte)(j | 0x4));
    Object localObject4 = paramList.getProcessName();
    if (localObject4 != null)
    {
      b = ((String)localObject4);
      c = paramList.getReason();
      j = ((byte)(byte)(j | 0x2));
      g = paramList.getTimestamp();
      j = ((byte)(byte)(j | 0x20));
      a = paramList.getPid();
      j = ((byte)(byte)(j | 0x1));
      e = paramList.getPss();
      j = ((byte)(byte)(j | 0x8));
      f = paramList.getRss();
      j = ((byte)(byte)(j | 0x10));
      h = ((String)localObject3);
      localObject2 = ((m8.c.a)localObject2).a();
      i = a.getResources().getConfiguration().orientation;
      localObject3 = new l.a();
      b = "anr";
      a = g;
      g = ((byte)(byte)(g | 0x1));
      if ((e).b().b.c) && (c.c.size() > 0))
      {
        localObject5 = new ArrayList();
        Iterator localIterator = c.c.iterator();
        while (localIterator.hasNext())
        {
          Object localObject6 = (e)localIterator.next();
          localObject4 = a;
          if (localObject4 != null)
          {
            paramList = b;
            if (paramList != null)
            {
              localObject6 = c;
              if (localObject6 != null) {
                ((ArrayList)localObject5).add(new m8.d(paramList, (String)localObject4, (String)localObject6));
              } else {
                throw new NullPointerException("Null buildId");
              }
            }
            else
            {
              throw new NullPointerException("Null arch");
            }
          }
          else
          {
            throw new NullPointerException("Null libraryName");
          }
        }
        paramList = Collections.unmodifiableList((List)localObject5);
      }
      else
      {
        paramList = null;
      }
      localObject5 = new m8.c.a();
      d = d;
      int j = (byte)(j | 0x4);
      j = ((byte)j);
      localObject4 = b;
      if (localObject4 != null)
      {
        b = ((String)localObject4);
        c = c;
        j = (byte)(0x2 | j);
        g = g;
        j = (byte)(j | 0x20);
        a = a;
        j = (byte)(j | 0x1);
        e = e;
        j = (byte)(j | 0x8);
        f = f;
        j = ((byte)(byte)(j | 0x10));
        h = h;
        i = paramList;
        paramList = ((m8.c.a)localObject5).a();
        if (d != 100) {
          bool = true;
        } else {
          bool = false;
        }
        localObject2 = g8.e.a;
        localObject4 = b;
        int k = a;
        j = d;
        ec.i.e(localObject4, "processName");
        localObject2 = g8.e.a((g8.e)localObject2, (String)localObject4, k, j, 8);
        k = (byte)(0x0 | 0x1);
        j = (byte)1;
        if (j == 1)
        {
          localObject4 = new q("0", "0", 0L);
          localObject5 = ((t)localObject1).a();
          if (localObject5 != null)
          {
            paramList = new m8.n(null, null, paramList, (f0.e.d.a.b.c)localObject4, (List)localObject5);
            if (k == 1)
            {
              c = new m(paramList, null, null, Boolean.valueOf(bool), (f0.e.d.a.c)localObject2, null, i);
              d = ((t)localObject1).b(i);
              localObject3 = ((l.a)localObject3).a();
              paramList = g.d("Persisting anr for session ", paramString);
              if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", paramList, null);
              }
              paramList = b(a((m8.l)localObject3, paramf, paramn, Collections.emptyMap()), paramn);
              b.c(paramList, paramString, true);
              return;
            }
            paramString = new StringBuilder();
            if ((k & 0x1) == 0) {
              paramString.append(" uiOrientation");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", paramString));
          }
          throw new NullPointerException("Null binaries");
        }
        paramString = new StringBuilder();
        if ((j & 0x1) == 0) {
          paramString.append(" address");
        }
        throw new IllegalStateException(a0.j.l("Missing required properties:", paramString));
      }
      throw new NullPointerException("Null processName");
    }
    throw new NullPointerException("Null processName");
  }
  
  public final Task g(k8.b paramb, String paramString)
  {
    ??? = b.b();
    Object localObject2 = new ArrayList();
    Object localObject3 = ((ArrayList)???).iterator();
    Object localObject7;
    while (((Iterator)localObject3).hasNext())
    {
      ??? = (File)((Iterator)localObject3).next();
      try
      {
        localObject4 = p8.c.g;
        Object localObject5 = p8.c.d((File)???);
        localObject4.getClass();
        localObject4 = n8.a.i((String)localObject5);
        localObject7 = ((File)???).getName();
        localObject5 = new j8/b;
        ((b)localObject5).<init>((m8.b)localObject4, (String)localObject7, (File)???);
        ((ArrayList)localObject2).add(localObject5);
      }
      catch (IOException localIOException)
      {
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("Could not load report file ");
        ((StringBuilder)localObject4).append(???);
        ((StringBuilder)localObject4).append("; deleting");
        Log.w("FirebaseCrashlytics", ((StringBuilder)localObject4).toString(), localIOException);
        ((File)???).delete();
      }
    }
    localObject3 = new ArrayList();
    Object localObject4 = ((ArrayList)localObject2).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      ??? = (u)((Iterator)localObject4).next();
      if ((paramString == null) || (paramString.equals(((u)???).c())))
      {
        Object localObject6 = c;
        localObject2 = ((u)???).a().f();
        int i = 1;
        Object localObject8;
        if (localObject2 != null)
        {
          localObject2 = ???;
          if (((u)???).a().e() != null) {}
        }
        else
        {
          localObject2 = f.b(true);
          localObject8 = ((u)???).a();
          localObject7 = a;
          localObject8 = ((f0)localObject8).m();
          e = ((String)localObject7);
          localObject7 = ((b.a)localObject8).a();
          localObject2 = b;
          localObject7 = new b.a((f0)localObject7);
          f = ((String)localObject2);
          localObject2 = new b(((b.a)localObject7).a(), ((u)???).c(), ((u)???).b());
        }
        int j;
        if (paramString != null) {
          j = 1;
        } else {
          j = 0;
        }
        localObject7 = a;
        synchronized (f)
        {
          localObject6 = new com/google/android/gms/tasks/TaskCompletionSource;
          ((TaskCompletionSource)localObject6).<init>();
          if (j != 0)
          {
            ((AtomicInteger)i.b).getAndIncrement();
            if (f.size() < e) {
              j = i;
            } else {
              j = 0;
            }
            if (j != 0)
            {
              localObject8 = b.z.e;
              Object localObject9 = new java/lang/StringBuilder;
              ((StringBuilder)localObject9).<init>();
              ((StringBuilder)localObject9).append("Enqueueing report: ");
              ((StringBuilder)localObject9).append(((u)localObject2).c());
              ((b.z)localObject8).h(((StringBuilder)localObject9).toString());
              localObject9 = new java/lang/StringBuilder;
              ((StringBuilder)localObject9).<init>();
              ((StringBuilder)localObject9).append("Queue size: ");
              ((StringBuilder)localObject9).append(f.size());
              ((b.z)localObject8).h(((StringBuilder)localObject9).toString());
              localObject9 = g;
              q8.c.a locala = new q8/c$a;
              locala.<init>((q8.c)localObject7, (u)localObject2, (TaskCompletionSource)localObject6);
              ((ThreadPoolExecutor)localObject9).execute(locala);
              localObject7 = new java/lang/StringBuilder;
              ((StringBuilder)localObject7).<init>();
              ((StringBuilder)localObject7).append("Closing task for report: ");
              ((StringBuilder)localObject7).append(((u)localObject2).c());
              ((b.z)localObject8).h(((StringBuilder)localObject7).toString());
            }
            else
            {
              ((q8.c)localObject7).a();
              localObject8 = new java/lang/StringBuilder;
              ((StringBuilder)localObject8).<init>();
              ((StringBuilder)localObject8).append("Dropping report due to queue being full: ");
              ((StringBuilder)localObject8).append(((u)localObject2).c());
              localObject8 = ((StringBuilder)localObject8).toString();
              if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", (String)localObject8, null);
              }
              ((AtomicInteger)i.c).getAndIncrement();
            }
            ((TaskCompletionSource)localObject6).trySetResult(localObject2);
          }
          else
          {
            ((q8.c)localObject7).b((u)localObject2, (TaskCompletionSource)localObject6);
          }
          ((ArrayList)localObject3).add(((TaskCompletionSource)localObject6).getTask().continueWith(paramb, new io.flutter.plugins.firebase.auth.g(this, 15)));
        }
      }
    }
    return Tasks.whenAll((Collection)localObject3);
  }
}

/* Location:
 * Qualified Name:     j8.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */