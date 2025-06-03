package u5;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class s extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19939o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19940p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19941q;

    /* renamed from: r, reason: collision with root package name */
    public FlutterRenderer f19942r;

    /* renamed from: s, reason: collision with root package name */
    public final SurfaceHolder.Callback f19943s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f19944t;

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            AbstractC1995b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (s.this.p()) {
                s.this.k(i8, i9);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            AbstractC1995b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            s.this.f19940p = true;
            if (s.this.p()) {
                s.this.l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC1995b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            s.this.f19940p = false;
            if (s.this.p()) {
                s.this.m();
            }
        }
    }

    public s(Context context, AttributeSet attributeSet, boolean z7) {
        super(context, attributeSet);
        this.f19940p = false;
        this.f19941q = false;
        this.f19943s = new a();
        this.f19944t = new b();
        this.f19939o = z7;
        n();
    }

    private void n() {
        if (this.f19939o) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f19943s);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a() {
        if (this.f19942r == null) {
            AbstractC1995b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC1995b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        setAlpha(0.0f);
        this.f19942r.k(this.f19944t);
        this.f19942r = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
        FlutterRenderer flutterRenderer = this.f19942r;
        if (flutterRenderer == null) {
            AbstractC1995b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.f(this.f19944t);
        if (o()) {
            AbstractC1995b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.f19941q = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c(FlutterRenderer flutterRenderer) {
        AbstractC1995b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f19942r != null) {
            AbstractC1995b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f19942r.p();
            this.f19942r.k(this.f19944t);
        }
        this.f19942r = flutterRenderer;
        b();
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], (getRight() + i7) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f19942r;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void j() {
        if (this.f19942r == null) {
            AbstractC1995b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f19941q = true;
        }
    }

    public final void k(int i7, int i8) {
        if (this.f19942r == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC1995b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i7 + " x " + i8);
        this.f19942r.q(i7, i8);
    }

    public final void l() {
        if (this.f19942r == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f19942r.o(getHolder().getSurface(), this.f19941q);
    }

    public final void m() {
        FlutterRenderer flutterRenderer = this.f19942r;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.p();
    }

    public boolean o() {
        return this.f19940p;
    }

    public final boolean p() {
        return (this.f19942r == null || this.f19941q) ? false : true;
    }

    public s(Context context, boolean z7) {
        this(context, null, z7);
    }

    public class b implements io.flutter.embedding.engine.renderer.j {
        public b() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void e() {
            AbstractC1995b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            s.this.setAlpha(1.0f);
            if (s.this.f19942r != null) {
                s.this.f19942r.k(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
        }
    }
}
