package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SimpleOutputBuffer
  extends OutputBuffer
{
  public ByteBuffer data;
  private final SimpleDecoder<?, SimpleOutputBuffer, ?> owner;
  
  public SimpleOutputBuffer(SimpleDecoder<?, SimpleOutputBuffer, ?> paramSimpleDecoder)
  {
    owner = paramSimpleDecoder;
  }
  
  public void clear()
  {
    super.clear();
    ByteBuffer localByteBuffer = data;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
  }
  
  public ByteBuffer init(long paramLong, int paramInt)
  {
    timeUs = paramLong;
    ByteBuffer localByteBuffer = data;
    if ((localByteBuffer == null) || (localByteBuffer.capacity() < paramInt)) {
      data = ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
    }
    data.position(0);
    data.limit(paramInt);
    return data;
  }
  
  public void release()
  {
    owner.releaseOutputBuffer(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.SimpleOutputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */