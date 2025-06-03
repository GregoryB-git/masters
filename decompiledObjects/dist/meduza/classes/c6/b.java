package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import t6.a;
import t6.a.a;

public final class b
  extends zzbz
{
  public static final Parcelable.Creator<b> CREATOR = new c();
  public static final HashMap f;
  public final Set a;
  public final int b;
  public ArrayList c;
  public int d;
  public e e;
  
  static
  {
    HashMap localHashMap = new HashMap();
    f = localHashMap;
    localHashMap.put("authenticatorData", new a.a(11, true, 11, true, "authenticatorData", 2, g.class));
    localHashMap.put("progress", new a.a(11, false, 11, false, "progress", 4, e.class));
  }
  
  public b()
  {
    a = new HashSet(1);
    b = 1;
  }
  
  public b(HashSet paramHashSet, int paramInt1, ArrayList paramArrayList, int paramInt2, e parame)
  {
    a = paramHashSet;
    b = paramInt1;
    c = paramArrayList;
    d = paramInt2;
    e = parame;
  }
  
  public final void addConcreteTypeArrayInternal(a.a parama, String paramString, ArrayList paramArrayList)
  {
    int i = o;
    if (i == 2)
    {
      c = paramArrayList;
      a.add(Integer.valueOf(i));
      return;
    }
    throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[] { Integer.valueOf(i), paramArrayList.getClass().getCanonicalName() }));
  }
  
  public final void addConcreteTypeInternal(a.a parama, String paramString, a parama1)
  {
    int i = o;
    if (i == 4)
    {
      e = ((e)parama1);
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
        if (i == 4) {
          return e;
        }
        throw new IllegalStateException(f.h("Unknown SafeParcelable id=", o));
      }
      return c;
    }
    return Integer.valueOf(b);
  }
  
  public final boolean isFieldSet(a.a parama)
  {
    return a.contains(Integer.valueOf(o));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    Set localSet = a;
    if (localSet.contains(Integer.valueOf(1))) {
      z.z(paramParcel, 1, b);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      z.I(paramParcel, 2, c, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      z.z(paramParcel, 3, d);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      z.E(paramParcel, 4, e, paramInt, true);
    }
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */