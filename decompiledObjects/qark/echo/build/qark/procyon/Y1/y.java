// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import org.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.Map;
import T1.a;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.g;
import y1.F;
import java.util.concurrent.ScheduledExecutorService;

public final class y
{
    public static final a d;
    public static final ScheduledExecutorService e;
    public final String a;
    public final F b;
    public String c;
    
    static {
        d = new a(null);
        e = Executors.newSingleThreadScheduledExecutor();
    }
    
    public y(final Context context, final String a) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a, "applicationId");
        this.a = a;
        this.b = new F(context, a);
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                final PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.c = packageInfo.versionName;
                }
            }
        }
        catch (PackageManager$NameNotFoundException ex) {}
    }
    
    public final String a() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final void b(final String s, final String s2, final String s3, final String s4, final String s5, final Map map, final String s6) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final Bundle a = y.d.b(s);
                if (s3 != null) {
                    ((BaseBundle)a).putString("2_result", s3);
                }
                if (s4 != null) {
                    ((BaseBundle)a).putString("5_error_message", s4);
                }
                if (s5 != null) {
                    ((BaseBundle)a).putString("4_error_code", s5);
                }
                if (map != null && (map.isEmpty() ^ true)) {
                    final LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
                    for (final Map.Entry<String, V> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ((BaseBundle)a).putString("6_extras", new JSONObject((Map)linkedHashMap).toString());
                }
                ((BaseBundle)a).putString("3_method", s2);
                this.b.g(s6, a);
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void c(final String s, final String s2, final String s3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Bundle a = y.d.b(s);
            ((BaseBundle)a).putString("3_method", s2);
            this.b.g(s3, a);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void d(final String s, final String s2, final String s3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Bundle a = y.d.b(s);
            ((BaseBundle)a).putString("3_method", s2);
            this.b.g(s3, a);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void e(final String s, final String s2, final String s3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Bundle a = y.d.b("");
            ((BaseBundle)a).putString("2_result", u.f.a.r.e());
            ((BaseBundle)a).putString("5_error_message", s2);
            ((BaseBundle)a).putString("3_method", s3);
            this.b.g(s, a);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public static final class a
    {
        public final Bundle b(final String s) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putLong("1_timestamp_ms", System.currentTimeMillis());
            ((BaseBundle)bundle).putString("0_auth_logger_id", s);
            ((BaseBundle)bundle).putString("3_method", "");
            ((BaseBundle)bundle).putString("2_result", "");
            ((BaseBundle)bundle).putString("5_error_message", "");
            ((BaseBundle)bundle).putString("4_error_code", "");
            ((BaseBundle)bundle).putString("6_extras", "");
            return bundle;
        }
    }
}
