package w4;

import p4.a;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public abstract class b implements a.b {
    @Override // p4.a.b
    public final /* synthetic */ byte[] B() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SCTE-35 splice command: type=");
        l10.append(getClass().getSimpleName());
        return l10.toString();
    }
}
