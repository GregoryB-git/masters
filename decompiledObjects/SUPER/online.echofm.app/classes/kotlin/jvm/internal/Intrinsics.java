package kotlin.jvm.internal;

import V5.s;
import java.util.Arrays;

public class Intrinsics
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else {
      bool = paramObject1.equals(paramObject2);
    }
    return bool;
  }
  
  public static void b(Object paramObject)
  {
    if (paramObject == null) {
      j();
    }
  }
  
  public static void c(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      k(paramString);
    }
  }
  
  public static void checkNotNullExpressionValue(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append(" must not be null");
    throw ((NullPointerException)g(new NullPointerException(((StringBuilder)paramObject).toString())));
  }
  
  public static void checkNotNullParameter(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      l(paramString);
    }
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      paramInt1 = -1;
    } else if (paramInt1 == paramInt2) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    return paramInt1;
  }
  
  public static int e(long paramLong1, long paramLong2)
  {
    boolean bool = paramLong1 < paramLong2;
    int i;
    if (bool) {
      i = -1;
    } else if (i == 0) {
      i = 0;
    } else {
      i = 1;
    }
    return i;
  }
  
  public static String f(String paramString)
  {
    Object localObject = Thread.currentThread().getStackTrace();
    String str = Intrinsics.class.getName();
    int j;
    for (int i = 0;; i++)
    {
      j = i;
      if (localObject[i].getClassName().equals(str)) {
        break;
      }
    }
    while (localObject[j].getClassName().equals(str)) {
      j++;
    }
    localObject = localObject[j];
    str = ((StackTraceElement)localObject).getClassName();
    localObject = ((StackTraceElement)localObject).getMethodName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Parameter specified as non-null is null: method ");
    localStringBuilder.append(str);
    localStringBuilder.append(".");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", parameter ");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public static Throwable g(Throwable paramThrowable)
  {
    return h(paramThrowable, Intrinsics.class.getName());
  }
  
  public static Throwable h(Throwable paramThrowable, String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    int i = arrayOfStackTraceElement.length;
    int j = -1;
    for (int k = 0; k < i; k++) {
      if (paramString.equals(arrayOfStackTraceElement[k].getClassName())) {
        j = k;
      }
    }
    paramThrowable.setStackTrace((StackTraceElement[])Arrays.copyOfRange(arrayOfStackTraceElement, j + 1, i));
    return paramThrowable;
  }
  
  public static String i(String paramString, Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(paramObject);
    return localStringBuilder.toString();
  }
  
  public static void j()
  {
    throw ((NullPointerException)g(new NullPointerException()));
  }
  
  public static void k(String paramString)
  {
    throw ((NullPointerException)g(new NullPointerException(paramString)));
  }
  
  public static void l(String paramString)
  {
    throw ((NullPointerException)g(new NullPointerException(f(paramString))));
  }
  
  public static void m(String paramString)
  {
    throw ((s)g(new s(paramString)));
  }
  
  public static void n(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("lateinit property ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" has not been initialized");
    m(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.Intrinsics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */