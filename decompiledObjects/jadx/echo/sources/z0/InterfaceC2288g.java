package z0;

import c1.l;
import c1.t;
import d0.C1194q;
import d1.C1204a;
import java.util.Objects;

/* renamed from: z0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2288g {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2288g f21601a = new a();

    /* renamed from: z0.g$a */
    public class a implements InterfaceC2288g {

        /* renamed from: b, reason: collision with root package name */
        public final c1.h f21602b = new c1.h();

        @Override // z0.InterfaceC2288g
        public boolean a(C1194q c1194q) {
            String str = c1194q.f12726n;
            return this.f21602b.a(c1194q) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // z0.InterfaceC2288g
        public l b(C1194q c1194q) {
            String str = c1194q.f12726n;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C1204a(str, c1194q.f12707G, 16000L);
                    case "application/cea-708":
                        return new d1.c(c1194q.f12707G, c1194q.f12729q);
                }
            }
            if (!this.f21602b.a(c1194q)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            t b7 = this.f21602b.b(c1194q);
            return new C2283b(b7.getClass().getSimpleName() + "Decoder", b7);
        }
    }

    boolean a(C1194q c1194q);

    l b(C1194q c1194q);
}
