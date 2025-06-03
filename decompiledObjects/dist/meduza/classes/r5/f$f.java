package r5;

import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import o7.k0;
import v3.i0;
import v5.e0;
import x3.d;
import x3.d.c;

public final class f$f
{
  public final Spatializer a;
  public final boolean b;
  public Handler c;
  public a d;
  
  public f$f(Spatializer paramSpatializer)
  {
    a = paramSpatializer;
    boolean bool;
    if (paramSpatializer.getImmersiveAudioLevel() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
  }
  
  public static f f(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = new f(paramContext.getSpatializer());
    }
    return paramContext;
  }
  
  public final boolean a(i0 parami0, d paramd)
  {
    if (("audio/eac3-joc".equals(t)) && (G == 16)) {
      i = 12;
    } else {
      i = G;
    }
    AudioFormat.Builder localBuilder = new AudioFormat.Builder().setEncoding(2).setChannelMask(e0.o(i));
    int i = H;
    if (i != -1) {
      localBuilder.setSampleRate(i);
    }
    return a.canBeSpatialized(aa, localBuilder.build());
  }
  
  public final void b(f paramf, Looper paramLooper)
  {
    if ((d == null) && (c == null))
    {
      d = new a(paramf);
      paramf = new Handler(paramLooper);
      c = paramf;
      a.addOnSpatializerStateChangedListener(new g(paramf), d);
    }
  }
  
  public final boolean c()
  {
    return a.isAvailable();
  }
  
  public final boolean d()
  {
    return a.isEnabled();
  }
  
  public final void e()
  {
    Object localObject = d;
    if ((localObject != null) && (c != null))
    {
      a.removeOnSpatializerStateChangedListener((Spatializer.OnSpatializerStateChangedListener)localObject);
      localObject = c;
      int i = e0.a;
      ((Handler)localObject).removeCallbacksAndMessages(null);
      c = null;
      d = null;
    }
  }
  
  public final class a
    implements Spatializer.OnSpatializerStateChangedListener
  {
    public a() {}
    
    public final void onSpatializerAvailableChanged(Spatializer paramSpatializer, boolean paramBoolean)
    {
      f localf = f.f.this;
      paramSpatializer = f.j;
      localf.j();
    }
    
    public final void onSpatializerEnabledChanged(Spatializer paramSpatializer, boolean paramBoolean)
    {
      paramSpatializer = f.f.this;
      k0 localk0 = f.j;
      paramSpatializer.j();
    }
  }
}

/* Location:
 * Qualified Name:     r5.f.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */