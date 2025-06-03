package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import g0.M;
import g0.a;
import g0.o;

public final class g1
{
  public final Context a;
  public final Handler b;
  public final b c;
  public final AudioManager d;
  public c e;
  public int f;
  public int g;
  public boolean h;
  
  public g1(Context paramContext, Handler paramHandler, b paramb)
  {
    paramContext = paramContext.getApplicationContext();
    a = paramContext;
    b = paramHandler;
    c = paramb;
    paramHandler = (AudioManager)a.h((AudioManager)paramContext.getSystemService("audio"));
    d = paramHandler;
    f = 3;
    g = f(paramHandler, 3);
    h = e(paramHandler, f);
    paramHandler = new c(null);
    paramb = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
    try
    {
      paramContext.registerReceiver(paramHandler, paramb);
      e = paramHandler;
    }
    catch (RuntimeException paramContext)
    {
      o.i("StreamVolumeManager", "Error registering stream volume receiver", paramContext);
    }
  }
  
  public static boolean e(AudioManager paramAudioManager, int paramInt)
  {
    if (M.a >= 23) {
      return paramAudioManager.isStreamMute(paramInt);
    }
    boolean bool;
    if (f(paramAudioManager, paramInt) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int f(AudioManager paramAudioManager, int paramInt)
  {
    try
    {
      int i = paramAudioManager.getStreamVolume(paramInt);
      return i;
    }
    catch (RuntimeException localRuntimeException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not retrieve stream volume for stream type ");
      localStringBuilder.append(paramInt);
      o.i("StreamVolumeManager", localStringBuilder.toString(), localRuntimeException);
    }
    return paramAudioManager.getStreamMaxVolume(paramInt);
  }
  
  public int c()
  {
    return d.getStreamMaxVolume(f);
  }
  
  public int d()
  {
    int i;
    if (M.a >= 28) {
      i = f1.a(d, f);
    } else {
      i = 0;
    }
    return i;
  }
  
  public void g()
  {
    c localc = e;
    if (localc != null)
    {
      try
      {
        a.unregisterReceiver(localc);
      }
      catch (RuntimeException localRuntimeException)
      {
        o.i("StreamVolumeManager", "Error unregistering stream volume receiver", localRuntimeException);
      }
      e = null;
    }
  }
  
  public void h(int paramInt)
  {
    if (f == paramInt) {
      return;
    }
    f = paramInt;
    i();
    c.D(paramInt);
  }
  
  public final void i()
  {
    int i = f(d, f);
    boolean bool = e(d, f);
    if ((g != i) || (h != bool))
    {
      g = i;
      h = bool;
      c.B(i, bool);
    }
  }
  
  public static abstract interface b
  {
    public abstract void B(int paramInt, boolean paramBoolean);
    
    public abstract void D(int paramInt);
  }
  
  public final class c
    extends BroadcastReceiver
  {
    public c() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      g1.a(g1.this).post(new h1(g1.this));
    }
  }
}

/* Location:
 * Qualified Name:     k0.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */