package o6;

import kotlin.jvm.internal.Intrinsics;
import l6.f;

/* loaded from: classes.dex */
public abstract class c {
    public static final long h(long j7, int i7) {
        return a.m((j7 << 1) + i7);
    }

    public static final long i(long j7) {
        return a.m((j7 << 1) + 1);
    }

    public static final long j(long j7) {
        long e7;
        if (-4611686018426L <= j7 && j7 < 4611686018427L) {
            return k(m(j7));
        }
        e7 = f.e(j7, -4611686018427387903L, 4611686018427387903L);
        return i(e7);
    }

    public static final long k(long j7) {
        return a.m(j7 << 1);
    }

    public static final long l(long j7) {
        return (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) ? i(n(j7)) : k(j7);
    }

    public static final long m(long j7) {
        return j7 * 1000000;
    }

    public static final long n(long j7) {
        return j7 / 1000000;
    }

    public static final long o(int i7, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(d.f18207s) <= 0 ? k(e.b(i7, unit, d.f18204p)) : p(i7, unit);
    }

    public static final long p(long j7, d unit) {
        long e7;
        Intrinsics.checkNotNullParameter(unit, "unit");
        d dVar = d.f18204p;
        long b7 = e.b(4611686018426999999L, dVar, unit);
        if ((-b7) <= j7 && j7 <= b7) {
            return k(e.b(j7, unit, dVar));
        }
        e7 = f.e(e.a(j7, unit, d.f18206r), -4611686018427387903L, 4611686018427387903L);
        return i(e7);
    }
}
