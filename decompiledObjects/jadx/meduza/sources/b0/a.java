package b0;

import android.graphics.Typeface;
import p2.m0;
import w.f;
import x.e;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f1665b;

    public a(m0 m0Var, Typeface typeface) {
        this.f1664a = m0Var;
        this.f1665b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var = this.f1664a;
        Typeface typeface = this.f1665b;
        f.e eVar = ((e.a) m0Var).E;
        if (eVar != null) {
            eVar.c(typeface);
        }
    }
}
