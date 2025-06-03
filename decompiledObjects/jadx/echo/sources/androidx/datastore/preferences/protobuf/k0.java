package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class k0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: o, reason: collision with root package name */
    public final List f9024o;

    public k0(O o7) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f9024o = null;
    }

    public C0778z a() {
        return new C0778z(getMessage());
    }
}
