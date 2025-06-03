package a4;

import java.util.UUID;
import v5.e0;

/* loaded from: classes.dex */
public final class p implements z3.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f192d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f193a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f194b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f195c;

    static {
        boolean z10;
        if ("Amazon".equals(e0.f15883c)) {
            String str = e0.f15884d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f192d = z10;
            }
        }
        z10 = false;
        f192d = z10;
    }

    public p(UUID uuid, byte[] bArr, boolean z10) {
        this.f193a = uuid;
        this.f194b = bArr;
        this.f195c = z10;
    }
}
