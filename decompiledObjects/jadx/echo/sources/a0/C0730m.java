package a0;

import android.text.TextUtils;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0730m implements InterfaceC0724g {

    /* renamed from: a, reason: collision with root package name */
    public String f7991a;

    /* renamed from: b, reason: collision with root package name */
    public int f7992b;

    /* renamed from: c, reason: collision with root package name */
    public int f7993c;

    public C0730m(String str, int i7, int i8) {
        this.f7991a = str;
        this.f7992b = i7;
        this.f7993c = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0730m)) {
            return false;
        }
        C0730m c0730m = (C0730m) obj;
        return (this.f7992b < 0 || c0730m.f7992b < 0) ? TextUtils.equals(this.f7991a, c0730m.f7991a) && this.f7993c == c0730m.f7993c : TextUtils.equals(this.f7991a, c0730m.f7991a) && this.f7992b == c0730m.f7992b && this.f7993c == c0730m.f7993c;
    }

    public int hashCode() {
        return H.c.b(this.f7991a, Integer.valueOf(this.f7993c));
    }
}
