package j;

import android.view.View;
import android.view.animation.Interpolator;
import e0.o0;
import e0.p0;
import e0.q0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f8243c;

    /* renamed from: d, reason: collision with root package name */
    public p0 f8244d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8245e;

    /* renamed from: b, reason: collision with root package name */
    public long f8242b = -1;
    public final a f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<o0> f8241a = new ArrayList<>();

    public class a extends q0 {

        /* renamed from: b, reason: collision with root package name */
        public boolean f8246b;

        /* renamed from: c, reason: collision with root package name */
        public int f8247c;

        public a() {
            super(0);
            this.f8246b = false;
            this.f8247c = 0;
        }

        @Override // e0.q0, e0.p0
        public final void b() {
            if (this.f8246b) {
                return;
            }
            this.f8246b = true;
            p0 p0Var = g.this.f8244d;
            if (p0Var != null) {
                p0Var.b();
            }
        }

        @Override // e0.p0
        public final void c() {
            int i10 = this.f8247c + 1;
            this.f8247c = i10;
            if (i10 == g.this.f8241a.size()) {
                p0 p0Var = g.this.f8244d;
                if (p0Var != null) {
                    p0Var.c();
                }
                this.f8247c = 0;
                this.f8246b = false;
                g.this.f8245e = false;
            }
        }
    }

    public final void a() {
        if (this.f8245e) {
            Iterator<o0> it = this.f8241a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f8245e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f8245e) {
            return;
        }
        Iterator<o0> it = this.f8241a.iterator();
        while (it.hasNext()) {
            o0 next = it.next();
            long j10 = this.f8242b;
            if (j10 >= 0) {
                next.c(j10);
            }
            Interpolator interpolator = this.f8243c;
            if (interpolator != null && (view = next.f3813a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f8244d != null) {
                next.d(this.f);
            }
            View view2 = next.f3813a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f8245e = true;
    }
}
