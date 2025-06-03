package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import t.C1958a;

/* loaded from: classes.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f11691a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11692b = new C1958a();

    public interface a {
        AbstractC0659j start();
    }

    public W(Executor executor) {
        this.f11691a = executor;
    }

    public synchronized AbstractC0659j b(final String str, a aVar) {
        AbstractC0659j abstractC0659j = (AbstractC0659j) this.f11692b.get(str);
        if (abstractC0659j != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC0659j;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC0659j h7 = aVar.start().h(this.f11691a, new InterfaceC0651b() { // from class: com.google.firebase.messaging.V
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j2) {
                AbstractC0659j c7;
                c7 = W.this.c(str, abstractC0659j2);
                return c7;
            }
        });
        this.f11692b.put(str, h7);
        return h7;
    }

    public final /* synthetic */ AbstractC0659j c(String str, AbstractC0659j abstractC0659j) {
        synchronized (this) {
            this.f11692b.remove(str);
        }
        return abstractC0659j;
    }
}
