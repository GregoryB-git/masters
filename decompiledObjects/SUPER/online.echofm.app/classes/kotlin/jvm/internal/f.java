package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class f
{
  public static final Object[] a = new Object[0];
  
  public static final Object[] a(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "collection");
    int i = paramCollection.size();
    if (i == 0) {}
    Iterator localIterator;
    do
    {
      paramCollection = a;
      break;
      localIterator = paramCollection.iterator();
    } while (!localIterator.hasNext());
    paramCollection = new Object[i];
    i = 0;
    int j = i + 1;
    paramCollection[i] = localIterator.next();
    Object localObject;
    if (j >= paramCollection.length)
    {
      if (localIterator.hasNext())
      {
        int k = j * 3 + 1 >>> 1;
        i = k;
        if (k <= j)
        {
          i = 2147483645;
          if (j >= 2147483645) {
            throw new OutOfMemoryError();
          }
        }
        localObject = Arrays.copyOf(paramCollection, i);
        Intrinsics.checkNotNullExpressionValue(localObject, "copyOf(...)");
      }
    }
    else
    {
      do
      {
        i = j;
        paramCollection = (Collection)localObject;
        break;
        localObject = paramCollection;
      } while (localIterator.hasNext());
      paramCollection = Arrays.copyOf(paramCollection, j);
      Intrinsics.checkNotNullExpressionValue(paramCollection, "copyOf(...)");
    }
    return paramCollection;
  }
  
  public static final Object[] b(Collection paramCollection, Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "collection");
    paramArrayOfObject.getClass();
    int i = paramCollection.size();
    int j = 0;
    if (i == 0)
    {
      paramCollection = paramArrayOfObject;
      if (paramArrayOfObject.length > 0)
      {
        paramArrayOfObject[0] = null;
        paramCollection = paramArrayOfObject;
      }
    }
    else
    {
      Iterator localIterator = paramCollection.iterator();
      if (!localIterator.hasNext())
      {
        paramCollection = paramArrayOfObject;
        if (paramArrayOfObject.length > 0)
        {
          paramArrayOfObject[0] = null;
          paramCollection = paramArrayOfObject;
        }
      }
      else
      {
        if (i <= paramArrayOfObject.length)
        {
          paramCollection = paramArrayOfObject;
        }
        else
        {
          paramCollection = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
          Intrinsics.c(paramCollection, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
          paramCollection = (Object[])paramCollection;
        }
        i = j + 1;
        paramCollection[j] = localIterator.next();
        Object localObject;
        if (i >= paramCollection.length)
        {
          if (localIterator.hasNext())
          {
            int k = i * 3 + 1 >>> 1;
            j = k;
            if (k <= i)
            {
              j = 2147483645;
              if (i >= 2147483645) {
                throw new OutOfMemoryError();
              }
            }
            localObject = Arrays.copyOf(paramCollection, j);
            Intrinsics.checkNotNullExpressionValue(localObject, "copyOf(...)");
          }
        }
        else
        {
          do
          {
            j = i;
            paramCollection = (Collection)localObject;
            break;
            localObject = paramCollection;
          } while (localIterator.hasNext());
          if (paramCollection == paramArrayOfObject)
          {
            paramArrayOfObject[i] = null;
            paramCollection = paramArrayOfObject;
          }
          else
          {
            paramCollection = Arrays.copyOf(paramCollection, i);
            Intrinsics.checkNotNullExpressionValue(paramCollection, "copyOf(...)");
          }
        }
      }
    }
    return paramCollection;
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */