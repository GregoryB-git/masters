package C4;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;

public class a
{
  public static final F4.a d = ;
  public static volatile a e;
  public final RemoteConfigManager a;
  public M4.f b;
  public x c;
  
  public a(RemoteConfigManager paramRemoteConfigManager, M4.f paramf, x paramx)
  {
    RemoteConfigManager localRemoteConfigManager = paramRemoteConfigManager;
    if (paramRemoteConfigManager == null) {
      localRemoteConfigManager = RemoteConfigManager.getInstance();
    }
    a = localRemoteConfigManager;
    paramRemoteConfigManager = paramf;
    if (paramf == null) {
      paramRemoteConfigManager = new M4.f();
    }
    b = paramRemoteConfigManager;
    paramRemoteConfigManager = paramx;
    if (paramx == null) {
      paramRemoteConfigManager = x.f();
    }
    c = paramRemoteConfigManager;
  }
  
  public static a g()
  {
    try
    {
      if (e == null)
      {
        a locala1 = new C4/a;
        locala1.<init>(null, null, null);
        e = locala1;
      }
    }
    finally
    {
      break label40;
    }
    a locala2 = e;
    return locala2;
    label40:
    throw locala2;
  }
  
  public long A()
  {
    o localo = o.e();
    Object localObject = p(localo);
    if ((((M4.g)localObject).d()) && (N(((Long)((M4.g)localObject).c()).longValue()))) {}
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localo.d())
    {
      return ((Long)localObject).longValue();
      localObject = w(localo);
      if ((((M4.g)localObject).d()) && (N(((Long)((M4.g)localObject).c()).longValue())))
      {
        c.l(localo.a(), ((Long)((M4.g)localObject).c()).longValue());
        break;
      }
      localObject = d(localo);
      if ((((M4.g)localObject).d()) && (N(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public long B()
  {
    p localp = p.e();
    Object localObject = p(localp);
    if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {}
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localp.d())
    {
      return ((Long)localObject).longValue();
      localObject = w(localp);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue())))
      {
        c.l(localp.a(), ((Long)((M4.g)localObject).c()).longValue());
        break;
      }
      localObject = d(localp);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public long C()
  {
    q localq = q.f();
    Object localObject = p(localq);
    if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {
      localObject = (Long)((M4.g)localObject).c();
    }
    for (;;)
    {
      return ((Long)localObject).longValue();
      localObject = w(localq);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue())))
      {
        c.l(localq.a(), ((Long)((M4.g)localObject).c()).longValue());
        break;
      }
      localObject = d(localq);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
      if (a.isLastFetchFailed()) {
        localObject = localq.e();
      } else {
        localObject = localq.d();
      }
    }
  }
  
  public double D()
  {
    r localr = r.f();
    Object localObject = o(localr);
    if (((M4.g)localObject).d())
    {
      double d1 = ((Double)((M4.g)localObject).c()).doubleValue() / 100.0D;
      if (M(d1)) {
        return d1;
      }
    }
    localObject = v(localr);
    if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue())))
    {
      c.k(localr.a(), ((Double)((M4.g)localObject).c()).doubleValue());
      localObject = (Double)((M4.g)localObject).c();
    }
    for (;;)
    {
      return ((Double)localObject).doubleValue();
      localObject = c(localr);
      if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue()))) {
        break;
      }
      if (a.isLastFetchFailed()) {
        localObject = localr.e();
      } else {
        localObject = localr.d();
      }
    }
  }
  
  public long E()
  {
    s locals = s.e();
    Object localObject = w(locals);
    if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
      c.l(locals.a(), ((Long)((M4.g)localObject).c()).longValue());
    }
    for (localObject = (Long)((M4.g)localObject).c();; localObject = locals.d())
    {
      return ((Long)localObject).longValue();
      localObject = d(locals);
      if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public long F()
  {
    t localt = t.e();
    Object localObject = w(localt);
    if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
      c.l(localt.a(), ((Long)((M4.g)localObject).c()).longValue());
    }
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localt.d())
    {
      return ((Long)localObject).longValue();
      localObject = d(localt);
      if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public double G()
  {
    u localu = u.f();
    Object localObject = v(localu);
    if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue())))
    {
      c.k(localu.a(), ((Double)((M4.g)localObject).c()).doubleValue());
      localObject = (Double)((M4.g)localObject).c();
    }
    for (;;)
    {
      return ((Double)localObject).doubleValue();
      localObject = c(localu);
      if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue()))) {
        break;
      }
      if (a.isLastFetchFailed()) {
        localObject = localu.e();
      } else {
        localObject = localu.d();
      }
    }
  }
  
  public boolean H()
  {
    M4.g localg = u(l.e());
    boolean bool;
    if ((!b(c.d()).d()) && (!localg.d())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean I(long paramLong)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean J(String paramString)
  {
    if (paramString.trim().isEmpty()) {
      return false;
    }
    paramString = paramString.split(";");
    int i = paramString.length;
    for (int j = 0; j < i; j++) {
      if (paramString[j].trim().equals(A4.a.b)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean K(long paramLong)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean L()
  {
    Boolean localBoolean = j();
    boolean bool = true;
    if (((localBoolean != null) && (localBoolean.booleanValue() != true)) || (!m())) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean M(double paramDouble)
  {
    boolean bool;
    if ((0.0D <= paramDouble) && (paramDouble <= 1.0D)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean N(long paramLong)
  {
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean O(long paramLong)
  {
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void P(Context paramContext)
  {
    d.i(M4.o.b(paramContext));
    c.j(paramContext);
  }
  
  public void Q(Boolean paramBoolean)
  {
    if (i().booleanValue()) {
      return;
    }
    String str = c.d().a();
    if (str != null) {
      if (paramBoolean != null) {
        c.n(str, Boolean.TRUE.equals(paramBoolean));
      } else {
        c.b(str);
      }
    }
  }
  
  public void R(M4.f paramf)
  {
    b = paramf;
  }
  
  public String a()
  {
    f localf = f.e();
    if (A4.a.a.booleanValue()) {
      return localf.d();
    }
    Object localObject = localf.c();
    long l = -1L;
    if (localObject != null) {
      l = ((Long)a.getRemoteConfigValueOrDefault((String)localObject, Long.valueOf(-1L))).longValue();
    }
    localObject = localf.a();
    if (f.g(l))
    {
      String str = f.f(l);
      if (str != null)
      {
        c.m((String)localObject, str);
        return str;
      }
    }
    localObject = e(localf);
    if (((M4.g)localObject).d()) {
      return (String)((M4.g)localObject).c();
    }
    return localf.d();
  }
  
  public final M4.g b(v paramv)
  {
    return c.c(paramv.a());
  }
  
  public final M4.g c(v paramv)
  {
    return c.d(paramv.a());
  }
  
  public final M4.g d(v paramv)
  {
    return c.g(paramv.a());
  }
  
  public final M4.g e(v paramv)
  {
    return c.h(paramv.a());
  }
  
  public double f()
  {
    e locale = e.e();
    Object localObject = o(locale);
    if (((M4.g)localObject).d())
    {
      double d1 = ((Double)((M4.g)localObject).c()).doubleValue() / 100.0D;
      if (M(d1)) {
        return d1;
      }
    }
    localObject = v(locale);
    if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue()))) {
      c.k(locale.a(), ((Double)((M4.g)localObject).c()).doubleValue());
    }
    for (localObject = (Double)((M4.g)localObject).c();; localObject = locale.d())
    {
      return ((Double)localObject).doubleValue();
      localObject = c(locale);
      if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue()))) {
        break;
      }
    }
  }
  
  public boolean h()
  {
    d locald = d.e();
    Object localObject = n(locald);
    if (((M4.g)localObject).d()) {}
    for (localObject = (Boolean)((M4.g)localObject).c();; localObject = locald.d())
    {
      return ((Boolean)localObject).booleanValue();
      localObject = u(locald);
      if (((M4.g)localObject).d())
      {
        c.n(locald.a(), ((Boolean)((M4.g)localObject).c()).booleanValue());
        break;
      }
      localObject = b(locald);
      if (((M4.g)localObject).d()) {
        break;
      }
    }
  }
  
  public Boolean i()
  {
    b localb = b.e();
    M4.g localg = n(localb);
    if (localg.d()) {
      return (Boolean)localg.c();
    }
    return localb.d();
  }
  
  public Boolean j()
  {
    if (i().booleanValue()) {
      return Boolean.FALSE;
    }
    Object localObject = c.d();
    M4.g localg = b((v)localObject);
    if (localg.d()) {}
    for (localObject = localg.c();; localObject = ((M4.g)localObject).c())
    {
      return (Boolean)localObject;
      localObject = n((v)localObject);
      if (!((M4.g)localObject).d()) {
        break;
      }
    }
    return null;
  }
  
  public final boolean k()
  {
    l locall = l.e();
    Object localObject = u(locall);
    if (((M4.g)localObject).d())
    {
      if (a.isLastFetchFailed()) {
        return false;
      }
      c.n(locall.a(), ((Boolean)((M4.g)localObject).c()).booleanValue());
    }
    for (localObject = (Boolean)((M4.g)localObject).c();; localObject = locall.d())
    {
      return ((Boolean)localObject).booleanValue();
      localObject = b(locall);
      if (((M4.g)localObject).d()) {
        break;
      }
    }
  }
  
  public final boolean l()
  {
    k localk = k.e();
    Object localObject = x(localk);
    if (((M4.g)localObject).d()) {
      c.m(localk.a(), (String)((M4.g)localObject).c());
    }
    for (localObject = (String)((M4.g)localObject).c();; localObject = localk.d())
    {
      return J((String)localObject);
      localObject = e(localk);
      if (((M4.g)localObject).d()) {
        break;
      }
    }
  }
  
  public boolean m()
  {
    boolean bool;
    if ((k()) && (!l())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final M4.g n(v paramv)
  {
    return b.b(paramv.b());
  }
  
  public final M4.g o(v paramv)
  {
    return b.c(paramv.b());
  }
  
  public final M4.g p(v paramv)
  {
    return b.e(paramv.b());
  }
  
  public long q()
  {
    g localg = g.e();
    Object localObject = w(localg);
    if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
      c.l(localg.a(), ((Long)((M4.g)localObject).c()).longValue());
    }
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localg.d())
    {
      return ((Long)localObject).longValue();
      localObject = d(localg);
      if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public long r()
  {
    h localh = h.e();
    Object localObject = w(localh);
    if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
      c.l(localh.a(), ((Long)((M4.g)localObject).c()).longValue());
    }
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localh.d())
    {
      return ((Long)localObject).longValue();
      localObject = d(localh);
      if ((((M4.g)localObject).d()) && (I(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public double s()
  {
    i locali = i.f();
    Object localObject = v(locali);
    if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue())))
    {
      c.k(locali.a(), ((Double)((M4.g)localObject).c()).doubleValue());
      localObject = (Double)((M4.g)localObject).c();
    }
    for (;;)
    {
      return ((Double)localObject).doubleValue();
      localObject = c(locali);
      if ((((M4.g)localObject).d()) && (M(((Double)((M4.g)localObject).c()).doubleValue()))) {
        break;
      }
      if (a.isLastFetchFailed()) {
        localObject = locali.e();
      } else {
        localObject = locali.d();
      }
    }
  }
  
  public long t()
  {
    j localj = j.e();
    Object localObject = w(localj);
    if ((((M4.g)localObject).d()) && (O(((Long)((M4.g)localObject).c()).longValue()))) {
      c.l(localj.a(), ((Long)((M4.g)localObject).c()).longValue());
    }
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localj.d())
    {
      return ((Long)localObject).longValue();
      localObject = d(localj);
      if ((((M4.g)localObject).d()) && (O(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public final M4.g u(v paramv)
  {
    return a.getBoolean(paramv.c());
  }
  
  public final M4.g v(v paramv)
  {
    return a.getDouble(paramv.c());
  }
  
  public final M4.g w(v paramv)
  {
    return a.getLong(paramv.c());
  }
  
  public final M4.g x(v paramv)
  {
    return a.getString(paramv.c());
  }
  
  public long y()
  {
    m localm = m.e();
    Object localObject = p(localm);
    if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {}
    for (localObject = (Long)((M4.g)localObject).c();; localObject = localm.d())
    {
      return ((Long)localObject).longValue();
      localObject = w(localm);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue())))
      {
        c.l(localm.a(), ((Long)((M4.g)localObject).c()).longValue());
        break;
      }
      localObject = d(localm);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
    }
  }
  
  public long z()
  {
    n localn = n.f();
    Object localObject = p(localn);
    if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {
      localObject = (Long)((M4.g)localObject).c();
    }
    for (;;)
    {
      return ((Long)localObject).longValue();
      localObject = w(localn);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue())))
      {
        c.l(localn.a(), ((Long)((M4.g)localObject).c()).longValue());
        break;
      }
      localObject = d(localn);
      if ((((M4.g)localObject).d()) && (K(((Long)((M4.g)localObject).c()).longValue()))) {
        break;
      }
      if (a.isLastFetchFailed()) {
        localObject = localn.e();
      } else {
        localObject = localn.d();
      }
    }
  }
}

/* Location:
 * Qualified Name:     C4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */