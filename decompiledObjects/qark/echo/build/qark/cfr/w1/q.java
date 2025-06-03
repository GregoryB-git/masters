/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package w1;

import E5.m;
import E5.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.k;
import w1.u;

public final class q
implements m,
o {
    public b a;
    public Activity b;
    public int c;
    public Map d;

    @Override
    public boolean a(int n8, int n9, Intent intent) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean b(int n8, String[] arrstring, int[] arrn) {
        int n9 = 0;
        if (n8 != 24) {
            this.c = 0;
            return false;
        }
        if (this.d == null) {
            return false;
        }
        for (n8 = n9; n8 < arrstring.length; ++n8) {
            int n10;
            block11 : {
                String string2;
                Map map;
                Integer n11;
                block12 : {
                    block15 : {
                        block14 : {
                            block13 : {
                                block10 : {
                                    string2 = arrstring[n8];
                                    n10 = u.f(string2);
                                    if (n10 == 20) continue;
                                    n9 = arrn[n8];
                                    if (n10 != 7) break block10;
                                    if (!this.d.containsKey((Object)7)) {
                                        this.d.put((Object)7, (Object)u.h(this.b, string2, n9));
                                    }
                                    if (this.d.containsKey((Object)14)) break block11;
                                    map = this.d;
                                    n11 = 14;
                                    break block12;
                                }
                                if (n10 != 4) break block13;
                                n9 = u.h(this.b, string2, n9);
                                if (this.d.containsKey((Object)4)) break block11;
                                map = this.d;
                                n11 = 4;
                                break block14;
                            }
                            if (n10 != 3) break block15;
                            n9 = u.h(this.b, string2, n9);
                            if (Build.VERSION.SDK_INT < 29 && !this.d.containsKey((Object)4)) {
                                this.d.put((Object)4, (Object)n9);
                            }
                            if (!this.d.containsKey((Object)5)) {
                                this.d.put((Object)5, (Object)n9);
                            }
                            map = this.d;
                            n11 = n10;
                        }
                        map.put((Object)n11, (Object)n9);
                        break block11;
                    }
                    if (this.d.containsKey((Object)n10)) break block11;
                    map = this.d;
                    n11 = n10;
                }
                map.put((Object)n11, (Object)u.h(this.b, string2, n9));
            }
            u.i(this.b, n10);
        }
        this.c = n8 = this.c - arrn.length;
        if (n8 == 0) {
            this.a.a(this.d);
        }
        return true;
    }

    public final int c(Context context) {
        if ((context = u.b(context, 21)) != null && !context.isEmpty()) {
            return 1;
        }
        Log.d((String)"permissions_handler", (String)"Bluetooth permission missing in manifest");
        return 0;
    }

    public final int d(Context context) {
        int n8 = Build.VERSION.SDK_INT;
        int n9 = 0;
        if (n8 < 33) {
            if (k.b(context).a()) {
                return 1;
            }
            return 0;
        }
        if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            n9 = 1;
        }
        return n9;
    }

    public void e(int n8, Context context, a a8) {
        a8.a(this.f(n8, context));
    }

    public final int f(int n8, Context context) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final void g(String string2, int n8) {
        Intent intent = new Intent(string2);
        if (!string2.equals((Object)"android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            string2 = this.b.getPackageName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("package:");
            stringBuilder.append(string2);
            intent.setData(Uri.parse((String)stringBuilder.toString()));
        }
        this.b.startActivityForResult(intent, n8);
        ++this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void h(List object, Activity activity, b b8, w1.b b9) {
        block13 : {
            block12 : {
                block11 : {
                    if (this.c <= 0) break block11;
                    object = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
                    break block12;
                }
                if (activity != null) break block13;
                Log.d((String)"permissions_handler", (String)"Unable to detect current Activity.");
                object = "Unable to detect current Android Activity.";
            }
            b9.a("PermissionHandler.PermissionManager", (String)object);
            return;
        }
        this.a = b8;
        this.b = activity;
        this.d = new HashMap();
        this.c = 0;
        b9 = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Integer n8;
            block15 : {
                block16 : {
                    block23 : {
                        int n9;
                        block18 : {
                            block22 : {
                                block21 : {
                                    block20 : {
                                        block19 : {
                                            block17 : {
                                                block14 : {
                                                    n8 = (Integer)iterator.next();
                                                    if (this.f(n8, (Context)activity) != 1) break block14;
                                                    if (this.d.containsKey((Object)n8)) continue;
                                                    object = this.d;
                                                    b8 = Integer.valueOf((int)1);
                                                    break block15;
                                                }
                                                object = u.b((Context)activity, n8);
                                                if (object == null || object.isEmpty()) break block16;
                                                n9 = Build.VERSION.SDK_INT;
                                                if (n8 != 16) break block17;
                                                object = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                                                n9 = 209;
                                                break block18;
                                            }
                                            if (n9 < 30 || n8 != 22) break block19;
                                            object = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                                            n9 = 210;
                                            break block18;
                                        }
                                        if (n8 != 23) break block20;
                                        object = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                                        n9 = 211;
                                        break block18;
                                    }
                                    if (n9 < 26 || n8 != 24) break block21;
                                    object = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                                    n9 = 212;
                                    break block18;
                                }
                                if (n8 != 27) break block22;
                                object = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                                n9 = 213;
                                break block18;
                            }
                            if (n9 < 31 || n8 != 34) break block23;
                            object = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                            n9 = 214;
                        }
                        this.g((String)object, n9);
                        continue;
                    }
                    b9.addAll((Collection)object);
                    this.c += object.size();
                    continue;
                }
                if (this.d.containsKey((Object)n8)) continue;
                this.d.put((Object)n8, (Object)0);
                if (n8 == 22 && Build.VERSION.SDK_INT < 30) {
                    object = this.d;
                    b8 = Integer.valueOf((int)2);
                } else {
                    object = this.d;
                    b8 = Integer.valueOf((int)0);
                }
            }
            object.put((Object)n8, (Object)b8);
        }
        if (b9.size() > 0) {
            w.a.l(activity, (String[])b9.toArray((Object[])new String[0]), 24);
        }
        if (this.c == 0) {
            this.a.a(this.d);
        }
    }

    public void i(int n8, Activity activity, c c8, w1.b b8) {
        if (activity == null) {
            Log.d((String)"permissions_handler", (String)"Unable to detect current Activity.");
            b8.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        b8 = u.b((Context)activity, n8);
        if (b8 == null) {
            activity = new StringBuilder();
            activity.append("No android specific permissions needed for: ");
            activity.append(n8);
            Log.d((String)"permissions_handler", (String)activity.toString());
            c8.a(false);
            return;
        }
        if (b8.isEmpty()) {
            activity = new StringBuilder();
            activity.append("No permissions found in manifest for: ");
            activity.append(n8);
            activity.append(" no need to show request rationale");
            Log.d((String)"permissions_handler", (String)activity.toString());
            c8.a(false);
            return;
        }
        c8.a(w.a.m(activity, (String)b8.get(0)));
    }

    public static interface a {
        public void a(int var1);
    }

    public static interface b {
        public void a(Map var1);
    }

    public static interface c {
        public void a(boolean var1);
    }

}

