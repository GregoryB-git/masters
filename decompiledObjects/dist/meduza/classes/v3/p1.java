package v3;

import aa.m0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import b.d;
import v5.l;
import x6.b;

public final class p1
{
  public final Context a;
  public final Handler b;
  public final a c;
  public final AudioManager d;
  public b e;
  public int f;
  public int g;
  public boolean h;
  
  public p1(Context paramContext, Handler paramHandler, d0.b paramb)
  {
    paramContext = paramContext.getApplicationContext();
    a = paramContext;
    b = paramHandler;
    c = paramb;
    paramHandler = (AudioManager)paramContext.getSystemService("audio");
    b.K(paramHandler);
    d = paramHandler;
    f = 3;
    g = a(paramHandler, 3);
    int i = f;
    boolean bool;
    if (v5.e0.a >= 23) {
      bool = paramHandler.isStreamMute(i);
    } else if (a(paramHandler, i) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    h = bool;
    paramb = new b();
    paramHandler = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
    try
    {
      paramContext.registerReceiver(paramb, paramHandler);
      e = paramb;
    }
    catch (RuntimeException paramContext)
    {
      v5.m.g("StreamVolumeManager", "Error registering stream volume receiver", paramContext);
    }
  }
  
  public static int a(AudioManager paramAudioManager, int paramInt)
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
      v5.m.g("StreamVolumeManager", localStringBuilder.toString(), localRuntimeException);
    }
    return paramAudioManager.getStreamMaxVolume(paramInt);
  }
  
  public final void b(int paramInt)
  {
    if (f == paramInt) {
      return;
    }
    f = paramInt;
    c();
    Object localObject = (d0.b)c;
    m localm = d0.Y(a.B);
    if (!localm.equals(a.c0))
    {
      localObject = a;
      c0 = localm;
      l.e(29, new m0(localm, 2));
    }
  }
  
  public final void c()
  {
    int i = a(d, f);
    AudioManager localAudioManager = d;
    int j = f;
    boolean bool;
    if (v5.e0.a >= 23) {
      bool = localAudioManager.isStreamMute(j);
    } else if (a(localAudioManager, j) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    if ((g != i) || (h != bool))
    {
      g = i;
      h = bool;
      c).a.l.e(30, new e0(i, bool));
    }
  }
  
  public static abstract interface a {}
  
  public final class b
    extends BroadcastReceiver
  {
    public b() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = p1.this;
      b.post(new d(paramContext, 7));
    }
  }
}

/* Location:
 * Qualified Name:     v3.p1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */