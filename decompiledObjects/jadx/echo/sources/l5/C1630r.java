package l5;

import java.util.Objects;

/* renamed from: l5.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1630r {

    /* renamed from: a, reason: collision with root package name */
    public final String f17293a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17294b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17295c;

    /* renamed from: d, reason: collision with root package name */
    public final C1628p f17296d;

    public C1630r(String str, String str2, long j7, C1628p c1628p) {
        this.f17293a = str;
        this.f17294b = str2;
        this.f17295c = j7;
        this.f17296d = c1628p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1630r)) {
            return false;
        }
        C1630r c1630r = (C1630r) obj;
        return this.f17293a.equals(c1630r.f17293a) && this.f17294b.equals(c1630r.f17294b) && this.f17295c == c1630r.f17295c && Objects.equals(this.f17296d, c1630r.f17296d);
    }
}
