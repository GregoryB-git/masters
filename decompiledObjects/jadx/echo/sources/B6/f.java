package B6;

/* loaded from: classes.dex */
public abstract class f {

    public class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f860a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f861b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f862c;

        public a(d dVar, int i7, byte[] bArr, int i8) {
            this.f860a = i7;
            this.f861b = bArr;
            this.f862c = i8;
        }
    }

    public static f a(d dVar, byte[] bArr) {
        return b(dVar, bArr, 0, bArr.length);
    }

    public static f b(d dVar, byte[] bArr, int i7, int i8) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        C6.a.b(bArr.length, i7, i8);
        return new a(dVar, i8, bArr, i7);
    }
}
