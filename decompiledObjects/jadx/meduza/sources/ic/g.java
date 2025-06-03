package ic;

import b.a0;

/* loaded from: classes.dex */
public class g extends a0 {
    public static final long N(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static final f O(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new f(i10, i11 - 1);
        }
        f fVar = f.f7961d;
        return f.f7961d;
    }
}
