package d8;

import d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b<T>
{
  public final String a;
  public final Set<t<? super T>> b;
  public final Set<k> c;
  public final int d;
  public final int e;
  public final e<T> f;
  public final Set<Class<?>> g;
  
  public b(String paramString, Set<t<? super T>> paramSet, Set<k> paramSet1, int paramInt1, int paramInt2, e<T> parame, Set<Class<?>> paramSet2)
  {
    a = paramString;
    b = Collections.unmodifiableSet(paramSet);
    c = Collections.unmodifiableSet(paramSet1);
    d = paramInt1;
    e = paramInt2;
    f = parame;
    g = Collections.unmodifiableSet(paramSet2);
  }
  
  public static <T> a<T> a(t<T> paramt)
  {
    return new a(paramt, new t[0]);
  }
  
  public static <T> a<T> b(Class<T> paramClass)
  {
    return new a(paramClass, new Class[0]);
  }
  
  @SafeVarargs
  public static <T> b<T> c(T paramT, Class<T> paramClass, Class<? super T>... paramVarArgs)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet3 = new HashSet();
    localHashSet1.add(t.a(paramClass));
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      paramClass = paramVarArgs[j];
      if (paramClass != null)
      {
        localHashSet1.add(t.a(paramClass));
        j++;
      }
      else
      {
        throw new NullPointerException("Null interface");
      }
    }
    paramT = new d(paramT, 0);
    return new b(null, new HashSet(localHashSet1), new HashSet(localHashSet2), 0, 0, paramT, localHashSet3);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Component<");
    localStringBuilder.append(Arrays.toString(b.toArray()));
    localStringBuilder.append(">{");
    localStringBuilder.append(d);
    localStringBuilder.append(", type=");
    localStringBuilder.append(e);
    localStringBuilder.append(", deps=");
    localStringBuilder.append(Arrays.toString(c.toArray()));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a<T>
  {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public e<T> f;
    public final HashSet g;
    
    public a(t paramt, t[] paramArrayOft)
    {
      HashSet localHashSet = new HashSet();
      b = localHashSet;
      c = new HashSet();
      int i = 0;
      d = 0;
      e = 0;
      g = new HashSet();
      localHashSet.add(paramt);
      int j = paramArrayOft.length;
      while (i < j) {
        if (paramArrayOft[i] != null) {
          i++;
        } else {
          throw new NullPointerException("Null interface");
        }
      }
      Collections.addAll(b, paramArrayOft);
    }
    
    public a(Class paramClass, Class[] paramArrayOfClass)
    {
      HashSet localHashSet = new HashSet();
      b = localHashSet;
      c = new HashSet();
      int i = 0;
      d = 0;
      e = 0;
      g = new HashSet();
      localHashSet.add(t.a(paramClass));
      int j = paramArrayOfClass.length;
      while (i < j)
      {
        paramClass = paramArrayOfClass[i];
        if (paramClass != null)
        {
          b.add(t.a(paramClass));
          i++;
        }
        else
        {
          throw new NullPointerException("Null interface");
        }
      }
    }
    
    public final void a(k paramk)
    {
      t localt = a;
      if ((b.contains(localt) ^ true))
      {
        c.add(paramk);
        return;
      }
      throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
    
    public final b<T> b()
    {
      int i;
      if (f != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return new b(a, new HashSet(b), new HashSet(c), d, e, f, g);
      }
      throw new IllegalStateException("Missing required property: factory.");
    }
    
    public final void c(int paramInt)
    {
      int i;
      if (d == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        d = paramInt;
        return;
      }
      throw new IllegalStateException("Instantiation type has already been set.");
    }
  }
}

/* Location:
 * Qualified Name:     d8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */