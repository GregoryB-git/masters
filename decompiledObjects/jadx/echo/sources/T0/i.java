package T0;

import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;

/* loaded from: classes.dex */
public abstract class i implements C1201x.b {

    /* renamed from: o, reason: collision with root package name */
    public final String f6042o;

    public i(String str) {
        this.f6042o = str;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ void D(C1200w.b bVar) {
        AbstractC1202y.c(this, bVar);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ byte[] M() {
        return AbstractC1202y.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return this.f6042o;
    }
}
