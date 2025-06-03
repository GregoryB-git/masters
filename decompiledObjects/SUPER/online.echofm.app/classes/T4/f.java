package T4;

import V5.o;
import V5.t;
import X5.g;
import android.content.Context;
import s4.i;

public final class f
{
  public static final a c = new a(null);
  public static final i6.a d = R.a.b("firebase_session_settings", null, null, null, 14, null);
  public final h a;
  public final h b;
  
  public f(h paramh1, h paramh2)
  {
    a = paramh1;
    b = paramh2;
  }
  
  public f(Context paramContext, g paramg1, g paramg2, i parami, R4.b paramb)
  {
    this(new b(paramContext), new c(paramg2, parami, paramb, new d(paramb, paramg1, null, 4, null), a.a(c, paramContext)));
  }
  
  public final double b()
  {
    Double localDouble = a.b();
    double d1;
    if (localDouble != null)
    {
      d1 = localDouble.doubleValue();
      if (e(d1)) {
        return d1;
      }
    }
    localDouble = b.b();
    if (localDouble != null)
    {
      d1 = localDouble.doubleValue();
      if (e(d1)) {
        return d1;
      }
    }
    return 1.0D;
  }
  
  public final long c()
  {
    Object localObject = a.d();
    long l;
    if (localObject != null)
    {
      l = ((o6.a)localObject).a0();
      if (f(l)) {
        return l;
      }
    }
    localObject = b.d();
    if (localObject != null)
    {
      l = ((o6.a)localObject).a0();
      if (f(l)) {
        return l;
      }
    }
    localObject = o6.a.p;
    return o6.c.o(30, o6.d.t);
  }
  
  public final boolean d()
  {
    Boolean localBoolean = a.a();
    if (localBoolean != null) {
      return localBoolean.booleanValue();
    }
    localBoolean = b.a();
    if (localBoolean != null) {
      return localBoolean.booleanValue();
    }
    return true;
  }
  
  public final boolean e(double paramDouble)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (0.0D <= paramDouble)
    {
      bool2 = bool1;
      if (paramDouble <= 1.0D) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean f(long paramLong)
  {
    boolean bool;
    if ((o6.a.U(paramLong)) && (o6.a.H(paramLong))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object g(X5.d paramd)
  {
    if ((paramd instanceof b))
    {
      localObject1 = (b)paramd;
      i = r;
      if ((i & 0x80000000) != 0)
      {
        r = (i + Integer.MIN_VALUE);
        paramd = (X5.d)localObject1;
        break label47;
      }
    }
    paramd = new b(this, paramd);
    label47:
    Object localObject2 = p;
    Object localObject3 = Y5.b.c();
    int i = r;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          o.b(localObject2);
          break label178;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      localObject1 = (f)o;
      o.b(localObject2);
    }
    else
    {
      o.b(localObject2);
      localObject1 = a;
      o = this;
      r = 1;
      if (((h)localObject1).c(paramd) == localObject3) {
        return localObject3;
      }
      localObject1 = this;
    }
    Object localObject1 = b;
    o = null;
    r = 2;
    if (((h)localObject1).c(paramd) == localObject3) {
      return localObject3;
    }
    label178:
    return t.a;
  }
  
  public static final class a
  {
    public final P.f b(Context paramContext)
    {
      return (P.f)f.a().a(paramContext, a[0]);
    }
  }
  
  public static final class b
    extends Z5.d
  {
    public Object o;
    public int r;
    
    public b(f paramf, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      p = paramObject;
      r |= 0x80000000;
      return q.g(this);
    }
  }
}

/* Location:
 * Qualified Name:     T4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */