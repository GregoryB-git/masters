package T0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import java.util.Arrays;

public final class l
  extends i
{
  public static final Parcelable.Creator<l> CREATOR = new a();
  public final int p;
  public final int q;
  public final int r;
  public final int[] s;
  public final int[] t;
  
  public l(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    super("MLLT");
    p = paramInt1;
    q = paramInt2;
    r = paramInt3;
    s = paramArrayOfInt1;
    t = paramArrayOfInt2;
  }
  
  public l(Parcel paramParcel)
  {
    super("MLLT");
    p = paramParcel.readInt();
    q = paramParcel.readInt();
    r = paramParcel.readInt();
    s = ((int[])M.i(paramParcel.createIntArray()));
    t = ((int[])M.i(paramParcel.createIntArray()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (l.class == paramObject.getClass()))
    {
      paramObject = (l)paramObject;
      if ((p != p) || (q != q) || (r != r) || (!Arrays.equals(s, s)) || (!Arrays.equals(t, t))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((527 + p) * 31 + q) * 31 + r) * 31 + Arrays.hashCode(s)) * 31 + Arrays.hashCode(t);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(p);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
    paramParcel.writeIntArray(s);
    paramParcel.writeIntArray(t);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public l a(Parcel paramParcel)
    {
      return new l(paramParcel);
    }
    
    public l[] b(int paramInt)
    {
      return new l[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */