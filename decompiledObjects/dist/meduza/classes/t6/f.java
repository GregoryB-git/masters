package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n6.a;

public final class f
  extends a
{
  public static final Parcelable.Creator<f> CREATOR = new j();
  public final int a;
  public final String b;
  public final ArrayList c;
  
  public f(int paramInt, String paramString, ArrayList paramArrayList)
  {
    a = paramInt;
    b = paramString;
    c = paramArrayList;
  }
  
  public f(String paramString, Map paramMap)
  {
    a = 1;
    b = paramString;
    if (paramMap == null)
    {
      paramString = null;
    }
    else
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramMap.keySet().iterator();
      for (;;)
      {
        paramString = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        paramString = (String)localIterator.next();
        localArrayList.add(new g((a.a)paramMap.get(paramString), paramString));
      }
    }
    c = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = a;
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, paramInt);
    z.F(paramParcel, 2, b, false);
    z.I(paramParcel, 3, c, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     t6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */