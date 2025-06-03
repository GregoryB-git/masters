package p0;

import java.util.UUID;

/* loaded from: classes.dex */
public final class G implements j0.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f18222d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f18223a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18225c;

    static {
        boolean z7;
        if ("Amazon".equals(g0.M.f14263c)) {
            String str = g0.M.f14264d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z7 = true;
                f18222d = z7;
            }
        }
        z7 = false;
        f18222d = z7;
    }

    public G(UUID uuid, byte[] bArr, boolean z7) {
        this.f18223a = uuid;
        this.f18224b = bArr;
        this.f18225c = z7;
    }
}
