package c1;

import X2.AbstractC0703v;
import java.util.List;

/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0816e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0703v f10019a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10020b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10021c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10022d;

    public C0816e(List list, long j7, long j8) {
        this.f10019a = AbstractC0703v.U(list);
        this.f10020b = j7;
        this.f10021c = j8;
        long j9 = -9223372036854775807L;
        if (j7 != -9223372036854775807L && j8 != -9223372036854775807L) {
            j9 = j7 + j8;
        }
        this.f10022d = j9;
    }
}
