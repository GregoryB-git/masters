package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.l0;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1119i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = AbstractC1125o.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    public class a implements l0.a {
        public a() {
        }

        @Override // com.google.firebase.messaging.l0.a
        public AbstractC0659j a(Intent intent) {
            return AbstractServiceC1119i.this.f(intent);
        }
    }

    public final void c(Intent intent) {
        if (intent != null) {
            j0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i7 = this.runningTasks - 1;
                this.runningTasks = i7;
                if (i7 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void d(Intent intent, AbstractC0659j abstractC0659j) {
        c(intent);
    }

    public final /* synthetic */ void e(Intent intent, C0660k c0660k) {
        try {
            handleIntent(intent);
        } finally {
            c0660k.c(null);
        }
    }

    public final AbstractC0659j f(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return V2.m.e(null);
        }
        final C0660k c0660k = new C0660k();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC1119i.this.e(intent, c0660k);
            }
        });
        return c0660k.a();
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new l0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i7, int i8) {
        synchronized (this.lock) {
            this.lastStartId = i8;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        AbstractC0659j f7 = f(startCommandIntent);
        if (f7.m()) {
            c(intent);
            return 2;
        }
        f7.c(new r1.m(), new InterfaceC0654e() { // from class: com.google.firebase.messaging.g
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                AbstractServiceC1119i.this.d(intent, abstractC0659j);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i7) {
        return stopSelfResult(i7);
    }
}
