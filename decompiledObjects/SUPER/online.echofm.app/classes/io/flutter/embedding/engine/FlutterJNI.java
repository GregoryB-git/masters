package io.flutter.embedding.engine;

import D5.t;
import E5.p;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder.Source;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.r;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.i.g;
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
import t5.b;
import v5.i;
import w5.f;
import x5.a;

@Keep
public class FlutterJNI
{
  private static final String TAG = "FlutterJNI";
  private static b asyncWaitForVsyncDelegate;
  private static float displayDensity = -1.0F;
  private static float displayHeight = -1.0F;
  private static float displayWidth = -1.0F;
  private static boolean initCalled = false;
  private static boolean loadLibraryCalled = false;
  private static boolean prefetchDefaultFontManagerCalled = false;
  private static float refreshRateFPS = 60.0F;
  private static String vmServiceUri;
  private a accessibilityDelegate;
  private a deferredComponentManager;
  @NonNull
  private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
  @NonNull
  private final Set<j> flutterUiDisplayListeners = new CopyOnWriteArraySet();
  private F5.e localizationPlugin;
  @NonNull
  private final Looper mainLooper = Looper.getMainLooper();
  private Long nativeShellHolderId;
  private f platformMessageHandler;
  private r platformViewsController;
  private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
  
  private static void asyncWaitForVsync(long paramLong)
  {
    b localb = asyncWaitForVsyncDelegate;
    if (localb != null)
    {
      localb.a(paramLong);
      return;
    }
    throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
  }
  
  public static Bitmap decodeImage(@NonNull ByteBuffer paramByteBuffer, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      ImageDecoder.Source localSource = v5.d.a(paramByteBuffer);
      try
      {
        paramByteBuffer = new v5/i;
        paramByteBuffer.<init>(paramLong);
        paramByteBuffer = v5.e.a(localSource, paramByteBuffer);
        return paramByteBuffer;
      }
      catch (IOException paramByteBuffer)
      {
        b.c("FlutterJNI", "Failed to decode image", paramByteBuffer);
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
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Methods marked with @UiThread must be executed on the main thread. Current thread: ");
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
    f localf = platformMessageHandler;
    if (localf != null) {
      localf.e(paramInt, paramByteBuffer);
    }
  }
  
  private native long nativeAttach(@NonNull FlutterJNI paramFlutterJNI);
  
  private native void nativeCleanupMessageData(long paramLong);
  
  private native void nativeDeferredComponentInstallFailure(int paramInt, @NonNull String paramString, boolean paramBoolean);
  
  private native void nativeDestroy(long paramLong);
  
  private native void nativeDispatchEmptyPlatformMessage(long paramLong, @NonNull String paramString, int paramInt);
  
  private native void nativeDispatchPlatformMessage(long paramLong, @NonNull String paramString, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
  
  private native void nativeDispatchPointerDataPacket(long paramLong, @NonNull ByteBuffer paramByteBuffer, int paramInt);
  
  private native void nativeDispatchSemanticsAction(long paramLong, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3);
  
  private native boolean nativeFlutterTextUtilsIsEmoji(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsEmojiModifier(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int paramInt);
  
  private native boolean nativeFlutterTextUtilsIsVariationSelector(int paramInt);
  
  private native Bitmap nativeGetBitmap(long paramLong);
  
  private native boolean nativeGetIsSoftwareRenderingEnabled();
  
  public static native void nativeImageHeaderCallback(long paramLong, int paramInt1, int paramInt2);
  
  private static native void nativeInit(@NonNull Context paramContext, @NonNull String[] paramArrayOfString, String paramString1, @NonNull String paramString2, @NonNull String paramString3, long paramLong);
  
  private native void nativeInvokePlatformMessageEmptyResponseCallback(long paramLong, int paramInt);
  
  private native void nativeInvokePlatformMessageResponseCallback(long paramLong, int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  private native void nativeLoadDartDeferredLibrary(long paramLong, int paramInt, @NonNull String[] paramArrayOfString);
  
  @Deprecated
  @NonNull
  public static native FlutterCallbackInformation nativeLookupCallbackInformation(long paramLong);
  
  private native void nativeMarkTextureFrameAvailable(long paramLong1, long paramLong2);
  
  private native void nativeNotifyLowMemoryWarning(long paramLong);
  
  private native void nativeOnVsync(long paramLong1, long paramLong2, long paramLong3);
  
  private static native void nativePrefetchDefaultFontManager();
  
  private native void nativeRegisterImageTexture(long paramLong1, long paramLong2, @NonNull WeakReference<TextureRegistry.ImageConsumer> paramWeakReference);
  
  private native void nativeRegisterTexture(long paramLong1, long paramLong2, @NonNull WeakReference<SurfaceTextureWrapper> paramWeakReference);
  
  private native void nativeRunBundleAndSnapshotFromLibrary(long paramLong, @NonNull String paramString1, String paramString2, String paramString3, @NonNull AssetManager paramAssetManager, List<String> paramList);
  
  private native void nativeScheduleFrame(long paramLong);
  
  private native void nativeSetAccessibilityFeatures(long paramLong, int paramInt);
  
  private native void nativeSetSemanticsEnabled(long paramLong, boolean paramBoolean);
  
  private native void nativeSetViewportMetrics(long paramLong, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3);
  
  private native FlutterJNI nativeSpawn(long paramLong, String paramString1, String paramString2, String paramString3, List<String> paramList);
  
  private native void nativeSurfaceChanged(long paramLong, int paramInt1, int paramInt2);
  
  private native void nativeSurfaceCreated(long paramLong, @NonNull Surface paramSurface);
  
  private native void nativeSurfaceDestroyed(long paramLong);
  
  private native void nativeSurfaceWindowChanged(long paramLong, @NonNull Surface paramSurface);
  
  private native void nativeUnregisterTexture(long paramLong1, long paramLong2);
  
  private native void nativeUpdateDisplayMetrics(long paramLong);
  
  private native void nativeUpdateJavaAssetManager(long paramLong, @NonNull AssetManager paramAssetManager, @NonNull String paramString);
  
  private native void nativeUpdateRefreshRate(float paramFloat);
  
  private void onPreEngineRestart()
  {
    Iterator localIterator = engineLifecycleListeners.iterator();
    while (localIterator.hasNext()) {
      ((a.b)localIterator.next()).b();
    }
  }
  
  private void updateCustomAccessibilityActions(@NonNull ByteBuffer paramByteBuffer, @NonNull String[] paramArrayOfString)
  {
    ensureRunningOnMainThread();
    a locala = accessibilityDelegate;
    if (locala != null) {
      locala.c(paramByteBuffer, paramArrayOfString);
    }
  }
  
  private void updateSemantics(@NonNull ByteBuffer paramByteBuffer, @NonNull String[] paramArrayOfString, @NonNull ByteBuffer[] paramArrayOfByteBuffer)
  {
    ensureRunningOnMainThread();
    a locala = accessibilityDelegate;
    if (locala != null) {
      locala.b(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
    }
  }
  
  public void addEngineLifecycleListener(@NonNull a.b paramb)
  {
    ensureRunningOnMainThread();
    engineLifecycleListeners.add(paramb);
  }
  
  public void addIsDisplayingFlutterUiListener(@NonNull j paramj)
  {
    ensureRunningOnMainThread();
    flutterUiDisplayListeners.add(paramj);
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
  
  public String[] computePlatformResolvedLocale(@NonNull String[] paramArrayOfString)
  {
    if (localizationPlugin == null) {
      return new String[0];
    }
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfString.length; i += 3)
    {
      String str1 = paramArrayOfString[i];
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
    paramArrayOfString = localizationPlugin.c(localArrayList);
    if (paramArrayOfString == null) {
      return new String[0];
    }
    return new String[] { paramArrayOfString.getLanguage(), paramArrayOfString.getCountry(), paramArrayOfString.getScript() };
  }
  
  public FlutterOverlaySurface createOverlaySurface()
  {
    ensureRunningOnMainThread();
    r localr = platformViewsController;
    if (localr != null) {
      return localr.A();
    }
    throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
  }
  
  public void deferredComponentInstallFailure(int paramInt, @NonNull String paramString, boolean paramBoolean)
  {
    ensureRunningOnMainThread();
    nativeDeferredComponentInstallFailure(paramInt, paramString, paramBoolean);
  }
  
  public void destroyOverlaySurfaces()
  {
    ensureRunningOnMainThread();
    r localr = platformViewsController;
    if (localr != null)
    {
      localr.D();
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
  
  public void dispatchEmptyPlatformMessage(@NonNull String paramString, int paramInt)
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
      b.g("FlutterJNI", localStringBuilder.toString());
    }
  }
  
  public void dispatchPlatformMessage(@NonNull String paramString, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
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
      b.g("FlutterJNI", paramByteBuffer.toString());
    }
  }
  
  public void dispatchPointerDataPacket(@NonNull ByteBuffer paramByteBuffer, int paramInt)
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
  
  public void dispatchSemanticsAction(int paramInt, @NonNull i.g paramg)
  {
    dispatchSemanticsAction(paramInt, paramg, null);
  }
  
  public void dispatchSemanticsAction(int paramInt, @NonNull i.g paramg, Object paramObject)
  {
    ensureAttachedToNative();
    int i;
    if (paramObject != null)
    {
      paramObject = p.a.a(paramObject);
      i = ((Buffer)paramObject).position();
    }
    else
    {
      paramObject = null;
      i = 0;
    }
    dispatchSemanticsAction(paramInt, o, (ByteBuffer)paramObject, i);
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
    Object localObject = t.b(paramInt);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("getScaledFontSize called with configurationId ");
      ((StringBuilder)localObject).append(String.valueOf(paramInt));
      ((StringBuilder)localObject).append(", which can't be found.");
      b.b("FlutterJNI", ((StringBuilder)localObject).toString());
      return -1.0F;
    }
    return TypedValue.applyDimension(2, paramFloat, (DisplayMetrics)localObject) / density;
  }
  
  public void handlePlatformMessage(@NonNull String paramString, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    f localf = platformMessageHandler;
    if (localf != null) {
      localf.g(paramString, paramByteBuffer, paramInt, paramLong);
    } else {
      nativeCleanupMessageData(paramLong);
    }
  }
  
  public void init(@NonNull Context paramContext, @NonNull String[] paramArrayOfString, String paramString1, @NonNull String paramString2, @NonNull String paramString3, long paramLong)
  {
    if (initCalled) {
      b.g("FlutterJNI", "FlutterJNI.init called more than once");
    }
    nativeInit(paramContext, paramArrayOfString, paramString1, paramString2, paramString3, paramLong);
    initCalled = true;
  }
  
  public void invokePlatformMessageEmptyResponseCallback(int paramInt)
  {
    shellHolderLock.readLock().lock();
    try
    {
      if (isAttached()) {
        nativeInvokePlatformMessageEmptyResponseCallback(nativeShellHolderId.longValue(), paramInt);
      }
    }
    finally
    {
      break label78;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
    localStringBuilder.append(paramInt);
    b.g("FlutterJNI", localStringBuilder.toString());
    shellHolderLock.readLock().unlock();
    return;
    label78:
    shellHolderLock.readLock().unlock();
    throw localStringBuilder;
  }
  
  public void invokePlatformMessageResponseCallback(int paramInt1, @NonNull ByteBuffer paramByteBuffer, int paramInt2)
  {
    if (paramByteBuffer.isDirect())
    {
      shellHolderLock.readLock().lock();
      try
      {
        if (isAttached()) {
          nativeInvokePlatformMessageResponseCallback(nativeShellHolderId.longValue(), paramInt1, paramByteBuffer, paramInt2);
        }
      }
      finally
      {
        break label87;
      }
      paramByteBuffer = new java/lang/StringBuilder;
      paramByteBuffer.<init>();
      paramByteBuffer.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
      paramByteBuffer.append(paramInt1);
      b.g("FlutterJNI", paramByteBuffer.toString());
      shellHolderLock.readLock().unlock();
      return;
      label87:
      shellHolderLock.readLock().unlock();
      throw paramByteBuffer;
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
  
  public void loadDartDeferredLibrary(int paramInt, @NonNull String[] paramArrayOfString)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeLoadDartDeferredLibrary(nativeShellHolderId.longValue(), paramInt, paramArrayOfString);
  }
  
  public void loadLibrary()
  {
    if (loadLibraryCalled) {
      b.g("FlutterJNI", "FlutterJNI.loadLibrary called more than once");
    }
    System.loadLibrary("flutter");
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
    r localr = platformViewsController;
    if (localr != null)
    {
      localr.S();
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
  }
  
  public void onDisplayOverlaySurface(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ensureRunningOnMainThread();
    r localr = platformViewsController;
    if (localr != null)
    {
      localr.U(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
  }
  
  public void onDisplayPlatformView(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, FlutterMutatorsStack paramFlutterMutatorsStack)
  {
    ensureRunningOnMainThread();
    r localr = platformViewsController;
    if (localr != null)
    {
      localr.V(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramFlutterMutatorsStack);
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
  }
  
  public void onEndFrame()
  {
    ensureRunningOnMainThread();
    r localr = platformViewsController;
    if (localr != null)
    {
      localr.W();
      return;
    }
    throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
  }
  
  public void onFirstFrame()
  {
    ensureRunningOnMainThread();
    Iterator localIterator = flutterUiDisplayListeners.iterator();
    while (localIterator.hasNext()) {
      ((j)localIterator.next()).e();
    }
  }
  
  public void onRenderingStopped()
  {
    ensureRunningOnMainThread();
    Iterator localIterator = flutterUiDisplayListeners.iterator();
    while (localIterator.hasNext()) {
      ((j)localIterator.next()).b();
    }
  }
  
  public void onSurfaceChanged(int paramInt1, int paramInt2)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSurfaceChanged(nativeShellHolderId.longValue(), paramInt1, paramInt2);
  }
  
  public void onSurfaceCreated(@NonNull Surface paramSurface)
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
  
  public void onSurfaceWindowChanged(@NonNull Surface paramSurface)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSurfaceWindowChanged(nativeShellHolderId.longValue(), paramSurface);
  }
  
  public void onVsync(long paramLong1, long paramLong2, long paramLong3)
  {
    nativeOnVsync(paramLong1, paramLong2, paramLong3);
  }
  
  public long performNativeAttach(@NonNull FlutterJNI paramFlutterJNI)
  {
    return nativeAttach(paramFlutterJNI);
  }
  
  public void prefetchDefaultFontManager()
  {
    if (prefetchDefaultFontManagerCalled) {
      b.g("FlutterJNI", "FlutterJNI.prefetchDefaultFontManager called more than once");
    }
    nativePrefetchDefaultFontManager();
    prefetchDefaultFontManagerCalled = true;
  }
  
  public void registerImageTexture(long paramLong, @NonNull TextureRegistry.ImageConsumer paramImageConsumer)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeRegisterImageTexture(nativeShellHolderId.longValue(), paramLong, new WeakReference(paramImageConsumer));
  }
  
  public void registerTexture(long paramLong, @NonNull SurfaceTextureWrapper paramSurfaceTextureWrapper)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeRegisterTexture(nativeShellHolderId.longValue(), paramLong, new WeakReference(paramSurfaceTextureWrapper));
  }
  
  public void removeEngineLifecycleListener(@NonNull a.b paramb)
  {
    ensureRunningOnMainThread();
    engineLifecycleListeners.remove(paramb);
  }
  
  public void removeIsDisplayingFlutterUiListener(@NonNull j paramj)
  {
    ensureRunningOnMainThread();
    flutterUiDisplayListeners.remove(paramj);
  }
  
  public void requestDartDeferredLibrary(int paramInt)
  {
    b.b("FlutterJNI", "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
  }
  
  public void runBundleAndSnapshotFromLibrary(@NonNull String paramString1, String paramString2, String paramString3, @NonNull AssetManager paramAssetManager, List<String> paramList)
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
  
  public void setAccessibilityDelegate(a parama)
  {
    ensureRunningOnMainThread();
    accessibilityDelegate = parama;
  }
  
  public void setAccessibilityFeatures(int paramInt)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSetAccessibilityFeatures(nativeShellHolderId.longValue(), paramInt);
  }
  
  public void setAsyncWaitForVsyncDelegate(b paramb)
  {
    asyncWaitForVsyncDelegate = paramb;
  }
  
  public void setDeferredComponentManager(a parama)
  {
    ensureRunningOnMainThread();
    if (parama != null) {
      parama.a(this);
    }
  }
  
  public void setLocalizationPlugin(F5.e parame)
  {
    ensureRunningOnMainThread();
    localizationPlugin = parame;
  }
  
  public void setPlatformMessageHandler(f paramf)
  {
    ensureRunningOnMainThread();
    platformMessageHandler = paramf;
  }
  
  public void setPlatformViewsController(@NonNull r paramr)
  {
    ensureRunningOnMainThread();
    platformViewsController = paramr;
  }
  
  public void setRefreshRateFPS(float paramFloat)
  {
    refreshRateFPS = paramFloat;
    updateRefreshRate();
  }
  
  public void setSemanticsEnabled(boolean paramBoolean)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSetSemanticsEnabled(nativeShellHolderId.longValue(), paramBoolean);
  }
  
  public void setViewportMetrics(float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    nativeSetViewportMetrics(nativeShellHolderId.longValue(), paramFloat, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramArrayOfInt1, paramArrayOfInt2, paramArrayOfInt3);
  }
  
  @NonNull
  public FlutterJNI spawn(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    ensureRunningOnMainThread();
    ensureAttachedToNative();
    paramString1 = nativeSpawn(nativeShellHolderId.longValue(), paramString1, paramString2, paramString3, paramList);
    paramString2 = nativeShellHolderId;
    boolean bool;
    if ((paramString2 != null) && (paramString2.longValue() != 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    T5.d.a(bool, "Failed to spawn new JNI connected shell from existing shell.");
    return paramString1;
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
  
  public void updateJavaAssetManager(@NonNull AssetManager paramAssetManager, @NonNull String paramString)
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
  
  public static abstract interface a
  {
    public abstract void b(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer);
    
    public abstract void c(ByteBuffer paramByteBuffer, String[] paramArrayOfString);
  }
  
  public static abstract interface b
  {
    public abstract void a(long paramLong);
  }
  
  public static class c
  {
    public FlutterJNI a()
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