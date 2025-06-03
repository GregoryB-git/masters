package p6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

public final class x0$c
  implements l0
{
  public static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
  public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
  public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
  private volatile Object _exceptionsHolder;
  private volatile int _isCompleting;
  private volatile Object _rootCause;
  public final C0 o;
  
  public x0$c(C0 paramC0, boolean paramBoolean, Throwable paramThrowable)
  {
    o = paramC0;
    _isCompleting = paramBoolean;
    _rootCause = paramThrowable;
  }
  
  public boolean a()
  {
    boolean bool;
    if (e() == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b(Throwable paramThrowable)
  {
    Object localObject = e();
    if (localObject == null)
    {
      m(paramThrowable);
      return;
    }
    if (paramThrowable == localObject) {
      return;
    }
    localObject = d();
    if (localObject == null)
    {
      l(paramThrowable);
    }
    else if ((localObject instanceof Throwable))
    {
      if (paramThrowable == localObject) {
        return;
      }
      ArrayList localArrayList = c();
      localArrayList.add(localObject);
      localArrayList.add(paramThrowable);
      l(localArrayList);
    }
    else
    {
      if (!(localObject instanceof ArrayList)) {
        break label93;
      }
      ((ArrayList)localObject).add(paramThrowable);
    }
    return;
    label93:
    paramThrowable = new StringBuilder();
    paramThrowable.append("State is ");
    paramThrowable.append(localObject);
    throw new IllegalStateException(paramThrowable.toString().toString());
  }
  
  public final ArrayList c()
  {
    return new ArrayList(4);
  }
  
  public final Object d()
  {
    return r.get(this);
  }
  
  public final Throwable e()
  {
    return (Throwable)q.get(this);
  }
  
  public final boolean f()
  {
    boolean bool;
    if (e() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public C0 g()
  {
    return o;
  }
  
  public final boolean h()
  {
    boolean bool;
    if (p.get(this) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean i()
  {
    boolean bool;
    if (d() == y0.e()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final List j(Throwable paramThrowable)
  {
    Object localObject = d();
    ArrayList localArrayList;
    if (localObject == null)
    {
      localArrayList = c();
    }
    else if ((localObject instanceof Throwable))
    {
      localArrayList = c();
      localArrayList.add(localObject);
    }
    else
    {
      if (!(localObject instanceof ArrayList)) {
        break label92;
      }
      localArrayList = (ArrayList)localObject;
    }
    localObject = e();
    if (localObject != null) {
      localArrayList.add(0, localObject);
    }
    if ((paramThrowable != null) && (!Intrinsics.a(paramThrowable, localObject))) {
      localArrayList.add(paramThrowable);
    }
    l(y0.e());
    return localArrayList;
    label92:
    paramThrowable = new StringBuilder();
    paramThrowable.append("State is ");
    paramThrowable.append(localObject);
    throw new IllegalStateException(paramThrowable.toString().toString());
  }
  
  public final void k(boolean paramBoolean)
  {
    p.set(this, paramBoolean);
  }
  
  public final void l(Object paramObject)
  {
    r.set(this, paramObject);
  }
  
  public final void m(Throwable paramThrowable)
  {
    q.set(this, paramThrowable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Finishing[cancelling=");
    localStringBuilder.append(f());
    localStringBuilder.append(", completing=");
    localStringBuilder.append(h());
    localStringBuilder.append(", rootCause=");
    localStringBuilder.append(e());
    localStringBuilder.append(", exceptions=");
    localStringBuilder.append(d());
    localStringBuilder.append(", list=");
    localStringBuilder.append(g());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.x0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */