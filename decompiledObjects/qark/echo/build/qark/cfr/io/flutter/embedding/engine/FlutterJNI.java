/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Bitmap
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$ImageInfo
 *  android.graphics.ImageDecoder$Source
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.Surface
 *  java.io.IOException
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Locale$Builder
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock
 */
package io.flutter.embedding.engine;

import D5.t;
import E5.p;
import F5.e;
import T5.d;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.r;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import io.flutter.view.i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import u5.n;
import u5.o;
import v5.g;
import v5.h;
import w5.f;

@Keep
public class FlutterJNI {
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
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    @NonNull
    private final Set<j> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private e localizationPlugin;
    @NonNull
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativeShellHolderId;
    private f platformMessageHandler;
    private r platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    public static /* synthetic */ void a(long l8, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(l8, imageDecoder, imageInfo, source);
    }

    private static void asyncWaitForVsync(long l8) {
        b b8 = asyncWaitForVsyncDelegate;
        if (b8 != null) {
            b8.a(l8);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public static Bitmap decodeImage(@NonNull ByteBuffer byteBuffer, long l8) {
        if (Build.VERSION.SDK_INT >= 28) {
            byteBuffer = v5.d.a(byteBuffer);
            try {
                byteBuffer = v5.e.a((ImageDecoder.Source)byteBuffer, new v5.i(l8));
                return byteBuffer;
            }
            catch (IOException iOException) {
                t5.b.c("FlutterJNI", "Failed to decode image", (Throwable)iOException);
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Methods marked with @UiThread must be executed on the main thread. Current thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        throw new RuntimeException(stringBuilder.toString());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int n8, ByteBuffer byteBuffer) {
        f f8 = this.platformMessageHandler;
        if (f8 != null) {
            f8.e(n8, byteBuffer);
        }
    }

    private static /* synthetic */ void lambda$decodeImage$0(long l8, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        v5.f.a(imageDecoder, o.a(n.a()));
        g.a(imageDecoder, 1);
        imageDecoder = h.a(imageInfo);
        FlutterJNI.nativeImageHeaderCallback(l8, imageDecoder.getWidth(), imageDecoder.getHeight());
    }

    private native long nativeAttach(@NonNull FlutterJNI var1);

    private native void nativeCleanupMessageData(long var1);

    private native void nativeDeferredComponentInstallFailure(int var1, @NonNull String var2, boolean var3);

    private native void nativeDestroy(long var1);

    private native void nativeDispatchEmptyPlatformMessage(long var1, @NonNull String var3, int var4);

    private native void nativeDispatchPlatformMessage(long var1, @NonNull String var3, ByteBuffer var4, int var5, int var6);

    private native void nativeDispatchPointerDataPacket(long var1, @NonNull ByteBuffer var3, int var4);

    private native void nativeDispatchSemanticsAction(long var1, int var3, int var4, ByteBuffer var5, int var6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int var1);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int var1);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int var1);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int var1);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int var1);

    private native Bitmap nativeGetBitmap(long var1);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long var0, int var2, int var3);

    private static native void nativeInit(@NonNull Context var0, @NonNull String[] var1, String var2, @NonNull String var3, @NonNull String var4, long var5);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long var1, int var3);

    private native void nativeInvokePlatformMessageResponseCallback(long var1, int var3, ByteBuffer var4, int var5);

    private native void nativeLoadDartDeferredLibrary(long var1, int var3, @NonNull String[] var4);

    @Deprecated
    @NonNull
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long var0);

    private native void nativeMarkTextureFrameAvailable(long var1, long var3);

    private native void nativeNotifyLowMemoryWarning(long var1);

    private native void nativeOnVsync(long var1, long var3, long var5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long var1, long var3, @NonNull WeakReference<TextureRegistry.ImageConsumer> var5);

    private native void nativeRegisterTexture(long var1, long var3, @NonNull WeakReference<SurfaceTextureWrapper> var5);

    private native void nativeRunBundleAndSnapshotFromLibrary(long var1, @NonNull String var3, String var4, String var5, @NonNull AssetManager var6, List<String> var7);

    private native void nativeScheduleFrame(long var1);

    private native void nativeSetAccessibilityFeatures(long var1, int var3);

    private native void nativeSetSemanticsEnabled(long var1, boolean var3);

    private native void nativeSetViewportMetrics(long var1, float var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int[] var19, int[] var20, int[] var21);

    private native FlutterJNI nativeSpawn(long var1, String var3, String var4, String var5, List<String> var6);

    private native void nativeSurfaceChanged(long var1, int var3, int var4);

    private native void nativeSurfaceCreated(long var1, @NonNull Surface var3);

    private native void nativeSurfaceDestroyed(long var1);

    private native void nativeSurfaceWindowChanged(long var1, @NonNull Surface var3);

    private native void nativeUnregisterTexture(long var1, long var3);

    private native void nativeUpdateDisplayMetrics(long var1);

    private native void nativeUpdateJavaAssetManager(long var1, @NonNull AssetManager var3, @NonNull String var4);

    private native void nativeUpdateRefreshRate(float var1);

    private void onPreEngineRestart() {
        Iterator iterator = this.engineLifecycleListeners.iterator();
        while (iterator.hasNext()) {
            ((a.b)iterator.next()).b();
        }
    }

    private void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] arrstring) {
        this.ensureRunningOnMainThread();
        a a8 = this.accessibilityDelegate;
        if (a8 != null) {
            a8.c(byteBuffer, arrstring);
        }
    }

    private void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] arrstring, @NonNull ByteBuffer[] arrbyteBuffer) {
        this.ensureRunningOnMainThread();
        a a8 = this.accessibilityDelegate;
        if (a8 != null) {
            a8.b(byteBuffer, arrstring, arrbyteBuffer);
        }
    }

    public void addEngineLifecycleListener(@NonNull a.b b8) {
        this.ensureRunningOnMainThread();
        this.engineLifecycleListeners.add((Object)b8);
    }

    public void addIsDisplayingFlutterUiListener(@NonNull j j8) {
        this.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add((Object)j8);
    }

    public void attachToNative() {
        this.ensureRunningOnMainThread();
        this.ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = this.performNativeAttach(this);
            return;
        }
        finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long l8) {
        this.nativeCleanupMessageData(l8);
    }

    public String[] computePlatformResolvedLocale(@NonNull String[] locale) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < locale.length; i8 += 3) {
            String string2 = locale[i8];
            Locale locale2 = locale[i8 + 1];
            Locale locale3 = locale[i8 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!string2.isEmpty()) {
                builder.setLanguage(string2);
            }
            if (!locale2.isEmpty()) {
                builder.setRegion((String)locale2);
            }
            if (!locale3.isEmpty()) {
                builder.setScript((String)locale3);
            }
            arrayList.add((Object)builder.build());
        }
        locale = this.localizationPlugin.c((List)arrayList);
        if (locale == null) {
            return new String[0];
        }
        return new String[]{locale.getLanguage(), locale.getCountry(), locale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        this.ensureRunningOnMainThread();
        r r8 = this.platformViewsController;
        if (r8 != null) {
            return r8.A();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int n8, @NonNull String string2, boolean bl) {
        this.ensureRunningOnMainThread();
        this.nativeDeferredComponentInstallFailure(n8, string2, bl);
    }

    public void destroyOverlaySurfaces() {
        this.ensureRunningOnMainThread();
        r r8 = this.platformViewsController;
        if (r8 != null) {
            r8.D();
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
            return;
        }
        finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(@NonNull String string2, int n8) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId, string2, n8);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
        stringBuilder.append(string2);
        stringBuilder.append(". Response ID: ");
        stringBuilder.append(n8);
        t5.b.g("FlutterJNI", stringBuilder.toString());
    }

    public void dispatchPlatformMessage(@NonNull String string2, ByteBuffer byteBuffer, int n8, int n9) {
        this.ensureRunningOnMainThread();
        if (this.isAttached()) {
            this.nativeDispatchPlatformMessage(this.nativeShellHolderId, string2, byteBuffer, n8, n9);
            return;
        }
        byteBuffer = new StringBuilder();
        byteBuffer.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
        byteBuffer.append(string2);
        byteBuffer.append(". Response ID: ");
        byteBuffer.append(n9);
        t5.b.g("FlutterJNI", byteBuffer.toString());
    }

    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int n8) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDispatchPointerDataPacket(this.nativeShellHolderId, byteBuffer, n8);
    }

    public void dispatchSemanticsAction(int n8, int n9, ByteBuffer byteBuffer, int n10) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDispatchSemanticsAction(this.nativeShellHolderId, n8, n9, byteBuffer, n10);
    }

    public void dispatchSemanticsAction(int n8, @NonNull i.g g8) {
        this.dispatchSemanticsAction(n8, g8, null);
    }

    public void dispatchSemanticsAction(int n8, @NonNull i.g g8, Object object) {
        int n9;
        this.ensureAttachedToNative();
        if (object != null) {
            object = p.a.a(object);
            n9 = object.position();
        } else {
            object = null;
            n9 = 0;
        }
        this.dispatchSemanticsAction(n8, g8.o, (ByteBuffer)object, n9);
    }

    public Bitmap getBitmap() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        return this.nativeGetBitmap(this.nativeShellHolderId);
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return this.nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f8, int n8) {
        DisplayMetrics displayMetrics = t.b(n8);
        if (displayMetrics == null) {
            displayMetrics = new StringBuilder();
            displayMetrics.append("getScaledFontSize called with configurationId ");
            displayMetrics.append(String.valueOf((int)n8));
            displayMetrics.append(", which can't be found.");
            t5.b.b("FlutterJNI", displayMetrics.toString());
            return -1.0f;
        }
        return TypedValue.applyDimension((int)2, (float)f8, (DisplayMetrics)displayMetrics) / displayMetrics.density;
    }

    public void handlePlatformMessage(@NonNull String string2, ByteBuffer byteBuffer, int n8, long l8) {
        f f8 = this.platformMessageHandler;
        if (f8 != null) {
            f8.g(string2, byteBuffer, n8, l8);
            return;
        }
        this.nativeCleanupMessageData(l8);
    }

    public void init(@NonNull Context context, @NonNull String[] arrstring, String string2, @NonNull String string3, @NonNull String string4, long l8) {
        if (initCalled) {
            t5.b.g("FlutterJNI", "FlutterJNI.init called more than once");
        }
        FlutterJNI.nativeInit(context, arrstring, string2, string3, string4, l8);
        initCalled = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void invokePlatformMessageEmptyResponseCallback(int n8) {
        Throwable throwable2;
        block3 : {
            this.shellHolderLock.readLock().lock();
            try {
                if (this.isAttached()) {
                    this.nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId, n8);
                    break block3;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
                stringBuilder.append(n8);
                t5.b.g("FlutterJNI", stringBuilder.toString());
            }
            catch (Throwable throwable2) {}
        }
        this.shellHolderLock.readLock().unlock();
        return;
        this.shellHolderLock.readLock().unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void invokePlatformMessageResponseCallback(int n8, @NonNull ByteBuffer byteBuffer, int n9) {
        Throwable throwable2;
        block4 : {
            if (!byteBuffer.isDirect()) {
                throw new IllegalArgumentException("Expected a direct ByteBuffer.");
            }
            this.shellHolderLock.readLock().lock();
            try {
                if (this.isAttached()) {
                    this.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId, n8, byteBuffer, n9);
                    break block4;
                }
                byteBuffer = new StringBuilder();
                byteBuffer.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
                byteBuffer.append(n8);
                t5.b.g("FlutterJNI", byteBuffer.toString());
            }
            catch (Throwable throwable2) {}
        }
        this.shellHolderLock.readLock().unlock();
        return;
        this.shellHolderLock.readLock().unlock();
        throw throwable2;
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int n8) {
        return this.nativeFlutterTextUtilsIsEmoji(n8);
    }

    public boolean isCodePointEmojiModifier(int n8) {
        return this.nativeFlutterTextUtilsIsEmojiModifier(n8);
    }

    public boolean isCodePointEmojiModifierBase(int n8) {
        return this.nativeFlutterTextUtilsIsEmojiModifierBase(n8);
    }

    public boolean isCodePointRegionalIndicator(int n8) {
        return this.nativeFlutterTextUtilsIsRegionalIndicator(n8);
    }

    public boolean isCodePointVariantSelector(int n8) {
        return this.nativeFlutterTextUtilsIsVariationSelector(n8);
    }

    public void loadDartDeferredLibrary(int n8, @NonNull String[] arrstring) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeLoadDartDeferredLibrary(this.nativeShellHolderId, n8, arrstring);
    }

    public void loadLibrary() {
        if (loadLibraryCalled) {
            t5.b.g("FlutterJNI", "FlutterJNI.loadLibrary called more than once");
        }
        System.loadLibrary((String)"flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long l8) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeMarkTextureFrameAvailable(this.nativeShellHolderId, l8);
    }

    public void notifyLowMemoryWarning() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeNotifyLowMemoryWarning(this.nativeShellHolderId);
    }

    public void onBeginFrame() {
        this.ensureRunningOnMainThread();
        r r8 = this.platformViewsController;
        if (r8 != null) {
            r8.S();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int n8, int n9, int n10, int n11, int n12) {
        this.ensureRunningOnMainThread();
        r r8 = this.platformViewsController;
        if (r8 != null) {
            r8.U(n8, n9, n10, n11, n12);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int n8, int n9, int n10, int n11, int n12, int n13, int n14, FlutterMutatorsStack flutterMutatorsStack) {
        this.ensureRunningOnMainThread();
        r r8 = this.platformViewsController;
        if (r8 != null) {
            r8.V(n8, n9, n10, n11, n12, n13, n14, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        this.ensureRunningOnMainThread();
        r r8 = this.platformViewsController;
        if (r8 != null) {
            r8.W();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        this.ensureRunningOnMainThread();
        Iterator iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).e();
        }
    }

    public void onRenderingStopped() {
        this.ensureRunningOnMainThread();
        Iterator iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).b();
        }
    }

    public void onSurfaceChanged(int n8, int n9) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceChanged(this.nativeShellHolderId, n8, n9);
    }

    public void onSurfaceCreated(@NonNull Surface surface) {
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

    public void onSurfaceWindowChanged(@NonNull Surface surface) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSurfaceWindowChanged(this.nativeShellHolderId, surface);
    }

    public void onVsync(long l8, long l9, long l10) {
        this.nativeOnVsync(l8, l9, l10);
    }

    public long performNativeAttach(@NonNull FlutterJNI flutterJNI) {
        return this.nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            t5.b.g("FlutterJNI", "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        FlutterJNI.nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long l8, @NonNull TextureRegistry.ImageConsumer imageConsumer) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRegisterImageTexture(this.nativeShellHolderId, l8, new WeakReference((Object)imageConsumer));
    }

    public void registerTexture(long l8, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRegisterTexture(this.nativeShellHolderId, l8, new WeakReference((Object)surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(@NonNull a.b b8) {
        this.ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove((Object)b8);
    }

    public void removeIsDisplayingFlutterUiListener(@NonNull j j8) {
        this.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove((Object)j8);
    }

    public void requestDartDeferredLibrary(int n8) {
        t5.b.b("FlutterJNI", "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(@NonNull String string2, String string3, String string4, @NonNull AssetManager assetManager, List<String> list) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId, string2, string3, string4, assetManager, list);
    }

    public void scheduleFrame() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeScheduleFrame(this.nativeShellHolderId);
    }

    public void setAccessibilityDelegate(a a8) {
        this.ensureRunningOnMainThread();
        this.accessibilityDelegate = a8;
    }

    public void setAccessibilityFeatures(int n8) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetAccessibilityFeatures(this.nativeShellHolderId, n8);
    }

    public void setAsyncWaitForVsyncDelegate(b b8) {
        asyncWaitForVsyncDelegate = b8;
    }

    public void setDeferredComponentManager(x5.a a8) {
        this.ensureRunningOnMainThread();
        if (a8 != null) {
            a8.a(this);
        }
    }

    public void setLocalizationPlugin(e e8) {
        this.ensureRunningOnMainThread();
        this.localizationPlugin = e8;
    }

    public void setPlatformMessageHandler(f f8) {
        this.ensureRunningOnMainThread();
        this.platformMessageHandler = f8;
    }

    public void setPlatformViewsController(@NonNull r r8) {
        this.ensureRunningOnMainThread();
        this.platformViewsController = r8;
    }

    public void setRefreshRateFPS(float f8) {
        refreshRateFPS = f8;
        this.updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean bl) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetSemanticsEnabled(this.nativeShellHolderId, bl);
    }

    public void setViewportMetrics(float f8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int[] arrn, int[] arrn2, int[] arrn3) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeSetViewportMetrics(this.nativeShellHolderId, f8, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, arrn, arrn2, arrn3);
    }

    @NonNull
    public FlutterJNI spawn(String object, String string2, String string3, List<String> list) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        object = this.nativeSpawn(this.nativeShellHolderId, (String)object, string2, string3, list);
        string2 = object.nativeShellHolderId;
        boolean bl = string2 != null && string2.longValue() != 0L;
        d.a(bl, "Failed to spawn new JNI connected shell from existing shell.");
        return object;
    }

    public void unregisterTexture(long l8) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeUnregisterTexture(this.nativeShellHolderId, l8);
    }

    public void updateDisplayMetrics(int n8, float f8, float f9, float f10) {
        displayWidth = f8;
        displayHeight = f9;
        displayDensity = f10;
        if (!loadLibraryCalled) {
            return;
        }
        this.nativeUpdateDisplayMetrics(this.nativeShellHolderId);
    }

    public void updateJavaAssetManager(@NonNull AssetManager assetManager, @NonNull String string2) {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeUpdateJavaAssetManager(this.nativeShellHolderId, assetManager, string2);
    }

    public void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        this.nativeUpdateRefreshRate(refreshRateFPS);
    }

    public static interface a {
        public void b(ByteBuffer var1, String[] var2, ByteBuffer[] var3);

        public void c(ByteBuffer var1, String[] var2);
    }

    public static interface b {
        public void a(long var1);
    }

    public static class c {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }

}

