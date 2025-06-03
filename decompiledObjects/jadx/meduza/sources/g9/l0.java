package g9;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f6024a;

    public l0(int i10, int i11) {
        x6.b.Z("Generator ID %d contains more than %d reserved bits", (i10 & 1) == i10, Integer.valueOf(i10), 1);
        x6.b.Z("Cannot supply target ID from different generator ID", (i11 & 1) == i10, new Object[0]);
        this.f6024a = i11;
    }
}
