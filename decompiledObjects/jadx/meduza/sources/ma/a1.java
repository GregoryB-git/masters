package ma;

import ma.a0;

/* loaded from: classes.dex */
public enum a1 implements a0.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10915a;

    a1(int i10) {
        this.f10915a = i10;
    }

    @Override // ma.a0.a
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f10915a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
