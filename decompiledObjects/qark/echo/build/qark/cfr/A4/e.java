/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package A4;

import F4.a;
import G4.i;
import L4.k;
import M4.f;
import M4.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import r4.b;
import s3.m;

public class e {
    public static final a i = a.e();
    public final Map a = new ConcurrentHashMap();
    public final C4.a b;
    public final f c;
    public Boolean d = null;
    public final s3.e e;
    public final b f;
    public final s4.i g;
    public final b h;

    public e(s3.e e8, b object, s4.i i8, b object2, RemoteConfigManager remoteConfigManager, C4.a a8, SessionManager sessionManager) {
        this.e = e8;
        this.f = object;
        this.g = i8;
        this.h = object2;
        if (e8 == null) {
            this.d = Boolean.FALSE;
            this.b = a8;
            this.c = new f(new Bundle());
            return;
        }
        k.l().s(e8, i8, (b)object2);
        i8 = e8.m();
        this.c = object2 = e.a((Context)i8);
        remoteConfigManager.setFirebaseRemoteConfigProvider((b)object);
        this.b = a8;
        a8.R((f)object2);
        a8.P((Context)i8);
        sessionManager.setApplicationContext((Context)i8);
        this.d = a8.j();
        object = i;
        if (object.h() && this.d()) {
            object.f(String.format((String)"Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", (Object[])new Object[]{F4.b.b(e8.r().g(), i8.getPackageName())}));
        }
    }

    public static f a(Context object) {
        block4 : {
            try {
                object = object.getPackageManager().getApplicationInfo((String)object.getPackageName(), (int)128).metaData;
                break block4;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                // empty catch block
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No perf enable meta data found ");
            stringBuilder.append(object.getMessage());
            Log.d((String)"isEnabled", (String)stringBuilder.toString());
            object = null;
        }
        if (object != null) {
            object = new f((Bundle)object);
            return object;
        }
        object = new f();
        return object;
    }

    public static e c() {
        return (e)s3.e.o().k(e.class);
    }

    public Map b() {
        return new HashMap(this.a);
    }

    public boolean d() {
        Boolean bl = this.d;
        if (bl != null) {
            return bl;
        }
        return s3.e.o().x();
    }

    public i e(String string2, String string3) {
        return new i(string2, string3, k.l(), new l());
    }

    public Trace f(String string2) {
        return Trace.h(string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void g(Boolean object) {
        block13 : {
            a a8;
            block12 : {
                block11 : {
                    // MONITORENTER : this
                    s3.e.o();
                    if (this.b.i().booleanValue()) {
                        i.f("Firebase Performance is permanently disabled");
                        // MONITOREXIT : this
                        return;
                    }
                    this.b.Q((Boolean)object);
                    if (object == null) {
                        object = this.b.j();
                    }
                    this.d = object;
                    if (!Boolean.TRUE.equals((Object)this.d)) break block11;
                    a8 = i;
                    object = "Firebase Performance is Enabled";
                    break block12;
                }
                if (!Boolean.FALSE.equals((Object)this.d)) break block13;
                a8 = i;
                object = "Firebase Performance is Disabled";
            }
            a8.f((String)object);
            return;
        }
        // MONITOREXIT : this
        return;
        catch (IllegalStateException illegalStateException) {
            return;
        }
    }
}

