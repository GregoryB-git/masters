package i2;

import android.app.Activity;

/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7394a = a.f7395a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f7395a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static C0111a f7396b = C0111a.f7397a;

        /* renamed from: i2.n$a$a, reason: collision with other inner class name */
        public static final class C0111a extends ec.j implements dc.l<n, n> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0111a f7397a = new C0111a();

            public C0111a() {
                super(1);
            }

            @Override // dc.l
            public final n invoke(n nVar) {
                n nVar2 = nVar;
                ec.i.e(nVar2, "it");
                return nVar2;
            }
        }
    }

    l a(Activity activity);
}
