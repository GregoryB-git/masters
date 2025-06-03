package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.d f648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItem f649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f650c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.c f651d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f651d = cVar;
        this.f648a = dVar;
        this.f649b = hVar;
        this.f650c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f648a;
        if (dVar != null) {
            b.this.I = true;
            dVar.f646b.c(false);
            b.this.I = false;
        }
        if (this.f649b.isEnabled() && this.f649b.hasSubMenu()) {
            this.f650c.q(this.f649b, null, 4);
        }
    }
}
