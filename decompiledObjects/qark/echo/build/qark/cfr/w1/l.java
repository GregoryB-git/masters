/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Objects
 */
package w1;

import E5.k;
import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Objects;
import w1.a;
import w1.b;
import w1.c;
import w1.d;
import w1.e;
import w1.f;
import w1.g;
import w1.h;
import w1.i;
import w1.j;
import w1.k;
import w1.q;
import w1.y;

public final class l
implements k.c {
    public final Context a;
    public final a b;
    public final q c;
    public final y d;
    public Activity e;

    public l(Context context, a a8, q q8, y y8) {
        this.a = context;
        this.b = a8;
        this.c = q8;
        this.d = y8;
    }

    public static /* synthetic */ void a(k.d d8, String string2, String string3) {
        d8.b(string2, string3, null);
    }

    public static /* synthetic */ void b(k.d d8, String string2, String string3) {
        d8.b(string2, string3, null);
    }

    public static /* synthetic */ void c(k.d d8, String string2, String string3) {
        d8.b(string2, string3, null);
    }

    public static /* synthetic */ void d(k.d d8, String string2, String string3) {
        d8.b(string2, string3, null);
    }

    public void i(Activity activity) {
        this.e = activity;
    }

    @Override
    public void onMethodCall(E5.j object, k.d d8) {
        Object object2 = object.a;
        object2.hashCode();
        int n8 = object2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1669188213: {
                if (!object2.equals((Object)"requestPermissions")) break;
                n9 = 4;
                break;
            }
            case 347240634: {
                if (!object2.equals((Object)"openAppSettings")) break;
                n9 = 3;
                break;
            }
            case -576207927: {
                if (!object2.equals((Object)"checkPermissionStatus")) break;
                n9 = 2;
                break;
            }
            case -1017315255: {
                if (!object2.equals((Object)"shouldShowRequestPermissionRationale")) break;
                n9 = 1;
                break;
            }
            case -1544053025: {
                if (!object2.equals((Object)"checkServiceStatus")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 4: {
                object = (List)object.b();
                object2 = this.c;
                Activity activity = this.e;
                Objects.requireNonNull((Object)d8);
                object2.h((List)object, activity, new f(d8), new g(d8));
                return;
            }
            case 3: {
                object = this.b;
                object2 = this.a;
                Objects.requireNonNull((Object)d8);
                object.a((Context)object2, new j(d8), new k(d8));
                return;
            }
            case 2: {
                n9 = Integer.parseInt((String)object.b.toString());
                object = this.c;
                object2 = this.a;
                Objects.requireNonNull((Object)d8);
                object.e(n9, (Context)object2, new e(d8));
                return;
            }
            case 1: {
                n9 = Integer.parseInt((String)object.b.toString());
                object = this.c;
                object2 = this.e;
                Objects.requireNonNull((Object)d8);
                object.i(n9, (Activity)object2, new h(d8), new i(d8));
                return;
            }
            case 0: 
        }
        n9 = Integer.parseInt((String)object.b.toString());
        object = this.d;
        object2 = this.a;
        Objects.requireNonNull((Object)d8);
        object.a(n9, (Context)object2, new c(d8), new d(d8));
    }
}

