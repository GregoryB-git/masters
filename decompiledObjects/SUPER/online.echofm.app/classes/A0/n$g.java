package A0;

import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import d0.b;
import d0.b.d;
import g0.M;
import java.util.Objects;
import m0.Z;

public class n$g
{
  public final Spatializer a;
  public final boolean b;
  public Handler c;
  public Spatializer.OnSpatializerStateChangedListener d;
  
  public n$g(Spatializer paramSpatializer)
  {
    a = paramSpatializer;
    boolean bool;
    if (p.a(paramSpatializer) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
  }
  
  public static g g(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = new g(o.a(paramContext));
    }
    return paramContext;
  }
  
  public boolean a(b paramb, d0.q paramq)
  {
    if (("audio/eac3-joc".equals(n)) && (B == 16)) {
      i = 12;
    } else {
      i = B;
    }
    int i = M.M(i);
    if (i == 0) {
      return false;
    }
    AudioFormat.Builder localBuilder = new AudioFormat.Builder().setEncoding(2).setChannelMask(i);
    i = C;
    if (i != -1) {
      localBuilder.setSampleRate(i);
    }
    return u.a(a, aa, localBuilder.build());
  }
  
  public void b(final n paramn, Looper paramLooper)
  {
    if ((d == null) && (c == null))
    {
      d = new a(paramn);
      paramLooper = new Handler(paramLooper);
      c = paramLooper;
      paramn = a;
      Objects.requireNonNull(paramLooper);
      q.a(paramn, new Z(paramLooper), d);
    }
  }
  
  public boolean c()
  {
    return s.a(a);
  }
  
  public boolean d()
  {
    return t.a(a);
  }
  
  public boolean e()
  {
    return b;
  }
  
  public void f()
  {
    Spatializer.OnSpatializerStateChangedListener localOnSpatializerStateChangedListener = d;
    if ((localOnSpatializerStateChangedListener != null) && (c != null))
    {
      r.a(a, localOnSpatializerStateChangedListener);
      ((Handler)M.i(c)).removeCallbacksAndMessages(null);
      c = null;
      d = null;
    }
  }
  
  public class a
    implements Spatializer.OnSpatializerStateChangedListener
  {
    public a(n paramn) {}
    
    public void onSpatializerAvailableChanged(Spatializer paramSpatializer, boolean paramBoolean)
    {
      n.C(paramn);
    }
    
    public void onSpatializerEnabledChanged(Spatializer paramSpatializer, boolean paramBoolean)
    {
      n.C(paramn);
    }
  }
}

/* Location:
 * Qualified Name:     A0.n.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */