package b0;

import android.content.Context;
import b0.l;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h implements Callable<l.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1681d;

    public h(String str, Context context, g gVar, int i10) {
        this.f1678a = str;
        this.f1679b = context;
        this.f1680c = gVar;
        this.f1681d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final l.a call() {
        return l.a(this.f1678a, this.f1679b, this.f1680c, this.f1681d);
    }
}
