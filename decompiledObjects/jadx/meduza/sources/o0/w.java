package o0;

import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class w extends ec.j implements dc.a<File> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q<Object> f11682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q<Object> qVar) {
        super(0);
        this.f11682a = qVar;
    }

    @Override // dc.a
    public final File invoke() {
        File invoke = this.f11682a.f11617a.invoke();
        String absolutePath = invoke.getAbsolutePath();
        synchronized (q.f11616l) {
            LinkedHashSet linkedHashSet = q.f11615k;
            if (!(!linkedHashSet.contains(absolutePath))) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + invoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            ec.i.d(absolutePath, "it");
            linkedHashSet.add(absolutePath);
        }
        return invoke;
    }
}
