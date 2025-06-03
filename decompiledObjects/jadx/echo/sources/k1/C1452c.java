package k1;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452c {

    /* renamed from: f, reason: collision with root package name */
    public int f16089f;

    /* renamed from: h, reason: collision with root package name */
    public int f16091h;

    /* renamed from: o, reason: collision with root package name */
    public float f16098o;

    /* renamed from: a, reason: collision with root package name */
    public String f16084a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f16085b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f16086c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public String f16087d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f16088e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16090g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16092i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f16093j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f16094k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f16095l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f16096m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f16097n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f16099p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16100q = false;

    public static int B(int i7, String str, String str2, int i8) {
        if (str.isEmpty() || i7 == -1) {
            return i7;
        }
        if (str.equals(str2)) {
            return i7 + i8;
        }
        return -1;
    }

    public C1452c A(boolean z7) {
        this.f16094k = z7 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f16092i) {
            return this.f16091h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f16100q;
    }

    public int c() {
        if (this.f16090g) {
            return this.f16089f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f16088e;
    }

    public float e() {
        return this.f16098o;
    }

    public int f() {
        return this.f16097n;
    }

    public int g() {
        return this.f16099p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f16084a.isEmpty() && this.f16085b.isEmpty() && this.f16086c.isEmpty() && this.f16087d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B7 = B(B(B(0, this.f16084a, str, 1073741824), this.f16085b, str2, 2), this.f16087d, str3, 4);
        if (B7 == -1 || !set.containsAll(this.f16086c)) {
            return 0;
        }
        return B7 + (this.f16086c.size() * 4);
    }

    public int i() {
        int i7 = this.f16095l;
        if (i7 == -1 && this.f16096m == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f16096m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f16092i;
    }

    public boolean k() {
        return this.f16090g;
    }

    public boolean l() {
        return this.f16093j == 1;
    }

    public boolean m() {
        return this.f16094k == 1;
    }

    public C1452c n(int i7) {
        this.f16091h = i7;
        this.f16092i = true;
        return this;
    }

    public C1452c o(boolean z7) {
        this.f16095l = z7 ? 1 : 0;
        return this;
    }

    public C1452c p(boolean z7) {
        this.f16100q = z7;
        return this;
    }

    public C1452c q(int i7) {
        this.f16089f = i7;
        this.f16090g = true;
        return this;
    }

    public C1452c r(String str) {
        this.f16088e = str == null ? null : W2.c.e(str);
        return this;
    }

    public C1452c s(float f7) {
        this.f16098o = f7;
        return this;
    }

    public C1452c t(int i7) {
        this.f16097n = i7;
        return this;
    }

    public C1452c u(boolean z7) {
        this.f16096m = z7 ? 1 : 0;
        return this;
    }

    public C1452c v(int i7) {
        this.f16099p = i7;
        return this;
    }

    public void w(String[] strArr) {
        this.f16086c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f16084a = str;
    }

    public void y(String str) {
        this.f16085b = str;
    }

    public void z(String str) {
        this.f16087d = str;
    }
}
