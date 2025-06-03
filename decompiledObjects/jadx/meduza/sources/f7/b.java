package f7;

import android.content.Context;
import android.os.AsyncTask;
import f7.a;
import j6.g;
import j6.h;
import o9.d;

/* loaded from: classes.dex */
public final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0083a f5475b;

    public b(Context context, d dVar) {
        this.f5474a = context;
        this.f5475b = dVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i10;
        try {
            a.a(this.f5474a);
            i10 = 0;
        } catch (g e10) {
            i10 = e10.f8492a;
        } catch (h e11) {
            i10 = e11.f8498b;
        }
        return Integer.valueOf(i10);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f5475b.a();
            return;
        }
        a.f5470a.a(this.f5474a, "pi", num.intValue());
        a.InterfaceC0083a interfaceC0083a = this.f5475b;
        num.intValue();
        interfaceC0083a.b();
    }
}
