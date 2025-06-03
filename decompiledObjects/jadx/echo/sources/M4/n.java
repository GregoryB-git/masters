package M4;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final URL f3563a;

    public n(URL url) {
        this.f3563a = url;
    }

    public URLConnection a() {
        return this.f3563a.openConnection();
    }

    public String toString() {
        return this.f3563a.toString();
    }
}
