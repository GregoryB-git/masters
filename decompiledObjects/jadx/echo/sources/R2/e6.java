package R2;

import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.C1080z1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5282a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5283b;

    static {
        int[] iArr = new int[C1080z1.b.values().length];
        f5283b = iArr;
        try {
            iArr[C1080z1.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5283b[C1080z1.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5283b[C1080z1.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5283b[C1080z1.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[B1.a.values().length];
        f5282a = iArr2;
        try {
            iArr2[B1.a.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5282a[B1.a.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5282a[B1.a.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5282a[B1.a.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f5282a[B1.a.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f5282a[B1.a.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
