package e;

import android.content.Intent;
import b.j;
import ec.i;

/* loaded from: classes.dex */
public final class c extends a<Intent, d.a> {
    @Override // e.a
    public final Intent a(j jVar, Object obj) {
        Intent intent = (Intent) obj;
        i.e(jVar, "context");
        i.e(intent, "input");
        return intent;
    }

    @Override // e.a
    public final d.a c(int i10, Intent intent) {
        return new d.a(i10, intent);
    }
}
