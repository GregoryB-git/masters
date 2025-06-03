package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.Builder;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.TextureRegistry.SurfaceProducer;
import io.flutter.view.TextureRegistry.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import u5.l;

@TargetApi(29)
@Keep
final class FlutterRenderer$ImageReaderSurfaceProducer
  implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b
{
  private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
  private static final int MAX_IMAGES = 5;
  private static final String TAG = "ImageReaderSurfaceProducer";
  private static final boolean VERBOSE_LOGS = false;
  private boolean createNewReader = true;
  private final long id;
  private boolean ignoringFence = false;
  private final ArrayDeque<b> imageReaderQueue = new ArrayDeque();
  private long lastDequeueTime = 0L;
  private a lastDequeuedImage = null;
  private long lastQueueTime = 0L;
  private b lastReaderDequeuedFrom = null;
  private long lastScheduleTime = 0L;
  private Object lock = new Object();
  private int numTrims = 0;
  private final HashMap<ImageReader, b> perImageReaders = new HashMap();
  private boolean released;
  private int requestedHeight = 1;
  private int requestedWidth = 1;
  private boolean trimOnMemoryPressure = true;
  
  public FlutterRenderer$ImageReaderSurfaceProducer(FlutterRenderer paramFlutterRenderer, long paramLong)
  {
    id = paramLong;
  }
  
  private void cleanup()
  {
    for (;;)
    {
      b localb;
      synchronized (lock)
      {
        Iterator localIterator = perImageReaders.values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localb = (b)localIterator.next();
        if (lastReaderDequeuedFrom == localb) {
          lastReaderDequeuedFrom = null;
        }
      }
      localb.d();
    }
    perImageReaders.clear();
    Object localObject3 = lastDequeuedImage;
    if (localObject3 != null)
    {
      a.close();
      lastDequeuedImage = null;
    }
    localObject3 = lastReaderDequeuedFrom;
    if (localObject3 != null)
    {
      ((b)localObject3).d();
      lastReaderDequeuedFrom = null;
    }
    imageReaderQueue.clear();
    return;
    throw ((Throwable)localObject3);
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
  
  @TargetApi(29)
  private ImageReader createImageReader29()
  {
    return l.a(requestedWidth, requestedHeight, 34, 5, 256L);
  }
  
  @TargetApi(33)
  private ImageReader createImageReader33()
  {
    h.a();
    ImageReader.Builder localBuilder = g.a(requestedWidth, requestedHeight);
    a.a(localBuilder, 5);
    b.a(localBuilder, 34);
    c.a(localBuilder, 256L);
    return d.a(localBuilder);
  }
  
  private b getActiveReader()
  {
    b localb2;
    synchronized (lock)
    {
      if (createNewReader)
      {
        createNewReader = false;
        b localb1 = getOrCreatePerImageReader(createImageReader());
        return localb1;
      }
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
    t5.b.g("ImageReaderSurfaceProducer", "ImageTextureEntry can't wait on the fence on Android < 33");
  }
  
  private void releaseInternal()
  {
    cleanup();
    released = true;
  }
  
  @TargetApi(33)
  private void waitOnFence(Image paramImage)
  {
    try
    {
      f.a(e.a(paramImage));
      return;
    }
    catch (IOException paramImage)
    {
      for (;;) {}
    }
  }
  
  @TargetApi(29)
  public Image acquireLatestImage()
  {
    a locala = dequeueImage();
    if (locala == null) {
      return null;
    }
    maybeWaitOnFence(a);
    return a;
  }
  
  public double deltaMillis(long paramLong)
  {
    return paramLong / 1000000.0D;
  }
  
  public a dequeueImage()
  {
    b localb;
    synchronized (lock)
    {
      Object localObject2 = imageReaderQueue.iterator();
      a locala1 = null;
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localb = (b)((Iterator)localObject2).next();
        locala1 = localb.e();
      } while (locala1 == null);
      localObject2 = lastDequeuedImage;
      if (localObject2 != null)
      {
        a.close();
        lastDequeuedImage = null;
      }
    }
    lastDequeuedImage = locala2;
    lastReaderDequeuedFrom = localb;
    pruneImageReaderQueue();
    return locala2;
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
      Handler localHandler = FlutterRenderer.d(this$0);
      FlutterRenderer.e locale = new io/flutter/embedding/engine/renderer/FlutterRenderer$e;
      locale.<init>(id, FlutterRenderer.c(this$0));
      localHandler.post(locale);
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
  
  public b getOrCreatePerImageReader(ImageReader paramImageReader)
  {
    b localb1 = (b)perImageReaders.get(paramImageReader);
    b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = new b(paramImageReader);
      perImageReaders.put(paramImageReader, localb2);
      imageReaderQueue.add(localb2);
    }
    return localb2;
  }
  
  public Surface getSurface()
  {
    return getActiveReadera.getSurface();
  }
  
  public int getWidth()
  {
    return requestedWidth;
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
    int i;
    synchronized (lock)
    {
      Iterator localIterator = imageReaderQueue.iterator();
      i = 0;
      if (localIterator.hasNext()) {
        i += b.b((b)localIterator.next()).size();
      }
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
      paramImageReader = getOrCreatePerImageReader(paramImageReader).g(paramImage);
      if (paramImageReader == null) {
        return;
      }
      FlutterRenderer.e(this$0);
      return;
    }
  }
  
  public void onTrimMemory(int paramInt)
  {
    if (!trimOnMemoryPressure) {
      return;
    }
    if (paramInt < 40) {
      return;
    }
    synchronized (lock)
    {
      numTrims += 1;
      cleanup();
      createNewReader = true;
      return;
    }
  }
  
  public void pruneImageReaderQueue()
  {
    while (imageReaderQueue.size() > 1)
    {
      b localb = (b)imageReaderQueue.peekFirst();
      if (!localb.c()) {
        break;
      }
      imageReaderQueue.removeFirst();
      perImageReaders.remove(a);
      localb.d();
    }
  }
  
  public void release()
  {
    if (released) {
      return;
    }
    releaseInternal();
    FlutterRenderer.b(this$0, id);
  }
  
  public void scheduleFrame()
  {
    FlutterRenderer.e(this$0);
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
  
  public class a
  {
    public final Image a;
    public final long b;
    
    public a(Image paramImage, long paramLong)
    {
      a = paramImage;
      b = paramLong;
    }
  }
  
  public class b
  {
    public final ImageReader a;
    public final ArrayDeque b = new ArrayDeque();
    public boolean c = false;
    public final ImageReader.OnImageAvailableListener d;
    
    public b(ImageReader paramImageReader)
    {
      this$1 = new i(this);
      d = FlutterRenderer.ImageReaderSurfaceProducer.this;
      a = paramImageReader;
      paramImageReader.setOnImageAvailableListener(FlutterRenderer.ImageReaderSurfaceProducer.this, new Handler(Looper.getMainLooper()));
    }
    
    public boolean c()
    {
      boolean bool;
      if ((b.size() == 0) && (FlutterRenderer.ImageReaderSurfaceProducer.access$500(FlutterRenderer.ImageReaderSurfaceProducer.this) != this)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void d()
    {
      c = true;
      a.close();
      b.clear();
    }
    
    public FlutterRenderer.ImageReaderSurfaceProducer.a e()
    {
      if (b.size() == 0) {
        return null;
      }
      return (FlutterRenderer.ImageReaderSurfaceProducer.a)b.removeFirst();
    }
    
    public FlutterRenderer.ImageReaderSurfaceProducer.a g(Image paramImage)
    {
      if (c) {
        return null;
      }
      paramImage = new FlutterRenderer.ImageReaderSurfaceProducer.a(FlutterRenderer.ImageReaderSurfaceProducer.this, paramImage, System.nanoTime());
      b.add(paramImage);
      while (b.size() > 2) {
        b.removeFirst()).a.close();
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