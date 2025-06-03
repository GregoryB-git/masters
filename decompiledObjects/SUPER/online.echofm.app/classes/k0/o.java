package k0;

import g0.M;

public final class o
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public long k;
  public int l;
  
  public void a(long paramLong)
  {
    b(paramLong, 1);
  }
  
  public final void b(long paramLong, int paramInt)
  {
    k += paramLong;
    l += paramInt;
  }
  
  public void c() {}
  
  public String toString()
  {
    return M.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", new Object[] { Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(h), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(k), Integer.valueOf(l) });
  }
}

/* Location:
 * Qualified Name:     k0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */