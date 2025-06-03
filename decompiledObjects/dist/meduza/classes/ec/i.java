package ec;

import g;
import java.util.Arrays;
import n7.w;

public final class i
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
    if (paramObject != null) {
      return;
    }
    paramObject = new NullPointerException();
    g(i.class.getName(), (RuntimeException)paramObject);
    throw ((Throwable)paramObject);
  }
  
  public static void c(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new NullPointerException(paramString);
    g(i.class.getName(), (RuntimeException)paramObject);
    throw ((Throwable)paramObject);
  }
  
  public static void d(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new NullPointerException(g.d(paramString, " must not be null"));
    g(i.class.getName(), (RuntimeException)paramObject);
    throw ((Throwable)paramObject);
  }
  
  public static void e(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      paramObject = Thread.currentThread().getStackTrace();
      String str = i.class.getName();
      int j;
      for (int i = 0;; i++)
      {
        j = i;
        if (paramObject[i].getClassName().equals(str)) {
          break;
        }
      }
      while (paramObject[j].getClassName().equals(str)) {
        j++;
      }
      str = paramObject[j];
      paramObject = str.getClassName();
      str = str.getMethodName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Parameter specified as non-null is null: method ");
      localStringBuilder.append((String)paramObject);
      localStringBuilder.append(".");
      localStringBuilder.append(str);
      localStringBuilder.append(", parameter ");
      localStringBuilder.append(paramString);
      paramObject = new NullPointerException(localStringBuilder.toString());
      g(i.class.getName(), (RuntimeException)paramObject);
      throw ((Throwable)paramObject);
    }
  }
  
  public static int f(int paramInt1, int paramInt2)
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
  
  public static void g(String paramString, RuntimeException paramRuntimeException)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramRuntimeException.getStackTrace();
    int i = arrayOfStackTraceElement.length;
    int j = -1;
    for (int k = 0; k < i; k++) {
      if (paramString.equals(arrayOfStackTraceElement[k].getClassName())) {
        j = k;
      }
    }
    paramRuntimeException.setStackTrace((StackTraceElement[])Arrays.copyOfRange(arrayOfStackTraceElement, j + 1, i));
  }
  
  public static String h(Object paramObject, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(paramObject);
    return localStringBuilder.toString();
  }
  
  public static void i(String paramString)
  {
    paramString = new w(g.e("lateinit property ", paramString, " has not been initialized"));
    g(i.class.getName(), paramString);
    throw paramString;
  }
}

/* Location:
 * Qualified Name:     ec.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */