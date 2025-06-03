package xb;

import ec.i;
import f;
import java.io.Serializable;
import sb.d;

public final class b<T extends Enum<T>>
  extends d<T>
  implements a<T>, Serializable
{
  public final T[] a;
  
  public b(T[] paramArrayOfT)
  {
    a = paramArrayOfT;
  }
  
  public final int a()
  {
    return a.length;
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Enum;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Enum localEnum = (Enum)paramObject;
    i.e(localEnum, "element");
    paramObject = a;
    int i = localEnum.ordinal();
    i.e(paramObject, "<this>");
    int j;
    if ((i >= 0) && (i < paramObject.length)) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      paramObject = paramObject[i];
    } else {
      paramObject = null;
    }
    if (paramObject == localEnum) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final Object get(int paramInt)
  {
    Enum[] arrayOfEnum = a;
    int i = arrayOfEnum.length;
    if ((paramInt >= 0) && (paramInt < i)) {
      return arrayOfEnum[paramInt];
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final int indexOf(Object paramObject)
  {
    boolean bool = paramObject instanceof Enum;
    int i = -1;
    if (!bool) {
      return -1;
    }
    Enum localEnum = (Enum)paramObject;
    i.e(localEnum, "element");
    int j = localEnum.ordinal();
    paramObject = a;
    i.e(paramObject, "<this>");
    int k = 0;
    int m = k;
    if (j >= 0)
    {
      m = k;
      if (j < paramObject.length) {
        m = 1;
      }
    }
    if (m != 0) {
      paramObject = paramObject[j];
    } else {
      paramObject = null;
    }
    m = i;
    if (paramObject == localEnum) {
      m = j;
    }
    return m;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    if (!(paramObject instanceof Enum)) {
      return -1;
    }
    paramObject = (Enum)paramObject;
    i.e(paramObject, "element");
    return indexOf(paramObject);
  }
}

/* Location:
 * Qualified Name:     xb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */