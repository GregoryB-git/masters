package o7;

import f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import x6.b;

public abstract class x<E>
  extends r<E>
  implements Set<E>
{
  public transient t<E> b;
  
  public static int o(int paramInt)
  {
    int i = Math.max(paramInt, 2);
    boolean bool = true;
    if (i < 751619276)
    {
      paramInt = Integer.highestOneBit(i - 1) << 1;
      while (paramInt * 0.7D < i) {
        paramInt <<= 1;
      }
      return paramInt;
    }
    if (i >= 1073741824) {
      bool = false;
    }
    b.s("collection too large", bool);
    return 1073741824;
  }
  
  public static <E> x<E> p(int paramInt, Object... paramVarArgs)
  {
    if (paramInt != 0)
    {
      int i = 0;
      if (paramInt != 1)
      {
        int j = o(paramInt);
        Object[] arrayOfObject = new Object[j];
        int k = j - 1;
        int m = 0;
        int n = m;
        int i1 = n;
        if (m < paramInt)
        {
          Object localObject1 = paramVarArgs[m];
          if (localObject1 != null)
          {
            int i2 = localObject1.hashCode();
            for (int i3 = b.r0(i2);; i3++)
            {
              int i4 = i3 & k;
              localObject2 = arrayOfObject[i4];
              if (localObject2 == null)
              {
                paramVarArgs[i1] = localObject1;
                arrayOfObject[i4] = localObject1;
                n += i2;
                i1++;
              }
              else
              {
                if (!localObject2.equals(localObject1)) {
                  continue;
                }
              }
              m++;
              break;
            }
          }
          throw new NullPointerException(f.h("at index ", m));
        }
        Arrays.fill(paramVarArgs, i1, paramInt, null);
        if (i1 == 1)
        {
          paramVarArgs = paramVarArgs[0];
          Objects.requireNonNull(paramVarArgs);
          return new v0(paramVarArgs);
        }
        if (o(i1) < j / 2) {
          return p(i1, paramVarArgs);
        }
        m = paramVarArgs.length;
        paramInt = i;
        if (i1 < (m >> 1) + (m >> 2)) {
          paramInt = 1;
        }
        Object localObject2 = paramVarArgs;
        if (paramInt != 0) {
          localObject2 = Arrays.copyOf(paramVarArgs, i1);
        }
        return new n0((Object[])localObject2, n, arrayOfObject, k, i1);
      }
      paramVarArgs = paramVarArgs[0];
      Objects.requireNonNull(paramVarArgs);
      return new v0(paramVarArgs);
    }
    return n0.r;
  }
  
  public static <E> x<E> q(Collection<? extends E> paramCollection)
  {
    if (((paramCollection instanceof x)) && (!(paramCollection instanceof SortedSet)))
    {
      x localx = (x)paramCollection;
      if (!localx.m()) {
        return localx;
      }
    }
    paramCollection = paramCollection.toArray();
    return p(paramCollection.length, paramCollection);
  }
  
  public static x s(String paramString1, String paramString2, String paramString3)
  {
    return p(3, new Object[] { paramString1, paramString2, paramString3 });
  }
  
  public t<E> a()
  {
    t localt1 = b;
    t localt2 = localt1;
    if (localt1 == null)
    {
      localt2 = r();
      b = localt2;
    }
    return localt2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof x)) && ((this instanceof n0)))
    {
      x localx = (x)paramObject;
      localx.getClass();
      if (((localx instanceof n0)) && (hashCode() != paramObject.hashCode())) {
        return false;
      }
    }
    return u0.a(this, paramObject);
  }
  
  public int hashCode()
  {
    return u0.c(this);
  }
  
  public t<E> r()
  {
    Object[] arrayOfObject = toArray();
    t.b localb = t.b;
    return t.o(arrayOfObject.length, arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     o7.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */