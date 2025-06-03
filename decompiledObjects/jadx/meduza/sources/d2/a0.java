package d2;

import android.webkit.TracingController;
import d2.a;
import d2.j0;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* loaded from: classes.dex */
public final class a0 extends c2.i {

    /* renamed from: a, reason: collision with root package name */
    public TracingController f3347a;

    /* renamed from: b, reason: collision with root package name */
    public TracingControllerBoundaryInterface f3348b;

    public a0() {
        a.g gVar = i0.f3387z;
        if (gVar.c()) {
            this.f3347a = l.a();
            this.f3348b = null;
        } else {
            if (!gVar.d()) {
                throw i0.a();
            }
            this.f3347a = null;
            this.f3348b = j0.b.f3390a.getTracingController();
        }
    }

    @Override // c2.i
    public final boolean a() {
        a.g gVar = i0.f3387z;
        if (gVar.c()) {
            if (this.f3347a == null) {
                this.f3347a = l.a();
            }
            return l.d(this.f3347a);
        }
        if (!gVar.d()) {
            throw i0.a();
        }
        if (this.f3348b == null) {
            this.f3348b = j0.b.f3390a.getTracingController();
        }
        return this.f3348b.isTracing();
    }

    @Override // c2.i
    public final void b(c2.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        a.g gVar = i0.f3387z;
        if (gVar.c()) {
            if (this.f3347a == null) {
                this.f3347a = l.a();
            }
            l.f(this.f3347a, hVar);
        } else {
            if (!gVar.d()) {
                throw i0.a();
            }
            if (this.f3348b == null) {
                this.f3348b = j0.b.f3390a.getTracingController();
            }
            this.f3348b.start(hVar.f2217a, hVar.f2218b, hVar.f2219c);
        }
    }

    @Override // c2.i
    public final boolean c(FileOutputStream fileOutputStream, ExecutorService executorService) {
        a.g gVar = i0.f3387z;
        if (gVar.c()) {
            if (this.f3347a == null) {
                this.f3347a = l.a();
            }
            return l.g(this.f3347a, fileOutputStream, executorService);
        }
        if (!gVar.d()) {
            throw i0.a();
        }
        if (this.f3348b == null) {
            this.f3348b = j0.b.f3390a.getTracingController();
        }
        return this.f3348b.stop(fileOutputStream, executorService);
    }
}
