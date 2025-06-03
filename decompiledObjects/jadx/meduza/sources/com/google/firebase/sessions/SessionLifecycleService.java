package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import ea.e0;
import ea.v;
import ea.x;
import ec.i;
import java.util.ArrayList;
import u7.f;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f3254a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name */
    public a f3255b;

    /* renamed from: c, reason: collision with root package name */
    public Messenger f3256c;

    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3257a;

        /* renamed from: b, reason: collision with root package name */
        public long f3258b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<Messenger> f3259c;

        public a(Looper looper) {
            super(looper);
            this.f3259c = new ArrayList<>();
        }

        public final void a(Messenger messenger) {
            String a10;
            if (this.f3257a) {
                Object c10 = f.e().c(e0.class);
                i.d(c10, "Firebase.app[SessionGenerator::class.java]");
                x xVar = ((e0) c10).f4904e;
                if (xVar == null) {
                    i.i("currentSession");
                    throw null;
                }
                a10 = xVar.f5003a;
            } else {
                Object c11 = f.e().c(v.class);
                i.d(c11, "Firebase.app[SessionDatastore::class.java]");
                a10 = ((v) c11).a();
                Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
                if (a10 == null) {
                    return;
                }
            }
            b(messenger, a10);
        }

        public final void b(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f3259c.remove(messenger);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x011b, code lost:
        
            if ((((r9 > 0 ? 1 : (r9 == 0 ? 0 : -1)) > 0) && (mc.a.f(r9) ^ true)) != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x013d, code lost:
        
            if ((((r9 > 0 ? 1 : (r9 == 0 ? 0 : -1)) > 0) && (mc.a.f(r9) ^ true)) != false) goto L45;
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r13) {
            /*
                Method dump skipped, instructions count: 554
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleService.a.handleMessage(android.os.Message):void");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        StringBuilder l10 = defpackage.f.l("Service bound to new client on process ");
        l10.append(intent.getAction());
        Log.d("SessionLifecycleService", l10.toString());
        Messenger messenger = (Messenger) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : intent.getParcelableExtra("ClientCallbackMessenger"));
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            a aVar = this.f3255b;
            if (aVar != null) {
                aVar.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f3256c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f3254a.start();
        Looper looper = this.f3254a.getLooper();
        i.d(looper, "handlerThread.looper");
        this.f3255b = new a(looper);
        this.f3256c = new Messenger(this.f3255b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3254a.quit();
    }
}
