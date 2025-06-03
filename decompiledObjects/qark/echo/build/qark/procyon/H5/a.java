// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H5;

import java.util.List;
import w1.x;
import w1.w;
import android.os.Build$VERSION;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import E5.k;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import B5.c;
import android.content.pm.PackageManager;
import D5.r;
import E5.m;

public class a implements A5.a, B5.a, m, r.b
{
    public final r a;
    public final PackageManager b;
    public c c;
    public Map d;
    public Map e;
    
    public a(final r a) {
        this.e = new HashMap();
        this.a = a;
        this.b = a.b;
        a.b((r.b)this);
    }
    
    @Override
    public boolean a(final int n, final int n2, final Intent intent) {
        if (!this.e.containsKey(n)) {
            return false;
        }
        String stringExtra;
        if (n2 == -1) {
            stringExtra = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
        }
        else {
            stringExtra = null;
        }
        ((k.d)this.e.remove(n)).a(stringExtra);
        return true;
    }
    
    @Override
    public Map b() {
        if (this.d == null) {
            this.d();
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String s : this.d.keySet()) {
            hashMap.put(s, ((ResolveInfo)this.d.get(s)).loadLabel(this.b).toString());
        }
        return hashMap;
    }
    
    @Override
    public void c(final String s, final String s2, final boolean b, final k.d d) {
        if (this.c == null) {
            d.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        final Map d2 = this.d;
        if (d2 == null) {
            d.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        final ResolveInfo resolveInfo = d2.get(s);
        if (resolveInfo == null) {
            d.b("error", "Text processing activity not found", null);
            return;
        }
        final int hashCode = d.hashCode();
        this.e.put(hashCode, d);
        final Intent intent = new Intent();
        final ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", s2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", b);
        this.c.c().startActivityForResult(intent, hashCode);
    }
    
    public final void d() {
        this.d = new HashMap();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Intent setType = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        List list;
        if (sdk_INT >= 33) {
            list = x.a(this.b, setType, w.a(0L));
        }
        else {
            list = this.b.queryIntentActivities(setType, 0);
        }
        for (final ResolveInfo resolveInfo : list) {
            final String name = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.b).toString();
            this.d.put(name, resolveInfo);
        }
    }
    
    @Override
    public void onAttachedToActivity(final c c) {
        (this.c = c).h(this);
    }
    
    @Override
    public void onAttachedToEngine(final A5.a.b b) {
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
    public void onDetachedFromEngine(final A5.a.b b) {
    }
    
    @Override
    public void onReattachedToActivityForConfigChanges(final c c) {
        (this.c = c).h(this);
    }
}
