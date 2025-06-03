package n9;

import android.util.SparseArray;
import b.z;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.f.a;
import eb.e1;
import eb.e1.a;
import eb.f1;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Iterator;
import ma.h;
import r3.j;

public final class o
{
  public static final j a = new j(18);
  
  static
  {
    new SecureRandom();
  }
  
  public static <T> T a(Iterator<T> paramIterator)
  {
    if (paramIterator.hasNext()) {
      paramIterator = paramIterator.next();
    } else {
      paramIterator = null;
    }
    return paramIterator;
  }
  
  public static int b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = Math.min(paramArrayOfByte1.length, paramArrayOfByte2.length);
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfByte1[j] & 0xFF;
      int m = paramArrayOfByte2[j] & 0xFF;
      if (k < m) {
        return -1;
      }
      if (k > m) {
        return 1;
      }
    }
    return d(paramArrayOfByte1.length, paramArrayOfByte2.length);
  }
  
  public static int c(h paramh1, h paramh2)
  {
    int i = Math.min(paramh1.size(), paramh2.size());
    for (int j = 0; j < i; j++)
    {
      int k = paramh1.i(j) & 0xFF;
      int m = paramh2.i(j) & 0xFF;
      if (k < m) {
        return -1;
      }
      if (k > m) {
        return 1;
      }
    }
    return d(paramh1.size(), paramh2.size());
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      return -1;
    }
    if (paramInt1 > paramInt2) {
      return 1;
    }
    return 0;
  }
  
  public static int e(double paramDouble, long paramLong)
  {
    boolean bool = Double.isNaN(paramDouble);
    int i = -1;
    if ((!bool) && (paramDouble >= -9.223372036854776E18D)) {
      if (paramDouble >= 9.223372036854776E18D)
      {
        i = 1;
      }
      else
      {
        i = Long.compare(paramDouble, paramLong);
        if (i == 0) {
          i = z.j(paramDouble, paramLong);
        }
      }
    }
    return i;
  }
  
  public static <T> void f(Iterator<T> paramIterator1, Iterator<T> paramIterator2, Comparator<? super T> paramComparator, d<T> paramd1, d<T> paramd2)
  {
    Object localObject1 = a(paramIterator1);
    label6:
    Object localObject2 = a(paramIterator2);
    for (;;)
    {
      if ((localObject1 == null) && (localObject2 == null)) {
        return;
      }
      int i = 0;
      int j = 1;
      if ((localObject1 != null) && (localObject2 != null))
      {
        int k = paramComparator.compare(localObject1, localObject2);
        if (k < 0) {
          break label90;
        }
        if (k <= 0)
        {
          j = 0;
          break label90;
        }
      }
      else
      {
        if (localObject1 != null) {
          break label90;
        }
      }
      j = 0;
      i = 1;
      label90:
      if (i != 0)
      {
        paramd1.accept(localObject2);
        break label6;
      }
      if (j == 0) {
        break;
      }
      paramd2.accept(localObject1);
      localObject1 = a(paramIterator1);
    }
  }
  
  public static f g(e1 parame1)
  {
    parame1.getClass();
    f1 localf1 = new f1(parame1);
    String str = localf1.getMessage();
    int i = a.a;
    return new f(str, (f.a)f.a.u.get(i, f.a.d), localf1);
  }
  
  public static StringBuilder h(CharSequence paramCharSequence, int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramInt != 0)
    {
      localStringBuilder.append(paramCharSequence);
      for (int i = 1; i < paramInt; i++)
      {
        localStringBuilder.append(paramString);
        localStringBuilder.append(paramCharSequence);
      }
    }
    return localStringBuilder;
  }
  
  public static String i(h paramh)
  {
    int i = paramh.size();
    StringBuilder localStringBuilder = new StringBuilder(i * 2);
    for (int j = 0; j < i; j++)
    {
      int k = paramh.i(j) & 0xFF;
      localStringBuilder.append(Character.forDigit(k >>> 4, 16));
      localStringBuilder.append(Character.forDigit(k & 0xF, 16));
    }
    return localStringBuilder.toString();
  }
  
  public static String j(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = "null";
    } else {
      paramObject = paramObject.getClass().getName();
    }
    return (String)paramObject;
  }
}

/* Location:
 * Qualified Name:     n9.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */