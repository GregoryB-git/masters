package X2;

import W2.m;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.Objects;

public class T$a
  extends y
{
  public final transient w q;
  public final transient Object[] r;
  public final transient int s;
  public final transient int t;
  
  public T$a(w paramw, Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    q = paramw;
    r = paramArrayOfObject;
    s = paramInt1;
    t = paramInt2;
  }
  
  public v V()
  {
    return new a();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      bool3 = bool2;
      if (localObject != null)
      {
        bool3 = bool2;
        if (localObject.equals(q.get(paramObject))) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    return a().d(paramArrayOfObject, paramInt);
  }
  
  public boolean k()
  {
    return true;
  }
  
  public g0 q()
  {
    return a().q();
  }
  
  public int size()
  {
    return t;
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
  
  public class a
    extends v
  {
    public a() {}
    
    public Map.Entry j0(int paramInt)
    {
      m.h(paramInt, T.a.e0(T.a.this));
      Object localObject1 = T.a.f0(T.a.this);
      paramInt *= 2;
      Object localObject2 = localObject1[(T.a.g0(T.a.this) + paramInt)];
      Objects.requireNonNull(localObject2);
      localObject1 = T.a.f0(T.a.this)[(paramInt + (T.a.g0(T.a.this) ^ 0x1))];
      Objects.requireNonNull(localObject1);
      return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
    }
    
    public boolean k()
    {
      return true;
    }
    
    public int size()
    {
      return T.a.e0(T.a.this);
    }
    
    public Object writeReplace()
    {
      return super.writeReplace();
    }
  }
}

/* Location:
 * Qualified Name:     X2.T.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */