package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;
import java.util.Arrays;

public final class StaggeredGridLayoutManager$d$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public int a;
  public int b;
  public int[] c;
  public boolean d;
  
  public StaggeredGridLayoutManager$d$a() {}
  
  public StaggeredGridLayoutManager$d$a(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    d = bool;
    i = paramParcel.readInt();
    if (i > 0)
    {
      int[] arrayOfInt = new int[i];
      c = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FullSpanItem{mPosition=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mGapDir=");
    localStringBuilder.append(b);
    localStringBuilder.append(", mHasUnwantedGapAfter=");
    localStringBuilder.append(d);
    localStringBuilder.append(", mGapPerSpan=");
    localStringBuilder.append(Arrays.toString(c));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(d);
    int[] arrayOfInt = c;
    if ((arrayOfInt != null) && (arrayOfInt.length > 0))
    {
      paramParcel.writeInt(arrayOfInt.length);
      paramParcel.writeIntArray(c);
    }
    else
    {
      paramParcel.writeInt(0);
    }
  }
  
  public final class a
    implements Parcelable.Creator<StaggeredGridLayoutManager.d.a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new StaggeredGridLayoutManager.d.a(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new StaggeredGridLayoutManager.d.a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */