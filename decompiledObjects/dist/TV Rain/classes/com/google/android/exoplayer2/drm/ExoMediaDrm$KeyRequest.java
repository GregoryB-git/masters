package com.google.android.exoplayer2.drm;

public final class ExoMediaDrm$KeyRequest
{
  private final byte[] data;
  private final String licenseServerUrl;
  
  public ExoMediaDrm$KeyRequest(byte[] paramArrayOfByte, String paramString)
  {
    data = paramArrayOfByte;
    licenseServerUrl = paramString;
  }
  
  public byte[] getData()
  {
    return data;
  }
  
  public String getLicenseServerUrl()
  {
    return licenseServerUrl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */