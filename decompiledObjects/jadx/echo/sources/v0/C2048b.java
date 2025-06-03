package v0;

import B0.p;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048b implements p.a {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f20108a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20109b;

    public C2048b(p.a aVar, List list) {
        this.f20108a = aVar;
        this.f20109b = list;
    }

    @Override // B0.p.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2047a a(Uri uri, InputStream inputStream) {
        InterfaceC2047a interfaceC2047a = (InterfaceC2047a) this.f20108a.a(uri, inputStream);
        List list = this.f20109b;
        return (list == null || list.isEmpty()) ? interfaceC2047a : (InterfaceC2047a) interfaceC2047a.a(this.f20109b);
    }
}
