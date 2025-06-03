package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import b1.a0;
import b1.k;
import b1.l;
import b1.o;
import b1.z;
import ec.i;
import java.util.List;
import sb.s;
import w1.a;
import w1.b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b<o> {
    @Override // w1.b
    public final List<Class<? extends b<?>>> a() {
        return s.f14324a;
    }

    @Override // w1.b
    public final o b(Context context) {
        i.e(context, "context");
        a c10 = a.c(context);
        i.d(c10, "getInstance(context)");
        if (!c10.f16187b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!l.f1756a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new l.a());
        }
        z zVar = z.f1802q;
        zVar.getClass();
        zVar.f1807e = new Handler();
        zVar.f.f(k.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(zVar));
        return zVar;
    }
}
