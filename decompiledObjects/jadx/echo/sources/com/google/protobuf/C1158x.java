package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1158x implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public Iterator f12271o;

    public C1158x(Iterator it) {
        this.f12271o = it;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f12271o.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12271o.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f12271o.remove();
    }
}
