package com.facebook.common.internal;

import java.io.ByteArrayOutputStream;

final class ByteStreams$FastByteArrayOutputStream
  extends ByteArrayOutputStream
{
  public void writeTo(byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(buf, 0, paramArrayOfByte, paramInt, count);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.ByteStreams.FastByteArrayOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */