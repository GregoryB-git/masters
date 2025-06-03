/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.regex.Pattern
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Q4;

import E2.d;
import P4.t;
import Q4.e;
import Q4.k;
import Q4.q;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class l {
    public static final Charset e = Charset.forName((String)"UTF-8");
    public static final Pattern f = Pattern.compile((String)"^(1|true|t|yes|y|on)$", (int)2);
    public static final Pattern g = Pattern.compile((String)"^(0|false|f|no|n|off|)$", (int)2);
    public final Set a = new HashSet();
    public final Executor b;
    public final e c;
    public final e d;

    public l(Executor executor, e e8, e e9) {
        this.b = executor;
        this.c = e8;
        this.d = e9;
    }

    public static /* synthetic */ void a(d d8, String string2, b b8) {
        d8.a(string2, b8);
    }

    public static b e(e e8) {
        return e8.f();
    }

    public static Set f(e object) {
        HashSet hashSet = new HashSet();
        if ((object = l.e((e)object)) == null) {
            return hashSet;
        }
        object = object.f().keys();
        while (object.hasNext()) {
            hashSet.add((Object)((String)object.next()));
        }
        return hashSet;
    }

    public static String g(e object, String string2) {
        if ((object = l.e((e)object)) == null) {
            return null;
        }
        try {
            object = object.f().getString(string2);
            return object;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public static void j(String string2, String string3) {
        Log.w((String)"FirebaseRemoteConfig", (String)String.format((String)"No value of type '%s' exists for parameter key '%s'.", (Object[])new Object[]{string3, string2}));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(d d8) {
        Set set = this.a;
        synchronized (set) {
            this.a.add((Object)d8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(String string2, b b8) {
        if (b8 == null) {
            return;
        }
        Set set = this.a;
        synchronized (set) {
            try {
                Iterator iterator = this.a.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    d d8 = (d)iterator.next();
                    this.b.execute((Runnable)new k(d8, string2, b8));
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Map d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection)l.f(this.c));
        hashSet.addAll((Collection)l.f(this.d));
        HashMap hashMap = new HashMap();
        for (String string2 : hashSet) {
            hashMap.put((Object)string2, (Object)this.h(string2));
        }
        return hashMap;
    }

    public t h(String string2) {
        String string3 = l.g(this.c, string2);
        if (string3 != null) {
            this.c(string2, l.e(this.c));
            return new q(string3, 2);
        }
        string3 = l.g(this.d, string2);
        if (string3 != null) {
            return new q(string3, 1);
        }
        l.j(string2, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}

