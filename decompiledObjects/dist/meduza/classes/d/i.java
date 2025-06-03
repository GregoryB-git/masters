package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class i
  implements Parcelable
{
  public static final Parcelable.Creator<i> CREATOR = new a();
  public final IntentSender a;
  public final Intent b;
  public final int c;
  public final int d;
  
  public i(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2)
  {
    a = paramIntentSender;
    b = paramIntent;
    c = paramInt1;
    d = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ec.i.e(paramParcel, "dest");
    paramParcel.writeParcelable(a, paramInt);
    paramParcel.writeParcelable(b, paramInt);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
  }
  
  public static final class a
    implements Parcelable.Creator<i>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      ec.i.e(paramParcel, "inParcel");
      Parcelable localParcelable = paramParcel.readParcelable(IntentSender.class.getClassLoader());
      ec.i.b(localParcelable);
      return new i((IntentSender)localParcelable, (Intent)paramParcel.readParcelable(Intent.class.getClassLoader()), paramParcel.readInt(), paramParcel.readInt());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new i[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     d.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */