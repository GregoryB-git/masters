package com.google.firebase.perf.metrics;

import G4.g;
import H4.e;
import M4.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace
  extends B4.b
  implements Parcelable, J4.b
{
  @Keep
  public static final Parcelable.Creator<Trace> CREATOR = new a();
  public static final F4.a E = ;
  public static final Map F = new ConcurrentHashMap();
  public static final Parcelable.Creator G = new b();
  public final L4.k A;
  public final M4.a B;
  public l C;
  public l D;
  public final WeakReference s = new WeakReference(this);
  public final Trace t;
  public final GaugeManager u;
  public final String v;
  public final Map w;
  public final Map x;
  public final List y;
  public final List z;
  
  public Trace(Parcel paramParcel, boolean paramBoolean)
  {
    super((B4.a)localObject);
    t = ((Trace)paramParcel.readParcelable(Trace.class.getClassLoader()));
    v = paramParcel.readString();
    Object localObject = new ArrayList();
    z = ((List)localObject);
    paramParcel.readList((List)localObject, Trace.class.getClassLoader());
    localObject = new ConcurrentHashMap();
    w = ((Map)localObject);
    x = new ConcurrentHashMap();
    paramParcel.readMap((Map)localObject, g.class.getClassLoader());
    C = ((l)paramParcel.readParcelable(l.class.getClassLoader()));
    D = ((l)paramParcel.readParcelable(l.class.getClassLoader()));
    localObject = Collections.synchronizedList(new ArrayList());
    y = ((List)localObject);
    paramParcel.readList((List)localObject, J4.a.class.getClassLoader());
    if (paramBoolean)
    {
      A = null;
      B = null;
      u = null;
    }
    else
    {
      A = L4.k.l();
      B = new M4.a();
      u = GaugeManager.getInstance();
    }
  }
  
  public Trace(String paramString)
  {
    this(paramString, L4.k.l(), new M4.a(), B4.a.b(), GaugeManager.getInstance());
  }
  
  public Trace(String paramString, L4.k paramk, M4.a parama, B4.a parama1)
  {
    this(paramString, paramk, parama, parama1, GaugeManager.getInstance());
  }
  
  public Trace(String paramString, L4.k paramk, M4.a parama, B4.a parama1, GaugeManager paramGaugeManager)
  {
    super(parama1);
    t = null;
    v = paramString.trim();
    z = new ArrayList();
    w = new ConcurrentHashMap();
    x = new ConcurrentHashMap();
    B = parama;
    A = paramk;
    y = Collections.synchronizedList(new ArrayList());
    u = paramGaugeManager;
  }
  
  public static Trace h(String paramString)
  {
    return new Trace(paramString);
  }
  
  public void a(J4.a parama)
  {
    if (parama == null)
    {
      E.j("Unable to add new SessionId to the Trace. Continuing without it.");
      return;
    }
    if ((o()) && (!q())) {
      y.add(parama);
    }
  }
  
  @Keep
  public int describeContents()
  {
    return 0;
  }
  
  /* Error */
  public void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 202	com/google/firebase/perf/metrics/Trace:p	()Z
    //   4: ifeq +34 -> 38
    //   7: getstatic 51	com/google/firebase/perf/metrics/Trace:E	LF4/a;
    //   10: ldc -52
    //   12: iconst_1
    //   13: anewarray 206	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_0
    //   19: getfield 102	com/google/firebase/perf/metrics/Trace:v	Ljava/lang/String;
    //   22: aastore
    //   23: invokevirtual 210	F4/a:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aload_0
    //   27: iconst_1
    //   28: invokevirtual 214	B4/b:d	(I)V
    //   31: goto +7 -> 38
    //   34: astore_1
    //   35: goto +8 -> 43
    //   38: aload_0
    //   39: invokespecial 216	java/lang/Object:finalize	()V
    //   42: return
    //   43: aload_0
    //   44: invokespecial 216	java/lang/Object:finalize	()V
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	Trace
    //   34	14	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	31	34	finally
  }
  
  public final void g(String paramString1, String paramString2)
  {
    if (!q())
    {
      if ((!x.containsKey(paramString1)) && (x.size() >= 5)) {
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[] { Integer.valueOf(5) }));
      }
      e.d(paramString1, paramString2);
      return;
    }
    throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[] { v }));
  }
  
  @Keep
  public String getAttribute(@NonNull String paramString)
  {
    return (String)x.get(paramString);
  }
  
  @Keep
  @NonNull
  public Map<String, String> getAttributes()
  {
    return new HashMap(x);
  }
  
  @Keep
  public long getLongMetric(@NonNull String paramString)
  {
    if (paramString != null) {
      paramString = (g)w.get(paramString.trim());
    } else {
      paramString = null;
    }
    if (paramString == null) {
      return 0L;
    }
    return paramString.a();
  }
  
  public Map i()
  {
    return w;
  }
  
  @Keep
  public void incrementMetric(@NonNull String paramString, long paramLong)
  {
    Object localObject = e.e(paramString);
    if (localObject != null)
    {
      E.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", new Object[] { paramString, localObject });
      return;
    }
    if (!o())
    {
      E.k("Cannot increment metric '%s' for trace '%s' because it's not started", new Object[] { paramString, v });
      return;
    }
    if (q())
    {
      E.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", new Object[] { paramString, v });
      return;
    }
    localObject = r(paramString.trim());
    ((g)localObject).c(paramLong);
    E.b("Incrementing metric '%s' to %d on trace '%s'", new Object[] { paramString, Long.valueOf(((g)localObject).a()), v });
  }
  
  public l j()
  {
    return D;
  }
  
  public String k()
  {
    return v;
  }
  
  public List l()
  {
    ArrayList localArrayList;
    List localList2;
    synchronized (y)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = y.iterator();
      J4.a locala;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        locala = (J4.a)localIterator.next();
      } while (locala == null);
      localArrayList.add(locala);
    }
  }
  
  public l m()
  {
    return C;
  }
  
  public List n()
  {
    return z;
  }
  
  public boolean o()
  {
    boolean bool;
    if (C != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean p()
  {
    boolean bool;
    if ((o()) && (!q())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Keep
  public void putAttribute(@NonNull String paramString1, @NonNull String paramString2)
  {
    int i = 1;
    String str1 = paramString1;
    String str2 = paramString2;
    try
    {
      paramString1 = paramString1.trim();
      str1 = paramString1;
      str2 = paramString2;
      paramString2 = paramString2.trim();
      str1 = paramString1;
      str2 = paramString2;
      g(paramString1, paramString2);
      str1 = paramString1;
      str2 = paramString2;
      E.b("Setting attribute '%s' to '%s' on trace '%s'", new Object[] { paramString1, paramString2, v });
    }
    catch (Exception paramString1)
    {
      E.d("Can not set attribute '%s' with value '%s' (%s)", new Object[] { str1, str2, paramString1.getMessage() });
      i = 0;
      paramString2 = str2;
      paramString1 = str1;
    }
    if (i != 0) {
      x.put(paramString1, paramString2);
    }
  }
  
  @Keep
  public void putMetric(@NonNull String paramString, long paramLong)
  {
    String str = e.e(paramString);
    if (str != null)
    {
      E.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", new Object[] { paramString, str });
      return;
    }
    if (!o())
    {
      E.k("Cannot set value for metric '%s' for trace '%s' because it's not started", new Object[] { paramString, v });
      return;
    }
    if (q())
    {
      E.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", new Object[] { paramString, v });
      return;
    }
    r(paramString.trim()).d(paramLong);
    E.b("Setting metric '%s' to '%s' on trace '%s'", new Object[] { paramString, Long.valueOf(paramLong), v });
  }
  
  public boolean q()
  {
    boolean bool;
    if (D != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final g r(String paramString)
  {
    g localg1 = (g)w.get(paramString);
    g localg2 = localg1;
    if (localg1 == null)
    {
      localg2 = new g(paramString);
      w.put(paramString, localg2);
    }
    return localg2;
  }
  
  @Keep
  public void removeAttribute(@NonNull String paramString)
  {
    if (q())
    {
      E.c("Can't remove a attribute from a Trace that's stopped.");
      return;
    }
    x.remove(paramString);
  }
  
  @Keep
  public void start()
  {
    if (!C4.a.g().L())
    {
      E.a("Trace feature is disabled.");
      return;
    }
    Object localObject = e.f(v);
    if (localObject != null)
    {
      E.d("Cannot start trace '%s'. Trace name is invalid.(%s)", new Object[] { v, localObject });
      return;
    }
    if (C != null)
    {
      E.d("Trace '%s' has already started, should not start again!", new Object[] { v });
      return;
    }
    C = B.a();
    e();
    localObject = SessionManager.getInstance().perfSession();
    SessionManager.getInstance().registerForSessionUpdates(s);
    a((J4.a)localObject);
    if (((J4.a)localObject).e()) {
      u.collectGaugeMetricOnce(((J4.a)localObject).d());
    }
  }
  
  @Keep
  public void stop()
  {
    if (!o())
    {
      E.d("Trace '%s' has not been started so unable to stop!", new Object[] { v });
      return;
    }
    if (q())
    {
      E.d("Trace '%s' has already stopped, should not stop again!", new Object[] { v });
      return;
    }
    SessionManager.getInstance().unregisterForSessionUpdates(s);
    f();
    l locall = B.a();
    D = locall;
    if (t == null)
    {
      t(locall);
      if (!v.isEmpty())
      {
        A.D(new G4.k(this).a(), c());
        if (SessionManager.getInstance().perfSession().e()) {
          u.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
      }
      else
      {
        E.c("Trace name is empty, no log is sent to server");
      }
    }
  }
  
  public final void t(l paraml)
  {
    if (z.isEmpty()) {
      return;
    }
    int i = z.size();
    Trace localTrace = (Trace)z.get(i - 1);
    if (D == null) {
      D = paraml;
    }
  }
  
  @Keep
  public void writeToParcel(@NonNull Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(t, 0);
    paramParcel.writeString(v);
    paramParcel.writeList(z);
    paramParcel.writeMap(w);
    paramParcel.writeParcelable(C, 0);
    paramParcel.writeParcelable(D, 0);
    synchronized (y)
    {
      paramParcel.writeList(y);
      return;
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public Trace a(Parcel paramParcel)
    {
      return new Trace(paramParcel, false, null);
    }
    
    public Trace[] b(int paramInt)
    {
      return new Trace[paramInt];
    }
  }
  
  public class b
    implements Parcelable.Creator
  {
    public Trace a(Parcel paramParcel)
    {
      return new Trace(paramParcel, true, null);
    }
    
    public Trace[] b(int paramInt)
    {
      return new Trace[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.metrics.Trace
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */