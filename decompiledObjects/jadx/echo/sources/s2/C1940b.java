package s2;

import android.net.Uri;
import java.util.Map;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1940b extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Map f19225o;

    public C1940b(C1939a c1939a, Map map) {
        this.f19225o = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f19225o;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        AbstractC1942d.a(buildUpon.build().toString());
    }
}
