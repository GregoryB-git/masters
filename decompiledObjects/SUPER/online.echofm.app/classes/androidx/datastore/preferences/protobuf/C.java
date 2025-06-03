package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class C
  extends c
  implements D, RandomAccess
{
  public static final C q;
  public static final D r;
  public final List p;
  
  static
  {
    C localC = new C();
    q = localC;
    localC.j();
    r = localC;
  }
  
  public C()
  {
    this(10);
  }
  
  public C(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  public C(ArrayList paramArrayList)
  {
    p = paramArrayList;
  }
  
  public static String f(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof g)) {
      return ((g)paramObject).a0();
    }
    return y.j((byte[])paramObject);
  }
  
  public void H(g paramg)
  {
    a();
    p.add(paramg);
    modCount += 1;
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    a();
    Object localObject = paramCollection;
    if ((paramCollection instanceof D)) {
      localObject = ((D)paramCollection).o();
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
    if ((localObject1 instanceof g))
    {
      localObject2 = (g)localObject1;
      localObject1 = ((g)localObject2).a0();
      if (((g)localObject2).M()) {
        p.set(paramInt, localObject1);
      }
      return (String)localObject1;
    }
    localObject1 = (byte[])localObject1;
    Object localObject2 = y.j((byte[])localObject1);
    if (y.g((byte[])localObject1)) {
      p.set(paramInt, localObject2);
    }
    return (String)localObject2;
  }
  
  public C i(int paramInt)
  {
    if (paramInt >= size())
    {
      ArrayList localArrayList = new ArrayList(paramInt);
      localArrayList.addAll(p);
      return new C(localArrayList);
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
  
  public D m()
  {
    if (p()) {
      return new o0(this);
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
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */