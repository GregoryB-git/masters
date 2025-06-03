package r3;

import android.database.Cursor;
import n3.c;
import r3.t;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f13574b;

    public /* synthetic */ p(t tVar, int i10) {
        this.f13573a = i10;
        this.f13574b = tVar;
    }

    @Override // r3.t.a
    public final Object apply(Object obj) {
        switch (this.f13573a) {
            case 0:
                t tVar = this.f13574b;
                Cursor cursor = (Cursor) obj;
                tVar.getClass();
                while (cursor.moveToNext()) {
                    tVar.C(cursor.getInt(0), c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                break;
            default:
                t tVar2 = this.f13574b;
                Cursor cursor2 = (Cursor) obj;
                tVar2.getClass();
                while (cursor2.moveToNext()) {
                    tVar2.C(cursor2.getInt(0), c.a.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                break;
        }
        return null;
    }
}
