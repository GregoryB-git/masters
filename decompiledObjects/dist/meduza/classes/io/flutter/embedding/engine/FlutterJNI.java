package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Surface;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.util.Preconditions;
import io.flutter.view.AccessibilityBridge.Action;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry.ImageConsumer;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class FlutterJNI
{
  private static final String TAG = "FlutterJNI";
  private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate;
  private static float displayDensity = -1.0F;
  private static float displayHeight = -1.0F;
  private static float displayWidth = -1.0F;
  private static boolean initCalled = false;
  private static boolean loadLibraryCalled = false;
  private static boolean prefetchDefaultFontManagerCalled = false;
  private static float refreshRateFPS = 60.0F;
  private static String vmServiceUri;
  private AccessibilityDelegate accessibilityDelegate;
  private DeferredComponentManager deferredComponentManager;
  private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
  private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
  private LocalizationPlugin localizationPlugin;
  private final Looper mainLooper = Looper.getMainLooper();
  private Long nativeShellHolderId;
  private PlatformMessageHandler platformMessageHandler;
  private PlatformViewsController platformViewsController;
  private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
  
  private static void asyncWaitForVsync(long paramLong)
  {
    AsyncWaitForVsyncDelegate localAsyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate;
    if (localAsyncWaitForVsyncDelegate != null)
    {
      localAsyncWaitForVsyncDelegate.asyncWaitForVsync(paramLong);
      return;
    }
    throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
  }
  
  public static Bitmap decodeImage(ByteBuffer paramByteBuffer, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramByteBuffer = ImageDecoder.createSource(paramByteBuffer);
      try
      {
        a locala = new io/flutter/embedding/engine/a;
        locala.<init>(paramLong);
        paramByteBuffer = ImageDecoder.decodeBitmap(paramByteBuffer, locala);
        return paramByteBuffer;
      }
      catch (IOException paramByteBuffer)
      {
        Log.e("FlutterJNI", "Failed to decode image", paramByteBuffer);
      }
    }
    return null;
  }
  
  private void ensureAttachedToNative()
  {
    if (nativeShellHolderId != null) {
      return;
    }
    throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
  }
  
  private void ensureNotAttachedToNative()
  {
    if (nativeShellHolderId == null) {
      return;
    }
    throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
  }
  
  private void ensureRunningOnMainThread()
  {
    if (Looper.myLooper() == mainLooper) {
      return;
    }
    StringBuilder localStringBuilder = f.l("Methods marked with @UiThread must be executed on the main thread. Current thread: ");
    localStringBuilder.append(Thread.currentThread().getName());
    throw new RuntimeException(localStringBuilder.toString());
  }
  
  @Deprecated
  public static String getObservatoryUri()
  {
    return vmServiceUri;
  }
  
  public static String getVMServiceUri()
  {
    return vmServiceUri;
  }
  
  private void handlePlatformMessageResponse(int paramInt, ByteBuffer paramByteBuffer)
  {
    PlatformMessageHandler localPlatformMessageHandler = platformMessageHandler;
    if (localPlatformMessageHandler != null) {
      localPlatformMessageHandler.handlePlatformMessageResponse(paramInt, paramByteBuffer);
    }
  }
  
  private native long nativeAttach(FlutterJNI paramFlutterJNI);
  
  private native void nativeCleanupMessageData(long paramLong);
  
  private native void nativeDeferredComponentInstallFailure(int paramInt, String paramString, boolean paramBoolean);
  
  private native void nativeDestroy(long paramLong);
  
  private native void nativeDispatchEmptyPlatformMessage(long paramLong, String paramString, int paramInt);
  
  private native void nativeDispatchPlatformMessage(long paramLong, String paramString, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
  
  private native void nativeDispatchPointerDataPacket(long paramLong, ByteBuffer paramByteBuffer, int paramInt);
  
  private native void nativeDispatchSemanticsAction(long paramLong, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3);
  
  private native boolean nativeFlutterTextUtilsIsEmoji(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsEmojiModifier(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsVariationSelector(int paramInt);
  
  private native Bitmap nativeGetBitmap(long paramLong);
  
  private native boolean nativeGetIsSoftwareRenderingEnabled();
  
  public static native void nativeImageHeaderCallback(long paramLong, int paramInt1, int paramInt2);
  
  private static native void nativeInit(Context paramContext, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3, long paramLong);
  
  private native void nativeInvokePlatformMessageEmptyResponseCallback(long paramLong, int paramInt);
  
  private native void nativeInvokePlatformMessageResponseCallback(long paramLong, int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  private native void nativeLoadDartDeferredLibrary(long paramLong, int paramInt, String[] paramArrayOfString);
  
  @Deprecated
  public static native FlutterCallbackInformation nativeLookupCallbackInformation(long paramLong);
  
  private native void nativeMarkTextureFrameAvailable(long paramLong1, long paramLong2);
  
  private native void nativeNotifyLowMemoryWarning(long paramLong);
  
  private native void nativeOnVsync(long paramLong1, long paramLong2, long paramLong3);
  
  private static native void nativePrefetchDefaultFontManager();
  
  private native void nativeRegisterImageTexture(long paramLong1, long paramLong2, WeakReference<TextureRegistry.ImageConsumer> paramWeakReference);
  
  private native void nativeRegisterTexture(long paramLong1, long paramLong2, WeakReference<SurfaceTextureWrapper> paramWeakReference);
  
  private native void nativeRunBundleAndSnapshotFromLibrary(long paramLong, String paramString1, String paramString2, String paramString3, AssetManager paramAssetManager, List<String> paramList);
  
  private native void nativeScheduleFrame(long paramLong);
  
  private native void nativeSetAccessibilityFeatures(long paramLong, int paramInt);
  
  private native void nativeSetSemanticsEnabled(long paramLong, boolean paramBoolean);
  
  private native void nativeSetViewportMetrics(long paramLong, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3);
  
  private native FlutterJNI nativeSpawn(long paramLong, String paramString1, String paramString2, String paramString3, List<String> paramList);
  
  private native void nativeSurfaceChanged(long paramLong, int paramInt1, int paramInt2);
  
  private native void nativeSurfaceCreated(long paramLong, Surface paramSurface);
  
  private native void nativeSurfaceDestroyed(long paramLong);
  
  private native void nativeSurfaceWindowChanged(long paramLong, Surface paramSurface);
  
  private native void nativeUnregisterTexture(long paramLong1, long paramLong2);
  
  private native void nativeUpdateDisplayMetrics(long paramLong);
  
  private native void nativeUpdateJavaAssetManager(long paramLong, AssetManager paramAssetManager, String paramString);
  
  private native void nativeUpdateRefreshRate(float paramFloat);
  
  private void onPreEngineRestart()
  {
    Iterator localIterator = engineLifecycleListeners.iterator();
    while (localIterator.hasNext()) {
      ((FlutterEngine.EngineLifecycleListener)localIterator.next()).onPreEngineRestart();
    }
  }
  
  private void updateCustomAccessibilityActions(ByteBuffer paramByteBuffer, String[] paramArrayOfString)
  {
    ensureRunningOnMainThread();
    AccessibilityDelegate localAccessibilityDelegate = accessibilityDelegate;
    if (localAccessibilityDelegate != null) {
      localAccessibilityDelegate.updateCustomAccessibilityActions(paramByteBuffer, paramArrayOfString);
    }
  }
  
  private void updateSemantics(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    ensureRunningOnMainThread();
    AccessibilityDelegate localAccessibilityDelegate = accessibilityDelegate;
    if (localAccessibilityDelegate != null) {
      localAccessibilityDelegate.updateSemantics(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
    }
  }
  
  public void addEngineLifecycleListener(FlutterEngine.EngineLifecycleListener paramEngineLifecycleListener)
  {
    ensureRunningOnMainThread();
    engineLifecycleListeners.add(paramEngineLifecycleListener);
  }
  
  public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener paramFlutterUiDisplayListener)
  {
    ensureRunningOnMainThread();
    flutterUiDisplayListeners.add(paramFlutterUiDisplayListener);
  }
  
  public void attachToNative()
  {
    ensureRunningOnMainThread();
    ensureNotAttachedToNative();
    shellHolderLock.writeLock().lock();
    try
    {
      nativeShellHolderId = Long.valueOf(performNativeAttach(this));
      return;
    }
    finally
    {
      shellHolderLock.writeLock().unlock();
    }
  }
  
  public void cleanupMessageData(long paramLong)
  {
    nativeCleanupMessageData(paramLong);
  }
  
  public String[] computePlatformResolvedLocale(String[] paramArrayOfString)
  {
    if (localizationPlugin == null) {
      return new String[0];
    }
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfString.length; i += 3)
    {
      String str1 = paramArrayOfString[(i + 0)];
      String str2 = paramArrayOfString[(i + 1)];
      String str3 = paramArrayOfString[(i + 2)];
      Locale.Builder localBuilder = new Locale.Builder();
      if (!str1.isEmpty()) {
        localBuilder.setLanguage(str1);
      }
      if (!str2.isEmpty()) {
        localBuilder.setRegion(str2);
      }
      if (!str3.isEmpty()) {
        localBuilder.setScript(str3);
      }
      localArrayList.add(localBuilder.build());
    }
    paramArrayOfString = localizationPlugin.resolveNativeLocale(localArrayList);
    if (paramArrayOfString == null) {
      return new String[0];
    }
    return new String[] { paramArrayOfString.getLanguage(), paramArrayOfString.getCountry(), paramArrayOfString.getScript() };
  }
  
  public FlutterOverlaySurface createOverlaySurface()
  {
    ensureRunningOnMainThread();
    PlatformViewsController localPlatformViewsController = platformViewsController;
    if (localPlatformViewsController != null) {
      return localPlatformViewsController.createOverlaySurface();
    }
    throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
  }
  
  public void deferredComponentInstallFailure(int paramInt, String paramString, boolean paramBoolean)
  {
    ensureRunningOnMainThread();
    nativeDeferredComponentInstallFailure(paramInt, paramString, paramBoolean);
  }
  
  public void destroyOverlaySurfaces()
  {
    ensureRunningOnMainThread();
    PlatformViewsController localPlatformViewsController = platformViewsController;
    if (localPlatformViewsController != null)
    {
      localPlatformViewsController.destroyOverlaySurfaces();
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
  }
  
  public void detachFromNativeAndReleaseResources()
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    shellHolderLock.writeLock().lock();
    try
    {
      nativeDestroy(nativeShellHolderId.longValue());
      nativeShellHolderId = null;
      return;
    }
    finally
    {
      shellHolderLock.writeLock().unlock();
    }
  }
  
  public void dispatchEmptyPlatformMessage(String paramString, int paramInt)
  {
    ensureRunningOnMainThread();
    if (isAttached())
    {
      nativeDispatchEmptyPlatformMessage(nativeShellHolderId.longValue(), paramString, paramInt);
    }
    else
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(". Response ID: ");
      localStringBuilder.append(paramInt);
      Log.w("FlutterJNI", localStringBuilder.toString());
    }
  }
  
  public void dispatchPlatformMessage(String paramString, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    ensureRunningOnMainThread();
    if (isAttached())
    {
      nativeDispatchPlatformMessage(nativeShellHolderId.longValue(), paramString, paramByteBuffer, paramInt1, paramInt2);
    }
    else
    {
      paramByteBuffer = new StringBuilder();
      paramByteBuffer.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
      paramByteBuffer.append(paramString);
      paramByteBuffer.append(". Response ID: ");
      paramByteBuffer.append(paramInt2);
      Log.w("FlutterJNI", paramByteBuffer.toString());
    }
  }
  
  public void dispatchPointerDataPacket(ByteBuffer paramByteBuffer, int paramInt)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeDispatchPointerDataPacket(nativeShellHolderId.longValue(), paramByteBuffer, paramInt);
  }
  
  public void dispatchSemanticsAction(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeDispatchSemanticsAction(nativeShellHolderId.longValue(), paramInt1, paramInt2, paramByteBuffer, paramInt3);
  }
  
  public void dispatchSemanticsAction(int paramInt, AccessibilityBridge.Action paramAction)
  {
    dispatchSemanticsAction(paramInt, paramAction, null);
  }
  
  public void dispatchSemanticsAction(int paramInt, AccessibilityBridge.Action paramAction, Object paramObject)
  {
    ensureAttachedToNative();
    int i;
    if (paramObject != null)
    {
      paramObject = StandardMessageCodec.INSTANCE.encodeMessage(paramObject);
      i = ((Buffer)paramObject).position();
    }
    else
    {
      paramObject = null;
      i = 0;
    }
    dispatchSemanticsAction(paramInt, value, (ByteBuffer)paramObject, i);
  }
  
  public Bitmap getBitmap()
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    return nativeGetBitmap(nativeShellHolderId.longValue());
  }
  
  public boolean getIsSoftwareRenderingEnabled()
  {
    return nativeGetIsSoftwareRenderingEnabled();
  }
  
  public float getScaledFontSize(float paramFloat, int paramInt)
  {
    Object localObject = SettingsChannel.getPastDisplayMetrics(paramInt);
    if (localObject == null)
    {
      localObject = f.l("getScaledFontSize called with configurationId ");
      ((StringBuilder)localObject).append(String.valueOf(paramInt));
      ((StringBuilder)localObject).append(", which can't be found.");
      Log.e("FlutterJNI", ((StringBuilder)localObject).toString());
      return -1.0F;
    }
    return TypedValue.applyDimension(2, paramFloat, (DisplayMetrics)localObject) / density;
  }
  
  public void handlePlatformMessage(String paramString, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    PlatformMessageHandler localPlatformMessageHandler = platformMessageHandler;
    if (localPlatformMessageHandler != null) {
      localPlatformMessageHandler.handleMessageFromDart(paramString, paramByteBuffer, paramInt, paramLong);
    } else {
      nativeCleanupMessageData(paramLong);
    }
  }
  
  public void init(Context paramContext, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    if (initCalled) {
      Log.w("FlutterJNI", "FlutterJNI.init called more than once");
    }
    nativeInit(paramContext, paramArrayOfString, paramString1, paramString2, paramString3, paramLong);
    initCalled = true;
  }
  
  public void invokePlatformMessageEmptyResponseCallback(int paramInt)
  {
    shellHolderLock.readLock().lock();
    try
    {
      if (isAttached())
      {
        nativeInvokePlatformMessageEmptyResponseCallback(nativeShellHolderId.longValue(), paramInt);
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
        localStringBuilder.append(paramInt);
        Log.w("FlutterJNI", localStringBuilder.toString());
      }
      return;
    }
    finally
    {
      shellHolderLock.readLock().unlock();
    }
  }
  
  public void invokePlatformMessageResponseCallback(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2)
  {
    if (paramByteBuffer.isDirect())
    {
      shellHolderLock.readLock().lock();
      try
      {
        if (isAttached())
        {
          nativeInvokePlatformMessageResponseCallback(nativeShellHolderId.longValue(), paramInt1, paramByteBuffer, paramInt2);
        }
        else
        {
          paramByteBuffer = new java/lang/StringBuilder;
          paramByteBuffer.<init>();
          paramByteBuffer.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
          paramByteBuffer.append(paramInt1);
          Log.w("FlutterJNI", paramByteBuffer.toString());
        }
        return;
      }
      finally
      {
        shellHolderLock.readLock().unlock();
      }
    }
    throw new IllegalArgumentException("Expected a direct ByteBuffer.");
  }
  
  public boolean isAttached()
  {
    boolean bool;
    if (nativeShellHolderId != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isCodePointEmoji(int paramInt)
  {
    return nativeFlutterTextUtilsIsEmoji(paramInt);
  }
  
  public boolean isCodePointEmojiModifier(int paramInt)
  {
    return nativeFlutterTextUtilsIsEmojiModifier(paramInt);
  }
  
  public boolean isCodePointEmojiModifierBase(int paramInt)
  {
    return nativeFlutterTextUtilsIsEmojiModifierBase(paramInt);
  }
  
  public boolean isCodePointRegionalIndicator(int paramInt)
  {
    return nativeFlutterTextUtilsIsRegionalIndicator(paramInt);
  }
  
  public boolean isCodePointVariantSelector(int paramInt)
  {
    return nativeFlutterTextUtilsIsVariationSelector(paramInt);
  }
  
  public void loadDartDeferredLibrary(int paramInt, String[] paramArrayOfString)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeLoadDartDeferredLibrary(nativeShellHolderId.longValue(), paramInt, paramArrayOfString);
  }
  
  public void loadLibrary(Context paramContext)
  {
    if (loadLibraryCalled) {
      Log.w("FlutterJNI", "FlutterJNI.loadLibrary called more than once");
    }
    new g3.f().b(paramContext);
    loadLibraryCalled = true;
  }
  
  public void markTextureFrameAvailable(long paramLong)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeMarkTextureFrameAvailable(nativeShellHolderId.longValue(), paramLong);
  }
  
  public void notifyLowMemoryWarning()
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeNotifyLowMemoryWarning(nativeShellHolderId.longValue());
  }
  
  public void onBeginFrame()
  {
    ensureRunningOnMainThread();
    PlatformViewsController localPlatformViewsController = platformViewsController;
    if (localPlatformViewsController != null)
    {
      localPlatformViewsController.onBeginFrame();
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
  }
  
  public void onDisplayOverlaySurface(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ensureRunningOnMainThread();
    PlatformViewsController localPlatformViewsController = platformViewsController;
    if (localPlatformViewsController != null)
    {
      localPlatformViewsController.onDisplayOverlaySurface(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
  }
  
  public void onDisplayPlatformView(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, FlutterMutatorsStack paramFlutterMutatorsStack)
  {
    ensureRunningOnMainThread();
    PlatformViewsController localPlatformViewsController = platformViewsController;
    if (localPlatformViewsController != null)
    {
      localPlatformViewsController.onDisplayPlatformView(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramFlutterMutatorsStack);
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
  }
  
  public void onEndFrame()
  {
    ensureRunningOnMainThread();
    PlatformViewsController localPlatformViewsController = platformViewsController;
    if (localPlatformViewsController != null)
    {
      localPlatformViewsController.onEndFrame();
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
  }
  
  public void onFirstFrame()
  {
    ensureRunningOnMainThread();
    Iterator localIterator = flutterUiDisplayListeners.iterator();
    while (localIterator.hasNext()) {
      ((FlutterUiDisplayListener)localIterator.next()).onFlutterUiDisplayed();
    }
  }
  
  public void onRenderingStopped()
  {
    ensureRunningOnMainThread();
    Iterator localIterator = flutterUiDisplayListeners.iterator();
    while (localIterator.hasNext()) {
      ((FlutterUiDisplayListener)localIterator.next()).onFlutterUiNoLongerDisplayed();
    }
  }
  
  public void onSurfaceChanged(int paramInt1, int paramInt2)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSurfaceChanged(nativeShellHolderId.longValue(), paramInt1, paramInt2);
  }
  
  public void onSurfaceCreated(Surface paramSurface)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSurfaceCreated(nativeShellHolderId.longValue(), paramSurface);
  }
  
  public void onSurfaceDestroyed()
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    onRenderingStopped();
    nativeSurfaceDestroyed(nativeShellHolderId.longValue());
  }
  
  public void onSurfaceWindowChanged(Surface paramSurface)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSurfaceWindowChanged(nativeShellHolderId.longValue(), paramSurface);
  }
  
  public void onVsync(long paramLong1, long paramLong2, long paramLong3)
  {
    nativeOnVsync(paramLong1, paramLong2, paramLong3);
  }
  
  public long performNativeAttach(FlutterJNI paramFlutterJNI)
  {
    return nativeAttach(paramFlutterJNI);
  }
  
  public void prefetchDefaultFontManager()
  {
    if (prefetchDefaultFontManagerCalled) {
      Log.w("FlutterJNI", "FlutterJNI.prefetchDefaultFontManager called more than once");
    }
    nativePrefetchDefaultFontManager();
    prefetchDefaultFontManagerCalled = true;
  }
  
  public void registerImageTexture(long paramLong, TextureRegistry.ImageConsumer paramImageConsumer)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeRegisterImageTexture(nativeShellHolderId.longValue(), paramLong, new WeakReference(paramImageConsumer));
  }
  
  public void registerTexture(long paramLong, SurfaceTextureWrapper paramSurfaceTextureWrapper)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeRegisterTexture(nativeShellHolderId.longValue(), paramLong, new WeakReference(paramSurfaceTextureWrapper));
  }
  
  public void removeEngineLifecycleListener(FlutterEngine.EngineLifecycleListener paramEngineLifecycleListener)
  {
    ensureRunningOnMainThread();
    engineLifecycleListeners.remove(paramEngineLifecycleListener);
  }
  
  public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener paramFlutterUiDisplayListener)
  {
    ensureRunningOnMainThread();
    flutterUiDisplayListeners.remove(paramFlutterUiDisplayListener);
  }
  
  public void requestDartDeferredLibrary(int paramInt)
  {
    DeferredComponentManager localDeferredComponentManager = deferredComponentManager;
    if (localDeferredComponentManager != null) {
      localDeferredComponentManager.installDeferredComponent(paramInt, null);
    } else {
      Log.e("FlutterJNI", "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }
  }
  
  public void runBundleAndSnapshotFromLibrary(String paramString1, String paramString2, String paramString3, AssetManager paramAssetManager, List<String> paramList)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeRunBundleAndSnapshotFromLibrary(nativeShellHolderId.longValue(), paramString1, paramString2, paramString3, paramAssetManager, paramList);
  }
  
  public void scheduleFrame()
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeScheduleFrame(nativeShellHolderId.longValue());
  }
  
  public void setAccessibilityDelegate(AccessibilityDelegate paramAccessibilityDelegate)
  {
    ensureRunningOnMainThread();
    accessibilityDelegate = paramAccessibilityDelegate;
  }
  
  public void setAccessibilityFeatures(int paramInt)
  {
    ensureRunningOnMainThread();
    if (isAttached()) {
      setAccessibilityFeaturesInNative(paramInt);
    }
  }
  
  public void setAccessibilityFeaturesInNative(int paramInt)
  {
    nativeSetAccessibilityFeatures(nativeShellHolderId.longValue(), paramInt);
  }
  
  public void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate paramAsyncWaitForVsyncDelegate)
  {
    asyncWaitForVsyncDelegate = paramAsyncWaitForVsyncDelegate;
  }
  
  public void setDeferredComponentManager(DeferredComponentManager paramDeferredComponentManager)
  {
    ensureRunningOnMainThread();
    deferredComponentManager = paramDeferredComponentManager;
    if (paramDeferredComponentManager != null) {
      paramDeferredComponentManager.setJNI(this);
    }
  }
  
  public void setLocalizationPlugin(LocalizationPlugin paramLocalizationPlugin)
  {
    ensureRunningOnMainThread();
    localizationPlugin = paramLocalizationPlugin;
  }
  
  public void setPlatformMessageHandler(PlatformMessageHandler paramPlatformMessageHandler)
  {
    ensureRunningOnMainThread();
    platformMessageHandler = paramPlatformMessageHandler;
  }
  
  public void setPlatformViewsController(PlatformViewsController paramPlatformViewsController)
  {
    ensureRunningOnMainThread();
    platformViewsController = paramPlatformViewsController;
  }
  
  public void setRefreshRateFPS(float paramFloat)
  {
    refreshRateFPS = paramFloat;
    updateRefreshRate();
  }
  
  public void setSemanticsEnabled(boolean paramBoolean)
  {
    ensureRunningOnMainThread();
    if (isAttached()) {
      setSemanticsEnabledInNative(paramBoolean);
    }
  }
  
  public void setSemanticsEnabledInNative(boolean paramBoolean)
  {
    nativeSetSemanticsEnabled(nativeShellHolderId.longValue(), paramBoolean);
  }
  
  public void setViewportMetrics(float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSetViewportMetrics(nativeShellHolderId.longValue(), paramFloat, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramArrayOfInt1, paramArrayOfInt2, paramArrayOfInt3);
  }
  
  public FlutterJNI spawn(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    paramString2 = nativeSpawn(nativeShellHolderId.longValue(), paramString1, paramString2, paramString3, paramList);
    paramString1 = nativeShellHolderId;
    boolean bool;
    if ((paramString1 != null) && (paramString1.longValue() != 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "Failed to spawn new JNI connected shell from existing shell.");
    return paramString2;
  }
  
  public void unregisterTexture(long paramLong)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeUnregisterTexture(nativeShellHolderId.longValue(), paramLong);
  }
  
  public void updateDisplayMetrics(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    displayWidth = paramFloat1;
    displayHeight = paramFloat2;
    displayDensity = paramFloat3;
    if (!loadLibraryCalled) {
      return;
    }
    nativeUpdateDisplayMetrics(nativeShellHolderId.longValue());
  }
  
  public void updateJavaAssetManager(AssetManager paramAssetManager, String paramString)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeUpdateJavaAssetManager(nativeShellHolderId.longValue(), paramAssetManager, paramString);
  }
  
  public void updateRefreshRate()
  {
    if (!loadLibraryCalled) {
      return;
    }
    nativeUpdateRefreshRate(refreshRateFPS);
  }
  
  public static abstract interface AccessibilityDelegate
  {
    public abstract void updateCustomAccessibilityActions(ByteBuffer paramByteBuffer, String[] paramArrayOfString);
    
    public abstract void updateSemantics(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer);
  }
  
  public static abstract interface AsyncWaitForVsyncDelegate
  {
    public abstract void asyncWaitForVsync(long paramLong);
  }
  
  public static class Factory
  {
    public FlutterJNI provideFlutterJNI()
    {
      return new FlutterJNI();
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterJNI
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */