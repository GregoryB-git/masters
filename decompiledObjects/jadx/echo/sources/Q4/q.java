package Q4;

import P4.t;

/* loaded from: classes.dex */
public class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f4470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4471b;

    public q(String str, int i7) {
        this.f4470a = str;
        this.f4471b = i7;
    }

    @Override // P4.t
    public double a() {
        if (this.f4471b == 0) {
            return 0.0d;
        }
        String g7 = g();
        try {
            return Double.valueOf(g7).doubleValue();
        } catch (NumberFormatException e7) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", g7, "double"), e7);
        }
    }

    @Override // P4.t
    public String b() {
        if (this.f4471b == 0) {
            return "";
        }
        h();
        return this.f4470a;
    }

    @Override // P4.t
    public long c() {
        if (this.f4471b == 0) {
            return 0L;
        }
        String g7 = g();
        try {
            return Long.valueOf(g7).longValue();
        } catch (NumberFormatException e7) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", g7, "long"), e7);
        }
    }

    @Override // P4.t
    public boolean d() {
        if (this.f4471b == 0) {
            return false;
        }
        String g7 = g();
        if (l.f4444f.matcher(g7).matches()) {
            return true;
        }
        if (l.f4445g.matcher(g7).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", g7, "boolean"));
    }

    @Override // P4.t
    public byte[] e() {
        return this.f4471b == 0 ? P4.m.f4248m : this.f4470a.getBytes(l.f4443e);
    }

    @Override // P4.t
    public int f() {
        return this.f4471b;
    }

    public final String g() {
        return b().trim();
    }

    public final void h() {
        if (this.f4470a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }
}
