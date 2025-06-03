package t0;

import android.media.MediaCodec;
import android.os.Bundle;
import j0.c;

public class L
  implements n
{
  public final MediaCodec a;
  
  public L(MediaCodec paramMediaCodec)
  {
    a = paramMediaCodec;
  }
  
  public void a(int paramInt1, int paramInt2, c paramc, long paramLong, int paramInt3)
  {
    a.queueSecureInputBuffer(paramInt1, paramInt2, paramc.a(), paramLong, paramInt3);
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    a.queueInputBuffer(paramInt1, paramInt2, paramInt3, paramLong, paramInt4);
  }
  
  public void c(Bundle paramBundle)
  {
    a.setParameters(paramBundle);
  }
  
  public void d() {}
  
  public void flush() {}
  
  public void shutdown() {}
  
  public void start() {}
}

/* Location:
 * Qualified Name:     t0.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */