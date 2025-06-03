package q0;

import android.net.Uri;
import g0.AbstractC1297a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18619a;

    public class a extends LinkedHashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f18620o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i7, float f7, boolean z7, int i8) {
            super(i7, f7, z7);
            this.f18620o = i8;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f18620o;
        }
    }

    public e(int i7) {
        this.f18619a = new a(i7 + 1, 1.0f, false, i7);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f18619a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f18619a.put((Uri) AbstractC1297a.e(uri), (byte[]) AbstractC1297a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f18619a.remove(AbstractC1297a.e(uri));
    }
}
