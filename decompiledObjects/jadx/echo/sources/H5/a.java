package H5;

import A5.a;
import B5.c;
import D5.r;
import E5.k;
import E5.m;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements A5.a, B5.a, m, r.b {

    /* renamed from: a, reason: collision with root package name */
    public final r f2403a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManager f2404b;

    /* renamed from: c, reason: collision with root package name */
    public c f2405c;

    /* renamed from: d, reason: collision with root package name */
    public Map f2406d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2407e = new HashMap();

    public a(r rVar) {
        this.f2403a = rVar;
        this.f2404b = rVar.f1406b;
        rVar.b(this);
    }

    @Override // E5.m
    public boolean a(int i7, int i8, Intent intent) {
        if (!this.f2407e.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        ((k.d) this.f2407e.remove(Integer.valueOf(i7))).a(i8 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // D5.r.b
    public Map b() {
        if (this.f2406d == null) {
            d();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f2406d.keySet()) {
            hashMap.put(str, ((ResolveInfo) this.f2406d.get(str)).loadLabel(this.f2404b).toString());
        }
        return hashMap;
    }

    @Override // D5.r.b
    public void c(String str, String str2, boolean z7, k.d dVar) {
        if (this.f2405c == null) {
            dVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.f2406d;
        if (map == null) {
            dVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.b("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = dVar.hashCode();
        this.f2407e.put(Integer.valueOf(hashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z7);
        this.f2405c.c().startActivityForResult(intent, hashCode);
    }

    public final void d() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        this.f2406d = new HashMap();
        int i7 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        if (i7 >= 33) {
            PackageManager packageManager = this.f2404b;
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(type, of);
        } else {
            queryIntentActivities = this.f2404b.queryIntentActivities(type, 0);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f2404b).toString();
            this.f2406d.put(str, resolveInfo);
        }
    }

    @Override // B5.a
    public void onAttachedToActivity(c cVar) {
        this.f2405c = cVar;
        cVar.h(this);
    }

    @Override // B5.a
    public void onDetachedFromActivity() {
        this.f2405c.d(this);
        this.f2405c = null;
    }

    @Override // B5.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f2405c.d(this);
        this.f2405c = null;
    }

    @Override // B5.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.f2405c = cVar;
        cVar.h(this);
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
    }
}
