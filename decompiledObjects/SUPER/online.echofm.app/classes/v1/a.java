package v1;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

public abstract class a
{
  public static d a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof ParcelImpl)) {
      return ((ParcelImpl)paramParcelable).a();
    }
    throw new IllegalArgumentException("Invalid parcel");
  }
  
  public static d b(Bundle paramBundle, String paramString)
  {
    try
    {
      paramBundle = (Bundle)paramBundle.getParcelable(paramString);
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
  
  public static void c(Bundle paramBundle, String paramString, d paramd)
  {
    if (paramd == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("a", d(paramd));
    paramBundle.putParcelable(paramString, localBundle);
  }
  
  public static Parcelable d(d paramd)
  {
    return new ParcelImpl(paramd);
  }
}

/* Location:
 * Qualified Name:     v1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */