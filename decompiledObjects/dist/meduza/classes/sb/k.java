package sb;

import ec.i;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p2.m0;
import va.a;

public class k
  extends j
{
  public static final boolean n(Object paramObject, Object[] paramArrayOfObject)
  {
    i.e(paramArrayOfObject, "<this>");
    boolean bool = false;
    if (paramObject == null)
    {
      i = paramArrayOfObject.length;
      for (j = 0; j < i; j++) {
        if (paramArrayOfObject[j] == null) {
          break label75;
        }
      }
    }
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++) {
      if (i.a(paramObject, paramArrayOfObject[j])) {
        break label75;
      }
    }
    j = -1;
    label75:
    if (j >= 0) {
      bool = true;
    }
    return bool;
  }
  
  public static final <T> T o(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "<this>");
    int i;
    if (paramArrayOfT.length == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return paramArrayOfT[0];
    }
    throw new NoSuchElementException("Array is empty.");
  }
  
  public static String p(Object[] paramArrayOfObject, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      paramString1 = ", ";
    }
    if ((paramInt & 0x2) != 0) {
      paramString2 = "";
    }
    if ((paramInt & 0x4) != 0) {
      paramString3 = "";
    }
    int i = 0;
    int j;
    if ((paramInt & 0x8) != 0) {
      j = -1;
    } else {
      j = 0;
    }
    String str;
    if ((paramInt & 0x10) != 0) {
      str = "...";
    } else {
      str = null;
    }
    i.e(paramArrayOfObject, "<this>");
    i.e(paramString1, "separator");
    i.e(paramString2, "prefix");
    i.e(paramString3, "postfix");
    i.e(str, "truncated");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString2);
    int k = paramArrayOfObject.length;
    paramInt = 0;
    int m;
    for (;;)
    {
      m = paramInt;
      if (i >= k) {
        break;
      }
      paramString2 = paramArrayOfObject[i];
      paramInt++;
      if (paramInt > 1) {
        localStringBuilder.append(paramString1);
      }
      if (j >= 0)
      {
        m = paramInt;
        if (paramInt > j) {
          break;
        }
      }
      m0.g(localStringBuilder, paramString2, null);
      i++;
    }
    if ((j >= 0) && (m > j)) {
      localStringBuilder.append(str);
    }
    localStringBuilder.append(paramString3);
    return localStringBuilder.toString();
  }
  
  public static final List<Long> q(long[] paramArrayOfLong)
  {
    i.e(paramArrayOfLong, "<this>");
    int i = paramArrayOfLong.length;
    Object localObject;
    if (i != 0)
    {
      int j = 0;
      if (i != 1)
      {
        ArrayList localArrayList = new ArrayList(paramArrayOfLong.length);
        i = paramArrayOfLong.length;
        for (;;)
        {
          localObject = localArrayList;
          if (j >= i) {
            break;
          }
          localArrayList.add(Long.valueOf(paramArrayOfLong[j]));
          j++;
        }
      }
      localObject = a.f(Long.valueOf(paramArrayOfLong[0]));
    }
    else
    {
      localObject = s.a;
    }
    return (List<Long>)localObject;
  }
  
  public static final <T> List<T> r(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "<this>");
    int i = paramArrayOfT.length;
    if (i != 0)
    {
      if (i != 1) {
        paramArrayOfT = new ArrayList(new h(paramArrayOfT, false));
      } else {
        paramArrayOfT = a.f(paramArrayOfT[0]);
      }
    }
    else {
      paramArrayOfT = s.a;
    }
    return paramArrayOfT;
  }
}

/* Location:
 * Qualified Name:     sb.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */