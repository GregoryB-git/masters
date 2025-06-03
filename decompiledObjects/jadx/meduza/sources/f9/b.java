package f9;

import j9.m;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public m f5483a;

    public b(m mVar) {
        this.f5483a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f5483a.equals(((b) obj).f5483a);
    }

    public final int hashCode() {
        return this.f5483a.hashCode();
    }
}
