/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Region
 *  android.graphics.Region$Op
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u5;

import android.content.Context;
import android.graphics.Region;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import t5.b;

public class s
extends SurfaceView
implements k {
    public final boolean o;
    public boolean p = false;
    public boolean q = false;
    public FlutterRenderer r;
    public final SurfaceHolder.Callback s;
    public final j t;

    public s(Context context, AttributeSet attributeSet, boolean bl) {
        super(context, attributeSet);
        this.s = new SurfaceHolder.Callback(){

            public void surfaceChanged(SurfaceHolder surfaceHolder, int n8, int n9, int n10) {
                b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
                if (s.this.p()) {
                    s.this.k(n9, n10);
                }
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
                s.this.p = true;
                if (s.this.p()) {
                    s.this.l();
                }
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
                s.this.p = false;
                if (s.this.p()) {
                    s.this.m();
                }
            }
        };
        this.t = new j(){

            @Override
            public void b() {
            }

            @Override
            public void e() {
                b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
                s.this.setAlpha(1.0f);
                if (s.this.r != null) {
                    s.this.r.k(this);
                }
            }
        };
        this.o = bl;
        this.n();
    }

    public s(Context context, boolean bl) {
        this(context, null, bl);
    }

    private void n() {
        if (this.o) {
            this.getHolder().setFormat(-2);
            this.setZOrderOnTop(true);
        }
        this.getHolder().addCallback(this.s);
        this.setAlpha(0.0f);
    }

    @Override
    public void a() {
        if (this.r != null) {
            if (this.getWindowToken() != null) {
                b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                this.m();
            }
            this.setAlpha(0.0f);
            this.r.k(this.t);
            this.r = null;
            return;
        }
        b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override
    public void b() {
        FlutterRenderer flutterRenderer = this.r;
        if (flutterRenderer == null) {
            b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.f(this.t);
        if (this.o()) {
            b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            this.l();
        }
        this.q = false;
    }

    @Override
    public void c(FlutterRenderer flutterRenderer) {
        b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.r != null) {
            b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.r.p();
            this.r.k(this.t);
        }
        this.r = flutterRenderer;
        this.b();
    }

    public boolean gatherTransparentRegion(Region region) {
        if (this.getAlpha() < 1.0f) {
            return false;
        }
        int[] arrn = new int[2];
        this.getLocationInWindow(arrn);
        int n8 = arrn[0];
        region.op(n8, arrn[1], this.getRight() + n8 - this.getLeft(), arrn[1] + this.getBottom() - this.getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override
    public FlutterRenderer getAttachedRenderer() {
        return this.r;
    }

    @Override
    public void j() {
        if (this.r == null) {
            b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.q = true;
    }

    public final void k(int n8, int n9) {
        if (this.r != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Notifying FlutterRenderer that Android surface size has changed to ");
            stringBuilder.append(n8);
            stringBuilder.append(" x ");
            stringBuilder.append(n9);
            b.f("FlutterSurfaceView", stringBuilder.toString());
            this.r.q(n8, n9);
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
        FlutterRenderer flutterRenderer = this.r;
        if (flutterRenderer != null) {
            flutterRenderer.p();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    public boolean o() {
        return this.p;
    }

    public final boolean p() {
        if (this.r != null && !this.q) {
            return true;
        }
        return false;
    }

}

