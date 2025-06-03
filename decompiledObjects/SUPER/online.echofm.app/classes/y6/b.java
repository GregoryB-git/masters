package y6;

import V5.t;
import X5.g;
import Z5.h;
import g6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.M;
import p6.P0;
import p6.m;
import p6.o;
import u6.C;
import u6.F;

public class b
  extends d
  implements a
{
  public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");
  public final q h;
  private volatile Object owner;
  
  public b(boolean paramBoolean)
  {
    super(1, paramBoolean);
    F localF;
    if (paramBoolean) {
      localF = null;
    } else {
      localF = c.c();
    }
    owner = localF;
    h = new b(this);
  }
  
  public Object a(Object paramObject, X5.d paramd)
  {
    return o(this, paramObject, paramd);
  }
  
  public void b(Object paramObject)
  {
    while (c())
    {
      Object localObject1 = i;
      Object localObject2 = ((AtomicReferenceFieldUpdater)localObject1).get(this);
      if (localObject2 != c.c())
      {
        if ((localObject2 != paramObject) && (paramObject != null))
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("This mutex is locked by ");
          ((StringBuilder)localObject1).append(localObject2);
          ((StringBuilder)localObject1).append(", but ");
          ((StringBuilder)localObject1).append(paramObject);
          ((StringBuilder)localObject1).append(" is expected");
          throw new IllegalStateException(((StringBuilder)localObject1).toString().toString());
        }
        if (u.b.a((AtomicReferenceFieldUpdater)localObject1, this, localObject2, c.c()))
        {
          i();
          return;
        }
      }
    }
    throw new IllegalStateException("This mutex is not locked".toString());
  }
  
  public boolean c()
  {
    boolean bool;
    if (h() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean n(Object paramObject)
  {
    boolean bool2;
    Object localObject;
    do
    {
      boolean bool1 = c();
      bool2 = false;
      if (!bool1) {
        return false;
      }
      localObject = i.get(this);
    } while (localObject == c.c());
    if (localObject == paramObject) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final Object p(Object paramObject, X5.d paramd)
  {
    m localm = o.b(Y5.b.b(paramd));
    try
    {
      a locala = new y6/b$a;
      locala.<init>(this, localm, paramObject);
      d(locala);
      paramObject = localm.w();
      if (paramObject == Y5.b.c()) {
        h.c(paramd);
      }
      if (paramObject == Y5.b.c()) {
        return paramObject;
      }
      return t.a;
    }
    finally
    {
      localm.I();
    }
  }
  
  public boolean q(Object paramObject)
  {
    int j = r(paramObject);
    boolean bool = true;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2) {
          throw new IllegalStateException("unexpected".toString());
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("This mutex is already locked by the specified owner: ");
        localStringBuilder.append(paramObject);
        throw new IllegalStateException(localStringBuilder.toString().toString());
      }
      bool = false;
    }
    return bool;
  }
  
  public final int r(Object paramObject)
  {
    do
    {
      if (j())
      {
        i.set(this, paramObject);
        return 0;
      }
      if (paramObject == null) {
        break;
      }
      if (n(paramObject)) {
        return 2;
      }
    } while (!c());
    return 1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mutex@");
    localStringBuilder.append(M.b(this));
    localStringBuilder.append("[isLocked=");
    localStringBuilder.append(c());
    localStringBuilder.append(",owner=");
    localStringBuilder.append(i.get(this));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public final class a
    implements p6.l, P0
  {
    public final m o;
    public final Object p;
    
    public a(m paramm, Object paramObject)
    {
      o = paramm;
      p = paramObject;
    }
    
    public void a(C paramC, int paramInt)
    {
      o.a(paramC, paramInt);
    }
    
    public void b(t paramt, g6.l paraml)
    {
      b.m().set(b.this, p);
      o.j(paramt, new a(b.this, this));
    }
    
    public Object c(t paramt, Object paramObject, g6.l paraml)
    {
      paraml = b.this;
      paramt = o.g(paramt, paramObject, new b(paraml, this));
      if (paramt != null) {
        b.m().set(b.this, p);
      }
      return paramt;
    }
    
    public void d(g6.l paraml)
    {
      o.d(paraml);
    }
    
    public g getContext()
    {
      return o.getContext();
    }
    
    public boolean o(Throwable paramThrowable)
    {
      return o.o(paramThrowable);
    }
    
    public void p(Object paramObject)
    {
      o.p(paramObject);
    }
    
    public void resumeWith(Object paramObject)
    {
      o.resumeWith(paramObject);
    }
    
    public static final class a
      extends kotlin.jvm.internal.l
      implements g6.l
    {
      public a(b paramb, b.a parama)
      {
        super();
      }
      
      public final void a(Throwable paramThrowable)
      {
        o.b(jdField_thisp);
      }
    }
    
    public static final class b
      extends kotlin.jvm.internal.l
      implements g6.l
    {
      public b(b paramb, b.a parama)
      {
        super();
      }
      
      public final void a(Throwable paramThrowable)
      {
        b.m().set(o, jdField_thisp);
        o.b(jdField_thisp);
      }
    }
  }
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements q
  {
    public b(b paramb)
    {
      super();
    }
    
    public final g6.l a(x6.a parama, final Object paramObject1, Object paramObject2)
    {
      return new a(o, paramObject1);
    }
    
    public static final class a
      extends kotlin.jvm.internal.l
      implements g6.l
    {
      public a(b paramb, Object paramObject)
      {
        super();
      }
      
      public final void a(Throwable paramThrowable)
      {
        o.b(paramObject1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     y6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */