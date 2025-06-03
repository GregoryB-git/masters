package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public final class a
  implements Parcelable
{
  @NonNull
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final int o;
  public final Intent p;
  
  public a(int paramInt, Intent paramIntent)
  {
    o = paramInt;
    p = paramIntent;
  }
  
  public a(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    if (paramParcel.readInt() == 0) {
      paramParcel = null;
    } else {
      paramParcel = (Intent)Intent.CREATOR.createFromParcel(paramParcel);
    }
    p = paramParcel;
  }
  
  public static String c(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 0) {
        return String.valueOf(paramInt);
      }
      return "RESULT_CANCELED";
    }
    return "RESULT_OK";
  }
  
  public Intent a()
  {
    return p;
  }
  
  public int b()
  {
    return o;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ActivityResult{resultCode=");
    localStringBuilder.append(c(o));
    localStringBuilder.append(", data=");
    localStringBuilder.append(p);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    int i;
    if (p == null) {
      i = 0;
    } else {
      i = 1;
    }
    paramParcel.writeInt(i);
    Intent localIntent = p;
    if (localIntent != null) {
      localIntent.writeToParcel(paramParcel, paramInt);
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */