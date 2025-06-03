package R3;

import T3.h;
import T3.n;
import V3.AbstractC0667f;
import V3.l;
import V3.r;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import c4.C0849a;
import c4.C0851c;
import c4.InterfaceC0852d;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import s3.C1947e;

/* loaded from: classes.dex */
public class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5647a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5648b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final C1947e f5649c;

    public class a extends Y3.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0851c f5650b;

        /* renamed from: R3.i$a$a, reason: collision with other inner class name */
        public class RunnableC0087a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f5652o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Throwable f5653p;

            public RunnableC0087a(String str, Throwable th) {
                this.f5652o = str;
                this.f5653p = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f5652o, this.f5653p);
            }
        }

        public a(C0851c c0851c) {
            this.f5650b = c0851c;
        }

        @Override // Y3.c
        public void g(Throwable th) {
            String h7 = Y3.c.h(th);
            this.f5650b.c(h7, th);
            new Handler(i.this.f5647a.getMainLooper()).post(new RunnableC0087a(h7, th));
            d().shutdownNow();
        }
    }

    public class b implements C1947e.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T3.h f5655a;

        public b(T3.h hVar) {
            this.f5655a = hVar;
        }

        @Override // s3.C1947e.a
        public void a(boolean z7) {
            if (z7) {
                this.f5655a.j("app_in_background");
            } else {
                this.f5655a.p("app_in_background");
            }
        }
    }

    public i(C1947e c1947e) {
        this.f5649c = c1947e;
        if (c1947e != null) {
            this.f5647a = c1947e.m();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // V3.l
    public r a(AbstractC0667f abstractC0667f) {
        return new a(abstractC0667f.q("RunLoop"));
    }

    @Override // V3.l
    public InterfaceC0852d b(AbstractC0667f abstractC0667f, InterfaceC0852d.a aVar, List list) {
        return new C0849a(aVar, list);
    }

    @Override // V3.l
    public File c() {
        return this.f5647a.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // V3.l
    public T3.h d(AbstractC0667f abstractC0667f, T3.c cVar, T3.f fVar, h.a aVar) {
        n nVar = new n(cVar, fVar, aVar);
        this.f5649c.g(new b(nVar));
        return nVar;
    }

    @Override // V3.l
    public String e(AbstractC0667f abstractC0667f) {
        return Build.VERSION.SDK_INT + "/Android";
    }

    @Override // V3.l
    public X3.e f(AbstractC0667f abstractC0667f, String str) {
        String x7 = abstractC0667f.x();
        String str2 = str + "_" + x7;
        if (!this.f5648b.contains(str2)) {
            this.f5648b.add(str2);
            return new X3.b(abstractC0667f, new j(this.f5647a, abstractC0667f, str2), new X3.c(abstractC0667f.s()));
        }
        throw new Q3.d("SessionPersistenceKey '" + x7 + "' has already been used.");
    }

    @Override // V3.l
    public V3.j g(AbstractC0667f abstractC0667f) {
        return new h();
    }
}
