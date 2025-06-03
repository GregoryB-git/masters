package u5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class t extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: o, reason: collision with root package name */
    public boolean f19947o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19948p;

    /* renamed from: q, reason: collision with root package name */
    public FlutterRenderer f19949q;

    /* renamed from: r, reason: collision with root package name */
    public Surface f19950r;

    /* renamed from: s, reason: collision with root package name */
    public final TextureView.SurfaceTextureListener f19951s;

    public t(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i7, int i8) {
        if (this.f19949q == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC1995b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i7 + " x " + i8);
        this.f19949q.q(i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f19949q == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f19950r;
        if (surface != null) {
            surface.release();
            this.f19950r = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f19950r = surface2;
        this.f19949q.o(surface2, this.f19948p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f19949q;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.p();
        Surface surface = this.f19950r;
        if (surface != null) {
            surface.release();
            this.f19950r = null;
        }
    }

    private void o() {
        setSurfaceTextureListener(this.f19951s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return (this.f19949q == null || this.f19948p) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a() {
        if (this.f19949q == null) {
            AbstractC1995b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC1995b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            n();
        }
        this.f19949q = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
        if (this.f19949q == null) {
            AbstractC1995b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (p()) {
            AbstractC1995b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f19948p = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c(FlutterRenderer flutterRenderer) {
        AbstractC1995b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f19949q != null) {
            AbstractC1995b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f19949q.p();
        }
        this.f19949q = flutterRenderer;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f19949q;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void j() {
        if (this.f19949q == null) {
            AbstractC1995b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f19948p = true;
        }
    }

    public boolean p() {
        return this.f19947o;
    }

    public void setRenderSurface(Surface surface) {
        this.f19950r = surface;
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19947o = false;
        this.f19948p = false;
        this.f19951s = new a();
        o();
    }

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            AbstractC1995b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            t.this.f19947o = true;
            if (t.this.q()) {
                t.this.m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            AbstractC1995b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            t.this.f19947o = false;
            if (t.this.q()) {
                t.this.n();
            }
            if (t.this.f19950r == null) {
                return true;
            }
            t.this.f19950r.release();
            t.this.f19950r = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            AbstractC1995b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (t.this.q()) {
                t.this.l(i7, i8);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
