package com.google.android.exoplayer2.drm;

import a2;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm.KeyRequest;
import android.media.MediaDrm.ProvisionRequest;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import z1;

@TargetApi(23)
public final class FrameworkMediaDrm
  implements ExoMediaDrm<FrameworkMediaCrypto>
{
  private static final String CENC_SCHEME_MIME_TYPE = "cenc";
  private final MediaDrm mediaDrm;
  private final UUID uuid;
  
  private FrameworkMediaDrm(UUID paramUUID)
    throws UnsupportedSchemeException
  {
    Assertions.checkNotNull(paramUUID);
    Object localObject = C.COMMON_PSSH_UUID;
    Assertions.checkArgument(((UUID)localObject).equals(paramUUID) ^ true, "Use C.CLEARKEY_UUID instead");
    uuid = paramUUID;
    if ((Util.SDK_INT >= 27) || (!C.CLEARKEY_UUID.equals(paramUUID))) {
      localObject = paramUUID;
    }
    localObject = new MediaDrm((UUID)localObject);
    mediaDrm = ((MediaDrm)localObject);
    if ((C.WIDEVINE_UUID.equals(paramUUID)) && (needsForceWidevineL3Workaround())) {
      forceWidevineL3((MediaDrm)localObject);
    }
  }
  
  private static byte[] adjustRequestData(UUID paramUUID, byte[] paramArrayOfByte)
  {
    if (C.CLEARKEY_UUID.equals(paramUUID)) {
      return ClearKeyUtil.adjustRequestData(paramArrayOfByte);
    }
    return paramArrayOfByte;
  }
  
  private static byte[] adjustRequestInitData(UUID paramUUID, byte[] paramArrayOfByte)
  {
    if ((Util.SDK_INT >= 21) || (!C.WIDEVINE_UUID.equals(paramUUID)))
    {
      if ((C.PLAYREADY_UUID.equals(paramUUID)) && ("Amazon".equals(Util.MANUFACTURER)))
      {
        String str = Util.MODEL;
        if ((!"AFTB".equals(str)) && (!"AFTS".equals(str)) && (!"AFTM".equals(str))) {}
      }
    }
    else
    {
      paramUUID = PsshAtomUtil.parseSchemeSpecificData(paramArrayOfByte, paramUUID);
      if (paramUUID != null) {
        return paramUUID;
      }
    }
    return paramArrayOfByte;
  }
  
  private static String adjustRequestMimeType(UUID paramUUID, String paramString)
  {
    if ((Util.SDK_INT < 26) && (C.CLEARKEY_UUID.equals(paramUUID)) && (("video/mp4".equals(paramString)) || ("audio/mp4".equals(paramString)))) {
      return "cenc";
    }
    return paramString;
  }
  
  @SuppressLint({"WrongConstant"})
  private static void forceWidevineL3(MediaDrm paramMediaDrm)
  {
    paramMediaDrm.setPropertyString("securityLevel", "L3");
  }
  
  private static DrmInitData.SchemeData getSchemeData(UUID paramUUID, List<DrmInitData.SchemeData> paramList)
  {
    if (!C.WIDEVINE_UUID.equals(paramUUID)) {
      return (DrmInitData.SchemeData)paramList.get(0);
    }
    int i;
    label151:
    int k;
    if ((Util.SDK_INT >= 28) && (paramList.size() > 1))
    {
      paramUUID = (DrmInitData.SchemeData)paramList.get(0);
      i = 0;
      j = i;
      Object localObject;
      while (i < paramList.size())
      {
        localObject = (DrmInitData.SchemeData)paramList.get(i);
        if ((requiresSecureDecryption == requiresSecureDecryption) && (Util.areEqual(mimeType, mimeType)) && (Util.areEqual(licenseServerUrl, licenseServerUrl)) && (PsshAtomUtil.isPsshAtom(data)))
        {
          j += data.length;
          i++;
        }
        else
        {
          i = 0;
          break label151;
        }
      }
      i = 1;
      if (i != 0)
      {
        byte[] arrayOfByte = new byte[j];
        i = 0;
        j = i;
        while (i < paramList.size())
        {
          localObject = getdata;
          k = localObject.length;
          System.arraycopy(localObject, 0, arrayOfByte, j, k);
          j += k;
          i++;
        }
        return paramUUID.copyWithData(arrayOfByte);
      }
    }
    for (int j = 0; j < paramList.size(); j++)
    {
      paramUUID = (DrmInitData.SchemeData)paramList.get(j);
      i = PsshAtomUtil.parseVersion(data);
      k = Util.SDK_INT;
      if ((k < 23) && (i == 0)) {
        return paramUUID;
      }
      if ((k >= 23) && (i == 1)) {
        return paramUUID;
      }
    }
    return (DrmInitData.SchemeData)paramList.get(0);
  }
  
  private static boolean needsForceWidevineL3Workaround()
  {
    return "ASUS_Z00AD".equals(Util.MODEL);
  }
  
  public static FrameworkMediaDrm newInstance(UUID paramUUID)
    throws UnsupportedDrmException
  {
    try
    {
      paramUUID = new FrameworkMediaDrm(paramUUID);
      return paramUUID;
    }
    catch (Exception paramUUID)
    {
      throw new UnsupportedDrmException(2, paramUUID);
    }
    catch (UnsupportedSchemeException paramUUID)
    {
      throw new UnsupportedDrmException(1, paramUUID);
    }
  }
  
  public void closeSession(byte[] paramArrayOfByte)
  {
    mediaDrm.closeSession(paramArrayOfByte);
  }
  
  public FrameworkMediaCrypto createMediaCrypto(byte[] paramArrayOfByte)
    throws MediaCryptoException
  {
    boolean bool;
    if ((Util.SDK_INT < 21) && (C.WIDEVINE_UUID.equals(uuid)) && ("L3".equals(getPropertyString("securityLevel")))) {
      bool = true;
    } else {
      bool = false;
    }
    return new FrameworkMediaCrypto(new MediaCrypto(uuid, paramArrayOfByte), bool);
  }
  
  public ExoMediaDrm.KeyRequest getKeyRequest(byte[] paramArrayOfByte, @Nullable List<DrmInitData.SchemeData> paramList, int paramInt, @Nullable HashMap<String, String> paramHashMap)
    throws NotProvisionedException
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramList != null)
    {
      paramList = getSchemeData(uuid, paramList);
      arrayOfByte = adjustRequestInitData(uuid, data);
      localObject2 = adjustRequestMimeType(uuid, mimeType);
    }
    else
    {
      arrayOfByte = null;
      localObject2 = arrayOfByte;
      paramList = (List<DrmInitData.SchemeData>)localObject1;
    }
    paramArrayOfByte = mediaDrm.getKeyRequest(paramArrayOfByte, arrayOfByte, (String)localObject2, paramInt, paramHashMap);
    byte[] arrayOfByte = adjustRequestData(uuid, paramArrayOfByte.getData());
    paramHashMap = paramArrayOfByte.getDefaultUrl();
    paramArrayOfByte = paramHashMap;
    if (TextUtils.isEmpty(paramHashMap))
    {
      paramArrayOfByte = paramHashMap;
      if (paramList != null)
      {
        paramArrayOfByte = paramHashMap;
        if (!TextUtils.isEmpty(licenseServerUrl)) {
          paramArrayOfByte = licenseServerUrl;
        }
      }
    }
    return new ExoMediaDrm.KeyRequest(arrayOfByte, paramArrayOfByte);
  }
  
  public byte[] getPropertyByteArray(String paramString)
  {
    return mediaDrm.getPropertyByteArray(paramString);
  }
  
  public String getPropertyString(String paramString)
  {
    return mediaDrm.getPropertyString(paramString);
  }
  
  public ExoMediaDrm.ProvisionRequest getProvisionRequest()
  {
    MediaDrm.ProvisionRequest localProvisionRequest = mediaDrm.getProvisionRequest();
    return new ExoMediaDrm.ProvisionRequest(localProvisionRequest.getData(), localProvisionRequest.getDefaultUrl());
  }
  
  public byte[] openSession()
    throws MediaDrmException
  {
    return mediaDrm.openSession();
  }
  
  public byte[] provideKeyResponse(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws NotProvisionedException, DeniedByServerException
  {
    byte[] arrayOfByte = paramArrayOfByte2;
    if (C.CLEARKEY_UUID.equals(uuid)) {
      arrayOfByte = ClearKeyUtil.adjustResponseData(paramArrayOfByte2);
    }
    return mediaDrm.provideKeyResponse(paramArrayOfByte1, arrayOfByte);
  }
  
  public void provideProvisionResponse(byte[] paramArrayOfByte)
    throws DeniedByServerException
  {
    mediaDrm.provideProvisionResponse(paramArrayOfByte);
  }
  
  public Map<String, String> queryKeyStatus(byte[] paramArrayOfByte)
  {
    return mediaDrm.queryKeyStatus(paramArrayOfByte);
  }
  
  public void release()
  {
    mediaDrm.release();
  }
  
  public void restoreKeys(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    mediaDrm.restoreKeys(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public void setOnEventListener(ExoMediaDrm.OnEventListener<? super FrameworkMediaCrypto> paramOnEventListener)
  {
    MediaDrm localMediaDrm = mediaDrm;
    if (paramOnEventListener == null) {
      paramOnEventListener = null;
    } else {
      paramOnEventListener = new z1(this, paramOnEventListener);
    }
    localMediaDrm.setOnEventListener(paramOnEventListener);
  }
  
  public void setOnKeyStatusChangeListener(ExoMediaDrm.OnKeyStatusChangeListener<? super FrameworkMediaCrypto> paramOnKeyStatusChangeListener)
  {
    if (Util.SDK_INT >= 23)
    {
      MediaDrm localMediaDrm = mediaDrm;
      if (paramOnKeyStatusChangeListener == null) {
        paramOnKeyStatusChangeListener = null;
      } else {
        paramOnKeyStatusChangeListener = new a2(this, paramOnKeyStatusChangeListener);
      }
      localMediaDrm.setOnKeyStatusChangeListener(paramOnKeyStatusChangeListener, null);
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public void setPropertyByteArray(String paramString, byte[] paramArrayOfByte)
  {
    mediaDrm.setPropertyByteArray(paramString, paramArrayOfByte);
  }
  
  public void setPropertyString(String paramString1, String paramString2)
  {
    mediaDrm.setPropertyString(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.FrameworkMediaDrm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */