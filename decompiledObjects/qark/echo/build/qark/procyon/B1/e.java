// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B1;

import android.os.BaseBundle;
import android.hardware.Sensor;
import O1.v;
import android.hardware.SensorEventListener;
import android.app.Activity;
import java.util.UUID;
import org.json.JSONObject;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import x1.F;
import kotlin.jvm.internal.Intrinsics;
import O1.P;
import G1.g;
import android.os.Build;
import org.json.JSONArray;
import android.content.Context;
import x1.B;
import android.os.Bundle;
import T1.a;
import O1.r;
import java.util.concurrent.atomic.AtomicBoolean;
import android.hardware.SensorManager;

public final class e
{
    public static final e a;
    public static final m b;
    public static SensorManager c;
    public static l d;
    public static String e;
    public static final AtomicBoolean f;
    public static final AtomicBoolean g;
    public static volatile boolean h;
    
    static {
        a = new e();
        b = new m();
        f = new AtomicBoolean(true);
        g = new AtomicBoolean(false);
    }
    
    public static final void d(String format) {
        boolean newValue = true;
        final String s = "0";
        if (T1.a.d(e.class)) {
            return;
        }
        while (true) {
            while (true) {
                Label_0333: {
                    while (true) {
                        try {
                            final Bundle bundle = new Bundle();
                            Object o = B.l();
                            final O1.a e = O1.a.f.e((Context)o);
                            final JSONArray jsonArray = new JSONArray();
                            o = Build.MODEL;
                            if (o == null) {
                                o = "";
                            }
                            jsonArray.put(o);
                            if (e == null) {
                                o = null;
                            }
                            else {
                                o = e.h();
                            }
                            if (o != null) {
                                jsonArray.put((Object)e.h());
                            }
                            else {
                                jsonArray.put((Object)"");
                            }
                            jsonArray.put((Object)"0");
                            o = s;
                            if (G1.g.f()) {
                                o = "1";
                            }
                            jsonArray.put(o);
                            o = P.A();
                            final StringBuilder sb = new StringBuilder();
                            sb.append(((Locale)o).getLanguage());
                            sb.append('_');
                            sb.append((Object)((Locale)o).getCountry());
                            jsonArray.put((Object)sb.toString());
                            o = jsonArray.toString();
                            Intrinsics.checkNotNullExpressionValue(o, "extInfoArray.toString()");
                            ((BaseBundle)bundle).putString("device_session_id", g());
                            ((BaseBundle)bundle).putString("extinfo", (String)o);
                            o = F.n;
                            final x a = x.a;
                            format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[] { format }, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                            final JSONObject c = ((F.c)o).B(null, format, bundle, null).k().c();
                            o = B1.e.g;
                            if (c != null && c.optBoolean("is_app_indexing_enabled", false)) {
                                ((AtomicBoolean)o).set(newValue);
                                if (!((AtomicBoolean)o).get()) {
                                    B1.e.e = null;
                                }
                                else {
                                    final l d = B1.e.d;
                                    if (d != null) {
                                        d.h();
                                    }
                                }
                                B1.e.h = false;
                                return;
                            }
                            break Label_0333;
                            final Throwable t;
                            T1.a.b(t, e.class);
                            return;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                newValue = false;
                continue;
            }
        }
    }
    
    public static final void e() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            B1.e.f.set(false);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
        }
    }
    
    public static final void f() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            B1.e.f.set(true);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
        }
    }
    
    public static final String g() {
        if (T1.a.d(e.class)) {
            return null;
        }
        while (true) {
            try {
                if (B1.e.e == null) {
                    B1.e.e = UUID.randomUUID().toString();
                }
                final String e = B1.e.e;
                if (e != null) {
                    return e;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                final Throwable t;
                T1.a.b(t, e.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final boolean h() {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            return B1.e.g.get();
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
            return false;
        }
    }
    
    public static final void j(final Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            B1.g.f.a().f(activity);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
        }
    }
    
    public static final void k(final Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (!B1.e.f.get()) {
                return;
            }
            B1.g.f.a().h(activity);
            final l d = B1.e.d;
            if (d != null) {
                d.l();
            }
            final SensorManager c = B1.e.c;
            if (c == null) {
                return;
            }
            c.unregisterListener((SensorEventListener)B1.e.b);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
        }
    }
    
    public static final void l(final Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (!B1.e.f.get()) {
                    return;
                }
                B1.g.f.a().e(activity);
                final Context applicationContext = ((Context)activity).getApplicationContext();
                final String m = B.m();
                final r f = v.f(m);
                Object value;
                if (f == null) {
                    value = null;
                }
                else {
                    value = f.b();
                }
                if (Intrinsics.a(value, Boolean.TRUE) || B1.e.a.i()) {
                    final SensorManager c = (SensorManager)applicationContext.getSystemService("sensor");
                    if (c == null) {
                        return;
                    }
                    B1.e.c = c;
                    final Sensor defaultSensor = c.getDefaultSensor(1);
                    final l l = B1.e.d = new l(activity);
                    final m b = B1.e.b;
                    b.a((m.b)new c(f, m));
                    c.registerListener((SensorEventListener)b, defaultSensor, 2);
                    if (f != null && f.b()) {
                        l.h();
                    }
                }
                final e a = B1.e.a;
                if (a.i() && !B1.e.g.get()) {
                    a.c(m);
                }
                return;
                final Throwable t;
                T1.a.b(t, e.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void m(final r r, final String s) {
        if (T1.a.d(e.class)) {
            return;
        }
        while (true) {
            while (true) {
                Label_0063: {
                    while (true) {
                        try {
                            Intrinsics.checkNotNullParameter(s, "$appId");
                            if (r != null && r.b()) {
                                final int n = 1;
                                final boolean s2 = B.s();
                                if (n != 0 && s2) {
                                    B1.e.a.c(s);
                                }
                                return;
                            }
                            break Label_0063;
                            final Throwable t;
                            T1.a.b(t, e.class);
                            return;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public static final void n(final boolean newValue) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            B1.e.g.set(newValue);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
        }
    }
    
    public final void c(final String s) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (B1.e.h) {
                return;
            }
            B1.e.h = true;
            B.t().execute(new d(s));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final boolean i() {
        T1.a.d(this);
        return false;
    }
}
