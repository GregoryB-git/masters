package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class aav
  implements yp
{
  private final za a;
  private final xr b;
  private final zn c;
  private final aao d;
  private final acv e = acv.a();
  
  public aav(za paramza, xr paramxr, zn paramzn, aao paramaao)
  {
    a = paramza;
    b = paramxr;
    c = paramzn;
    d = paramaao;
  }
  
  private final boolean a(Field paramField, boolean paramBoolean)
  {
    zn localzn = c;
    return (!localzn.a(paramField.getType(), paramBoolean)) && (!localzn.a(paramField, paramBoolean));
  }
  
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    Class localClass = Object.class;
    Object localObject1 = paramacx.a();
    if (!Object.class.isAssignableFrom((Class)localObject1)) {
      return null;
    }
    Object localObject2 = a.a(paramacx);
    Object localObject3 = new com/google/ads/interactivemedia/v3/internal/aay;
    Object localObject4 = new LinkedHashMap();
    Object localObject5 = localObject4;
    Object localObject6 = localObject3;
    Object localObject7 = localObject2;
    if (!((Class)localObject1).isInterface())
    {
      localObject5 = paramacx.b();
      Object localObject8 = paramacx;
      paramacx = (acx<T>)localObject3;
      localObject3 = localObject5;
      for (;;)
      {
        localObject5 = localObject4;
        localObject6 = paramacx;
        localObject7 = localObject2;
        if (localObject1 == localClass) {
          break;
        }
        localObject5 = ((Class)localObject1).getDeclaredFields();
        int i = localObject5.length;
        boolean bool1 = false;
        int j = 0;
        for (;;)
        {
          localObject6 = this;
          if (j >= i) {
            break label675;
          }
          Field localField = localObject5[j];
          boolean bool2 = ((aav)localObject6).a(localField, true);
          boolean bool3 = ((aav)localObject6).a(localField, bool1);
          if ((!bool2) && (!bool3))
          {
            localObject6 = localObject5;
            localObject5 = localObject1;
            localObject7 = localObject2;
            localObject1 = localObject3;
            localObject2 = localObject4;
            localObject4 = localObject7;
            localObject3 = localObject6;
          }
          else
          {
            e.a(localField);
            localObject9 = yw.a(((acx)localObject8).b(), (Class)localObject1, localField.getGenericType());
            Object localObject10 = (yr)localField.getAnnotation(yr.class);
            if (localObject10 == null)
            {
              localObject6 = Collections.singletonList(b.a(localField));
            }
            else
            {
              localObject7 = ((yr)localObject10).a();
              localObject10 = ((yr)localObject10).b();
              if (localObject10.length == 0)
              {
                localObject6 = Collections.singletonList(localObject7);
              }
              else
              {
                localObject6 = new ArrayList(localObject10.length + 1);
                ((ArrayList)localObject6).add(localObject7);
                k = localObject10.length;
                for (m = 0; m < k; m++) {
                  ((ArrayList)localObject6).add(localObject10[m]);
                }
              }
            }
            bool1 = true;
            int m = ((List)localObject6).size();
            int k = 0;
            localObject7 = null;
            localObject10 = localObject6;
            for (;;)
            {
              xu localxu = paramxu;
              if (k >= m) {
                break;
              }
              String str = (String)((List)localObject10).get(k);
              if (k != 0) {
                bool2 = false;
              }
              acx localacx = acx.a((Type)localObject9);
              boolean bool4 = zx.a(localacx.a());
              localObject6 = (ys)localField.getAnnotation(ys.class);
              if (localObject6 != null) {
                localObject6 = aao.a(a, localxu, localacx, (ys)localObject6);
              } else {
                localObject6 = null;
              }
              boolean bool5;
              if (localObject6 != null) {
                bool5 = bool1;
              } else {
                bool5 = false;
              }
              Object localObject11 = localObject6;
              if (localObject6 == null) {
                localObject11 = localxu.a(localacx);
              }
              localObject11 = (aax)((Map)localObject4).put(str, new aax(this, str, bool2, bool3, localField, bool5, (yn)localObject11, paramxu, localacx, bool4));
              localObject6 = localObject7;
              if (localObject7 == null) {
                localObject6 = localObject11;
              }
              k++;
              localObject7 = localObject6;
            }
            localObject6 = localObject5;
            localObject5 = localObject1;
            localObject1 = localObject3;
            localObject9 = localObject4;
            localObject4 = localObject2;
            bool1 = false;
            if (localObject7 != null) {
              break;
            }
            localObject3 = localObject6;
            localObject2 = localObject9;
          }
          j++;
          localObject6 = localObject5;
          localObject7 = localObject1;
          Object localObject9 = localObject2;
          localObject2 = localObject4;
          localObject5 = localObject3;
          localObject1 = localObject6;
          localObject3 = localObject7;
          localObject4 = localObject9;
        }
        paramxu = new StringBuilder();
        paramxu.append(localObject1);
        paramxu.append(" declares multiple JSON fields named ");
        paramxu.append(a);
        throw new IllegalArgumentException(paramxu.toString());
        label675:
        localObject8 = acx.a(yw.a(((acx)localObject8).b(), (Class)localObject1, ((Class)localObject1).getGenericSuperclass()));
        localObject1 = ((acx)localObject8).a();
      }
    }
    ((aay)localObject6).<init>((zy)localObject7, (Map)localObject5);
    return (yn<T>)localObject6;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aav
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */