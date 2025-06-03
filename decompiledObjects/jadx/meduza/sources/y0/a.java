package y0;

/* loaded from: classes.dex */
public final class a extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x0.i iVar, String str) {
        super(iVar, "Attempting to reuse fragment " + iVar + " with previous ID " + str);
        ec.i.e(iVar, "fragment");
        ec.i.e(str, "previousFragmentId");
    }
}
