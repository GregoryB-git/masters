package m6;

import android.content.Intent;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f10318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l6.g f10319b;

    public s(Intent intent, l6.g gVar) {
        this.f10318a = intent;
        this.f10319b = gVar;
    }

    @Override // m6.t
    public final void a() {
        Intent intent = this.f10318a;
        if (intent != null) {
            this.f10319b.startActivityForResult(intent, 2);
        }
    }
}
