package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import java.util.ArrayList;
import java.util.List;
import m6.j;
import n6.a;

public final class k6
  extends a
{
  public static final Parcelable.Creator<k6> CREATOR = new v6();
  public final List<String> A;
  public final String B;
  public final String C;
  public final String D;
  public final String E;
  public final boolean F;
  public final long G;
  public final int H;
  public final String I;
  public final int J;
  public final long K;
  public final String L;
  public final String M;
  public final long N;
  public final int O;
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final long e;
  public final long f;
  public final String o;
  public final boolean p;
  public final boolean q;
  public final long r;
  public final String s;
  public final long t;
  public final int u;
  public final boolean v;
  public final boolean w;
  public final String x;
  public final Boolean y;
  public final long z;
  
  public k6(String paramString1, String paramString2, String paramString3, long paramLong1, String paramString4, long paramLong2, long paramLong3, String paramString5, boolean paramBoolean1, boolean paramBoolean2, String paramString6, long paramLong4, int paramInt1, boolean paramBoolean3, boolean paramBoolean4, String paramString7, Boolean paramBoolean, long paramLong5, List paramList, String paramString8, String paramString9, String paramString10, boolean paramBoolean5, long paramLong6, int paramInt2, String paramString11, int paramInt3, long paramLong7, String paramString12, String paramString13, long paramLong8, int paramInt4)
  {
    j.e(paramString1);
    a = paramString1;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = null;
    } else {
      paramString1 = paramString2;
    }
    b = paramString1;
    c = paramString3;
    r = paramLong1;
    d = paramString4;
    e = paramLong2;
    f = paramLong3;
    o = paramString5;
    p = paramBoolean1;
    q = paramBoolean2;
    s = paramString6;
    t = paramLong4;
    u = paramInt1;
    v = paramBoolean3;
    w = paramBoolean4;
    x = paramString7;
    y = paramBoolean;
    z = paramLong5;
    A = paramList;
    B = null;
    C = paramString8;
    D = paramString9;
    E = paramString10;
    F = paramBoolean5;
    G = paramLong6;
    H = paramInt2;
    I = paramString11;
    J = paramInt3;
    K = paramLong7;
    L = paramString12;
    M = paramString13;
    N = paramLong8;
    O = paramInt4;
  }
  
  public k6(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, boolean paramBoolean1, boolean paramBoolean2, long paramLong3, String paramString6, long paramLong4, int paramInt1, boolean paramBoolean3, boolean paramBoolean4, String paramString7, Boolean paramBoolean, long paramLong5, ArrayList paramArrayList, String paramString8, String paramString9, String paramString10, String paramString11, boolean paramBoolean5, long paramLong6, int paramInt2, String paramString12, int paramInt3, long paramLong7, String paramString13, String paramString14, long paramLong8, int paramInt4)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    r = paramLong3;
    d = paramString4;
    e = paramLong1;
    f = paramLong2;
    o = paramString5;
    p = paramBoolean1;
    q = paramBoolean2;
    s = paramString6;
    t = paramLong4;
    u = paramInt1;
    v = paramBoolean3;
    w = paramBoolean4;
    x = paramString7;
    y = paramBoolean;
    z = paramLong5;
    A = paramArrayList;
    B = paramString8;
    C = paramString9;
    D = paramString10;
    E = paramString11;
    F = paramBoolean5;
    G = paramLong6;
    H = paramInt2;
    I = paramString12;
    J = paramInt3;
    K = paramLong7;
    L = paramString13;
    M = paramString14;
    N = paramLong8;
    O = paramInt4;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a, false);
    z.F(paramParcel, 3, b, false);
    z.F(paramParcel, 4, c, false);
    z.F(paramParcel, 5, d, false);
    z.C(paramParcel, 6, e);
    z.C(paramParcel, 7, f);
    z.F(paramParcel, 8, o, false);
    z.t(paramParcel, 9, p);
    z.t(paramParcel, 10, q);
    z.C(paramParcel, 11, r);
    z.F(paramParcel, 12, s, false);
    z.C(paramParcel, 14, t);
    z.z(paramParcel, 15, u);
    z.t(paramParcel, 16, v);
    z.t(paramParcel, 18, w);
    z.F(paramParcel, 19, x, false);
    z.u(paramParcel, 21, y);
    z.C(paramParcel, 22, z);
    z.G(paramParcel, 23, A);
    z.F(paramParcel, 24, B, false);
    z.F(paramParcel, 25, C, false);
    z.F(paramParcel, 26, D, false);
    z.F(paramParcel, 27, E, false);
    z.t(paramParcel, 28, F);
    z.C(paramParcel, 29, G);
    z.z(paramParcel, 30, H);
    z.F(paramParcel, 31, I, false);
    z.z(paramParcel, 32, J);
    z.C(paramParcel, 34, K);
    z.F(paramParcel, 35, L, false);
    z.F(paramParcel, 36, M, false);
    z.C(paramParcel, 37, N);
    z.z(paramParcel, 38, O);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.k6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */