package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import o2.j;
import o2.p;
import p2.k0;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements w1.b<p> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1431a = j.f("WrkMgrInitializer");

    @Override // w1.b
    public final List<Class<? extends w1.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // w1.b
    public final p b(Context context) {
        j.d().a(f1431a, "Initializing WorkManager with default configuration.");
        k0.f(context, new a(new a.C0023a()));
        return k0.d(context);
    }
}
