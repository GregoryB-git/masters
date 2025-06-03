package q3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import i9.m0;
import java.util.Map;
import java.util.Objects;
import k3.s;
import s3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13241e;

    public /* synthetic */ f(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f13237a = i11;
        this.f13239c = obj;
        this.f13240d = obj2;
        this.f13238b = i10;
        this.f13241e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13237a) {
            case 0:
                final k kVar = (k) this.f13239c;
                final s sVar = (s) this.f13240d;
                final int i10 = this.f13238b;
                Runnable runnable = (Runnable) this.f13241e;
                kVar.getClass();
                try {
                    try {
                        s3.b bVar = kVar.f;
                        r3.d dVar = kVar.f13257c;
                        Objects.requireNonNull(dVar);
                        int i11 = 0;
                        bVar.f(new io.flutter.plugins.firebase.auth.g(dVar, i11));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) kVar.f13255a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            i11 = 1;
                        }
                        if (i11 == 0) {
                            kVar.f.f(new b.a() { // from class: q3.g
                                @Override // s3.b.a
                                public final Object a() {
                                    k kVar2 = k.this;
                                    kVar2.f13258d.b(sVar, i10 + 1);
                                    return null;
                                }
                            });
                        } else {
                            kVar.a(sVar, i10);
                        }
                    } catch (s3.a unused) {
                        kVar.f13258d.b(sVar, i10 + 1);
                    }
                    return;
                } finally {
                    runnable.run();
                }
            default:
                m0 m0Var = (m0) this.f13239c;
                byte[] bArr = (byte[]) this.f13240d;
                int i12 = this.f13238b;
                Map map = (Map) this.f13241e;
                k9.b g10 = m0Var.g(bArr, i12);
                synchronized (map) {
                    map.put(g10.a(), g10);
                }
                return;
        }
    }
}
