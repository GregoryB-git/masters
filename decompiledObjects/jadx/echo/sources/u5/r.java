package u5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class r extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: o, reason: collision with root package name */
    public ImageReader f19929o;

    /* renamed from: p, reason: collision with root package name */
    public Image f19930p;

    /* renamed from: q, reason: collision with root package name */
    public Bitmap f19931q;

    /* renamed from: r, reason: collision with root package name */
    public FlutterRenderer f19932r;

    /* renamed from: s, reason: collision with root package name */
    public b f19933s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19934t;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19935a;

        static {
            int[] iArr = new int[b.values().length];
            f19935a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19935a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public r(Context context, int i7, int i8, b bVar) {
        this(context, g(i7, i8), bVar);
    }

    public static ImageReader g(int i7, int i8) {
        int i9;
        int i10;
        ImageReader newInstance;
        if (i7 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i7));
            i9 = 1;
        } else {
            i9 = i7;
        }
        if (i8 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i8));
            i10 = 1;
        } else {
            i10 = i8;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i9, i10, 1, 3);
        }
        newInstance = ImageReader.newInstance(i9, i10, 1, 3, 768L);
        return newInstance;
    }

    public static void i(String str, Object... objArr) {
        AbstractC1995b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a() {
        if (this.f19934t) {
            setAlpha(0.0f);
            d();
            this.f19931q = null;
            e();
            invalidate();
            this.f19934t = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c(FlutterRenderer flutterRenderer) {
        if (a.f19935a[this.f19933s.ordinal()] == 1) {
            flutterRenderer.r(this.f19929o.getSurface());
        }
        setAlpha(1.0f);
        this.f19932r = flutterRenderer;
        this.f19934t = true;
    }

    public boolean d() {
        if (!this.f19934t) {
            return false;
        }
        Image acquireLatestImage = this.f19929o.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f19930p = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void e() {
        Image image = this.f19930p;
        if (image != null) {
            image.close();
            this.f19930p = null;
        }
    }

    public void f() {
        this.f19929o.close();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f19932r;
    }

    public ImageReader getImageReader() {
        return this.f19929o;
    }

    @NonNull
    public Surface getSurface() {
        return this.f19929o.getSurface();
    }

    public final void h() {
        setAlpha(0.0f);
    }

    public void k(int i7, int i8) {
        if (this.f19932r == null) {
            return;
        }
        if (i7 == this.f19929o.getWidth() && i8 == this.f19929o.getHeight()) {
            return;
        }
        e();
        f();
        this.f19929o = g(i7, i8);
    }

    public final void l() {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            hardwareBuffer = this.f19930p.getHardwareBuffer();
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
            this.f19931q = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f19930p.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f19930p.getHeight();
        Bitmap bitmap = this.f19931q;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f19931q.getHeight() != height) {
            this.f19931q = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f19931q.copyPixelsFromBuffer(buffer);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19930p != null) {
            l();
        }
        Bitmap bitmap = this.f19931q;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (!(i7 == this.f19929o.getWidth() && i8 == this.f19929o.getHeight()) && this.f19933s == b.background && this.f19934t) {
            k(i7, i8);
            this.f19932r.r(this.f19929o.getSurface());
        }
    }

    public r(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f19934t = false;
        this.f19929o = imageReader;
        this.f19933s = bVar;
        h();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void j() {
    }
}
