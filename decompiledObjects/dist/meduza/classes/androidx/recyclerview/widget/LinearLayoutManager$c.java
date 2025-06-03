package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class LinearLayoutManager$c
  implements Parcelable
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public int a;
  public int b;
  public boolean c;
  
  public LinearLayoutManager$c() {}
  
  public LinearLayoutManager$c(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    c = bool;
  }
  
  public LinearLayoutManager$c(c paramc)
  {
    a = a;
    b = b;
    c = c;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
  }
  
  public final class a
    implements Parcelable.Creator<LinearLayoutManager.c>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new LinearLayoutManager.c(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new LinearLayoutManager.c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */