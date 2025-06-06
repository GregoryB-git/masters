package com.facebook.imageformat;

import javax.annotation.Nullable;

public class ImageFormat
{
  public static final ImageFormat UNKNOWN = new ImageFormat("UNKNOWN", null);
  private final String mFileExtension;
  private final String mName;
  
  public ImageFormat(String paramString1, @Nullable String paramString2)
  {
    mName = paramString1;
    mFileExtension = paramString2;
  }
  
  @Nullable
  public String getFileExtension()
  {
    return mFileExtension;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String toString()
  {
    return getName();
  }
  
  public static abstract interface FormatChecker
  {
    @Nullable
    public abstract ImageFormat determineFormat(byte[] paramArrayOfByte, int paramInt);
    
    public abstract int getHeaderSize();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageformat.ImageFormat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */