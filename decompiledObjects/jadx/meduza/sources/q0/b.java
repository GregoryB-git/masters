package q0;

import android.content.Context;
import ec.i;
import ec.j;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends j implements dc.a<File> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f13185b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.f13184a = context;
        this.f13185b = cVar;
    }

    @Override // dc.a
    public final File invoke() {
        Context context = this.f13184a;
        i.d(context, "applicationContext");
        String str = this.f13185b.f13186a;
        i.e(str, "name");
        String h10 = i.h(".preferences_pb", str);
        i.e(h10, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), i.h(h10, "datastore/"));
    }
}
