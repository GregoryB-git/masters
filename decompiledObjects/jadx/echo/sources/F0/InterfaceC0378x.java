package F0;

import android.net.Uri;
import java.util.Map;

/* renamed from: F0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0378x {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0378x f1958a = new InterfaceC0378x() { // from class: F0.v
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            return AbstractC0377w.b();
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    r[] a();

    r[] b(Uri uri, Map map);
}
