package x2;

import java.util.concurrent.Callable;

/* renamed from: x2.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2183M extends C2185O {

    /* renamed from: f, reason: collision with root package name */
    public final Callable f21159f;

    public /* synthetic */ C2183M(Callable callable, AbstractC2182L abstractC2182L) {
        super();
        this.f21159f = callable;
    }

    @Override // x2.C2185O
    public final String a() {
        try {
            return (String) this.f21159f.call();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
