// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.graphics.Paint;
import android.graphics.Canvas;
import java.nio.ByteBuffer;
import android.media.Image$Plane;
import android.hardware.HardwareBuffer;
import java.nio.Buffer;
import android.graphics.Bitmap$Config;
import androidx.annotation.NonNull;
import android.view.Surface;
import t5.b;
import java.util.Locale;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import io.flutter.embedding.engine.renderer.k;
import android.view.View;

public class r extends View implements k
{
    public ImageReader o;
    public Image p;
    public Bitmap q;
    public FlutterRenderer r;
    public b s;
    public boolean t;
    
    public r(final Context context, final int n, final int n2, final b b) {
        this(context, g(n, n2), b);
    }
    
    public r(final Context context, final ImageReader o, final b s) {
        super(context, (AttributeSet)null);
        this.t = false;
        this.o = o;
        this.s = s;
        this.h();
    }
    
    public static ImageReader g(int i, int j) {
        if (i <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", i);
            i = 1;
        }
        if (j <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", j);
            j = 1;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            return l.a(i, j, 1, 3, 768L);
        }
        return ImageReader.newInstance(i, j, 1, 3);
    }
    
    public static void i(final String format, final Object... args) {
        t5.b.g("FlutterImageView", String.format(Locale.US, format, args));
    }
    
    public void a() {
        if (!this.t) {
            return;
        }
        this.setAlpha(0.0f);
        this.d();
        this.q = null;
        this.e();
        this.invalidate();
        this.t = false;
    }
    
    public void b() {
    }
    
    public void c(final FlutterRenderer r) {
        if (r$a.a[this.s.ordinal()] == 1) {
            r.r(this.o.getSurface());
        }
        this.setAlpha(1.0f);
        this.r = r;
        this.t = true;
    }
    
    public boolean d() {
        final boolean t = this.t;
        boolean b = false;
        if (!t) {
            return false;
        }
        final Image acquireLatestImage = this.o.acquireLatestImage();
        if (acquireLatestImage != null) {
            this.e();
            this.p = acquireLatestImage;
            this.invalidate();
        }
        if (acquireLatestImage != null) {
            b = true;
        }
        return b;
    }
    
    public final void e() {
        final Image p = this.p;
        if (p != null) {
            p.close();
            this.p = null;
        }
    }
    
    public void f() {
        this.o.close();
    }
    
    public FlutterRenderer getAttachedRenderer() {
        return this.r;
    }
    
    public ImageReader getImageReader() {
        return this.o;
    }
    
    @NonNull
    public Surface getSurface() {
        return this.o.getSurface();
    }
    
    public final void h() {
        this.setAlpha(0.0f);
    }
    
    public void j() {
    }
    
    public void k(final int n, final int n2) {
        if (this.r == null) {
            return;
        }
        if (n == this.o.getWidth() && n2 == this.o.getHeight()) {
            return;
        }
        this.e();
        this.f();
        this.o = g(n, n2);
    }
    
    public final void l() {
        if (Build$VERSION.SDK_INT >= 29) {
            final HardwareBuffer a = m.a(this.p);
            this.q = u5.p.a(a, u5.o.a(n.a()));
            u5.q.a(a);
            return;
        }
        final Image$Plane[] planes = this.p.getPlanes();
        if (planes.length != 1) {
            return;
        }
        final Image$Plane image$Plane = planes[0];
        final int n = image$Plane.getRowStride() / image$Plane.getPixelStride();
        final int height = this.p.getHeight();
        final Bitmap q = this.q;
        if (q == null || q.getWidth() != n || this.q.getHeight() != height) {
            this.q = Bitmap.createBitmap(n, height, Bitmap$Config.ARGB_8888);
        }
        final ByteBuffer buffer = image$Plane.getBuffer();
        buffer.rewind();
        this.q.copyPixelsFromBuffer((Buffer)buffer);
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.p != null) {
            this.l();
        }
        final Bitmap q = this.q;
        if (q != null) {
            canvas.drawBitmap(q, 0.0f, 0.0f, (Paint)null);
        }
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (n == this.o.getWidth() && n2 == this.o.getHeight()) {
            return;
        }
        if (this.s == b.o && this.t) {
            this.k(n, n2);
            this.r.r(this.o.getSurface());
        }
    }
    
    public enum b
    {
        o("background", 0), 
        p("overlay", 1);
        
        static {
            q = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o, b.p };
        }
    }
}
