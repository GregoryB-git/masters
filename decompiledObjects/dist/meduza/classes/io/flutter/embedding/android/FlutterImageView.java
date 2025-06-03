package io.flutter.embedding.android;

import aa.u;
import aa.w;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import d2.k;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Locale;

public class FlutterImageView
  extends View
  implements RenderSurface
{
  private static final String TAG = "FlutterImageView";
  private Bitmap currentBitmap;
  private Image currentImage;
  private FlutterRenderer flutterRenderer;
  private ImageReader imageReader;
  private boolean isAttachedToFlutterRenderer = false;
  private SurfaceKind kind;
  
  public FlutterImageView(Context paramContext)
  {
    this(paramContext, 1, 1, SurfaceKind.background);
  }
  
  public FlutterImageView(Context paramContext, int paramInt1, int paramInt2, SurfaceKind paramSurfaceKind)
  {
    this(paramContext, createImageReader(paramInt1, paramInt2), paramSurfaceKind);
  }
  
  public FlutterImageView(Context paramContext, ImageReader paramImageReader, SurfaceKind paramSurfaceKind)
  {
    super(paramContext, null);
    imageReader = paramImageReader;
    kind = paramSurfaceKind;
    init();
  }
  
  public FlutterImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, 1, 1, SurfaceKind.background);
  }
  
  private void closeCurrentImage()
  {
    Image localImage = currentImage;
    if (localImage != null)
    {
      localImage.close();
      currentImage = null;
    }
  }
  
  private static ImageReader createImageReader(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 <= 0)
    {
      logW("ImageReader width must be greater than 0, but given width=%d, set width=1", new Object[] { Integer.valueOf(paramInt1) });
      i = 1;
    }
    paramInt1 = paramInt2;
    if (paramInt2 <= 0)
    {
      logW("ImageReader height must be greater than 0, but given height=%d, set height=1", new Object[] { Integer.valueOf(paramInt2) });
      paramInt1 = 1;
    }
    if (Build.VERSION.SDK_INT >= 29) {
      return u.c(i, paramInt1);
    }
    return ImageReader.newInstance(i, paramInt1, 1, 3);
  }
  
  private void init()
  {
    setAlpha(0.0F);
  }
  
  private static void logW(String paramString, Object... paramVarArgs)
  {
    Log.w("FlutterImageView", String.format(Locale.US, paramString, paramVarArgs));
  }
  
  private void updateCurrentBitmap()
  {
    Object localObject1;
    if (Build.VERSION.SDK_INT >= 29)
    {
      localObject1 = k.a(currentImage);
      currentBitmap = w.e((HardwareBuffer)localObject1, ColorSpace.get(ColorSpace.Named.SRGB));
      ((HardwareBuffer)localObject1).close();
    }
    else
    {
      localObject1 = currentImage.getPlanes();
      if (localObject1.length != 1) {
        return;
      }
      Object localObject2 = localObject1[0];
      int i = ((Image.Plane)localObject2).getRowStride() / ((Image.Plane)localObject2).getPixelStride();
      int j = currentImage.getHeight();
      localObject1 = currentBitmap;
      if ((localObject1 == null) || (((Bitmap)localObject1).getWidth() != i) || (currentBitmap.getHeight() != j)) {
        currentBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      }
      localObject1 = ((Image.Plane)localObject2).getBuffer();
      ((ByteBuffer)localObject1).rewind();
      currentBitmap.copyPixelsFromBuffer((Buffer)localObject1);
    }
  }
  
  public boolean acquireLatestImage()
  {
    boolean bool1 = isAttachedToFlutterRenderer;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Image localImage = imageReader.acquireLatestImage();
    if (localImage != null)
    {
      closeCurrentImage();
      currentImage = localImage;
      invalidate();
    }
    if (localImage != null) {
      bool2 = true;
    }
    return bool2;
  }
  
  public void attachToRenderer(FlutterRenderer paramFlutterRenderer)
  {
    if (1.$SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind[kind.ordinal()] == 1) {
      paramFlutterRenderer.swapSurface(imageReader.getSurface());
    }
    setAlpha(1.0F);
    flutterRenderer = paramFlutterRenderer;
    isAttachedToFlutterRenderer = true;
  }
  
  public void closeImageReader()
  {
    imageReader.close();
  }
  
  public void detachFromRenderer()
  {
    if (!isAttachedToFlutterRenderer) {
      return;
    }
    setAlpha(0.0F);
    acquireLatestImage();
    currentBitmap = null;
    closeCurrentImage();
    invalidate();
    isAttachedToFlutterRenderer = false;
  }
  
  public FlutterRenderer getAttachedRenderer()
  {
    return flutterRenderer;
  }
  
  public ImageReader getImageReader()
  {
    return imageReader;
  }
  
  public Surface getSurface()
  {
    return imageReader.getSurface();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (currentImage != null) {
      updateCurrentBitmap();
    }
    Bitmap localBitmap = currentBitmap;
    if (localBitmap != null) {
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == imageReader.getWidth()) && (paramInt2 == imageReader.getHeight())) {
      return;
    }
    if ((kind == SurfaceKind.background) && (isAttachedToFlutterRenderer))
    {
      resizeIfNeeded(paramInt1, paramInt2);
      flutterRenderer.swapSurface(imageReader.getSurface());
    }
  }
  
  public void pause() {}
  
  public void resizeIfNeeded(int paramInt1, int paramInt2)
  {
    if (flutterRenderer == null) {
      return;
    }
    if ((paramInt1 == imageReader.getWidth()) && (paramInt2 == imageReader.getHeight())) {
      return;
    }
    closeCurrentImage();
    closeImageReader();
    imageReader = createImageReader(paramInt1, paramInt2);
  }
  
  public void resume() {}
  
  public static enum SurfaceKind
  {
    private SurfaceKind() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */