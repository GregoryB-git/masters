package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class c
  extends a
{
  public static final Parcelable.Creator<c> CREATOR = new b1();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final boolean e;
  public final String f;
  public final boolean o;
  public String p;
  public int q;
  public String r;
  public final String s;
  
  public c(a parama)
  {
    a = a;
    b = b;
    c = null;
    d = c;
    e = d;
    f = e;
    o = f;
    r = g;
    s = h;
  }
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, String paramString5, boolean paramBoolean2, String paramString6, int paramInt, String paramString7, String paramString8)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramBoolean1;
    f = paramString5;
    o = paramBoolean2;
    p = paramString6;
    q = paramInt;
    r = paramString7;
    s = paramString8;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.t(paramParcel, 5, e);
    z.F(paramParcel, 6, f, false);
    z.t(paramParcel, 7, o);
    z.F(paramParcel, 8, p, false);
    z.z(paramParcel, 9, q);
    z.F(paramParcel, 10, r, false);
    z.F(paramParcel, 11, s, false);
    z.L(paramInt, paramParcel);
  }
  
  public static final class a
  {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public boolean f = false;
    public String g;
    public String h;
  }
}

/* Location:
 * Qualified Name:     b8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */