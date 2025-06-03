package b8;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.firebase_auth_api.zzaed;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import u7.f;
import u7.j;

public final class b0$a
{
  public final Bundle a;
  public final Bundle b;
  
  public b0$a(String arg1, FirebaseAuth paramFirebaseAuth)
  {
    Bundle localBundle = new Bundle();
    a = localBundle;
    Object localObject = new Bundle();
    b = ((Bundle)localObject);
    f localf = a;
    localf.a();
    localBundle.putString("com.google.firebase.auth.KEY_API_KEY", c.a);
    localBundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", ???);
    localBundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", (Bundle)localObject);
    localBundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
    synchronized (j)
    {
      localObject = k;
      localBundle.putString("com.google.firebase.auth.KEY_TENANT_ID", (String)localObject);
      ??? = a;
      ???.a();
      localBundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", b);
      localBundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", B);
      return;
    }
  }
  
  public final void a(Map paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      b.putString((String)localEntry.getKey(), (String)localEntry.getValue());
    }
  }
}

/* Location:
 * Qualified Name:     b8.b0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */