package G1;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import x1.B;

public final class o
{
  public static final a c = new a(null);
  public final String a;
  public final boolean b;
  
  public o(String paramString, boolean paramBoolean)
  {
    a = paramString;
    b = paramBoolean;
  }
  
  public final void a()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
    localEditor.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", a);
    localEditor.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", b);
    localEditor.apply();
  }
  
  public String toString()
  {
    String str;
    if (b) {
      str = "Applink";
    } else {
      str = "Unclassified";
    }
    Object localObject = str;
    if (a != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append('(');
      ((StringBuilder)localObject).append(a);
      ((StringBuilder)localObject).append(')');
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     G1.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */