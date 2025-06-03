package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public final class ajg
{
  private static final ThreadLocal<Set<aji>> a = new ThreadLocal();
  private final int b;
  private int c;
  
  public ajg()
  {
    b = 37;
    c = 17;
  }
  
  private ajg(int paramInt1, int paramInt2)
  {
    c = 0;
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 % 2 != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    ajc.a(bool2, "HashCodeBuilder requires an odd initial value", new Object[0]);
    if (paramInt2 % 2 != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    ajc.a(bool2, "HashCodeBuilder requires an odd multiplier", new Object[0]);
    b = paramInt2;
    c = paramInt1;
  }
  
  private static <T> int a(int paramInt1, int paramInt2, T paramT, boolean paramBoolean, Class<? super T> paramClass, String... paramVarArgs)
  {
    if (paramT != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    ajc.a(paramBoolean, "The object to build a hash code for must not be null", new Object[0]);
    ajg localajg = new ajg(17, 37);
    paramClass = paramT.getClass();
    a(paramT, paramClass, localajg, false, paramVarArgs);
    while (paramClass.getSuperclass() != null)
    {
      paramClass = paramClass.getSuperclass();
      a(paramT, paramClass, localajg, false, paramVarArgs);
    }
    return c;
  }
  
  public static int a(Object paramObject, String... paramVarArgs)
  {
    return a(17, 37, paramObject, false, null, paramVarArgs);
  }
  
  private final ajg a(long paramLong)
  {
    c = (c * b + (int)(paramLong ^ paramLong >> 32));
    return this;
  }
  
  private static Set<aji> a()
  {
    return (Set)a.get();
  }
  
  private static void a(Object paramObject)
  {
    Set localSet = a();
    if (localSet != null)
    {
      localSet.remove(new aji(paramObject));
      if (localSet.isEmpty()) {
        a.remove();
      }
    }
  }
  
  private static void a(Object paramObject, Class<?> paramClass, ajg paramajg, boolean paramBoolean, String[] paramArrayOfString)
  {
    Object localObject1 = a();
    int i = 0;
    int j;
    if ((localObject1 != null) && (((Set)localObject1).contains(new aji(paramObject)))) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      return;
    }
    try
    {
      Object localObject2 = a();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
        a.set(localObject1);
      }
      localObject2 = new com/google/ads/interactivemedia/v3/internal/aji;
      ((aji)localObject2).<init>(paramObject);
      ((Set)localObject1).add(localObject2);
      paramClass = paramClass.getDeclaredFields();
      AccessibleObject.setAccessible(paramClass, true);
      int k = paramClass.length;
      for (j = i; j < k; j++)
      {
        localObject1 = paramClass[j];
        if ((!aja.a(paramArrayOfString, ((Field)localObject1).getName())) && (!((Field)localObject1).getName().contains("$")) && ((paramBoolean) || (!Modifier.isTransient(((Field)localObject1).getModifiers()))) && (!Modifier.isStatic(((Field)localObject1).getModifiers())))
        {
          boolean bool = ((Field)localObject1).isAnnotationPresent(ajf.class);
          if (!bool) {
            try
            {
              paramajg.b(((Field)localObject1).get(paramObject));
            }
            catch (IllegalAccessException paramClass)
            {
              paramClass = new java/lang/InternalError;
              paramClass.<init>("Unexpected IllegalAccessException");
              throw paramClass;
            }
          }
        }
      }
      return;
    }
    finally
    {
      a(paramObject);
    }
  }
  
  private final ajg b(Object paramObject)
  {
    if (paramObject == null)
    {
      c *= b;
    }
    else
    {
      if (paramObject.getClass().isArray())
      {
        boolean bool = paramObject instanceof long[];
        j = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        i5 = 0;
        if (bool)
        {
          paramObject = (long[])paramObject;
          j = paramObject.length;
          while (i5 < j)
          {
            a(paramObject[i5]);
            i5++;
          }
        }
        if ((paramObject instanceof int[]))
        {
          paramObject = (int[])paramObject;
          k = paramObject.length;
          for (i5 = j; i5 < k; i5++)
          {
            j = paramObject[i5];
            c = (c * b + j);
          }
        }
        if ((paramObject instanceof short[]))
        {
          paramObject = (short[])paramObject;
          j = paramObject.length;
          for (i5 = k; i5 < j; i5++)
          {
            k = paramObject[i5];
            c = (c * b + k);
          }
        }
        if ((paramObject instanceof char[]))
        {
          paramObject = (char[])paramObject;
          j = paramObject.length;
          for (i5 = m; i5 < j; i5++)
          {
            k = paramObject[i5];
            c = (c * b + k);
          }
        }
        if ((paramObject instanceof byte[]))
        {
          paramObject = (byte[])paramObject;
          j = paramObject.length;
          for (i5 = n; i5 < j; i5++)
          {
            k = paramObject[i5];
            c = (c * b + k);
          }
        }
        if ((paramObject instanceof double[]))
        {
          paramObject = (double[])paramObject;
          j = paramObject.length;
          for (i5 = i1; i5 < j; i5++) {
            a(Double.doubleToLongBits(paramObject[i5]));
          }
        }
        if ((paramObject instanceof float[]))
        {
          paramObject = (float[])paramObject;
          j = paramObject.length;
          for (i5 = i2; i5 < j; i5++)
          {
            float f = paramObject[i5];
            k = c;
            m = b;
            c = (Float.floatToIntBits(f) + k * m);
          }
        }
        if ((paramObject instanceof boolean[]))
        {
          paramObject = (boolean[])paramObject;
          j = paramObject.length;
          for (i5 = i3; i5 < j; i5++)
          {
            int i = paramObject[i5];
            c = (c * b + (i ^ 0x1));
          }
        }
        paramObject = (Object[])paramObject;
        j = paramObject.length;
        for (i5 = i4; i5 < j; i5++) {
          b(paramObject[i5]);
        }
      }
      int j = c;
      int i5 = b;
      c = (paramObject.hashCode() + j * i5);
    }
    return this;
  }
  
  public final int hashCode()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ajg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */