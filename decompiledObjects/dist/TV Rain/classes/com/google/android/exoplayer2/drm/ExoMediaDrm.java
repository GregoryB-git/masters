package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract interface ExoMediaDrm<T extends ExoMediaCrypto>
{
  public static final int EVENT_KEY_EXPIRED = 3;
  public static final int EVENT_KEY_REQUIRED = 2;
  public static final int EVENT_PROVISION_REQUIRED = 1;
  public static final int KEY_TYPE_OFFLINE = 2;
  public static final int KEY_TYPE_RELEASE = 3;
  public static final int KEY_TYPE_STREAMING = 1;
  
  public abstract void closeSession(byte[] paramArrayOfByte);
  
  public abstract T createMediaCrypto(byte[] paramArrayOfByte)
    throws MediaCryptoException;
  
  public abstract KeyRequest getKeyRequest(byte[] paramArrayOfByte, @Nullable List<DrmInitData.SchemeData> paramList, int paramInt, @Nullable HashMap<String, String> paramHashMap)
    throws NotProvisionedException;
  
  public abstract byte[] getPropertyByteArray(String paramString);
  
  public abstract String getPropertyString(String paramString);
  
  public abstract ProvisionRequest getProvisionRequest();
  
  public abstract byte[] openSession()
    throws MediaDrmException;
  
  public abstract byte[] provideKeyResponse(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws NotProvisionedException, DeniedByServerException;
  
  public abstract void provideProvisionResponse(byte[] paramArrayOfByte)
    throws DeniedByServerException;
  
  public abstract Map<String, String> queryKeyStatus(byte[] paramArrayOfByte);
  
  public abstract void release();
  
  public abstract void restoreKeys(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract void setOnEventListener(OnEventListener<? super T> paramOnEventListener);
  
  public abstract void setOnKeyStatusChangeListener(OnKeyStatusChangeListener<? super T> paramOnKeyStatusChangeListener);
  
  public abstract void setPropertyByteArray(String paramString, byte[] paramArrayOfByte);
  
  public abstract void setPropertyString(String paramString1, String paramString2);
  
  public static final class KeyRequest
  {
    private final byte[] data;
    private final String licenseServerUrl;
    
    public KeyRequest(byte[] paramArrayOfByte, String paramString)
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
  
  public static final class KeyStatus
  {
    private final byte[] keyId;
    private final int statusCode;
    
    public KeyStatus(int paramInt, byte[] paramArrayOfByte)
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
  
  public static abstract interface OnEventListener<T extends ExoMediaCrypto>
  {
    public abstract void onEvent(ExoMediaDrm<? extends T> paramExoMediaDrm, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, @Nullable byte[] paramArrayOfByte2);
  }
  
  public static abstract interface OnKeyStatusChangeListener<T extends ExoMediaCrypto>
  {
    public abstract void onKeyStatusChange(ExoMediaDrm<? extends T> paramExoMediaDrm, byte[] paramArrayOfByte, List<ExoMediaDrm.KeyStatus> paramList, boolean paramBoolean);
  }
  
  public static final class ProvisionRequest
  {
    private final byte[] data;
    private final String defaultUrl;
    
    public ProvisionRequest(byte[] paramArrayOfByte, String paramString)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ExoMediaDrm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */