package b1;

import g;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import m.c;
import n.b;
import n.b.d;
import n.b.e;

public abstract class t<T>
{
  public static final Object NOT_SET = new Object();
  public static final int START_VERSION = -1;
  public int mActiveCount = 0;
  private boolean mChangingActiveState;
  private volatile Object mData;
  public final Object mDataLock = new Object();
  private boolean mDispatchInvalidated;
  private boolean mDispatchingValue;
  private b<x<? super T>, t<T>.d> mObservers = new b();
  public volatile Object mPendingData;
  private final Runnable mPostValueRunnable;
  private int mVersion;
  
  public t()
  {
    Object localObject = NOT_SET;
    mPendingData = localObject;
    mPostValueRunnable = new a();
    mData = localObject;
    mVersion = -1;
  }
  
  public t(T paramT)
  {
    mPendingData = NOT_SET;
    mPostValueRunnable = new a();
    mData = paramT;
    mVersion = 0;
  }
  
  public static void assertMainThread(String paramString)
  {
    if (c.v().w()) {
      return;
    }
    throw new IllegalStateException(g.e("Cannot invoke ", paramString, " on a background thread"));
  }
  
  private void considerNotify(t<T>.d paramt)
  {
    if (!b) {
      return;
    }
    if (!paramt.e())
    {
      paramt.b(false);
      return;
    }
    int i = c;
    int j = mVersion;
    if (i >= j) {
      return;
    }
    c = j;
    a.a(mData);
  }
  
  public void changeActiveCounter(int paramInt)
  {
    int i = mActiveCount;
    mActiveCount = (paramInt + i);
    if (mChangingActiveState) {
      return;
    }
    mChangingActiveState = true;
    try
    {
      for (;;)
      {
        int j = mActiveCount;
        if (i == j) {
          break;
        }
        if ((i == 0) && (j > 0)) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if ((i > 0) && (j == 0)) {
          i = 1;
        } else {
          i = 0;
        }
        if (paramInt != 0) {
          onActive();
        } else if (i != 0) {
          onInactive();
        }
        i = j;
      }
      return;
    }
    finally
    {
      mChangingActiveState = false;
    }
  }
  
  public void dispatchingValue(t<T>.d paramt)
  {
    if (mDispatchingValue)
    {
      mDispatchInvalidated = true;
      return;
    }
    mDispatchingValue = true;
    do
    {
      mDispatchInvalidated = false;
      Object localObject;
      if (paramt != null)
      {
        considerNotify(paramt);
        localObject = null;
      }
      else
      {
        localObject = mObservers;
        localObject.getClass();
        b.d locald = new b.d((b)localObject);
        c.put(locald, Boolean.FALSE);
        do
        {
          localObject = paramt;
          if (!locald.hasNext()) {
            break;
          }
          considerNotify((d)((Map.Entry)locald.next()).getValue());
        } while (!mDispatchInvalidated);
        localObject = paramt;
      }
      paramt = (t<T>.d)localObject;
    } while (mDispatchInvalidated);
    mDispatchingValue = false;
  }
  
  public T getValue()
  {
    Object localObject = mData;
    if (localObject != NOT_SET) {
      return (T)localObject;
    }
    return null;
  }
  
  public int getVersion()
  {
    return mVersion;
  }
  
  public boolean hasActiveObservers()
  {
    boolean bool;
    if (mActiveCount > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasObservers()
  {
    boolean bool;
    if (mObservers.d > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isInitialized()
  {
    boolean bool;
    if (mData != NOT_SET) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void observe(o paramo, x<? super T> paramx)
  {
    assertMainThread("observe");
    if (paramo.getLifecycle().b() == k.b.a) {
      return;
    }
    c localc = new c(paramo, paramx);
    paramx = (d)mObservers.h(paramx, localc);
    if ((paramx != null) && (!paramx.d(paramo))) {
      throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
    if (paramx != null) {
      return;
    }
    paramo.getLifecycle().a(localc);
  }
  
  public void observeForever(x<? super T> paramx)
  {
    assertMainThread("observeForever");
    b localb = new b(paramx);
    paramx = (d)mObservers.h(paramx, localb);
    if (!(paramx instanceof c))
    {
      if (paramx != null) {
        return;
      }
      localb.b(true);
      return;
    }
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  public void onActive() {}
  
  public void onInactive() {}
  
  public void postValue(T paramT)
  {
    synchronized (mDataLock)
    {
      int i;
      if (mPendingData == NOT_SET) {
        i = 1;
      } else {
        i = 0;
      }
      mPendingData = paramT;
      if (i == 0) {
        return;
      }
      c.v().x(mPostValueRunnable);
      return;
    }
  }
  
  public void removeObserver(x<? super T> paramx)
  {
    assertMainThread("removeObserver");
    paramx = (d)mObservers.i(paramx);
    if (paramx == null) {
      return;
    }
    paramx.c();
    paramx.b(false);
  }
  
  public void removeObservers(o paramo)
  {
    assertMainThread("removeObservers");
    Iterator localIterator = mObservers.iterator();
    for (;;)
    {
      Object localObject = (b.e)localIterator;
      if (!((b.e)localObject).hasNext()) {
        break;
      }
      localObject = (Map.Entry)((b.e)localObject).next();
      if (((d)((Map.Entry)localObject).getValue()).d(paramo)) {
        removeObserver((x)((Map.Entry)localObject).getKey());
      }
    }
  }
  
  public void setValue(T paramT)
  {
    assertMainThread("setValue");
    mVersion += 1;
    mData = paramT;
    dispatchingValue(null);
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      synchronized (mDataLock)
      {
        Object localObject2 = mPendingData;
        mPendingData = t.NOT_SET;
        setValue(localObject2);
        return;
      }
    }
  }
  
  public final class b
    extends t<T>.d
  {
    public b()
    {
      super(localx);
    }
    
    public final boolean e()
    {
      return true;
    }
  }
  
  public final class c
    extends t<T>.d
    implements m
  {
    public final o e;
    
    public c(x<? super T> paramx)
    {
      super(localx);
      e = paramx;
    }
    
    public final void a(o paramo, k.a parama)
    {
      paramo = e.getLifecycle().b();
      if (paramo == k.b.a)
      {
        removeObserver(a);
        return;
      }
      parama = null;
      while (parama != paramo)
      {
        b(e());
        k.b localb = e.getLifecycle().b();
        parama = paramo;
        paramo = localb;
      }
    }
    
    public final void c()
    {
      e.getLifecycle().c(this);
    }
    
    public final boolean d(o paramo)
    {
      boolean bool;
      if (e == paramo) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean e()
    {
      return e.getLifecycle().b().f(k.b.d);
    }
  }
  
  public abstract class d
  {
    public final x<? super T> a;
    public boolean b;
    public int c = -1;
    
    public d()
    {
      x localx;
      a = localx;
    }
    
    public final void b(boolean paramBoolean)
    {
      if (paramBoolean == b) {
        return;
      }
      b = paramBoolean;
      t localt = t.this;
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = -1;
      }
      localt.changeActiveCounter(i);
      if (b) {
        dispatchingValue(this);
      }
    }
    
    public void c() {}
    
    public boolean d(o paramo)
    {
      return false;
    }
    
    public abstract boolean e();
  }
}

/* Location:
 * Qualified Name:     b1.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */