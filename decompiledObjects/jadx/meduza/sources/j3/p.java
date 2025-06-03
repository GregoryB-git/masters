package j3;

import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class p {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 j3.p$a, still in use, count: 1, list:
      (r0v0 j3.p$a) from 0x0020: INVOKE (r3v3 android.util.SparseArray), (0 int), (r0v0 j3.p$a) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SET,
        EVENT_OVERRIDE;

        static {
            a aVar = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, r0);
            sparseArray.put(5, aVar);
        }

        public a() {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f8376b.clone();
        }
    }

    public abstract s a();

    public abstract a b();
}
