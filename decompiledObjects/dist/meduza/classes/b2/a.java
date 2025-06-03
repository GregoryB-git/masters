package b2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

public final class a
{
  public static <T extends e> T a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof ParcelImpl)) {
      return ((ParcelImpl)paramParcelable).a();
    }
    throw new IllegalArgumentException("Invalid parcel");
  }
  
  public static e b(Bundle paramBundle)
  {
    try
    {
      paramBundle = (Bundle)paramBundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
      if (paramBundle == null) {
        return null;
      }
      paramBundle.setClassLoader(a.class.getClassLoader());
      paramBundle = a(paramBundle.getParcelable("a"));
      return paramBundle;
    }
    catch (RuntimeException paramBundle) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     b2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */