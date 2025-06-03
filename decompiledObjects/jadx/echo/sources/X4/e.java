package X4;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f7271c;

    /* renamed from: d, reason: collision with root package name */
    public final short f7272d;

    public e(g gVar, int i7, int i8) {
        super(gVar);
        this.f7271c = (short) i7;
        this.f7272d = (short) i8;
    }

    @Override // X4.g
    public void c(Y4.a aVar, byte[] bArr) {
        aVar.d(this.f7271c, this.f7272d);
    }

    public String toString() {
        short s7 = this.f7271c;
        short s8 = this.f7272d;
        return "<" + Integer.toBinaryString((s7 & ((1 << s8) - 1)) | (1 << s8) | (1 << this.f7272d)).substring(1) + '>';
    }
}
