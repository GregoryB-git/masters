// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w1;

import java.util.Objects;
import java.util.List;
import E5.j;
import android.app.Activity;
import android.content.Context;
import E5.k;

public final class l implements c
{
    public final Context a;
    public final w1.a b;
    public final q c;
    public final y d;
    public Activity e;
    
    public l(final Context a, final w1.a b, final q c, final y d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void i(final Activity e) {
        this.e = e;
    }
    
    @Override
    public void onMethodCall(final j j, final d obj) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1669188213: {
                if (!a.equals("requestPermissions")) {
                    break;
                }
                n = 4;
                break;
            }
            case 347240634: {
                if (!a.equals("openAppSettings")) {
                    break;
                }
                n = 3;
                break;
            }
            case -576207927: {
                if (!a.equals("checkPermissionStatus")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1017315255: {
                if (!a.equals("shouldShowRequestPermissionRationale")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1544053025: {
                if (!a.equals("checkServiceStatus")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                obj.c();
            }
            case 4: {
                final List list = (List)j.b();
                final q c = this.c;
                final Activity e = this.e;
                Objects.requireNonNull(obj);
                c.h(list, e, (q.b)new f(obj), new g(obj));
            }
            case 3: {
                final w1.a b = this.b;
                final Context a2 = this.a;
                Objects.requireNonNull(obj);
                b.a(a2, (w1.a.a)new w1.j(obj), new w1.k(obj));
            }
            case 2: {
                final int int1 = Integer.parseInt(j.b.toString());
                final q c2 = this.c;
                final Context a3 = this.a;
                Objects.requireNonNull(obj);
                c2.e(int1, a3, (q.a)new e(obj));
            }
            case 1: {
                final int int2 = Integer.parseInt(j.b.toString());
                final q c3 = this.c;
                final Activity e2 = this.e;
                Objects.requireNonNull(obj);
                c3.i(int2, e2, (q.c)new h(obj), new i(obj));
            }
            case 0: {
                final int int3 = Integer.parseInt(j.b.toString());
                final y d = this.d;
                final Context a4 = this.a;
                Objects.requireNonNull(obj);
                d.a(int3, a4, (y.a)new w1.c(obj), new w1.d(obj));
            }
        }
    }
}
