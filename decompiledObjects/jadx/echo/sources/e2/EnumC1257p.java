package e2;

import android.util.SparseArray;

/* renamed from: e2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1257p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: v, reason: collision with root package name */
    public static final SparseArray f13938v;

    /* renamed from: o, reason: collision with root package name */
    public final int f13940o;

    static {
        EnumC1257p enumC1257p = DEFAULT;
        EnumC1257p enumC1257p2 = UNMETERED_ONLY;
        EnumC1257p enumC1257p3 = UNMETERED_OR_DAILY;
        EnumC1257p enumC1257p4 = FAST_IF_RADIO_AWAKE;
        EnumC1257p enumC1257p5 = NEVER;
        EnumC1257p enumC1257p6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f13938v = sparseArray;
        sparseArray.put(0, enumC1257p);
        sparseArray.put(1, enumC1257p2);
        sparseArray.put(2, enumC1257p3);
        sparseArray.put(3, enumC1257p4);
        sparseArray.put(4, enumC1257p5);
        sparseArray.put(-1, enumC1257p6);
    }

    EnumC1257p(int i7) {
        this.f13940o = i7;
    }
}
