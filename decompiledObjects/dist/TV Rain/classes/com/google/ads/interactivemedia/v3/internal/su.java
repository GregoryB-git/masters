package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class su
  extends tc
{
  public static final Parcelable.Creator<su> CREATOR = new st();
  public static final su a = new su();
  private final SparseArray<Map<of, sp.a>> A;
  private final SparseBooleanArray B;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final int i;
  public final int j;
  public final boolean k;
  public final int l;
  public final int m;
  public final boolean n;
  public final boolean o;
  public final boolean p;
  public final boolean q;
  public final boolean r;
  public final boolean s;
  public final boolean t;
  public final int u;
  
  private su()
  {
    this(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, w, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, false, false, x, y, z, false, false, true, 0, new SparseArray(), new SparseBooleanArray());
  }
  
  private su(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt5, int paramInt6, boolean paramBoolean4, String paramString1, int paramInt7, int paramInt8, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, String paramString2, boolean paramBoolean9, int paramInt9, boolean paramBoolean10, boolean paramBoolean11, boolean paramBoolean12, int paramInt10, SparseArray<Map<of, sp.a>> paramSparseArray, SparseBooleanArray paramSparseBooleanArray)
  {
    super(paramString1, paramString2, paramBoolean9, paramInt9);
    b = Integer.MAX_VALUE;
    c = Integer.MAX_VALUE;
    d = Integer.MAX_VALUE;
    e = Integer.MAX_VALUE;
    f = true;
    g = false;
    h = true;
    i = Integer.MAX_VALUE;
    j = Integer.MAX_VALUE;
    k = true;
    l = Integer.MAX_VALUE;
    m = Integer.MAX_VALUE;
    n = true;
    o = false;
    p = false;
    q = false;
    r = false;
    s = false;
    t = true;
    u = 0;
    A = paramSparseArray;
    B = paramSparseBooleanArray;
  }
  
  public su(Parcel paramParcel)
  {
    super(paramParcel);
    b = paramParcel.readInt();
    c = paramParcel.readInt();
    d = paramParcel.readInt();
    e = paramParcel.readInt();
    f = wl.a(paramParcel);
    g = wl.a(paramParcel);
    h = wl.a(paramParcel);
    i = paramParcel.readInt();
    j = paramParcel.readInt();
    k = wl.a(paramParcel);
    l = paramParcel.readInt();
    m = paramParcel.readInt();
    n = wl.a(paramParcel);
    o = wl.a(paramParcel);
    p = wl.a(paramParcel);
    q = wl.a(paramParcel);
    r = wl.a(paramParcel);
    s = wl.a(paramParcel);
    t = wl.a(paramParcel);
    u = paramParcel.readInt();
    int i1 = paramParcel.readInt();
    SparseArray localSparseArray = new SparseArray(i1);
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = paramParcel.readInt();
      int i4 = paramParcel.readInt();
      HashMap localHashMap = new HashMap(i4);
      for (int i5 = 0; i5 < i4; i5++) {
        localHashMap.put((of)paramParcel.readParcelable(of.class.getClassLoader()), (sp.a)paramParcel.readParcelable(sp.a.class.getClassLoader()));
      }
      localSparseArray.put(i3, localHashMap);
    }
    A = localSparseArray;
    B = ((SparseBooleanArray)wl.a(paramParcel.readSparseBooleanArray()));
  }
  
  public final boolean a(int paramInt)
  {
    return B.get(paramInt);
  }
  
  public final boolean a(int paramInt, of paramof)
  {
    Map localMap = (Map)A.get(paramInt);
    return (localMap != null) && (localMap.containsKey(paramof));
  }
  
  public final sp.a b(int paramInt, of paramof)
  {
    Map localMap = (Map)A.get(paramInt);
    if (localMap != null) {
      return (sp.a)localMap.get(paramof);
    }
    return null;
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
    if ((paramObject != null) && (su.class == paramObject.getClass()))
    {
      Object localObject1 = (su)paramObject;
      if ((super.equals(paramObject)) && (b == b) && (c == c) && (d == d) && (e == e) && (f == f) && (g == g) && (h == h) && (k == k) && (i == i) && (j == j) && (l == l) && (m == m) && (n == n) && (o == o) && (p == p) && (q == q) && (r == r) && (s == s) && (t == t) && (u == u))
      {
        paramObject = B;
        Object localObject2 = B;
        int i1 = ((SparseBooleanArray)paramObject).size();
        int i2;
        if (((SparseBooleanArray)localObject2).size() != i1)
        {
          i2 = 0;
        }
        else
        {
          for (i2 = 0;; i2++)
          {
            if (i2 >= i1) {
              break label319;
            }
            if (((SparseBooleanArray)localObject2).indexOfKey(((SparseBooleanArray)paramObject).keyAt(i2)) < 0) {
              break;
            }
          }
          label319:
          i2 = 1;
        }
        if (i2 != 0)
        {
          paramObject = A;
          localObject1 = A;
          int i3 = ((SparseArray)paramObject).size();
          if (((SparseArray)localObject1).size() != i3)
          {
            i2 = 0;
          }
          else
          {
            for (i2 = 0;; i2++)
            {
              if (i2 >= i3) {
                break label532;
              }
              i1 = ((SparseArray)localObject1).indexOfKey(((SparseArray)paramObject).keyAt(i2));
              if (i1 < 0) {
                break;
              }
              Object localObject3 = (Map)((SparseArray)paramObject).valueAt(i2);
              localObject2 = (Map)((SparseArray)localObject1).valueAt(i1);
              i1 = ((Map)localObject3).size();
              if (((Map)localObject2).size() != i1) {}
              for (;;)
              {
                i1 = 0;
                break label518;
                localObject3 = ((Map)localObject3).entrySet().iterator();
                Map.Entry localEntry;
                of localof;
                do
                {
                  if (!((Iterator)localObject3).hasNext()) {
                    break label515;
                  }
                  localEntry = (Map.Entry)((Iterator)localObject3).next();
                  localof = (of)localEntry.getKey();
                  if (!((Map)localObject2).containsKey(localof)) {
                    break;
                  }
                } while (wl.a(localEntry.getValue(), ((Map)localObject2).get(localof)));
              }
              label515:
              i1 = 1;
              label518:
              if (i1 == 0) {
                break;
              }
            }
            label532:
            i2 = 1;
          }
          if (i2 != 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((((((((((((((((((super.hashCode() * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + f) * 31 + g) * 31 + h) * 31 + k) * 31 + i) * 31 + j) * 31 + l) * 31 + m) * 31 + n) * 31 + o) * 31 + p) * 31 + q) * 31 + r) * 31 + s) * 31 + t) * 31 + u;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
    paramParcel.writeInt(e);
    wl.a(paramParcel, f);
    wl.a(paramParcel, g);
    wl.a(paramParcel, h);
    paramParcel.writeInt(i);
    paramParcel.writeInt(j);
    wl.a(paramParcel, k);
    paramParcel.writeInt(l);
    paramParcel.writeInt(m);
    wl.a(paramParcel, n);
    wl.a(paramParcel, o);
    wl.a(paramParcel, p);
    wl.a(paramParcel, q);
    wl.a(paramParcel, r);
    wl.a(paramParcel, s);
    wl.a(paramParcel, t);
    paramParcel.writeInt(u);
    SparseArray localSparseArray = A;
    int i1 = localSparseArray.size();
    paramParcel.writeInt(i1);
    for (paramInt = 0; paramInt < i1; paramInt++)
    {
      int i2 = localSparseArray.keyAt(paramInt);
      Object localObject = (Map)localSparseArray.valueAt(paramInt);
      int i3 = ((Map)localObject).size();
      paramParcel.writeInt(i2);
      paramParcel.writeInt(i3);
      localObject = ((Map)localObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        paramParcel.writeParcelable((Parcelable)localEntry.getKey(), 0);
        paramParcel.writeParcelable((Parcelable)localEntry.getValue(), 0);
      }
    }
    paramParcel.writeSparseBooleanArray(B);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.su
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */