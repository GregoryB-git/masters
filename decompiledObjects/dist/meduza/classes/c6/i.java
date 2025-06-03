package c6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import r.d;
import t6.a.a;

public final class i
  extends zzbz
{
  public static final Parcelable.Creator<i> CREATOR = new j();
  public static final HashMap p;
  public final Set a;
  public final int b;
  public String c;
  public int d;
  public byte[] e;
  public PendingIntent f;
  public a o;
  
  static
  {
    HashMap localHashMap = new HashMap();
    p = localHashMap;
    localHashMap.put("accountType", new a.a(7, false, 7, false, "accountType", 2, null));
    localHashMap.put("status", new a.a(0, false, 0, false, "status", 3, null));
    localHashMap.put("transferBytes", new a.a(8, false, 8, false, "transferBytes", 4, null));
  }
  
  public i()
  {
    a = new d(3);
    b = 1;
  }
  
  public i(HashSet paramHashSet, int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfByte, PendingIntent paramPendingIntent, a parama)
  {
    a = paramHashSet;
    b = paramInt1;
    c = paramString;
    d = paramInt2;
    e = paramArrayOfByte;
    f = paramPendingIntent;
    o = parama;
  }
  
  public final Object getFieldValue(a.a parama)
  {
    int i = o;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            return e;
          }
          throw new IllegalStateException(f.h("Unknown SafeParcelable id=", o));
        }
        i = d;
      }
      else
      {
        return c;
      }
    }
    else {
      i = b;
    }
    return Integer.valueOf(i);
  }
  
  public final boolean isFieldSet(a.a parama)
  {
    return a.contains(Integer.valueOf(o));
  }
  
  public final void setDecodedBytesInternal(a.a parama, String paramString, byte[] paramArrayOfByte)
  {
    int i = o;
    if (i == 4)
    {
      e = paramArrayOfByte;
      a.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(a0.j.h("Field with id=", i, " is not known to be a byte array."));
  }
  
  public final void setIntegerInternal(a.a parama, String paramString, int paramInt)
  {
    int i = o;
    if (i == 3)
    {
      d = paramInt;
      a.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(a0.j.h("Field with id=", i, " is not known to be an int."));
  }
  
  public final void setStringInternal(a.a parama, String paramString1, String paramString2)
  {
    int i = o;
    if (i == 2)
    {
      c = paramString2;
      a.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] { Integer.valueOf(i) }));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    Set localSet = a;
    if (localSet.contains(Integer.valueOf(1))) {
      z.z(paramParcel, 1, b);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      z.F(paramParcel, 2, c, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      z.z(paramParcel, 3, d);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      z.w(paramParcel, 4, e, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      z.E(paramParcel, 5, f, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      z.E(paramParcel, 6, o, paramInt, true);
    }
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */