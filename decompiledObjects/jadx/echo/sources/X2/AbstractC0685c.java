package X2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0685c extends AbstractC0686d implements D {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractC0685c(Map map) {
        super(map);
    }

    @Override // X2.AbstractC0688f, X2.H
    public Map a() {
        return super.a();
    }

    @Override // X2.AbstractC0688f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // X2.AbstractC0686d, X2.H
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // X2.AbstractC0686d
    public Collection w(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // X2.AbstractC0686d
    public Collection x(Object obj, Collection collection) {
        return y(obj, (List) collection, null);
    }
}
