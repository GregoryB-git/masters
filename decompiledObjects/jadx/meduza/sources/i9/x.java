package i9;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements Iterator<j9.g> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f7839a;

    public x(Iterator it) {
        this.f7839a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7839a.hasNext();
    }

    @Override // java.util.Iterator
    public final j9.g next() {
        return (j9.g) ((Map.Entry) this.f7839a.next()).getValue();
    }
}
