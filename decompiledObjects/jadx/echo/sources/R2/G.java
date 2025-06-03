package R2;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class G implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public Iterator f4675o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f4676p;

    public G(D d7) {
        Bundle bundle;
        this.f4676p = d7;
        bundle = d7.f4586o;
        this.f4675o = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4675o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f4675o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
