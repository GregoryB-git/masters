package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z2;

public final class hm
  implements fw
{
  private static final byte[] a = { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
  private static final bw b = bw.a(null, "application/x-emsg", Long.MAX_VALUE);
  private long A;
  private long B;
  private ho C;
  private int D;
  private int E;
  private int F;
  private boolean G;
  private boolean H;
  private fy I;
  private gi[] J;
  private gi[] K;
  private boolean L;
  private final int c;
  private final hz d;
  private final List<bw> e;
  private final fe f;
  private final SparseArray<ho> g;
  private final vy h;
  private final vy i;
  private final vy j;
  private final byte[] k;
  private final vy l;
  private final wi m;
  private final ki n;
  private final vy o;
  private final ArrayDeque<hd> p;
  private final ArrayDeque<hp> q;
  private final gi r;
  private int s;
  private int t;
  private long u;
  private int v;
  private vy w;
  private long x;
  private int y;
  private long z;
  
  public hm()
  {
    this(0);
  }
  
  private hm(int paramInt)
  {
    this(0, null);
  }
  
  private hm(int paramInt, wi paramwi)
  {
    this(paramInt, null, null, null);
  }
  
  private hm(int paramInt, wi paramwi, hz paramhz, fe paramfe)
  {
    this(paramInt, paramwi, null, null, Collections.emptyList());
  }
  
  public hm(int paramInt, wi paramwi, hz paramhz, fe paramfe, List<bw> paramList)
  {
    this(paramInt, paramwi, paramhz, paramfe, paramList, null);
  }
  
  public hm(int paramInt, wi paramwi, hz paramhz, fe paramfe, List<bw> paramList, gi paramgi)
  {
    int i1;
    if (paramhz != null) {
      i1 = 8;
    } else {
      i1 = 0;
    }
    c = (paramInt | i1);
    m = paramwi;
    d = paramhz;
    f = paramfe;
    e = Collections.unmodifiableList(paramList);
    r = paramgi;
    n = new ki();
    o = new vy(16);
    h = new vy(vu.a);
    i = new vy(5);
    j = new vy();
    paramwi = new byte[16];
    k = paramwi;
    l = new vy(paramwi);
    p = new ArrayDeque();
    q = new ArrayDeque();
    g = new SparseArray();
    A = -9223372036854775807L;
    z = -9223372036854775807L;
    B = -9223372036854775807L;
    a();
  }
  
  private static fe a(List<hc> paramList)
  {
    int i1 = paramList.size();
    int i2 = 0;
    Object localObject3;
    for (Object localObject1 = null; i2 < i1; localObject1 = localObject3)
    {
      Object localObject2 = (hc)paramList.get(i2);
      localObject3 = localObject1;
      if (a == 1886614376)
      {
        localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = new ArrayList();
        }
        localObject1 = b.a;
        localObject2 = hu.a((byte[])localObject1);
        if (localObject2 == null) {
          Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        } else {
          ((ArrayList)localObject3).add(new fe.a((UUID)localObject2, "video/mp4", (byte[])localObject1));
        }
      }
      i2++;
    }
    if (localObject1 == null) {
      return null;
    }
    return new fe((List)localObject1);
  }
  
  private static hl a(SparseArray<hl> paramSparseArray, int paramInt)
  {
    if (paramSparseArray.size() == 1) {
      return (hl)paramSparseArray.valueAt(0);
    }
    return (hl)rp.a((hl)paramSparseArray.get(paramInt));
  }
  
  private final void a()
  {
    s = 0;
    v = 0;
  }
  
  private final void a(long paramLong)
    throws ce
  {
    Object localObject1 = this;
    while ((!p.isEmpty()) && (p.peek()).b == paramLong))
    {
      Object localObject2 = (hd)p.pop();
      int i1 = a;
      int i2 = 8;
      boolean bool;
      Object localObject3;
      Object localObject4;
      SparseArray localSparseArray;
      int i3;
      long l1;
      Object localObject5;
      int i4;
      Object localObject6;
      if (i1 == 1836019574)
      {
        if (d == null) {
          bool = true;
        } else {
          bool = false;
        }
        rp.b(bool, "Unexpected moov box.");
        localObject3 = f;
        if (localObject3 == null) {
          localObject3 = a(c);
        }
        localObject4 = ((hd)localObject2).d(1836475768);
        localSparseArray = new SparseArray();
        i3 = c.size();
        i1 = 0;
        l1 = -9223372036854775807L;
        while (i1 < i3)
        {
          localObject5 = (hc)c.get(i1);
          i4 = a;
          if (i4 == 1953654136)
          {
            localObject5 = b;
            ((vy)localObject5).c(12);
            localObject5 = Pair.create(Integer.valueOf(((vy)localObject5).l()), new hl(((vy)localObject5).p() - 1, ((vy)localObject5).p(), ((vy)localObject5).p(), ((vy)localObject5).l()));
            localSparseArray.put(((Integer)first).intValue(), (hl)second);
          }
          else if (i4 == 1835362404)
          {
            localObject5 = b;
            ((vy)localObject5).c(8);
            if (ha.a(((vy)localObject5).l()) == 0) {
              l1 = ((vy)localObject5).j();
            } else {
              l1 = ((vy)localObject5).q();
            }
          }
          i1++;
        }
        localObject4 = new SparseArray();
        i3 = d.size();
        for (i1 = 0; i1 < i3; i1++)
        {
          localObject6 = (hd)d.get(i1);
          if (a == 1953653099)
          {
            localObject5 = ((hd)localObject2).c(1836476516);
            if ((c & 0x10) != 0) {
              bool = true;
            } else {
              bool = false;
            }
            localObject5 = hf.a((hd)localObject6, (hc)localObject5, l1, (fe)localObject3, bool, false);
            if (localObject5 != null) {
              ((SparseArray)localObject4).put(a, localObject5);
            }
          }
        }
        i3 = ((SparseArray)localObject4).size();
        if (g.size() == 0)
        {
          for (i1 = 0; i1 < i3; i1++)
          {
            localObject3 = (hz)((SparseArray)localObject4).valueAt(i1);
            localObject2 = new ho(I.a(i1, b));
            ((ho)localObject2).a((hz)localObject3, a(localSparseArray, a));
            g.put(a, localObject2);
            A = Math.max(A, e);
          }
          b();
          I.a();
        }
        else
        {
          if (g.size() == i3) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          for (i1 = 0; i1 < i3; i1++)
          {
            localObject3 = (hz)((SparseArray)localObject4).valueAt(i1);
            ((ho)g.get(a)).a((hz)localObject3, a(localSparseArray, a));
          }
        }
      }
      else if (i1 == 1836019558)
      {
        localSparseArray = g;
        i3 = c;
        localObject3 = k;
        i4 = d.size();
        i1 = 0;
        localObject4 = localObject1;
        while (i1 < i4)
        {
          localObject4 = (hd)d.get(i1);
          if (a == 1953653094)
          {
            localObject5 = c1952868452b;
            ((vy)localObject5).c(i2);
            int i5 = ((vy)localObject5).l() & 0xFFFFFF;
            i6 = ((vy)localObject5).l();
            if (localSparseArray.size() == 1) {
              localObject1 = (ho)localSparseArray.valueAt(0);
            } else {
              localObject1 = (ho)localSparseArray.get(i6);
            }
            int i8;
            if (localObject1 == null)
            {
              localObject1 = null;
            }
            else
            {
              if ((i5 & 0x1) != 0)
              {
                l1 = ((vy)localObject5).q();
                localObject6 = b;
                b = l1;
                c = l1;
              }
              localObject6 = d;
              if ((i5 & 0x2) != 0) {
                i6 = ((vy)localObject5).p() - 1;
              } else {
                i6 = a;
              }
              if ((i5 & 0x8) != 0) {
                i7 = ((vy)localObject5).p();
              } else {
                i7 = b;
              }
              if ((i5 & 0x10) != 0) {
                i8 = ((vy)localObject5).p();
              } else {
                i8 = c;
              }
              if ((i5 & 0x20) != 0) {
                i5 = ((vy)localObject5).p();
              } else {
                i5 = d;
              }
              b.a = new hl(i6, i7, i8, i5);
            }
            if (localObject1 != null)
            {
              Object localObject7 = b;
              long l2 = r;
              ((ho)localObject1).a();
              l1 = l2;
              if (((hd)localObject4).c(1952867444) != null)
              {
                l1 = l2;
                if ((i3 & 0x2) == 0)
                {
                  localObject5 = c1952867444b;
                  ((vy)localObject5).c(i2);
                  if (ha.a(((vy)localObject5).l()) == 1) {
                    l1 = ((vy)localObject5).q();
                  } else {
                    l1 = ((vy)localObject5).j();
                  }
                }
              }
              localObject5 = c;
              int i9 = ((List)localObject5).size();
              i8 = 0;
              i6 = 0;
              for (i2 = 0; i6 < i9; i2 = i7)
              {
                localObject6 = (hc)((List)localObject5).get(i6);
                i5 = i8;
                i7 = i2;
                if (a == 1953658222)
                {
                  localObject6 = b;
                  ((vy)localObject6).c(12);
                  i10 = ((vy)localObject6).p();
                  i5 = i8;
                  i7 = i2;
                  if (i10 > 0)
                  {
                    i5 = i8 + i10;
                    i7 = i2 + 1;
                  }
                }
                i6++;
                i8 = i5;
              }
              int i10 = i4;
              g = 0;
              f = 0;
              e = 0;
              localObject6 = b;
              d = i2;
              e = i8;
              Object localObject8 = g;
              if ((localObject8 == null) || (localObject8.length < i2))
              {
                f = new long[i2];
                g = new int[i2];
              }
              localObject8 = h;
              if ((localObject8 == null) || (localObject8.length < i8))
              {
                i4 = i8 * 125 / 100;
                h = new int[i4];
                i = new int[i4];
                j = new long[i4];
                k = new boolean[i4];
                m = new boolean[i4];
              }
              int i11 = 0;
              int i12 = 0;
              i4 = 0;
              localObject6 = localObject1;
              localObject1 = localObject7;
              while (i11 < i9)
              {
                localObject7 = (hc)((List)localObject5).get(i11);
                if (a == 1953658222)
                {
                  localObject7 = b;
                  ((vy)localObject7).c(8);
                  i5 = ((vy)localObject7).l() & 0xFFFFFF;
                  hz localhz = c;
                  ib localib = b;
                  localObject8 = a;
                  g[i12] = ((vy)localObject7).p();
                  Object localObject9 = f;
                  l2 = b;
                  localObject9[i12] = l2;
                  if ((i5 & 0x1) != 0) {
                    localObject9[i12] = (l2 + ((vy)localObject7).l());
                  }
                  if ((i5 & 0x4) != 0) {
                    i6 = 1;
                  } else {
                    i6 = 0;
                  }
                  i2 = d;
                  if (i6 != 0) {
                    i2 = ((vy)localObject7).p();
                  }
                  if ((i5 & 0x100) != 0) {
                    i7 = 1;
                  } else {
                    i7 = 0;
                  }
                  int i13;
                  if ((i5 & 0x200) != 0) {
                    i13 = 1;
                  } else {
                    i13 = 0;
                  }
                  if ((i5 & 0x400) != 0) {
                    i8 = 1;
                  } else {
                    i8 = 0;
                  }
                  if ((i5 & 0x800) != 0) {
                    i5 = 1;
                  } else {
                    i5 = 0;
                  }
                  localObject9 = h;
                  if (localObject9 != null) {
                    if ((localObject9.length == 1) && (localObject9[0] == 0L))
                    {
                      l3 = wl.c(i[0], 1000L, c);
                      break label1681;
                    }
                  }
                  long l3 = 0L;
                  label1681:
                  int i14 = i8;
                  localObject9 = h;
                  int[] arrayOfInt = i;
                  long[] arrayOfLong = j;
                  boolean[] arrayOfBoolean = k;
                  int i15;
                  if ((b == 2) && ((i3 & 0x1) != 0)) {
                    i15 = 1;
                  } else {
                    i15 = 0;
                  }
                  int i16 = g[i12] + i4;
                  long l4 = c;
                  int i17;
                  if (i12 > 0)
                  {
                    i8 = i4;
                    l2 = r;
                    i17 = i6;
                    i4 = i16;
                  }
                  else
                  {
                    l2 = l1;
                    i8 = i4;
                    i4 = i16;
                    i17 = i6;
                  }
                  while (i8 < i4)
                  {
                    if (i7 != 0) {
                      i16 = ((vy)localObject7).p();
                    } else {
                      i16 = b;
                    }
                    int i18;
                    if (i13 != 0) {
                      i18 = ((vy)localObject7).p();
                    } else {
                      i18 = c;
                    }
                    if ((i8 == 0) && (i17 != 0)) {
                      i6 = i2;
                    } else if (i14 != 0) {
                      i6 = ((vy)localObject7).l();
                    } else {
                      i6 = d;
                    }
                    if (i5 != 0) {
                      arrayOfInt[i8] = ((int)(((vy)localObject7).l() * 1000L / l4));
                    } else {
                      arrayOfInt[i8] = 0;
                    }
                    arrayOfLong[i8] = (wl.c(l2, 1000L, l4) - l3);
                    localObject9[i8] = i18;
                    if (((i6 >> 16 & 0x1) == 0) && ((i15 == 0) || (i8 == 0))) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    arrayOfBoolean[i8] = bool;
                    l2 += i16;
                    i8++;
                  }
                  r = l2;
                  i12++;
                }
                i11++;
              }
              localObject5 = localObject2;
              i4 = i3;
              i2 = i1;
              localObject2 = c.a(a.a);
              localObject6 = ((hd)localObject4).c(1935763834);
              if (localObject6 != null)
              {
                localObject6 = b;
                i8 = d;
                ((vy)localObject6).c(8);
                if ((((vy)localObject6).l() & 0xFFFFFF & 0x1) == 1) {
                  ((vy)localObject6).d(8);
                }
                i1 = ((vy)localObject6).e();
                i7 = ((vy)localObject6).p();
                if (i7 == e)
                {
                  if (i1 == 0)
                  {
                    localObject7 = m;
                    i3 = 0;
                    i1 = 0;
                    for (;;)
                    {
                      i6 = i1;
                      if (i3 >= i7) {
                        break;
                      }
                      i6 = ((vy)localObject6).e();
                      i1 += i6;
                      if (i6 > i8) {
                        bool = true;
                      } else {
                        bool = false;
                      }
                      localObject7[i3] = bool;
                      i3++;
                    }
                  }
                  if (i1 > i8) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  i6 = i1 * i7 + 0;
                  Arrays.fill(m, 0, i7, bool);
                  ((ib)localObject1).a(i6);
                }
                else
                {
                  i1 = e;
                  localObject3 = new StringBuilder(41);
                  ((StringBuilder)localObject3).append("Length mismatch: ");
                  ((StringBuilder)localObject3).append(i7);
                  ((StringBuilder)localObject3).append(", ");
                  ((StringBuilder)localObject3).append(i1);
                  throw new ce(((StringBuilder)localObject3).toString());
                }
              }
              localObject6 = ((hd)localObject4).c(1935763823);
              if (localObject6 != null)
              {
                localObject6 = b;
                ((vy)localObject6).c(8);
                i1 = ((vy)localObject6).l();
                if ((0xFFFFFF & i1 & 0x1) == 1) {
                  ((vy)localObject6).d(8);
                }
                i3 = ((vy)localObject6).p();
                if (i3 == 1)
                {
                  i1 = ha.a(i1);
                  l2 = c;
                  if (i1 == 0) {
                    l1 = ((vy)localObject6).j();
                  } else {
                    l1 = ((vy)localObject6).q();
                  }
                  c = (l2 + l1);
                }
                else
                {
                  throw new ce(z2.k(40, "Unexpected saio entry count: ", i3));
                }
              }
              localObject6 = ((hd)localObject4).c(1936027235);
              if (localObject6 != null) {
                a(b, 0, (ib)localObject1);
              }
              localObject6 = ((hd)localObject4).c(1935828848);
              localObject7 = ((hd)localObject4).c(1936158820);
              if ((localObject6 != null) && (localObject7 != null))
              {
                localObject6 = b;
                localObject7 = b;
                if (localObject2 != null) {
                  localObject2 = b;
                } else {
                  localObject2 = null;
                }
                ((vy)localObject6).c(8);
                i1 = ((vy)localObject6).l();
                if (((vy)localObject6).l() == 1936025959)
                {
                  if (ha.a(i1) == 1) {
                    ((vy)localObject6).d(4);
                  }
                  if (((vy)localObject6).l() == 1)
                  {
                    ((vy)localObject7).c(8);
                    i1 = ((vy)localObject7).l();
                    if (((vy)localObject7).l() == 1936025959)
                    {
                      i1 = ha.a(i1);
                      if (i1 == 1)
                      {
                        if (((vy)localObject7).j() == 0L) {
                          throw new ce("Variable length description in sgpd found (unsupported)");
                        }
                      }
                      else if (i1 >= 2) {
                        ((vy)localObject7).d(4);
                      }
                      if (((vy)localObject7).j() == 1L)
                      {
                        ((vy)localObject7).d(1);
                        i3 = ((vy)localObject7).e();
                        if (((vy)localObject7).e() == 1) {
                          i1 = 1;
                        } else {
                          i1 = 0;
                        }
                        if (i1 != 0)
                        {
                          i6 = ((vy)localObject7).e();
                          localObject8 = new byte[16];
                          ((vy)localObject7).a((byte[])localObject8, 0, 16);
                          if (i6 == 0)
                          {
                            i1 = ((vy)localObject7).e();
                            localObject6 = new byte[i1];
                            ((vy)localObject7).a((byte[])localObject6, 0, i1);
                          }
                          else
                          {
                            localObject6 = null;
                          }
                          l = true;
                          n = new hy(true, (String)localObject2, i6, (byte[])localObject8, (i3 & 0xF0) >> 4, i3 & 0xF, (byte[])localObject6);
                        }
                      }
                      else
                      {
                        throw new ce("Entry count in sgpd != 1 (unsupported).");
                      }
                    }
                  }
                  else
                  {
                    throw new ce("Entry count in sbgp != 1 (unsupported).");
                  }
                }
              }
              i3 = c.size();
              for (i1 = 0; i1 < i3; i1++)
              {
                localObject2 = (hc)c.get(i1);
                if (a == 1970628964)
                {
                  localObject6 = b;
                  ((vy)localObject6).c(8);
                  localObject2 = localObject3;
                  ((vy)localObject6).a((byte[])localObject2, 0, 16);
                  if (Arrays.equals((byte[])localObject2, a)) {
                    a((vy)localObject6, 16, (ib)localObject1);
                  }
                }
              }
              i6 = 8;
              localObject2 = localObject3;
              i3 = i10;
              localObject3 = localObject5;
              i7 = i2;
              i1 = i4;
              break label2981;
            }
          }
          int i6 = i3;
          i3 = i4;
          int i7 = i1;
          localObject1 = localObject3;
          i1 = i6;
          localObject3 = localObject2;
          localObject2 = localObject1;
          i6 = i2;
          label2981:
          localObject1 = localObject2;
          i4 = i3;
          i7++;
          localObject4 = this;
          localObject2 = localObject3;
          i3 = i1;
          localObject3 = localObject1;
          i2 = i6;
          i1 = i7;
        }
        i3 = 0;
        if (f != null) {
          localObject3 = null;
        } else {
          localObject3 = a(c);
        }
        if (localObject3 != null)
        {
          i4 = g.size();
          for (i1 = 0; i1 < i4; i1++)
          {
            localObject1 = (ho)g.valueAt(i1);
            localObject2 = c.a(b.a.a);
            if (localObject2 != null) {
              localObject2 = b;
            } else {
              localObject2 = null;
            }
            a.a(c.f.a(((fe)localObject3).a((String)localObject2)));
          }
        }
        localObject1 = localObject4;
        if (z != -9223372036854775807L)
        {
          i4 = g.size();
          for (i1 = i3; i1 < i4; i1++)
          {
            localObject2 = (ho)g.valueAt(i1);
            l1 = av.a(z);
            for (i3 = e;; i3++)
            {
              localObject3 = b;
              if ((i3 >= e) || (((ib)localObject3).b(i3) >= l1)) {
                break;
              }
              if (b.k[i3] != 0) {
                h = i3;
              }
            }
          }
          z = -9223372036854775807L;
          localObject1 = localObject4;
        }
      }
      else if (!p.isEmpty())
      {
        ((hd)p.peek()).a((hd)localObject2);
      }
    }
    a();
  }
  
  private static void a(vy paramvy, int paramInt, ib paramib)
    throws ce
  {
    paramvy.c(paramInt + 8);
    paramInt = paramvy.l() & 0xFFFFFF;
    if ((paramInt & 0x1) == 0)
    {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      int i1 = paramvy.p();
      if (i1 == e)
      {
        Arrays.fill(m, 0, i1, bool);
        paramib.a(paramvy.b());
        paramvy.a(p.a, 0, o);
        p.c(0);
        q = false;
        return;
      }
      paramInt = e;
      paramvy = new StringBuilder(41);
      paramvy.append("Length mismatch: ");
      paramvy.append(i1);
      paramvy.append(", ");
      paramvy.append(paramInt);
      throw new ce(paramvy.toString());
    }
    throw new ce("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  private final void b()
  {
    Object localObject = J;
    int i1 = 0;
    int i2;
    if (localObject == null)
    {
      localObject = new gi[2];
      J = ((gi[])localObject);
      gi localgi = r;
      if (localgi != null)
      {
        localObject[0] = localgi;
        i2 = 1;
      }
      else
      {
        i2 = 0;
      }
      int i3 = i2;
      if ((c & 0x4) != 0)
      {
        localObject[i2] = I.a(g.size(), 4);
        i3 = i2 + 1;
      }
      localObject = (gi[])Arrays.copyOf(J, i3);
      J = ((gi[])localObject);
      i3 = localObject.length;
      for (i2 = 0; i2 < i3; i2++) {
        localObject[i2].a(b);
      }
    }
    if (K == null)
    {
      K = new gi[e.size()];
      for (i2 = i1; i2 < K.length; i2++)
      {
        localObject = I.a(g.size() + 1 + i2, 3);
        ((gi)localObject).a((bw)e.get(i2));
        K[i2] = localObject;
      }
    }
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    paramgf = paramfz;
    int i1;
    label2272:
    do
    {
      int i2;
      long l1;
      Object localObject2;
      long l2;
      for (;;)
      {
        i1 = s;
        i2 = 1;
        if (i1 == 0) {
          break;
        }
        Object localObject1;
        int i3;
        Object localObject3;
        Object localObject5;
        long l3;
        if (i1 != 1)
        {
          l1 = Long.MAX_VALUE;
          if (i1 != 2)
          {
            int i4;
            Object localObject4;
            if (i1 == 3)
            {
              if (C == null)
              {
                localObject1 = g;
                i3 = ((SparseArray)localObject1).size();
                localObject2 = null;
                i1 = 0;
                while (i1 < i3)
                {
                  localObject3 = (ho)((SparseArray)localObject1).valueAt(i1);
                  i4 = g;
                  localObject4 = b;
                  l2 = l1;
                  localObject5 = localObject2;
                  if (i4 != d)
                  {
                    l3 = f[i4];
                    l2 = l1;
                    localObject5 = localObject2;
                    if (l3 < l1)
                    {
                      localObject5 = localObject3;
                      l2 = l3;
                    }
                  }
                  i1++;
                  l1 = l2;
                  localObject2 = localObject5;
                }
                if (localObject2 == null)
                {
                  i1 = (int)(x - paramfz.c());
                  if (i1 >= 0)
                  {
                    paramgf.b(i1);
                    a();
                    i1 = 0;
                  }
                  else
                  {
                    throw new ce("Offset to end of mdat was negative.");
                  }
                }
                else
                {
                  i3 = (int)(b.f[g] - paramfz.c());
                  i1 = i3;
                  if (i3 < 0)
                  {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    i1 = 0;
                  }
                  paramgf.b(i1);
                  C = ((ho)localObject2);
                }
              }
              else
              {
                localObject5 = C;
                localObject2 = b.h;
                i3 = e;
                i1 = localObject2[i3];
                D = i1;
                if (i3 < h)
                {
                  paramgf.b(i1);
                  ho.a(C);
                  if (!C.b()) {
                    C = null;
                  }
                  s = 3;
                  i1 = i2;
                }
                else
                {
                  if (c.g == 1)
                  {
                    D = (i1 - 8);
                    paramgf.b(8);
                  }
                  i1 = C.c();
                  E = i1;
                  D += i1;
                  s = 4;
                  F = 0;
                  H = "audio/ac4".equals(C.c.f.i);
                }
              }
            }
            else
            {
              localObject2 = C;
              localObject3 = b;
              localObject1 = c;
              localObject5 = a;
              i2 = e;
              l2 = ((ib)localObject3).b(i2) * 1000L;
              localObject2 = m;
              l1 = l2;
              if (localObject2 != null) {
                l1 = ((wi)localObject2).c(l2);
              }
              i3 = j;
              if (i3 != 0)
              {
                localObject4 = i.a;
                localObject4[0] = ((byte)0);
                localObject4[1] = ((byte)0);
                localObject4[2] = ((byte)0);
                i4 = 4 - i3;
                for (;;)
                {
                  localObject2 = paramgf;
                  l2 = l1;
                  if (E >= D) {
                    break;
                  }
                  i1 = F;
                  if (i1 == 0)
                  {
                    paramgf.b((byte[])localObject4, i4, i3 + 1);
                    i.c(0);
                    i1 = i.l();
                    if (i1 > 0)
                    {
                      F = (i1 - 1);
                      h.c(0);
                      ((gi)localObject5).a(h, 4);
                      ((gi)localObject5).a(i, 1);
                      boolean bool;
                      if ((K.length > 0) && (vu.a(f.i, localObject4[4]))) {
                        bool = true;
                      } else {
                        bool = false;
                      }
                      G = bool;
                      E += 5;
                      D += i4;
                    }
                    else
                    {
                      throw new ce("Invalid NAL length");
                    }
                  }
                  else
                  {
                    if (G)
                    {
                      j.a(i1);
                      paramgf.b(j.a, 0, F);
                      ((gi)localObject5).a(j, F);
                      i1 = F;
                      localObject2 = j;
                      int i5 = vu.a(a, ((vy)localObject2).c());
                      j.c("video/hevc".equals(f.i));
                      j.b(i5);
                      rp.a(l1, j, K);
                    }
                    else
                    {
                      i1 = ((gi)localObject5).a(paramgf, i1, false);
                    }
                    E += i1;
                    F -= i1;
                  }
                }
              }
              localObject2 = paramgf;
              l2 = l1;
              if (H)
              {
                de.a(D, l);
                i1 = l.c();
                ((gi)localObject5).a(l, i1);
                D += i1;
                E += i1;
                H = false;
              }
              for (;;)
              {
                l1 = l2;
                paramgf = (gf)localObject2;
                i1 = E;
                i3 = D;
                localObject2 = paramgf;
                l2 = l1;
                if (i1 >= i3) {
                  break;
                }
                i1 = ((gi)localObject5).a(paramgf, i3 - i1, false);
                E += i1;
                localObject2 = paramgf;
                l2 = l1;
              }
              i1 = k[i2];
              paramgf = ho.b(C);
              if (paramgf != null)
              {
                paramgf = c;
                i1 |= 0x40000000;
              }
              else
              {
                paramgf = null;
              }
              ((gi)localObject5).a(l2, i1, D, 0, paramgf);
              while (!q.isEmpty())
              {
                paramgf = (hp)q.removeFirst();
                y -= b;
                l3 = a + l2;
                localObject5 = m;
                l1 = l3;
                if (localObject5 != null) {
                  l1 = ((wi)localObject5).c(l3);
                }
                localObject5 = J;
                i2 = localObject5.length;
                for (i1 = 0; i1 < i2; i1++) {
                  localObject5[i1].a(l1, 1, b, y, null);
                }
              }
              if (!C.b()) {
                C = null;
              }
              s = 3;
              i1 = 1;
              paramgf = (gf)localObject2;
            }
            if (i1 != 0) {
              return 0;
            }
          }
          else
          {
            i2 = g.size();
            i1 = 0;
            localObject2 = null;
            l2 = l1;
            while (i1 < i2)
            {
              localObject3 = g.valueAt(i1)).b;
              l1 = l2;
              localObject5 = localObject2;
              if (q)
              {
                l3 = c;
                l1 = l2;
                localObject5 = localObject2;
                if (l3 < l2)
                {
                  localObject5 = (ho)g.valueAt(i1);
                  l1 = l3;
                }
              }
              i1++;
              l2 = l1;
              localObject2 = localObject5;
            }
            if (localObject2 == null)
            {
              s = 3;
            }
            else
            {
              i1 = (int)(l2 - paramfz.c());
              if (i1 >= 0)
              {
                paramgf.b(i1);
                localObject2 = b;
                paramgf.b(p.a, 0, o);
                p.c(0);
                q = false;
              }
              else
              {
                throw new ce("Offset to encryption data was negative.");
              }
            }
          }
        }
        else
        {
          i1 = (int)u - v;
          localObject2 = w;
          if (localObject2 != null)
          {
            paramgf.b(a, 8, i1);
            localObject2 = new hc(t, w);
            l3 = paramfz.c();
            if (!p.isEmpty())
            {
              ((hd)p.peek()).a((hc)localObject2);
            }
            else
            {
              i1 = a;
              long l5;
              if (i1 == 1936286840)
              {
                localObject1 = b;
                ((vy)localObject1).c(8);
                i1 = ha.a(((vy)localObject1).l());
                ((vy)localObject1).d(4);
                long l4 = ((vy)localObject1).j();
                if (i1 == 0)
                {
                  l1 = ((vy)localObject1).j();
                  l2 = ((vy)localObject1).j();
                }
                else
                {
                  l1 = ((vy)localObject1).q();
                  l2 = ((vy)localObject1).q();
                }
                l2 += l3;
                l5 = wl.c(l1, 1000000L, l4);
                ((vy)localObject1).d(2);
                i1 = ((vy)localObject1).f();
                paramgf = new int[i1];
                localObject3 = new long[i1];
                localObject5 = new long[i1];
                localObject2 = new long[i1];
                l3 = l5;
                i2 = 0;
                while (i2 < i1)
                {
                  i3 = ((vy)localObject1).l();
                  if ((i3 & 0x80000000) == 0)
                  {
                    long l6 = ((vy)localObject1).j();
                    paramgf[i2] = (i3 & 0x7FFFFFFF);
                    localObject3[i2] = l2;
                    localObject2[i2] = l3;
                    l1 += l6;
                    l3 = wl.c(l1, 1000000L, l4);
                    localObject5[i2] = (l3 - localObject2[i2]);
                    ((vy)localObject1).d(4);
                    l2 += paramgf[i2];
                    i2++;
                  }
                  else
                  {
                    throw new ce("Unhandled indirect reference");
                  }
                }
                paramgf = Pair.create(Long.valueOf(l5), new fv(paramgf, (long[])localObject3, (long[])localObject5, (long[])localObject2));
                B = ((Long)first).longValue();
                I.a((ge)second);
                L = true;
              }
              else if (i1 == 1701671783)
              {
                localObject5 = b;
                paramgf = J;
                if ((paramgf != null) && (paramgf.length != 0))
                {
                  ((vy)localObject5).c(8);
                  i1 = ha.a(((vy)localObject5).l());
                  if (i1 != 0)
                  {
                    if (i1 != 1)
                    {
                      paramgf = new StringBuilder(46);
                      paramgf.append("Skipping unsupported emsg version: ");
                      paramgf.append(i1);
                      Log.w("FragmentedMp4Extractor", paramgf.toString());
                      break label2272;
                    }
                    l2 = ((vy)localObject5).j();
                    l1 = wl.c(((vy)localObject5).q(), 1000000L, l2);
                    l2 = wl.c(((vy)localObject5).j(), 1000L, l2);
                    l3 = ((vy)localObject5).j();
                    paramgf = (String)rp.a(((vy)localObject5).r());
                    localObject2 = (String)rp.a(((vy)localObject5).r());
                    l5 = -9223372036854775807L;
                  }
                  else
                  {
                    paramgf = (String)rp.a(((vy)localObject5).r());
                    localObject2 = (String)rp.a(((vy)localObject5).r());
                    l2 = ((vy)localObject5).j();
                    l5 = wl.c(((vy)localObject5).j(), 1000000L, l2);
                    l1 = B;
                    if (l1 != -9223372036854775807L) {
                      l1 += l5;
                    } else {
                      l1 = -9223372036854775807L;
                    }
                    l2 = wl.c(((vy)localObject5).j(), 1000L, l2);
                    l3 = ((vy)localObject5).j();
                  }
                  localObject3 = new byte[((vy)localObject5).b()];
                  ((vy)localObject5).a((byte[])localObject3, 0, ((vy)localObject5).b());
                  paramgf = new kh(paramgf, (String)localObject2, l2, l3, (byte[])localObject3);
                  localObject5 = new vy(n.a(paramgf));
                  i2 = ((vy)localObject5).b();
                  for (paramgf : J)
                  {
                    ((vy)localObject5).c(0);
                    paramgf.a((vy)localObject5, i2);
                  }
                  if (l1 == -9223372036854775807L)
                  {
                    q.addLast(new hp(l5, i2));
                    y += i2;
                  }
                  else
                  {
                    paramgf = m;
                    l2 = l1;
                    if (paramgf != null) {
                      l2 = paramgf.c(l1);
                    }
                    paramgf = J;
                    i3 = paramgf.length;
                    for (i1 = 0; i1 < i3; i1++) {
                      paramgf[i1].a(l2, 1, i2, 0, null);
                    }
                  }
                }
              }
              paramgf = paramfz;
            }
          }
          else
          {
            paramgf.b(i1);
          }
          a(paramfz.c());
        }
      }
      if (v == 0)
      {
        if (!paramgf.a(o.a, 0, 8, true))
        {
          i1 = 0;
        }
        else
        {
          v = 8;
          o.c(0);
          u = o.j();
          t = o.l();
        }
      }
      else
      {
        l1 = u;
        if (l1 == 1L)
        {
          paramgf.b(o.a, 8, 8);
          v += 8;
          u = o.q();
        }
        else if (l1 == 0L)
        {
          l2 = paramfz.d();
          l1 = l2;
          if (l2 == -1L)
          {
            l1 = l2;
            if (!p.isEmpty()) {
              l1 = p.peek()).b;
            }
          }
          if (l1 != -1L) {
            u = (l1 - paramfz.c() + v);
          }
        }
        if (u < v) {
          break label3107;
        }
        l1 = paramfz.c() - v;
        if (t == 1836019558)
        {
          i2 = g.size();
          for (i1 = 0; i1 < i2; i1++)
          {
            localObject2 = g.valueAt(i1)).b;
            c = l1;
            b = l1;
          }
        }
        i2 = t;
        if (i2 == 1835295092)
        {
          C = null;
          x = (u + l1);
          if (!L)
          {
            I.a(new gg(A, l1));
            L = true;
          }
          s = 2;
        }
        for (;;)
        {
          break;
          if ((i2 != 1836019574) && (i2 != 1953653099) && (i2 != 1835297121) && (i2 != 1835626086) && (i2 != 1937007212) && (i2 != 1836019558) && (i2 != 1953653094) && (i2 != 1836475768) && (i2 != 1701082227)) {
            i1 = 0;
          } else {
            i1 = 1;
          }
          if (i1 != 0)
          {
            l1 = paramfz.c() + u - 8L;
            p.push(new hd(t, l1));
            if (u == v) {
              a(l1);
            } else {
              a();
            }
          }
          else
          {
            if ((i2 != 1751411826) && (i2 != 1835296868) && (i2 != 1836476516) && (i2 != 1936286840) && (i2 != 1937011556) && (i2 != 1952867444) && (i2 != 1952868452) && (i2 != 1953196132) && (i2 != 1953654136) && (i2 != 1953658222) && (i2 != 1886614376) && (i2 != 1935763834) && (i2 != 1935763823) && (i2 != 1936027235) && (i2 != 1970628964) && (i2 != 1935828848) && (i2 != 1936158820) && (i2 != 1701606260) && (i2 != 1835362404) && (i2 != 1701671783)) {
              i1 = 0;
            } else {
              i1 = 1;
            }
            if (i1 != 0)
            {
              if (v == 8)
              {
                l1 = u;
                if (l1 <= 2147483647L)
                {
                  localObject2 = new vy((int)l1);
                  w = ((vy)localObject2);
                  System.arraycopy(o.a, 0, a, 0, 8);
                  s = 1;
                }
                else
                {
                  throw new ce("Leaf atom with length > 2147483647 (unsupported).");
                }
              }
              else
              {
                throw new ce("Leaf atom defines extended atom size (unsupported).");
              }
            }
            else
            {
              if (u > 2147483647L) {
                break label3096;
              }
              w = null;
              s = 1;
            }
          }
        }
        i1 = 1;
      }
    } while (i1 != 0);
    return -1;
    label3096:
    throw new ce("Skipping atom with length > 2147483647 (unsupported).");
    label3107:
    throw new ce("Atom size less than header length (unsupported).");
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    int i1 = g.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((ho)g.valueAt(i2)).a();
    }
    q.clear();
    y = 0;
    z = paramLong2;
    p.clear();
    H = false;
    a();
  }
  
  public final void a(fy paramfy)
  {
    I = paramfy;
    hz localhz = d;
    if (localhz != null)
    {
      paramfy = new ho(paramfy.a(0, b));
      paramfy.a(d, new hl(0, 0, 0, 0));
      g.put(0, paramfy);
      b();
      I.a();
    }
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    return hw.a(paramfz);
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */