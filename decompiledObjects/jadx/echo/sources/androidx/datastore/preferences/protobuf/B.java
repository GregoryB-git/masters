package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class B implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public Iterator f8887o;

    public B(Iterator it) {
        this.f8887o = it;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f8887o.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8887o.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f8887o.remove();
    }
}
