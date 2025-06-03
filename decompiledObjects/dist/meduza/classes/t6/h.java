package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m6.j;
import n6.a;

public final class h
  extends a
{
  public static final Parcelable.Creator<h> CREATOR = new i();
  public final int a;
  public final HashMap b;
  public final String c;
  
  public h(int paramInt, String paramString, ArrayList paramArrayList)
  {
    a = paramInt;
    HashMap localHashMap1 = new HashMap();
    int i = paramArrayList.size();
    Object localObject1;
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      f localf = (f)paramArrayList.get(paramInt);
      localObject1 = b;
      HashMap localHashMap2 = new HashMap();
      Object localObject2 = c;
      j.i(localObject2);
      int j = ((ArrayList)localObject2).size();
      for (int k = 0; k < j; k++)
      {
        localObject2 = (g)c.get(k);
        localHashMap2.put(b, c);
      }
      localHashMap1.put(localObject1, localHashMap2);
    }
    b = localHashMap1;
    j.i(paramString);
    c = paramString;
    paramString = localHashMap1.keySet().iterator();
    while (paramString.hasNext())
    {
      paramArrayList = (String)paramString.next();
      localObject1 = (Map)b.get(paramArrayList);
      paramArrayList = ((Map)localObject1).keySet().iterator();
      while (paramArrayList.hasNext()) {
        getnextr = this;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(":\n");
      localObject = (Map)b.get(localObject);
      Iterator localIterator2 = ((Map)localObject).keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        localStringBuilder.append("  ");
        localStringBuilder.append(str);
        localStringBuilder.append(": ");
        localStringBuilder.append(((Map)localObject).get(str));
      }
    }
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new f(str, (Map)b.get(str)));
    }
    z.I(paramParcel, 2, localArrayList, false);
    z.F(paramParcel, 3, c, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     t6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */