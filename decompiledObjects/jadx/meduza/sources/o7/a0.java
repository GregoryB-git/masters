package o7;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a0 extends x0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11937b;

    public a0(Object obj) {
        this.f11937b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f11936a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11936a) {
            throw new NoSuchElementException();
        }
        this.f11936a = true;
        return this.f11937b;
    }
}
