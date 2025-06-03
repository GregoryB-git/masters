package m0;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import d0.b;
import g0.M;
import g0.a;

public final class i
{
  public final Context a;
  public final f b;
  public final Handler c;
  public final c d;
  public final BroadcastReceiver e;
  public final d f;
  public e g;
  public j h;
  public b i;
  public boolean j;
  
  public i(Context paramContext, f paramf, b paramb, j paramj)
  {
    Context localContext = paramContext.getApplicationContext();
    a = localContext;
    b = ((f)a.e(paramf));
    i = paramb;
    h = paramj;
    paramb = M.C();
    c = paramb;
    int k = M.a;
    paramf = null;
    if (k >= 23) {
      paramContext = new c(null);
    } else {
      paramContext = null;
    }
    d = paramContext;
    if (k >= 21) {
      paramContext = new e(null);
    } else {
      paramContext = null;
    }
    e = paramContext;
    paramj = e.j();
    paramContext = paramf;
    if (paramj != null) {
      paramContext = new d(paramb, localContext.getContentResolver(), paramj);
    }
    f = paramContext;
  }
  
  public final void f(e parame)
  {
    if ((j) && (!parame.equals(g)))
    {
      g = parame;
      b.a(parame);
    }
  }
  
  public e g()
  {
    if (j) {
      return (e)a.e(g);
    }
    j = true;
    Object localObject = f;
    if (localObject != null) {
      ((d)localObject).a();
    }
    if (M.a >= 23)
    {
      localObject = d;
      if (localObject != null) {
        b.a(a, (AudioDeviceCallback)localObject, c);
      }
    }
    BroadcastReceiver localBroadcastReceiver = e;
    localObject = null;
    if (localBroadcastReceiver != null)
    {
      localObject = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
      localObject = a.registerReceiver(e, (IntentFilter)localObject, null, c);
    }
    localObject = e.f(a, (Intent)localObject, i, h);
    g = ((e)localObject);
    return (e)localObject;
  }
  
  public void h(b paramb)
  {
    i = paramb;
    f(e.g(a, paramb, h));
  }
  
  public void i(AudioDeviceInfo paramAudioDeviceInfo)
  {
    Object localObject1 = h;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = a;
    }
    if (M.c(paramAudioDeviceInfo, localObject1)) {
      return;
    }
    localObject1 = localObject2;
    if (paramAudioDeviceInfo != null) {
      localObject1 = new j(paramAudioDeviceInfo);
    }
    h = ((j)localObject1);
    f(e.g(a, i, (j)localObject1));
  }
  
  public void j()
  {
    if (!j) {
      return;
    }
    g = null;
    if (M.a >= 23)
    {
      localObject = d;
      if (localObject != null) {
        b.b(a, (AudioDeviceCallback)localObject);
      }
    }
    Object localObject = e;
    if (localObject != null) {
      a.unregisterReceiver((BroadcastReceiver)localObject);
    }
    localObject = f;
    if (localObject != null) {
      ((d)localObject).b();
    }
    j = false;
  }
  
  public static final abstract class b
  {
    public static void a(Context paramContext, AudioDeviceCallback paramAudioDeviceCallback, Handler paramHandler)
    {
      ((AudioManager)a.e((AudioManager)paramContext.getSystemService("audio"))).registerAudioDeviceCallback(paramAudioDeviceCallback, paramHandler);
    }
    
    public static void b(Context paramContext, AudioDeviceCallback paramAudioDeviceCallback)
    {
      ((AudioManager)a.e((AudioManager)paramContext.getSystemService("audio"))).unregisterAudioDeviceCallback(paramAudioDeviceCallback);
    }
  }
  
  public final class c
    extends AudioDeviceCallback
  {
    public c() {}
    
    public void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      paramArrayOfAudioDeviceInfo = i.this;
      i.d(paramArrayOfAudioDeviceInfo, e.g(i.e(paramArrayOfAudioDeviceInfo), i.a(i.this), i.b(i.this)));
    }
    
    public void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      if (M.s(paramArrayOfAudioDeviceInfo, i.b(i.this))) {
        i.c(i.this, null);
      }
      paramArrayOfAudioDeviceInfo = i.this;
      i.d(paramArrayOfAudioDeviceInfo, e.g(i.e(paramArrayOfAudioDeviceInfo), i.a(i.this), i.b(i.this)));
    }
  }
  
  public final class d
    extends ContentObserver
  {
    public final ContentResolver a;
    public final Uri b;
    
    public d(Handler paramHandler, ContentResolver paramContentResolver, Uri paramUri)
    {
      super();
      a = paramContentResolver;
      b = paramUri;
    }
    
    public void a()
    {
      a.registerContentObserver(b, false, this);
    }
    
    public void b()
    {
      a.unregisterContentObserver(this);
    }
    
    public void onChange(boolean paramBoolean)
    {
      i locali = i.this;
      i.d(locali, e.g(i.e(locali), i.a(i.this), i.b(i.this)));
    }
  }
  
  public final class e
    extends BroadcastReceiver
  {
    public e() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if (!isInitialStickyBroadcast())
      {
        i locali = i.this;
        i.d(locali, e.f(paramContext, paramIntent, i.a(locali), i.b(i.this)));
      }
    }
  }
  
  public static abstract interface f
  {
    public abstract void a(e parame);
  }
}

/* Location:
 * Qualified Name:     m0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */