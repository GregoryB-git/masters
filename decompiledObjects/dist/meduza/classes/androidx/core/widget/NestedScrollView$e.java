package androidx.core.widget;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import f;

public final class NestedScrollView$e
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<e> CREATOR = new a();
  public int a;
  
  public NestedScrollView$e(Parcel paramParcel)
  {
    super(paramParcel);
    a = paramParcel.readInt();
  }
  
  public NestedScrollView$e(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("HorizontalScrollView.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" scrollPosition=");
    return j.m(localStringBuilder, a, "}");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(a);
  }
  
  public final class a
    implements Parcelable.Creator<NestedScrollView.e>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new NestedScrollView.e(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new NestedScrollView.e[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */