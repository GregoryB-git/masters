package gc;

import ec.i;
import java.util.Random;

/* loaded from: classes.dex */
public final class b extends gc.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f7001c = new a();

    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // gc.a
    public final Random a() {
        Random random = this.f7001c.get();
        i.d(random, "get(...)");
        return random;
    }
}
