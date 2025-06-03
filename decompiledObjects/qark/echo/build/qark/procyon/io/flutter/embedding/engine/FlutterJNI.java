// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine;

import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import D5.t;
import E5.p;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Iterator;
import android.view.Surface;
import java.util.List;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.TextureRegistry;
import java.lang.ref.WeakReference;
import io.flutter.view.FlutterCallbackInformation;
import android.content.Context;
import android.util.Size;
import v5.h;
import v5.g;
import u5.o;
import u5.n;
import java.io.IOException;
import t5.b;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import v5.i;
import v5.d;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import android.graphics.ImageDecoder$Source;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import io.flutter.plugin.platform.r;
import w5.f;
import android.os.Looper;
import F5.e;
import io.flutter.embedding.engine.renderer.j;
import androidx.annotation.NonNull;
import java.util.Set;
import x5.a;
import androidx.annotation.Keep;

@Keep
public class FlutterJNI
{
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private a accessibilityDelegate;
    private x5.a deferredComponentManager;
    @NonNull
    private final Set<io.flutter.embedding.engine.a.b> engineLifecycleListeners;
    @NonNull
    private final Set<j> flutterUiDisplayListeners;
    private e localizationPlugin;
    @NonNull
    private final Looper mainLooper;
    private Long nativeShellHolderId;
    private f platformMessageHandler;
    private r platformViewsController;
    private ReentrantReadWriteLock shellHolderLock;
    
    public FlutterJNI() {
        this.shellHolderLock = new ReentrantReadWriteLock();
        this.engineLifecycleListeners = new CopyOnWriteArraySet<io.flutter.embedding.engine.a.b>();
        this.flutterUiDisplayListeners = new CopyOnWriteArraySet<j>();
        this.mainLooper = Looper.getMainLooper();
    }
    
    private static void asyncWaitForVsync(final long n) {
        final b asyncWaitForVsyncDelegate = FlutterJNI.asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate != null) {
            asyncWaitForVsyncDelegate.a(n);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }
    
    public static Bitmap decodeImage(@NonNull final ByteBuffer byteBuffer, final long n) {
        if (Build$VERSION.SDK_INT >= 28) {
            final ImageDecoder$Source a = d.a(byteBuffer);
            try {
                return v5.e.a(a, (ImageDecoder$OnHeaderDecodedListener)new i(n));
            }
            catch (IOException ex) {
                t5.b.c("FlutterJNI", "Failed to decode image", ex);
            }
        }
        return null;
    }
    
    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }
    
    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }
    
    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Methods marked with @UiThread must be executed on the main thread. Current thread: ");
        sb.append(Thread.currentThread().getName());
        throw new RuntimeException(sb.toString());
    }
    
    @Deprecated
    public static String getObservatoryUri() {
        return FlutterJNI.vmServiceUri;
    }
    
    public static String getVMServiceUri() {
        return FlutterJNI.vmServiceUri;
    }
    
    private void handlePlatformMessageResponse(final int n, final ByteBuffer byteBuffer) {
        final f platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.e(n, byteBuffer);
        }
    }
    
    private native long nativeAttach(@NonNull final FlutterJNI p0);
    
    private native void nativeCleanupMessageData(final long p0);
    
    private native void nativeDeferredComponentInstallFailure(final int p0, @NonNull final String p1, final boolean p2);
    
    private native void nativeDestroy(final long p0);
    
    private native void nativeDispatchEmptyPlatformMessage(final long p0, @NonNull final String p1, final int p2);
    
    private native void nativeDispatchPlatformMessage(final long p0, @NonNull final String p1, final ByteBuffer p2, final int p3, final int p4);
    
    private native void nativeDispatchPointerDataPacket(final long p0, @NonNull final ByteBuffer p1, final int p2);
    
    private native void nativeDispatchSemanticsAction(final long p0, final int p1, final int p2, final ByteBuffer p3, final int p4);
    
    private native boolean nativeFlutterTextUtilsIsEmoji(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsEmojiModifier(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(final int p0);
    
    private native boolean nativeFlutterTextUtilsIsVariationSelector(final int p0);
    
    private native Bitmap nativeGetBitmap(final long p0);
    
    private native boolean nativeGetIsSoftwareRenderingEnabled();
    
    public static native void nativeImageHeaderCallback(final long p0, final int p1, final int p2);
    
    private static native void nativeInit(@NonNull final Context p0, @NonNull final String[] p1, final String p2, @NonNull final String p3, @NonNull final String p4, final long p5);
    
    private native void nativeInvokePlatformMessageEmptyResponseCallback(final long p0, final int p1);
    
    private native void nativeInvokePlatformMessageResponseCallback(final long p0, final int p1, final ByteBuffer p2, final int p3);
    
    private native void nativeLoadDartDeferredLibrary(final long p0, final int p1, @NonNull final String[] p2);
    
    @Deprecated
    @NonNull
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(final long p0);
    
    private native void nativeMarkTextureFrameAvailable(final long p0, final long p1);
    
    private native void nativeNotifyLowMemoryWarning(final long p0);
    
    private native void nativeOnVsync(final long p0, final long p1, final long p2);
    
    private static native void nativePrefetchDefaultFontManager();
    
    private native void nativeRegisterImageTexture(final long p0, final long p1, @NonNull final WeakReference<TextureRegistry.ImageConsumer> p2);
    
    private native void nativeRegisterTexture(final long p0, final long p1, @NonNull final WeakReference<SurfaceTextureWrapper> p2);
    
    private native void nativeRunBundleAndSnapshotFromLibrary(final long p0, @NonNull final String p1, final String p2, final String p3, @NonNull final AssetManager p4, final List<String> p5);
    
    private native void nativeScheduleFrame(final long p0);
    
    private native void nativeSetAccessibilityFeatures(final long p0, final int p1);
    
    private native void nativeSetSemanticsEnabled(final long p0, final boolean p1);
    
    private native void nativeSetViewportMetrics(final long p0, final float p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int[] p17, final int[] p18, final int[] p19);
    
    private native FlutterJNI nativeSpawn(final long p0, final String p1, final String p2, final String p3, final List<String> p4);
    
    private native void nativeSurfaceChanged(final long p0, final int p1, final int p2);
    
    private native void nativeSurfaceCreated(final long p0, @NonNull final Surface p1);
    
    private native void nativeSurfaceDestroyed(final long p0);
    
    private native void nativeSurfaceWindowChanged(final long p0, @NonNull final Surface p1);
    
    private native void nativeUnregisterTexture(final long p0, final long p1);
    
    private native void nativeUpdateDisplayMetrics(final long p0);
    
    private native void nativeUpdateJavaAssetManager(final long p0, @NonNull final AssetManager p1, @NonNull final String p2);
    
    private native void nativeUpdateRefreshRate(final float p0);
    
    private void onPreEngineRestart() {
        final Iterator<io.flutter.embedding.engine.a.b> iterator = this.engineLifecycleListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }
    
    private void updateCustomAccessibilityActions(@NonNull final ByteBuffer byteBuffer, @NonNull final String[] array) {
        this.ensureRunningOnMainThread();
        final a accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.c(byteBuffer, array);
        }
    }
    
    private void updateSemantics(@NonNull final ByteBuffer byteBuffer, @NonNull final String[] array, @NonNull final ByteBuffer[] array2) {
        this.ensureRunningOnMainThread();
        final a accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.b(byteBuffer, array, array2);
        }
    }
    
    public void addEngineLifecycleListener(@NonNull final io.flutter.embedding.engine.a.b b) {
        this.ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(b);
    }
    
    public void addIsDisplayingFlutterUiListener(@NonNull final j j) {
        this.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(j);
    }
    
    public void attachToNative() {
        this.ensureRunningOnMainThread();
        this.ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = this.performNativeAttach(this);
        }
        finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }
    
    public void cleanupMessageData(final long n) {
        this.nativeCleanupMessageData(n);
    }
    
    public String[] computePlatformResolvedLocale(@NonNull final String[] array) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        final ArrayList<Locale> list = new ArrayList<Locale>();
        for (int i = 0; i < array.length; i += 3) {
            final String language = array[i];
            final String region = array[i + 1];
            final String script = array[i + 2];
            final Locale.Builder builder = new Locale.Builder();
            if (!language.isEmpty()) {
                builder.setLanguage(language);
            }
            if (!region.isEmpty()) {
                builder.setRegion(region);
            }
            if (!script.isEmpty()) {
                builder.setScript(script);
            }
            list.add(builder.build());
        }
        final Locale c = this.localizationPlugin.c(list);
        if (c == null) {
            return new String[0];
        }
        return new String[] { c.getLanguage(), c.getCountry(), c.getScript() };
    }
    
    public FlutterOverlaySurface createOverlaySurface() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.A();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }
    
    public void deferredComponentInstallFailure(final int n, @NonNull final String s, final boolean b) {
        this.ensureRunningOnMainThread();
        this.nativeDeferredComponentInstallFailure(n, s, b);
    }
    
    public void destroyOverlaySurfaces() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.D();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }
    
    public void detachFromNativeAndReleaseResources() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeDestroy(this.nativeShellHolderId);
            this.nativeShellHolderId = null;
        }
        finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }
    
    public void dispatchEmptyPlatformMessage(@NonNull final String str, final int i) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId, str, i);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
        sb.append(str);
        sb.append(". Response ID: ");
        sb.append(i);
        t5.b.g("FlutterJNI", sb.toString());
    }
    
    public void dispatchPlatformMessage(@NonNull final String str, final ByteBuffer byteBuffer, final int n, final int i) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.nativeDispatchPlatformMessage(this.nativeShellHolderId, str, byteBuffer, n, i);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
        sb.append(str);
        sb.append(". Response ID: ");
        sb.append(i);
        t5.b.g("FlutterJNI", sb.toString());
    }
    
    public void dispatchPointerDataPacket(@NonNull final ByteBuffer byteBuffer, final int n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDispatchPointerDataPacket(this.nativeShellHolderId, byteBuffer, n);
    }
    
    public void dispatchSemanticsAction(final int n, final int n2, final ByteBuffer byteBuffer, final int n3) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDispatchSemanticsAction(this.nativeShellHolderId, n, n2, byteBuffer, n3);
    }
    
    public void dispatchSemanticsAction(final int n, @NonNull final io.flutter.view.i.g g) {
        this.dispatchSemanticsAction(n, g, null);
    }
    
    public void dispatchSemanticsAction(final int n, @NonNull final io.flutter.view.i.g g, final Object o) {
        this.ensureAttachedToNative();
        ByteBuffer a;
        int position;
        if (o != null) {
            a = p.a.a(o);
            position = a.position();
        }
        else {
            a = null;
            position = 0;
        }
        this.dispatchSemanticsAction(n, g.o, a, position);
    }
    
    public Bitmap getBitmap() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        return this.nativeGetBitmap(this.nativeShellHolderId);
    }
    
    public boolean getIsSoftwareRenderingEnabled() {
        return this.nativeGetIsSoftwareRenderingEnabled();
    }
    
    public float getScaledFontSize(final float n, final int i) {
        final DisplayMetrics b = t.b(i);
        if (b == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getScaledFontSize called with configurationId ");
            sb.append(String.valueOf(i));
            sb.append(", which can't be found.");
            t5.b.b("FlutterJNI", sb.toString());
            return -1.0f;
        }
        return TypedValue.applyDimension(2, n, b) / b.density;
    }
    
    public void handlePlatformMessage(@NonNull final String s, final ByteBuffer byteBuffer, final int n, final long n2) {
        final f platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.g(s, byteBuffer, n, n2);
            return;
        }
        this.nativeCleanupMessageData(n2);
    }
    
    public void init(@NonNull final Context context, @NonNull final String[] array, final String s, @NonNull final String s2, @NonNull final String s3, final long n) {
        if (FlutterJNI.initCalled) {
            t5.b.g("FlutterJNI", "FlutterJNI.init called more than once");
        }
        nativeInit(context, array, s, s2, s3, n);
        FlutterJNI.initCalled = true;
    }
    
    public void invokePlatformMessageEmptyResponseCallback(final int i) {
        this.shellHolderLock.readLock().lock();
        while (true) {
            try {
                if (this.isAttached()) {
                    this.nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId, i);
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
                    sb.append(i);
                    t5.b.g("FlutterJNI", sb.toString());
                }
                this.shellHolderLock.readLock().unlock();
                return;
                this.shellHolderLock.readLock().unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void invokePlatformMessageResponseCallback(final int i, @NonNull final ByteBuffer byteBuffer, final int n) {
        while (true) {
            if (byteBuffer.isDirect()) {
                this.shellHolderLock.readLock().lock();
                while (true) {
                    try {
                        if (this.isAttached()) {
                            this.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId, i, byteBuffer, n);
                        }
                        else {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
                            sb.append(i);
                            t5.b.g("FlutterJNI", sb.toString());
                        }
                        this.shellHolderLock.readLock().unlock();
                        return;
                        throw new IllegalArgumentException("Expected a direct ByteBuffer.");
                        this.shellHolderLock.readLock().unlock();
                    }
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }
    
    public boolean isCodePointEmoji(final int n) {
        return this.nativeFlutterTextUtilsIsEmoji(n);
    }
    
    public boolean isCodePointEmojiModifier(final int n) {
        return this.nativeFlutterTextUtilsIsEmojiModifier(n);
    }
    
    public boolean isCodePointEmojiModifierBase(final int n) {
        return this.nativeFlutterTextUtilsIsEmojiModifierBase(n);
    }
    
    public boolean isCodePointRegionalIndicator(final int n) {
        return this.nativeFlutterTextUtilsIsRegionalIndicator(n);
    }
    
    public boolean isCodePointVariantSelector(final int n) {
        return this.nativeFlutterTextUtilsIsVariationSelector(n);
    }
    
    public void loadDartDeferredLibrary(final int n, @NonNull final String[] array) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeLoadDartDeferredLibrary(this.nativeShellHolderId, n, array);
    }
    
    public void loadLibrary() {
        if (FlutterJNI.loadLibraryCalled) {
            t5.b.g("FlutterJNI", "FlutterJNI.loadLibrary called more than once");
        }
        System.loadLibrary("flutter");
        FlutterJNI.loadLibraryCalled = true;
    }
    
    public void markTextureFrameAvailable(final long n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeMarkTextureFrameAvailable(this.nativeShellHolderId, n);
    }
    
    public void notifyLowMemoryWarning() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeNotifyLowMemoryWarning(this.nativeShellHolderId);
    }
    
    public void onBeginFrame() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.S();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }
    
    public void onDisplayOverlaySurface(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.U(n, n2, n3, n4, n5);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }
    
    public void onDisplayPlatformView(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final FlutterMutatorsStack flutterMutatorsStack) {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.V(n, n2, n3, n4, n5, n6, n7, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }
    
    public void onEndFrame() {
        this.ensureRunningOnMainThread();
        final r platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.W();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }
    
    public void onFirstFrame() {
        this.ensureRunningOnMainThread();
        final Iterator<j> iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().e();
        }
    }
    
    public void onRenderingStopped() {
        this.ensureRunningOnMainThread();
        final Iterator<j> iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }
    
    public void onSurfaceChanged(final int n, final int n2) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceChanged(this.nativeShellHolderId, n, n2);
    }
    
    public void onSurfaceCreated(@NonNull final Surface surface) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceCreated(this.nativeShellHolderId, surface);
    }
    
    public void onSurfaceDestroyed() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.onRenderingStopped();
        this.nativeSurfaceDestroyed(this.nativeShellHolderId);
    }
    
    public void onSurfaceWindowChanged(@NonNull final Surface surface) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceWindowChanged(this.nativeShellHolderId, surface);
    }
    
    public void onVsync(final long n, final long n2, final long n3) {
        this.nativeOnVsync(n, n2, n3);
    }
    
    public long performNativeAttach(@NonNull final FlutterJNI flutterJNI) {
        return this.nativeAttach(flutterJNI);
    }
    
    public void prefetchDefaultFontManager() {
        if (FlutterJNI.prefetchDefaultFontManagerCalled) {
            t5.b.g("FlutterJNI", "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        FlutterJNI.prefetchDefaultFontManagerCalled = true;
    }
    
    public void registerImageTexture(final long n, @NonNull final TextureRegistry.ImageConsumer referent) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRegisterImageTexture(this.nativeShellHolderId, n, new WeakReference<TextureRegistry.ImageConsumer>(referent));
    }
    
    public void registerTexture(final long n, @NonNull final SurfaceTextureWrapper referent) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRegisterTexture(this.nativeShellHolderId, n, new WeakReference<SurfaceTextureWrapper>(referent));
    }
    
    public void removeEngineLifecycleListener(@NonNull final io.flutter.embedding.engine.a.b b) {
        this.ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(b);
    }
    
    public void removeIsDisplayingFlutterUiListener(@NonNull final j j) {
        this.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(j);
    }
    
    public void requestDartDeferredLibrary(final int n) {
        t5.b.b("FlutterJNI", "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }
    
    public void runBundleAndSnapshotFromLibrary(@NonNull final String s, final String s2, final String s3, @NonNull final AssetManager assetManager, final List<String> list) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId, s, s2, s3, assetManager, list);
    }
    
    public void scheduleFrame() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeScheduleFrame(this.nativeShellHolderId);
    }
    
    public void setAccessibilityDelegate(final a accessibilityDelegate) {
        this.ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }
    
    public void setAccessibilityFeatures(final int n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetAccessibilityFeatures(this.nativeShellHolderId, n);
    }
    
    public void setAsyncWaitForVsyncDelegate(final b asyncWaitForVsyncDelegate) {
        FlutterJNI.asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate;
    }
    
    public void setDeferredComponentManager(final x5.a a) {
        this.ensureRunningOnMainThread();
        if (a != null) {
            a.a(this);
        }
    }
    
    public void setLocalizationPlugin(final e localizationPlugin) {
        this.ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }
    
    public void setPlatformMessageHandler(final f platformMessageHandler) {
        this.ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }
    
    public void setPlatformViewsController(@NonNull final r platformViewsController) {
        this.ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }
    
    public void setRefreshRateFPS(final float refreshRateFPS) {
        FlutterJNI.refreshRateFPS = refreshRateFPS;
        this.updateRefreshRate();
    }
    
    public void setSemanticsEnabled(final boolean b) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetSemanticsEnabled(this.nativeShellHolderId, b);
    }
    
    public void setViewportMetrics(final float n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int[] array, final int[] array2, final int[] array3) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetViewportMetrics(this.nativeShellHolderId, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, array, array2, array3);
    }
    
    @NonNull
    public FlutterJNI spawn(final String s, final String s2, final String s3, final List<String> list) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        final FlutterJNI nativeSpawn = this.nativeSpawn(this.nativeShellHolderId, s, s2, s3, list);
        final Long nativeShellHolderId = nativeSpawn.nativeShellHolderId;
        T5.d.a(nativeShellHolderId != null && nativeShellHolderId != 0L, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }
    
    public void unregisterTexture(final long n) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeUnregisterTexture(this.nativeShellHolderId, n);
    }
    
    public void updateDisplayMetrics(final int n, final float displayWidth, final float displayHeight, final float displayDensity) {
        FlutterJNI.displayWidth = displayWidth;
        FlutterJNI.displayHeight = displayHeight;
        FlutterJNI.displayDensity = displayDensity;
        if (!FlutterJNI.loadLibraryCalled) {
            return;
        }
        this.nativeUpdateDisplayMetrics(this.nativeShellHolderId);
    }
    
    public void updateJavaAssetManager(@NonNull final AssetManager assetManager, @NonNull final String s) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeUpdateJavaAssetManager(this.nativeShellHolderId, assetManager, s);
    }
    
    public void updateRefreshRate() {
        if (!FlutterJNI.loadLibraryCalled) {
            return;
        }
        this.nativeUpdateRefreshRate(FlutterJNI.refreshRateFPS);
    }
    
    public interface a
    {
        void b(final ByteBuffer p0, final String[] p1, final ByteBuffer[] p2);
        
        void c(final ByteBuffer p0, final String[] p1);
    }
    
    public interface b
    {
        void a(final long p0);
    }
    
    public static class c
    {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }
}
