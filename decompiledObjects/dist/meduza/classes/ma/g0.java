package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class g0
  extends c<String>
  implements h0, RandomAccess
{
  public final List<Object> b;
  
  static
  {
    new g0();
  }
  
  public g0()
  {
    super(false);
    b = Collections.emptyList();
  }
  
  public g0(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  public g0(ArrayList<Object> paramArrayList)
  {
    super(true);
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
    if ((paramCollection instanceof h0)) {
      localObject = ((h0)paramCollection).d();
    }
    boolean bool = b.addAll(paramInt, (Collection)localObject);
    modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final a0.d c(int paramInt)
  {
    if (paramInt >= size())
    {
      ArrayList localArrayList = new ArrayList(paramInt);
      localArrayList.addAll(b);
      return new g0(localArrayList);
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
  
  public final h0 e()
  {
    if (a) {
      return new s1(this);
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
      if ((localObject1 instanceof h))
      {
        localObject2 = (h)localObject1;
        localObject2.getClass();
        localObject1 = a0.a;
        if (((h)localObject2).size() == 0) {
          str = "";
        } else {
          str = ((h)localObject2).A((Charset)localObject1);
        }
        localObject1 = str;
        if (!((h)localObject2).r()) {
          return localObject1;
        }
        localObject1 = str;
      }
      else
      {
        localObject2 = (byte[])localObject1;
        str = new String((byte[])localObject2, a0.a);
        localObject1 = u1.a;
        int i = localObject2.length;
        int j = 0;
        if (((u1.b)localObject1).e(0, (byte[])localObject2, 0, i) == 0) {
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
    else if ((localObject instanceof h))
    {
      h localh = (h)localObject;
      localh.getClass();
      localObject = a0.a;
      if (localh.size() == 0) {
        localObject = "";
      } else {
        localObject = localh.A((Charset)localObject);
      }
    }
    else
    {
      localObject = new String((byte[])localObject, a0.a);
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
    else if ((paramObject instanceof h))
    {
      h localh = (h)paramObject;
      localh.getClass();
      paramObject = a0.a;
      if (localh.size() == 0) {
        paramObject = "";
      } else {
        paramObject = localh.A((Charset)paramObject);
      }
    }
    else
    {
      paramObject = new String((byte[])paramObject, a0.a);
    }
    return paramObject;
  }
  
  public final int size()
  {
    return b.size();
  }
  
  public final void v(h paramh)
  {
    a();
    b.add(paramh);
    modCount += 1;
  }
}

/* Location:
 * Qualified Name:     ma.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */