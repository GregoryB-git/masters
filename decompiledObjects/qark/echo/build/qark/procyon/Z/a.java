// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z;

import java.io.Serializable;
import java.util.Set;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.Context;

public final class a
{
    public static final Object f;
    public static a g;
    public final Context a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final Handler e;
    
    static {
        f = new Object();
    }
    
    public a(final Context a) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.a = a;
        this.e = new Handler(a.getMainLooper()) {
            public void handleMessage(final Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                Z.a.this.a();
            }
        };
    }
    
    public static a b(final Context context) {
        final Object f = a.f;
        // monitorenter(f)
        while (true) {
            try {
                if (a.g == null) {
                    a.g = new a(context.getApplicationContext());
                }
                // monitorexit(f)
                return a.g;
                // monitorexit(f)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void a() {
    Label_0135_Outer:
        while (true) {
            Object b = this.b;
            // monitorenter(b)
            while (true) {
                try {
                    final int size = this.d.size();
                    if (size <= 0) {
                        // monitorexit(b)
                        return;
                    }
                    final b[] a = new b[size];
                    this.d.toArray(a);
                    this.d.clear();
                    // monitorexit(b)
                    for (int i = 0; i < size; ++i) {
                        b = a[i];
                        for (int size2 = ((b)b).b.size(), j = 0; j < size2; ++j) {
                            final c c = ((b)b).b.get(j);
                            if (!c.d) {
                                c.b.onReceive(this.a, ((b)b).a);
                            }
                        }
                    }
                    continue Label_0135_Outer;
                    // monitorexit(b)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public void c(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        final HashMap b = this.b;
        // monitorenter(b)
        while (true) {
            try {
                final c c = new c(intentFilter, broadcastReceiver);
                ArrayList<c> value;
                if ((value = this.b.get(broadcastReceiver)) == null) {
                    value = new ArrayList<c>(1);
                    this.b.put(broadcastReceiver, value);
                }
                value.add(c);
                for (int i = 0; i < intentFilter.countActions(); ++i) {
                    final String action = intentFilter.getAction(i);
                    ArrayList<c> value2;
                    if ((value2 = this.c.get(action)) == null) {
                        value2 = new ArrayList<c>(1);
                        this.c.put(action, value2);
                    }
                    value2.add(c);
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean d(final Intent obj) {
        while (true) {
            final HashMap b = this.b;
            // monitorenter(b)
            String action;
            String resolveTypeIfNeeded;
            Uri data;
            String scheme;
            Set categories;
            int index = 0;
            Serializable str;
            ArrayList<c> obj2;
            Object e;
            int index2 = 0;
            Serializable s = null;
            int match = 0;
            Intent intent;
            IntentFilter a;
            final Intent intent2;
            Label_0199_Outer:Label_0436_Outer:
            while (true) {
            Label_0436:
                while (true) {
                    Label_0513_Outer:Label_0380_Outer:
                    while (true) {
                        Label_0611: {
                            while (true) {
                            Label_0380:
                                while (true) {
                                    Label_0535: {
                                        Label_0527: {
                                            while (true) {
                                                try {
                                                    action = obj.getAction();
                                                    resolveTypeIfNeeded = obj.resolveTypeIfNeeded(this.a.getContentResolver());
                                                    data = obj.getData();
                                                    scheme = obj.getScheme();
                                                    categories = obj.getCategories();
                                                    if ((obj.getFlags() & 0x8) != 0x0) {
                                                        index = 1;
                                                    }
                                                    else {
                                                        index = 0;
                                                    }
                                                    if (index != 0) {
                                                        str = new StringBuilder();
                                                        ((StringBuilder)str).append("Resolving type ");
                                                        ((StringBuilder)str).append(resolveTypeIfNeeded);
                                                        ((StringBuilder)str).append(" scheme ");
                                                        ((StringBuilder)str).append(scheme);
                                                        ((StringBuilder)str).append(" of intent ");
                                                        ((StringBuilder)str).append(obj);
                                                        Log.v("LocalBroadcastManager", ((StringBuilder)str).toString());
                                                    }
                                                    obj2 = this.c.get(obj.getAction());
                                                    if (obj2 == null) {
                                                        // monitorexit(b)
                                                        return false;
                                                    }
                                                    if (index != 0) {
                                                        str = new StringBuilder();
                                                        ((StringBuilder)str).append("Action list: ");
                                                        ((StringBuilder)str).append(obj2);
                                                        Log.v("LocalBroadcastManager", ((StringBuilder)str).toString());
                                                    }
                                                    break Label_0527;
                                                Block_14_Outer:
                                                    while (true) {
                                                    Block_20:
                                                        while (true) {
                                                            Block_13: {
                                                                while (true) {
                                                                    Label_0262: {
                                                                    Block_19:
                                                                        while (true) {
                                                                            Block_18: {
                                                                                break Block_18;
                                                                                str = new StringBuilder();
                                                                                ((StringBuilder)str).append("Matching against filter ");
                                                                                ((StringBuilder)str).append(((c)e).a);
                                                                                Log.v("LocalBroadcastManager", ((StringBuilder)str).toString());
                                                                                break Label_0262;
                                                                                while (true) {
                                                                                    Log.v("LocalBroadcastManager", "  Filter's target already added");
                                                                                    break Label_0535;
                                                                                    break Block_13;
                                                                                    continue Label_0199_Outer;
                                                                                }
                                                                                break Block_20;
                                                                                break Block_19;
                                                                            }
                                                                            s = new StringBuilder();
                                                                            ((StringBuilder)s).append("  Filter matched!  match=0x");
                                                                            ((StringBuilder)s).append(Integer.toHexString(match));
                                                                            Log.v("LocalBroadcastManager", ((StringBuilder)s).toString());
                                                                            continue Label_0513_Outer;
                                                                        }
                                                                        s = new ArrayList();
                                                                        break Label_0380;
                                                                    }
                                                                    continue Label_0436_Outer;
                                                                }
                                                                ((ArrayList<StringBuilder>)s).add((StringBuilder)e);
                                                                ((c)e).c = true;
                                                                break Label_0611;
                                                            }
                                                            e = obj2.get(index2);
                                                            continue Label_0199_Outer;
                                                        }
                                                        ((c)((ArrayList<StringBuilder>)s).get(index)).c = false;
                                                        ++index;
                                                        continue Label_0436;
                                                        e = new StringBuilder();
                                                        ((StringBuilder)e).append("  Filter did not match: ");
                                                        ((StringBuilder)e).append((String)str);
                                                        Log.v("LocalBroadcastManager", ((StringBuilder)e).toString());
                                                        break Label_0611;
                                                        Label_0465: {
                                                            this.d.add(new b(intent, (ArrayList)s));
                                                        }
                                                        this.e.sendEmptyMessage(1);
                                                        Label_0503:
                                                        return true;
                                                        Label_0285:
                                                        a = ((c)e).a;
                                                        str = s;
                                                        match = a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                                        continue Block_14_Outer;
                                                    }
                                                }
                                                // iftrue(Label_0363:, index == 0)
                                                // iftrue(Label_0618:, index2 >= obj2.size())
                                                // iftrue(Label_0535:, index == 0)
                                                // iftrue(Label_0465:, index >= s.size())
                                                // iftrue(Label_0538:, str != null)
                                                // monitorexit(b)
                                                // iftrue(Label_0285:, !e.c)
                                                // iftrue(Label_0262:, index == 0)
                                                // iftrue(Label_0503:, this.e.hasMessages(1))
                                                // monitorexit(b)
                                                // iftrue(Label_0545:, match < 0)
                                                finally {}
                                                intent = intent2;
                                                continue Label_0380_Outer;
                                            }
                                        }
                                        s = null;
                                        index2 = 0;
                                        continue Label_0436_Outer;
                                    }
                                    break Label_0611;
                                    Label_0538: {
                                        s = str;
                                    }
                                    continue Label_0380;
                                }
                                Label_0545: {
                                    if (index != 0) {
                                        if (match == -4) {
                                            str = "category";
                                            continue;
                                        }
                                        if (match == -3) {
                                            str = "action";
                                            continue;
                                        }
                                        if (match == -2) {
                                            str = "data";
                                            continue;
                                        }
                                        if (match != -1) {
                                            str = "unknown reason";
                                            continue;
                                        }
                                        str = "type";
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                        ++index2;
                        continue Label_0436_Outer;
                    }
                    Label_0618: {
                        if (s != null) {
                            index = 0;
                            continue Label_0436;
                        }
                    }
                    break;
                }
                continue Label_0199_Outer;
            }
        }
    }
    
    public void e(final BroadcastReceiver key) {
        while (true) {
            final HashMap b = this.b;
            // monitorenter(b)
        Label_0062_Outer:
            while (true) {
                int index = 0;
            Label_0206:
                while (true) {
                    int n = 0;
                    Label_0199: {
                        while (true) {
                            int n2 = 0;
                            Label_0190: {
                                while (true) {
                                    try {
                                        final ArrayList<c> list = this.b.remove(key);
                                        if (list == null) {
                                            // monitorexit(b)
                                            return;
                                        }
                                        index = list.size() - 1;
                                        if (index < 0) {
                                            // monitorexit(b)
                                            return;
                                        }
                                        final c c = list.get(index);
                                        c.d = true;
                                        n = 0;
                                        if (n >= c.a.countActions()) {
                                            break Label_0206;
                                        }
                                        final String action = c.a.getAction(n);
                                        final ArrayList<c> list2 = this.c.get(action);
                                        if (list2 == null) {
                                            break Label_0199;
                                        }
                                        n2 = list2.size() - 1;
                                        if (n2 >= 0) {
                                            final c c2 = list2.get(n2);
                                            if (c2.b == key) {
                                                c2.d = true;
                                                list2.remove(n2);
                                            }
                                            break Label_0190;
                                        }
                                        else {
                                            if (list2.size() <= 0) {
                                                this.c.remove(action);
                                            }
                                            break Label_0199;
                                        }
                                        // monitorexit(b)
                                        throw key;
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                            }
                            --n2;
                            continue;
                        }
                    }
                    ++n;
                    continue;
                }
                --index;
                continue Label_0062_Outer;
            }
        }
    }
    
    public static final class b
    {
        public final Intent a;
        public final ArrayList b;
        
        public b(final Intent a, final ArrayList b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;
        
        public c(final IntentFilter a, final BroadcastReceiver b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
