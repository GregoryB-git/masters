package io.flutter.embedding.engine.renderer;

import aa.u;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import b1.o;
import b1.p;
import b1.z;
import ec.i;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.TextureRegistry.ImageTextureEntry;
import io.flutter.view.TextureRegistry.OnFrameConsumedListener;
import io.flutter.view.TextureRegistry.OnTrimMemoryListener;
import io.flutter.view.TextureRegistry.SurfaceProducer;
import io.flutter.view.TextureRegistry.SurfaceProducer.Callback;
import io.flutter.view.TextureRegistry.SurfaceTextureEntry;
import io.flutter.view.TextureRegistry.TextureEntry;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class FlutterRenderer
  implements TextureRegistry
{
  private static final String TAG = "FlutterRenderer";
  public static boolean debugDisableSurfaceClear = false;
  public static boolean debugForceSurfaceProducerGlTextures = false;
  private final FlutterJNI flutterJNI;
  private final FlutterUiDisplayListener flutterUiDisplayListener;
  private final Handler handler = new Handler();
  private final List<ImageReaderSurfaceProducer> imageReaderProducers = new ArrayList();
  private boolean isDisplayingFlutterUi = false;
  private final AtomicLong nextTextureId = new AtomicLong(0L);
  private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();
  private Surface surface;
  
  public FlutterRenderer(FlutterJNI paramFlutterJNI)
  {
    FlutterUiDisplayListener local1 = new FlutterUiDisplayListener()
    {
      public void onFlutterUiDisplayed()
      {
        FlutterRenderer.access$002(FlutterRenderer.this, true);
      }
      
      public void onFlutterUiNoLongerDisplayed()
      {
        FlutterRenderer.access$002(FlutterRenderer.this, false);
      }
    };
    flutterUiDisplayListener = local1;
    flutterJNI = paramFlutterJNI;
    paramFlutterJNI.addIsDisplayingFlutterUiListener(local1);
    qf.a(new b1.d()
    {
      public void onCreate(o paramAnonymouso)
      {
        i.e(paramAnonymouso, "owner");
      }
      
      public void onDestroy(o paramAnonymouso)
      {
        i.e(paramAnonymouso, "owner");
      }
      
      public void onPause(o paramAnonymouso)
      {
        i.e(paramAnonymouso, "owner");
      }
      
      public void onResume(o paramAnonymouso)
      {
        Log.v("FlutterRenderer", "onResume called; notifying SurfaceProducers");
        Iterator localIterator = FlutterRenderer.access$100(FlutterRenderer.this).iterator();
        while (localIterator.hasNext())
        {
          paramAnonymouso = (FlutterRenderer.ImageReaderSurfaceProducer)localIterator.next();
          if ((FlutterRenderer.ImageReaderSurfaceProducer.access$200(paramAnonymouso) != null) && (FlutterRenderer.ImageReaderSurfaceProducer.access$300(paramAnonymouso)))
          {
            FlutterRenderer.ImageReaderSurfaceProducer.access$302(paramAnonymouso, false);
            FlutterRenderer.ImageReaderSurfaceProducer.access$200(paramAnonymouso).onSurfaceAvailable();
          }
        }
      }
      
      public void onStart(o paramAnonymouso)
      {
        i.e(paramAnonymouso, "owner");
      }
      
      public void onStop(o paramAnonymouso)
      {
        i.e(paramAnonymouso, "owner");
      }
    });
  }
  
  private void clearDeadListeners()
  {
    Iterator localIterator = onTrimMemoryListeners.iterator();
    while (localIterator.hasNext()) {
      if ((TextureRegistry.OnTrimMemoryListener)((WeakReference)localIterator.next()).get() == null) {
        localIterator.remove();
      }
    }
  }
  
  private void registerImageTexture(long paramLong, TextureRegistry.ImageConsumer paramImageConsumer)
  {
    flutterJNI.registerImageTexture(paramLong, paramImageConsumer);
  }
  
  private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long paramLong, SurfaceTexture paramSurfaceTexture)
  {
    paramSurfaceTexture.detachFromGLContext();
    paramSurfaceTexture = new SurfaceTextureRegistryEntry(paramLong, paramSurfaceTexture);
    StringBuilder localStringBuilder = f.l("New SurfaceTexture ID: ");
    localStringBuilder.append(paramSurfaceTexture.id());
    Log.v("FlutterRenderer", localStringBuilder.toString());
    registerTexture(paramSurfaceTexture.id(), paramSurfaceTexture.textureWrapper());
    addOnTrimMemoryListener(paramSurfaceTexture);
    return paramSurfaceTexture;
  }
  
  private void registerTexture(long paramLong, SurfaceTextureWrapper paramSurfaceTextureWrapper)
  {
    flutterJNI.registerTexture(paramLong, paramSurfaceTextureWrapper);
  }
  
  private void translateFeatureBounds(int[] paramArrayOfInt, int paramInt, Rect paramRect)
  {
    paramArrayOfInt[paramInt] = left;
    paramArrayOfInt[(paramInt + 1)] = top;
    paramArrayOfInt[(paramInt + 2)] = right;
    paramArrayOfInt[(paramInt + 3)] = bottom;
  }
  
  private void unregisterTexture(long paramLong)
  {
    flutterJNI.unregisterTexture(paramLong);
  }
  
  public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener paramFlutterUiDisplayListener)
  {
    flutterJNI.addIsDisplayingFlutterUiListener(paramFlutterUiDisplayListener);
    if (isDisplayingFlutterUi) {
      paramFlutterUiDisplayListener.onFlutterUiDisplayed();
    }
  }
  
  public void addOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener paramOnTrimMemoryListener)
  {
    clearDeadListeners();
    onTrimMemoryListeners.add(new WeakReference(paramOnTrimMemoryListener));
  }
  
  public TextureRegistry.ImageTextureEntry createImageTexture()
  {
    ImageTextureRegistryEntry localImageTextureRegistryEntry = new ImageTextureRegistryEntry(nextTextureId.getAndIncrement());
    StringBuilder localStringBuilder = f.l("New ImageTextureEntry ID: ");
    localStringBuilder.append(localImageTextureRegistryEntry.id());
    Log.v("FlutterRenderer", localStringBuilder.toString());
    registerImageTexture(localImageTextureRegistryEntry.id(), localImageTextureRegistryEntry);
    return localImageTextureRegistryEntry;
  }
  
  public TextureRegistry.SurfaceProducer createSurfaceProducer()
  {
    Object localObject1;
    Object localObject2;
    if ((!debugForceSurfaceProducerGlTextures) && (Build.VERSION.SDK_INT >= 29))
    {
      long l = nextTextureId.getAndIncrement();
      localObject1 = new ImageReaderSurfaceProducer(l);
      registerImageTexture(l, (TextureRegistry.ImageConsumer)localObject1);
      addOnTrimMemoryListener((TextureRegistry.OnTrimMemoryListener)localObject1);
      imageReaderProducers.add(localObject1);
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("New ImageReaderSurfaceProducer ID: ");
      ((StringBuilder)localObject2).append(l);
      Log.v("FlutterRenderer", ((StringBuilder)localObject2).toString());
    }
    else
    {
      localObject2 = createSurfaceTexture();
      localObject1 = new SurfaceTextureSurfaceProducer(((TextureRegistry.TextureEntry)localObject2).id(), handler, flutterJNI, (TextureRegistry.SurfaceTextureEntry)localObject2);
      StringBuilder localStringBuilder = f.l("New SurfaceTextureSurfaceProducer ID: ");
      localStringBuilder.append(((TextureRegistry.TextureEntry)localObject2).id());
      Log.v("FlutterRenderer", localStringBuilder.toString());
    }
    return (TextureRegistry.SurfaceProducer)localObject1;
  }
  
  public TextureRegistry.SurfaceTextureEntry createSurfaceTexture()
  {
    Log.v("FlutterRenderer", "Creating a SurfaceTexture.");
    return registerSurfaceTexture(new SurfaceTexture(0));
  }
  
  public void dispatchPointerDataPacket(ByteBuffer paramByteBuffer, int paramInt)
  {
    flutterJNI.dispatchPointerDataPacket(paramByteBuffer, paramInt);
  }
  
  public void dispatchSemanticsAction(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3)
  {
    flutterJNI.dispatchSemanticsAction(paramInt1, paramInt2, paramByteBuffer, paramInt3);
  }
  
  public Bitmap getBitmap()
  {
    return flutterJNI.getBitmap();
  }
  
  public boolean isDisplayingFlutterUi()
  {
    return isDisplayingFlutterUi;
  }
  
  public boolean isSoftwareRenderingEnabled()
  {
    return flutterJNI.getIsSoftwareRenderingEnabled();
  }
  
  public void onTrimMemory(int paramInt)
  {
    Iterator localIterator = onTrimMemoryListeners.iterator();
    while (localIterator.hasNext())
    {
      TextureRegistry.OnTrimMemoryListener localOnTrimMemoryListener = (TextureRegistry.OnTrimMemoryListener)((WeakReference)localIterator.next()).get();
      if (localOnTrimMemoryListener != null) {
        localOnTrimMemoryListener.onTrimMemory(paramInt);
      } else {
        localIterator.remove();
      }
    }
  }
  
  public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture paramSurfaceTexture)
  {
    return registerSurfaceTexture(nextTextureId.getAndIncrement(), paramSurfaceTexture);
  }
  
  public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener paramFlutterUiDisplayListener)
  {
    flutterJNI.removeIsDisplayingFlutterUiListener(paramFlutterUiDisplayListener);
  }
  
  public void removeOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener paramOnTrimMemoryListener)
  {
    Iterator localIterator = onTrimMemoryListeners.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if (localWeakReference.get() == paramOnTrimMemoryListener) {
        onTrimMemoryListeners.remove(localWeakReference);
      }
    }
  }
  
  public void scheduleEngineFrame()
  {
    flutterJNI.scheduleFrame();
  }
  
  public void setAccessibilityFeatures(int paramInt)
  {
    flutterJNI.setAccessibilityFeatures(paramInt);
  }
  
  public void setSemanticsEnabled(boolean paramBoolean)
  {
    flutterJNI.setSemanticsEnabled(paramBoolean);
  }
  
  public void setViewportMetrics(ViewportMetrics paramViewportMetrics)
  {
    if (!paramViewportMetrics.validate()) {
      return;
    }
    Object localObject = f.l("Setting viewport metrics\nSize: ");
    ((StringBuilder)localObject).append(width);
    ((StringBuilder)localObject).append(" x ");
    ((StringBuilder)localObject).append(height);
    ((StringBuilder)localObject).append("\nPadding - L: ");
    ((StringBuilder)localObject).append(viewPaddingLeft);
    ((StringBuilder)localObject).append(", T: ");
    ((StringBuilder)localObject).append(viewPaddingTop);
    ((StringBuilder)localObject).append(", R: ");
    ((StringBuilder)localObject).append(viewPaddingRight);
    ((StringBuilder)localObject).append(", B: ");
    ((StringBuilder)localObject).append(viewPaddingBottom);
    ((StringBuilder)localObject).append("\nInsets - L: ");
    ((StringBuilder)localObject).append(viewInsetLeft);
    ((StringBuilder)localObject).append(", T: ");
    ((StringBuilder)localObject).append(viewInsetTop);
    ((StringBuilder)localObject).append(", R: ");
    ((StringBuilder)localObject).append(viewInsetRight);
    ((StringBuilder)localObject).append(", B: ");
    ((StringBuilder)localObject).append(viewInsetBottom);
    ((StringBuilder)localObject).append("\nSystem Gesture Insets - L: ");
    ((StringBuilder)localObject).append(systemGestureInsetLeft);
    ((StringBuilder)localObject).append(", T: ");
    ((StringBuilder)localObject).append(systemGestureInsetTop);
    ((StringBuilder)localObject).append(", R: ");
    ((StringBuilder)localObject).append(systemGestureInsetRight);
    ((StringBuilder)localObject).append(", B: ");
    ((StringBuilder)localObject).append(systemGestureInsetRight);
    ((StringBuilder)localObject).append("\nDisplay Features: ");
    ((StringBuilder)localObject).append(ViewportMetrics.access$1000(paramViewportMetrics).size());
    ((StringBuilder)localObject).append("\nDisplay Cutouts: ");
    ((StringBuilder)localObject).append(ViewportMetrics.access$1100(paramViewportMetrics).size());
    Log.v("FlutterRenderer", ((StringBuilder)localObject).toString());
    int i = ViewportMetrics.access$1000(paramViewportMetrics).size();
    i = ViewportMetrics.access$1100(paramViewportMetrics).size() + i;
    int[] arrayOfInt1 = new int[i * 4];
    int[] arrayOfInt2 = new int[i];
    localObject = new int[i];
    int j = 0;
    DisplayFeature localDisplayFeature;
    for (i = 0; i < ViewportMetrics.access$1000(paramViewportMetrics).size(); i++)
    {
      localDisplayFeature = (DisplayFeature)ViewportMetrics.access$1000(paramViewportMetrics).get(i);
      translateFeatureBounds(arrayOfInt1, i * 4, bounds);
      arrayOfInt2[i] = type.encodedValue;
      localObject[i] = state.encodedValue;
    }
    int k = ViewportMetrics.access$1000(paramViewportMetrics).size();
    for (i = j; i < ViewportMetrics.access$1100(paramViewportMetrics).size(); i++)
    {
      localDisplayFeature = (DisplayFeature)ViewportMetrics.access$1100(paramViewportMetrics).get(i);
      translateFeatureBounds(arrayOfInt1, i * 4 + k * 4, bounds);
      arrayOfInt2[(ViewportMetrics.access$1000(paramViewportMetrics).size() + i)] = type.encodedValue;
      localObject[(ViewportMetrics.access$1000(paramViewportMetrics).size() + i)] = state.encodedValue;
    }
    flutterJNI.setViewportMetrics(devicePixelRatio, width, height, viewPaddingTop, viewPaddingRight, viewPaddingBottom, viewPaddingLeft, viewInsetTop, viewInsetRight, viewInsetBottom, viewInsetLeft, systemGestureInsetTop, systemGestureInsetRight, systemGestureInsetBottom, systemGestureInsetLeft, physicalTouchSlop, arrayOfInt1, arrayOfInt2, (int[])localObject);
  }
  
  public void startRenderingToSurface(Surface paramSurface, boolean paramBoolean)
  {
    if (!paramBoolean) {
      stopRenderingToSurface();
    }
    surface = paramSurface;
    if (paramBoolean) {
      flutterJNI.onSurfaceWindowChanged(paramSurface);
    } else {
      flutterJNI.onSurfaceCreated(paramSurface);
    }
  }
  
  public void stopRenderingToSurface()
  {
    if (surface != null)
    {
      flutterJNI.onSurfaceDestroyed();
      if (isDisplayingFlutterUi) {
        flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
      }
      isDisplayingFlutterUi = false;
      surface = null;
    }
  }
  
  public void surfaceChanged(int paramInt1, int paramInt2)
  {
    flutterJNI.onSurfaceChanged(paramInt1, paramInt2);
  }
  
  public void swapSurface(Surface paramSurface)
  {
    surface = paramSurface;
    flutterJNI.onSurfaceWindowChanged(paramSurface);
  }
  
  public static final class DisplayFeature
  {
    public final Rect bounds;
    public final FlutterRenderer.DisplayFeatureState state;
    public final FlutterRenderer.DisplayFeatureType type;
    
    public DisplayFeature(Rect paramRect, FlutterRenderer.DisplayFeatureType paramDisplayFeatureType, FlutterRenderer.DisplayFeatureState paramDisplayFeatureState)
    {
      bounds = paramRect;
      type = paramDisplayFeatureType;
      state = paramDisplayFeatureState;
    }
  }
  
  public static enum DisplayFeatureState
  {
    public final int encodedValue;
    
    static
    {
      POSTURE_FLAT = new DisplayFeatureState("POSTURE_FLAT", 1, 1);
      POSTURE_HALF_OPENED = new DisplayFeatureState("POSTURE_HALF_OPENED", 2, 2);
    }
    
    private DisplayFeatureState(int paramInt)
    {
      encodedValue = paramInt;
    }
  }
  
  public static enum DisplayFeatureType
  {
    public final int encodedValue;
    
    static
    {
      FOLD = new DisplayFeatureType("FOLD", 1, 1);
      HINGE = new DisplayFeatureType("HINGE", 2, 2);
      CUTOUT = new DisplayFeatureType("CUTOUT", 3, 3);
    }
    
    private DisplayFeatureType(int paramInt)
    {
      encodedValue = paramInt;
    }
  }
  
  public final class ImageReaderSurfaceProducer
    implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener
  {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_IMAGES = 5;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private TextureRegistry.SurfaceProducer.Callback callback = null;
    private boolean createNewReader = true;
    private final long id;
    private boolean ignoringFence = false;
    private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque();
    private long lastDequeueTime = 0L;
    private PerImage lastDequeuedImage = null;
    private long lastQueueTime = 0L;
    private PerImageReader lastReaderDequeuedFrom = null;
    private long lastScheduleTime = 0L;
    private final Object lock = new Object();
    private boolean notifiedDestroy = false;
    private int numTrims = 0;
    private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap();
    private boolean released;
    private int requestedHeight = 1;
    private int requestedWidth = 1;
    
    public ImageReaderSurfaceProducer(long paramLong)
    {
      id = paramLong;
    }
    
    private void cleanup()
    {
      synchronized (lock)
      {
        Iterator localIterator = perImageReaders.values().iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (PerImageReader)localIterator.next();
          if (lastReaderDequeuedFrom == localObject2) {
            lastReaderDequeuedFrom = null;
          }
          ((PerImageReader)localObject2).close();
        }
        perImageReaders.clear();
        Object localObject2 = lastDequeuedImage;
        if (localObject2 != null)
        {
          image.close();
          lastDequeuedImage = null;
        }
        localObject2 = lastReaderDequeuedFrom;
        if (localObject2 != null)
        {
          ((PerImageReader)localObject2).close();
          lastReaderDequeuedFrom = null;
        }
        imageReaderQueue.clear();
        return;
      }
    }
    
    private ImageReader createImageReader()
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 33) {
        return createImageReader33();
      }
      if (i >= 29) {
        return createImageReader29();
      }
      throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
    
    private ImageReader createImageReader29()
    {
      return u.w(requestedWidth, requestedHeight);
    }
    
    private ImageReader createImageReader33()
    {
      ImageReader.Builder localBuilder = new ImageReader.Builder(requestedWidth, requestedHeight);
      localBuilder.setMaxImages(5);
      localBuilder.setImageFormat(34);
      localBuilder.setUsage(256L);
      return localBuilder.build();
    }
    
    private PerImageReader getActiveReader()
    {
      synchronized (lock)
      {
        if (createNewReader)
        {
          createNewReader = false;
          localPerImageReader = getOrCreatePerImageReader(createImageReader());
          return localPerImageReader;
        }
        PerImageReader localPerImageReader = (PerImageReader)imageReaderQueue.peekLast();
        return localPerImageReader;
      }
    }
    
    private void maybeWaitOnFence(Image paramImage)
    {
      if (paramImage == null) {
        return;
      }
      if (ignoringFence) {
        return;
      }
      if (Build.VERSION.SDK_INT >= 33)
      {
        waitOnFence(paramImage);
        return;
      }
      ignoringFence = true;
      Log.d("ImageReaderSurfaceProducer", "ImageTextureEntry can't wait on the fence on Android < 33");
    }
    
    private void releaseInternal()
    {
      cleanup();
      released = true;
      removeOnTrimMemoryListener(this);
      FlutterRenderer.access$100(FlutterRenderer.this).remove(this);
    }
    
    private void waitOnFence(Image paramImage)
    {
      try
      {
        paramImage.getFence().awaitForever();
        return;
      }
      catch (IOException paramImage)
      {
        for (;;) {}
      }
    }
    
    public Image acquireLatestImage()
    {
      PerImage localPerImage = dequeueImage();
      if (localPerImage == null) {
        return null;
      }
      maybeWaitOnFence(image);
      return image;
    }
    
    public double deltaMillis(long paramLong)
    {
      return paramLong / 1000000.0D;
    }
    
    public PerImage dequeueImage()
    {
      synchronized (lock)
      {
        Object localObject2 = imageReaderQueue.iterator();
        PerImage localPerImage = null;
        while (((Iterator)localObject2).hasNext())
        {
          PerImageReader localPerImageReader = (PerImageReader)((Iterator)localObject2).next();
          localPerImage = localPerImageReader.dequeueImage();
          if (localPerImage != null)
          {
            localObject2 = lastDequeuedImage;
            if (localObject2 != null) {
              image.close();
            }
            lastDequeuedImage = localPerImage;
            lastReaderDequeuedFrom = localPerImageReader;
          }
        }
        pruneImageReaderQueue();
        localObject2 = imageReaderQueue.iterator();
        while (((Iterator)localObject2).hasNext()) {
          if (!((PerImageReader)((Iterator)localObject2).next()).imageQueueIsEmpty())
          {
            i = 1;
            break label122;
          }
        }
        int i = 0;
        label122:
        if (i != 0) {
          FlutterRenderer.access$600(FlutterRenderer.this).post(new a(this));
        }
        return localPerImage;
      }
    }
    
    public void disableFenceForTest()
    {
      ignoringFence = true;
    }
    
    public void finalize()
    {
      try
      {
        boolean bool = released;
        if (bool) {
          return;
        }
        releaseInternal();
        Handler localHandler = FlutterRenderer.access$600(FlutterRenderer.this);
        FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
        localTextureFinalizerRunnable.<init>(id, FlutterRenderer.access$500(FlutterRenderer.this));
        localHandler.post(localTextureFinalizerRunnable);
        return;
      }
      finally
      {
        super.finalize();
      }
    }
    
    public int getHeight()
    {
      return requestedHeight;
    }
    
    public PerImageReader getOrCreatePerImageReader(ImageReader paramImageReader)
    {
      PerImageReader localPerImageReader1 = (PerImageReader)perImageReaders.get(paramImageReader);
      PerImageReader localPerImageReader2 = localPerImageReader1;
      if (localPerImageReader1 == null)
      {
        localPerImageReader2 = new PerImageReader(paramImageReader);
        perImageReaders.put(paramImageReader, localPerImageReader2);
        imageReaderQueue.add(localPerImageReader2);
      }
      return localPerImageReader2;
    }
    
    public Surface getSurface()
    {
      return getActiveReaderreader.getSurface();
    }
    
    public int getWidth()
    {
      return requestedWidth;
    }
    
    public boolean handlesCropAndRotation()
    {
      return false;
    }
    
    public long id()
    {
      return id;
    }
    
    public int numImageReaders()
    {
      synchronized (lock)
      {
        int i = imageReaderQueue.size();
        return i;
      }
    }
    
    public int numImages()
    {
      synchronized (lock)
      {
        Iterator localIterator = imageReaderQueue.iterator();
        int i = 0;
        while (localIterator.hasNext()) {
          i += PerImageReader.access$900((PerImageReader)localIterator.next()).size();
        }
        return i;
      }
    }
    
    public int numTrims()
    {
      synchronized (lock)
      {
        int i = numTrims;
        return i;
      }
    }
    
    public void onImage(ImageReader paramImageReader, Image paramImage)
    {
      synchronized (lock)
      {
        paramImageReader = getOrCreatePerImageReader(paramImageReader).queueImage(paramImage);
        if (paramImageReader == null) {
          return;
        }
        scheduleEngineFrame();
        return;
      }
    }
    
    public void onTrimMemory(int paramInt)
    {
      if (paramInt < 40) {
        return;
      }
      synchronized (lock)
      {
        numTrims += 1;
        ??? = callback;
        if (??? != null)
        {
          notifiedDestroy = true;
          ((TextureRegistry.SurfaceProducer.Callback)???).onSurfaceCleanup();
        }
        cleanup();
        createNewReader = true;
        return;
      }
    }
    
    public void pruneImageReaderQueue()
    {
      while (imageReaderQueue.size() > 1)
      {
        PerImageReader localPerImageReader = (PerImageReader)imageReaderQueue.peekFirst();
        if ((localPerImageReader == null) || (!localPerImageReader.canPrune())) {
          break;
        }
        imageReaderQueue.removeFirst();
        perImageReaders.remove(reader);
        localPerImageReader.close();
      }
    }
    
    public void release()
    {
      if (released) {
        return;
      }
      releaseInternal();
      FlutterRenderer.access$400(FlutterRenderer.this, id);
    }
    
    public void scheduleFrame()
    {
      scheduleEngineFrame();
    }
    
    public void setCallback(TextureRegistry.SurfaceProducer.Callback paramCallback)
    {
      callback = paramCallback;
    }
    
    public void setSize(int paramInt1, int paramInt2)
    {
      paramInt1 = Math.max(1, paramInt1);
      paramInt2 = Math.max(1, paramInt2);
      if ((requestedWidth == paramInt1) && (requestedHeight == paramInt2)) {
        return;
      }
      createNewReader = true;
      requestedHeight = paramInt2;
      requestedWidth = paramInt1;
    }
    
    public class PerImage
    {
      public final Image image;
      public final long queuedTime;
      
      public PerImage(Image paramImage, long paramLong)
      {
        image = paramImage;
        queuedTime = paramLong;
      }
    }
    
    public class PerImageReader
    {
      private boolean closed = false;
      private final ArrayDeque<FlutterRenderer.ImageReaderSurfaceProducer.PerImage> imageQueue = new ArrayDeque();
      public final ImageReader reader;
      
      public PerImageReader(ImageReader paramImageReader)
      {
        reader = paramImageReader;
        paramImageReader.setOnImageAvailableListener(new b(this), new Handler(Looper.getMainLooper()));
      }
      
      public boolean canPrune()
      {
        boolean bool;
        if ((imageQueue.isEmpty()) && (FlutterRenderer.ImageReaderSurfaceProducer.access$700(FlutterRenderer.ImageReaderSurfaceProducer.this) != this)) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public void close()
      {
        closed = true;
        reader.close();
        imageQueue.clear();
      }
      
      public FlutterRenderer.ImageReaderSurfaceProducer.PerImage dequeueImage()
      {
        if (imageQueue.isEmpty()) {
          return null;
        }
        return (FlutterRenderer.ImageReaderSurfaceProducer.PerImage)imageQueue.removeFirst();
      }
      
      public boolean imageQueueIsEmpty()
      {
        return imageQueue.isEmpty();
      }
      
      public FlutterRenderer.ImageReaderSurfaceProducer.PerImage queueImage(Image paramImage)
      {
        if (closed) {
          return null;
        }
        paramImage = new FlutterRenderer.ImageReaderSurfaceProducer.PerImage(FlutterRenderer.ImageReaderSurfaceProducer.this, paramImage, System.nanoTime());
        imageQueue.add(paramImage);
        while (imageQueue.size() > 2) {
          imageQueue.removeFirst()).image.close();
        }
        return paramImage;
      }
    }
  }
  
  public final class ImageTextureRegistryEntry
    implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer
  {
    private static final String TAG = "ImageTextureRegistryEntry";
    private final long id;
    private boolean ignoringFence = false;
    private Image image;
    private boolean released;
    
    public ImageTextureRegistryEntry(long paramLong)
    {
      id = paramLong;
    }
    
    private void maybeWaitOnFence(Image paramImage)
    {
      if (paramImage == null) {
        return;
      }
      if (ignoringFence) {
        return;
      }
      if (Build.VERSION.SDK_INT >= 33)
      {
        waitOnFence(paramImage);
        return;
      }
      ignoringFence = true;
      Log.d("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
    }
    
    private void waitOnFence(Image paramImage)
    {
      try
      {
        paramImage.getFence().awaitForever();
        return;
      }
      catch (IOException paramImage)
      {
        for (;;) {}
      }
    }
    
    public Image acquireLatestImage()
    {
      try
      {
        Image localImage = image;
        image = null;
        maybeWaitOnFence(localImage);
        return localImage;
      }
      finally {}
    }
    
    public void finalize()
    {
      try
      {
        boolean bool = released;
        if (bool) {
          return;
        }
        Object localObject1 = image;
        if (localObject1 != null)
        {
          ((Image)localObject1).close();
          image = null;
        }
        released = true;
        localObject1 = FlutterRenderer.access$600(FlutterRenderer.this);
        FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
        localTextureFinalizerRunnable.<init>(id, FlutterRenderer.access$500(FlutterRenderer.this));
        ((Handler)localObject1).post(localTextureFinalizerRunnable);
        return;
      }
      finally
      {
        super.finalize();
      }
    }
    
    public long id()
    {
      return id;
    }
    
    public void pushImage(Image paramImage)
    {
      if (released) {
        return;
      }
      try
      {
        Image localImage = image;
        image = paramImage;
        if (localImage != null)
        {
          Log.e("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
          localImage.close();
        }
        if (paramImage != null) {
          scheduleEngineFrame();
        }
        return;
      }
      finally {}
    }
    
    public void release()
    {
      if (released) {
        return;
      }
      released = true;
      Image localImage = image;
      if (localImage != null)
      {
        localImage.close();
        image = null;
      }
      FlutterRenderer.access$400(FlutterRenderer.this, id);
    }
  }
  
  public final class SurfaceTextureRegistryEntry
    implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener
  {
    private TextureRegistry.OnFrameConsumedListener frameConsumedListener;
    private final long id;
    private boolean released;
    private final SurfaceTextureWrapper textureWrapper;
    private TextureRegistry.OnTrimMemoryListener trimMemoryListener;
    
    public SurfaceTextureRegistryEntry(long paramLong, SurfaceTexture paramSurfaceTexture)
    {
      id = paramLong;
      textureWrapper = new SurfaceTextureWrapper(paramSurfaceTexture, new c(this));
      this$1 = new d(this);
      surfaceTexture().setOnFrameAvailableListener(FlutterRenderer.this, new Handler());
    }
    
    private void removeListener()
    {
      removeOnTrimMemoryListener(this);
    }
    
    public void finalize()
    {
      try
      {
        boolean bool = released;
        if (bool) {
          return;
        }
        Handler localHandler = FlutterRenderer.access$600(FlutterRenderer.this);
        FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
        localTextureFinalizerRunnable.<init>(id, FlutterRenderer.access$500(FlutterRenderer.this));
        localHandler.post(localTextureFinalizerRunnable);
        return;
      }
      finally
      {
        super.finalize();
      }
    }
    
    public long id()
    {
      return id;
    }
    
    public void onTrimMemory(int paramInt)
    {
      TextureRegistry.OnTrimMemoryListener localOnTrimMemoryListener = trimMemoryListener;
      if (localOnTrimMemoryListener != null) {
        localOnTrimMemoryListener.onTrimMemory(paramInt);
      }
    }
    
    public void release()
    {
      if (released) {
        return;
      }
      StringBuilder localStringBuilder = f.l("Releasing a SurfaceTexture (");
      localStringBuilder.append(id);
      localStringBuilder.append(").");
      Log.v("FlutterRenderer", localStringBuilder.toString());
      textureWrapper.release();
      FlutterRenderer.access$400(FlutterRenderer.this, id);
      removeListener();
      released = true;
    }
    
    public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener paramOnFrameConsumedListener)
    {
      frameConsumedListener = paramOnFrameConsumedListener;
    }
    
    public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener paramOnTrimMemoryListener)
    {
      trimMemoryListener = paramOnTrimMemoryListener;
    }
    
    public SurfaceTexture surfaceTexture()
    {
      return textureWrapper.surfaceTexture();
    }
    
    public SurfaceTextureWrapper textureWrapper()
    {
      return textureWrapper;
    }
  }
  
  public static final class TextureFinalizerRunnable
    implements Runnable
  {
    private final FlutterJNI flutterJNI;
    private final long id;
    
    public TextureFinalizerRunnable(long paramLong, FlutterJNI paramFlutterJNI)
    {
      id = paramLong;
      flutterJNI = paramFlutterJNI;
    }
    
    public void run()
    {
      if (!flutterJNI.isAttached()) {
        return;
      }
      StringBuilder localStringBuilder = f.l("Releasing a Texture (");
      localStringBuilder.append(id);
      localStringBuilder.append(").");
      Log.v("FlutterRenderer", localStringBuilder.toString());
      flutterJNI.unregisterTexture(id);
    }
  }
  
  public static final class ViewportMetrics
  {
    public static final int unsetValue = -1;
    public float devicePixelRatio = 1.0F;
    private final List<FlutterRenderer.DisplayFeature> displayCutouts = new ArrayList();
    private final List<FlutterRenderer.DisplayFeature> displayFeatures = new ArrayList();
    public int height = 0;
    public int physicalTouchSlop = -1;
    public int systemGestureInsetBottom = 0;
    public int systemGestureInsetLeft = 0;
    public int systemGestureInsetRight = 0;
    public int systemGestureInsetTop = 0;
    public int viewInsetBottom = 0;
    public int viewInsetLeft = 0;
    public int viewInsetRight = 0;
    public int viewInsetTop = 0;
    public int viewPaddingBottom = 0;
    public int viewPaddingLeft = 0;
    public int viewPaddingRight = 0;
    public int viewPaddingTop = 0;
    public int width = 0;
    
    public List<FlutterRenderer.DisplayFeature> getDisplayCutouts()
    {
      return displayCutouts;
    }
    
    public List<FlutterRenderer.DisplayFeature> getDisplayFeatures()
    {
      return displayFeatures;
    }
    
    public void setDisplayCutouts(List<FlutterRenderer.DisplayFeature> paramList)
    {
      displayCutouts.clear();
      displayCutouts.addAll(paramList);
    }
    
    public void setDisplayFeatures(List<FlutterRenderer.DisplayFeature> paramList)
    {
      displayFeatures.clear();
      displayFeatures.addAll(paramList);
    }
    
    public boolean validate()
    {
      boolean bool;
      if ((width > 0) && (height > 0) && (devicePixelRatio > 0.0F)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */