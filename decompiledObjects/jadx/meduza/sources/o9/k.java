package o9;

import android.content.Context;
import java.util.concurrent.Executor;
import k3.y;
import o9.i;

/* loaded from: classes.dex */
public final class k implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final y f12122a;

    public k(y yVar) {
        this.f12122a = yVar;
    }

    @Override // o9.i.a
    public final e a(String str) {
        y yVar = this.f12122a;
        return new e((Context) yVar.f8927b.get(), (String) yVar.f8928c.get(), str, (a) yVar.f8929d.get(), (Executor) yVar.f8930e.get(), (Executor) yVar.f.get());
    }
}
