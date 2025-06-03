package x5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import g.q;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import v5.b0;
import v5.e0;
import v5.j;
import v5.m;
import x5.d;
import x5.e;
import x5.g;
import x5.k;

/* loaded from: classes.dex */
public final class j extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f17166a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f17167b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f17168c;

    /* renamed from: d, reason: collision with root package name */
    public final d f17169d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f17170e;
    public final i f;

    /* renamed from: o, reason: collision with root package name */
    public SurfaceTexture f17171o;

    /* renamed from: p, reason: collision with root package name */
    public Surface f17172p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17173q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17174r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17175s;

    public final class a implements GLSurfaceView.Renderer, k.a, d.a {

        /* renamed from: a, reason: collision with root package name */
        public final i f17176a;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f17179d;

        /* renamed from: e, reason: collision with root package name */
        public final float[] f17180e;
        public final float[] f;

        /* renamed from: o, reason: collision with root package name */
        public float f17181o;

        /* renamed from: p, reason: collision with root package name */
        public float f17182p;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f17177b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        public final float[] f17178c = new float[16];

        /* renamed from: q, reason: collision with root package name */
        public final float[] f17183q = new float[16];

        /* renamed from: r, reason: collision with root package name */
        public final float[] f17184r = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f17179d = fArr;
            float[] fArr2 = new float[16];
            this.f17180e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.f17176a = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f17182p = 3.1415927f;
        }

        @Override // x5.d.a
        public final synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.f17179d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f10 = -f;
            this.f17182p = f10;
            Matrix.setRotateM(this.f17180e, 0, -this.f17181o, (float) Math.cos(f10), (float) Math.sin(this.f17182p), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Long d10;
            e d11;
            float[] d12;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.f17184r, 0, this.f17179d, 0, this.f, 0);
                Matrix.multiplyMM(this.f17183q, 0, this.f17180e, 0, this.f17184r, 0);
            }
            Matrix.multiplyMM(this.f17178c, 0, this.f17177b, 0, this.f17183q, 0);
            i iVar = this.f17176a;
            float[] fArr2 = this.f17178c;
            iVar.getClass();
            GLES20.glClear(16384);
            try {
                v5.j.a();
            } catch (j.a e10) {
                m.d("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (iVar.f17155a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = iVar.f17163r;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    v5.j.a();
                } catch (j.a e11) {
                    m.d("SceneRenderer", "Failed to draw a frame", e11);
                }
                if (iVar.f17156b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(iVar.f17160o, 0);
                }
                long timestamp = iVar.f17163r.getTimestamp();
                b0<Long> b0Var = iVar.f17159e;
                synchronized (b0Var) {
                    d10 = b0Var.d(timestamp, false);
                }
                Long l10 = d10;
                if (l10 != null) {
                    c cVar = iVar.f17158d;
                    float[] fArr3 = iVar.f17160o;
                    long longValue = l10.longValue();
                    b0<float[]> b0Var2 = cVar.f17123c;
                    synchronized (b0Var2) {
                        d12 = b0Var2.d(longValue, true);
                    }
                    float[] fArr4 = d12;
                    if (fArr4 != null) {
                        float[] fArr5 = cVar.f17122b;
                        float f = fArr4[0];
                        float f10 = -fArr4[1];
                        float f11 = -fArr4[2];
                        float length = Matrix.length(f, f10, f11);
                        if (length != 0.0f) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f10 / length, f11 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!cVar.f17124d) {
                            c.a(cVar.f17121a, cVar.f17122b);
                            cVar.f17124d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, cVar.f17121a, 0, cVar.f17122b, 0);
                    }
                }
                b0<e> b0Var3 = iVar.f;
                synchronized (b0Var3) {
                    d11 = b0Var3.d(timestamp, true);
                }
                e eVar = d11;
                if (eVar != null) {
                    g gVar = iVar.f17157c;
                    gVar.getClass();
                    if (g.b(eVar)) {
                        gVar.f17143a = eVar.f17133c;
                        gVar.f17144b = new g.a(eVar.f17131a.f17135a[0]);
                        if (!eVar.f17134d) {
                            e.b bVar = eVar.f17132b.f17135a[0];
                            float[] fArr6 = bVar.f17138c;
                            int length2 = fArr6.length / 3;
                            v5.j.c(fArr6);
                            v5.j.c(bVar.f17139d);
                            int i10 = bVar.f17137b;
                        }
                    }
                }
            }
            Matrix.multiplyMM(iVar.f17161p, 0, fArr2, 0, iVar.f17160o, 0);
            g gVar2 = iVar.f17157c;
            int i11 = iVar.f17162q;
            float[] fArr7 = iVar.f17161p;
            g.a aVar = gVar2.f17144b;
            if (aVar == null) {
                return;
            }
            int i12 = gVar2.f17143a;
            GLES20.glUniformMatrix3fv(gVar2.f17147e, 1, false, i12 == 1 ? g.f17141j : i12 == 2 ? g.f17142k : g.f17140i, 0);
            GLES20.glUniformMatrix4fv(gVar2.f17146d, 1, false, fArr7, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i11);
            GLES20.glUniform1i(gVar2.f17149h, 0);
            try {
                v5.j.a();
            } catch (j.a e12) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
            }
            GLES20.glVertexAttribPointer(gVar2.f, 3, 5126, false, 12, (Buffer) aVar.f17151b);
            try {
                v5.j.a();
            } catch (j.a e13) {
                Log.e("ProjectionRenderer", "Failed to load position data", e13);
            }
            GLES20.glVertexAttribPointer(gVar2.f17148g, 2, 5126, false, 8, (Buffer) aVar.f17152c);
            try {
                v5.j.a();
            } catch (j.a e14) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e14);
            }
            GLES20.glDrawArrays(aVar.f17153d, 0, aVar.f17150a);
            try {
                v5.j.a();
            } catch (j.a e15) {
                Log.e("ProjectionRenderer", "Failed to render", e15);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f = i10 / i11;
            Matrix.perspectiveM(this.f17177b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            j jVar = j.this;
            jVar.f17170e.post(new q(9, jVar, this.f17176a.b()));
        }
    }

    public interface b {
        void f();

        void m(Surface surface);
    }

    public j(Context context) {
        super(context, null);
        this.f17166a = new CopyOnWriteArrayList<>();
        this.f17170e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f17167b = sensorManager;
        Sensor defaultSensor = e0.f15881a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f17168c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener kVar = new k(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f17169d = new d(windowManager.getDefaultDisplay(), kVar, aVar);
        this.f17173q = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(kVar);
    }

    public final void a() {
        boolean z10 = this.f17173q && this.f17174r;
        Sensor sensor = this.f17168c;
        if (sensor == null || z10 == this.f17175s) {
            return;
        }
        if (z10) {
            this.f17167b.registerListener(this.f17169d, sensor, 0);
        } else {
            this.f17167b.unregisterListener(this.f17169d);
        }
        this.f17175s = z10;
    }

    public x5.a getCameraMotionListener() {
        return this.f;
    }

    public w5.i getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.f17172p;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17170e.post(new b.d(this, 12));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f17174r = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f17174r = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f.f17164s = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f17173q = z10;
        a();
    }
}
