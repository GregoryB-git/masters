package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class NestedScrollView$d
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<d> CREATOR = new a();
  public int o;
  
  public NestedScrollView$d(Parcel paramParcel)
  {
    super(paramParcel);
    o = paramParcel.readInt();
  }
  
  public NestedScrollView$d(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HorizontalScrollView.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" scrollPosition=");
    localStringBuilder.append(o);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(o);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public NestedScrollView.d a(Parcel paramParcel)
    {
      return new NestedScrollView.d(paramParcel);
    }
    
    public NestedScrollView.d[] b(int paramInt)
    {
      return new NestedScrollView.d[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */