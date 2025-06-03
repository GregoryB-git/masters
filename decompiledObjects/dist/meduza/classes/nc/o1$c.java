package nc;

import ec.i;
import f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;

public final class o1$c
  implements f1
{
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
  public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
  public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
  private volatile Object _exceptionsHolder;
  private volatile int _isCompleting;
  private volatile Object _rootCause;
  public final t1 a;
  
  public o1$c(t1 paramt1, Throwable paramThrowable)
  {
    a = paramt1;
    _isCompleting = 0;
    _rootCause = paramThrowable;
  }
  
  public final void a(Throwable paramThrowable)
  {
    Object localObject = c();
    if (localObject == null)
    {
      c.set(this, paramThrowable);
      return;
    }
    if (paramThrowable == localObject) {
      return;
    }
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = d;
    localObject = localAtomicReferenceFieldUpdater.get(this);
    if (localObject == null)
    {
      localAtomicReferenceFieldUpdater.set(this, paramThrowable);
    }
    else if ((localObject instanceof Throwable))
    {
      if (paramThrowable == localObject) {
        return;
      }
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(localObject);
      localArrayList.add(paramThrowable);
      localAtomicReferenceFieldUpdater.set(this, localArrayList);
    }
    else
    {
      if (!(localObject instanceof ArrayList)) {
        break label111;
      }
      ((ArrayList)localObject).add(paramThrowable);
    }
    return;
    label111:
    paramThrowable = new StringBuilder();
    paramThrowable.append("State is ");
    paramThrowable.append(localObject);
    throw new IllegalStateException(paramThrowable.toString().toString());
  }
  
  public final t1 b()
  {
    return a;
  }
  
  public final Throwable c()
  {
    return (Throwable)c.get(this);
  }
  
  public final boolean d()
  {
    boolean bool;
    if (c() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e()
  {
    boolean bool;
    if (b.get(this) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final ArrayList f(Throwable paramThrowable)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = d;
    Object localObject = localAtomicReferenceFieldUpdater.get(this);
    ArrayList localArrayList;
    if (localObject == null)
    {
      localArrayList = new ArrayList(4);
    }
    else if ((localObject instanceof Throwable))
    {
      localArrayList = new ArrayList(4);
      localArrayList.add(localObject);
    }
    else
    {
      if (!(localObject instanceof ArrayList)) {
        break label113;
      }
      localArrayList = (ArrayList)localObject;
    }
    localObject = c();
    if (localObject != null) {
      localArrayList.add(0, localObject);
    }
    if ((paramThrowable != null) && (!i.a(paramThrowable, localObject))) {
      localArrayList.add(paramThrowable);
    }
    localAtomicReferenceFieldUpdater.set(this, m0.x);
    return localArrayList;
    label113:
    paramThrowable = new StringBuilder();
    paramThrowable.append("State is ");
    paramThrowable.append(localObject);
    throw new IllegalStateException(paramThrowable.toString().toString());
  }
  
  public final boolean isActive()
  {
    boolean bool;
    if (c() == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Finishing[cancelling=");
    localStringBuilder.append(d());
    localStringBuilder.append(", completing=");
    localStringBuilder.append(e());
    localStringBuilder.append(", rootCause=");
    localStringBuilder.append(c());
    localStringBuilder.append(", exceptions=");
    localStringBuilder.append(d.get(this));
    localStringBuilder.append(", list=");
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.o1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */