// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import android.os.BaseBundle;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import android.os.Build$VERSION;
import android.content.Intent;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import E5.c;
import V2.j;
import java.util.Objects;
import com.google.firebase.messaging.FirebaseMessaging;
import s3.e;
import java.util.Map;
import com.google.firebase.messaging.T;
import androidx.lifecycle.m;
import androidx.lifecycle.LiveData;
import android.app.Activity;
import java.util.HashMap;
import A5.a;
import E5.n;
import E5.k;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class x implements FlutterFirebasePlugin, c, n, a, B5.a
{
    public final HashMap a;
    public k b;
    public Activity c;
    public final LiveData d;
    public m e;
    public final LiveData f;
    public m g;
    public T h;
    public Map i;
    public A j;
    
    public x() {
        this.a = new HashMap();
        this.d = B.k();
        this.f = C.k();
    }
    
    private Map t(final Exception ex) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("code", "unknown");
        String message;
        if (ex != null) {
            message = ex.getMessage();
        }
        else {
            message = "An unknown error has occurred.";
        }
        hashMap.put("message", message);
        return hashMap;
    }
    
    private void x(final E5.c c) {
        (this.b = new k(c, "plugins.flutter.io/firebase_messaging")).e((k.c)this);
        this.j = new A();
        this.e = new o(this);
        this.g = new p(this);
        this.d.e(this.e);
        this.f.e(this.g);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }
    
    public final j P() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, k));
        return k.a();
    }
    
    public final j Q(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new t(map, k));
        return k.a();
    }
    
    public final j R(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new O5.k(this, map, k));
        return k.a();
    }
    
    public final j S(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new O5.j(map, k));
        return k.a();
    }
    
    public final j T(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(map, k));
        return k.a();
    }
    
    public final j U(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(map, k));
        return k.a();
    }
    
    @Override
    public j didReinitializeFirebaseCore() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(k));
        return k.a();
    }
    
    @Override
    public j getPluginConstantsForFirebaseApp(final e e) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(e, k));
        return k.a();
    }
    
    @Override
    public void onAttachedToActivity(final B5.c c) {
        c.g(this);
        c.e(this.j);
        final Activity c2 = c.c();
        this.c = c2;
        if (c2.getIntent() != null && this.c.getIntent().getExtras() != null && (this.c.getIntent().getFlags() & 0x100000) != 0x100000) {
            this.onNewIntent(this.c.getIntent());
        }
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.x(b.b());
    }
    
    @Override
    public void onDetachedFromActivity() {
        this.c = null;
    }
    
    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.c = null;
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.f.i(this.g);
        this.d.i(this.e);
    }
    
    @Override
    public void onMethodCall(final E5.j j, final d d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1459336962: {
                if (!a.equals("Messaging#getToken")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1243856389: {
                if (!a.equals("Messaging#getNotificationSettings")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1231338975: {
                if (!a.equals("Messaging#requestPermission")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1165917248: {
                if (!a.equals("Messaging#sendMessage")) {
                    break;
                }
                n = 7;
                break;
            }
            case 928431066: {
                if (!a.equals("Messaging#startBackgroundIsolate")) {
                    break;
                }
                n = 6;
                break;
            }
            case 607887267: {
                if (!a.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    break;
                }
                n = 5;
                break;
            }
            case 506322569: {
                if (!a.equals("Messaging#subscribeToTopic")) {
                    break;
                }
                n = 4;
                break;
            }
            case 421314579: {
                if (!a.equals("Messaging#unsubscribeFromTopic")) {
                    break;
                }
                n = 3;
                break;
            }
            case -657665041: {
                if (!a.equals("Messaging#deleteToken")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1661255137: {
                if (!a.equals("Messaging#setAutoInitEnabled")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1704007366: {
                if (!a.equals("Messaging#getInitialMessage")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        j i = null;
        switch (n) {
            default: {
                d.c();
                return;
            }
            case 10: {
                i = this.w();
                break;
            }
            case 8: {
                if (Build$VERSION.SDK_INT >= 33) {
                    i = this.P();
                    break;
                }
            }
            case 9: {
                i = this.v();
                break;
            }
            case 7: {
                i = this.Q((Map)j.b());
                break;
            }
            case 6: {
                final Map map = (Map)j.b;
                final Long value = map.get("pluginCallbackHandle");
                final Long value2 = map.get("userCallbackHandle");
                long longValue;
                if (value instanceof Long) {
                    longValue = value;
                }
                else {
                    if (!(value instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    longValue = value;
                }
                long longValue2;
                if (value2 instanceof Long) {
                    longValue2 = value2;
                }
                else {
                    if (!(value2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    longValue2 = value2;
                }
                final Activity c = this.c;
                v5.j a2;
                if (c != null) {
                    a2 = v5.j.a(c.getIntent());
                }
                else {
                    a2 = null;
                }
                FlutterFirebaseMessagingBackgroundService.n(longValue);
                FlutterFirebaseMessagingBackgroundService.o(longValue2);
                FlutterFirebaseMessagingBackgroundService.p(longValue, a2);
                i = V2.m.e(null);
                break;
            }
            case 5: {
                i = this.S((Map)j.b());
                break;
            }
            case 4: {
                i = this.T((Map)j.b());
                break;
            }
            case 3: {
                i = this.U((Map)j.b());
                break;
            }
            case 2: {
                i = this.s();
                break;
            }
            case 1: {
                i = this.R((Map)j.b());
                break;
            }
            case 0: {
                i = this.u();
                break;
            }
        }
        i.b(new r(this, d));
    }
    
    @Override
    public boolean onNewIntent(final Intent intent) {
        if (intent.getExtras() == null) {
            return false;
        }
        String s;
        if ((s = ((BaseBundle)intent.getExtras()).getString("google.message_id")) == null) {
            s = ((BaseBundle)intent.getExtras()).getString("message_id");
        }
        if (s == null) {
            return false;
        }
        T b = FlutterFirebaseMessagingReceiver.a.get(s);
        Map c = null;
        Label_0091: {
            if (b == null) {
                final Map a = y.b().a(s);
                if (a != null) {
                    b = z.b(a);
                    c = z.c(a);
                    break Label_0091;
                }
            }
            c = null;
        }
        if (b == null) {
            return false;
        }
        this.h = b;
        this.i = c;
        FlutterFirebaseMessagingReceiver.a.remove(s);
        final Map f = z.f(b);
        if (b.q() == null) {
            final Map i = this.i;
            if (i != null) {
                f.put("notification", i);
            }
        }
        this.b.c("Messaging#onMessageOpenedApp", f);
        this.c.setIntent(intent);
        return true;
    }
    
    @Override
    public void onReattachedToActivityForConfigChanges(final B5.c c) {
        c.g(this);
        this.c = c.c();
    }
    
    public final Boolean r() {
        return O5.a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
    }
    
    public final j s() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new v(k));
        return k.a();
    }
    
    public final j u() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, k));
        return k.a();
    }
    
    public final j v() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new w(this, k));
        return k.a();
    }
    
    public final j w() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, k));
        return k.a();
    }
}
