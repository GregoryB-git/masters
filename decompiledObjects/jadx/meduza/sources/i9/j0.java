package i9;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f7707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9.c f7708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f7709d;

    public /* synthetic */ j0(m0 m0Var, n9.c cVar, HashMap hashMap, int i10) {
        this.f7706a = i10;
        this.f7707b = m0Var;
        this.f7708c = cVar;
        this.f7709d = hashMap;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7706a) {
            case 0:
                this.f7707b.h(this.f7708c, this.f7709d, (Cursor) obj);
                break;
            default:
                this.f7707b.h(this.f7708c, this.f7709d, (Cursor) obj);
                break;
        }
    }
}
