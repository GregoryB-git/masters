package o4;

/* loaded from: classes.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: o, reason: collision with root package name */
        public final int f18192o;

        a(int i7) {
            this.f18192o = i7;
        }

        public int c() {
            return this.f18192o;
        }
    }

    a b(String str);
}
