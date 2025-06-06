package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EventDispatcher;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import z2;

@TargetApi(18)
public class DefaultDrmSessionManager<T extends ExoMediaCrypto>
  implements DrmSessionManager<T>, DefaultDrmSession.ProvisioningManager<T>
{
  public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
  public static final int MODE_DOWNLOAD = 2;
  public static final int MODE_PLAYBACK = 0;
  public static final int MODE_QUERY = 1;
  public static final int MODE_RELEASE = 3;
  public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
  private static final String TAG = "DefaultDrmSessionMgr";
  private final MediaDrmCallback callback;
  private final EventDispatcher<DefaultDrmSessionEventListener> eventDispatcher;
  private final int initialDrmRequestRetryCount;
  private final ExoMediaDrm<T> mediaDrm;
  public volatile DefaultDrmSessionManager<T>.MediaDrmHandler mediaDrmHandler;
  private int mode;
  private final boolean multiSession;
  private byte[] offlineLicenseKeySetId;
  private final HashMap<String, String> optionalKeyRequestParameters;
  private Looper playbackLooper;
  private final List<DefaultDrmSession<T>> provisioningSessions;
  private final List<DefaultDrmSession<T>> sessions;
  private final UUID uuid;
  
  public DefaultDrmSessionManager(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap)
  {
    this(paramUUID, paramExoMediaDrm, paramMediaDrmCallback, paramHashMap, false, 3);
  }
  
  @Deprecated
  public DefaultDrmSessionManager(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener)
  {
    this(paramUUID, paramExoMediaDrm, paramMediaDrmCallback, paramHashMap);
    if ((paramHandler != null) && (paramDefaultDrmSessionEventListener != null)) {
      addListener(paramHandler, paramDefaultDrmSessionEventListener);
    }
  }
  
  @Deprecated
  public DefaultDrmSessionManager(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener, boolean paramBoolean)
  {
    this(paramUUID, paramExoMediaDrm, paramMediaDrmCallback, paramHashMap, paramBoolean);
    if ((paramHandler != null) && (paramDefaultDrmSessionEventListener != null)) {
      addListener(paramHandler, paramDefaultDrmSessionEventListener);
    }
  }
  
  @Deprecated
  public DefaultDrmSessionManager(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener, boolean paramBoolean, int paramInt)
  {
    this(paramUUID, paramExoMediaDrm, paramMediaDrmCallback, paramHashMap, paramBoolean, paramInt);
    if ((paramHandler != null) && (paramDefaultDrmSessionEventListener != null)) {
      addListener(paramHandler, paramDefaultDrmSessionEventListener);
    }
  }
  
  public DefaultDrmSessionManager(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, boolean paramBoolean)
  {
    this(paramUUID, paramExoMediaDrm, paramMediaDrmCallback, paramHashMap, paramBoolean, 3);
  }
  
  public DefaultDrmSessionManager(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, boolean paramBoolean, int paramInt)
  {
    Assertions.checkNotNull(paramUUID);
    Assertions.checkNotNull(paramExoMediaDrm);
    Assertions.checkArgument(C.COMMON_PSSH_UUID.equals(paramUUID) ^ true, "Use C.CLEARKEY_UUID instead");
    uuid = paramUUID;
    mediaDrm = paramExoMediaDrm;
    callback = paramMediaDrmCallback;
    optionalKeyRequestParameters = paramHashMap;
    eventDispatcher = new EventDispatcher();
    multiSession = paramBoolean;
    initialDrmRequestRetryCount = paramInt;
    mode = 0;
    sessions = new ArrayList();
    provisioningSessions = new ArrayList();
    if ((paramBoolean) && (C.WIDEVINE_UUID.equals(paramUUID)) && (Util.SDK_INT >= 19)) {
      paramExoMediaDrm.setPropertyString("sessionSharing", "enable");
    }
    paramExoMediaDrm.setOnEventListener(new MediaDrmEventListener(null));
  }
  
  private static List<DrmInitData.SchemeData> getSchemeDatas(DrmInitData paramDrmInitData, UUID paramUUID, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(schemeDataCount);
    for (int i = 0; i < schemeDataCount; i++)
    {
      DrmInitData.SchemeData localSchemeData = paramDrmInitData.get(i);
      int j;
      if ((!localSchemeData.matches(paramUUID)) && ((!C.CLEARKEY_UUID.equals(paramUUID)) || (!localSchemeData.matches(C.COMMON_PSSH_UUID)))) {
        j = 0;
      } else {
        j = 1;
      }
      if ((j != 0) && ((data != null) || (paramBoolean))) {
        localArrayList.add(localSchemeData);
      }
    }
    return localArrayList;
  }
  
  public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID paramUUID, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap)
    throws UnsupportedDrmException
  {
    return new DefaultDrmSessionManager(paramUUID, FrameworkMediaDrm.newInstance(paramUUID), paramMediaDrmCallback, paramHashMap, false, 3);
  }
  
  @Deprecated
  public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID paramUUID, MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener)
    throws UnsupportedDrmException
  {
    paramUUID = newFrameworkInstance(paramUUID, paramMediaDrmCallback, paramHashMap);
    if ((paramHandler != null) && (paramDefaultDrmSessionEventListener != null)) {
      paramUUID.addListener(paramHandler, paramDefaultDrmSessionEventListener);
    }
    return paramUUID;
  }
  
  public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback paramMediaDrmCallback, String paramString)
    throws UnsupportedDrmException
  {
    if (!TextUtils.isEmpty(paramString))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("PRCustomData", paramString);
      paramString = localHashMap;
    }
    else
    {
      paramString = null;
    }
    return newFrameworkInstance(C.PLAYREADY_UUID, paramMediaDrmCallback, paramString);
  }
  
  @Deprecated
  public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback paramMediaDrmCallback, String paramString, Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener)
    throws UnsupportedDrmException
  {
    paramMediaDrmCallback = newPlayReadyInstance(paramMediaDrmCallback, paramString);
    if ((paramHandler != null) && (paramDefaultDrmSessionEventListener != null)) {
      paramMediaDrmCallback.addListener(paramHandler, paramDefaultDrmSessionEventListener);
    }
    return paramMediaDrmCallback;
  }
  
  public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap)
    throws UnsupportedDrmException
  {
    return newFrameworkInstance(C.WIDEVINE_UUID, paramMediaDrmCallback, paramHashMap);
  }
  
  @Deprecated
  public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback paramMediaDrmCallback, HashMap<String, String> paramHashMap, Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener)
    throws UnsupportedDrmException
  {
    paramMediaDrmCallback = newWidevineInstance(paramMediaDrmCallback, paramHashMap);
    if ((paramHandler != null) && (paramDefaultDrmSessionEventListener != null)) {
      paramMediaDrmCallback.addListener(paramHandler, paramDefaultDrmSessionEventListener);
    }
    return paramMediaDrmCallback;
  }
  
  public DrmSession<T> acquireSession(Looper paramLooper, DrmInitData paramDrmInitData)
  {
    Object localObject1 = playbackLooper;
    boolean bool;
    if ((localObject1 != null) && (localObject1 != paramLooper)) {
      bool = false;
    } else {
      bool = true;
    }
    Assertions.checkState(bool);
    if (sessions.isEmpty())
    {
      playbackLooper = paramLooper;
      if (mediaDrmHandler == null) {
        mediaDrmHandler = new MediaDrmHandler(paramLooper);
      }
    }
    localObject1 = offlineLicenseKeySetId;
    Object localObject2 = null;
    if (localObject1 == null)
    {
      localObject1 = getSchemeDatas(paramDrmInitData, uuid, false);
      if (((List)localObject1).isEmpty())
      {
        paramLooper = new MissingSchemeDataException(uuid, null);
        eventDispatcher.dispatch(new a(paramLooper, 1));
        return new ErrorStateDrmSession(new DrmSession.DrmSessionException(paramLooper));
      }
    }
    else
    {
      localObject1 = null;
    }
    if (!multiSession)
    {
      if (sessions.isEmpty()) {
        paramDrmInitData = (DrmInitData)localObject2;
      } else {
        paramDrmInitData = (DefaultDrmSession)sessions.get(0);
      }
    }
    else
    {
      Iterator localIterator = sessions.iterator();
      do
      {
        paramDrmInitData = (DrmInitData)localObject2;
        if (!localIterator.hasNext()) {
          break;
        }
        paramDrmInitData = (DefaultDrmSession)localIterator.next();
      } while (!Util.areEqual(schemeDatas, localObject1));
    }
    localObject2 = paramDrmInitData;
    if (paramDrmInitData == null)
    {
      localObject2 = new DefaultDrmSession(uuid, mediaDrm, this, (List)localObject1, mode, offlineLicenseKeySetId, optionalKeyRequestParameters, callback, paramLooper, eventDispatcher, initialDrmRequestRetryCount);
      sessions.add(localObject2);
    }
    ((DefaultDrmSession)localObject2).acquire();
    return (DrmSession<T>)localObject2;
  }
  
  public final void addListener(Handler paramHandler, DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener)
  {
    eventDispatcher.addListener(paramHandler, paramDefaultDrmSessionEventListener);
  }
  
  public boolean canAcquireSession(@NonNull DrmInitData paramDrmInitData)
  {
    Object localObject = offlineLicenseKeySetId;
    boolean bool1 = true;
    if (localObject != null) {
      return true;
    }
    if (getSchemeDatas(paramDrmInitData, uuid, true).isEmpty()) {
      if ((schemeDataCount == 1) && (paramDrmInitData.get(0).matches(C.COMMON_PSSH_UUID)))
      {
        localObject = z2.t("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
        ((StringBuilder)localObject).append(uuid);
        Log.w("DefaultDrmSessionMgr", ((StringBuilder)localObject).toString());
      }
      else
      {
        return false;
      }
    }
    paramDrmInitData = schemeType;
    boolean bool2 = bool1;
    if (paramDrmInitData != null) {
      if ("cenc".equals(paramDrmInitData))
      {
        bool2 = bool1;
      }
      else
      {
        if ((!"cbc1".equals(paramDrmInitData)) && (!"cbcs".equals(paramDrmInitData)) && (!"cens".equals(paramDrmInitData))) {
          return true;
        }
        if (Util.SDK_INT >= 25) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
    }
    return bool2;
  }
  
  public final byte[] getPropertyByteArray(String paramString)
  {
    return mediaDrm.getPropertyByteArray(paramString);
  }
  
  public final String getPropertyString(String paramString)
  {
    return mediaDrm.getPropertyString(paramString);
  }
  
  public void onProvisionCompleted()
  {
    Iterator localIterator = provisioningSessions.iterator();
    while (localIterator.hasNext()) {
      ((DefaultDrmSession)localIterator.next()).onProvisionCompleted();
    }
    provisioningSessions.clear();
  }
  
  public void onProvisionError(Exception paramException)
  {
    Iterator localIterator = provisioningSessions.iterator();
    while (localIterator.hasNext()) {
      ((DefaultDrmSession)localIterator.next()).onProvisionError(paramException);
    }
    provisioningSessions.clear();
  }
  
  public void provisionRequired(DefaultDrmSession<T> paramDefaultDrmSession)
  {
    provisioningSessions.add(paramDefaultDrmSession);
    if (provisioningSessions.size() == 1) {
      paramDefaultDrmSession.provision();
    }
  }
  
  public void releaseSession(DrmSession<T> paramDrmSession)
  {
    if ((paramDrmSession instanceof ErrorStateDrmSession)) {
      return;
    }
    paramDrmSession = (DefaultDrmSession)paramDrmSession;
    if (paramDrmSession.release())
    {
      sessions.remove(paramDrmSession);
      if ((provisioningSessions.size() > 1) && (provisioningSessions.get(0) == paramDrmSession)) {
        ((DefaultDrmSession)provisioningSessions.get(1)).provision();
      }
      provisioningSessions.remove(paramDrmSession);
    }
  }
  
  public final void removeListener(DefaultDrmSessionEventListener paramDefaultDrmSessionEventListener)
  {
    eventDispatcher.removeListener(paramDefaultDrmSessionEventListener);
  }
  
  public void setMode(int paramInt, byte[] paramArrayOfByte)
  {
    Assertions.checkState(sessions.isEmpty());
    if ((paramInt == 1) || (paramInt == 3)) {
      Assertions.checkNotNull(paramArrayOfByte);
    }
    mode = paramInt;
    offlineLicenseKeySetId = paramArrayOfByte;
  }
  
  public final void setPropertyByteArray(String paramString, byte[] paramArrayOfByte)
  {
    mediaDrm.setPropertyByteArray(paramString, paramArrayOfByte);
  }
  
  public final void setPropertyString(String paramString1, String paramString2)
  {
    mediaDrm.setPropertyString(paramString1, paramString2);
  }
  
  @Deprecated
  public static abstract interface EventListener
    extends DefaultDrmSessionEventListener
  {}
  
  public class MediaDrmEventListener
    implements ExoMediaDrm.OnEventListener<T>
  {
    private MediaDrmEventListener() {}
    
    public void onEvent(ExoMediaDrm<? extends T> paramExoMediaDrm, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
    {
      if (DefaultDrmSessionManager.access$300(DefaultDrmSessionManager.this) == 0) {
        mediaDrmHandler.obtainMessage(paramInt1, paramArrayOfByte1).sendToTarget();
      }
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  public class MediaDrmHandler
    extends Handler
  {
    public MediaDrmHandler(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      byte[] arrayOfByte = (byte[])obj;
      Iterator localIterator = DefaultDrmSessionManager.access$200(DefaultDrmSessionManager.this).iterator();
      while (localIterator.hasNext())
      {
        DefaultDrmSession localDefaultDrmSession = (DefaultDrmSession)localIterator.next();
        if (localDefaultDrmSession.hasSessionId(arrayOfByte)) {
          localDefaultDrmSession.onMediaDrmEvent(what);
        }
      }
    }
  }
  
  public static final class MissingSchemeDataException
    extends Exception
  {
    private MissingSchemeDataException(UUID paramUUID)
    {
      super();
    }
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Mode {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSessionManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */