package androidx.appcompat.widget;

import N.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public class SearchView$o
  extends a
{
  public static final Parcelable.Creator<o> CREATOR = new a();
  public boolean q;
  
  public SearchView$o(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    q = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }
  
  public SearchView$o(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SearchView.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" isIconified=");
    localStringBuilder.append(q);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeValue(Boolean.valueOf(q));
  }
  
  public class a
    implements Parcelable.ClassLoaderCreator
  {
    public SearchView.o a(Parcel paramParcel)
    {
      return new SearchView.o(paramParcel, null);
    }
    
    public SearchView.o b(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      return new SearchView.o(paramParcel, paramClassLoader);
    }
    
    public SearchView.o[] c(int paramInt)
    {
      return new SearchView.o[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */