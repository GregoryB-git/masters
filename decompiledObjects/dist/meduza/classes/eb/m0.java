package eb;

import gb.r2;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nb.l;
import x6.b;

public final class m0
{
  public static final Logger c = Logger.getLogger(m0.class.getName());
  public static m0 d;
  public static final List e;
  public final LinkedHashSet<l0> a = new LinkedHashSet();
  public final LinkedHashMap<String, l0> b = new LinkedHashMap();
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      boolean bool = r2.b;
      localArrayList.add(r2.class);
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", localClassNotFoundException1);
    }
    try
    {
      int i = l.b;
      localArrayList.add(l.class);
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      c.log(Level.FINE, "Unable to find round-robin LoadBalancer", localClassNotFoundException2);
    }
    e = Collections.unmodifiableList(localArrayList);
  }
  
  public static m0 a()
  {
    try
    {
      if (d == null)
      {
        Object localObject1 = e;
        ??? = l0.class.getClassLoader();
        Object localObject3 = new eb/m0$a;
        ((a)localObject3).<init>();
        localObject3 = d1.a(l0.class, (List)localObject1, (ClassLoader)???, (d1.a)localObject3);
        localObject1 = new eb/m0;
        ((m0)localObject1).<init>();
        d = (m0)localObject1;
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (l0)((Iterator)localObject3).next();
          ??? = c;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Service loader found ");
          localStringBuilder.append(localObject1);
          ((Logger)???).fine(localStringBuilder.toString());
          synchronized (d)
          {
            b.s("isAvailable() returned false", ((l0)localObject1).d());
            a.add(localObject1);
          }
        }
        d.c();
      }
      m0 localm0 = d;
      return localm0;
    }
    finally {}
  }
  
  public final l0 b(String paramString)
  {
    try
    {
      LinkedHashMap localLinkedHashMap = b;
      b.y(paramString, "policy");
      paramString = (l0)localLinkedHashMap.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void c()
  {
    try
    {
      b.clear();
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        l0 locall01 = (l0)localIterator.next();
        String str = locall01.b();
        l0 locall02 = (l0)b.get(str);
        if ((locall02 == null) || (locall02.c() < locall01.c())) {
          b.put(str, locall01);
        }
      }
      return;
    }
    finally {}
  }
  
  public static final class a
    implements d1.a<l0>
  {
    public final boolean a(Object paramObject)
    {
      return ((l0)paramObject).d();
    }
    
    public final int b(Object paramObject)
    {
      return ((l0)paramObject).c();
    }
  }
}

/* Location:
 * Qualified Name:     eb.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */