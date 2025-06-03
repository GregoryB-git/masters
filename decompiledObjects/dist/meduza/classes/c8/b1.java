package c8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b1
{
  public static b1 a = new b1();
  
  public static SharedPreferences a(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[] { paramString }), 0);
  }
  
  public static void b(SharedPreferences paramSharedPreferences)
  {
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    paramSharedPreferences = paramSharedPreferences.getAll().keySet().iterator();
    while (paramSharedPreferences.hasNext()) {
      localEditor.remove((String)paramSharedPreferences.next());
    }
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     c8.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */