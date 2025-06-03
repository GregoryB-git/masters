package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class y
  extends c
  implements z, RandomAccess
{
  public static final y q;
  public static final z r;
  public final List p;
  
  static
  {
    y localy = new y();
    q = localy;
    localy.j();
    r = localy;
  }
  
  public y()
  {
    this(10);
  }
  
  public y(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  public y(ArrayList paramArrayList)
  {
    p = paramArrayList;
  }
  
  public static String f(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof f)) {
      return ((f)paramObject).Y();
    }
    return t.i((byte[])paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    a();
    Object localObject = paramCollection;
    if ((paramCollection instanceof z)) {
      localObject = ((z)paramCollection).o();
    }
    boolean bool = p.addAll(paramInt, (Collection)localObject);
    modCount += 1;
    return bool;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public void clear()
  {
    a();
    p.clear();
    modCount += 1;
  }
  
  public void d(int paramInt, String paramString)
  {
    a();
    p.add(paramInt, paramString);
    modCount += 1;
  }
  
  public String g(int paramInt)
  {
    Object localObject1 = p.get(paramInt);
    if ((localObject1 instanceof String)) {
      return (String)localObject1;
    }
    if ((localObject1 instanceof f))
    {
      localObject2 = (f)localObject1;
      localObject1 = ((f)localObject2).Y();
      if (((f)localObject2).s()) {
        p.set(paramInt, localObject1);
      }
      return (String)localObject1;
    }
    localObject1 = (byte[])localObject1;
    Object localObject2 = t.i((byte[])localObject1);
    if (t.g((byte[])localObject1)) {
      p.set(paramInt, localObject2);
    }
    return (String)localObject2;
  }
  
  public y i(int paramInt)
  {
    if (paramInt >= size())
    {
      ArrayList localArrayList = new ArrayList(paramInt);
      localArrayList.addAll(p);
      return new y(localArrayList);
    }
    throw new IllegalArgumentException();
  }
  
  public String k(int paramInt)
  {
    a();
    Object localObject = p.remove(paramInt);
    modCount += 1;
    return f(localObject);
  }
  
  public z m()
  {
    if (p()) {
      return new j0(this);
    }
    return this;
  }
  
  public Object n(int paramInt)
  {
    return p.get(paramInt);
  }
  
  public List o()
  {
    return Collections.unmodifiableList(p);
  }
  
  public String q(int paramInt, String paramString)
  {
    a();
    return f(p.set(paramInt, paramString));
  }
  
  public int size()
  {
    return p.size();
  }
  
  public void x(f paramf)
  {
    a();
    p.add(paramf);
    modCount += 1;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */