package y6;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: y6.a$a, reason: collision with other inner class name */
    public static final class C0304a {
        public static /* synthetic */ void a(a aVar, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            aVar.b(obj);
        }
    }

    Object a(Object obj, X5.d dVar);

    void b(Object obj);

    boolean c();
}
