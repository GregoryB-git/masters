package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.Builder;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.TextureRegistry.ImageTextureEntry;
import io.flutter.view.TextureRegistry.SurfaceProducer;
import io.flutter.view.TextureRegistry.b;
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
import u5.l;

public class FlutterRenderer
  implements TextureRegistry
{
  public final FlutterJNI a;
  public final AtomicLong b = new AtomicLong(0L);
  public Surface c;
  public boolean d = false;
  public final Handler e = new Handler();
  public final Set f = new HashSet();
  public final j g;
  
  public FlutterRenderer(FlutterJNI paramFlutterJNI)
  {
    a locala = new a();
    g = locala;
    a = paramFlutterJNI;
    paramFlutterJNI.addIsDisplayingFlutterUiListener(locala);
  }
  
  public void f(j paramj)
  {
    a.addIsDisplayingFlutterUiListener(paramj);
    if (d) {
      paramj.e();
    }
  }
  
  public void g(ByteBuffer paramByteBuffer, int paramInt)
  {
    a.dispatchPointerDataPacket(paramByteBuffer, paramInt);
  }
  
  public boolean h()
  {
    return d;
  }
  
  public boolean i()
  {
    return a.getIsSoftwareRenderingEnabled();
  }
  
  public void j(int paramInt)
  {
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      TextureRegistry.b localb = (TextureRegistry.b)((WeakReference)localIterator.next()).get();
      if (localb != null) {
        localb.onTrimMemory(paramInt);
      } else {
        localIterator.remove();
      }
    }
  }
  
  public void k(j paramj)
  {
    a.removeIsDisplayingFlutterUiListener(paramj);
  }
  
  public final void l()
  {
    a.scheduleFrame();
  }
  
  public void m(boolean paramBoolean)
  {
    a.setSemanticsEnabled(paramBoolean);
  }
  
  public void n(f paramf)
  {
    if (!paramf.a()) {
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Setting viewport metrics\nSize: ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(" x ");
    ((StringBuilder)localObject).append(c);
    ((StringBuilder)localObject).append("\nPadding - L: ");
    ((StringBuilder)localObject).append(g);
    ((StringBuilder)localObject).append(", T: ");
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append(", R: ");
    ((StringBuilder)localObject).append(e);
    ((StringBuilder)localObject).append(", B: ");
    ((StringBuilder)localObject).append(f);
    ((StringBuilder)localObject).append("\nInsets - L: ");
    ((StringBuilder)localObject).append(k);
    ((StringBuilder)localObject).append(", T: ");
    ((StringBuilder)localObject).append(h);
    ((StringBuilder)localObject).append(", R: ");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(", B: ");
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append("\nSystem Gesture Insets - L: ");
    ((StringBuilder)localObject).append(o);
    ((StringBuilder)localObject).append(", T: ");
    ((StringBuilder)localObject).append(l);
    ((StringBuilder)localObject).append(", R: ");
    ((StringBuilder)localObject).append(m);
    ((StringBuilder)localObject).append(", B: ");
    ((StringBuilder)localObject).append(m);
    ((StringBuilder)localObject).append("\nDisplay Features: ");
    ((StringBuilder)localObject).append(q.size());
    t5.b.f("FlutterRenderer", ((StringBuilder)localObject).toString());
    int[] arrayOfInt1 = new int[q.size() * 4];
    localObject = new int[q.size()];
    int[] arrayOfInt2 = new int[q.size()];
    for (int i = 0; i < q.size(); i++)
    {
      b localb = (b)q.get(i);
      int j = i * 4;
      Rect localRect = a;
      arrayOfInt1[j] = left;
      arrayOfInt1[(j + 1)] = top;
      arrayOfInt1[(j + 2)] = right;
      arrayOfInt1[(j + 3)] = bottom;
      localObject[i] = b.o;
      arrayOfInt2[i] = c.o;
    }
    a.setViewportMetrics(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, arrayOfInt1, (int[])localObject, arrayOfInt2);
  }
  
  public void o(Surface paramSurface, boolean paramBoolean)
  {
    if (!paramBoolean) {
      p();
    }
    c = paramSurface;
    if (paramBoolean) {
      a.onSurfaceWindowChanged(paramSurface);
    } else {
      a.onSurfaceCreated(paramSurface);
    }
  }
  
  public void p()
  {
    if (c != null)
    {
      a.onSurfaceDestroyed();
      if (d) {
        g.b();
      }
      d = false;
      c = null;
    }
  }
  
  public void q(int paramInt1, int paramInt2)
  {
    a.onSurfaceChanged(paramInt1, paramInt2);
  }
  
  public void r(Surface paramSurface)
  {
    c = paramSurface;
    a.onSurfaceWindowChanged(paramSurface);
  }
  
  public final void s(long paramLong)
  {
    a.unregisterTexture(paramLong);
  }
  
  @TargetApi(29)
  @Keep
  public final class ImageReaderSurfaceProducer
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
    
    public ImageReaderSurfaceProducer(long paramLong)
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
        Handler localHandler = FlutterRenderer.d(FlutterRenderer.this);
        FlutterRenderer.e locale = new io/flutter/embedding/engine/renderer/FlutterRenderer$e;
        locale.<init>(id, FlutterRenderer.c(FlutterRenderer.this));
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
        FlutterRenderer.e(FlutterRenderer.this);
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
      FlutterRenderer.b(FlutterRenderer.this, id);
    }
    
    public void scheduleFrame()
    {
      FlutterRenderer.e(FlutterRenderer.this);
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
  
  @Keep
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
    
    @TargetApi(29)
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
      t5.b.g("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
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
        if (bool)
        {
          super.finalize();
          return;
        }
        Image localImage = image;
        if (localImage != null)
        {
          localImage.close();
          image = null;
        }
      }
      finally
      {
        break label82;
      }
      released = true;
      Handler localHandler = FlutterRenderer.d(FlutterRenderer.this);
      FlutterRenderer.e locale = new io/flutter/embedding/engine/renderer/FlutterRenderer$e;
      locale.<init>(id, FlutterRenderer.c(FlutterRenderer.this));
      localHandler.post(locale);
      super.finalize();
      return;
      label82:
      super.finalize();
      throw localHandler;
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
          t5.b.b("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
          localImage.close();
        }
        if (paramImage != null) {
          FlutterRenderer.e(FlutterRenderer.this);
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
      FlutterRenderer.b(FlutterRenderer.this, id);
    }
  }
  
  public class a
    implements j
  {
    public a() {}
    
    public void b()
    {
      FlutterRenderer.a(FlutterRenderer.this, false);
    }
    
    public void e()
    {
      FlutterRenderer.a(FlutterRenderer.this, true);
    }
  }
  
  public static final class b
  {
    public final Rect a;
    public final FlutterRenderer.d b;
    public final FlutterRenderer.c c;
    
    public b(Rect paramRect, FlutterRenderer.d paramd)
    {
      a = paramRect;
      b = paramd;
      c = FlutterRenderer.c.p;
    }
    
    public b(Rect paramRect, FlutterRenderer.d paramd, FlutterRenderer.c paramc)
    {
      a = paramRect;
      b = paramd;
      c = paramc;
    }
  }
  
  public static enum c
  {
    public final int o;
    
    public c(int paramInt1)
    {
      o = paramInt1;
    }
  }
  
  public static enum d
  {
    public final int o;
    
    public d(int paramInt1)
    {
      o = paramInt1;
    }
  }
  
  public static final class e
    implements Runnable
  {
    public final long o;
    public final FlutterJNI p;
    
    public e(long paramLong, FlutterJNI paramFlutterJNI)
    {
      o = paramLong;
      p = paramFlutterJNI;
    }
    
    public void run()
    {
      if (!p.isAttached()) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Releasing a Texture (");
      localStringBuilder.append(o);
      localStringBuilder.append(").");
      t5.b.f("FlutterRenderer", localStringBuilder.toString());
      p.unregisterTexture(o);
    }
  }
  
  public static final class f
  {
    public float a = 1.0F;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = -1;
    public List q = new ArrayList();
    
    public boolean a()
    {
      boolean bool;
      if ((b > 0) && (c > 0) && (a > 0.0F)) {
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