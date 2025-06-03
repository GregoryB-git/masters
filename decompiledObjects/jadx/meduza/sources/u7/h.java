package u7;

/* loaded from: classes.dex */
public class h extends Exception {
    @Deprecated
    public h() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        m6.j.f("Detail message must not be empty", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Throwable th) {
        super(str, th);
        m6.j.f("Detail message must not be empty", str);
    }
}
