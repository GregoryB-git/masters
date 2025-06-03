package com.google.android.exoplayer2.drm;

public final class ExoMediaDrm$ProvisionRequest
{
  private final byte[] data;
  private final String defaultUrl;
  
  public ExoMediaDrm$ProvisionRequest(byte[] paramArrayOfByte, String paramString)
  {
    data = paramArrayOfByte;
    defaultUrl = paramString;
  }
  
  public byte[] getData()
  {
    return data;
  }
  
  public String getDefaultUrl()
  {
    return defaultUrl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */