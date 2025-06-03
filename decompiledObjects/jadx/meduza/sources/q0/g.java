package q0;

/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13192a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static /* synthetic */ int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            throw null;
        }
        return i10 - i11;
    }

    public static /* synthetic */ boolean b(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f13192a, 0, iArr, 0, i10);
        return iArr;
    }
}
