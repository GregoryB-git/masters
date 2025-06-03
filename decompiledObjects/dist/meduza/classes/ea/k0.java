package ea;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import ec.i;
import rb.h;
import u7.f;

public final class k0
  implements j0
{
  public final f a;
  
  public k0(f paramf)
  {
    a = paramf;
  }
  
  public final void a(Messenger paramMessenger, h0.b paramb)
  {
    i.e(paramb, "serviceConnection");
    Object localObject = a;
    ((f)localObject).a();
    localObject = a.getApplicationContext();
    i.d(localObject, "firebaseApp.applicationContext.applicationContext");
    Intent localIntent = new Intent((Context)localObject, SessionLifecycleService.class);
    Log.d("LifecycleServiceBinder", "Binding service to application.");
    localIntent.setAction(String.valueOf(Process.myPid()));
    localIntent.putExtra("ClientCallbackMessenger", paramMessenger);
    localIntent.setPackage(((Context)localObject).getPackageName());
    boolean bool;
    try
    {
      bool = ((Context)localObject).bindService(localIntent, paramb, 65);
    }
    catch (SecurityException paramMessenger)
    {
      Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", paramMessenger);
      bool = false;
    }
    if (!bool)
    {
      try
      {
        ((Context)localObject).unbindService(paramb);
        paramMessenger = h.a;
      }
      catch (IllegalArgumentException paramMessenger)
      {
        Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", paramMessenger);
      }
      Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
  }
}

/* Location:
 * Qualified Name:     ea.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */