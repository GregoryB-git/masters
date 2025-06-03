package i9;

import android.database.Cursor;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7796b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f7795a = i10;
        this.f7796b = obj;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7795a) {
            case 0:
                long[] jArr = (long[]) this.f7796b;
                jArr[0] = jArr[0] + 1;
                break;
            case 1:
                ((Set) this.f7796b).add(((Cursor) obj).getString(0));
                break;
            case 2:
                ((n9.d) this.f7796b).accept(p2.m0.x(((Cursor) obj).getString(0)).s());
                break;
            default:
                j1 j1Var = (j1) this.f7796b;
                Cursor cursor = (Cursor) obj;
                j1Var.getClass();
                j1Var.f7712c = cursor.getInt(0);
                j1Var.f7713d = cursor.getInt(1);
                j1Var.f7714e = new j9.q(new u7.m(cursor.getInt(3), cursor.getLong(2)));
                j1Var.f = cursor.getLong(4);
                break;
        }
    }
}
