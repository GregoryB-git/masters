package X2;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class w$a
{
  public Comparator a;
  public Object[] b;
  public int c;
  public boolean d;
  public a e;
  
  public w$a()
  {
    this(4);
  }
  
  public w$a(int paramInt)
  {
    b = new Object[paramInt * 2];
    c = 0;
    d = false;
  }
  
  public static void i(Object[] paramArrayOfObject, int paramInt, Comparator paramComparator)
  {
    Map.Entry[] arrayOfEntry = new Map.Entry[paramInt];
    int i = 0;
    for (int j = 0; j < paramInt; j++)
    {
      int k = j * 2;
      Object localObject1 = paramArrayOfObject[k];
      Objects.requireNonNull(localObject1);
      Object localObject2 = paramArrayOfObject[(k + 1)];
      Objects.requireNonNull(localObject2);
      arrayOfEntry[j] = new AbstractMap.SimpleImmutableEntry(localObject1, localObject2);
    }
    Arrays.sort(arrayOfEntry, 0, paramInt, P.b(paramComparator).f(G.l()));
    for (j = i; j < paramInt; j++)
    {
      i = j * 2;
      paramArrayOfObject[i] = arrayOfEntry[j].getKey();
      paramArrayOfObject[(i + 1)] = arrayOfEntry[j].getValue();
    }
  }
  
  public w a()
  {
    return c();
  }
  
  public final w b(boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = e;
      if (localObject1 != null) {
        throw ((a)localObject1).a();
      }
    }
    int i = c;
    int j;
    if (a == null)
    {
      localObject1 = b;
      j = i;
    }
    else
    {
      if (d) {
        b = Arrays.copyOf(b, i * 2);
      }
      localObject2 = b;
      j = i;
      localObject1 = localObject2;
      if (!paramBoolean)
      {
        localObject2 = e((Object[])localObject2, c);
        j = i;
        localObject1 = localObject2;
        if (localObject2.length < b.length)
        {
          j = localObject2.length >>> 1;
          localObject1 = localObject2;
        }
      }
      i((Object[])localObject1, j, a);
    }
    d = true;
    Object localObject2 = T.l(j, (Object[])localObject1, this);
    if (paramBoolean)
    {
      localObject1 = e;
      if (localObject1 != null) {
        throw ((a)localObject1).a();
      }
    }
    return (w)localObject2;
  }
  
  public w c()
  {
    return b(true);
  }
  
  public final void d(int paramInt)
  {
    paramInt *= 2;
    Object[] arrayOfObject = b;
    if (paramInt > arrayOfObject.length)
    {
      b = Arrays.copyOf(arrayOfObject, t.b.c(arrayOfObject.length, paramInt));
      d = false;
    }
  }
  
  public final Object[] e(Object[] paramArrayOfObject, int paramInt)
  {
    Object localObject1 = new HashSet();
    BitSet localBitSet = new BitSet();
    Object localObject2;
    for (int i = paramInt - 1; i >= 0; i--)
    {
      localObject2 = paramArrayOfObject[(i * 2)];
      Objects.requireNonNull(localObject2);
      if (!((Set)localObject1).add(localObject2)) {
        localBitSet.set(i);
      }
    }
    if (localBitSet.isEmpty()) {
      return paramArrayOfObject;
    }
    localObject1 = new Object[(paramInt - localBitSet.cardinality()) * 2];
    i = 0;
    int j = 0;
    while (i < paramInt * 2) {
      if (localBitSet.get(i >>> 1))
      {
        i += 2;
      }
      else
      {
        localObject2 = paramArrayOfObject[i];
        Objects.requireNonNull(localObject2);
        localObject1[j] = localObject2;
        int k = j + 2;
        int m = i + 2;
        localObject2 = paramArrayOfObject[(i + 1)];
        Objects.requireNonNull(localObject2);
        localObject1[(j + 1)] = localObject2;
        i = m;
        j = k;
      }
    }
    return (Object[])localObject1;
  }
  
  public a f(Object paramObject1, Object paramObject2)
  {
    d(c + 1);
    i.a(paramObject1, paramObject2);
    Object[] arrayOfObject = b;
    int i = c;
    arrayOfObject[(i * 2)] = paramObject1;
    arrayOfObject[(i * 2 + 1)] = paramObject2;
    c = (i + 1);
    return this;
  }
  
  public a g(Map.Entry paramEntry)
  {
    return f(paramEntry.getKey(), paramEntry.getValue());
  }
  
  public a h(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      d(c + ((Collection)paramIterable).size());
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      g((Map.Entry)paramIterable.next());
    }
    return this;
  }
  
  public static final class a
  {
    public final Object a;
    public final Object b;
    public final Object c;
    
    public a(Object paramObject1, Object paramObject2, Object paramObject3)
    {
      a = paramObject1;
      b = paramObject2;
      c = paramObject3;
    }
    
    public IllegalArgumentException a()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Multiple entries with same key: ");
      localStringBuilder.append(a);
      localStringBuilder.append("=");
      localStringBuilder.append(b);
      localStringBuilder.append(" and ");
      localStringBuilder.append(a);
      localStringBuilder.append("=");
      localStringBuilder.append(c);
      return new IllegalArgumentException(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     X2.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */