package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import c3.q;
import com.google.crypto.tink.shaded.protobuf.a;
import java.io.IOException;
import p3.C;
import p3.t;
import q3.k;

public final class d
  implements q
{
  public final SharedPreferences.Editor a;
  public final String b;
  
  public d(Context paramContext, String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      b = paramString1;
      paramContext = paramContext.getApplicationContext();
      if (paramString2 == null) {}
      for (paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext);; paramContext = paramContext.getSharedPreferences(paramString2, 0))
      {
        a = paramContext.edit();
        break;
      }
      return;
    }
    throw new IllegalArgumentException("keysetName cannot be null");
  }
  
  public void a(t paramt)
  {
    if (a.putString(b, k.b(paramt.f())).commit()) {
      return;
    }
    throw new IOException("Failed to write to SharedPreferences");
  }
  
  public void b(C paramC)
  {
    if (a.putString(b, k.b(paramC.f())).commit()) {
      return;
    }
    throw new IOException("Failed to write to SharedPreferences");
  }
}

/* Location:
 * Qualified Name:     j3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */