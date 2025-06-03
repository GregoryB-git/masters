package A5;

import E5.c;
import android.content.Context;
import io.flutter.plugin.platform.l;
import io.flutter.view.TextureRegistry;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: A5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0005a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f566a;

        /* renamed from: b, reason: collision with root package name */
        public final io.flutter.embedding.engine.a f567b;

        /* renamed from: c, reason: collision with root package name */
        public final c f568c;

        /* renamed from: d, reason: collision with root package name */
        public final TextureRegistry f569d;

        /* renamed from: e, reason: collision with root package name */
        public final l f570e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC0005a f571f;

        /* renamed from: g, reason: collision with root package name */
        public final io.flutter.embedding.engine.b f572g;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, TextureRegistry textureRegistry, l lVar, InterfaceC0005a interfaceC0005a, io.flutter.embedding.engine.b bVar) {
            this.f566a = context;
            this.f567b = aVar;
            this.f568c = cVar;
            this.f569d = textureRegistry;
            this.f570e = lVar;
            this.f571f = interfaceC0005a;
            this.f572g = bVar;
        }

        public Context a() {
            return this.f566a;
        }

        public c b() {
            return this.f568c;
        }

        public io.flutter.embedding.engine.a c() {
            return this.f567b;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
