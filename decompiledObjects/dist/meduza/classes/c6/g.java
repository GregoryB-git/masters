package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import t6.a;
import t6.a.a;

public final class g
  extends zzbz
{
  public static final Parcelable.Creator<g> CREATOR = new h();
  public static final HashMap o;
  public final Set a;
  public final int b;
  public i c;
  public String d;
  public String e;
  public String f;
  
  static
  {
    HashMap localHashMap = new HashMap();
    o = localHashMap;
    localHashMap.put("authenticatorInfo", new a.a(11, false, 11, false, "authenticatorInfo", 2, i.class));
    localHashMap.put("signature", new a.a(7, false, 7, false, "signature", 3, null));
    localHashMap.put("package", new a.a(7, false, 7, false, "package", 4, null));
  }
  
  public g()
  {
    a = new HashSet(3);
    b = 1;
  }
  
  public g(HashSet paramHashSet, int paramInt, i parami, String paramString1, String paramString2, String paramString3)
  {
    a = paramHashSet;
    b = paramInt;
    c = parami;
    d = paramString1;
    e = paramString2;
    f = paramString3;
  }
  
  public final void addConcreteTypeInternal(a.a parama, String paramString, a parama1)
  {
    int i = o;
    if (i == 2)
    {
      c = ((i)parama1);
      a.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] { Integer.valueOf(i), parama1.getClass().getCanonicalName() }));
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
        return d;
      }
      return c;
    }
    return Integer.valueOf(b);
  }
  
  public final boolean isFieldSet(a.a parama)
  {
    return a.contains(Integer.valueOf(o));
  }
  
  public final void setStringInternal(a.a parama, String paramString1, String paramString2)
  {
    int i = o;
    if (i != 3)
    {
      if (i == 4) {
        e = paramString2;
      } else {
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] { Integer.valueOf(i) }));
      }
    }
    else {
      d = paramString2;
    }
    a.add(Integer.valueOf(i));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    Set localSet = a;
    if (localSet.contains(Integer.valueOf(1))) {
      z.z(paramParcel, 1, b);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      z.E(paramParcel, 2, c, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      z.F(paramParcel, 3, d, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      z.F(paramParcel, 4, e, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      z.F(paramParcel, 5, f, true);
    }
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */