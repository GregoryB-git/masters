package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;

public final class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final int a;
  public final Intent b;
  
  public a(int paramInt, Intent paramIntent)
  {
    a = paramInt;
    b = paramIntent;
  }
  
  public a(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    if (paramParcel.readInt() == 0) {
      paramParcel = null;
    } else {
      paramParcel = (Intent)Intent.CREATOR.createFromParcel(paramParcel);
    }
    b = paramParcel;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ActivityResult{resultCode=");
    int i = a;
    String str;
    if (i != -1)
    {
      if (i != 0) {
        str = String.valueOf(i);
      } else {
        str = "RESULT_CANCELED";
      }
    }
    else {
      str = "RESULT_OK";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(", data=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    int i;
    if (b == null) {
      i = 0;
    } else {
      i = 1;
    }
    paramParcel.writeInt(i);
    Intent localIntent = b;
    if (localIntent != null) {
      localIntent.writeToParcel(paramParcel, paramInt);
    }
  }
  
  public final class a
    implements Parcelable.Creator<a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */