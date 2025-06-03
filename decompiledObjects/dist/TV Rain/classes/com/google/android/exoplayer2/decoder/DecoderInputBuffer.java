package com.google.android.exoplayer2.decoder;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public class DecoderInputBuffer
  extends Buffer
{
  public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
  public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
  public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
  private final int bufferReplacementMode;
  public final CryptoInfo cryptoInfo = new CryptoInfo();
  public ByteBuffer data;
  public long timeUs;
  
  public DecoderInputBuffer(int paramInt)
  {
    bufferReplacementMode = paramInt;
  }
  
  private ByteBuffer createReplacementByteBuffer(int paramInt)
  {
    int i = bufferReplacementMode;
    if (i == 1) {
      return ByteBuffer.allocate(paramInt);
    }
    if (i == 2) {
      return ByteBuffer.allocateDirect(paramInt);
    }
    Object localObject = data;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((java.nio.Buffer)localObject).capacity();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Buffer too small (");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(" < ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(")");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public static DecoderInputBuffer newFlagsOnlyInstance()
  {
    return new DecoderInputBuffer(0);
  }
  
  public void clear()
  {
    super.clear();
    ByteBuffer localByteBuffer = data;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
  }
  
  public void ensureSpaceForWrite(int paramInt)
  {
    ByteBuffer localByteBuffer = data;
    if (localByteBuffer == null)
    {
      data = createReplacementByteBuffer(paramInt);
      return;
    }
    int i = localByteBuffer.capacity();
    int j = data.position();
    paramInt += j;
    if (i >= paramInt) {
      return;
    }
    localByteBuffer = createReplacementByteBuffer(paramInt);
    if (j > 0)
    {
      data.position(0);
      data.limit(j);
      localByteBuffer.put(data);
    }
    data = localByteBuffer;
  }
  
  public final void flip()
  {
    data.flip();
  }
  
  public final boolean isEncrypted()
  {
    return getFlag(1073741824);
  }
  
  public final boolean isFlagsOnly()
  {
    boolean bool;
    if ((data == null) && (bufferReplacementMode == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BufferReplacementMode {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.DecoderInputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */