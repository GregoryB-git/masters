package R2;

import A2.n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class W5
  extends a
{
  public static final Parcelable.Creator<W5> CREATOR = new Y5();
  public final long A;
  public final int B;
  public final boolean C;
  public final boolean D;
  public final String E;
  public final Boolean F;
  public final long G;
  public final List H;
  public final String I;
  public final String J;
  public final String K;
  public final String L;
  public final boolean M;
  public final long N;
  public final int O;
  public final String P;
  public final int Q;
  public final long R;
  public final String o;
  public final String p;
  public final String q;
  public final String r;
  public final long s;
  public final long t;
  public final String u;
  public final boolean v;
  public final boolean w;
  public final long x;
  public final String y;
  public final long z;
  
  public W5(String paramString1, String paramString2, String paramString3, long paramLong1, String paramString4, long paramLong2, long paramLong3, String paramString5, boolean paramBoolean1, boolean paramBoolean2, String paramString6, long paramLong4, long paramLong5, int paramInt1, boolean paramBoolean3, boolean paramBoolean4, String paramString7, Boolean paramBoolean, long paramLong6, List paramList, String paramString8, String paramString9, String paramString10, String paramString11, boolean paramBoolean5, long paramLong7, int paramInt2, String paramString12, int paramInt3, long paramLong8)
  {
    n.e(paramString1);
    o = paramString1;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = null;
    } else {
      paramString1 = paramString2;
    }
    p = paramString1;
    q = paramString3;
    x = paramLong1;
    r = paramString4;
    s = paramLong2;
    t = paramLong3;
    u = paramString5;
    v = paramBoolean1;
    w = paramBoolean2;
    y = paramString6;
    z = paramLong4;
    A = paramLong5;
    B = paramInt1;
    C = paramBoolean3;
    D = paramBoolean4;
    E = paramString7;
    F = paramBoolean;
    G = paramLong6;
    H = paramList;
    I = null;
    J = paramString9;
    K = paramString10;
    L = paramString11;
    M = paramBoolean5;
    N = paramLong7;
    O = paramInt2;
    P = paramString12;
    Q = paramInt3;
    R = paramLong8;
  }
  
  public W5(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, boolean paramBoolean1, boolean paramBoolean2, long paramLong3, String paramString6, long paramLong4, long paramLong5, int paramInt1, boolean paramBoolean3, boolean paramBoolean4, String paramString7, Boolean paramBoolean, long paramLong6, List paramList, String paramString8, String paramString9, String paramString10, String paramString11, boolean paramBoolean5, long paramLong7, int paramInt2, String paramString12, int paramInt3, long paramLong8)
  {
    o = paramString1;
    p = paramString2;
    q = paramString3;
    x = paramLong3;
    r = paramString4;
    s = paramLong1;
    t = paramLong2;
    u = paramString5;
    v = paramBoolean1;
    w = paramBoolean2;
    y = paramString6;
    z = paramLong4;
    A = paramLong5;
    B = paramInt1;
    C = paramBoolean3;
    D = paramBoolean4;
    E = paramString7;
    F = paramBoolean;
    G = paramLong6;
    H = paramList;
    I = paramString8;
    J = paramString9;
    K = paramString10;
    L = paramString11;
    M = paramBoolean5;
    N = paramLong7;
    O = paramInt2;
    P = paramString12;
    Q = paramInt3;
    R = paramLong8;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.n(paramParcel, 2, o, false);
    c.n(paramParcel, 3, p, false);
    c.n(paramParcel, 4, q, false);
    c.n(paramParcel, 5, r, false);
    c.k(paramParcel, 6, s);
    c.k(paramParcel, 7, t);
    c.n(paramParcel, 8, u, false);
    c.c(paramParcel, 9, v);
    c.c(paramParcel, 10, w);
    c.k(paramParcel, 11, x);
    c.n(paramParcel, 12, y, false);
    c.k(paramParcel, 13, z);
    c.k(paramParcel, 14, A);
    c.i(paramParcel, 15, B);
    c.c(paramParcel, 16, C);
    c.c(paramParcel, 18, D);
    c.n(paramParcel, 19, E, false);
    c.d(paramParcel, 21, F, false);
    c.k(paramParcel, 22, G);
    c.o(paramParcel, 23, H, false);
    c.n(paramParcel, 24, I, false);
    c.n(paramParcel, 25, J, false);
    c.n(paramParcel, 26, K, false);
    c.n(paramParcel, 27, L, false);
    c.c(paramParcel, 28, M);
    c.k(paramParcel, 29, N);
    c.i(paramParcel, 30, O);
    c.n(paramParcel, 31, P, false);
    c.i(paramParcel, 32, Q);
    c.k(paramParcel, 34, R);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     R2.W5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */