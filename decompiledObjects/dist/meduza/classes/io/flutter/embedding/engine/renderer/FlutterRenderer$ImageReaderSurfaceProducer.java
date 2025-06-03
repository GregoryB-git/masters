package io.flutter.embedding.engine.renderer;

import aa.u;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import io.flutter.Log;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.TextureRegistry.OnTrimMemoryListener;
import io.flutter.view.TextureRegistry.SurfaceProducer;
import io.flutter.view.TextureRegistry.SurfaceProducer.Callback;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class FlutterRenderer$ImageReaderSurfaceProducer
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
  
  public FlutterRenderer$ImageReaderSurfaceProducer(FlutterRenderer paramFlutterRenderer, long paramLong)
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
    this$0.removeOnTrimMemoryListener(this);
    FlutterRenderer.access$100(this$0).remove(this);
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
        FlutterRenderer.access$600(this$0).post(new a(this));
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
      Handler localHandler = FlutterRenderer.access$600(this$0);
      FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
      localTextureFinalizerRunnable.<init>(id, FlutterRenderer.access$500(this$0));
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
      this$0.scheduleEngineFrame();
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
    FlutterRenderer.access$400(this$0, id);
  }
  
  public void scheduleFrame()
  {
    this$0.scheduleEngineFrame();
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

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */