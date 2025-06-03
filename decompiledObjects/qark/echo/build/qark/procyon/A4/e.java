// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A4;

import com.google.firebase.perf.metrics.Trace;
import M4.l;
import java.util.HashMap;
import android.util.Log;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import L4.k;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.config.RemoteConfigManager;
import s4.i;
import r4.b;
import M4.f;
import java.util.Map;
import F4.a;

public class e
{
    public static final a i;
    public final Map a;
    public final C4.a b;
    public final f c;
    public Boolean d;
    public final s3.e e;
    public final b f;
    public final i g;
    public final b h;
    
    static {
        i = a.e();
    }
    
    public e(final s3.e e, final b b, final i g, final b h, final RemoteConfigManager remoteConfigManager, final C4.a a, final SessionManager sessionManager) {
        this.a = new ConcurrentHashMap();
        this.d = null;
        this.e = e;
        this.f = b;
        this.g = g;
        this.h = h;
        if (e == null) {
            this.d = Boolean.FALSE;
            this.b = a;
            this.c = new f(new Bundle());
            return;
        }
        k.l().s(e, g, h);
        final Context m = e.m();
        final f a2 = a(m);
        this.c = a2;
        remoteConfigManager.setFirebaseRemoteConfigProvider(b);
        (this.b = a).R(a2);
        a.P(m);
        sessionManager.setApplicationContext(m);
        this.d = a.j();
        final a i = A4.e.i;
        if (i.h() && this.d()) {
            i.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", F4.b.b(e.r().g(), m.getPackageName())));
        }
    }
    
    public static f a(Context metaData) {
        Label_0062: {
            try {
                metaData = (NullPointerException)((Context)metaData).getPackageManager().getApplicationInfo(((Context)metaData).getPackageName(), 128).metaData;
                break Label_0062;
            }
            catch (NullPointerException metaData) {}
            catch (PackageManager$NameNotFoundException ex) {}
            final StringBuilder sb = new StringBuilder();
            sb.append("No perf enable meta data found ");
            sb.append(metaData.getMessage());
            Log.d("isEnabled", sb.toString());
            metaData = null;
        }
        if (metaData != null) {
            return new f((Bundle)metaData);
        }
        return new f();
    }
    
    public static e c() {
        return (e)s3.e.o().k(e.class);
    }
    
    public Map b() {
        return new HashMap(this.a);
    }
    
    public boolean d() {
        final Boolean d = this.d;
        if (d != null) {
            return d;
        }
        return s3.e.o().x();
    }
    
    public G4.i e(final String s, final String s2) {
        return new G4.i(s, s2, k.l(), new l());
    }
    
    public Trace f(final String s) {
        return Trace.h(s);
    }
    
    public void g(Boolean j) {
        // monitorenter(this)
        while (true) {
            try {
                // monitorexit(this)
                Label_0119: {
                    try {
                        s3.e.o();
                        if (this.b.i()) {
                            A4.e.i.f("Firebase Performance is permanently disabled");
                            // monitorexit(this)
                            return;
                        }
                    }
                    finally {
                        break Label_0119;
                    }
                    this.b.Q(j);
                    if (j == null) {
                        j = this.b.j();
                    }
                    this.d = j;
                    Label_0116: {
                        a a;
                        String s;
                        if (Boolean.TRUE.equals(this.d)) {
                            a = A4.e.i;
                            s = "Firebase Performance is Enabled";
                        }
                        else {
                            if (!Boolean.FALSE.equals(this.d)) {
                                break Label_0116;
                            }
                            a = A4.e.i;
                            s = "Firebase Performance is Disabled";
                        }
                        a.f(s);
                    }
                    return;
                }
                // monitorexit(this)
                throw j;
            }
            // monitorexit(this)
            catch (IllegalStateException ex) {
                continue;
            }
            break;
        }
    }
}
