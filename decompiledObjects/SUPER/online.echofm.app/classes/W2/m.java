package W2;

public abstract class m
{
  public static String a(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return r.a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return r.a("%s (%s) must be less than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    paramString = new StringBuilder();
    paramString.append("negative size: ");
    paramString.append(paramInt2);
    throw new IllegalArgumentException(paramString.toString());
  }
  
  public static String b(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return r.a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return r.a("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    paramString = new StringBuilder();
    paramString.append("negative size: ");
    paramString.append(paramInt2);
    throw new IllegalArgumentException(paramString.toString());
  }
  
  public static String c(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        return r.a("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      }
      return b(paramInt2, paramInt3, "end index");
    }
    return b(paramInt1, paramInt3, "start index");
  }
  
  public static void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void e(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void f(boolean paramBoolean, String paramString, int paramInt1, int paramInt2)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(r.a(paramString, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public static void g(boolean paramBoolean, String paramString, long paramLong)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(r.a(paramString, new Object[] { Long.valueOf(paramLong) }));
  }
  
  public static int h(int paramInt1, int paramInt2)
  {
    return i(paramInt1, paramInt2, "index");
  }
  
  public static int i(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(a(paramInt1, paramInt2, paramString));
  }
  
  public static Object j(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object k(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    throw new NullPointerException(String.valueOf(paramObject2));
  }
  
  public static int l(int paramInt1, int paramInt2)
  {
    return m(paramInt1, paramInt2, "index");
  }
  
  public static int m(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(b(paramInt1, paramInt2, paramString));
  }
  
  public static void n(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    throw new IndexOutOfBoundsException(c(paramInt1, paramInt2, paramInt3));
  }
  
  public static void o(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void p(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static void q(boolean paramBoolean, String paramString, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(r.a(paramString, new Object[] { paramObject }));
  }
}

/* Location:
 * Qualified Name:     W2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */