package R2;

import A2.n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class R5
  extends a
{
  public static final Parcelable.Creator<R5> CREATOR = new Q5();
  public final int o;
  public final String p;
  public final long q;
  public final Long r;
  public final Float s;
  public final String t;
  public final String u;
  public final Double v;
  
  public R5(int paramInt, String paramString1, long paramLong, Long paramLong1, Float paramFloat, String paramString2, String paramString3, Double paramDouble)
  {
    o = paramInt;
    p = paramString1;
    q = paramLong;
    r = paramLong1;
    paramString1 = null;
    s = null;
    if (paramInt == 1)
    {
      if (paramFloat != null) {
        paramString1 = Double.valueOf(paramFloat.doubleValue());
      }
      v = paramString1;
    }
    else
    {
      v = paramDouble;
    }
    t = paramString2;
    u = paramString3;
  }
  
  public R5(T5 paramT5)
  {
    this(c, d, e, b);
  }
  
  public R5(String paramString1, long paramLong, Object paramObject, String paramString2)
  {
    n.e(paramString1);
    o = 2;
    p = paramString1;
    q = paramLong;
    u = paramString2;
    if (paramObject == null)
    {
      r = null;
      s = null;
      v = null;
      t = null;
      return;
    }
    if ((paramObject instanceof Long))
    {
      r = ((Long)paramObject);
      s = null;
      v = null;
      t = null;
      return;
    }
    if ((paramObject instanceof String))
    {
      r = null;
      s = null;
      v = null;
      t = ((String)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      r = null;
      s = null;
      v = ((Double)paramObject);
      t = null;
      return;
    }
    throw new IllegalArgumentException("User attribute given of un-supported type");
  }
  
  public final Object a()
  {
    Object localObject = r;
    if (localObject != null) {
      return localObject;
    }
    localObject = v;
    if (localObject != null) {
      return localObject;
    }
    localObject = t;
    if (localObject != null) {
      return localObject;
    }
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.n(paramParcel, 2, p, false);
    c.k(paramParcel, 3, q);
    c.l(paramParcel, 4, r, false);
    c.g(paramParcel, 5, null, false);
    c.n(paramParcel, 6, t, false);
    c.n(paramParcel, 7, u, false);
    c.f(paramParcel, 8, v, false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     R2.R5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */