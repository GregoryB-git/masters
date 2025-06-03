package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m6.h;
import m6.j;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new p();
  public final d a;
  public final a b;
  public final String c;
  public final boolean d;
  public final int e;
  public final c f;
  public final b o;
  
  public b(d paramd, a parama, String paramString, boolean paramBoolean, int paramInt, c paramc, b paramb)
  {
    j.i(paramd);
    a = paramd;
    j.i(parama);
    b = parama;
    c = paramString;
    d = paramBoolean;
    e = paramInt;
    paramd = paramc;
    if (paramc == null) {
      paramd = new c(false, null, null);
    }
    f = paramd;
    paramd = paramb;
    if (paramb == null) {
      paramd = new b(null, false);
    }
    o = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(f, f)) && (h.a(o, o)) && (h.a(c, c)) && (d == d) && (e == e);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, f, o, c, Boolean.valueOf(d) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.E(paramParcel, 2, b, paramInt, false);
    z.F(paramParcel, 3, c, false);
    z.t(paramParcel, 4, d);
    z.z(paramParcel, 5, e);
    z.E(paramParcel, 6, f, paramInt, false);
    z.E(paramParcel, 7, o, paramInt, false);
    z.L(i, paramParcel);
  }
  
  public static final class a
    extends a
  {
    public static final Parcelable.Creator<a> CREATOR = new u();
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean o;
    
    public a(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, String paramString3, ArrayList paramArrayList, boolean paramBoolean3)
    {
      boolean bool;
      if ((paramBoolean2) && (paramBoolean3)) {
        bool = false;
      } else {
        bool = true;
      }
      j.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", bool);
      a = paramBoolean1;
      if ((paramBoolean1) && (paramString1 == null)) {
        throw new NullPointerException("serverClientId must be provided if Google ID tokens are requested");
      }
      b = paramString1;
      c = paramString2;
      d = paramBoolean2;
      paramString2 = null;
      paramString1 = paramString2;
      if (paramArrayList != null) {
        if (paramArrayList.isEmpty())
        {
          paramString1 = paramString2;
        }
        else
        {
          paramString1 = new ArrayList(paramArrayList);
          Collections.sort(paramString1);
        }
      }
      f = paramString1;
      e = paramString3;
      o = paramBoolean3;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      return (a == a) && (h.a(b, b)) && (h.a(c, c)) && (d == d) && (h.a(e, e)) && (h.a(f, f)) && (o == o);
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Boolean.valueOf(a), b, c, Boolean.valueOf(d), e, f, Boolean.valueOf(o) });
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = z.J(20293, paramParcel);
      z.t(paramParcel, 1, a);
      z.F(paramParcel, 2, b, false);
      z.F(paramParcel, 3, c, false);
      z.t(paramParcel, 4, d);
      z.F(paramParcel, 5, e, false);
      z.G(paramParcel, 6, f);
      z.t(paramParcel, 7, o);
      z.L(paramInt, paramParcel);
    }
  }
  
  public static final class b
    extends a
  {
    public static final Parcelable.Creator<b> CREATOR = new v();
    public final boolean a;
    public final String b;
    
    public b(String paramString, boolean paramBoolean)
    {
      if (paramBoolean) {
        j.i(paramString);
      }
      a = paramBoolean;
      b = paramString;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      return (a == a) && (h.a(b, b));
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Boolean.valueOf(a), b });
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = z.J(20293, paramParcel);
      z.t(paramParcel, 1, a);
      z.F(paramParcel, 2, b, false);
      z.L(paramInt, paramParcel);
    }
  }
  
  @Deprecated
  public static final class c
    extends a
  {
    public static final Parcelable.Creator<c> CREATOR = new w();
    public final boolean a;
    public final byte[] b;
    public final String c;
    
    public c(boolean paramBoolean, byte[] paramArrayOfByte, String paramString)
    {
      if (paramBoolean)
      {
        j.i(paramArrayOfByte);
        j.i(paramString);
      }
      a = paramBoolean;
      b = paramArrayOfByte;
      c = paramString;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      Object localObject = (c)paramObject;
      if ((a == a) && (Arrays.equals(b, b)))
      {
        paramObject = c;
        localObject = c;
        if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject)))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = Arrays.hashCode(new Object[] { Boolean.valueOf(a), c });
      return Arrays.hashCode(b) + i * 31;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = z.J(20293, paramParcel);
      z.t(paramParcel, 1, a);
      z.w(paramParcel, 2, b, false);
      z.F(paramParcel, 3, c, false);
      z.L(paramInt, paramParcel);
    }
  }
  
  public static final class d
    extends a
  {
    public static final Parcelable.Creator<d> CREATOR = new x();
    public final boolean a;
    
    public d(boolean paramBoolean)
    {
      a = paramBoolean;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof d)) {
        return false;
      }
      paramObject = (d)paramObject;
      return a == a;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Boolean.valueOf(a) });
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = z.J(20293, paramParcel);
      z.t(paramParcel, 1, a);
      z.L(paramInt, paramParcel);
    }
  }
}

/* Location:
 * Qualified Name:     d6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */