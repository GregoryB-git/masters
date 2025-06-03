package n5;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {

    public class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f18035a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f18036b;

        public a(q qVar, k kVar) {
            this.f18036b = qVar;
            this.f18035a = kVar;
        }

        @Override // n5.l
        public int a() {
            return this.f18035a.f18013c;
        }

        @Override // n5.l
        public boolean b() {
            return this.f18035a.F();
        }
    }

    public static void a(q qVar, k kVar, Runnable runnable) {
        qVar.c(new m(kVar == null ? null : new a(qVar, kVar), runnable));
    }

    public static q b(String str, int i7, int i8) {
        return i7 == 1 ? new u(str, i8) : new s(str, i7, i8);
    }
}
