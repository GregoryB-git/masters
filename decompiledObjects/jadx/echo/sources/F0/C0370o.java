package F0;

/* renamed from: F0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370o {

    /* renamed from: a, reason: collision with root package name */
    public final int f1939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1940b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1941c;

    public C0370o(int i7, int i8, String str) {
        this.f1939a = i7;
        this.f1940b = i8;
        this.f1941c = str;
    }

    public static C0370o a(g0.z zVar) {
        String str;
        zVar.U(2);
        int G6 = zVar.G();
        int i7 = G6 >> 1;
        int G7 = ((zVar.G() >> 3) & 31) | ((G6 & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i7);
        sb.append(G7 >= 10 ? "." : ".0");
        sb.append(G7);
        return new C0370o(i7, G7, sb.toString());
    }
}
