package mc;

import java.util.concurrent.TimeUnit;
import p2.m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f11156b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f11157c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f11158d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f11159e;
    public static final c f;

    /* renamed from: o, reason: collision with root package name */
    public static final c f11160o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c[] f11161p;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f11162a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f11156b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f11157c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f11158d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f11159e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f11160o = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f11161p = cVarArr;
        m0.D(cVarArr);
    }

    public c(String str, int i10, TimeUnit timeUnit) {
        this.f11162a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11161p.clone();
    }
}
