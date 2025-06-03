package i9;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7794d;

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, int i10) {
        this.f7791a = i10;
        this.f7792b = obj;
        this.f7793c = obj2;
        this.f7794d = obj3;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7791a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((SortedSet) this.f7792b).add(new h9.a(((j9.k) this.f7793c).d(), (j9.i) this.f7794d, cursor.getBlob(0), cursor.getBlob(1)));
                break;
            default:
                j1 j1Var = (j1) this.f7792b;
                SparseArray sparseArray = (SparseArray) this.f7793c;
                int[] iArr = (int[]) this.f7794d;
                j1Var.getClass();
                int i10 = ((Cursor) obj).getInt(0);
                if (sparseArray.get(i10) == null) {
                    j1Var.i(i10);
                    j1Var.f7710a.G("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i10));
                    j1Var.f--;
                    iArr[0] = iArr[0] + 1;
                    break;
                }
                break;
        }
    }
}
