package G4;

import L4.k;
import M4.o;
import N4.h;
import N4.h.b;
import N4.h.d;
import N4.h.e;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.protobuf.r.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j
  extends B4.b
  implements J4.b
{
  public static final F4.a A = ;
  public final List s;
  public final GaugeManager t;
  public final k u;
  public final h.b v = h.H0();
  public final WeakReference w = new WeakReference(this);
  public String x;
  public boolean y;
  public boolean z;
  
  public j(k paramk)
  {
    this(paramk, B4.a.b(), GaugeManager.getInstance());
  }
  
  public j(k paramk, B4.a parama, GaugeManager paramGaugeManager)
  {
    super(parama);
    u = paramk;
    t = paramGaugeManager;
    s = Collections.synchronizedList(new ArrayList());
    e();
  }
  
  public static j h(k paramk)
  {
    return new j(paramk);
  }
  
  private boolean m()
  {
    return v.I();
  }
  
  private boolean n()
  {
    return v.K();
  }
  
  public static boolean o(String paramString)
  {
    if (paramString.length() > 128) {
      return false;
    }
    int i = 0;
    while (i < paramString.length())
    {
      int j = paramString.charAt(i);
      if ((j > 31) && (j <= 127)) {
        i++;
      } else {
        return false;
      }
    }
    return true;
  }
  
  public j A(long paramLong)
  {
    v.U(paramLong);
    if (SessionManager.getInstance().perfSession().e()) {
      t.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
    }
    return this;
  }
  
  public j B(long paramLong)
  {
    v.V(paramLong);
    return this;
  }
  
  public j C(String paramString)
  {
    if (paramString != null)
    {
      paramString = o.d(paramString);
      v.W(o.e(paramString, 2000));
    }
    return this;
  }
  
  public j E(String paramString)
  {
    x = paramString;
    return this;
  }
  
  public void a(J4.a parama)
  {
    if (parama == null)
    {
      A.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
      return;
    }
    if ((m()) && (!n())) {
      s.add(parama);
    }
  }
  
  public h g()
  {
    SessionManager.getInstance().unregisterForSessionUpdates(w);
    f();
    Object localObject = J4.a.b(i());
    if (localObject != null) {
      v.D(Arrays.asList((Object[])localObject));
    }
    localObject = (h)v.v();
    if (!I4.j.c(x))
    {
      A.a("Dropping network request from a 'User-Agent' that is not allowed");
      return (h)localObject;
    }
    if (!y)
    {
      u.C((h)localObject, c());
      y = true;
      return (h)localObject;
    }
    if (z) {
      A.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
    }
    return (h)localObject;
  }
  
  public List i()
  {
    ArrayList localArrayList;
    List localList2;
    synchronized (s)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = s.iterator();
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
  
  public long j()
  {
    return v.G();
  }
  
  public String k()
  {
    return v.H();
  }
  
  public boolean l()
  {
    return v.J();
  }
  
  public j p(Map paramMap)
  {
    v.E().L(paramMap);
    return this;
  }
  
  public j q(String paramString)
  {
    if (paramString != null)
    {
      h.d locald = h.d.p;
      paramString = paramString.toUpperCase();
      paramString.hashCode();
      int i = paramString.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 2012838315: 
        if (paramString.equals("DELETE")) {
          j = 8;
        }
        break;
      case 1669334218: 
        if (paramString.equals("CONNECT")) {
          j = 7;
        }
        break;
      case 80083237: 
        if (paramString.equals("TRACE")) {
          j = 6;
        }
        break;
      case 75900968: 
        if (paramString.equals("PATCH")) {
          j = 5;
        }
        break;
      case 2461856: 
        if (paramString.equals("POST")) {
          j = 4;
        }
        break;
      case 2213344: 
        if (paramString.equals("HEAD")) {
          j = 3;
        }
        break;
      case 79599: 
        if (paramString.equals("PUT")) {
          j = 2;
        }
        break;
      case 70454: 
        if (paramString.equals("GET")) {
          j = 1;
        }
        break;
      case -531492226: 
        if (paramString.equals("OPTIONS")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramString = h.d.p;
        break;
      case 8: 
        paramString = h.d.t;
        break;
      case 7: 
        paramString = h.d.y;
        break;
      case 6: 
        paramString = h.d.x;
        break;
      case 5: 
        paramString = h.d.v;
        break;
      case 4: 
        paramString = h.d.s;
        break;
      case 3: 
        paramString = h.d.u;
        break;
      case 2: 
        paramString = h.d.r;
        break;
      case 1: 
        paramString = h.d.q;
        break;
      case 0: 
        paramString = h.d.w;
      }
      v.N(paramString);
    }
    return this;
  }
  
  public j r(int paramInt)
  {
    v.O(paramInt);
    return this;
  }
  
  public void t()
  {
    z = true;
  }
  
  public j u()
  {
    v.P(h.e.q);
    return this;
  }
  
  public j v(long paramLong)
  {
    v.Q(paramLong);
    return this;
  }
  
  public j w(long paramLong)
  {
    J4.a locala = SessionManager.getInstance().perfSession();
    SessionManager.getInstance().registerForSessionUpdates(w);
    v.M(paramLong);
    a(locala);
    if (locala.e()) {
      t.collectGaugeMetricOnce(locala.d());
    }
    return this;
  }
  
  public j x(String paramString)
  {
    if (paramString == null)
    {
      v.F();
      return this;
    }
    if (o(paramString))
    {
      v.R(paramString);
    }
    else
    {
      F4.a locala = A;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("The content type of the response is not a valid content-type:");
      localStringBuilder.append(paramString);
      locala.j(localStringBuilder.toString());
    }
    return this;
  }
  
  public j y(long paramLong)
  {
    v.S(paramLong);
    return this;
  }
  
  public j z(long paramLong)
  {
    v.T(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     G4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */