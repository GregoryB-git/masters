package kb;

import defpackage.f;
import ib.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final kb.a f9239a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9240b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public kb.a f9241a;

        /* renamed from: b, reason: collision with root package name */
        public d.a f9242b = new d.a();

        public final void a(String str, String str2) {
            d.a aVar = this.f9242b;
            aVar.getClass();
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i12 = 0; i12 < length2; i12++) {
                char charAt2 = str2.charAt(i12);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i12), str2));
                }
            }
            while (i10 < aVar.f7915a.size()) {
                if (str.equalsIgnoreCase((String) aVar.f7915a.get(i10))) {
                    aVar.f7915a.remove(i10);
                    aVar.f7915a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            aVar.f7915a.add(str);
            aVar.f7915a.add(str2.trim());
        }
    }

    public b(a aVar) {
        this.f9239a = aVar.f9241a;
        d.a aVar2 = aVar.f9242b;
        aVar2.getClass();
        this.f9240b = new d(aVar2);
    }

    public final String toString() {
        StringBuilder l10 = f.l("Request{url=");
        l10.append(this.f9239a);
        l10.append('}');
        return l10.toString();
    }
}
