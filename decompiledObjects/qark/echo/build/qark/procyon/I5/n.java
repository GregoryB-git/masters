// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I5;

import android.os.BaseBundle;
import java.util.HashMap;
import java.util.Objects;
import V2.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import android.content.Context;
import E5.c;
import java.util.Iterator;
import android.os.Parcelable;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.Map;
import V2.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import A5.a;
import E5.k;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class n implements FlutterFirebasePlugin, c, a
{
    public FirebaseAnalytics a;
    public k b;
    
    private static Bundle n(final Map map) {
        if (map == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        for (final Map.Entry<K, Object> entry : map.entrySet()) {
            final Map value = entry.getValue();
            final String str = (String)entry.getKey();
            if (value instanceof String) {
                ((BaseBundle)bundle).putString(str, (String)value);
            }
            else {
                long longValue;
                if (value instanceof Integer) {
                    longValue = (int)value;
                }
                else if (value instanceof Long) {
                    longValue = (long)value;
                }
                else {
                    if (value instanceof Double) {
                        ((BaseBundle)bundle).putDouble(str, (double)value);
                        continue;
                    }
                    if (value instanceof Boolean) {
                        ((BaseBundle)bundle).putBoolean(str, (boolean)value);
                        continue;
                    }
                    if (value == null) {
                        ((BaseBundle)bundle).putString(str, (String)null);
                        continue;
                    }
                    if (value instanceof Iterable) {
                        final ArrayList<Bundle> list = new ArrayList<Bundle>();
                        for (final Map next : (Iterable<Map>)value) {
                            if (!(next instanceof Map)) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unsupported value type: ");
                                sb.append(next.getClass().getCanonicalName());
                                sb.append(" in list at key ");
                                sb.append(str);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            list.add(n(next));
                        }
                        bundle.putParcelableArrayList(str, (ArrayList)list);
                        continue;
                    }
                    if (value instanceof Map) {
                        bundle.putParcelable(str, (Parcelable)n(value));
                        continue;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unsupported value type: ");
                    sb2.append(((Iterable<Map>)value).getClass().getCanonicalName());
                    throw new IllegalArgumentException(sb2.toString());
                }
                ((BaseBundle)bundle).putLong(str, longValue);
            }
        }
        return bundle;
    }
    
    private void w(final E5.c c, final Context context) {
        this.a = FirebaseAnalytics.getInstance(context);
        (this.b = new k(c, "plugins.flutter.io/firebase_analytics")).e((k.c)this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }
    
    public final j K(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, map, k));
        return k.a();
    }
    
    public final j L(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new I5.d(this, map, k));
        return k.a();
    }
    
    @Override
    public j didReinitializeFirebaseCore() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(k));
        return k.a();
    }
    
    @Override
    public j getPluginConstantsForFirebaseApp(final s3.e e) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, k));
        return k.a();
    }
    
    public final j o() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new I5.j(this, k));
        return k.a();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.w(b.b(), b.a());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        final k b2 = this.b;
        if (b2 != null) {
            b2.e(null);
            this.b = null;
        }
    }
    
    @Override
    public void onMethodCall(final E5.j j, final d d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1992044651: {
                if (!a.equals("Analytics#setUserId")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1751063748: {
                if (!a.equals("Analytics#setSessionTimeoutDuration")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1083589925: {
                if (!a.equals("Analytics#setUserProperty")) {
                    break;
                }
                n = 7;
                break;
            }
            case 179244440: {
                if (!a.equals("Analytics#getSessionId")) {
                    break;
                }
                n = 6;
                break;
            }
            case -45011405: {
                if (!a.equals("Analytics#logEvent")) {
                    break;
                }
                n = 5;
                break;
            }
            case -99047480: {
                if (!a.equals("Analytics#setDefaultEventParameters")) {
                    break;
                }
                n = 4;
                break;
            }
            case -273201790: {
                if (!a.equals("Analytics#setAnalyticsCollectionEnabled")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1572470123: {
                if (!a.equals("Analytics#setConsent")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1931910274: {
                if (!a.equals("Analytics#resetAnalyticsData")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2090892968: {
                if (!a.equals("Analytics#getAppInstanceId")) {
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
            case 9: {
                i = this.u((Map)j.b());
                break;
            }
            case 8: {
                i = this.t((Map)j.b());
                break;
            }
            case 7: {
                i = this.v((Map)j.b());
                break;
            }
            case 6: {
                i = this.p();
                break;
            }
            case 5: {
                i = this.q((Map)j.b());
                break;
            }
            case 4: {
                i = this.L((Map)j.b());
                break;
            }
            case 3: {
                i = this.s((Map)j.b());
                break;
            }
            case 2: {
                i = this.K((Map)j.b());
                break;
            }
            case 1: {
                i = this.r();
                break;
            }
            case 0: {
                i = this.o();
                break;
            }
        }
        i.b(new f(d));
    }
    
    public final j p() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, k));
        return k.a();
    }
    
    public final j q(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, map, k));
        return k.a();
    }
    
    public final j r() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new I5.m(this, k));
        return k.a();
    }
    
    public final j s(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, map, k));
        return k.a();
    }
    
    public final j t(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new I5.k(this, map, k));
        return k.a();
    }
    
    public final j u(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new I5.c(this, map, k));
        return k.a();
    }
    
    public final j v(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, map, k));
        return k.a();
    }
}
