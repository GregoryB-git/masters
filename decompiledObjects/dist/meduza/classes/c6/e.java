package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r.b;
import r.h;
import t6.a.a;

public final class e
  extends zzbz
{
  public static final Parcelable.Creator<e> CREATOR = new f();
  public static final b o;
  public final int a;
  public List b;
  public List c;
  public List d;
  public List e;
  public List f;
  
  static
  {
    b localb = new b();
    o = localb;
    localb.put("registered", a.a.D(2, "registered"));
    localb.put("in_progress", a.a.D(3, "in_progress"));
    localb.put("success", a.a.D(4, "success"));
    localb.put("failed", a.a.D(5, "failed"));
    localb.put("escrowed", a.a.D(6, "escrowed"));
  }
  
  public e()
  {
    a = 1;
  }
  
  public e(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4, ArrayList paramArrayList5)
  {
    a = paramInt;
    b = paramArrayList1;
    c = paramArrayList2;
    d = paramArrayList3;
    e = paramArrayList4;
    f = paramArrayList5;
  }
  
  public final Map getFieldMappings()
  {
    return o;
  }
  
  public final Object getFieldValue(a.a parama)
  {
    switch (o)
    {
    default: 
      break;
    case 6: 
      return f;
    case 5: 
      return e;
    case 4: 
      return d;
    case 3: 
      return c;
    case 2: 
      return b;
    case 1: 
      return Integer.valueOf(a);
    }
    throw new IllegalStateException(f.h("Unknown SafeParcelable id=", o));
  }
  
  public final boolean isFieldSet(a.a parama)
  {
    return true;
  }
  
  public final void setStringsInternal(a.a parama, String paramString, ArrayList paramArrayList)
  {
    int i = o;
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 4)
        {
          if (i != 5)
          {
            if (i == 6)
            {
              f = paramArrayList;
              return;
            }
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[] { Integer.valueOf(i) }));
          }
          e = paramArrayList;
          return;
        }
        d = paramArrayList;
        return;
      }
      c = paramArrayList;
      return;
    }
    b = paramArrayList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.G(paramParcel, 2, b);
    z.G(paramParcel, 3, c);
    z.G(paramParcel, 4, d);
    z.G(paramParcel, 5, e);
    z.G(paramParcel, 6, f);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */