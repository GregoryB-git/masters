package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class aje
{
  private static final ThreadLocal<Set<ajj<aji, aji>>> a = new ThreadLocal();
  private boolean b = true;
  private boolean c = false;
  private boolean d = false;
  private List<Class<?>> e;
  private Class<?> f = null;
  private String[] g = null;
  
  public aje()
  {
    ArrayList localArrayList = new ArrayList();
    e = localArrayList;
    localArrayList.add(String.class);
  }
  
  private final aje a(int paramInt1, int paramInt2)
  {
    if (!b) {
      return this;
    }
    boolean bool;
    if (paramInt1 == paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
    return this;
  }
  
  private final aje a(long paramLong1, long paramLong2)
  {
    if (!b) {
      return this;
    }
    boolean bool;
    if (paramLong1 == paramLong2) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
    return this;
  }
  
  private static ajj<aji, aji> a(Object paramObject1, Object paramObject2)
  {
    return ajj.a(new aji(paramObject1), new aji(paramObject2));
  }
  
  private static Set<ajj<aji, aji>> a()
  {
    return (Set)a.get();
  }
  
  private final void a(Object paramObject1, Object paramObject2, Class<?> paramClass)
  {
    Set localSet = a();
    Object localObject1 = a(paramObject1, paramObject2);
    Object localObject2 = ajj.a(((ajj)localObject1).b(), ((ajj)localObject1).a());
    int i = 0;
    int j;
    if ((localSet != null) && ((localSet.contains(localObject1)) || (localSet.contains(localObject2)))) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      return;
    }
    try
    {
      localObject1 = a();
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
        a.set(localObject2);
      }
      ((Set)localObject2).add(a(paramObject1, paramObject2));
      paramClass = paramClass.getDeclaredFields();
      AccessibleObject.setAccessible(paramClass, true);
      for (j = i; (j < paramClass.length) && (b); j++)
      {
        localObject2 = paramClass[j];
        if ((!aja.a(g, ((Field)localObject2).getName())) && (!((Field)localObject2).getName().contains("$")) && ((c) || (!Modifier.isTransient(((Field)localObject2).getModifiers()))) && (!Modifier.isStatic(((Field)localObject2).getModifiers())))
        {
          boolean bool = ((Field)localObject2).isAnnotationPresent(ajd.class);
          if (!bool) {
            try
            {
              d(((Field)localObject2).get(paramObject1), ((Field)localObject2).get(paramObject2));
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
      b(paramObject1, paramObject2);
    }
  }
  
  public static boolean a(Object paramObject1, Object paramObject2, String... paramVarArgs)
  {
    if (paramObject1 == paramObject2) {
      return true;
    }
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      aje localaje = new aje();
      g = paramVarArgs;
      f = null;
      c = false;
      d = false;
      return cb;
    }
    return false;
  }
  
  private static void b(Object paramObject1, Object paramObject2)
  {
    Set localSet = a();
    if (localSet != null)
    {
      localSet.remove(a(paramObject1, paramObject2));
      if (localSet.isEmpty()) {
        a.remove();
      }
    }
  }
  
  private final aje c(Object paramObject1, Object paramObject2)
  {
    if (!b) {
      return this;
    }
    if (paramObject1 == paramObject2) {
      return this;
    }
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      Class localClass1 = paramObject1.getClass();
      Class localClass2 = paramObject2.getClass();
      if (localClass1.isInstance(paramObject2))
      {
        if (!localClass2.isInstance(paramObject1)) {
          break label81;
        }
      }
      else
      {
        if (!localClass2.isInstance(paramObject1)) {
          break label204;
        }
        if (localClass1.isInstance(paramObject2)) {
          break label81;
        }
      }
      Class localClass3 = localClass1;
      break label85;
      label81:
      localClass3 = localClass2;
      try
      {
        label85:
        if (localClass3.isArray())
        {
          d(paramObject1, paramObject2);
        }
        else
        {
          List localList = e;
          Class localClass4 = localClass3;
          if (localList != null) {
            if (!localList.contains(localClass1))
            {
              localClass4 = localClass3;
              if (!e.contains(localClass2)) {}
            }
            else
            {
              b = paramObject1.equals(paramObject2);
              break label194;
            }
          }
          for (;;)
          {
            a(paramObject1, paramObject2, localClass4);
            if ((localClass4.getSuperclass() == null) || (localClass4 == f)) {
              break;
            }
            localClass4 = localClass4.getSuperclass();
          }
        }
        label194:
        return this;
      }
      catch (IllegalArgumentException paramObject1)
      {
        b = false;
        return this;
      }
      label204:
      b = false;
      return this;
    }
    b = false;
    return this;
  }
  
  private final aje d(Object paramObject1, Object paramObject2)
  {
    if (!b) {
      return this;
    }
    if (paramObject1 == paramObject2) {
      return this;
    }
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      Class localClass = paramObject1.getClass();
      if (localClass.isArray())
      {
        if (paramObject1.getClass() != paramObject2.getClass())
        {
          b = false;
        }
        else if ((paramObject1 instanceof long[]))
        {
          paramObject1 = (long[])paramObject1;
          paramObject2 = (long[])paramObject2;
          if ((b) && (paramObject1 != paramObject2)) {
            if (paramObject1.length != paramObject2.length) {
              b = false;
            } else {
              while ((n < paramObject1.length) && (b))
              {
                a(paramObject1[n], paramObject2[n]);
                n++;
              }
            }
          }
        }
        else if ((paramObject1 instanceof int[]))
        {
          paramObject1 = (int[])paramObject1;
          paramObject2 = (int[])paramObject2;
          if ((b) && (paramObject1 != paramObject2))
          {
            n = i;
            if (paramObject1.length != paramObject2.length) {
              b = false;
            } else {
              while ((n < paramObject1.length) && (b))
              {
                a(paramObject1[n], paramObject2[n]);
                n++;
              }
            }
          }
        }
        else
        {
          boolean bool1;
          if ((paramObject1 instanceof short[]))
          {
            paramObject1 = (short[])paramObject1;
            paramObject2 = (short[])paramObject2;
            if ((b) && (paramObject1 != paramObject2)) {
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                for (n = 0; n < paramObject1.length; n++)
                {
                  bool1 = b;
                  if (!bool1) {
                    break;
                  }
                  j = paramObject1[n];
                  i = paramObject2[n];
                  if (bool1)
                  {
                    if (j == i) {
                      bool1 = true;
                    } else {
                      bool1 = false;
                    }
                    b = bool1;
                  }
                }
              }
            }
          }
          else if ((paramObject1 instanceof char[]))
          {
            paramObject1 = (char[])paramObject1;
            paramObject2 = (char[])paramObject2;
            if ((b) && (paramObject1 != paramObject2)) {
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                for (n = 0; n < paramObject1.length; n++)
                {
                  bool1 = b;
                  if (!bool1) {
                    break;
                  }
                  i = paramObject1[n];
                  j = paramObject2[n];
                  if (bool1)
                  {
                    if (i == j) {
                      bool1 = true;
                    } else {
                      bool1 = false;
                    }
                    b = bool1;
                  }
                }
              }
            }
          }
          else if ((paramObject1 instanceof byte[]))
          {
            paramObject1 = (byte[])paramObject1;
            paramObject2 = (byte[])paramObject2;
            if ((b) && (paramObject1 != paramObject2)) {
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                for (n = 0; n < paramObject1.length; n++)
                {
                  bool1 = b;
                  if (!bool1) {
                    break;
                  }
                  j = paramObject1[n];
                  i = paramObject2[n];
                  if (bool1)
                  {
                    if (j == i) {
                      bool1 = true;
                    } else {
                      bool1 = false;
                    }
                    b = bool1;
                  }
                }
              }
            }
          }
          else if ((paramObject1 instanceof double[]))
          {
            paramObject1 = (double[])paramObject1;
            paramObject2 = (double[])paramObject2;
            if ((b) && (paramObject1 != paramObject2))
            {
              n = j;
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                while (n < paramObject1.length)
                {
                  bool1 = b;
                  if (!bool1) {
                    break;
                  }
                  double d1 = paramObject1[n];
                  double d2 = paramObject2[n];
                  if (bool1) {
                    a(Double.doubleToLongBits(d1), Double.doubleToLongBits(d2));
                  }
                  n++;
                }
              }
            }
          }
          else if ((paramObject1 instanceof float[]))
          {
            paramObject1 = (float[])paramObject1;
            paramObject2 = (float[])paramObject2;
            if ((b) && (paramObject1 != paramObject2))
            {
              n = k;
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                while (n < paramObject1.length)
                {
                  bool1 = b;
                  if (!bool1) {
                    break;
                  }
                  float f1 = paramObject1[n];
                  float f2 = paramObject2[n];
                  if (bool1) {
                    a(Float.floatToIntBits(f1), Float.floatToIntBits(f2));
                  }
                  n++;
                }
              }
            }
          }
          else if ((paramObject1 instanceof boolean[]))
          {
            paramObject1 = (boolean[])paramObject1;
            paramObject2 = (boolean[])paramObject2;
            if ((b) && (paramObject1 != paramObject2)) {
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                for (n = 0; n < paramObject1.length; n++)
                {
                  boolean bool2 = b;
                  if (!bool2) {
                    break;
                  }
                  int i1 = paramObject1[n];
                  int i2 = paramObject2[n];
                  if (bool2)
                  {
                    if (i1 == i2) {
                      i1 = 1;
                    } else {
                      i1 = 0;
                    }
                    b = i1;
                  }
                }
              }
            }
          }
          else
          {
            paramObject1 = (Object[])paramObject1;
            paramObject2 = (Object[])paramObject2;
            if ((b) && (paramObject1 != paramObject2))
            {
              n = m;
              if (paramObject1.length != paramObject2.length) {
                b = false;
              } else {
                while ((n < paramObject1.length) && (b))
                {
                  d(paramObject1[n], paramObject2[n]);
                  n++;
                }
              }
            }
          }
        }
      }
      else if ((d) && (!aiz.a(localClass))) {
        c(paramObject1, paramObject2);
      } else {
        b = paramObject1.equals(paramObject2);
      }
      return this;
    }
    b = false;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aje
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */