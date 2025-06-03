package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f9932a;

    /* renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f9933b = new SavedStateRegistry();

    public b(c cVar) {
        this.f9932a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.f9933b;
    }

    public void c(Bundle bundle) {
        androidx.lifecycle.d g7 = this.f9932a.g();
        if (g7.b() != d.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        g7.a(new Recreator(this.f9932a));
        this.f9933b.b(g7, bundle);
    }

    public void d(Bundle bundle) {
        this.f9933b.c(bundle);
    }
}
