package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bw
  implements Parcelable
{
  public static final Parcelable.Creator<bw> CREATOR = new bv();
  public final Class<? extends fk> A;
  private final int B;
  private final byte[] C;
  private int D;
  public final String a;
  public final String b;
  public final int c;
  public final int d;
  public final int e;
  public final String f;
  public final kd g;
  public final String h;
  public final String i;
  public final int j;
  public final List<byte[]> k;
  public final fe l;
  public final long m;
  public final int n;
  public final int o;
  public final float p;
  public final int q;
  public final float r;
  public final wm s;
  public final int t;
  public final int u;
  public final int v;
  public final int w;
  public final int x;
  public final String y;
  public final int z;
  
  public bw(Parcel paramParcel)
  {
    a = paramParcel.readString();
    b = paramParcel.readString();
    c = paramParcel.readInt();
    d = paramParcel.readInt();
    e = paramParcel.readInt();
    f = paramParcel.readString();
    g = ((kd)paramParcel.readParcelable(kd.class.getClassLoader()));
    h = paramParcel.readString();
    i = paramParcel.readString();
    j = paramParcel.readInt();
    int i1 = paramParcel.readInt();
    k = new ArrayList(i1);
    for (int i2 = 0; i2 < i1; i2++) {
      k.add(paramParcel.createByteArray());
    }
    l = ((fe)paramParcel.readParcelable(fe.class.getClassLoader()));
    m = paramParcel.readLong();
    n = paramParcel.readInt();
    o = paramParcel.readInt();
    p = paramParcel.readFloat();
    q = paramParcel.readInt();
    r = paramParcel.readFloat();
    byte[] arrayOfByte;
    if (wl.a(paramParcel)) {
      arrayOfByte = paramParcel.createByteArray();
    } else {
      arrayOfByte = null;
    }
    C = arrayOfByte;
    B = paramParcel.readInt();
    s = ((wm)paramParcel.readParcelable(wm.class.getClassLoader()));
    t = paramParcel.readInt();
    u = paramParcel.readInt();
    v = paramParcel.readInt();
    w = paramParcel.readInt();
    x = paramParcel.readInt();
    y = paramParcel.readString();
    z = paramParcel.readInt();
    A = null;
  }
  
  private bw(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, kd paramkd, String paramString4, String paramString5, int paramInt4, List<byte[]> paramList, fe paramfe, long paramLong, int paramInt5, int paramInt6, float paramFloat1, int paramInt7, float paramFloat2, byte[] paramArrayOfByte, int paramInt8, wm paramwm, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, String paramString6, int paramInt14, Class<? extends fk> paramClass)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt1;
    d = paramInt2;
    e = paramInt3;
    f = paramString3;
    g = paramkd;
    h = paramString4;
    i = paramString5;
    j = paramInt4;
    if (paramList == null) {
      paramList = Collections.emptyList();
    }
    k = paramList;
    l = paramfe;
    m = paramLong;
    n = paramInt5;
    o = paramInt6;
    p = paramFloat1;
    paramInt2 = 0;
    paramInt1 = paramInt7;
    if (paramInt7 == -1) {
      paramInt1 = 0;
    }
    q = paramInt1;
    if (paramFloat2 == -1.0F) {
      paramFloat1 = 1.0F;
    } else {
      paramFloat1 = paramFloat2;
    }
    r = paramFloat1;
    C = paramArrayOfByte;
    B = paramInt8;
    s = paramwm;
    t = paramInt9;
    u = paramInt10;
    v = paramInt11;
    paramInt1 = paramInt12;
    if (paramInt12 == -1) {
      paramInt1 = 0;
    }
    w = paramInt1;
    if (paramInt13 == -1) {
      paramInt13 = paramInt2;
    }
    x = paramInt13;
    y = wl.b(paramString6);
    z = paramInt14;
    A = paramClass;
  }
  
  public static bw a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    return a(null, paramString2, 0, null, null);
  }
  
  public static bw a(String paramString1, String paramString2, int paramInt, String paramString3, fe paramfe)
  {
    return a(paramString1, paramString2, null, -1, paramInt, paramString3, -1, paramfe, Long.MAX_VALUE, Collections.emptyList());
  }
  
  public static bw a(String paramString1, String paramString2, long paramLong)
  {
    return new bw(paramString1, null, 0, 0, -1, null, null, null, paramString2, -1, null, null, paramLong, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, List<byte[]> paramList, int paramInt5, float paramFloat2, fe paramfe)
  {
    return a(paramString1, paramString2, paramString3, -1, -1, paramInt3, paramInt4, -1.0F, paramList, -1, paramFloat2, null, -1, null, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, List<byte[]> paramList, int paramInt5, float paramFloat2, byte[] paramArrayOfByte, int paramInt6, wm paramwm, fe paramfe)
  {
    return new bw(paramString1, null, 0, 0, paramInt1, paramString3, null, null, paramString2, paramInt2, paramList, paramfe, Long.MAX_VALUE, paramInt3, paramInt4, paramFloat1, paramInt5, paramFloat2, paramArrayOfByte, paramInt6, paramwm, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, List<byte[]> paramList, fe paramfe, int paramInt8, String paramString4, kd paramkd)
  {
    return new bw(paramString1, null, paramInt8, 0, paramInt1, paramString3, paramkd, null, paramString2, paramInt2, paramList, paramfe, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramString4, -1, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<byte[]> paramList, fe paramfe, int paramInt6, String paramString4)
  {
    return a(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, -1, -1, paramList, paramfe, paramInt6, paramString4, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<byte[]> paramList, fe paramfe, int paramInt5, String paramString4)
  {
    return a(paramString1, paramString2, null, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList, paramfe, 0, paramString4);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, fe paramfe, long paramLong, List<byte[]> paramList)
  {
    return new bw(paramString1, null, paramInt2, 0, paramInt1, paramString3, null, null, paramString2, -1, paramList, paramfe, paramLong, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString4, paramInt3, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, fe paramfe, long paramLong)
  {
    return a(null, paramString2, null, -1, 0, paramString4, -1, null, paramLong, Collections.emptyList());
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, List<byte[]> paramList, String paramString4, fe paramfe)
  {
    return new bw(paramString1, null, paramInt2, 0, -1, null, null, null, paramString2, -1, paramList, paramfe, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString4, -1, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, int paramInt, fe paramfe)
  {
    return new bw(paramString1, null, 0, 0, -1, null, null, null, paramString2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, String paramString6)
  {
    return a(paramString1, paramString2, paramString3, paramString4, null, -1, paramInt2, paramInt3, paramString6, -1);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, String paramString6, int paramInt4)
  {
    return new bw(paramString1, paramString2, paramInt2, paramInt3, paramInt1, paramString5, null, paramString3, paramString4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString6, paramInt4, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, kd paramkd, int paramInt1, int paramInt2, int paramInt3, float paramFloat, List<byte[]> paramList, int paramInt4, int paramInt5)
  {
    return new bw(paramString1, paramString2, paramInt4, paramInt5, paramInt1, paramString5, paramkd, paramString3, paramString4, -1, null, null, Long.MAX_VALUE, paramInt2, paramInt3, paramFloat, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static bw a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, kd paramkd, int paramInt1, int paramInt2, int paramInt3, List<byte[]> paramList, int paramInt4, int paramInt5, String paramString6)
  {
    return new bw(paramString1, paramString2, paramInt4, paramInt5, paramInt1, paramString5, paramkd, paramString3, paramString4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt2, paramInt3, -1, -1, -1, paramString6, -1, null);
  }
  
  public static bw b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, String paramString6)
  {
    return new bw(paramString1, paramString2, paramInt2, paramInt3, paramInt1, paramString5, null, paramString3, paramString4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString6, -1, null);
  }
  
  public final int a()
  {
    int i1 = n;
    if (i1 != -1)
    {
      int i2 = o;
      if (i2 != -1) {
        return i1 * i2;
      }
    }
    return -1;
  }
  
  public final bw a(float paramFloat)
  {
    return new bw(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, paramFloat, q, r, C, B, s, t, u, v, w, x, y, z, A);
  }
  
  public final bw a(int paramInt)
  {
    return new bw(a, b, c, d, e, f, g, h, i, paramInt, k, l, m, n, o, p, q, r, C, B, s, t, u, v, w, x, y, z, A);
  }
  
  public final bw a(int paramInt1, int paramInt2)
  {
    return new bw(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, C, B, s, t, u, v, paramInt1, paramInt2, y, z, A);
  }
  
  public final bw a(long paramLong)
  {
    return new bw(a, b, c, d, e, f, g, h, i, j, k, l, paramLong, n, o, p, q, r, C, B, s, t, u, v, w, x, y, z, A);
  }
  
  public final bw a(bw parambw)
  {
    if (this == parambw) {
      return this;
    }
    int i1 = vs.g(i);
    String str1 = a;
    String str2 = b;
    if (str2 == null) {
      str2 = b;
    }
    Object localObject1 = y;
    Object localObject2;
    if ((i1 == 3) || (i1 == 1))
    {
      localObject2 = y;
      if (localObject2 != null) {}
    }
    else
    {
      localObject2 = localObject1;
    }
    int i2 = e;
    int i3 = i2;
    if (i2 == -1) {
      i3 = e;
    }
    localObject1 = f;
    if (localObject1 == null)
    {
      localObject3 = wl.a(f, i1);
      if (wl.i((String)localObject3).length == 1) {
        localObject1 = localObject3;
      }
    }
    Object localObject3 = g;
    if (localObject3 == null) {
      localObject3 = g;
    } else {
      localObject3 = ((kd)localObject3).a(g);
    }
    float f1 = p;
    if ((f1 == -1.0F) && (i1 == 2)) {
      f1 = p;
    }
    i2 = c;
    int i4 = c;
    int i5 = d;
    i1 = d;
    parambw = fe.a(l, l);
    return new bw(str1, str2, i2 | i4, i5 | i1, i3, (String)localObject1, (kd)localObject3, h, i, j, k, parambw, m, n, o, f1, q, r, C, B, s, t, u, v, w, x, (String)localObject2, z, A);
  }
  
  public final bw a(fe paramfe)
  {
    return a(paramfe, g);
  }
  
  public final bw a(fe paramfe, kd paramkd)
  {
    if ((paramfe == l) && (paramkd == g)) {
      return this;
    }
    return new bw(a, b, c, d, e, f, paramkd, h, i, j, k, paramfe, m, n, o, p, q, r, C, B, s, t, u, v, w, x, y, z, A);
  }
  
  public final bw a(kd paramkd)
  {
    return a(l, paramkd);
  }
  
  public final bw a(Class<? extends fk> paramClass)
  {
    return new bw(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, C, B, s, t, u, v, w, x, y, z, paramClass);
  }
  
  public final bw a(String paramString1, String paramString2, String paramString3, String paramString4, kd paramkd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString5)
  {
    kd localkd = g;
    if (localkd != null) {
      paramkd = localkd.a(paramkd);
    }
    return new bw(paramString1, paramString2, paramInt5, d, paramInt1, paramString4, paramkd, h, paramString3, j, k, l, m, paramInt2, paramInt3, p, q, r, C, B, s, paramInt4, u, v, w, x, paramString5, z, A);
  }
  
  public final bw b(int paramInt)
  {
    return new bw(a, b, c, d, paramInt, f, g, h, i, j, k, l, m, n, o, p, q, r, C, B, s, t, u, v, w, x, y, z, A);
  }
  
  public final boolean b(bw parambw)
  {
    if (k.size() != k.size()) {
      return false;
    }
    for (int i1 = 0; i1 < k.size(); i1++) {
      if (!Arrays.equals((byte[])k.get(i1), (byte[])k.get(i1))) {
        return false;
      }
    }
    return true;
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
    if ((paramObject != null) && (bw.class == paramObject.getClass()))
    {
      paramObject = (bw)paramObject;
      int i1 = D;
      if (i1 != 0)
      {
        int i2 = D;
        if ((i2 != 0) && (i1 != i2)) {
          return false;
        }
      }
      if ((c == c) && (d == d) && (e == e) && (j == j) && (m == m) && (n == n) && (o == o) && (q == q) && (B == B) && (t == t) && (u == u) && (v == v) && (w == w) && (x == x) && (z == z) && (Float.compare(p, p) == 0) && (Float.compare(r, r) == 0) && (wl.a(A, A)) && (wl.a(a, a)) && (wl.a(b, b)) && (wl.a(f, f)) && (wl.a(h, h)) && (wl.a(i, i)) && (wl.a(y, y)) && (Arrays.equals(C, C)) && (wl.a(g, g)) && (wl.a(s, s)) && (wl.a(l, l)) && (b((bw)paramObject))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (D == 0)
    {
      Object localObject = a;
      int i1 = 0;
      int i2;
      if (localObject == null) {
        i2 = 0;
      } else {
        i2 = ((String)localObject).hashCode();
      }
      localObject = b;
      int i3;
      if (localObject != null) {
        i3 = ((String)localObject).hashCode();
      } else {
        i3 = 0;
      }
      int i4 = c;
      int i5 = d;
      int i6 = e;
      localObject = f;
      int i7;
      if (localObject == null) {
        i7 = 0;
      } else {
        i7 = ((String)localObject).hashCode();
      }
      localObject = g;
      int i8;
      if (localObject == null) {
        i8 = 0;
      } else {
        i8 = ((kd)localObject).hashCode();
      }
      localObject = h;
      int i9;
      if (localObject == null) {
        i9 = 0;
      } else {
        i9 = ((String)localObject).hashCode();
      }
      localObject = i;
      int i10;
      if (localObject == null) {
        i10 = 0;
      } else {
        i10 = ((String)localObject).hashCode();
      }
      int i11 = j;
      int i12 = (int)m;
      int i13 = n;
      int i14 = o;
      int i15 = Float.floatToIntBits(p);
      int i16 = q;
      int i17 = Float.floatToIntBits(r);
      int i18 = B;
      int i19 = t;
      int i20 = u;
      int i21 = v;
      int i22 = w;
      int i23 = x;
      localObject = y;
      int i24;
      if (localObject == null) {
        i24 = 0;
      } else {
        i24 = ((String)localObject).hashCode();
      }
      int i25 = z;
      localObject = A;
      if (localObject != null) {
        i1 = localObject.hashCode();
      }
      D = ((((((((((i17 + ((i15 + (((((((((((((i2 + 527) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i14) * 31) * 31 + i16) * 31) * 31 + i18) * 31 + i19) * 31 + i20) * 31 + i21) * 31 + i22) * 31 + i23) * 31 + i24) * 31 + i25) * 31 + i1);
    }
    return D;
  }
  
  public final String toString()
  {
    String str1 = a;
    Object localObject = b;
    String str2 = h;
    String str3 = i;
    String str4 = f;
    int i1 = e;
    String str5 = y;
    int i2 = n;
    int i3 = o;
    float f1 = p;
    int i4 = t;
    int i5 = u;
    localObject = a.q(a.b(str5, a.b(str4, a.b(str3, a.b(str2, a.b((String)localObject, a.b(str1, 104)))))), "Format(", str1, ", ", (String)localObject);
    a.C((StringBuilder)localObject, ", ", str2, ", ", str3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(str4);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(i1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(str5);
    ((StringBuilder)localObject).append(", [");
    ((StringBuilder)localObject).append(i2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(i3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(f1);
    ((StringBuilder)localObject).append("], [");
    ((StringBuilder)localObject).append(i4);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(i5);
    ((StringBuilder)localObject).append("])");
    return ((StringBuilder)localObject).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
    paramParcel.writeInt(e);
    paramParcel.writeString(f);
    Object localObject = g;
    boolean bool = false;
    paramParcel.writeParcelable((Parcelable)localObject, 0);
    paramParcel.writeString(h);
    paramParcel.writeString(i);
    paramParcel.writeInt(j);
    int i1 = k.size();
    paramParcel.writeInt(i1);
    for (int i2 = 0; i2 < i1; i2++) {
      paramParcel.writeByteArray((byte[])k.get(i2));
    }
    paramParcel.writeParcelable(l, 0);
    paramParcel.writeLong(m);
    paramParcel.writeInt(n);
    paramParcel.writeInt(o);
    paramParcel.writeFloat(p);
    paramParcel.writeInt(q);
    paramParcel.writeFloat(r);
    if (C != null) {
      bool = true;
    }
    wl.a(paramParcel, bool);
    localObject = C;
    if (localObject != null) {
      paramParcel.writeByteArray((byte[])localObject);
    }
    paramParcel.writeInt(B);
    paramParcel.writeParcelable(s, paramInt);
    paramParcel.writeInt(t);
    paramParcel.writeInt(u);
    paramParcel.writeInt(v);
    paramParcel.writeInt(w);
    paramParcel.writeInt(x);
    paramParcel.writeString(y);
    paramParcel.writeInt(z);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.bw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */