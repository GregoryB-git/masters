package s0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class c0
  extends c<String>
  implements d0, RandomAccess
{
  public final ArrayList b;
  
  static
  {
    c010a = false;
  }
  
  public c0(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  public c0(ArrayList<Object> paramArrayList)
  {
    b = paramArrayList;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    paramObject = (String)paramObject;
    a();
    b.add(paramInt, paramObject);
    modCount += 1;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection)
  {
    a();
    Object localObject = paramCollection;
    if ((paramCollection instanceof d0)) {
      localObject = ((d0)paramCollection).d();
    }
    boolean bool = b.addAll(paramInt, (Collection)localObject);
    modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final x.c c(int paramInt)
  {
    if (paramInt >= size())
    {
      ArrayList localArrayList = new ArrayList(paramInt);
      localArrayList.addAll(b);
      return new c0(localArrayList);
    }
    throw new IllegalArgumentException();
  }
  
  public final void clear()
  {
    a();
    b.clear();
    modCount += 1;
  }
  
  public final List<?> d()
  {
    return Collections.unmodifiableList(b);
  }
  
  public final d0 e()
  {
    if (a) {
      return new k1(this);
    }
    return this;
  }
  
  public final Object f(int paramInt)
  {
    return b.get(paramInt);
  }
  
  public final Object get(int paramInt)
  {
    Object localObject1 = b.get(paramInt);
    if ((localObject1 instanceof String))
    {
      localObject1 = (String)localObject1;
    }
    else
    {
      Object localObject2;
      String str;
      if ((localObject1 instanceof g))
      {
        localObject2 = (g)localObject1;
        localObject2.getClass();
        localObject1 = x.a;
        if (((g)localObject2).size() == 0) {
          str = "";
        } else {
          str = ((g)localObject2).n((Charset)localObject1);
        }
        localObject1 = str;
        if (!((g)localObject2).l()) {
          return localObject1;
        }
        localObject1 = str;
      }
      else
      {
        localObject1 = (byte[])localObject1;
        str = new String((byte[])localObject1, x.a);
        localObject2 = m1.a;
        int i = localObject1.length;
        int j = 0;
        if (((m1.b)localObject2).c((byte[])localObject1, 0, i) == 0) {
          j = 1;
        }
        localObject1 = str;
        if (j == 0) {
          return localObject1;
        }
        localObject1 = str;
      }
      b.set(paramInt, localObject1);
    }
    return localObject1;
  }
  
  public final Object remove(int paramInt)
  {
    a();
    Object localObject = b.remove(paramInt);
    modCount += 1;
    if ((localObject instanceof String))
    {
      localObject = (String)localObject;
    }
    else if ((localObject instanceof g))
    {
      localObject = (g)localObject;
      localObject.getClass();
      Charset localCharset = x.a;
      if (((g)localObject).size() == 0) {
        localObject = "";
      } else {
        localObject = ((g)localObject).n(localCharset);
      }
    }
    else
    {
      localObject = new String((byte[])localObject, x.a);
    }
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    paramObject = (String)paramObject;
    a();
    paramObject = b.set(paramInt, paramObject);
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
    }
    else if ((paramObject instanceof g))
    {
      paramObject = (g)paramObject;
      paramObject.getClass();
      Charset localCharset = x.a;
      if (((g)paramObject).size() == 0) {
        paramObject = "";
      } else {
        paramObject = ((g)paramObject).n(localCharset);
      }
    }
    else
    {
      paramObject = new String((byte[])paramObject, x.a);
    }
    return paramObject;
  }
  
  public final int size()
  {
    return b.size();
  }
  
  public final void w(g paramg)
  {
    a();
    b.add(paramg);
    modCount += 1;
  }
}

/* Location:
 * Qualified Name:     s0.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */