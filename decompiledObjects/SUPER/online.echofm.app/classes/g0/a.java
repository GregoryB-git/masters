package g0;

import android.text.TextUtils;

public abstract class a
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
  
  public static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= paramInt2) && (paramInt1 < paramInt3)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException();
  }
  
  public static String d(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException();
  }
  
  public static Object e(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void g(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static Object h(Object paramObject)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new IllegalStateException();
  }
  
  public static Object i(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    throw new IllegalStateException(String.valueOf(paramObject2));
  }
}

/* Location:
 * Qualified Name:     g0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */