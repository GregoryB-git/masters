package s6;

import V5.o;
import V5.t;
import X5.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.q0;
import p6.u0;
import t6.h;
import u6.F;

public final class l
  extends t6.b
  implements j, b
{
  public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
  private volatile Object _state;
  public int r;
  
  public l(Object paramObject)
  {
    _state = paramObject;
  }
  
  public Object a(c paramc, X5.d paramd)
  {
    if ((paramd instanceof a))
    {
      locala = (a)paramd;
      i = v;
      if ((i & 0x80000000) != 0)
      {
        v = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    a locala = new a(this, paramd);
    label48:
    Object localObject3 = t;
    Object localObject4 = Y5.b.c();
    int i = v;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    Object localObject10;
    Object localObject11;
    Object localObject12;
    Object localObject13;
    Object localObject14;
    Object localObject2;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            localObject5 = s;
            localObject6 = (q0)r;
            localObject7 = (n)q;
            localObject8 = (c)p;
            localObject9 = (l)o;
            paramc = (c)localObject7;
            paramd = (X5.d)localObject9;
            try
            {
              o.b(localObject3);
              localObject3 = locala;
            }
            finally
            {
              break label688;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localObject10 = s;
        localObject11 = (q0)r;
        localObject7 = (n)q;
        localObject12 = (c)p;
        localObject13 = (l)o;
        paramc = (c)localObject7;
        paramd = (X5.d)localObject13;
        o.b(localObject3);
        localObject14 = localObject1;
        localObject2 = localObject7;
        break label537;
      }
      localObject7 = (n)q;
      localObject8 = (c)p;
      localObject9 = (l)o;
      paramc = (c)localObject7;
      paramd = (X5.d)localObject9;
      o.b(localObject3);
    }
    else
    {
      o.b(localObject3);
      localObject7 = (n)b();
      localObject9 = this;
      localObject8 = paramc;
    }
    paramc = (c)localObject7;
    paramd = (X5.d)localObject9;
    Object localObject6 = (q0)((X5.d)localObject2).getContext().b(q0.n);
    Object localObject5 = null;
    localObject3 = localObject2;
    Object localObject15;
    label537:
    do
    {
      do
      {
        paramc = (c)localObject7;
        paramd = (X5.d)localObject9;
        localObject15 = s.get(localObject9);
        if (localObject6 != null)
        {
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          u0.e((q0)localObject6);
        }
        if (localObject5 != null)
        {
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          localObject14 = localObject3;
          localObject11 = localObject6;
          localObject2 = localObject7;
          localObject12 = localObject8;
          localObject13 = localObject9;
          localObject10 = localObject5;
          if (Intrinsics.a(localObject5, localObject15)) {}
        }
        else
        {
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          if (localObject15 == h.a) {
            localObject2 = null;
          } else {
            localObject2 = localObject15;
          }
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          o = localObject9;
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          p = localObject8;
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          q = localObject7;
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          r = localObject6;
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          s = localObject15;
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          v = 2;
          paramc = (c)localObject7;
          paramd = (X5.d)localObject9;
          if (((c)localObject8).emit(localObject2, (X5.d)localObject3) == localObject4) {
            return localObject4;
          }
          localObject10 = localObject15;
          localObject13 = localObject9;
          localObject12 = localObject8;
          localObject2 = localObject7;
          localObject11 = localObject6;
          localObject14 = localObject3;
        }
        paramc = (c)localObject2;
        paramd = (X5.d)localObject13;
        localObject3 = localObject14;
        localObject6 = localObject11;
        localObject7 = localObject2;
        localObject8 = localObject12;
        localObject9 = localObject13;
        localObject5 = localObject10;
      } while (((n)localObject2).h());
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      o = localObject13;
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      p = localObject12;
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      q = localObject2;
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      r = localObject11;
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      s = localObject10;
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      v = 3;
      paramc = (c)localObject2;
      paramd = (X5.d)localObject13;
      localObject15 = ((n)localObject2).e((X5.d)localObject14);
      localObject3 = localObject14;
      localObject6 = localObject11;
      localObject7 = localObject2;
      localObject8 = localObject12;
      localObject9 = localObject13;
      localObject5 = localObject10;
    } while (localObject15 != localObject4);
    return localObject4;
    label688:
    paramd.e(paramc);
    throw ((Throwable)localObject2);
  }
  
  public Object emit(Object paramObject, X5.d paramd)
  {
    setValue(paramObject);
    return t.a;
  }
  
  public n g()
  {
    return new n();
  }
  
  public Object getValue()
  {
    F localF = h.a;
    Object localObject1 = s.get(this);
    Object localObject2 = localObject1;
    if (localObject1 == localF) {
      localObject2 = null;
    }
    return localObject2;
  }
  
  public n[] h(int paramInt)
  {
    return new n[paramInt];
  }
  
  public final boolean i(Object paramObject1, Object paramObject2)
  {
    label94:
    label185:
    label201:
    try
    {
      localAtomicReferenceFieldUpdater = s;
      localObject = localAtomicReferenceFieldUpdater.get(this);
      if (paramObject1 != null)
      {
        bool = Intrinsics.a(localObject, paramObject1);
        if (!bool) {
          return false;
        }
      }
    }
    finally
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater;
      Object localObject;
      break label201;
      boolean bool = Intrinsics.a(localObject, paramObject2);
      if (bool) {
        return true;
      }
      localAtomicReferenceFieldUpdater.set(this, paramObject2);
      int i = r;
      if ((i & 0x1) == 0)
      {
        i++;
        r = i;
        paramObject1 = f();
        paramObject2 = t.a;
        paramObject2 = (n[])paramObject1;
        int k;
        if (paramObject2 != null)
        {
          int j = paramObject2.length;
          for (k = 0; k < j; k++)
          {
            paramObject1 = paramObject2[k];
            if (paramObject1 != null) {
              ((n)paramObject1).g();
            }
          }
        }
        try
        {
          k = r;
          if (k == i)
          {
            r = (i + 1);
            return true;
          }
        }
        finally
        {
          break label185;
          paramObject1 = f();
          paramObject2 = t.a;
          i = k;
          break label94;
        }
      }
      r = (i + 2);
      return true;
    }
  }
  
  public void setValue(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = h.a;
    }
    i(null, localObject);
  }
  
  public static final class a
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public int v;
    
    public a(l paraml, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      t = paramObject;
      v |= 0x80000000;
      return u.a(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     s6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */