package c5;

import java.util.Map;

/* loaded from: classes.dex */
public final class o implements V4.g {

    /* renamed from: a, reason: collision with root package name */
    public final j f10167a = new j();

    @Override // V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.UPC_A) {
            return this.f10167a.a("0".concat(String.valueOf(str)), V4.a.EAN_13, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
