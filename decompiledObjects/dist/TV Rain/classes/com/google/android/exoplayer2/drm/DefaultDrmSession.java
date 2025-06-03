package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.EventDispatcher;
import com.google.android.exoplayer2.util.EventDispatcher.Event;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import z3;

@TargetApi(18)
class DefaultDrmSession<T extends ExoMediaCrypto>
  implements DrmSession<T>
{
  private static final int MAX_LICENSE_DURATION_TO_RENEW = 60;
  private static final int MSG_KEYS = 1;
  private static final int MSG_PROVISION = 0;
  private static final String TAG = "DefaultDrmSession";
  public final MediaDrmCallback callback;
  private ExoMediaDrm.KeyRequest currentKeyRequest;
  private ExoMediaDrm.ProvisionRequest currentProvisionRequest;
  private final EventDispatcher<DefaultDrmSessionEventListener> eventDispatcher;
  private final int initialDrmRequestRetryCount;
  private DrmSession.DrmSessionException lastException;
  private T mediaCrypto;
  private final ExoMediaDrm<T> mediaDrm;
  private final int mode;
  @Nullable
  private byte[] offlineLicenseKeySetId;
  private int openCount;
  private final HashMap<String, String> optionalKeyRequestParameters;
  private DefaultDrmSession<T>.PostRequestHandler postRequestHandler;
  public final DefaultDrmSession<T>.PostResponseHandler postResponseHandler;
  private final ProvisioningManager<T> provisioningManager;
  private HandlerThread requestHandlerThread;
  @Nullable
  public final List<DrmInitData.SchemeData> schemeDatas;
  private byte[] sessionId;
  private int state;
  public final UUID uuid;
  
  public DefaultDrmSession(UUID paramUUID, ExoMediaDrm<T> paramExoMediaDrm, ProvisioningManager<T> paramProvisioningManager, @Nullable List<DrmInitData.SchemeData> paramList, int paramInt1, @Nullable byte[] paramArrayOfByte, HashMap<String, String> paramHashMap, MediaDrmCallback paramMediaDrmCallback, Looper paramLooper, EventDispatcher<DefaultDrmSessionEventListener> paramEventDispatcher, int paramInt2)
  {
    uuid = paramUUID;
    provisioningManager = paramProvisioningManager;
    mediaDrm = paramExoMediaDrm;
    mode = paramInt1;
    offlineLicenseKeySetId = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      paramUUID = Collections.unmodifiableList(paramList);
    } else {
      paramUUID = null;
    }
    schemeDatas = paramUUID;
    optionalKeyRequestParameters = paramHashMap;
    callback = paramMediaDrmCallback;
    initialDrmRequestRetryCount = paramInt2;
    eventDispatcher = paramEventDispatcher;
    state = 2;
    postResponseHandler = new PostResponseHandler(paramLooper);
    paramUUID = new HandlerThread("DrmRequestHandler");
    requestHandlerThread = paramUUID;
    paramUUID.start();
    postRequestHandler = new PostRequestHandler(requestHandlerThread.getLooper());
  }
  
  private void doLicense(boolean paramBoolean)
  {
    int i = mode;
    if ((i != 0) && (i != 1))
    {
      if (i != 2)
      {
        if ((i == 3) && (restoreKeys())) {
          postKeyRequest(3, paramBoolean);
        }
      }
      else if (offlineLicenseKeySetId == null) {
        postKeyRequest(2, paramBoolean);
      } else if (restoreKeys()) {
        postKeyRequest(2, paramBoolean);
      }
    }
    else if (offlineLicenseKeySetId == null)
    {
      postKeyRequest(1, paramBoolean);
    }
    else if ((state == 4) || (restoreKeys()))
    {
      long l = getLicenseDurationRemainingSec();
      if ((mode == 0) && (l <= 60L))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
        localStringBuilder.append(l);
        Log.d("DefaultDrmSession", localStringBuilder.toString());
        postKeyRequest(2, paramBoolean);
      }
      else if (l <= 0L)
      {
        onError(new KeysExpiredException());
      }
      else
      {
        state = 4;
        eventDispatcher.dispatch(new z3(11));
      }
    }
  }
  
  private long getLicenseDurationRemainingSec()
  {
    if (!C.WIDEVINE_UUID.equals(uuid)) {
      return Long.MAX_VALUE;
    }
    Pair localPair = WidevineUtil.getLicenseDurationRemainingSec(this);
    return Math.min(((Long)first).longValue(), ((Long)second).longValue());
  }
  
  private boolean isOpen()
  {
    int i = state;
    boolean bool;
    if ((i != 3) && (i != 4)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void onError(Exception paramException)
  {
    lastException = new DrmSession.DrmSessionException(paramException);
    eventDispatcher.dispatch(new a(paramException, 0));
    if (state != 4) {
      state = 1;
    }
  }
  
  private void onKeyResponse(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == currentKeyRequest) && (isOpen()))
    {
      currentKeyRequest = null;
      if ((paramObject2 instanceof Exception))
      {
        onKeysError((Exception)paramObject2);
        return;
      }
      try
      {
        paramObject1 = (byte[])paramObject2;
        if (mode == 3)
        {
          mediaDrm.provideKeyResponse(offlineLicenseKeySetId, (byte[])paramObject1);
          paramObject1 = eventDispatcher;
          paramObject2 = new z3;
          ((z3)paramObject2).<init>(8);
          ((EventDispatcher)paramObject1).dispatch((EventDispatcher.Event)paramObject2);
        }
        else
        {
          paramObject1 = mediaDrm.provideKeyResponse(sessionId, (byte[])paramObject1);
          int i = mode;
          if (((i == 2) || ((i == 0) && (offlineLicenseKeySetId != null))) && (paramObject1 != null) && (paramObject1.length != 0)) {
            offlineLicenseKeySetId = ((byte[])paramObject1);
          }
          state = 4;
          paramObject1 = eventDispatcher;
          paramObject2 = new z3;
          ((z3)paramObject2).<init>(9);
          ((EventDispatcher)paramObject1).dispatch((EventDispatcher.Event)paramObject2);
        }
      }
      catch (Exception paramObject1)
      {
        onKeysError((Exception)paramObject1);
      }
    }
  }
  
  private void onKeysError(Exception paramException)
  {
    if ((paramException instanceof NotProvisionedException)) {
      provisioningManager.provisionRequired(this);
    } else {
      onError(paramException);
    }
  }
  
  private void onKeysExpired()
  {
    if (state == 4)
    {
      state = 3;
      onError(new KeysExpiredException());
    }
  }
  
  private void onProvisionResponse(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == currentProvisionRequest) && ((state == 2) || (isOpen())))
    {
      currentProvisionRequest = null;
      if ((paramObject2 instanceof Exception))
      {
        provisioningManager.onProvisionError((Exception)paramObject2);
        return;
      }
      try
      {
        mediaDrm.provideProvisionResponse((byte[])paramObject2);
        provisioningManager.onProvisionCompleted();
        return;
      }
      catch (Exception paramObject1)
      {
        provisioningManager.onProvisionError((Exception)paramObject1);
      }
    }
  }
  
  private boolean openInternal(boolean paramBoolean)
  {
    if (isOpen()) {
      return true;
    }
    try
    {
      sessionId = mediaDrm.openSession();
      EventDispatcher localEventDispatcher = eventDispatcher;
      z3 localz3 = new z3;
      localz3.<init>(7);
      localEventDispatcher.dispatch(localz3);
      mediaCrypto = mediaDrm.createMediaCrypto(sessionId);
      state = 3;
      return true;
    }
    catch (Exception localException)
    {
      onError(localException);
    }
    catch (NotProvisionedException localNotProvisionedException)
    {
      if (paramBoolean) {
        provisioningManager.provisionRequired(this);
      } else {
        onError(localNotProvisionedException);
      }
    }
    return false;
  }
  
  private void postKeyRequest(int paramInt, boolean paramBoolean)
  {
    Object localObject;
    if (paramInt == 3) {
      localObject = offlineLicenseKeySetId;
    } else {
      localObject = sessionId;
    }
    try
    {
      localObject = mediaDrm.getKeyRequest((byte[])localObject, schemeDatas, paramInt, optionalKeyRequestParameters);
      currentKeyRequest = ((ExoMediaDrm.KeyRequest)localObject);
      postRequestHandler.post(1, localObject, paramBoolean);
    }
    catch (Exception localException)
    {
      onKeysError(localException);
    }
  }
  
  private boolean restoreKeys()
  {
    try
    {
      mediaDrm.restoreKeys(sessionId, offlineLicenseKeySetId);
      return true;
    }
    catch (Exception localException)
    {
      Log.e("DefaultDrmSession", "Error trying to restore Widevine keys.", localException);
      onError(localException);
    }
    return false;
  }
  
  public void acquire()
  {
    int i = openCount + 1;
    openCount = i;
    if (i == 1)
    {
      if (state == 1) {
        return;
      }
      if (openInternal(true)) {
        doLicense(true);
      }
    }
  }
  
  public final DrmSession.DrmSessionException getError()
  {
    DrmSession.DrmSessionException localDrmSessionException;
    if (state == 1) {
      localDrmSessionException = lastException;
    } else {
      localDrmSessionException = null;
    }
    return localDrmSessionException;
  }
  
  public final T getMediaCrypto()
  {
    return mediaCrypto;
  }
  
  public byte[] getOfflineLicenseKeySetId()
  {
    return offlineLicenseKeySetId;
  }
  
  public final int getState()
  {
    return state;
  }
  
  public boolean hasSessionId(byte[] paramArrayOfByte)
  {
    return Arrays.equals(sessionId, paramArrayOfByte);
  }
  
  public void onMediaDrmEvent(int paramInt)
  {
    if (!isOpen()) {
      return;
    }
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3) {
          onKeysExpired();
        }
      }
      else {
        doLicense(false);
      }
    }
    else
    {
      state = 3;
      provisioningManager.provisionRequired(this);
    }
  }
  
  public void onProvisionCompleted()
  {
    if (openInternal(false)) {
      doLicense(true);
    }
  }
  
  public void onProvisionError(Exception paramException)
  {
    onError(paramException);
  }
  
  public void provision()
  {
    ExoMediaDrm.ProvisionRequest localProvisionRequest = mediaDrm.getProvisionRequest();
    currentProvisionRequest = localProvisionRequest;
    postRequestHandler.post(0, localProvisionRequest, true);
  }
  
  public Map<String, String> queryKeyStatus()
  {
    Object localObject = sessionId;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = mediaDrm.queryKeyStatus((byte[])localObject);
    }
    return (Map<String, String>)localObject;
  }
  
  public boolean release()
  {
    int i = openCount - 1;
    openCount = i;
    if (i == 0)
    {
      state = 0;
      postResponseHandler.removeCallbacksAndMessages(null);
      postRequestHandler.removeCallbacksAndMessages(null);
      postRequestHandler = null;
      requestHandlerThread.quit();
      requestHandlerThread = null;
      mediaCrypto = null;
      lastException = null;
      currentKeyRequest = null;
      currentProvisionRequest = null;
      byte[] arrayOfByte = sessionId;
      if (arrayOfByte != null)
      {
        mediaDrm.closeSession(arrayOfByte);
        sessionId = null;
        eventDispatcher.dispatch(new z3(10));
      }
      return true;
    }
    return false;
  }
  
  @SuppressLint({"HandlerLeak"})
  public class PostRequestHandler
    extends Handler
  {
    public PostRequestHandler(Looper paramLooper)
    {
      super();
    }
    
    private long getRetryDelayMillis(int paramInt)
    {
      return Math.min((paramInt - 1) * 1000, 5000);
    }
    
    private boolean maybeRetryRequest(Message paramMessage)
    {
      if (arg1 == 1) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        return false;
      }
      int i = arg2 + 1;
      if (i > DefaultDrmSession.access$200(DefaultDrmSession.this)) {
        return false;
      }
      paramMessage = Message.obtain(paramMessage);
      arg2 = i;
      sendMessageDelayed(paramMessage, getRetryDelayMillis(i));
      return true;
    }
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject1 = obj;
      try
      {
        int i = what;
        Object localObject2;
        if (i != 0)
        {
          if (i == 1)
          {
            localObject2 = DefaultDrmSession.this;
            localObject2 = callback.executeKeyRequest(uuid, (ExoMediaDrm.KeyRequest)localObject1);
          }
          else
          {
            localObject2 = new java/lang/RuntimeException;
            ((RuntimeException)localObject2).<init>();
            throw ((Throwable)localObject2);
          }
        }
        else
        {
          localObject2 = DefaultDrmSession.this;
          localObject2 = callback.executeProvisionRequest(uuid, (ExoMediaDrm.ProvisionRequest)localObject1);
        }
      }
      catch (Exception localException)
      {
        if (maybeRetryRequest(paramMessage)) {
          return;
        }
      }
      postResponseHandler.obtainMessage(what, Pair.create(localObject1, localException)).sendToTarget();
    }
    
    public void post(int paramInt, Object paramObject, boolean paramBoolean)
    {
      obtainMessage(paramInt, paramBoolean, 0, paramObject).sendToTarget();
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  public class PostResponseHandler
    extends Handler
  {
    public PostResponseHandler(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject1 = (Pair)obj;
      Object localObject2 = first;
      localObject1 = second;
      int i = what;
      if (i != 0)
      {
        if (i == 1) {
          DefaultDrmSession.access$100(DefaultDrmSession.this, localObject2, localObject1);
        }
      }
      else {
        DefaultDrmSession.access$000(DefaultDrmSession.this, localObject2, localObject1);
      }
    }
  }
  
  public static abstract interface ProvisioningManager<T extends ExoMediaCrypto>
  {
    public abstract void onProvisionCompleted();
    
    public abstract void onProvisionError(Exception paramException);
    
    public abstract void provisionRequired(DefaultDrmSession<T> paramDefaultDrmSession);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */