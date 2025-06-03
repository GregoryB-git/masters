/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Set
 */
package Z;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
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

public final class a {
    public static final Object f = new Object();
    public static a g;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Handler e;

    public a(Context context) {
        this.a = context;
        this.e = new Handler(context.getMainLooper()){

            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                a.this.a();
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b(Context object) {
        Object object2 = f;
        synchronized (object2) {
            try {
                if (g != null) return g;
                g = new a(object.getApplicationContext());
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a() {
        block4 : do {
            Object object = this.b;
            // MONITORENTER : object
            int n8 = this.d.size();
            if (n8 <= 0) {
                // MONITOREXIT : object
                return;
            }
            Object[] arrobject = new b[n8];
            this.d.toArray(arrobject);
            this.d.clear();
            // MONITOREXIT : object
            int n9 = 0;
            do {
                if (n9 >= n8) continue block4;
                object = arrobject[n9];
                int n10 = object.b.size();
                for (int i8 = 0; i8 < n10; ++i8) {
                    c c8 = (c)object.b.get(i8);
                    if (c8.d) continue;
                    c8.b.onReceive(this.a, object.a);
                }
                ++n9;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            try {
                c c8 = new c(intentFilter, broadcastReceiver);
                Object object = (ArrayList)this.b.get((Object)broadcastReceiver);
                ArrayList arrayList = object;
                if (object == null) {
                    arrayList = new ArrayList(1);
                    this.b.put((Object)broadcastReceiver, (Object)arrayList);
                }
                arrayList.add((Object)c8);
                for (int i8 = 0; i8 < intentFilter.countActions(); ++i8) {
                    object = intentFilter.getAction(i8);
                    arrayList = (ArrayList)this.c.get(object);
                    broadcastReceiver = arrayList;
                    if (arrayList == null) {
                        broadcastReceiver = new ArrayList(1);
                        this.c.put(object, (Object)broadcastReceiver);
                    }
                    broadcastReceiver.add((Object)c8);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d(Intent intent) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            Set set;
            String string2;
            String string3;
            Uri uri;
            String string4;
            ArrayList arrayList;
            int n8;
            Object object;
            block15 : {
                try {
                    string4 = intent.getAction();
                    string3 = intent.resolveTypeIfNeeded(this.a.getContentResolver());
                    uri = intent.getData();
                    string2 = intent.getScheme();
                    set = intent.getCategories();
                    n8 = (intent.getFlags() & 8) != 0 ? 1 : 0;
                    if (n8 != 0) {
                        object = new StringBuilder();
                        object.append("Resolving type ");
                        object.append(string3);
                        object.append(" scheme ");
                        object.append(string2);
                        object.append(" of intent ");
                        object.append((Object)intent);
                        Log.v((String)"LocalBroadcastManager", (String)object.toString());
                    }
                    if ((arrayList = (ArrayList)this.c.get((Object)intent.getAction())) == null) return false;
                    if (n8 != 0) {
                        object = new StringBuilder();
                        object.append("Action list: ");
                        object.append((Object)arrayList);
                        Log.v((String)"LocalBroadcastManager", (String)object.toString());
                    }
                    break block15;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            StringBuilder stringBuilder = null;
            int n9 = 0;
            while (n9 < arrayList.size()) {
                c c8 = (c)arrayList.get(n9);
                if (n8 != 0) {
                    object = new StringBuilder();
                    object.append("Matching against filter ");
                    object.append((Object)c8.a);
                    Log.v((String)"LocalBroadcastManager", (String)object.toString());
                }
                if (c8.c) {
                    if (n8 != 0) {
                        Log.v((String)"LocalBroadcastManager", (String)"  Filter's target already added");
                    }
                } else {
                    IntentFilter intentFilter = c8.a;
                    object = stringBuilder;
                    int n10 = intentFilter.match(string4, string3, string2, uri, set, "LocalBroadcastManager");
                    if (n10 >= 0) {
                        if (n8 != 0) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("  Filter matched!  match=0x");
                            stringBuilder.append(Integer.toHexString((int)n10));
                            Log.v((String)"LocalBroadcastManager", (String)stringBuilder.toString());
                        }
                        stringBuilder = object == null ? new ArrayList() : object;
                        stringBuilder.add((Object)c8);
                        c8.c = true;
                    } else if (n8 != 0) {
                        object = n10 != -4 ? (n10 != -3 ? (n10 != -2 ? (n10 != -1 ? "unknown reason" : "type") : "data") : "action") : "category";
                        c8 = new StringBuilder();
                        c8.append("  Filter did not match: ");
                        c8.append((String)object);
                        Log.v((String)"LocalBroadcastManager", (String)c8.toString());
                    }
                }
                ++n9;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(BroadcastReceiver broadcastReceiver) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            int n8;
            ArrayList arrayList;
            block11 : {
                try {
                    arrayList = (ArrayList)this.b.remove((Object)broadcastReceiver);
                    if (arrayList == null) {
                        return;
                    }
                    n8 = arrayList.size() - 1;
                    break block11;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            block3 : while (n8 >= 0) {
                c c8 = (c)arrayList.get(n8);
                c8.d = true;
                int n9 = 0;
                do {
                    block13 : {
                        ArrayList arrayList2;
                        String string2;
                        block14 : {
                            block12 : {
                                if (n9 >= c8.a.countActions()) break block12;
                                string2 = c8.a.getAction(n9);
                                arrayList2 = (ArrayList)this.c.get((Object)string2);
                                if (arrayList2 == null) break block13;
                                break block14;
                            }
                            --n8;
                            continue block3;
                        }
                        int n10 = arrayList2.size() - 1;
                        do {
                            if (n10 >= 0) {
                                c c9 = (c)arrayList2.get(n10);
                                if (c9.b == broadcastReceiver) {
                                    c9.d = true;
                                    arrayList2.remove(n10);
                                }
                            } else {
                                if (arrayList2.size() > 0) break;
                                this.c.remove((Object)string2);
                                break;
                            }
                            --n10;
                        } while (true);
                    }
                    ++n9;
                } while (true);
                break;
            }
            return;
        }
    }

    public static final class b {
        public final Intent a;
        public final ArrayList b;

        public b(Intent intent, ArrayList arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    public static final class c {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("Receiver{");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(" filter=");
            stringBuilder.append((Object)this.a);
            if (this.d) {
                stringBuilder.append(" DEAD");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

}

