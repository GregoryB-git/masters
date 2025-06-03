package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class q6
  extends a
{
  public static final Parcelable.Creator<q6> CREATOR = new p6();
  public final int a;
  public final String b;
  public final long c;
  public final Long d;
  public final String e;
  public final String f;
  public final Double o;
  
  public q6(int paramInt, String paramString1, long paramLong, Long paramLong1, Float paramFloat, String paramString2, String paramString3, Double paramDouble)
  {
    a = paramInt;
    b = paramString1;
    c = paramLong;
    d = paramLong1;
    if (paramInt == 1)
    {
      if (paramFloat != null) {
        paramString1 = Double.valueOf(paramFloat.doubleValue());
      } else {
        paramString1 = null;
      }
      o = paramString1;
    }
    else
    {
      o = paramDouble;
    }
    e = paramString2;
    f = paramString3;
  }
  
  public q6(s6 params6)
  {
    this(str, b, l, localObject);
  }
  
  public q6(String paramString1, String paramString2, long paramLong, Object paramObject)
  {
    j.e(paramString1);
    a = 2;
    b = paramString1;
    c = paramLong;
    f = paramString2;
    if (paramObject == null)
    {
      d = null;
      o = null;
      e = null;
      return;
    }
    if ((paramObject instanceof Long))
    {
      d = ((Long)paramObject);
      o = null;
      e = null;
      return;
    }
    if ((paramObject instanceof String))
    {
      d = null;
      o = null;
      e = ((String)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      d = null;
      o = ((Double)paramObject);
      e = null;
      return;
    }
    throw new IllegalArgumentException("User attribute given of un-supported type");
  }
  
  public final Object D()
  {
    Object localObject = d;
    if (localObject != null) {
      return localObject;
    }
    localObject = o;
    if (localObject != null) {
      return localObject;
    }
    localObject = e;
    if (localObject != null) {
      return localObject;
    }
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.C(paramParcel, 3, c);
    z.D(paramParcel, 4, d);
    z.F(paramParcel, 6, e, false);
    z.F(paramParcel, 7, f, false);
    z.x(paramParcel, 8, o);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.q6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */