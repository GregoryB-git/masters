package l5;

import java.util.Map;
import java.util.Objects;

/* renamed from: l5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1628p {

    /* renamed from: a, reason: collision with root package name */
    public final String f17287a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17288b;

    public C1628p(String str, Map map) {
        this.f17287a = str;
        this.f17288b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1628p c1628p = (C1628p) obj;
        return this.f17287a.equals(c1628p.f17287a) && Objects.equals(this.f17288b, c1628p.f17288b);
    }

    public int hashCode() {
        return Objects.hash(this.f17287a, this.f17288b);
    }
}
