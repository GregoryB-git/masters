package i1;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.c;
import android.support.v4.media.MediaBrowserCompat.d;
import android.support.v4.media.MediaBrowserCompat.e;
import android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import f;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class a
  extends BroadcastReceiver
{
  public static ComponentName a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString);
    localIntent.setPackage(paramContext.getPackageName());
    paramContext = localPackageManager.queryIntentServices(localIntent, 0);
    if (paramContext.size() == 1)
    {
      paramContext = get0serviceInfo;
      return new ComponentName(packageName, name);
    }
    if (paramContext.isEmpty()) {
      return null;
    }
    paramString = f.m("Expected 1 service that handles ", paramString, ", found ");
    paramString.append(paramContext.size());
    throw new IllegalStateException(paramString.toString());
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) && (paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      ComponentName localComponentName = a(paramContext, "android.intent.action.MEDIA_BUTTON");
      if (localComponentName != null)
      {
        paramIntent.setComponent(localComponentName);
        v.a.startForegroundService(paramContext, paramIntent);
        return;
      }
      localComponentName = a(paramContext, "android.media.browse.MediaBrowserService");
      if (localComponentName != null)
      {
        BroadcastReceiver.PendingResult localPendingResult = goAsync();
        paramContext = paramContext.getApplicationContext();
        paramIntent = new a(paramContext, paramIntent, localPendingResult);
        paramContext = new MediaBrowserCompat(paramContext, localComponentName, paramIntent);
        f = paramContext;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        a.b.connect();
        return;
      }
      throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
    paramContext = new StringBuilder();
    paramContext.append("Ignore unsupported intent: ");
    paramContext.append(paramIntent);
    Log.d("MediaButtonReceiver", paramContext.toString());
  }
  
  public static final class a
    extends MediaBrowserCompat.c
  {
    public final Context c;
    public final Intent d;
    public final BroadcastReceiver.PendingResult e;
    public MediaBrowserCompat f;
    
    public a(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
    {
      c = paramContext;
      d = paramIntent;
      e = paramPendingResult;
    }
    
    public final void a()
    {
      Object localObject1 = c;
      MediaBrowserCompat.e locale = f.a;
      if (h == null)
      {
        MediaSession.Token localToken = b.getSessionToken();
        localObject2 = null;
        if (localToken != null) {
          localObject2 = new MediaSessionCompat.Token(localToken, null, null);
        }
        h = ((MediaSessionCompat.Token)localObject2);
      }
      Object localObject2 = h;
      new ConcurrentHashMap();
      if (localObject2 != null)
      {
        localObject1 = new MediaControllerCompat.MediaControllerImplApi21((Context)localObject1, (MediaSessionCompat.Token)localObject2);
        localObject2 = (KeyEvent)d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (localObject2 != null)
        {
          a.dispatchMediaButtonEvent((KeyEvent)localObject2);
          f.a();
          e.finish();
          return;
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
      }
      throw new IllegalArgumentException("sessionToken must not be null");
    }
    
    public final void b()
    {
      f.a();
      e.finish();
    }
    
    public final void c()
    {
      f.a();
      e.finish();
    }
  }
}

/* Location:
 * Qualified Name:     i1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */