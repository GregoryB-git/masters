package i9;

import android.database.Cursor;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7721d;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f7718a = i10;
        this.f7719b = obj;
        this.f7720c = obj2;
        this.f7721d = obj3;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7718a) {
            case 0:
                ((m0) this.f7719b).h((n9.c) this.f7720c, (Map) this.f7721d, (Cursor) obj);
                break;
            case 1:
                w0 w0Var = (w0) this.f7719b;
                Set set = (Set) this.f7720c;
                List list = (List) this.f7721d;
                Cursor cursor = (Cursor) obj;
                w0Var.getClass();
                int i10 = cursor.getInt(0);
                if (!set.contains(Integer.valueOf(i10))) {
                    set.add(Integer.valueOf(i10));
                    list.add(w0Var.l(cursor.getBlob(1), i10));
                    break;
                }
                break;
            default:
                ((b1) this.f7719b).i((n9.c) this.f7720c, (Map) this.f7721d, (Cursor) obj, null);
                break;
        }
    }
}
