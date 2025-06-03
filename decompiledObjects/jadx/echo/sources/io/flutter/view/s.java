package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f15333e;

    /* renamed from: f, reason: collision with root package name */
    public static b f15334f;

    /* renamed from: b, reason: collision with root package name */
    public FlutterJNI f15336b;

    /* renamed from: a, reason: collision with root package name */
    public long f15335a = -1;

    /* renamed from: c, reason: collision with root package name */
    public c f15337c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public final FlutterJNI.b f15338d = new a();

    public class a implements FlutterJNI.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j7) {
            Choreographer.getInstance().postFrameCallback(b(j7));
        }

        public final Choreographer.FrameCallback b(long j7) {
            if (s.this.f15337c == null) {
                return s.this.new c(j7);
            }
            s.this.f15337c.f15342o = j7;
            c cVar = s.this.f15337c;
            s.this.f15337c = null;
            return cVar;
        }
    }

    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public DisplayManager f15340a;

        public b(DisplayManager displayManager) {
            this.f15340a = displayManager;
        }

        public void a() {
            this.f15340a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            if (i7 == 0) {
                float refreshRate = this.f15340a.getDisplay(0).getRefreshRate();
                s.this.f15335a = (long) (1.0E9d / refreshRate);
                s.this.f15336b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }

    public class c implements Choreographer.FrameCallback {

        /* renamed from: o, reason: collision with root package name */
        public long f15342o;

        public c(long j7) {
            this.f15342o = j7;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            long nanoTime = System.nanoTime() - j7;
            s.this.f15336b.onVsync(nanoTime < 0 ? 0L : nanoTime, s.this.f15335a, this.f15342o);
            s.this.f15337c = this;
        }
    }

    public s(FlutterJNI flutterJNI) {
        this.f15336b = flutterJNI;
    }

    public static s f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f15333e == null) {
            f15333e = new s(flutterJNI);
        }
        if (f15334f == null) {
            s sVar = f15333e;
            Objects.requireNonNull(sVar);
            b bVar = sVar.new b(displayManager);
            f15334f = bVar;
            bVar.a();
        }
        if (f15333e.f15335a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f15333e.f15335a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f15333e;
    }

    public void g() {
        this.f15336b.setAsyncWaitForVsyncDelegate(this.f15338d);
    }
}
