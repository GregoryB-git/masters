package Q4;

import P4.t;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f4443e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f4444f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f4445g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a, reason: collision with root package name */
    public final Set f4446a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4447b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4448c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4449d;

    public l(Executor executor, e eVar, e eVar2) {
        this.f4447b = executor;
        this.f4448c = eVar;
        this.f4449d = eVar2;
    }

    public static com.google.firebase.remoteconfig.internal.b e(e eVar) {
        return eVar.f();
    }

    public static Set f(e eVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.b e7 = e(eVar);
        if (e7 == null) {
            return hashSet;
        }
        Iterator<String> keys = e7.f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String g(e eVar, String str) {
        com.google.firebase.remoteconfig.internal.b e7 = e(eVar);
        if (e7 == null) {
            return null;
        }
        try {
            return e7.f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(E2.d dVar) {
        synchronized (this.f4446a) {
            this.f4446a.add(dVar);
        }
    }

    public final void c(final String str, final com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f4446a) {
            try {
                for (final E2.d dVar : this.f4446a) {
                    this.f4447b.execute(new Runnable() { // from class: Q4.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            E2.d.this.a(str, bVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f4448c));
        hashSet.addAll(f(this.f4449d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public t h(String str) {
        String g7 = g(this.f4448c, str);
        if (g7 != null) {
            c(str, e(this.f4448c));
            return new q(g7, 2);
        }
        String g8 = g(this.f4449d, str);
        if (g8 != null) {
            return new q(g8, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
