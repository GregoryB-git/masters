package L0;

import F0.T;
import d0.C1162A;
import g0.z;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final T f3316a;

    public static final class a extends C1162A {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public e(T t7) {
        this.f3316a = t7;
    }

    public final boolean a(z zVar, long j7) {
        return b(zVar) && c(zVar, j7);
    }

    public abstract boolean b(z zVar);

    public abstract boolean c(z zVar, long j7);
}
