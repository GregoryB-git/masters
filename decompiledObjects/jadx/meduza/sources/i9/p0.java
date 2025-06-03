package i9;

import android.database.Cursor;
import j9.k;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7766b;

    public /* synthetic */ p0(Object obj, int i10) {
        this.f7765a = i10;
        this.f7766b = obj;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7765a) {
            case 0:
                ((ArrayList) this.f7766b).add(p2.m0.x(((Cursor) obj).getString(0)));
                return;
            case 1:
                Map map = (Map) this.f7766b;
                Cursor cursor = (Cursor) obj;
                int i10 = cursor.getInt(0);
                long j10 = cursor.getLong(1);
                j9.q qVar = new j9.q(new u7.m(cursor.getInt(3), cursor.getLong(2)));
                j9.i iVar = new j9.i(p2.m0.x(cursor.getString(4)));
                int i11 = cursor.getInt(5);
                Integer valueOf = Integer.valueOf(i10);
                j9.b bVar = k.a.f8689a;
                map.put(valueOf, new j9.c(j10, new j9.b(qVar, iVar, i11)));
                return;
            case 2:
                w0 w0Var = (w0) this.f7766b;
                w0Var.f7838e = Math.max(w0Var.f7838e, ((Cursor) obj).getInt(0));
                return;
            default:
                Boolean[] boolArr = (Boolean[]) this.f7766b;
                Cursor cursor2 = (Cursor) obj;
                try {
                    int i12 = e9.a.f4846a;
                    if ("BUILD_OVERLAYS".equals(cursor2.getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e10) {
                    x6.b.T("SQLitePersistence.DataMigration failed to parse: %s", e10);
                    throw null;
                }
        }
    }
}
