package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import g;
import java.util.ArrayList;
import java.util.List;
import n6.a;

public final class d6
  extends a
{
  public static final Parcelable.Creator<d6> CREATOR = new c6();
  public final List<Integer> a;
  
  public d6(ArrayList paramArrayList)
  {
    a = paramArrayList;
  }
  
  public static d6 D(int... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Integer.valueOf(g.a(paramVarArgs[j])));
    }
    return new d6(localArrayList);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    List localList = a;
    paramInt = 0;
    if (localList != null)
    {
      int j = z.J(1, paramParcel);
      int k = localList.size();
      paramParcel.writeInt(k);
      while (paramInt < k)
      {
        paramParcel.writeInt(((Integer)localList.get(paramInt)).intValue());
        paramInt++;
      }
      z.L(j, paramParcel);
    }
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.d6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */