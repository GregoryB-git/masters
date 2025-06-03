// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w1;

import java.util.Iterator;
import w.a;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import android.net.Uri;
import w.k;
import java.util.List;
import android.util.Log;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.Intent;
import java.util.Map;
import android.app.Activity;
import E5.o;
import E5.m;

public final class q implements m, o
{
    public b a;
    public Activity b;
    public int c;
    public Map d;
    
    @Override
    public boolean a(final int n, final int n2, final Intent intent) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public boolean b(int i, final String[] array, final int[] array2) {
        final int n = 0;
        if (i != 24) {
            this.c = 0;
            return false;
        }
        i = n;
        if (this.d == null) {
            return false;
        }
        while (i < array.length) {
            final String s = array[i];
            final int f = u.f(s);
            if (f != 20) {
                final int n2 = array2[i];
                Label_0382: {
                    Map map2 = null;
                    Integer n4 = null;
                    Label_0144: {
                        if (f != 7) {
                            int j;
                            Map map;
                            Integer n3;
                            if (f == 4) {
                                j = u.h(this.b, s, n2);
                                if (this.d.containsKey(4)) {
                                    break Label_0382;
                                }
                                map = this.d;
                                n3 = 4;
                            }
                            else if (f == 3) {
                                j = u.h(this.b, s, n2);
                                if (Build$VERSION.SDK_INT < 29 && !this.d.containsKey(4)) {
                                    this.d.put(4, j);
                                }
                                if (!this.d.containsKey(5)) {
                                    this.d.put(5, j);
                                }
                                map = this.d;
                                n3 = f;
                            }
                            else {
                                if (!this.d.containsKey(f)) {
                                    map2 = this.d;
                                    n4 = f;
                                    break Label_0144;
                                }
                                break Label_0382;
                            }
                            map.put(n3, j);
                            break Label_0382;
                        }
                        if (!this.d.containsKey(7)) {
                            this.d.put(7, u.h(this.b, s, n2));
                        }
                        if (this.d.containsKey(14)) {
                            break Label_0382;
                        }
                        map2 = this.d;
                        n4 = 14;
                    }
                    map2.put(n4, u.h(this.b, s, n2));
                }
                u.i(this.b, f);
            }
            ++i;
        }
        i = this.c - array2.length;
        if ((this.c = i) == 0) {
            this.a.a(this.d);
        }
        return true;
    }
    
    public final int c(final Context context) {
        final List b = u.b(context, 21);
        if (b != null && !b.isEmpty()) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }
    
    public final int d(final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int n = 0;
        if (sdk_INT >= 33) {
            if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                n = 1;
            }
            return n;
        }
        if (k.b(context).a()) {
            return 1;
        }
        return 0;
    }
    
    public void e(final int n, final Context context, final a a) {
        a.a(this.f(n, context));
    }
    
    public final int f(final int n, final Context context) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final void g(String packageName, final int n) {
        final Intent intent = new Intent(packageName);
        if (!packageName.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            packageName = ((Context)this.b).getPackageName();
            final StringBuilder sb = new StringBuilder();
            sb.append("package:");
            sb.append(packageName);
            intent.setData(Uri.parse(sb.toString()));
        }
        this.b.startActivityForResult(intent, n);
        ++this.c;
    }
    
    public void h(List b, final Activity b2, final b a, final w1.b b3) {
        String s;
        if (this.c > 0) {
            s = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        }
        else {
            if (b2 != null) {
                this.a = a;
                this.b = b2;
                this.d = new HashMap();
                this.c = 0;
                final ArrayList list = new ArrayList();
                for (final Integer n : b) {
                    Map map;
                    Integer n2;
                    if (this.f(n, (Context)b2) == 1) {
                        if (this.d.containsKey(n)) {
                            continue;
                        }
                        map = this.d;
                        n2 = 1;
                    }
                    else {
                        b = u.b((Context)b2, n);
                        if (b != null && !b.isEmpty()) {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            String s2;
                            int n3;
                            if (n == 16) {
                                s2 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                                n3 = 209;
                            }
                            else if (sdk_INT >= 30 && n == 22) {
                                s2 = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                                n3 = 210;
                            }
                            else if (n == 23) {
                                s2 = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                                n3 = 211;
                            }
                            else if (sdk_INT >= 26 && n == 24) {
                                s2 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                                n3 = 212;
                            }
                            else if (n == 27) {
                                s2 = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                                n3 = 213;
                            }
                            else {
                                if (sdk_INT < 31 || n != 34) {
                                    list.addAll(b);
                                    this.c += b.size();
                                    continue;
                                }
                                s2 = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                                n3 = 214;
                            }
                            this.g(s2, n3);
                            continue;
                        }
                        if (this.d.containsKey(n)) {
                            continue;
                        }
                        this.d.put(n, 0);
                        if (n == 22 && Build$VERSION.SDK_INT < 30) {
                            map = this.d;
                            n2 = 2;
                        }
                        else {
                            map = this.d;
                            n2 = 0;
                        }
                    }
                    map.put(n, n2);
                }
                if (list.size() > 0) {
                    a.l(b2, list.toArray(new String[0]), 24);
                }
                if (this.c == 0) {
                    this.a.a(this.d);
                }
                return;
            }
            Log.d("permissions_handler", "Unable to detect current Activity.");
            s = "Unable to detect current Android Activity.";
        }
        b3.a("PermissionHandler.PermissionManager", s);
    }
    
    public void i(final int n, final Activity activity, final c c, final w1.b b) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            b.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        final List b2 = u.b((Context)activity, n);
        if (b2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No android specific permissions needed for: ");
            sb.append(n);
            Log.d("permissions_handler", sb.toString());
            c.a(false);
            return;
        }
        if (b2.isEmpty()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("No permissions found in manifest for: ");
            sb2.append(n);
            sb2.append(" no need to show request rationale");
            Log.d("permissions_handler", sb2.toString());
            c.a(false);
            return;
        }
        c.a(w.a.m(activity, b2.get(0)));
    }
    
    public interface a
    {
        void a(final int p0);
    }
    
    public interface b
    {
        void a(final Map p0);
    }
    
    public interface c
    {
        void a(final boolean p0);
    }
}
