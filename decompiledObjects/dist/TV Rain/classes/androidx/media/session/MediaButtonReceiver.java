package androidx.media.session;

import a;
import android.app.PendingIntent;
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
import android.support.v4.media.MediaBrowserCompat.ConnectionCallback;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import java.util.List;

public class MediaButtonReceiver
  extends BroadcastReceiver
{
  private static final String TAG = "MediaButtonReceiver";
  
  public static PendingIntent buildMediaButtonPendingIntent(Context paramContext, long paramLong)
  {
    ComponentName localComponentName = getMediaButtonReceiverComponent(paramContext);
    if (localComponentName == null)
    {
      Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
      return null;
    }
    return buildMediaButtonPendingIntent(paramContext, localComponentName, paramLong);
  }
  
  public static PendingIntent buildMediaButtonPendingIntent(Context paramContext, ComponentName paramComponentName, long paramLong)
  {
    if (paramComponentName == null)
    {
      Log.w("MediaButtonReceiver", "The component name of media button receiver should be provided.");
      return null;
    }
    int i = PlaybackStateCompat.toKeyCode(paramLong);
    if (i == 0)
    {
      paramContext = new StringBuilder();
      paramContext.append("Cannot build a media button pending intent with the given action: ");
      paramContext.append(paramLong);
      Log.w("MediaButtonReceiver", paramContext.toString());
      return null;
    }
    Intent localIntent = new Intent("android.intent.action.MEDIA_BUTTON");
    localIntent.setComponent(paramComponentName);
    int j = 0;
    localIntent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
    int k = Build.VERSION.SDK_INT;
    localIntent.addFlags(268435456);
    if (k >= 31) {
      j = 33554432;
    }
    return PendingIntent.getBroadcast(paramContext, i, localIntent, j);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static ComponentName getMediaButtonReceiverComponent(Context paramContext)
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
  
  private static ComponentName getServiceComponentByAction(Context paramContext, String paramString)
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
    paramString = a.s("Expected 1 service that handles ", paramString, ", found ");
    paramString.append(paramContext.size());
    throw new IllegalStateException(paramString.toString());
  }
  
  public static KeyEvent handleIntent(MediaSessionCompat paramMediaSessionCompat, Intent paramIntent)
  {
    if ((paramMediaSessionCompat != null) && (paramIntent != null) && ("android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) && (paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      paramIntent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
      paramMediaSessionCompat.getController().dispatchMediaButtonEvent(paramIntent);
      return paramIntent;
    }
    return null;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) && (paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      ComponentName localComponentName = getServiceComponentByAction(paramContext, "android.intent.action.MEDIA_BUTTON");
      if (localComponentName != null)
      {
        paramIntent.setComponent(localComponentName);
        ContextCompat.startForegroundService(paramContext, paramIntent);
        return;
      }
      localComponentName = getServiceComponentByAction(paramContext, "android.media.browse.MediaBrowserService");
      if (localComponentName != null)
      {
        BroadcastReceiver.PendingResult localPendingResult = goAsync();
        paramContext = paramContext.getApplicationContext();
        paramIntent = new MediaButtonConnectionCallback(paramContext, paramIntent, localPendingResult);
        paramContext = new MediaBrowserCompat(paramContext, localComponentName, paramIntent, null);
        paramIntent.setMediaBrowser(paramContext);
        paramContext.connect();
        return;
      }
      throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
    paramContext = new StringBuilder();
    paramContext.append("Ignore unsupported intent: ");
    paramContext.append(paramIntent);
    Log.d("MediaButtonReceiver", paramContext.toString());
  }
  
  public static class MediaButtonConnectionCallback
    extends MediaBrowserCompat.ConnectionCallback
  {
    private final Context mContext;
    private final Intent mIntent;
    private MediaBrowserCompat mMediaBrowser;
    private final BroadcastReceiver.PendingResult mPendingResult;
    
    public MediaButtonConnectionCallback(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
    {
      mContext = paramContext;
      mIntent = paramIntent;
      mPendingResult = paramPendingResult;
    }
    
    private void finish()
    {
      mMediaBrowser.disconnect();
      mPendingResult.finish();
    }
    
    public void onConnected()
    {
      new MediaControllerCompat(mContext, mMediaBrowser.getSessionToken()).dispatchMediaButtonEvent((KeyEvent)mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
      finish();
    }
    
    public void onConnectionFailed()
    {
      finish();
    }
    
    public void onConnectionSuspended()
    {
      finish();
    }
    
    public void setMediaBrowser(MediaBrowserCompat paramMediaBrowserCompat)
    {
      mMediaBrowser = paramMediaBrowserCompat;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.session.MediaButtonReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */