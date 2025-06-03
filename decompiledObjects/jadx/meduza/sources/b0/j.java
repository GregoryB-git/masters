package b0;

import android.content.Context;
import b0.l;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j implements Callable<l.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1686d;

    public j(String str, Context context, g gVar, int i10) {
        this.f1683a = str;
        this.f1684b = context;
        this.f1685c = gVar;
        this.f1686d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final l.a call() {
        try {
            return l.a(this.f1683a, this.f1684b, this.f1685c, this.f1686d);
        } catch (Throwable unused) {
            return new l.a(-3);
        }
    }
}
