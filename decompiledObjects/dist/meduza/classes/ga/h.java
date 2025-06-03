package ga;

import android.content.Context;
import android.util.Log;
import dc.l;
import ea.b;
import ea.u;
import ec.i;
import ec.p;
import p2.m0;

public final class h
{
  public static final b c = new b();
  public static final q0.c d = m0.Y(u.b, new p0.a(a.a), 12);
  public final j a;
  public final j b;
  
  public h(u7.f paramf, ub.h paramh1, ub.h paramh2, u9.d paramd)
  {
    a = paramf;
    b = paramh1;
  }
  
  public final double a()
  {
    Double localDouble = a.c();
    int i = 1;
    double d1;
    int j;
    if (localDouble != null)
    {
      d1 = localDouble.doubleValue();
      if ((0.0D <= d1) && (d1 <= 1.0D)) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        return d1;
      }
    }
    localDouble = b.c();
    if (localDouble != null)
    {
      d1 = localDouble.doubleValue();
      if ((0.0D <= d1) && (d1 <= 1.0D)) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0) {
        return d1;
      }
    }
    return 1.0D;
  }
  
  public final Object b(ub.e<? super rb.h> parame)
  {
    if ((parame instanceof c))
    {
      localObject1 = (c)parame;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super rb.h>)localObject1;
        break label47;
      }
    }
    parame = new c(this, parame);
    label47:
    Object localObject2 = b;
    vb.a locala = vb.a.a;
    int i = d;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          rb.f.b(localObject2);
          break label175;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      localObject1 = a;
      rb.f.b(localObject2);
    }
    else
    {
      rb.f.b(localObject2);
      localObject1 = a;
      a = this;
      d = 1;
      if (((j)localObject1).d(parame) == locala) {
        return locala;
      }
      localObject1 = this;
    }
    Object localObject1 = b;
    a = null;
    d = 2;
    if (((j)localObject1).d(parame) == locala) {
      return locala;
    }
    label175:
    return rb.h.a;
  }
  
  public static final class a
    extends ec.j
    implements l<o0.a, r0.d>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke(Object paramObject)
    {
      o0.a locala = (o0.a)paramObject;
      i.e(locala, "ex");
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("CorruptionException in settings DataStore in ");
      ((StringBuilder)paramObject).append(ea.t.b());
      ((StringBuilder)paramObject).append('.');
      Log.w("SessionsSettings", ((StringBuilder)paramObject).toString(), locala);
      return new r0.a(true, 1);
    }
  }
  
  public static final class b
  {
    static
    {
      p localp = new p(b.class);
      ec.t.a.getClass();
      a = new jc.h[] { localp };
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.SessionsSettings", f="SessionsSettings.kt", l={138, 139}, m="updateSettings")
  public static final class c
    extends wb.c
  {
    public h a;
    public int d;
    
    public c(h paramh, ub.e<? super c> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      return c.b(this);
    }
  }
}

/* Location:
 * Qualified Name:     ga.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */