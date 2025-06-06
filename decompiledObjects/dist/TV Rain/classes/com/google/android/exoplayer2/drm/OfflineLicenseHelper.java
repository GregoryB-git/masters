package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.UUID;

public final class OfflineLicenseHelper<T extends ExoMediaCrypto>
{
  private final ConditionVariable conditionVariable;
  private final DefaultDrmSessionManager<T> drmSessionManager;
  private final HandlerThread handlerThread;
  
  public OfflineLicenseHelper(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap)
  {
    HandlerThread localHandlerThread = new HandlerThread("OfflineLicenseHelper");
    handlerThread = localHandlerThread;
    localHandlerThread.start();
    conditionVariable = new ConditionVariable();
    DefaultDrmSessionEventListener local1 = new DefaultDrmSessionEventListener()
    {
      public void onDrmKeysLoaded()
      {
        OfflineLicenseHelper.access$000(OfflineLicenseHelper.this).open();
      }
      
      public void onDrmKeysRemoved()
      {
        OfflineLicenseHelper.access$000(OfflineLicenseHelper.this).open();
      }
      
      public void onDrmKeysRestored()
      {
        OfflineLicenseHelper.access$000(OfflineLicenseHelper.this).open();
      }
      
      public void onDrmSessionManagerError(Exception paramAnonymousException)
      {
        OfflineLicenseHelper.access$000(OfflineLicenseHelper.this).open();
      }
    };
    paramUUID = new DefaultDrmSessionManager(paramUUID, paramExoMediaDrm, paramMediaDrmCallback, paramHashMap);
    drmSessionManager = paramUUID;
    paramUUID.addListener(new Handler(localHandlerThread.getLooper()), local1);
  }
  
  private byte[] blockingKeyRequest(int paramInt, byte[] paramArrayOfByte, DrmInitData paramDrmInitData)
    throws DrmSession.DrmSessionException
  {
    paramArrayOfByte = openBlockingKeyRequest(paramInt, paramArrayOfByte, paramDrmInitData);
    paramDrmInitData = paramArrayOfByte.getError();
    byte[] arrayOfByte = paramArrayOfByte.getOfflineLicenseKeySetId();
    drmSessionManager.releaseSession(paramArrayOfByte);
    if (paramDrmInitData == null) {
      return arrayOfByte;
    }
    throw paramDrmInitData;
  }
  
  public static OfflineLicenseHelper<FrameworkMediaCrypto> newWidevineInstance(String paramString, HttpDataSource.Factory paramFactory)
    throws UnsupportedDrmException
  {
    return newWidevineInstance(paramString, false, paramFactory, null);
  }
  
  public static OfflineLicenseHelper<FrameworkMediaCrypto> newWidevineInstance(String paramString, boolean paramBoolean, HttpDataSource.Factory paramFactory)
    throws UnsupportedDrmException
  {
    return newWidevineInstance(paramString, paramBoolean, paramFactory, null);
  }
  
  public static OfflineLicenseHelper<FrameworkMediaCrypto> newWidevineInstance(String paramString, boolean paramBoolean, HttpDataSource.Factory paramFactory, HashMap<String, String> paramHashMap)
    throws UnsupportedDrmException
  {
    UUID localUUID = C.WIDEVINE_UUID;
    return new OfflineLicenseHelper(localUUID, FrameworkMediaDrm.newInstance(localUUID), new HttpMediaDrmCallback(paramString, paramBoolean, paramFactory), paramHashMap);
  }
  
  private DrmSession<T> openBlockingKeyRequest(int paramInt, byte[] paramArrayOfByte, DrmInitData paramDrmInitData)
  {
    drmSessionManager.setMode(paramInt, paramArrayOfByte);
    conditionVariable.close();
    paramArrayOfByte = drmSessionManager.acquireSession(handlerThread.getLooper(), paramDrmInitData);
    conditionVariable.block();
    return paramArrayOfByte;
  }
  
  public byte[] downloadLicense(DrmInitData paramDrmInitData)
    throws DrmSession.DrmSessionException
  {
    boolean bool;
    if (paramDrmInitData != null) {
      bool = true;
    } else {
      bool = false;
    }
    try
    {
      Assertions.checkArgument(bool);
      paramDrmInitData = blockingKeyRequest(2, null, paramDrmInitData);
      return paramDrmInitData;
    }
    finally
    {
      paramDrmInitData = finally;
      throw paramDrmInitData;
    }
  }
  
  public Pair<Long, Long> getLicenseDurationRemainingSec(byte[] paramArrayOfByte)
    throws DrmSession.DrmSessionException
  {
    try
    {
      Assertions.checkNotNull(paramArrayOfByte);
      paramArrayOfByte = openBlockingKeyRequest(1, paramArrayOfByte, null);
      DrmSession.DrmSessionException localDrmSessionException = paramArrayOfByte.getError();
      Pair localPair = WidevineUtil.getLicenseDurationRemainingSec(paramArrayOfByte);
      drmSessionManager.releaseSession(paramArrayOfByte);
      if (localDrmSessionException != null)
      {
        if ((localDrmSessionException.getCause() instanceof KeysExpiredException))
        {
          paramArrayOfByte = Pair.create(Long.valueOf(0L), Long.valueOf(0L));
          return paramArrayOfByte;
        }
        throw localDrmSessionException;
      }
      return localPair;
    }
    finally {}
  }
  
  public byte[] getPropertyByteArray(String paramString)
  {
    try
    {
      paramString = drmSessionManager.getPropertyByteArray(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public String getPropertyString(String paramString)
  {
    try
    {
      paramString = drmSessionManager.getPropertyString(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void release()
  {
    handlerThread.quit();
  }
  
  public void releaseLicense(byte[] paramArrayOfByte)
    throws DrmSession.DrmSessionException
  {
    try
    {
      Assertions.checkNotNull(paramArrayOfByte);
      blockingKeyRequest(3, paramArrayOfByte, null);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public byte[] renewLicense(byte[] paramArrayOfByte)
    throws DrmSession.DrmSessionException
  {
    try
    {
      Assertions.checkNotNull(paramArrayOfByte);
      paramArrayOfByte = blockingKeyRequest(2, paramArrayOfByte, null);
      return paramArrayOfByte;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void setPropertyByteArray(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      drmSessionManager.setPropertyByteArray(paramString, paramArrayOfByte);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setPropertyString(String paramString1, String paramString2)
  {
    try
    {
      drmSessionManager.setPropertyString(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.OfflineLicenseHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */