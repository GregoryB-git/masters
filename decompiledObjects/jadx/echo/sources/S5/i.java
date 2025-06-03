package S5;

import S5.a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import q.AbstractC1879b;
import q.c;

/* loaded from: classes.dex */
public final class i implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5918a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5919b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f5920c;

    public interface a {
        String a(Intent intent);
    }

    public i(final Context context) {
        this(context, new a() { // from class: S5.h
            @Override // S5.i.a
            public final String a(Intent intent) {
                String j7;
                j7 = i.j(context, intent);
                return j7;
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean g(Map map) {
        Iterator it = map.keySet().iterator();
        while (true) {
            char c7 = 0;
            if (!it.hasNext()) {
                return false;
            }
            String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
            lowerCase.hashCode();
            switch (lowerCase.hashCode()) {
                case -1423461112:
                    if (lowerCase.equals("accept")) {
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1229727188:
                    if (lowerCase.equals("content-language")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 785670158:
                    if (lowerCase.equals("content-type")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 802785917:
                    if (lowerCase.equals("accept-language")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                case 1:
                case 2:
                case 3:
                default:
                    return true;
            }
        }
    }

    public static Bundle i(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static /* synthetic */ String j(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    public static boolean k(Context context, Uri uri, Bundle bundle) {
        q.c a7 = new c.b().a();
        a7.f18592a.putExtra("com.android.browser.headers", bundle);
        try {
            a7.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // S5.a.b
    public Boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.f5919b.a(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // S5.a.b
    public Boolean b(String str, Boolean bool, a.d dVar) {
        h();
        Bundle i7 = i(dVar.d());
        if (bool.booleanValue() && !g(dVar.d())) {
            if (k(this.f5920c, Uri.parse(str), i7)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f5920c.startActivity(WebViewActivity.a(this.f5920c, str, dVar.c().booleanValue(), dVar.b().booleanValue(), i7));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // S5.a.b
    public void c() {
        this.f5918a.sendBroadcast(new Intent("close action"));
    }

    @Override // S5.a.b
    public Boolean d(String str, Map map) {
        h();
        try {
            this.f5920c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", i(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // S5.a.b
    public Boolean e() {
        return Boolean.valueOf(AbstractC1879b.a(this.f5918a, Collections.emptyList()) != null);
    }

    public final void h() {
        if (this.f5920c == null) {
            throw new a.C0096a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    public void l(Activity activity) {
        this.f5920c = activity;
    }

    public i(Context context, a aVar) {
        this.f5918a = context;
        this.f5919b = aVar;
    }
}
