package r0;

import ec.i;
import ec.j;
import java.io.File;
import lc.k;

/* loaded from: classes.dex */
public final class c extends j implements dc.a<File> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc.a<File> f13512a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q0.b bVar) {
        super(0);
        this.f13512a = bVar;
    }

    @Override // dc.a
    public final File invoke() {
        File invoke = this.f13512a.invoke();
        i.e(invoke, "<this>");
        String name = invoke.getName();
        i.d(name, "getName(...)");
        if (i.a(k.A0(name, ""), "preferences_pb")) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
