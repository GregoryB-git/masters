package G1;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import x1.B;

public final class o$a
{
  public final void a()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
    localEditor.apply();
  }
  
  public final o b()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(B.l());
    if (!localSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
      return null;
    }
    return new o(localSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), localSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
  }
}

/* Location:
 * Qualified Name:     G1.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */