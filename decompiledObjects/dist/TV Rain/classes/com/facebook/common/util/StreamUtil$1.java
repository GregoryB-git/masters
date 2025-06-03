package com.facebook.common.util;

import java.io.ByteArrayOutputStream;

final class StreamUtil$1
  extends ByteArrayOutputStream
{
  public StreamUtil$1(int paramInt)
  {
    super(paramInt);
  }
  
  public byte[] toByteArray()
  {
    int i = count;
    byte[] arrayOfByte = buf;
    if (i == arrayOfByte.length) {
      return arrayOfByte;
    }
    return super.toByteArray();
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.StreamUtil.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */