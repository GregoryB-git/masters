package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.EncodedImage;

public class DecodeException
  extends RuntimeException
{
  private final EncodedImage mEncodedImage;
  
  public DecodeException(String paramString, EncodedImage paramEncodedImage)
  {
    super(paramString);
    mEncodedImage = paramEncodedImage;
  }
  
  public DecodeException(String paramString, Throwable paramThrowable, EncodedImage paramEncodedImage)
  {
    super(paramString, paramThrowable);
    mEncodedImage = paramEncodedImage;
  }
  
  public EncodedImage getEncodedImage()
  {
    return mEncodedImage;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.decoder.DecodeException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */