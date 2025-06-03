package okhttp3;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface CookieJar {

    /* renamed from: a, reason: collision with root package name */
    public static final CookieJar f12228a = new CookieJar() { // from class: okhttp3.CookieJar.1
        @Override // okhttp3.CookieJar
        public final List a() {
            return Collections.emptyList();
        }

        @Override // okhttp3.CookieJar
        public final void b() {
        }
    };

    List a();

    void b();
}
