package com.google.android.exoplayer2.drm;

public final class ExoMediaDrm$KeyStatus
{
  private final byte[] keyId;
  private final int statusCode;
  
  public ExoMediaDrm$KeyStatus(int paramInt, byte[] paramArrayOfByte)
  {
    statusCode = paramInt;
    keyId = paramArrayOfByte;
  }
  
  public byte[] getKeyId()
  {
    return keyId;
  }
  
  public int getStatusCode()
  {
    return statusCode;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ExoMediaDrm.KeyStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */