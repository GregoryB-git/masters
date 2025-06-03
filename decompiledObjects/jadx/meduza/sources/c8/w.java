package c8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import f1.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static w f2530c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2531a = false;

    /* renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f2532b;

    public static b8.c1 a(Intent intent) {
        m6.j.i(intent);
        return b8.c1.H(((zzaic) n6.d.a(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzaic.CREATOR)).zzc(true));
    }

    public static void c(Context context) {
        w wVar = f2530c;
        wVar.f2531a = false;
        if (wVar.f2532b != null) {
            f1.a a10 = f1.a.a(context);
            BroadcastReceiver broadcastReceiver = f2530c.f2532b;
            synchronized (a10.f5290b) {
                ArrayList<a.c> remove = a10.f5290b.remove(broadcastReceiver);
                if (remove != null) {
                    for (int size = remove.size() - 1; size >= 0; size--) {
                        a.c cVar = remove.get(size);
                        cVar.f5300d = true;
                        for (int i10 = 0; i10 < cVar.f5297a.countActions(); i10++) {
                            String action = cVar.f5297a.getAction(i10);
                            ArrayList<a.c> arrayList = a10.f5291c.get(action);
                            if (arrayList != null) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    a.c cVar2 = arrayList.get(size2);
                                    if (cVar2.f5298b == broadcastReceiver) {
                                        cVar2.f5300d = true;
                                        arrayList.remove(size2);
                                    }
                                }
                                if (arrayList.size() <= 0) {
                                    a10.f5291c.remove(action);
                                }
                            }
                        }
                    }
                }
            }
        }
        f2530c.f2532b = null;
    }

    public final void b(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f2532b = broadcastReceiver;
        f1.a a10 = f1.a.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (a10.f5290b) {
            a.c cVar = new a.c(broadcastReceiver, intentFilter);
            ArrayList<a.c> arrayList = a10.f5290b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                a10.f5290b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<a.c> arrayList2 = a10.f5291c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    a10.f5291c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }
}
