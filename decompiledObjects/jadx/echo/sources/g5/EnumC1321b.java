package g5;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1321b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: o, reason: collision with root package name */
    public final int[] f14436o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14437p;

    EnumC1321b(int[] iArr, int i7) {
        this.f14436o = iArr;
        this.f14437p = i7;
    }

    public int c() {
        return this.f14437p;
    }

    public int e(c cVar) {
        int f7 = cVar.f();
        return this.f14436o[f7 <= 9 ? (char) 0 : f7 <= 26 ? (char) 1 : (char) 2];
    }
}
