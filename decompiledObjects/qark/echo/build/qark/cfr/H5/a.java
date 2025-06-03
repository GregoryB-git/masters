/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package H5;

import A5.a;
import B5.c;
import D5.r;
import E5.k;
import E5.m;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w1.w;
import w1.x;

public class a
implements A5.a,
B5.a,
m,
r.b {
    public final r a;
    public final PackageManager b;
    public c c;
    public Map d;
    public Map e = new HashMap();

    public a(r r8) {
        this.a = r8;
        this.b = r8.b;
        r8.b(this);
    }

    @Override
    public boolean a(int n8, int n9, Intent object) {
        if (!this.e.containsKey((Object)n8)) {
            return false;
        }
        object = n9 == -1 ? object.getStringExtra("android.intent.extra.PROCESS_TEXT") : null;
        ((k.d)this.e.remove((Object)n8)).a(object);
        return true;
    }

    @Override
    public Map b() {
        if (this.d == null) {
            this.d();
        }
        HashMap hashMap = new HashMap();
        for (String string2 : this.d.keySet()) {
            hashMap.put((Object)string2, (Object)((ResolveInfo)this.d.get((Object)string2)).loadLabel(this.b).toString());
        }
        return hashMap;
    }

    @Override
    public void c(String string2, String string3, boolean bl, k.d d8) {
        if (this.c == null) {
            d8.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.d;
        if (map == null) {
            d8.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        if ((string2 = (ResolveInfo)map.get((Object)string2)) == null) {
            d8.b("error", "Text processing activity not found", null);
            return;
        }
        int n8 = d8.hashCode();
        this.e.put((Object)n8, (Object)d8);
        d8 = new Intent();
        string2 = string2.activityInfo;
        d8.setClassName(string2.packageName, string2.name);
        d8.setAction("android.intent.action.PROCESS_TEXT");
        d8.setType("text/plain");
        d8.putExtra("android.intent.extra.PROCESS_TEXT", string3);
        d8.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", bl);
        this.c.c().startActivityForResult((Intent)d8, n8);
    }

    public final void d() {
        this.d = new HashMap();
        int n8 = Build.VERSION.SDK_INT;
        Intent intent = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        intent = n8 >= 33 ? x.a(this.b, intent, w.a(0L)) : this.b.queryIntentActivities(intent, 0);
        for (ResolveInfo resolveInfo : intent) {
            String string2 = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.b).toString();
            this.d.put((Object)string2, (Object)resolveInfo);
        }
    }

    @Override
    public void onAttachedToActivity(c c8) {
        this.c = c8;
        c8.h(this);
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
    }

    @Override
    public void onDetachedFromActivity() {
        this.c.d(this);
        this.c = null;
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.c.d(this);
        this.c = null;
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
    }

    @Override
    public void onReattachedToActivityForConfigChanges(c c8) {
        this.c = c8;
        c8.h(this);
    }
}

