package m0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import d0.b;
import d0.b.d;
import d0.q;
import d0.z;
import g0.M;
import g0.a;

public final class E
  implements N.d
{
  public final Context a;
  public Boolean b;
  
  public E(Context paramContext)
  {
    a = paramContext;
  }
  
  public k a(q paramq, b paramb)
  {
    a.e(paramq);
    a.e(paramb);
    int i = M.a;
    if ((i >= 29) && (C != -1))
    {
      boolean bool = b(a);
      int j = z.f((String)a.e(n), j);
      if ((j != 0) && (i >= M.K(j)))
      {
        int k = M.M(B);
        if (k == 0) {
          return k.d;
        }
        try
        {
          paramq = M.L(C, k, j);
          paramb = aa;
          if (i >= 31) {
            return b.a(paramq, paramb, bool);
          }
          return a.a(paramq, paramb, bool);
        }
        catch (IllegalArgumentException paramq)
        {
          return k.d;
        }
      }
      return k.d;
    }
    return k.d;
  }
  
  public final boolean b(Context paramContext)
  {
    Boolean localBoolean = b;
    if (localBoolean != null) {
      return localBoolean.booleanValue();
    }
    if (paramContext != null)
    {
      paramContext = (AudioManager)paramContext.getSystemService("audio");
      if (paramContext != null)
      {
        paramContext = paramContext.getParameters("offloadVariableRateSupported");
        boolean bool;
        if ((paramContext != null) && (paramContext.equals("offloadVariableRateSupported=1"))) {
          bool = true;
        } else {
          bool = false;
        }
        paramContext = Boolean.valueOf(bool);
        break label71;
      }
    }
    paramContext = Boolean.FALSE;
    label71:
    b = paramContext;
    return b.booleanValue();
  }
  
  public static final abstract class a
  {
    public static k a(AudioFormat paramAudioFormat, AudioAttributes paramAudioAttributes, boolean paramBoolean)
    {
      if (!D.a(paramAudioFormat, paramAudioAttributes)) {
        return k.d;
      }
      return new k.b().e(true).g(paramBoolean).d();
    }
  }
  
  public static final abstract class b
  {
    public static k a(AudioFormat paramAudioFormat, AudioAttributes paramAudioAttributes, boolean paramBoolean)
    {
      int i = F.a(paramAudioFormat, paramAudioAttributes);
      if (i == 0) {
        return k.d;
      }
      paramAudioFormat = new k.b();
      boolean bool;
      if ((M.a > 32) && (i == 2)) {
        bool = true;
      } else {
        bool = false;
      }
      return paramAudioFormat.e(true).f(bool).g(paramBoolean).d();
    }
  }
}

/* Location:
 * Qualified Name:     m0.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */