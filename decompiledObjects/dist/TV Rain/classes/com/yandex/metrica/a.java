package com.yandex.metrica;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.vm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a
{
  @NonNull
  private final ICommonExecutor a;
  private final Set<b> b = new HashSet();
  
  public a(long paramLong)
  {
    this(paramLong, P.g().d().b());
  }
  
  public a(long paramLong, @NonNull ICommonExecutor paramICommonExecutor)
  {
    a = paramICommonExecutor;
  }
  
  public void a()
  {
    try
    {
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext()) {
        ((b)localIterator.next()).a();
      }
      return;
    }
    finally {}
  }
  
  public void a(@NonNull a parama, long paramLong)
  {
    try
    {
      Set localSet = b;
      b localb = new com/yandex/metrica/a$b;
      localb.<init>(this, parama, a, paramLong);
      localSet.add(localb);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public void b()
  {
    try
    {
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext()) {
        ((b)localIterator.next()).b();
      }
      return;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public class b
  {
    @NonNull
    public final ICommonExecutor a;
    @NonNull
    public final a.a b;
    private final long c;
    private boolean d = true;
    private final Runnable e = new a();
    
    public b(@NonNull a.a parama, ICommonExecutor paramICommonExecutor, long paramLong)
    {
      b = parama;
      a = paramICommonExecutor;
      c = paramLong;
    }
    
    public void a()
    {
      if (!d)
      {
        d = true;
        a.executeDelayed(e, c);
      }
    }
    
    public void b()
    {
      if (d)
      {
        d = false;
        a.remove(e);
        b.b();
      }
    }
    
    public class a
      implements Runnable
    {
      public a() {}
      
      public void run()
      {
        b.a();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */