package ea;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ub.h f4929a;

    /* renamed from: b, reason: collision with root package name */
    public Messenger f4930b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque<Message> f4931c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4932d;

    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final ub.h f4933a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ub.h hVar) {
            super(Looper.getMainLooper());
            ec.i.e(hVar, "backgroundDispatcher");
            this.f4933a = hVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            ec.i.e(message, "msg");
            if (message.what != 3) {
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                str = "";
            }
            Log.d("SessionLifecycleClient", "Session update received.");
            x6.b.g0(nc.e0.a(this.f4933a), null, new g0(str, null), 3);
        }
    }

    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringBuilder l10 = defpackage.f.l("Connected to SessionLifecycleService. Queue size ");
            l10.append(h0.this.f4931c.size());
            Log.d("SessionLifecycleClient", l10.toString());
            h0.this.f4930b = new Messenger(iBinder);
            h0.this.getClass();
            h0 h0Var = h0.this;
            h0Var.getClass();
            ArrayList arrayList = new ArrayList();
            h0Var.f4931c.drainTo(arrayList);
            x6.b.g0(nc.e0.a(h0Var.f4929a), null, new i0(h0Var, arrayList, null), 3);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            h0 h0Var = h0.this;
            h0Var.f4930b = null;
            h0Var.getClass();
        }
    }

    public h0(ub.h hVar) {
        ec.i.e(hVar, "backgroundDispatcher");
        this.f4929a = hVar;
        this.f4931c = new LinkedBlockingDeque<>(20);
        this.f4932d = new b();
    }

    public static final Message a(h0 h0Var, List list, int i10) {
        Object obj;
        h0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void b(int i10) {
        ArrayList arrayList = new ArrayList();
        this.f4931c.drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        ec.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        x6.b.g0(nc.e0.a(this.f4929a), null, new i0(this, arrayList, null), 3);
    }
}
