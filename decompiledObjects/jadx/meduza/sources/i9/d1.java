package i9;

import android.database.Cursor;
import l9.c;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f7663b;

    public /* synthetic */ d1(h1 h1Var, int i10) {
        this.f7662a = i10;
        this.f7663b = h1Var;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7662a) {
            case 0:
                h1 h1Var = this.f7663b;
                Cursor cursor = (Cursor) obj;
                h1Var.getClass();
                int i10 = cursor.getInt(0);
                try {
                    h1Var.f7693a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{h1Var.f7694b.d(l9.c.X(cursor.getBlob(1))).f7734a.b(), Integer.valueOf(i10)});
                    return;
                } catch (ma.b0 unused) {
                    x6.b.T("Failed to decode Query data for target %s", Integer.valueOf(i10));
                    throw null;
                }
            default:
                h1 h1Var2 = this.f7663b;
                Cursor cursor2 = (Cursor) obj;
                h1Var2.getClass();
                int i11 = cursor2.getInt(0);
                try {
                    c.a a10 = l9.c.X(cursor2.getBlob(1)).a();
                    a10.m();
                    l9.c.J((l9.c) a10.f11120b);
                    h1Var2.f7693a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{a10.k().j(), Integer.valueOf(i11)});
                    return;
                } catch (ma.b0 unused2) {
                    x6.b.T("Failed to decode Query data for target %s", Integer.valueOf(i11));
                    throw null;
                }
        }
    }
}
