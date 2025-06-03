package u5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Locale;
import t5.b;

public class r
  extends View
  implements k
{
  public ImageReader o;
  public Image p;
  public Bitmap q;
  public FlutterRenderer r;
  public b s;
  public boolean t = false;
  
  public r(Context paramContext, int paramInt1, int paramInt2, b paramb)
  {
    this(paramContext, g(paramInt1, paramInt2), paramb);
  }
  
  public r(Context paramContext, ImageReader paramImageReader, b paramb)
  {
    super(paramContext, null);
    o = paramImageReader;
    s = paramb;
    h();
  }
  
  public static ImageReader g(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0)
    {
      i("ImageReader width must be greater than 0, but given width=%d, set width=1", new Object[] { Integer.valueOf(paramInt1) });
      paramInt1 = 1;
    }
    if (paramInt2 <= 0)
    {
      i("ImageReader height must be greater than 0, but given height=%d, set height=1", new Object[] { Integer.valueOf(paramInt2) });
      paramInt2 = 1;
    }
    if (Build.VERSION.SDK_INT >= 29) {
      return l.a(paramInt1, paramInt2, 1, 3, 768L);
    }
    return ImageReader.newInstance(paramInt1, paramInt2, 1, 3);
  }
  
  public static void i(String paramString, Object... paramVarArgs)
  {
    b.g("FlutterImageView", String.format(Locale.US, paramString, paramVarArgs));
  }
  
  public void a()
  {
    if (!t) {
      return;
    }
    setAlpha(0.0F);
    d();
    q = null;
    e();
    invalidate();
    t = false;
  }
  
  public void b() {}
  
  public void c(FlutterRenderer paramFlutterRenderer)
  {
    if (a.a[s.ordinal()] == 1) {
      paramFlutterRenderer.r(o.getSurface());
    }
    setAlpha(1.0F);
    r = paramFlutterRenderer;
    t = true;
  }
  
  public boolean d()
  {
    boolean bool1 = t;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Image localImage = o.acquireLatestImage();
    if (localImage != null)
    {
      e();
      p = localImage;
      invalidate();
    }
    if (localImage != null) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final void e()
  {
    Image localImage = p;
    if (localImage != null)
    {
      localImage.close();
      p = null;
    }
  }
  
  public void f()
  {
    o.close();
  }
  
  public FlutterRenderer getAttachedRenderer()
  {
    return r;
  }
  
  public ImageReader getImageReader()
  {
    return o;
  }
  
  @NonNull
  public Surface getSurface()
  {
    return o.getSurface();
  }
  
  public final void h()
  {
    setAlpha(0.0F);
  }
  
  public void j() {}
  
  public void k(int paramInt1, int paramInt2)
  {
    if (r == null) {
      return;
    }
    if ((paramInt1 == o.getWidth()) && (paramInt2 == o.getHeight())) {
      return;
    }
    e();
    f();
    o = g(paramInt1, paramInt2);
  }
  
  public final void l()
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 29)
    {
      localObject = m.a(p);
      q = p.a((HardwareBuffer)localObject, o.a(n.a()));
      q.a((HardwareBuffer)localObject);
    }
    else
    {
      localObject = p.getPlanes();
      if (localObject.length != 1) {
        return;
      }
      localObject = localObject[0];
      int i = ((Image.Plane)localObject).getRowStride() / ((Image.Plane)localObject).getPixelStride();
      int j = p.getHeight();
      Bitmap localBitmap = q;
      if ((localBitmap == null) || (localBitmap.getWidth() != i) || (q.getHeight() != j)) {
        q = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      }
      localObject = ((Image.Plane)localObject).getBuffer();
      ((ByteBuffer)localObject).rewind();
      q.copyPixelsFromBuffer((Buffer)localObject);
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (p != null) {
      l();
    }
    Bitmap localBitmap = q;
    if (localBitmap != null) {
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == o.getWidth()) && (paramInt2 == o.getHeight())) {
      return;
    }
    if ((s == b.o) && (t))
    {
      k(paramInt1, paramInt2);
      r.r(o.getSurface());
    }
  }
  
  public static enum b {}
}

/* Location:
 * Qualified Name:     u5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */