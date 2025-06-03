package i9;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7764b;

    public /* synthetic */ o0(int i10, ArrayList arrayList) {
        this.f7763a = i10;
        this.f7764b = arrayList;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7763a) {
            case 0:
                this.f7764b.add(new j9.i(j9.o.t(((Cursor) obj).getString(0))));
                break;
            default:
                this.f7764b.add(p2.m0.x(((Cursor) obj).getString(0)));
                break;
        }
    }
}
