package t0;

import W2.s;
import android.media.MediaCodec;
import android.os.HandlerThread;
import d0.q;
import d0.z;
import g0.F;
import g0.M;

public final class b$b
  implements m.b
{
  public final s a;
  public final s b;
  public boolean c;
  
  public b$b(int paramInt)
  {
    this(new c(paramInt), new d(paramInt));
  }
  
  public b$b(s params1, s params2)
  {
    a = params1;
    b = params2;
    c = true;
  }
  
  public static boolean h(q paramq)
  {
    int i = M.a;
    boolean bool = false;
    if (i < 34) {
      return false;
    }
    if ((i >= 35) || (z.s(n))) {
      bool = true;
    }
    return bool;
  }
  
  public b d(m.a parama)
  {
    Object localObject1 = a.a;
    Object localObject2 = null;
    Object localObject3;
    try
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("createCodec:");
      ((StringBuilder)localObject3).append((String)localObject1);
      F.a(((StringBuilder)localObject3).toString());
      localObject1 = MediaCodec.createByCodecName((String)localObject1);
      int i;
      try
      {
        i = f;
        if ((c) && (h(c)))
        {
          localObject3 = new t0/L;
          ((L)localObject3).<init>((MediaCodec)localObject1);
          i |= 0x4;
        }
      }
      catch (Exception parama)
      {
        localObject3 = localObject1;
        break label185;
      }
      localObject3 = new g((MediaCodec)localObject1, (HandlerThread)b.get());
      b localb = new t0/b;
      localb.<init>((MediaCodec)localObject1, (HandlerThread)a.get(), (n)localObject3, null);
      try
      {
        F.b();
        b.q(localb, b, d, e, i);
        return localb;
      }
      catch (Exception parama)
      {
        localObject2 = localb;
        localObject3 = localObject1;
      }
      if (localObject2 != null) {
        break label202;
      }
    }
    catch (Exception parama)
    {
      localObject3 = null;
    }
    label185:
    if (localObject3 != null)
    {
      ((MediaCodec)localObject3).release();
      break label206;
      label202:
      ((b)localObject2).release();
    }
    label206:
    throw parama;
  }
  
  public void e(boolean paramBoolean)
  {
    c = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     t0.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */