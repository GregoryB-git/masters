/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.hardware.HardwareBuffer
 *  android.media.Image
 *  android.media.Image$Plane
 *  android.media.ImageReader
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.Surface
 *  android.view.View
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.util.Locale
 */
package u5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Locale;
import u5.l;
import u5.m;
import u5.n;
import u5.o;
import u5.p;
import u5.q;

public class r
extends View
implements k {
    public ImageReader o;
    public Image p;
    public Bitmap q;
    public FlutterRenderer r;
    public b s;
    public boolean t = false;

    public r(Context context, int n8, int n9, b b8) {
        this(context, r.g(n8, n9), b8);
    }

    public r(Context context, ImageReader imageReader, b b8) {
        super(context, null);
        this.o = imageReader;
        this.s = b8;
        this.h();
    }

    public static ImageReader g(int n8, int n9) {
        if (n8 <= 0) {
            r.i("ImageReader width must be greater than 0, but given width=%d, set width=1", n8);
            n8 = 1;
        }
        if (n9 <= 0) {
            r.i("ImageReader height must be greater than 0, but given height=%d, set height=1", n9);
            n9 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return l.a(n8, n9, 1, 3, 768L);
        }
        return ImageReader.newInstance((int)n8, (int)n9, (int)1, (int)3);
    }

    public static /* varargs */ void i(String string2, Object ... arrobject) {
        t5.b.g("FlutterImageView", String.format((Locale)Locale.US, (String)string2, (Object[])arrobject));
    }

    @Override
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

    @Override
    public void b() {
    }

    @Override
    public void c(FlutterRenderer flutterRenderer) {
        if (.a[this.s.ordinal()] == 1) {
            flutterRenderer.r(this.o.getSurface());
        }
        this.setAlpha(1.0f);
        this.r = flutterRenderer;
        this.t = true;
    }

    public boolean d() {
        boolean bl = this.t;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        Image image = this.o.acquireLatestImage();
        if (image != null) {
            this.e();
            this.p = image;
            this.invalidate();
        }
        if (image != null) {
            bl2 = true;
        }
        return bl2;
    }

    public final void e() {
        Image image = this.p;
        if (image != null) {
            image.close();
            this.p = null;
        }
    }

    public void f() {
        this.o.close();
    }

    @Override
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

    @Override
    public void j() {
    }

    public void k(int n8, int n9) {
        if (this.r == null) {
            return;
        }
        if (n8 == this.o.getWidth() && n9 == this.o.getHeight()) {
            return;
        }
        this.e();
        this.f();
        this.o = r.g(n8, n9);
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = m.a(this.p);
            this.q = p.a(hardwareBuffer, o.a(n.a()));
            q.a(hardwareBuffer);
            return;
        }
        Image.Plane plane = this.p.getPlanes();
        if (plane.length != 1) {
            return;
        }
        plane = plane[0];
        int n8 = plane.getRowStride() / plane.getPixelStride();
        int n9 = this.p.getHeight();
        Bitmap bitmap = this.q;
        if (bitmap == null || bitmap.getWidth() != n8 || this.q.getHeight() != n9) {
            this.q = Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        }
        plane = plane.getBuffer();
        plane.rewind();
        this.q.copyPixelsFromBuffer((Buffer)plane);
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        if (this.p != null) {
            this.l();
        }
        if ((bitmap = this.q) != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        }
    }

    public void onSizeChanged(int n8, int n9, int n10, int n11) {
        if (n8 == this.o.getWidth() && n9 == this.o.getHeight()) {
            return;
        }
        if (this.s == b.o && this.t) {
            this.k(n8, n9);
            this.r.r(this.o.getSurface());
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* enum */ b p = new b();
        public static final /* synthetic */ b[] q;

        static {
            q = b.c();
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o, p};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }
    }

}

