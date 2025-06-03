package c0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.b;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public abstract class d
  extends BroadcastReceiver
{
  public static ComponentName a(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.MEDIA_BUTTON");
    localIntent.setPackage(paramContext.getPackageName());
    paramContext = paramContext.getPackageManager().queryBroadcastReceivers(localIntent, 0);
    if (paramContext.size() == 1)
    {
      paramContext = get0activityInfo;
      return new ComponentName(packageName, name);
    }
    if (paramContext.size() > 1) {
      Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
    }
    return null;
  }
  
  public static ComponentName b(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject = new Intent(paramString);
    ((Intent)localObject).setPackage(paramContext.getPackageName());
    localObject = localPackageManager.queryIntentServices((Intent)localObject, 0);
    if (((List)localObject).size() == 1)
    {
      paramContext = get0serviceInfo;
      return new ComponentName(packageName, name);
    }
    if (((List)localObject).isEmpty()) {
      return null;
    }
    paramContext = new StringBuilder();
    paramContext.append("Expected 1 service that handles ");
    paramContext.append(paramString);
    paramContext.append(", found ");
    paramContext.append(((List)localObject).size());
    throw new IllegalStateException(paramContext.toString());
  }
  
  public static KeyEvent c(MediaSessionCompat paramMediaSessionCompat, Intent paramIntent)
  {
    if ((paramMediaSessionCompat != null) && (paramIntent != null) && ("android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) && (paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      paramIntent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
      paramMediaSessionCompat.b().a(paramIntent);
      return paramIntent;
    }
    return null;
  }
  
  public void d(Intent paramIntent, ForegroundServiceStartNotAllowedException paramForegroundServiceStartNotAllowedException)
  {
    paramIntent = new StringBuilder();
    paramIntent.append("caught exception when trying to start a foreground service from the background: ");
    paramIntent.append(a.a(paramForegroundServiceStartNotAllowedException));
    Log.e("MediaButtonReceiver", paramIntent.toString());
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) && (paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      ComponentName localComponentName = b(paramContext, "android.intent.action.MEDIA_BUTTON");
      if (localComponentName != null)
      {
        paramIntent.setComponent(localComponentName);
        try
        {
          x.a.k(paramContext, paramIntent);
        }
        catch (IllegalStateException paramContext)
        {
          if (Build.VERSION.SDK_INT < 31) {
            break label79;
          }
        }
        if (a.b(paramContext))
        {
          d(paramIntent, a.a(paramContext));
          return;
        }
        label79:
        throw paramContext;
      }
      localComponentName = b(paramContext, "android.media.browse.MediaBrowserService");
      if (localComponentName != null)
      {
        BroadcastReceiver.PendingResult localPendingResult = goAsync();
        paramContext = paramContext.getApplicationContext();
        paramIntent = new b(paramContext, paramIntent, localPendingResult);
        paramContext = new MediaBrowserCompat(paramContext, localComponentName, paramIntent, null);
        paramIntent.f(paramContext);
        paramContext.a();
        return;
      }
      throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
    paramContext = new StringBuilder();
    paramContext.append("Ignore unsupported intent: ");
    paramContext.append(paramIntent);
    Log.d("MediaButtonReceiver", paramContext.toString());
  }
  
  public static final abstract class a
  {
    public static ForegroundServiceStartNotAllowedException a(IllegalStateException paramIllegalStateException)
    {
      return b.a(paramIllegalStateException);
    }
    
    public static boolean b(IllegalStateException paramIllegalStateException)
    {
      return c.a(paramIllegalStateException);
    }
  }
  
  public static class b
    extends MediaBrowserCompat.b
  {
    public final Context c;
    public final Intent d;
    public final BroadcastReceiver.PendingResult e;
    public MediaBrowserCompat f;
    
    public b(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
    {
      c = paramContext;
      d = paramIntent;
      e = paramPendingResult;
    }
    
    public void a()
    {
      new MediaControllerCompat(c, f.c()).a((KeyEvent)d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
      e();
    }
    
    public void b()
    {
      e();
    }
    
    public void c()
    {
      e();
    }
    
    public final void e()
    {
      f.b();
      e.finish();
    }
    
    public void f(MediaBrowserCompat paramMediaBrowserCompat)
    {
      f = paramMediaBrowserCompat;
    }
  }
}

/* Location:
 * Qualified Name:     c0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */