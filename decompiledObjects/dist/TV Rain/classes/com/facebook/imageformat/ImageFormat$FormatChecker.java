package com.facebook.imageformat;

import javax.annotation.Nullable;

public abstract interface ImageFormat$FormatChecker
{
  @Nullable
  public abstract ImageFormat determineFormat(byte[] paramArrayOfByte, int paramInt);
  
  public abstract int getHeaderSize();
}

/* Location:
 * Qualified Name:     com.facebook.imageformat.ImageFormat.FormatChecker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */