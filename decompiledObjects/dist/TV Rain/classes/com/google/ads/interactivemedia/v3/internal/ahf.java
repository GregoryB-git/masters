package com.google.ads.interactivemedia.v3.internal;

import a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import z2;

public class ahf
{
  public static int a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, "index");
  }
  
  public static int a(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(c(paramInt1, paramInt2, paramString));
  }
  
  public static int a(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static <T> T a(T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  public static String a(String paramString, Object... paramVarArgs)
  {
    String str = String.valueOf(paramString);
    int i = 0;
    for (int j = 0; j < paramVarArgs.length; j++) {
      paramVarArgs[j] = b(paramVarArgs[j]);
    }
    j = str.length();
    paramString = new StringBuilder(paramVarArgs.length * 16 + j);
    int k = 0;
    for (j = i; j < paramVarArgs.length; j++)
    {
      i = str.indexOf("%s", k);
      if (i == -1) {
        break;
      }
      paramString.append(str, k, i);
      paramString.append(paramVarArgs[j]);
      k = i + 2;
    }
    paramString.append(str, k, str.length());
    if (j < paramVarArgs.length)
    {
      paramString.append(" [");
      k = j + 1;
      paramString.append(paramVarArgs[j]);
      for (j = k; j < paramVarArgs.length; j++)
      {
        paramString.append(", ");
        paramString.append(paramVarArgs[j]);
      }
      paramString.append(']');
    }
    return paramString.toString();
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    throw new IndexOutOfBoundsException(b(paramInt1, paramInt2, paramInt3));
  }
  
  public static void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void a(boolean paramBoolean, String paramString, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(a(paramString, new Object[] { paramObject }));
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static boolean a(String paramString)
  {
    return ahg.a(paramString);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return b(paramInt1, paramInt2, "index");
  }
  
  public static int b(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(d(paramInt1, paramInt2, paramString));
  }
  
  public static <T> T b(T paramT, Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  private static String b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        return a("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      }
      return d(paramInt2, paramInt3, "end index");
    }
    return d(paramInt1, paramInt3, "start index");
  }
  
  private static String b(Object paramObject)
  {
    try
    {
      String str1 = String.valueOf(paramObject);
      return str1;
    }
    catch (Exception localException)
    {
      String str2 = paramObject.getClass().getName();
      Object localObject = Integer.toHexString(System.identityHashCode(paramObject));
      paramObject = new StringBuilder(a.b((String)localObject, str2.length() + 1));
      ((StringBuilder)paramObject).append(str2);
      ((StringBuilder)paramObject).append('@');
      ((StringBuilder)paramObject).append((String)localObject);
      str2 = ((StringBuilder)paramObject).toString();
      localObject = Logger.getLogger("com.google.common.base.Strings");
      Level localLevel = Level.WARNING;
      paramObject = String.valueOf(str2);
      if (((String)paramObject).length() != 0) {
        paramObject = "Exception during lenientFormat for ".concat((String)paramObject);
      } else {
        paramObject = new String("Exception during lenientFormat for ");
      }
      ((Logger)localObject).logp(localLevel, "com.google.common.base.Strings", "lenientToString", (String)paramObject, localException);
      paramObject = localException.getClass().getName();
      int i = a.b(str2, 9);
      paramObject = a.q(((String)paramObject).length() + i, "<", str2, " threw ", (String)paramObject);
      ((StringBuilder)paramObject).append(">");
    }
    return ((StringBuilder)paramObject).toString();
  }
  
  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  private static String c(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return a("%s (%s) must be less than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(z2.k(26, "negative size: ", paramInt2));
  }
  
  private static String d(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return a("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(z2.k(26, "negative size: ", paramInt2));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */