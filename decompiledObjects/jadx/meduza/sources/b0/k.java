package b0;

import b0.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements d0.a<l.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1687a;

    public k(String str) {
        this.f1687a = str;
    }

    @Override // d0.a
    public final void accept(l.a aVar) {
        l.a aVar2 = aVar;
        synchronized (l.f1690c) {
            r.h<String, ArrayList<d0.a<l.a>>> hVar = l.f1691d;
            ArrayList<d0.a<l.a>> orDefault = hVar.getOrDefault(this.f1687a, null);
            if (orDefault == null) {
                return;
            }
            hVar.remove(this.f1687a);
            for (int i10 = 0; i10 < orDefault.size(); i10++) {
                orDefault.get(i10).accept(aVar2);
            }
        }
    }
}
