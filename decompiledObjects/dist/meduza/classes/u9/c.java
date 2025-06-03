package u9;

import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import q0.g;
import w9.a.a;
import x9.b.a;

public final class c
  implements d
{
  public static final Object m = new Object();
  public final u7.f a;
  public final x9.c b;
  public final w9.c c;
  public final k d;
  public final o<w9.b> e;
  public final i f;
  public final Object g = new Object();
  public final ExecutorService h;
  public final Executor i;
  public String j;
  public HashSet k = new HashSet();
  public final ArrayList l = new ArrayList();
  
  static
  {
    new AtomicInteger(1);
  }
  
  public c() {}
  
  public c(u7.f paramf, t9.b paramb, ExecutorService paramExecutorService, e8.j paramj)
  {
    a = paramf;
    b = localc;
    c = paramb;
    d = localk;
    e = localo;
    f = locali;
    h = paramExecutorService;
    i = paramj;
  }
  
  public final Task a()
  {
    d();
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    f localf = new f(d, localTaskCompletionSource);
    synchronized (g)
    {
      l.add(localf);
      ??? = localTaskCompletionSource.getTask();
      h.execute(new b(this));
      return (Task)???;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (m)
    {
      Object localObject2 = a;
      ((u7.f)localObject2).a();
      r4.c localc = r4.c.b(a);
      try
      {
        Object localObject5 = c.c();
        int n = c;
        if ((n != 2) && (n != 1)) {
          n = 0;
        } else {
          n = 1;
        }
        localObject2 = localObject5;
        if (n != 0)
        {
          localObject2 = e((w9.a)localObject5);
          w9.c localc1 = c;
          a.a locala = new w9/a$a;
          locala.<init>((w9.d)localObject5);
          a = ((String)localObject2);
          locala.b(3);
          localObject2 = locala.a();
          localc1.b((w9.a)localObject2);
        }
        if (localc != null) {
          localc.g();
        }
        localObject5 = localObject2;
        if (paramBoolean)
        {
          localObject2 = new a.a((w9.d)localObject2);
          c = null;
          localObject5 = ((a.a)localObject2).a();
        }
        g((w9.a)localObject5);
        i.execute(new x3.j(1, this, paramBoolean));
        return;
      }
      finally
      {
        if (localc != null) {
          localc.g();
        }
      }
    }
  }
  
  public final w9.a c(w9.a parama)
  {
    Object localObject1 = b;
    Object localObject2 = a;
    ((u7.f)localObject2).a();
    Object localObject3 = c.a;
    localObject2 = b;
    Object localObject4 = a;
    ((u7.f)localObject4).a();
    String str = c.g;
    localObject4 = e;
    synchronized (c)
    {
      long l1;
      long l2;
      if (c != 0)
      {
        a.a.getClass();
        l1 = System.currentTimeMillis();
        l2 = b;
        if (l1 <= l2)
        {
          n = 0;
          break label116;
        }
      }
      int n = 1;
      label116:
      if (n != 0)
      {
        URL localURL = x9.c.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[] { str, localObject2 }));
        for (n = 0; n <= 1; n++)
        {
          TrafficStats.setThreadStatsTag(32771);
          ??? = ((x9.c)localObject1).c(localURL, (String)localObject3);
          try
          {
            int i1;
            try
            {
              ((HttpURLConnection)???).setRequestMethod("POST");
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              ((StringBuilder)localObject2).append("FIS_v2 ");
              ((StringBuilder)localObject2).append((String)localObject4);
              ((URLConnection)???).addRequestProperty("Authorization", ((StringBuilder)localObject2).toString());
              ((URLConnection)???).setDoOutput(true);
              x9.c.h((HttpURLConnection)???);
              i1 = ((HttpURLConnection)???).getResponseCode();
              c.a(i1);
              int i2;
              if ((i1 >= 200) && (i1 < 300)) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if (i2 != 0) {
                localObject2 = x9.c.f((HttpURLConnection)???);
              }
            }
            finally
            {
              break label594;
            }
            x9.c.b((HttpURLConnection)???, null, (String)localObject3, str);
            if ((i1 != 401) && (i1 != 404))
            {
              if (i1 != 429)
              {
                if ((i1 >= 500) && (i1 < 600)) {
                  break label604;
                }
                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                localObject2 = new x9/b$a;
                ((b.a)localObject2).<init>();
                a = Long.valueOf(0L);
                b = 2;
              }
              else
              {
                localObject2 = new u9/e;
                ((e)localObject2).<init>("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                throw ((Throwable)localObject2);
              }
            }
            else
            {
              localObject2 = new x9/b$a;
              ((b.a)localObject2).<init>();
              a = Long.valueOf(0L);
              b = 3;
            }
            localObject2 = ((b.a)localObject2).a();
            ((HttpURLConnection)???).disconnect();
            TrafficStats.clearThreadStatsTag();
            n = g.c(c);
            if (n != 0)
            {
              if (n != 1)
              {
                if (n == 2) {
                  try
                  {
                    j = null;
                    parama = new a.a(parama);
                    parama.b(2);
                    return parama.a();
                  }
                  finally {}
                }
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
              }
              parama = parama.h();
              g = "BAD CONFIG";
              parama.b(5);
              return parama.a();
            }
            localObject1 = a;
            l1 = b;
            localObject2 = d;
            localObject2.getClass();
            localObject3 = TimeUnit.MILLISECONDS;
            a.getClass();
            l2 = ((TimeUnit)localObject3).toSeconds(System.currentTimeMillis());
            parama = new a.a(parama);
            c = ((String)localObject1);
            e = Long.valueOf(l1);
            f = Long.valueOf(l2);
            return parama.a();
          }
          catch (AssertionError|IOException localAssertionError)
          {
            label594:
            for (;;) {}
          }
          ((HttpURLConnection)???).disconnect();
          TrafficStats.clearThreadStatsTag();
          throw parama;
          label604:
          ((HttpURLConnection)???).disconnect();
          TrafficStats.clearThreadStatsTag();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
      }
      throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }
  }
  
  public final void d()
  {
    Object localObject = a;
    ((u7.f)localObject).a();
    m6.j.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c.b);
    localObject = a;
    ((u7.f)localObject).a();
    m6.j.f("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c.g);
    localObject = a;
    ((u7.f)localObject).a();
    m6.j.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", c.a);
    localObject = a;
    ((u7.f)localObject).a();
    localObject = c.b;
    Pattern localPattern = k.c;
    m6.j.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", ((String)localObject).contains(":"));
    localObject = a;
    ((u7.f)localObject).a();
    localObject = c.a;
    m6.j.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.c.matcher((CharSequence)localObject).matches());
  }
  
  public final String e(w9.a parama)
  {
    ??? = a;
    ((u7.f)???).a();
    if (!b.equals("CHIME_ANDROID_SDK"))
    {
      ??? = a;
      ((u7.f)???).a();
      if (!"[DEFAULT]".equals(b)) {}
    }
    else
    {
      int n = c;
      int i1 = 1;
      if (n != 1) {
        i1 = 0;
      }
      if (i1 != 0) {
        break label80;
      }
    }
    f.getClass();
    return i.a();
    label80:
    w9.b localb = (w9.b)e.get();
    synchronized (a)
    {
      synchronized (a)
      {
        parama = a.getString("|S|id", null);
        if (parama == null) {
          parama = localb.a();
        }
        ??? = parama;
        if (TextUtils.isEmpty(parama))
        {
          f.getClass();
          ??? = i.a();
        }
        return (String)???;
      }
    }
  }
  
  public final w9.a f(w9.a parama)
  {
    Object localObject1 = b;
    ??? = null;
    ??? = null;
    Object localObject4 = ???;
    int n;
    Object localObject7;
    if (localObject1 != null)
    {
      localObject4 = ???;
      if (((String)localObject1).length() == 11)
      {
        localObject6 = (w9.b)e.get();
        for (;;)
        {
          synchronized (a)
          {
            localObject1 = w9.b.c;
            n = 0;
            localObject4 = ???;
            if (n < 4)
            {
              localObject4 = localObject1[n];
              localObject7 = b;
              localObject8 = new java/lang/StringBuilder;
              ((StringBuilder)localObject8).<init>();
              ((StringBuilder)localObject8).append("|T|");
              ((StringBuilder)localObject8).append((String)localObject7);
              ((StringBuilder)localObject8).append("|");
              ((StringBuilder)localObject8).append((String)localObject4);
              localObject4 = ((StringBuilder)localObject8).toString();
              localObject4 = a.getString((String)localObject4, null);
              if ((localObject4 == null) || (((String)localObject4).isEmpty())) {
                break label204;
              }
              boolean bool = ((String)localObject4).startsWith("{");
              if (!bool) {}
            }
          }
          break;
          label204:
          n++;
        }
        throw parama;
      }
    }
    ??? = b;
    ??? = a;
    ((u7.f)???).a();
    Object localObject6 = c.a;
    localObject1 = b;
    ??? = a;
    ((u7.f)???).a();
    Object localObject8 = c.g;
    ??? = a;
    ((u7.f)???).a();
    String str = c.b;
    synchronized (c)
    {
      long l1;
      long l2;
      if (c != 0)
      {
        a.a.getClass();
        l1 = System.currentTimeMillis();
        l2 = b;
        if (l1 <= l2)
        {
          n = 0;
          break label348;
        }
      }
      n = 1;
      label348:
      if (n != 0)
      {
        URL localURL = x9.c.a(String.format("projects/%s/installations", new Object[] { localObject8 }));
        for (n = 0; n <= 1; n++)
        {
          TrafficStats.setThreadStatsTag(32769);
          localObject7 = ((x9.c)???).c(localURL, (String)localObject6);
          do
          {
            try
            {
              try
              {
                ((HttpURLConnection)localObject7).setRequestMethod("POST");
                ((URLConnection)localObject7).setDoOutput(true);
                if (localObject4 != null) {
                  ((URLConnection)localObject7).addRequestProperty("x-goog-fis-android-iid-migration-auth", (String)localObject4);
                }
              }
              finally
              {
                break label780;
              }
            }
            catch (AssertionError|IOException localAssertionError1)
            {
              int i1;
              int i2;
              Object localObject5;
              for (;;) {}
            }
            x9.c.g((HttpURLConnection)localObject7, (String)localObject1, str);
            i1 = ((HttpURLConnection)localObject7).getResponseCode();
            c.a(i1);
            if ((i1 >= 200) && (i1 < 300)) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            if (i2 != 0)
            {
              ??? = x9.c.e((HttpURLConnection)localObject7);
              ((HttpURLConnection)localObject7).disconnect();
              TrafficStats.clearThreadStatsTag();
              localObject4 = ???;
              break;
            }
            x9.c.b((HttpURLConnection)localObject7, str, (String)localObject6, (String)localObject8);
            if (i1 == 429) {
              break label764;
            }
          } while ((i1 >= 500) && (i1 < 600));
          Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
          ??? = new x9.a(null, null, null, null, 2);
          ((HttpURLConnection)localObject7).disconnect();
          TrafficStats.clearThreadStatsTag();
          localObject4 = ???;
          n = g.c(e);
          if (n != 0)
          {
            if (n == 1)
            {
              parama = parama.h();
              g = "BAD CONFIG";
              parama.b(5);
              return parama.a();
            }
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
          }
          ??? = b;
          ??? = c;
          localObject6 = d;
          localObject6.getClass();
          localObject1 = TimeUnit.MILLISECONDS;
          a.getClass();
          l2 = ((TimeUnit)localObject1).toSeconds(System.currentTimeMillis());
          localObject1 = d.b();
          l1 = d.c();
          parama = new a.a(parama);
          a = ((String)???);
          parama.b(4);
          c = ((String)localObject1);
          d = ((String)???);
          e = Long.valueOf(l1);
          f = Long.valueOf(l2);
          return parama.a();
          try
          {
            label764:
            ??? = new u9/e;
            ((e)???).<init>("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
            throw ((Throwable)???);
          }
          catch (AssertionError|IOException localAssertionError2)
          {
            label780:
            for (;;) {}
          }
          ((HttpURLConnection)localObject7).disconnect();
          TrafficStats.clearThreadStatsTag();
          throw parama;
          ((HttpURLConnection)localObject7).disconnect();
          TrafficStats.clearThreadStatsTag();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
      }
      else
      {
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
      }
    }
  }
  
  public final void g(w9.a parama)
  {
    synchronized (g)
    {
      Iterator localIterator = l.iterator();
      while (localIterator.hasNext()) {
        if (((j)localIterator.next()).b(parama)) {
          localIterator.remove();
        }
      }
      return;
    }
  }
  
  /* Error */
  public final Task<String> getId()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 112	u9/c:d	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 337	u9/c:j	Ljava/lang/String;
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: ifnull +8 -> 22
    //   17: aload_1
    //   18: invokestatic 516	com/google/android/gms/tasks/Tasks:forResult	(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    //   21: areturn
    //   22: new 114	com/google/android/gms/tasks/TaskCompletionSource
    //   25: dup
    //   26: invokespecial 115	com/google/android/gms/tasks/TaskCompletionSource:<init>	()V
    //   29: astore_2
    //   30: new 518	u9/g
    //   33: dup
    //   34: aload_2
    //   35: invokespecial 521	u9/g:<init>	(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    //   38: astore_3
    //   39: aload_0
    //   40: getfield 83	u9/c:g	Ljava/lang/Object;
    //   43: astore_1
    //   44: aload_1
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 93	u9/c:l	Ljava/util/ArrayList;
    //   50: aload_3
    //   51: invokevirtual 124	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   54: pop
    //   55: aload_1
    //   56: monitorexit
    //   57: aload_2
    //   58: invokevirtual 127	com/google/android/gms/tasks/TaskCompletionSource:getTask	()Lcom/google/android/gms/tasks/Task;
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 107	u9/c:h	Ljava/util/concurrent/ExecutorService;
    //   66: new 523	b/d
    //   69: dup
    //   70: aload_0
    //   71: bipush 19
    //   73: invokespecial 524	b/d:<init>	(Ljava/lang/Object;I)V
    //   76: invokeinterface 138 2 0
    //   81: aload_1
    //   82: areturn
    //   83: astore_3
    //   84: aload_1
    //   85: monitorexit
    //   86: aload_3
    //   87: athrow
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	c
    //   88	4	1	localObject2	Object
    //   29	29	2	localTaskCompletionSource	TaskCompletionSource
    //   38	13	3	localg	g
    //   83	4	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   46	57	83	finally
    //   84	86	83	finally
    //   6	11	88	finally
  }
}

/* Location:
 * Qualified Name:     u9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */