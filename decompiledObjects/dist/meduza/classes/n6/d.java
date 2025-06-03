package n6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import m6.j;

public final class d
{
  public static <T extends c> T a(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    paramString = paramIntent.getByteArrayExtra(paramString);
    if (paramString == null) {
      return null;
    }
    j.i(paramCreator);
    paramIntent = Parcel.obtain();
    paramIntent.unmarshall(paramString, 0, paramString.length);
    paramIntent.setDataPosition(0);
    paramString = (c)paramCreator.createFromParcel(paramIntent);
    paramIntent.recycle();
    return paramString;
  }
}

/* Location:
 * Qualified Name:     n6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */