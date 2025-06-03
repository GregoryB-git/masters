package X4;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f7262c;

    /* renamed from: d, reason: collision with root package name */
    public final short f7263d;

    public b(g gVar, int i7, int i8) {
        super(gVar);
        this.f7262c = (short) i7;
        this.f7263d = (short) i8;
    }

    @Override // X4.g
    public void c(Y4.a aVar, byte[] bArr) {
        int i7;
        int i8 = 0;
        while (true) {
            short s7 = this.f7263d;
            if (i8 >= s7) {
                return;
            }
            if (i8 == 0 || (i8 == 31 && s7 <= 62)) {
                int i9 = 5;
                aVar.d(31, 5);
                short s8 = this.f7263d;
                if (s8 > 62) {
                    i7 = s8 - 31;
                    i9 = 16;
                } else if (i8 == 0) {
                    aVar.d(Math.min((int) s8, 31), 5);
                } else {
                    i7 = s8 - 31;
                }
                aVar.d(i7, i9);
            }
            aVar.d(bArr[this.f7262c + i8], 8);
            i8++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f7262c);
        sb.append("::");
        sb.append((this.f7262c + this.f7263d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
