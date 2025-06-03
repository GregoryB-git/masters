package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class sp
  extends te
{
  private static final int[] a = new int[0];
  private final ta b;
  private final AtomicReference<su> c;
  
  @Deprecated
  public sp()
  {
    this(new ta());
  }
  
  private sp(su paramsu, ta paramta)
  {
    super((byte)0);
    b = paramta;
    c = new AtomicReference(paramsu);
  }
  
  @Deprecated
  private sp(ta paramta)
  {
    this(su.a, paramta);
  }
  
  public static int a(bw parambw, String paramString, boolean paramBoolean)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals(y))) {
      return 4;
    }
    paramString = a(paramString);
    parambw = a(y);
    if ((parambw != null) && (paramString != null))
    {
      if ((!parambw.startsWith(paramString)) && (!paramString.startsWith(parambw)))
      {
        if (wl.b(parambw, "-")[0].equals(wl.b(paramString, "-")[0])) {
          return 2;
        }
        return 0;
      }
      return 3;
    }
    if ((paramBoolean) && (parambw == null)) {
      return 1;
    }
    return 0;
  }
  
  public static String a(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.equals(paramString, "und"))) {
      return paramString;
    }
    return null;
  }
  
  private static List<Integer> a(od paramod, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(a);
    for (int i = 0; i < a; i++) {
      localArrayList.add(Integer.valueOf(i));
    }
    if ((paramInt1 != Integer.MAX_VALUE) && (paramInt2 != Integer.MAX_VALUE))
    {
      int j = 0;
      int k;
      for (i = Integer.MAX_VALUE;; i = k)
      {
        k = a;
        int m = 1;
        if (j >= k) {
          break;
        }
        bw localbw = paramod.a(j);
        int n = n;
        k = i;
        if (n > 0)
        {
          int i1 = o;
          k = i;
          if (i1 > 0)
          {
            if (paramBoolean)
            {
              if (n > i1) {
                k = 1;
              } else {
                k = 0;
              }
              if (paramInt1 <= paramInt2) {
                m = 0;
              }
              if (k != m)
              {
                m = paramInt1;
                k = paramInt2;
                break label173;
              }
            }
            k = paramInt1;
            m = paramInt2;
            label173:
            int i2 = n * m;
            int i3 = i1 * k;
            Point localPoint;
            if (i2 >= i3) {
              localPoint = new Point(k, wl.a(i3, n));
            } else {
              localPoint = new Point(wl.a(i2, i1), m);
            }
            i1 = n;
            n = o;
            m = i1 * n;
            k = i;
            if (i1 >= (int)(x * 0.98F))
            {
              k = i;
              if (n >= (int)(y * 0.98F))
              {
                k = i;
                if (m < i) {
                  k = m;
                }
              }
            }
          }
        }
        j++;
      }
      if (i != Integer.MAX_VALUE) {
        for (paramInt1 = localArrayList.size() - 1; paramInt1 >= 0; paramInt1--)
        {
          paramInt2 = paramod.a(((Integer)localArrayList.get(paramInt1)).intValue()).a();
          if ((paramInt2 == -1) || (paramInt2 > i)) {
            localArrayList.remove(paramInt1);
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static boolean a(int paramInt, boolean paramBoolean)
  {
    paramInt &= 0x7;
    return (paramInt == 4) || ((paramBoolean) && (paramInt == 3));
  }
  
  private static boolean a(bw parambw, int paramInt1, ss paramss, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (a(paramInt1, false))
    {
      paramInt1 = e;
      if ((paramInt1 == -1) || (paramInt1 <= paramInt2)) {
        if (!paramBoolean3)
        {
          paramInt1 = t;
          if ((paramInt1 == -1) || (paramInt1 != a)) {}
        }
        else if (!paramBoolean1)
        {
          String str = i;
          if ((str == null) || (!TextUtils.equals(str, c))) {}
        }
        else if (!paramBoolean2)
        {
          paramInt1 = u;
          if ((paramInt1 == -1) || (paramInt1 != b)) {}
        }
        else
        {
          return true;
        }
      }
    }
    return false;
  }
  
  private static boolean a(bw parambw, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if ((a(paramInt1, false)) && ((paramInt1 & paramInt2) != 0) && ((paramString == null) || (wl.a(i, paramString))))
    {
      paramInt1 = n;
      if ((paramInt1 == -1) || (paramInt1 <= paramInt3))
      {
        paramInt1 = o;
        if ((paramInt1 == -1) || (paramInt1 <= paramInt4))
        {
          float f = p;
          if ((f == -1.0F) || (f <= paramInt5))
          {
            paramInt1 = e;
            if ((paramInt1 == -1) || (paramInt1 <= paramInt6)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  private static int c(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1)
    {
      if (paramInt2 == -1) {
        return 0;
      }
      return -1;
    }
    if (paramInt2 == -1) {
      return 1;
    }
    return paramInt1 - paramInt2;
  }
  
  private static int d(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 1;
    }
    if (paramInt2 > paramInt1) {
      return -1;
    }
    return 0;
  }
  
  public final Pair<cl[], sy[]> a(sz paramsz, int[][][] paramArrayOfInt, int[] paramArrayOfInt1)
    throws ba
  {
    Object localObject1 = paramsz;
    Object localObject2 = (su)c.get();
    int i = paramsz.a();
    int j = paramsz.a();
    Object localObject3 = new tb[j];
    int k = 0;
    int m = 0;
    int n = 0;
    Object localObject4;
    int i1;
    int i2;
    int i3;
    int i5;
    int i6;
    Object localObject7;
    Object localObject8;
    boolean bool1;
    Object localObject9;
    Object localObject10;
    Object localObject11;
    int i12;
    while (k < j)
    {
      if (2 == ((sz)localObject1).a(k))
      {
        if (m == 0)
        {
          localObject4 = ((sz)localObject1).b(k);
          localObject1 = paramArrayOfInt[k];
          m = paramArrayOfInt1[k];
          i1 = i;
          i2 = j;
          localObject5 = localObject3;
          i3 = k;
          i4 = n;
          localObject6 = localObject1;
          int i7;
          if (!s)
          {
            i1 = i;
            i2 = j;
            localObject5 = localObject3;
            i3 = k;
            i4 = n;
            localObject6 = localObject1;
            if (!r)
            {
              if (h) {
                i5 = 24;
              } else {
                i5 = 16;
              }
              if ((g) && ((m & i5) != 0)) {
                i4 = 1;
              } else {
                i4 = 0;
              }
              i6 = 0;
              m = n;
              n = k;
              k = i4;
              for (;;)
              {
                i1 = i;
                i2 = j;
                localObject5 = localObject3;
                i3 = n;
                i4 = m;
                localObject6 = localObject1;
                if (i6 >= b) {
                  break;
                }
                localObject7 = ((of)localObject4).a(i6);
                localObject8 = localObject1[i6];
                i7 = b;
                int i8 = c;
                int i9 = d;
                i4 = i;
                int i10 = e;
                i = j;
                i3 = i;
                j = m;
                m = j;
                bool1 = k;
                localObject6 = localObject3;
                i2 = a;
                if (i2 < 2) {}
                for (localObject3 = a;; localObject3 = a)
                {
                  localObject5 = localObject1;
                  localObject1 = localObject3;
                  localObject3 = localObject5;
                  break label713;
                  localObject9 = a((od)localObject7, i3, m, bool1);
                  if (((List)localObject9).size() >= 2) {
                    break;
                  }
                }
                if (k == 0)
                {
                  localObject5 = new HashSet();
                  i3 = 0;
                  i2 = 0;
                  for (localObject3 = null; i3 < ((List)localObject9).size(); localObject3 = localObject11)
                  {
                    localObject10 = agetintValuei;
                    i1 = i2;
                    localObject11 = localObject3;
                    if (((HashSet)localObject5).add(localObject10))
                    {
                      i1 = 0;
                      for (m = 0; i1 < ((List)localObject9).size(); m = i12)
                      {
                        int i11 = ((Integer)((List)localObject9).get(i1)).intValue();
                        i12 = m;
                        if (a(((od)localObject7).a(i11), (String)localObject10, localObject8[i11], i5, i7, i8, i9, i10)) {
                          i12 = m + 1;
                        }
                        i1++;
                      }
                      i1 = i2;
                      localObject11 = localObject3;
                      if (m > i2)
                      {
                        localObject11 = localObject10;
                        i1 = m;
                      }
                    }
                    i3++;
                    i2 = i1;
                  }
                  localObject5 = localObject3;
                  localObject3 = localObject1;
                }
                else
                {
                  localObject3 = localObject1;
                  localObject5 = null;
                }
                for (m = ((List)localObject9).size() - 1; m >= 0; m--)
                {
                  i3 = ((Integer)((List)localObject9).get(m)).intValue();
                  if (!a(((od)localObject7).a(i3), (String)localObject5, localObject8[i3], i5, i7, i8, i9, i10)) {
                    ((List)localObject9).remove(m);
                  }
                }
                if (((List)localObject9).size() < 2) {
                  localObject1 = a;
                } else {
                  localObject1 = wl.a((List)localObject9);
                }
                label713:
                if (localObject1.length > 0)
                {
                  localObject1 = new tb((od)localObject7, (int[])localObject1);
                  k = i4;
                  localObject5 = localObject3;
                  break label804;
                }
                i6++;
                i3 = i;
                m = j;
                localObject1 = localObject3;
                i = i4;
                j = i3;
                localObject3 = localObject6;
              }
            }
          }
          k = i1;
          i = i2;
          localObject3 = localObject5;
          n = i3;
          j = i4;
          localObject1 = null;
          localObject5 = localObject6;
          localObject6 = localObject3;
          label804:
          localObject3 = localObject1;
          if (localObject1 == null)
          {
            localObject3 = null;
            i1 = 0;
            i4 = 0;
            i5 = 0;
            i12 = -1;
            i6 = -1;
            while (i1 < b)
            {
              localObject1 = ((of)localObject4).a(i1);
              localObject10 = a((od)localObject1, i, j, k);
              localObject11 = localObject5[i1];
              for (m = 0; m < a; m++) {
                if (a(localObject11[m], t))
                {
                  localObject7 = ((od)localObject1).a(m);
                  if (((List)localObject10).contains(Integer.valueOf(m)))
                  {
                    i3 = n;
                    if ((i3 == -1) || (i3 <= b))
                    {
                      i3 = o;
                      if ((i3 == -1) || (i3 <= c))
                      {
                        float f = p;
                        if ((f == -1.0F) || (f <= d))
                        {
                          i3 = e;
                          if ((i3 == -1) || (i3 <= e))
                          {
                            i7 = 1;
                            break label1037;
                          }
                        }
                      }
                    }
                  }
                  i7 = 0;
                  label1037:
                  if ((i7 != 0) || (f))
                  {
                    if (i7 != 0) {
                      i2 = 2;
                    } else {
                      i2 = 1;
                    }
                    bool1 = a(localObject11[m], false);
                    i3 = i2;
                    if (bool1) {
                      i3 = i2 + 1000;
                    }
                    if (i3 > i5) {
                      i2 = 1;
                    } else {
                      i2 = 0;
                    }
                    if (i3 == i5)
                    {
                      i2 = c(e, i12);
                      if ((r) && (i2 != 0)) {
                        if (i2 >= 0) {}
                      }
                      for (;;)
                      {
                        i2 = 1;
                        break;
                        do
                        {
                          do
                          {
                            i2 = 0;
                            break label1221;
                            i2 = ((bw)localObject7).a();
                            if (i2 != i6) {
                              i2 = c(i2, i6);
                            } else {
                              i2 = c(e, i12);
                            }
                            if ((!bool1) || (i7 == 0)) {
                              break;
                            }
                          } while (i2 <= 0);
                          break;
                        } while (i2 >= 0);
                      }
                    }
                    label1221:
                    if (i2 != 0)
                    {
                      i12 = e;
                      i6 = ((bw)localObject7).a();
                      localObject3 = localObject1;
                      i4 = m;
                      i5 = i3;
                    }
                  }
                }
              }
              i1++;
            }
            if (localObject3 == null) {
              localObject3 = null;
            } else {
              localObject3 = new tb((od)localObject3, new int[] { i4 });
            }
          }
          localObject6[n] = localObject3;
          if (localObject3 != null) {
            m = 1;
          } else {
            m = 0;
          }
          localObject3 = localObject6;
        }
        else
        {
          i4 = i;
          i = j;
          j = n;
          n = k;
          k = i4;
        }
        localObject1 = paramsz;
        if (bb > 0) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        i4 = j | i4;
        j = n;
        n = i4;
      }
      else
      {
        i4 = i;
        i = j;
        j = k;
        k = i4;
      }
      i4 = j + 1;
      j = i;
      i = k;
      k = i4;
    }
    Object localObject5 = localObject1;
    k = 0;
    m = -1;
    localObject1 = null;
    paramArrayOfInt1 = null;
    int i4 = j;
    j = m;
    Object localObject6 = localObject2;
    while (k < i4)
    {
      if (1 == ((sz)localObject5).a(k))
      {
        localObject4 = ((sz)localObject5).b(k);
        localObject10 = paramArrayOfInt[k];
        localObject11 = null;
        i3 = 0;
        i2 = -1;
        for (m = -1; i3 < b; m = i1)
        {
          localObject5 = ((of)localObject4).a(i3);
          localObject7 = localObject10[i3];
          i1 = m;
          i5 = 0;
          m = i2;
          for (i2 = i5; i2 < a; i2++) {
            if (a(localObject7[i2], t))
            {
              localObject2 = new sr(((od)localObject5).a(i2), (su)localObject6, localObject7[i2]);
              if (((a) || (n)) && ((localObject11 == null) || (((sr)localObject2).a((sr)localObject11) > 0)))
              {
                m = i3;
                i1 = i2;
                localObject11 = localObject2;
              }
            }
          }
          i3++;
          i2 = m;
        }
        localObject5 = localObject1;
        if (i2 == -1)
        {
          m = j;
          localObject1 = null;
          j = k;
        }
        else
        {
          localObject4 = ((of)localObject4).a(i2);
          if ((!s) && (!r) && ((n ^ 0x1) != 0))
          {
            localObject7 = localObject10[i2];
            i12 = m;
            boolean bool2 = o;
            boolean bool3 = p;
            bool1 = q;
            localObject8 = new HashSet();
            i2 = 0;
            i1 = 0;
            for (localObject1 = null; i1 < a; localObject1 = localObject2)
            {
              localObject2 = ((od)localObject4).a(i1);
              localObject10 = new ss(t, u, i);
              i5 = i2;
              localObject2 = localObject1;
              if (((HashSet)localObject8).add(localObject10))
              {
                i5 = 0;
                for (i3 = 0; i5 < a; i3 = i6)
                {
                  i6 = i3;
                  if (a(((od)localObject4).a(i5), localObject7[i5], (ss)localObject10, i12, bool2, bool3, bool1)) {
                    i6 = i3 + 1;
                  }
                  i5++;
                }
                i5 = i2;
                localObject2 = localObject1;
                if (i3 > i2)
                {
                  localObject2 = localObject10;
                  i5 = i3;
                }
              }
              i1++;
              i2 = i5;
            }
            if (i2 > 1)
            {
              rp.a(localObject1);
              localObject10 = new int[i2];
              i1 = 0;
              for (i3 = 0;; i3 = i2)
              {
                localObject2 = localObject10;
                if (i1 >= a) {
                  break;
                }
                i2 = i3;
                if (a(((od)localObject4).a(i1), localObject7[i1], (ss)localObject1, i12, bool2, bool3, bool1))
                {
                  localObject10[i3] = i1;
                  i2 = i3 + 1;
                }
                i1++;
              }
            }
            localObject2 = a;
            i3 = k;
            i2 = j;
            localObject1 = paramArrayOfInt1;
            if (localObject2.length > 0)
            {
              localObject1 = new tb((od)localObject4, (int[])localObject2);
              break label2084;
            }
          }
          else
          {
            localObject1 = paramArrayOfInt1;
            i2 = j;
            i3 = k;
          }
          localObject2 = null;
          paramArrayOfInt1 = (int[])localObject1;
          j = i2;
          k = i3;
          localObject1 = localObject2;
          label2084:
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new tb((od)localObject4, new int[] { m });
          }
          localObject1 = Pair.create(localObject2, (sr)rp.a(localObject11));
          m = j;
          j = k;
        }
        if ((localObject1 != null) && ((paramArrayOfInt1 == null) || (((sr)second).a(paramArrayOfInt1) > 0)))
        {
          if (m != -1) {
            localObject3[m] = null;
          }
          paramArrayOfInt1 = (tb)first;
          localObject3[j] = paramArrayOfInt1;
          paramArrayOfInt1 = a.a(b[0]).y;
          localObject5 = (sr)second;
          m = j;
          localObject1 = paramArrayOfInt1;
          paramArrayOfInt1 = (int[])localObject5;
          break label2275;
        }
        k = m;
        localObject1 = paramArrayOfInt1;
        paramArrayOfInt1 = (int[])localObject5;
      }
      else
      {
        m = k;
        k = j;
        localObject5 = paramArrayOfInt1;
        j = m;
        paramArrayOfInt1 = (int[])localObject1;
        localObject1 = localObject5;
      }
      localObject5 = localObject1;
      localObject1 = paramArrayOfInt1;
      paramArrayOfInt1 = (int[])localObject5;
      m = k;
      label2275:
      k = j + 1;
      localObject5 = paramsz;
      j = m;
    }
    paramArrayOfInt1 = (int[])localObject6;
    j = i4;
    k = 0;
    localObject2 = null;
    i4 = -1;
    while (k < j)
    {
      n = paramsz.a(k);
      if ((n != 1) && (n != 2))
      {
        if (n != 3)
        {
          localObject11 = paramsz.b(k);
          localObject4 = paramArrayOfInt[k];
          localObject6 = null;
          i3 = 0;
          i5 = 0;
          i1 = 0;
          n = j;
          while (i3 < b)
          {
            localObject10 = ((of)localObject11).a(i3);
            localObject7 = localObject4[i3];
            j = 0;
            localObject5 = localObject6;
            localObject6 = localObject11;
            i2 = n;
            while (j < a)
            {
              if (a(localObject7[j], t))
              {
                if ((ac & 0x1) != 0) {
                  n = 1;
                } else {
                  n = 0;
                }
                if (n != 0) {
                  m = 2;
                } else {
                  m = 1;
                }
                n = m;
                if (a(localObject7[j], false)) {
                  n = m + 1000;
                }
                m = i1;
                if (n > i1)
                {
                  localObject5 = localObject10;
                  i5 = j;
                  m = n;
                }
              }
              else
              {
                m = i1;
              }
              j++;
              i1 = m;
            }
            i3++;
            n = i2;
            localObject11 = localObject6;
            localObject6 = localObject5;
          }
          if (localObject6 == null) {
            localObject6 = null;
          } else {
            localObject6 = new tb((od)localObject6, new int[] { i5 });
          }
          localObject3[k] = localObject6;
          localObject6 = paramArrayOfInt1;
        }
        else
        {
          localObject4 = paramsz.b(k);
          localObject10 = paramArrayOfInt[k];
          i3 = 0;
          localObject6 = null;
          localObject11 = null;
          n = -1;
          localObject5 = localObject1;
          localObject1 = localObject10;
          while (i3 < b)
          {
            localObject8 = ((of)localObject4).a(i3);
            Object localObject12 = localObject1[i3];
            localObject7 = localObject11;
            localObject11 = localObject6;
            m = 0;
            localObject10 = localObject5;
            localObject6 = localObject7;
            localObject5 = localObject11;
            localObject11 = localObject4;
            while (m < a)
            {
              if (a(localObject12[m], t))
              {
                localObject9 = new sx(((od)localObject8).a(m), paramArrayOfInt1, localObject12[m], (String)localObject10);
                localObject4 = localObject5;
                localObject7 = localObject6;
                i2 = n;
                if (a) {
                  if (localObject6 != null)
                  {
                    localObject4 = localObject5;
                    localObject7 = localObject6;
                    i2 = n;
                    if (((sx)localObject9).a((sx)localObject6) <= 0) {}
                  }
                  else
                  {
                    i2 = m;
                    localObject4 = localObject8;
                    localObject7 = localObject9;
                  }
                }
              }
              else
              {
                i2 = n;
                localObject7 = localObject6;
                localObject4 = localObject5;
              }
              m++;
              localObject5 = localObject4;
              localObject6 = localObject7;
              n = i2;
            }
            i3++;
            localObject7 = localObject5;
            localObject5 = localObject6;
            localObject4 = localObject11;
            localObject6 = localObject7;
            localObject11 = localObject5;
            localObject5 = localObject10;
          }
          if (localObject6 == null) {
            localObject11 = null;
          } else {
            localObject11 = Pair.create(new tb((od)localObject6, new int[] { n }), (sx)rp.a(localObject11));
          }
          localObject1 = localObject5;
          localObject6 = paramArrayOfInt1;
          n = j;
          if (localObject11 != null) {
            if (localObject2 != null)
            {
              localObject1 = localObject5;
              localObject6 = paramArrayOfInt1;
              n = j;
              if (((sx)second).a((sx)localObject2) <= 0) {}
            }
            else
            {
              if (i4 != -1) {
                localObject3[i4] = null;
              }
              localObject3[k] = ((tb)first);
              localObject2 = (sx)second;
              i4 = k;
              localObject1 = localObject5;
              break label3006;
            }
          }
        }
      }
      else
      {
        n = j;
        localObject6 = paramArrayOfInt1;
      }
      j = n;
      paramArrayOfInt1 = (int[])localObject6;
      label3006:
      k++;
    }
    label3118:
    for (j = 0; j < i; j++)
    {
      if (paramArrayOfInt1.a(j)) {}
      do
      {
        localObject1 = null;
        break;
        localObject1 = paramsz.b(j);
        if (!paramArrayOfInt1.a(j, (of)localObject1)) {
          break label3118;
        }
        localObject6 = paramArrayOfInt1.b(j, (of)localObject1);
      } while (localObject6 == null);
      localObject1 = new tb(((of)localObject1).a(a), b, c, Integer.valueOf(d));
      localObject3[j] = localObject1;
    }
    localObject6 = b.a((tb[])localObject3, a());
    localObject1 = new cl[i];
    for (j = 0; j < i; j++)
    {
      if ((!paramArrayOfInt1.a(j)) && ((paramsz.a(j) == 6) || (localObject6[j] != null))) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        localObject3 = cl.a;
      } else {
        localObject3 = null;
      }
      localObject1[j] = localObject3;
    }
    m = u;
    if (m != 0)
    {
      j = 0;
      k = -1;
      i = -1;
      while (j < paramsz.a())
      {
        i4 = paramsz.a(j);
        paramArrayOfInt1 = localObject6[j];
        if (i4 != 1) {
          if (i4 != 2) {
            break label3404;
          }
        }
        if (paramArrayOfInt1 != null)
        {
          localObject3 = paramArrayOfInt[j];
          i3 = paramsz.b(j).a(paramArrayOfInt1.f());
          for (n = 0; n < paramArrayOfInt1.g(); n++) {
            if ((localObject3[i3][paramArrayOfInt1.b(n)] & 0x20) != 32)
            {
              n = 0;
              break label3358;
            }
          }
          n = 1;
          label3358:
          if (n != 0)
          {
            if (i4 == 1)
            {
              if (k == -1)
              {
                k = j;
                break label3404;
              }
            }
            else {
              if (i == -1) {
                break label3397;
              }
            }
            j = 0;
            break label3413;
            label3397:
            i = j;
          }
        }
        label3404:
        j++;
      }
      j = 1;
      label3413:
      if ((k != -1) && (i != -1)) {
        n = 1;
      } else {
        n = 0;
      }
      if ((j & n) != 0)
      {
        paramsz = new cl(m);
        localObject1[k] = paramsz;
        localObject1[i] = paramsz;
      }
    }
    return Pair.create(localObject1, localObject6);
  }
  
  public static final class a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new sv();
    public final int a;
    public final int[] b;
    public final int c;
    public final int d;
    private final int e;
    
    public a(Parcel paramParcel)
    {
      a = paramParcel.readInt();
      int i = paramParcel.readByte();
      e = i;
      int[] arrayOfInt = new int[i];
      b = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
      c = paramParcel.readInt();
      d = paramParcel.readInt();
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((a == a) && (Arrays.equals(b, b)) && (c == c) && (d == d)) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = a;
      return ((Arrays.hashCode(b) + i * 31) * 31 + c) * 31 + d;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(a);
      paramParcel.writeInt(b.length);
      paramParcel.writeIntArray(b);
      paramParcel.writeInt(c);
      paramParcel.writeInt(d);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */