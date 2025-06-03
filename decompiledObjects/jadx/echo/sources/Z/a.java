package Z;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f7619f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static a f7620g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7621a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7622b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7623c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7624d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7625e;

    /* renamed from: Z.a$a, reason: collision with other inner class name */
    public class HandlerC0133a extends Handler {
        public HandlerC0133a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f7627a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f7628b;

        public b(Intent intent, ArrayList arrayList) {
            this.f7627a = intent;
            this.f7628b = arrayList;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f7629a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f7630b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7631c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7632d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f7629a = intentFilter;
            this.f7630b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f7630b);
            sb.append(" filter=");
            sb.append(this.f7629a);
            if (this.f7632d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f7621a = context;
        this.f7625e = new HandlerC0133a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f7619f) {
            try {
                if (f7620g == null) {
                    f7620g = new a(context.getApplicationContext());
                }
                aVar = f7620g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f7622b) {
                try {
                    size = this.f7624d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f7624d.toArray(bVarArr);
                    this.f7624d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = bVarArr[i7];
                int size2 = bVar.f7628b.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    c cVar = (c) bVar.f7628b.get(i8);
                    if (!cVar.f7632d) {
                        cVar.f7630b.onReceive(this.f7621a, bVar.f7627a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f7622b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f7622b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f7622b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i7 = 0; i7 < intentFilter.countActions(); i7++) {
                    String action = intentFilter.getAction(i7);
                    ArrayList arrayList2 = (ArrayList) this.f7623c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f7623c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        int i7;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        synchronized (this.f7622b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7621a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z7 = (intent.getFlags() & 8) != 0;
                if (z7) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f7623c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z7) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i8 = 0;
                    while (i8 < arrayList3.size()) {
                        c cVar = (c) arrayList3.get(i8);
                        if (z7) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f7629a);
                        }
                        if (cVar.f7631c) {
                            if (z7) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            i7 = i8;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i7 = i8;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = cVar.f7629a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z7) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f7631c = true;
                                i8 = i7 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z7) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i8 = i7 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                            ((c) arrayList5.get(i9)).f7631c = false;
                        }
                        this.f7624d.add(new b(intent, arrayList5));
                        if (!this.f7625e.hasMessages(1)) {
                            this.f7625e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f7622b) {
            try {
                ArrayList arrayList = (ArrayList) this.f7622b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f7632d = true;
                    for (int i7 = 0; i7 < cVar.f7629a.countActions(); i7++) {
                        String action = cVar.f7629a.getAction(i7);
                        ArrayList arrayList2 = (ArrayList) this.f7623c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f7630b == broadcastReceiver) {
                                    cVar2.f7632d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f7623c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
