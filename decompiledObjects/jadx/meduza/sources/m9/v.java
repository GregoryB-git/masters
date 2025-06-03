package m9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eb.s0;
import eb.t0;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: g, reason: collision with root package name */
    public static final s0.b f10889g;

    /* renamed from: h, reason: collision with root package name */
    public static final s0.b f10890h;

    /* renamed from: i, reason: collision with root package name */
    public static final s0.b f10891i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile String f10892j;

    /* renamed from: a, reason: collision with root package name */
    public final n9.a f10893a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.a f10894b;

    /* renamed from: c, reason: collision with root package name */
    public final e9.a f10895c;

    /* renamed from: d, reason: collision with root package name */
    public final y f10896d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10897e;
    public final z f;

    public static abstract class a<T> {
    }

    static {
        s0.a aVar = s0.f5206d;
        BitSet bitSet = s0.d.f5211d;
        f10889g = new s0.b("x-goog-api-client", aVar);
        f10890h = new s0.b("google-cloud-resource-prefix", aVar);
        f10891i = new s0.b("x-goog-request-params", aVar);
        f10892j = "gl-java/";
    }

    public v(n9.a aVar, e9.a aVar2, e9.a aVar3, j9.f fVar, z zVar, y yVar) {
        this.f10893a = aVar;
        this.f = zVar;
        this.f10894b = aVar2;
        this.f10895c = aVar3;
        this.f10896d = yVar;
        this.f10897e = String.format("projects/%s/databases/%s", fVar.f8678a, fVar.f8679b);
    }

    public final s0 a() {
        s0 s0Var = new s0();
        s0Var.f(f10889g, String.format("%s fire/%s grpc/", f10892j, "25.1.2"));
        s0Var.f(f10890h, this.f10897e);
        s0Var.f(f10891i, this.f10897e);
        z zVar = this.f;
        if (zVar != null) {
            l lVar = (l) zVar;
            if (lVar.f10828a.get() != null && lVar.f10829b.get() != null) {
                int c10 = q0.g.c(lVar.f10828a.get().b());
                if (c10 != 0) {
                    s0Var.f(l.f10826d, Integer.toString(c10));
                }
                s0Var.f(l.f10827e, lVar.f10829b.get().a());
                u7.j jVar = lVar.f10830c;
                if (jVar != null) {
                    String str = jVar.f15097b;
                    if (str.length() != 0) {
                        s0Var.f(l.f, str);
                    }
                }
            }
        }
        return s0Var;
    }

    public final Task b(t0 t0Var, ma.w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f10896d.a(t0Var).addOnCompleteListener(this.f10893a.f11322a, new q(this, taskCompletionSource, wVar, 0));
        return taskCompletionSource.getTask();
    }
}
