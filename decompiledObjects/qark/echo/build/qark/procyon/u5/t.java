// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.view.View;
import t5.b;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.content.Context;
import android.view.TextureView$SurfaceTextureListener;
import android.view.Surface;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.k;
import android.view.TextureView;

public class t extends TextureView implements k
{
    public boolean o;
    public boolean p;
    public FlutterRenderer q;
    public Surface r;
    public final TextureView$SurfaceTextureListener s;
    
    public t(final Context context) {
        this(context, null);
    }
    
    public t(final Context context, final AttributeSet set) {
        super(context, set);
        this.o = false;
        this.p = false;
        this.s = (TextureView$SurfaceTextureListener)new TextureView$SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
                b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
                t.d(t.this, true);
                if (t.this.q()) {
                    t.this.m();
                }
            }
            
            public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
                b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                t.d(t.this, false);
                if (t.this.q()) {
                    t.this.n();
                }
                if (t.i(t.this) != null) {
                    t.i(t.this).release();
                    t.k(t.this, null);
                }
                return true;
            }
            
            public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
                b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
                if (t.this.q()) {
                    t.this.l(n, n2);
                }
            }
            
            public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
            }
        };
        this.o();
    }
    
    public static /* synthetic */ boolean d(final t t, final boolean o) {
        return t.o = o;
    }
    
    public static /* synthetic */ Surface i(final t t) {
        return t.r;
    }
    
    public static /* synthetic */ Surface k(final t t, final Surface r) {
        return t.r = r;
    }
    
    private void l(final int i, final int j) {
        if (this.q != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Notifying FlutterRenderer that Android surface size has changed to ");
            sb.append(i);
            sb.append(" x ");
            sb.append(j);
            b.f("FlutterTextureView", sb.toString());
            this.q.q(i, j);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }
    
    private void m() {
        if (this.q != null && this.getSurfaceTexture() != null) {
            final Surface r = this.r;
            if (r != null) {
                r.release();
                this.r = null;
            }
            final Surface r2 = new Surface(this.getSurfaceTexture());
            this.r = r2;
            this.q.o(r2, this.p);
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }
    
    private void n() {
        final FlutterRenderer q = this.q;
        if (q != null) {
            q.p();
            final Surface r = this.r;
            if (r != null) {
                r.release();
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
        return this.q != null && !this.p;
    }
    
    public void a() {
        if (this.q != null) {
            if (((View)this).getWindowToken() != null) {
                b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                this.n();
            }
            this.q = null;
            return;
        }
        b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }
    
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
    
    public void c(final FlutterRenderer q) {
        b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.q != null) {
            b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.q.p();
        }
        this.q = q;
        this.b();
    }
    
    public FlutterRenderer getAttachedRenderer() {
        return this.q;
    }
    
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
    
    public void setRenderSurface(final Surface r) {
        this.r = r;
    }
}
