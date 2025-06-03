package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import v5.e0;

public final class j
  extends h
{
  public static final Parcelable.Creator<j> CREATOR = new a();
  public final int b;
  public final int c;
  public final int d;
  public final int[] e;
  public final int[] f;
  
  public j(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    super("MLLT");
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramArrayOfInt1;
    f = paramArrayOfInt2;
  }
  
  public j(Parcel paramParcel)
  {
    super("MLLT");
    b = paramParcel.readInt();
    c = paramParcel.readInt();
    d = paramParcel.readInt();
    int[] arrayOfInt = paramParcel.createIntArray();
    int i = e0.a;
    e = arrayOfInt;
    f = paramParcel.createIntArray();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (j.class == paramObject.getClass()))
    {
      paramObject = (j)paramObject;
      if ((b != b) || (c != c) || (d != d) || (!Arrays.equals(e, e)) || (!Arrays.equals(f, f))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = b;
    int j = c;
    int k = d;
    int m = Arrays.hashCode(e);
    return Arrays.hashCode(f) + (m + (((527 + i) * 31 + j) * 31 + k) * 31) * 31;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
    paramParcel.writeIntArray(e);
    paramParcel.writeIntArray(f);
  }
  
  public final class a
    implements Parcelable.Creator<j>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new j(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new j[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */