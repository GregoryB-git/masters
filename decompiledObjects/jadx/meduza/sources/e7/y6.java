package e7;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class y6 extends h6 {

    /* renamed from: e, reason: collision with root package name */
    public String f4787e;
    public HashSet f;

    /* renamed from: o, reason: collision with root package name */
    public r.b f4788o;

    /* renamed from: p, reason: collision with root package name */
    public Long f4789p;

    /* renamed from: q, reason: collision with root package name */
    public Long f4790q;

    public y6(i6 i6Var) {
        super(i6Var);
    }

    @Override // e7.h6
    public final boolean r() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a7 s(Integer num) {
        if (this.f4788o.containsKey(num)) {
            return (a7) this.f4788o.getOrDefault(num, null);
        }
        a7 a7Var = new a7(this, this.f4787e);
        this.f4788o.put(num, a7Var);
        return a7Var;
    }
}
