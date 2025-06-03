package com.google.android.exoplayer2.drm;

public class DecryptionException
  extends Exception
{
  public final int errorCode;
  
  public DecryptionException(int paramInt, String paramString)
  {
    super(paramString);
    errorCode = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DecryptionException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */