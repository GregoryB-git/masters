package androidx.work;

import android.content.Context;
import defpackage.f;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f1457a;

    /* renamed from: b, reason: collision with root package name */
    public WorkerParameters f1458b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1459c = -256;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1460d;

    public static abstract class a {

        /* renamed from: androidx.work.d$a$a, reason: collision with other inner class name */
        public static final class C0024a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.c f1461a = androidx.work.c.f1454c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0024a.class != obj.getClass()) {
                    return false;
                }
                return this.f1461a.equals(((C0024a) obj).f1461a);
            }

            public final int hashCode() {
                return this.f1461a.hashCode() + (C0024a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder l10 = f.l("Failure {mOutputData=");
                l10.append(this.f1461a);
                l10.append('}');
                return l10.toString();
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.c f1462a;

            public c() {
                this(androidx.work.c.f1454c);
            }

            public c(androidx.work.c cVar) {
                this.f1462a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f1462a.equals(((c) obj).f1462a);
            }

            public final int hashCode() {
                return this.f1462a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder l10 = f.l("Success {mOutputData=");
                l10.append(this.f1462a);
                l10.append('}');
                return l10.toString();
            }
        }
    }

    public d(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1457a = context;
        this.f1458b = workerParameters;
    }

    public final Context a() {
        return this.f1457a;
    }

    public s7.e<o2.d> b() {
        z2.c cVar = new z2.c();
        cVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID c() {
        return this.f1458b.f1435a;
    }

    public final c e() {
        return this.f1458b.f1436b;
    }

    public final boolean f() {
        return this.f1459c != -256;
    }

    public void g() {
    }

    public abstract z2.c h();

    public final void i(int i10) {
        this.f1459c = i10;
        g();
    }
}
