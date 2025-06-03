package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

final class RegisteredMediaRouteProvider
  extends MediaRouteProvider
  implements ServiceConnection
{
  public static final boolean DEBUG = Log.isLoggable("MediaRouteProviderProxy", 3);
  public static final String TAG = "MediaRouteProviderProxy";
  private Connection mActiveConnection;
  private boolean mBound;
  private final ComponentName mComponentName;
  private boolean mConnectionReady;
  private ControllerCallback mControllerCallback;
  private final ArrayList<ControllerConnection> mControllerConnections = new ArrayList();
  public final PrivateHandler mPrivateHandler;
  private boolean mStarted;
  
  public RegisteredMediaRouteProvider(Context paramContext, ComponentName paramComponentName)
  {
    super(paramContext, new MediaRouteProvider.ProviderMetadata(paramComponentName));
    mComponentName = paramComponentName;
    mPrivateHandler = new PrivateHandler();
  }
  
  private void attachControllersToConnection()
  {
    int i = mControllerConnections.size();
    for (int j = 0; j < i; j++) {
      ((ControllerConnection)mControllerConnections.get(j)).attachConnection(mActiveConnection);
    }
  }
  
  private void bind()
  {
    if (!mBound)
    {
      boolean bool1 = DEBUG;
      if (bool1)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(this);
        ((StringBuilder)localObject).append(": Binding");
        Log.d("MediaRouteProviderProxy", ((StringBuilder)localObject).toString());
      }
      Object localObject = new Intent("android.media.MediaRouteProviderService");
      ((Intent)localObject).setComponent(mComponentName);
      int i = 1;
      try
      {
        if (Build.VERSION.SDK_INT >= 29) {
          i = 4097;
        }
        boolean bool2 = getContext().bindService((Intent)localObject, this, i);
        mBound = bool2;
        if ((!bool2) && (bool1))
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(": Bind failed");
          Log.d("MediaRouteProviderProxy", ((StringBuilder)localObject).toString());
        }
      }
      catch (SecurityException localSecurityException)
      {
        if (DEBUG)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(": Bind failed");
          Log.d("MediaRouteProviderProxy", ((StringBuilder)localObject).toString(), localSecurityException);
        }
      }
    }
  }
  
  private MediaRouteProvider.DynamicGroupRouteController createDynamicGroupRouteController(String paramString)
  {
    Object localObject = getDescriptor();
    if (localObject != null)
    {
      localObject = ((MediaRouteProviderDescriptor)localObject).getRoutes();
      int i = ((List)localObject).size();
      for (int j = 0; j < i; j++) {
        if (((MediaRouteDescriptor)((List)localObject).get(j)).getId().equals(paramString))
        {
          paramString = new RegisteredDynamicController(paramString);
          mControllerConnections.add(paramString);
          if (mConnectionReady) {
            paramString.attachConnection(mActiveConnection);
          }
          updateBinding();
          return paramString;
        }
      }
    }
    return null;
  }
  
  private MediaRouteProvider.RouteController createRouteController(String paramString1, String paramString2)
  {
    Object localObject = getDescriptor();
    if (localObject != null)
    {
      localObject = ((MediaRouteProviderDescriptor)localObject).getRoutes();
      int i = ((List)localObject).size();
      for (int j = 0; j < i; j++) {
        if (((MediaRouteDescriptor)((List)localObject).get(j)).getId().equals(paramString1))
        {
          paramString1 = new RegisteredRouteController(paramString1, paramString2);
          mControllerConnections.add(paramString1);
          if (mConnectionReady) {
            paramString1.attachConnection(mActiveConnection);
          }
          updateBinding();
          return paramString1;
        }
      }
    }
    return null;
  }
  
  private void detachControllersFromConnection()
  {
    int i = mControllerConnections.size();
    for (int j = 0; j < i; j++) {
      ((ControllerConnection)mControllerConnections.get(j)).detachConnection();
    }
  }
  
  private void disconnect()
  {
    if (mActiveConnection != null)
    {
      setDescriptor(null);
      mConnectionReady = false;
      detachControllersFromConnection();
      mActiveConnection.dispose();
      mActiveConnection = null;
    }
  }
  
  private ControllerConnection findControllerById(int paramInt)
  {
    Iterator localIterator = mControllerConnections.iterator();
    while (localIterator.hasNext())
    {
      ControllerConnection localControllerConnection = (ControllerConnection)localIterator.next();
      if (localControllerConnection.getControllerId() == paramInt) {
        return localControllerConnection;
      }
    }
    return null;
  }
  
  private boolean shouldBind()
  {
    if (mStarted)
    {
      if (getDiscoveryRequest() != null) {
        return true;
      }
      if (!mControllerConnections.isEmpty()) {
        return true;
      }
    }
    return false;
  }
  
  private void unbind()
  {
    if (mBound)
    {
      if (DEBUG)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append(this);
        localStringBuilder1.append(": Unbinding");
        Log.d("MediaRouteProviderProxy", localStringBuilder1.toString());
      }
      mBound = false;
      disconnect();
      try
      {
        getContext().unbindService(this);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(this);
        localStringBuilder2.append(": unbindService failed");
        Log.e("MediaRouteProviderProxy", localStringBuilder2.toString(), localIllegalArgumentException);
      }
    }
  }
  
  private void updateBinding()
  {
    if (shouldBind()) {
      bind();
    } else {
      unbind();
    }
  }
  
  public boolean hasComponentName(String paramString1, String paramString2)
  {
    boolean bool;
    if ((mComponentName.getPackageName().equals(paramString1)) && (mComponentName.getClassName().equals(paramString2))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onConnectionControllerReleasedByProvider(Connection paramConnection, int paramInt)
  {
    if (mActiveConnection == paramConnection)
    {
      paramConnection = findControllerById(paramInt);
      ControllerCallback localControllerCallback = mControllerCallback;
      if ((localControllerCallback != null) && ((paramConnection instanceof MediaRouteProvider.RouteController))) {
        localControllerCallback.onControllerReleasedByProvider((MediaRouteProvider.RouteController)paramConnection);
      }
      onControllerReleased(paramConnection);
    }
  }
  
  public void onConnectionDescriptorChanged(Connection paramConnection, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    if (mActiveConnection == paramConnection)
    {
      if (DEBUG)
      {
        paramConnection = new StringBuilder();
        paramConnection.append(this);
        paramConnection.append(": Descriptor changed, descriptor=");
        paramConnection.append(paramMediaRouteProviderDescriptor);
        Log.d("MediaRouteProviderProxy", paramConnection.toString());
      }
      setDescriptor(paramMediaRouteProviderDescriptor);
    }
  }
  
  public void onConnectionDied(Connection paramConnection)
  {
    if (mActiveConnection == paramConnection)
    {
      if (DEBUG)
      {
        paramConnection = new StringBuilder();
        paramConnection.append(this);
        paramConnection.append(": Service connection died");
        Log.d("MediaRouteProviderProxy", paramConnection.toString());
      }
      disconnect();
    }
  }
  
  public void onConnectionError(Connection paramConnection, String paramString)
  {
    if (mActiveConnection == paramConnection)
    {
      if (DEBUG)
      {
        paramConnection = new StringBuilder();
        paramConnection.append(this);
        paramConnection.append(": Service connection error - ");
        paramConnection.append(paramString);
        Log.d("MediaRouteProviderProxy", paramConnection.toString());
      }
      unbind();
    }
  }
  
  public void onConnectionReady(Connection paramConnection)
  {
    if (mActiveConnection == paramConnection)
    {
      mConnectionReady = true;
      attachControllersToConnection();
      paramConnection = getDiscoveryRequest();
      if (paramConnection != null) {
        mActiveConnection.setDiscoveryRequest(paramConnection);
      }
    }
  }
  
  public void onControllerReleased(ControllerConnection paramControllerConnection)
  {
    mControllerConnections.remove(paramControllerConnection);
    paramControllerConnection.detachConnection();
    updateBinding();
  }
  
  public MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController(@NonNull String paramString)
  {
    if (paramString != null) {
      return createDynamicGroupRouteController(paramString);
    }
    throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
  }
  
  public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String paramString)
  {
    if (paramString != null) {
      return createRouteController(paramString, null);
    }
    throw new IllegalArgumentException("routeId cannot be null");
  }
  
  public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String paramString1, @NonNull String paramString2)
  {
    if (paramString1 != null)
    {
      if (paramString2 != null) {
        return createRouteController(paramString1, paramString2);
      }
      throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    throw new IllegalArgumentException("routeId cannot be null");
  }
  
  public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    if (mConnectionReady) {
      mActiveConnection.setDiscoveryRequest(paramMediaRouteDiscoveryRequest);
    }
    updateBinding();
  }
  
  public void onDynamicRouteDescriptorChanged(Connection paramConnection, int paramInt, MediaRouteDescriptor paramMediaRouteDescriptor, List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramList)
  {
    if (mActiveConnection == paramConnection)
    {
      if (DEBUG)
      {
        paramConnection = new StringBuilder();
        paramConnection.append(this);
        paramConnection.append(": DynamicRouteDescriptors changed, descriptors=");
        paramConnection.append(paramList);
        Log.d("MediaRouteProviderProxy", paramConnection.toString());
      }
      paramConnection = findControllerById(paramInt);
      if ((paramConnection instanceof RegisteredDynamicController)) {
        ((RegisteredDynamicController)paramConnection).onDynamicRoutesChanged(paramMediaRouteDescriptor, paramList);
      }
    }
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    boolean bool = DEBUG;
    if (bool)
    {
      paramComponentName = new StringBuilder();
      paramComponentName.append(this);
      paramComponentName.append(": Connected");
      Log.d("MediaRouteProviderProxy", paramComponentName.toString());
    }
    if (mBound)
    {
      disconnect();
      if (paramIBinder != null) {
        paramComponentName = new Messenger(paramIBinder);
      } else {
        paramComponentName = null;
      }
      if (MediaRouteProviderProtocol.isValidRemoteMessenger(paramComponentName))
      {
        paramComponentName = new Connection(paramComponentName);
        if (paramComponentName.register())
        {
          mActiveConnection = paramComponentName;
        }
        else if (bool)
        {
          paramComponentName = new StringBuilder();
          paramComponentName.append(this);
          paramComponentName.append(": Registration failed");
          Log.d("MediaRouteProviderProxy", paramComponentName.toString());
        }
      }
      else
      {
        paramComponentName = new StringBuilder();
        paramComponentName.append(this);
        paramComponentName.append(": Service returned invalid messenger binder");
        Log.e("MediaRouteProviderProxy", paramComponentName.toString());
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (DEBUG)
    {
      paramComponentName = new StringBuilder();
      paramComponentName.append(this);
      paramComponentName.append(": Service disconnected");
      Log.d("MediaRouteProviderProxy", paramComponentName.toString());
    }
    disconnect();
  }
  
  public void rebindIfDisconnected()
  {
    if ((mActiveConnection == null) && (shouldBind()))
    {
      unbind();
      bind();
    }
  }
  
  public void setControllerCallback(@Nullable ControllerCallback paramControllerCallback)
  {
    mControllerCallback = paramControllerCallback;
  }
  
  public void start()
  {
    if (!mStarted)
    {
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(this);
        localStringBuilder.append(": Starting");
        Log.d("MediaRouteProviderProxy", localStringBuilder.toString());
      }
      mStarted = true;
      updateBinding();
    }
  }
  
  public void stop()
  {
    if (mStarted)
    {
      if (DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(this);
        localStringBuilder.append(": Stopping");
        Log.d("MediaRouteProviderProxy", localStringBuilder.toString());
      }
      mStarted = false;
      updateBinding();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Service connection ");
    localStringBuilder.append(mComponentName.flattenToShortString());
    return localStringBuilder.toString();
  }
  
  public final class Connection
    implements IBinder.DeathRecipient
  {
    private int mNextControllerId = 1;
    private int mNextRequestId = 1;
    private final SparseArray<MediaRouter.ControlRequestCallback> mPendingCallbacks = new SparseArray();
    private int mPendingRegisterRequestId;
    private final RegisteredMediaRouteProvider.ReceiveHandler mReceiveHandler;
    private final Messenger mReceiveMessenger;
    private final Messenger mServiceMessenger;
    private int mServiceVersion;
    
    public Connection(Messenger paramMessenger)
    {
      mServiceMessenger = paramMessenger;
      this$1 = new RegisteredMediaRouteProvider.ReceiveHandler(this);
      mReceiveHandler = RegisteredMediaRouteProvider.this;
      mReceiveMessenger = new Messenger(RegisteredMediaRouteProvider.this);
    }
    
    private boolean sendRequest(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
    {
      Message localMessage = Message.obtain();
      what = paramInt1;
      arg1 = paramInt2;
      arg2 = paramInt3;
      obj = paramObject;
      localMessage.setData(paramBundle);
      replyTo = mReceiveMessenger;
      try
      {
        mServiceMessenger.send(localMessage);
        return true;
      }
      catch (RemoteException paramObject)
      {
        if (paramInt1 != 2) {
          Log.e("MediaRouteProviderProxy", "Could not send message to service.", (Throwable)paramObject);
        }
        return false;
      }
      catch (DeadObjectException paramObject)
      {
        for (;;) {}
      }
    }
    
    public void addMemberRoute(int paramInt, String paramString)
    {
      paramString = z2.d("memberRouteId", paramString);
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      sendRequest(12, i, paramInt, null, paramString);
    }
    
    public void binderDied()
    {
      mPrivateHandler.post(new Runnable()
      {
        public void run()
        {
          RegisteredMediaRouteProvider.Connection localConnection = RegisteredMediaRouteProvider.Connection.this;
          this$0.onConnectionDied(localConnection);
        }
      });
    }
    
    public int createDynamicGroupRouteController(String paramString, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      int i = mNextControllerId;
      mNextControllerId = (i + 1);
      int j = mNextRequestId;
      mNextRequestId = (j + 1);
      sendRequest(11, j, i, null, z2.d("memberRouteId", paramString));
      mPendingCallbacks.put(j, paramControlRequestCallback);
      return i;
    }
    
    public int createRouteController(String paramString1, String paramString2)
    {
      int i = mNextControllerId;
      mNextControllerId = (i + 1);
      Bundle localBundle = new Bundle();
      localBundle.putString("routeId", paramString1);
      localBundle.putString("routeGroupId", paramString2);
      int j = mNextRequestId;
      mNextRequestId = (j + 1);
      sendRequest(3, j, i, null, localBundle);
      return i;
    }
    
    public void dispose()
    {
      sendRequest(2, 0, 0, null, null);
      mReceiveHandler.dispose();
      mServiceMessenger.getBinder().unlinkToDeath(this, 0);
      mPrivateHandler.post(new Runnable()
      {
        public void run()
        {
          failPendingCallbacks();
        }
      });
    }
    
    public void failPendingCallbacks()
    {
      int i = mPendingCallbacks.size();
      for (int j = 0; j < i; j++) {
        ((MediaRouter.ControlRequestCallback)mPendingCallbacks.valueAt(j)).onError(null, null);
      }
      mPendingCallbacks.clear();
    }
    
    public boolean onControlRequestFailed(int paramInt, String paramString, Bundle paramBundle)
    {
      MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
      if (localControlRequestCallback != null)
      {
        mPendingCallbacks.remove(paramInt);
        localControlRequestCallback.onError(paramString, paramBundle);
        return true;
      }
      return false;
    }
    
    public boolean onControlRequestSucceeded(int paramInt, Bundle paramBundle)
    {
      MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
      if (localControlRequestCallback != null)
      {
        mPendingCallbacks.remove(paramInt);
        localControlRequestCallback.onResult(paramBundle);
        return true;
      }
      return false;
    }
    
    public void onControllerReleasedByProvider(int paramInt)
    {
      onConnectionControllerReleasedByProvider(this, paramInt);
    }
    
    public boolean onDescriptorChanged(Bundle paramBundle)
    {
      if (mServiceVersion != 0)
      {
        onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(paramBundle));
        return true;
      }
      return false;
    }
    
    public void onDynamicGroupRouteControllerCreated(int paramInt, Bundle paramBundle)
    {
      MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
      if ((paramBundle != null) && (paramBundle.containsKey("routeId")))
      {
        mPendingCallbacks.remove(paramInt);
        localControlRequestCallback.onResult(paramBundle);
      }
      else
      {
        localControlRequestCallback.onError("DynamicGroupRouteController is created without valid route id.", paramBundle);
      }
    }
    
    public boolean onDynamicRouteDescriptorsChanged(int paramInt, Bundle paramBundle)
    {
      if (mServiceVersion != 0)
      {
        MediaRouteDescriptor localMediaRouteDescriptor = null;
        Object localObject = (Bundle)paramBundle.getParcelable("groupRoute");
        if (localObject != null) {
          localMediaRouteDescriptor = MediaRouteDescriptor.fromBundle((Bundle)localObject);
        }
        localObject = paramBundle.getParcelableArrayList("dynamicRoutes");
        paramBundle = new ArrayList();
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          paramBundle.add(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.fromBundle((Bundle)((Iterator)localObject).next()));
        }
        onDynamicRouteDescriptorChanged(this, paramInt, localMediaRouteDescriptor, paramBundle);
        return true;
      }
      return false;
    }
    
    public boolean onGenericFailure(int paramInt)
    {
      if (paramInt == mPendingRegisterRequestId)
      {
        mPendingRegisterRequestId = 0;
        onConnectionError(this, "Registration failed");
      }
      MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(paramInt);
      if (localControlRequestCallback != null)
      {
        mPendingCallbacks.remove(paramInt);
        localControlRequestCallback.onError(null, null);
      }
      return true;
    }
    
    public boolean onGenericSuccess(int paramInt)
    {
      return true;
    }
    
    public boolean onRegistered(int paramInt1, int paramInt2, Bundle paramBundle)
    {
      if ((mServiceVersion == 0) && (paramInt1 == mPendingRegisterRequestId) && (paramInt2 >= 1))
      {
        mPendingRegisterRequestId = 0;
        mServiceVersion = paramInt2;
        onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(paramBundle));
        onConnectionReady(this);
        return true;
      }
      return false;
    }
    
    public boolean register()
    {
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      mPendingRegisterRequestId = i;
      if (!sendRequest(1, i, 4, null, null)) {
        return false;
      }
      try
      {
        mServiceMessenger.getBinder().linkToDeath(this, 0);
        return true;
      }
      catch (RemoteException localRemoteException)
      {
        binderDied();
      }
      return false;
    }
    
    public void releaseRouteController(int paramInt)
    {
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      sendRequest(4, i, paramInt, null, null);
    }
    
    public void removeMemberRoute(int paramInt, String paramString)
    {
      paramString = z2.d("memberRouteId", paramString);
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      sendRequest(13, i, paramInt, null, paramString);
    }
    
    public void selectRoute(int paramInt)
    {
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      sendRequest(5, i, paramInt, null, null);
    }
    
    public boolean sendControlRequest(int paramInt, Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      if (sendRequest(9, i, paramInt, paramIntent, null))
      {
        if (paramControlRequestCallback != null) {
          mPendingCallbacks.put(i, paramControlRequestCallback);
        }
        return true;
      }
      return false;
    }
    
    public void setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
    {
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      if (paramMediaRouteDiscoveryRequest != null) {
        paramMediaRouteDiscoveryRequest = paramMediaRouteDiscoveryRequest.asBundle();
      } else {
        paramMediaRouteDiscoveryRequest = null;
      }
      sendRequest(10, i, 0, paramMediaRouteDiscoveryRequest, null);
    }
    
    public void setVolume(int paramInt1, int paramInt2)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("volume", paramInt2);
      paramInt2 = mNextRequestId;
      mNextRequestId = (paramInt2 + 1);
      sendRequest(7, paramInt2, paramInt1, null, localBundle);
    }
    
    public void unselectRoute(int paramInt1, int paramInt2)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("unselectReason", paramInt2);
      paramInt2 = mNextRequestId;
      mNextRequestId = (paramInt2 + 1);
      sendRequest(6, paramInt2, paramInt1, null, localBundle);
    }
    
    public void updateMemberRoutes(int paramInt, List<String> paramList)
    {
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("memberRouteIds", new ArrayList(paramList));
      int i = mNextRequestId;
      mNextRequestId = (i + 1);
      sendRequest(14, i, paramInt, null, localBundle);
    }
    
    public void updateVolume(int paramInt1, int paramInt2)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("volume", paramInt2);
      paramInt2 = mNextRequestId;
      mNextRequestId = (paramInt2 + 1);
      sendRequest(8, paramInt2, paramInt1, null, localBundle);
    }
  }
  
  public static abstract interface ControllerCallback
  {
    public abstract void onControllerReleasedByProvider(MediaRouteProvider.RouteController paramRouteController);
  }
  
  public static abstract interface ControllerConnection
  {
    public abstract void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection);
    
    public abstract void detachConnection();
    
    public abstract int getControllerId();
  }
  
  public static final class PrivateHandler
    extends Handler
  {}
  
  public static final class ReceiveHandler
    extends Handler
  {
    private final WeakReference<RegisteredMediaRouteProvider.Connection> mConnectionRef;
    
    public ReceiveHandler(RegisteredMediaRouteProvider.Connection paramConnection)
    {
      mConnectionRef = new WeakReference(paramConnection);
    }
    
    private boolean processMessage(RegisteredMediaRouteProvider.Connection paramConnection, int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
    {
      switch (paramInt1)
      {
      default: 
        break;
      case 8: 
        paramConnection.onControllerReleasedByProvider(paramInt3);
        break;
      case 7: 
        if ((paramObject == null) || ((paramObject instanceof Bundle))) {
          return paramConnection.onDynamicRouteDescriptorsChanged(paramInt3, (Bundle)paramObject);
        }
        break;
      case 6: 
        if ((paramObject instanceof Bundle)) {
          paramConnection.onDynamicGroupRouteControllerCreated(paramInt2, (Bundle)paramObject);
        } else {
          Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
        }
        break;
      case 5: 
        if ((paramObject == null) || ((paramObject instanceof Bundle))) {
          return paramConnection.onDescriptorChanged((Bundle)paramObject);
        }
        break;
      case 4: 
        if ((paramObject == null) || ((paramObject instanceof Bundle)))
        {
          if (paramBundle == null) {
            paramBundle = null;
          } else {
            paramBundle = paramBundle.getString("error");
          }
          return paramConnection.onControlRequestFailed(paramInt2, paramBundle, (Bundle)paramObject);
        }
        break;
      case 3: 
        if ((paramObject == null) || ((paramObject instanceof Bundle))) {
          return paramConnection.onControlRequestSucceeded(paramInt2, (Bundle)paramObject);
        }
        break;
      case 2: 
        if ((paramObject == null) || ((paramObject instanceof Bundle))) {
          return paramConnection.onRegistered(paramInt2, paramInt3, (Bundle)paramObject);
        }
        break;
      case 1: 
        paramConnection.onGenericSuccess(paramInt2);
        return true;
      case 0: 
        paramConnection.onGenericFailure(paramInt2);
        return true;
      }
      return false;
    }
    
    public void dispose()
    {
      mConnectionRef.clear();
    }
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject = (RegisteredMediaRouteProvider.Connection)mConnectionRef.get();
      if ((localObject != null) && (!processMessage((RegisteredMediaRouteProvider.Connection)localObject, what, arg1, arg2, obj, paramMessage.peekData())) && (RegisteredMediaRouteProvider.DEBUG))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unhandled message from server: ");
        ((StringBuilder)localObject).append(paramMessage);
        Log.d("MediaRouteProviderProxy", ((StringBuilder)localObject).toString());
      }
    }
  }
  
  public final class RegisteredDynamicController
    extends MediaRouteProvider.DynamicGroupRouteController
    implements RegisteredMediaRouteProvider.ControllerConnection
  {
    private RegisteredMediaRouteProvider.Connection mConnection;
    private int mControllerId = -1;
    public String mGroupableSectionTitle;
    private final String mInitialMemberRouteId;
    private int mPendingSetVolume = -1;
    private int mPendingUpdateVolumeDelta;
    private boolean mSelected;
    public String mTransferableSectionTitle;
    
    public RegisteredDynamicController(String paramString)
    {
      mInitialMemberRouteId = paramString;
    }
    
    public void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection)
    {
      MediaRouter.ControlRequestCallback local1 = new MediaRouter.ControlRequestCallback()
      {
        public void onError(String paramAnonymousString, Bundle paramAnonymousBundle)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Error: ");
          localStringBuilder.append(paramAnonymousString);
          localStringBuilder.append(", data: ");
          localStringBuilder.append(paramAnonymousBundle);
          Log.d("MediaRouteProviderProxy", localStringBuilder.toString());
        }
        
        public void onResult(Bundle paramAnonymousBundle)
        {
          mGroupableSectionTitle = paramAnonymousBundle.getString("groupableTitle");
          mTransferableSectionTitle = paramAnonymousBundle.getString("transferableTitle");
        }
      };
      mConnection = paramConnection;
      int i = paramConnection.createDynamicGroupRouteController(mInitialMemberRouteId, local1);
      mControllerId = i;
      if (mSelected)
      {
        paramConnection.selectRoute(i);
        i = mPendingSetVolume;
        if (i >= 0)
        {
          paramConnection.setVolume(mControllerId, i);
          mPendingSetVolume = -1;
        }
        i = mPendingUpdateVolumeDelta;
        if (i != 0)
        {
          paramConnection.updateVolume(mControllerId, i);
          mPendingUpdateVolumeDelta = 0;
        }
      }
    }
    
    public void detachConnection()
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null)
      {
        localConnection.releaseRouteController(mControllerId);
        mConnection = null;
        mControllerId = 0;
      }
    }
    
    public int getControllerId()
    {
      return mControllerId;
    }
    
    public String getGroupableSelectionTitle()
    {
      return mGroupableSectionTitle;
    }
    
    public String getTransferableSectionTitle()
    {
      return mTransferableSectionTitle;
    }
    
    public void onAddMemberRoute(@NonNull String paramString)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.addMemberRoute(mControllerId, paramString);
      }
    }
    
    public boolean onControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        return localConnection.sendControlRequest(mControllerId, paramIntent, paramControlRequestCallback);
      }
      return false;
    }
    
    public void onDynamicRoutesChanged(MediaRouteDescriptor paramMediaRouteDescriptor, List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramList)
    {
      notifyDynamicRoutesChanged(paramMediaRouteDescriptor, paramList);
    }
    
    public void onRelease()
    {
      onControllerReleased(this);
    }
    
    public void onRemoveMemberRoute(@NonNull String paramString)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.removeMemberRoute(mControllerId, paramString);
      }
    }
    
    public void onSelect()
    {
      mSelected = true;
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.selectRoute(mControllerId);
      }
    }
    
    public void onSetVolume(int paramInt)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null)
      {
        localConnection.setVolume(mControllerId, paramInt);
      }
      else
      {
        mPendingSetVolume = paramInt;
        mPendingUpdateVolumeDelta = 0;
      }
    }
    
    public void onUnselect()
    {
      onUnselect(0);
    }
    
    public void onUnselect(int paramInt)
    {
      mSelected = false;
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.unselectRoute(mControllerId, paramInt);
      }
    }
    
    public void onUpdateMemberRoutes(@Nullable List<String> paramList)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.updateMemberRoutes(mControllerId, paramList);
      }
    }
    
    public void onUpdateVolume(int paramInt)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.updateVolume(mControllerId, paramInt);
      } else {
        mPendingUpdateVolumeDelta += paramInt;
      }
    }
  }
  
  public final class RegisteredRouteController
    extends MediaRouteProvider.RouteController
    implements RegisteredMediaRouteProvider.ControllerConnection
  {
    private RegisteredMediaRouteProvider.Connection mConnection;
    private int mControllerId;
    private int mPendingSetVolume = -1;
    private int mPendingUpdateVolumeDelta;
    private final String mRouteGroupId;
    private final String mRouteId;
    private boolean mSelected;
    
    public RegisteredRouteController(String paramString1, String paramString2)
    {
      mRouteId = paramString1;
      mRouteGroupId = paramString2;
    }
    
    public void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection)
    {
      mConnection = paramConnection;
      int i = paramConnection.createRouteController(mRouteId, mRouteGroupId);
      mControllerId = i;
      if (mSelected)
      {
        paramConnection.selectRoute(i);
        i = mPendingSetVolume;
        if (i >= 0)
        {
          paramConnection.setVolume(mControllerId, i);
          mPendingSetVolume = -1;
        }
        i = mPendingUpdateVolumeDelta;
        if (i != 0)
        {
          paramConnection.updateVolume(mControllerId, i);
          mPendingUpdateVolumeDelta = 0;
        }
      }
    }
    
    public void detachConnection()
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null)
      {
        localConnection.releaseRouteController(mControllerId);
        mConnection = null;
        mControllerId = 0;
      }
    }
    
    public int getControllerId()
    {
      return mControllerId;
    }
    
    public boolean onControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        return localConnection.sendControlRequest(mControllerId, paramIntent, paramControlRequestCallback);
      }
      return false;
    }
    
    public void onRelease()
    {
      onControllerReleased(this);
    }
    
    public void onSelect()
    {
      mSelected = true;
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.selectRoute(mControllerId);
      }
    }
    
    public void onSetVolume(int paramInt)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null)
      {
        localConnection.setVolume(mControllerId, paramInt);
      }
      else
      {
        mPendingSetVolume = paramInt;
        mPendingUpdateVolumeDelta = 0;
      }
    }
    
    public void onUnselect()
    {
      onUnselect(0);
    }
    
    public void onUnselect(int paramInt)
    {
      mSelected = false;
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.unselectRoute(mControllerId, paramInt);
      }
    }
    
    public void onUpdateVolume(int paramInt)
    {
      RegisteredMediaRouteProvider.Connection localConnection = mConnection;
      if (localConnection != null) {
        localConnection.updateVolume(mControllerId, paramInt);
      } else {
        mPendingUpdateVolumeDelta += paramInt;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */