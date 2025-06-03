package com.google.firebase.iid;

import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import t.C1958a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f11590a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11591b = new C1958a();

    /* renamed from: com.google.firebase.iid.a$a, reason: collision with other inner class name */
    public interface InterfaceC0175a {
        AbstractC0659j start();
    }

    public a(Executor executor) {
        this.f11590a = executor;
    }

    public synchronized AbstractC0659j a(String str, String str2, InterfaceC0175a interfaceC0175a) {
        final Pair pair = new Pair(str, str2);
        AbstractC0659j abstractC0659j = (AbstractC0659j) this.f11591b.get(pair);
        if (abstractC0659j != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return abstractC0659j;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        AbstractC0659j h7 = interfaceC0175a.start().h(this.f11590a, new InterfaceC0651b(this, pair) { // from class: p4.r

            /* renamed from: a, reason: collision with root package name */
            public final com.google.firebase.iid.a f18463a;

            /* renamed from: b, reason: collision with root package name */
            public final Pair f18464b;

            {
                this.f18463a = this;
                this.f18464b = pair;
            }

            @Override // V2.InterfaceC0651b
            public Object a(AbstractC0659j abstractC0659j2) {
                this.f18463a.b(this.f18464b, abstractC0659j2);
                return abstractC0659j2;
            }
        });
        this.f11591b.put(pair, h7);
        return h7;
    }

    public final /* synthetic */ AbstractC0659j b(Pair pair, AbstractC0659j abstractC0659j) {
        synchronized (this) {
            this.f11591b.remove(pair);
        }
        return abstractC0659j;
    }
}
