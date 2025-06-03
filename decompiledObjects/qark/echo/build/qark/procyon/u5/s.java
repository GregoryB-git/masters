// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.view.View;
import android.graphics.Region$Op;
import android.graphics.Region;
import t5.b;
import android.view.SurfaceHolder;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.engine.renderer.j;
import android.view.SurfaceHolder$Callback;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.k;
import android.view.SurfaceView;

public class s extends SurfaceView implements k
{
    public final boolean o;
    public boolean p;
    public boolean q;
    public FlutterRenderer r;
    public final SurfaceHolder$Callback s;
    public final j t;
    
    public s(final Context context, final AttributeSet set, final boolean o) {
        super(context, set);
        this.p = false;
        this.q = false;
        this.s = (SurfaceHolder$Callback)new SurfaceHolder$Callback() {
            public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
                b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
                if (u5.s.this.p()) {
                    u5.s.this.k(n2, n3);
                }
            }
            
            public void surfaceCreated(final SurfaceHolder surfaceHolder) {
                b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
                u5.s.d(u5.s.this, true);
                if (u5.s.this.p()) {
                    u5.s.this.l();
                }
            }
            
            public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
                b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
                u5.s.d(u5.s.this, false);
                if (u5.s.this.p()) {
                    u5.s.this.m();
                }
            }
        };
        this.t = new j() {
            @Override
            public void b() {
            }
            
            @Override
            public void e() {
                b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
                ((View)u5.s.this).setAlpha(1.0f);
                if (u5.s.i(u5.s.this) != null) {
                    u5.s.i(u5.s.this).k(this);
                }
            }
        };
        this.o = o;
        this.n();
    }
    
    public s(final Context context, final boolean b) {
        this(context, null, b);
    }
    
    public static /* synthetic */ boolean d(final s s, final boolean p2) {
        return s.p = p2;
    }
    
    public static /* synthetic */ FlutterRenderer i(final s s) {
        return s.r;
    }
    
    private void n() {
        if (this.o) {
            this.getHolder().setFormat(-2);
            this.setZOrderOnTop(true);
        }
        this.getHolder().addCallback(this.s);
        ((View)this).setAlpha(0.0f);
    }
    
    public void a() {
        if (this.r != null) {
            if (((View)this).getWindowToken() != null) {
                b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                this.m();
            }
            ((View)this).setAlpha(0.0f);
            this.r.k(this.t);
            this.r = null;
            return;
        }
        b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }
    
    public void b() {
        final FlutterRenderer r = this.r;
        if (r == null) {
            b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        r.f(this.t);
        if (this.o()) {
            b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            this.l();
        }
        this.q = false;
    }
    
    public void c(final FlutterRenderer r) {
        b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.r != null) {
            b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.r.p();
            this.r.k(this.t);
        }
        this.r = r;
        this.b();
    }
    
    public boolean gatherTransparentRegion(final Region region) {
        if (((View)this).getAlpha() < 1.0f) {
            return false;
        }
        final int[] array = new int[2];
        ((View)this).getLocationInWindow(array);
        final int n = array[0];
        region.op(n, array[1], ((View)this).getRight() + n - ((View)this).getLeft(), array[1] + ((View)this).getBottom() - ((View)this).getTop(), Region$Op.DIFFERENCE);
        return true;
    }
    
    public FlutterRenderer getAttachedRenderer() {
        return this.r;
    }
    
    public void j() {
        if (this.r == null) {
            b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.q = true;
    }
    
    public final void k(final int i, final int j) {
        if (this.r != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Notifying FlutterRenderer that Android surface size has changed to ");
            sb.append(i);
            sb.append(" x ");
            sb.append(j);
            b.f("FlutterSurfaceView", sb.toString());
            this.r.q(i, j);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }
    
    public final void l() {
        if (this.r != null && this.getHolder() != null) {
            this.r.o(this.getHolder().getSurface(), this.q);
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }
    
    public final void m() {
        final FlutterRenderer r = this.r;
        if (r != null) {
            r.p();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }
    
    public boolean o() {
        return this.p;
    }
    
    public final boolean p() {
        return this.r != null && !this.q;
    }
}
