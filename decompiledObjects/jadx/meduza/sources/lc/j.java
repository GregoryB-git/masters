package lc;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements kc.b<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f9847a;

    public j(CharSequence charSequence) {
        this.f9847a = charSequence;
    }

    @Override // kc.b
    public final Iterator<String> iterator() {
        return new c(this.f9847a);
    }
}
