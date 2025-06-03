package s5;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import v3.f1;
import v5.h;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14173b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14172a = i10;
        this.f14173b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f14172a) {
            case 0:
                c cVar = (c) this.f14173b;
                cVar.getClass();
                int i10 = message.what;
                if (i10 == 0) {
                    f1 f1Var = cVar.f14188p;
                    if (f1Var != null) {
                        cVar.c(f1Var, null);
                    }
                } else if (i10 == 1) {
                    f1 f1Var2 = cVar.f14188p;
                    if (f1Var2 != null && cVar.f14189q && cVar.f14190r == message.arg1) {
                        cVar.c(f1Var2, (Bitmap) message.obj);
                    }
                }
                break;
            default:
                l lVar = (l) this.f14173b;
                Iterator it = lVar.f15916d.iterator();
                while (it.hasNext()) {
                    l.c cVar2 = (l.c) it.next();
                    l.b<T> bVar = lVar.f15915c;
                    if (!cVar2.f15924d && cVar2.f15923c) {
                        v5.h b10 = cVar2.f15922b.b();
                        cVar2.f15922b = new h.a();
                        cVar2.f15923c = false;
                        bVar.d(cVar2.f15921a, b10);
                    }
                    if (lVar.f15914b.a()) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
