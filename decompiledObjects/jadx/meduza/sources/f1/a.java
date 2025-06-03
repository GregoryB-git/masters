package f1;

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

@Deprecated
/* loaded from: classes.dex */
public final class a {
    public static final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static a f5288g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5289a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f5290b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f5291c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f5292d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final HandlerC0078a f5293e;

    /* renamed from: f1.a$a, reason: collision with other inner class name */
    public class HandlerC0078a extends Handler {
        public HandlerC0078a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f5290b) {
                    size = aVar.f5292d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    aVar.f5292d.toArray(bVarArr);
                    aVar.f5292d.clear();
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f5296b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f5296b.get(i11);
                        if (!cVar.f5300d) {
                            cVar.f5298b.onReceive(aVar.f5289a, bVar.f5295a);
                        }
                    }
                }
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f5295a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f5296b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f5295a = intent;
            this.f5296b = arrayList;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f5297a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f5298b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5299c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5300d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f5297a = intentFilter;
            this.f5298b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f5298b);
            sb2.append(" filter=");
            sb2.append(this.f5297a);
            if (this.f5300d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f5289a = context;
        this.f5293e = new HandlerC0078a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f) {
            if (f5288g == null) {
                f5288g = new a(context.getApplicationContext());
            }
            aVar = f5288g;
        }
        return aVar;
    }

    public final boolean b(Intent intent) {
        boolean z10;
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f5290b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f5289a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z11 = (intent.getFlags() & 8) != 0;
            if (z11) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f5291c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z11) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z11) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f5297a);
                    }
                    if (cVar.f5299c) {
                        if (z11) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f5297a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z11) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f5299c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z11) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                z10 = false;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f5299c = false;
                    }
                    this.f5292d.add(new b(intent, arrayList5));
                    if (!this.f5293e.hasMessages(1)) {
                        this.f5293e.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z10 = false;
            }
            return z10;
        }
    }
}
