package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;

public class FlutterRenderer$ImageReaderSurfaceProducer$b
{
  public final ImageReader a;
  public final ArrayDeque b = new ArrayDeque();
  public boolean c = false;
  public final ImageReader.OnImageAvailableListener d;
  
  public FlutterRenderer$ImageReaderSurfaceProducer$b(FlutterRenderer.ImageReaderSurfaceProducer paramImageReaderSurfaceProducer, ImageReader paramImageReader)
  {
    paramImageReaderSurfaceProducer = new i(this);
    d = paramImageReaderSurfaceProducer;
    a = paramImageReader;
    paramImageReader.setOnImageAvailableListener(paramImageReaderSurfaceProducer, new Handler(Looper.getMainLooper()));
  }
  
  public boolean c()
  {
    boolean bool;
    if ((b.size() == 0) && (FlutterRenderer.ImageReaderSurfaceProducer.access$500(e) != this)) {
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
    paramImage = new FlutterRenderer.ImageReaderSurfaceProducer.a(e, paramImage, System.nanoTime());
    b.add(paramImage);
    while (b.size() > 2) {
      b.removeFirst()).a.close();
    }
    return paramImage;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */