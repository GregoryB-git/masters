package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import c9.b;
import c9.d;
import ca.e;
import com.google.android.gms.internal.measurement.zzed;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.k;
import eb.y;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import m6.j;
import u7.f;
import w7.a;

/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        f fVar = (f) cVar.get(f.class);
        Context context = (Context) cVar.get(Context.class);
        d dVar = (d) cVar.get(d.class);
        j.i(fVar);
        j.i(context);
        j.i(dVar);
        j.i(context.getApplicationContext());
        if (w7.c.f16438c == null) {
            synchronized (w7.c.class) {
                if (w7.c.f16438c == null) {
                    Bundle bundle = new Bundle(1);
                    fVar.a();
                    if ("[DEFAULT]".equals(fVar.f15085b)) {
                        dVar.d(new Executor() { // from class: w7.e
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new b() { // from class: w7.d
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // c9.b
                            public final void a(c9.a aVar) {
                                boolean z10 = ((u7.b) aVar.f2549b).f15077a;
                                synchronized (c.class) {
                                    c cVar2 = c.f16438c;
                                    j.i(cVar2);
                                    cVar2.f16439a.f3580a.zza(z10);
                                }
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", fVar.k());
                    }
                    w7.c.f16438c = new w7.c(zzed.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return w7.c.f16438c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        b.a b10 = d8.b.b(a.class);
        b10.a(k.d(f.class));
        b10.a(k.d(Context.class));
        b10.a(k.d(d.class));
        b10.f = new y();
        b10.c(2);
        return Arrays.asList(b10.b(), e.a("fire-analytics", "22.2.0"));
    }
}
