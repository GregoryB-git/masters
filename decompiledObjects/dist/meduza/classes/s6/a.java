package s6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t6.a.b;

public final class a
  extends n6.a
  implements a.b<String, Integer>
{
  public static final Parcelable.Creator<a> CREATOR = new e();
  public final int a;
  public final HashMap b;
  public final SparseArray c;
  
  public a()
  {
    a = 1;
    b = new HashMap();
    c = new SparseArray();
  }
  
  public a(int paramInt, ArrayList paramArrayList)
  {
    a = paramInt;
    b = new HashMap();
    c = new SparseArray();
    int i = paramArrayList.size();
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      d locald = (d)paramArrayList.get(paramInt);
      String str = b;
      int j = c;
      b.put(str, Integer.valueOf(j));
      c.put(j, str);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = a;
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, paramInt);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new d(str, ((Integer)b.get(str)).intValue()));
    }
    z.I(paramParcel, 2, localArrayList, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     s6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */