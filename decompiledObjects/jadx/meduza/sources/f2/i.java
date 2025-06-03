package f2;

import b.z;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lc.k;

/* loaded from: classes.dex */
public final class i implements Comparable<i> {
    public static final i f;

    /* renamed from: a, reason: collision with root package name */
    public final int f5321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5323c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5324d;

    /* renamed from: e, reason: collision with root package name */
    public final rb.g f5325e = z.n(new b());

    public static final class a {
        public static i a(String str) {
            String group;
            if (str != null && !k.t0(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                            ec.i.d(group4, "description");
                            return new i(parseInt, parseInt2, parseInt3, group4);
                        }
                    }
                }
            }
            return null;
        }
    }

    public static final class b extends ec.j implements dc.a<BigInteger> {
        public b() {
            super(0);
        }

        @Override // dc.a
        public final BigInteger invoke() {
            return BigInteger.valueOf(i.this.f5321a).shiftLeft(32).or(BigInteger.valueOf(i.this.f5322b)).shiftLeft(32).or(BigInteger.valueOf(i.this.f5323c));
        }
    }

    static {
        new i(0, 0, 0, "");
        f = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i10, int i11, int i12, String str) {
        this.f5321a = i10;
        this.f5322b = i11;
        this.f5323c = i12;
        this.f5324d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i iVar2 = iVar;
        ec.i.e(iVar2, "other");
        Object value = this.f5325e.getValue();
        ec.i.d(value, "<get-bigInteger>(...)");
        Object value2 = iVar2.f5325e.getValue();
        ec.i.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5321a == iVar.f5321a && this.f5322b == iVar.f5322b && this.f5323c == iVar.f5323c;
    }

    public final int hashCode() {
        return ((((527 + this.f5321a) * 31) + this.f5322b) * 31) + this.f5323c;
    }

    public final String toString() {
        String str;
        if (!k.t0(this.f5324d)) {
            str = '-' + this.f5324d;
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5321a);
        sb2.append('.');
        sb2.append(this.f5322b);
        sb2.append('.');
        return a0.j.m(sb2, this.f5323c, str);
    }
}
