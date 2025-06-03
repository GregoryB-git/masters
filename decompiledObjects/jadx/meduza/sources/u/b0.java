package u;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0 implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f14786a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final Context f14787b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public b0(Context context) {
        this.f14787b = context;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f14786a.iterator();
    }
}
