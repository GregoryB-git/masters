package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import ec.i;

public final class CredentialProviderMetadataHolder
  extends Service
{
  public final LocalBinder a = new LocalBinder();
  
  public final IBinder onBind(Intent paramIntent)
  {
    i.e(paramIntent, "intent");
    return a;
  }
  
  public final class LocalBinder
    extends Binder
  {}
}

/* Location:
 * Qualified Name:     androidx.credentials.playservices.CredentialProviderMetadataHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */