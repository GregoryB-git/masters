package m5;

import A5.a;
import E5.k;
import android.content.Context;
import io.flutter.embedding.engine.a;

/* loaded from: classes.dex */
public class f implements A5.a {

    /* renamed from: a, reason: collision with root package name */
    public k f17821a;

    /* renamed from: b, reason: collision with root package name */
    public g f17822b;

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        Context a7 = bVar.a();
        E5.c b7 = bVar.b();
        this.f17822b = new g(a7, b7);
        k kVar = new k(b7, "com.ryanheise.just_audio.methods");
        this.f17821a = kVar;
        kVar.e(this.f17822b);
        bVar.c().e(new a());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f17822b.a();
        this.f17822b = null;
        this.f17821a.e(null);
    }

    public class a implements a.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            f.this.f17822b.a();
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }
    }
}
