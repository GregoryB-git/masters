package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;

class FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader
{
  private boolean closed = false;
  private final ArrayDeque<FlutterRenderer.ImageReaderSurfaceProducer.PerImage> imageQueue = new ArrayDeque();
  public final ImageReader reader;
  
  public FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader(FlutterRenderer.ImageReaderSurfaceProducer paramImageReaderSurfaceProducer, ImageReader paramImageReader)
  {
    reader = paramImageReader;
    paramImageReader.setOnImageAvailableListener(new b(this), new Handler(Looper.getMainLooper()));
  }
  
  public boolean canPrune()
  {
    boolean bool;
    if ((imageQueue.isEmpty()) && (FlutterRenderer.ImageReaderSurfaceProducer.access$700(this$1) != this)) {
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
    paramImage = new FlutterRenderer.ImageReaderSurfaceProducer.PerImage(this$1, paramImage, System.nanoTime());
    imageQueue.add(paramImage);
    while (imageQueue.size() > 2) {
      imageQueue.removeFirst()).image.close();
    }
    return paramImage;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */