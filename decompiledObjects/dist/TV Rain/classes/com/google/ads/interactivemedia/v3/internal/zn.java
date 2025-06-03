package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zn
  implements yp, Cloneable
{
  public static final zn a = new zn();
  private double b = -1.0D;
  private int c = 136;
  private boolean d = true;
  private List<xk> e = Collections.emptyList();
  private List<xk> f = Collections.emptyList();
  
  private final zn a()
  {
    try
    {
      zn localzn = (zn)super.clone();
      return localzn;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  private final boolean a(yu paramyu, yt paramyt)
  {
    int i;
    if ((paramyu != null) && (paramyu.a() > b)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if ((paramyt != null) && (paramyt.a() <= b)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean a(Class<?> paramClass)
  {
    if ((b != -1.0D) && (!a((yu)paramClass.getAnnotation(yu.class), (yt)paramClass.getAnnotation(yt.class)))) {
      return true;
    }
    if ((!d) && (c(paramClass))) {
      return true;
    }
    return b(paramClass);
  }
  
  private static boolean b(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }
  
  private final boolean b(Class<?> paramClass, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramClass = e;
    } else {
      paramClass = f;
    }
    paramClass = paramClass.iterator();
    while (paramClass.hasNext()) {
      ((xk)paramClass.next()).a();
    }
    return false;
  }
  
  private final boolean c(Class<?> paramClass)
  {
    if (paramClass.isMemberClass())
    {
      int i;
      if ((paramClass.getModifiers() & 0x8) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        return true;
      }
    }
    return false;
  }
  
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    Class localClass = paramacx.a();
    boolean bool1 = a(localClass);
    boolean bool2;
    if ((!bool1) && (!b(localClass, true))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    if ((!bool1) && (!b(localClass, false))) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    if ((!bool2) && (!bool1)) {
      return null;
    }
    return new zq(this, bool1, bool2, paramxu, paramacx);
  }
  
  public final zn a(xk paramxk, boolean paramBoolean1, boolean paramBoolean2)
  {
    zn localzn = a();
    ArrayList localArrayList = new ArrayList(e);
    e = localArrayList;
    localArrayList.add(paramxk);
    return localzn;
  }
  
  public final boolean a(Class<?> paramClass, boolean paramBoolean)
  {
    return (a(paramClass)) || (b(paramClass, paramBoolean));
  }
  
  public final boolean a(Field paramField, boolean paramBoolean)
  {
    if ((c & paramField.getModifiers()) != 0) {
      return true;
    }
    if ((b != -1.0D) && (!a((yu)paramField.getAnnotation(yu.class), (yt)paramField.getAnnotation(yt.class)))) {
      return true;
    }
    if (paramField.isSynthetic()) {
      return true;
    }
    if ((!d) && (c(paramField.getType()))) {
      return true;
    }
    if (b(paramField.getType())) {
      return true;
    }
    Object localObject;
    if (paramBoolean) {
      localObject = e;
    } else {
      localObject = f;
    }
    if (!((List)localObject).isEmpty())
    {
      paramField = new xj(paramField);
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (((xk)((Iterator)localObject).next()).a(paramField)) {
          return true;
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */