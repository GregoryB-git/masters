package A2;

import E2.r;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public abstract class n
{
  public static void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void c(Handler paramHandler)
  {
    Object localObject = Looper.myLooper();
    if (localObject != paramHandler.getLooper())
    {
      if (localObject != null) {
        localObject = ((Looper)localObject).getThread().getName();
      } else {
        localObject = "null current looper";
      }
      paramHandler = paramHandler.getLooper().getThread().getName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Must be called on ");
      localStringBuilder.append(paramHandler);
      localStringBuilder.append(" thread, but got ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(".");
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public static void d(String paramString)
  {
    if (r.a()) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static String e(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException("Given String is empty or null");
  }
  
  public static String f(String paramString, Object paramObject)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void g()
  {
    h("Must not be called on the main application thread");
  }
  
  public static void h(String paramString)
  {
    if (!r.a()) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static Object i(Object paramObject)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException("null reference");
  }
  
  public static Object j(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    throw new NullPointerException(String.valueOf(paramObject2));
  }
  
  public static int k(int paramInt)
  {
    if (paramInt != 0) {
      return paramInt;
    }
    throw new IllegalArgumentException("Given Integer is zero");
  }
  
  public static void l(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void m(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
}

/* Location:
 * Qualified Name:     A2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */