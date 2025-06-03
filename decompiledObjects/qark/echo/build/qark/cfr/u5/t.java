/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.Surface
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.k;
import t5.b;

public class t
extends TextureView
implements k {
    public boolean o = false;
    public boolean p = false;
    public FlutterRenderer q;
    public Surface r;
    public final TextureView.SurfaceTextureListener s;

    public t(Context context) {
        this(context, null);
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new TextureView.SurfaceTextureListener(){

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n8, int n9) {
                b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
                t.this.o = true;
                if (t.this.q()) {
                    t.this.m();
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                t.this.o = false;
                if (t.this.q()) {
                    t.this.n();
                }
                if (t.this.r != null) {
                    t.this.r.release();
                    t.this.r = null;
                }
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n8, int n9) {
                b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
                if (t.this.q()) {
                    t.this.l(n8, n9);
                }
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.o();
    }

    private void l(int n8, int n9) {
        if (this.q != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Notifying FlutterRenderer that Android surface size has changed to ");
            stringBuilder.append(n8);
            stringBuilder.append(" x ");
            stringBuilder.append(n9);
            b.f("FlutterTextureView", stringBuilder.toString());
            this.q.q(n8, n9);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    private void m() {
        if (this.q != null && this.getSurfaceTexture() != null) {
            Surface surface = this.r;
            if (surface != null) {
                surface.release();
                this.r = null;
            }
            this.r = surface = new Surface(this.getSurfaceTexture());
            this.q.o(surface, this.p);
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }

    private void n() {
        FlutterRenderer flutterRenderer = this.q;
        if (flutterRenderer != null) {
            flutterRenderer.p();
            flutterRenderer = this.r;
            if (flutterRenderer != null) {
                flutterRenderer.release();
                this.r = null;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void o() {
        this.setSurfaceTextureListener(this.s);
    }

    private boolean q() {
        if (this.q != null && !this.p) {
            return true;
        }
        return false;
    }

    @Override
    public void a() {
        if (this.q != null) {
            if (this.getWindowToken() != null) {
                b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                this.n();
            }
            this.q = null;
            return;
        }
        b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override
    public void b() {
        if (this.q == null) {
            b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.p()) {
            b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            this.m();
        }
        this.p = false;
    }

    @Override
    public void c(FlutterRenderer flutterRenderer) {
        b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.q != null) {
            b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.q.p();
        }
        this.q = flutterRenderer;
        this.b();
    }

    @Override
    public FlutterRenderer getAttachedRenderer() {
        return this.q;
    }

    @Override
    public void j() {
        if (this.q == null) {
            b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.p = true;
    }

    public boolean p() {
        return this.o;
    }

    public void setRenderSurface(Surface surface) {
        this.r = surface;
    }

}

