package m9;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f10786a;

    /* renamed from: b, reason: collision with root package name */
    public final ma.h f10787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10788c;

    /* renamed from: d, reason: collision with root package name */
    public final MessageDigest f10789d;

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public g(ma.h hVar, int i10, int i11) {
        if (i10 < 0 || i10 >= 8) {
            throw new IllegalArgumentException(defpackage.f.h("Invalid padding: ", i10));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(defpackage.f.h("Invalid hash count: ", i11));
        }
        if (hVar.size() > 0 && i11 == 0) {
            throw new IllegalArgumentException(defpackage.f.h("Invalid hash count: ", i11));
        }
        if (hVar.size() == 0 && i10 != 0) {
            throw new IllegalArgumentException(defpackage.f.h("Expected padding of 0 when bitmap length is 0, but got ", i10));
        }
        this.f10787b = hVar;
        this.f10788c = i11;
        this.f10786a = (hVar.size() * 8) - i10;
        try {
            this.f10789d = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e10);
        }
    }

    public static g a(ma.h hVar, int i10, int i11) {
        if (i10 < 0 || i10 >= 8) {
            throw new a(defpackage.f.h("Invalid padding: ", i10));
        }
        if (i11 < 0) {
            throw new a(defpackage.f.h("Invalid hash count: ", i11));
        }
        if (hVar.size() > 0 && i11 == 0) {
            throw new a(defpackage.f.h("Invalid hash count: ", i11));
        }
        if (hVar.size() != 0 || i10 == 0) {
            return new g(hVar, i10, i11);
        }
        throw new a(defpackage.f.h("Expected padding of 0 when bitmap length is 0, but got ", i10));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BloomFilter{hashCount=");
        l10.append(this.f10788c);
        l10.append(", size=");
        l10.append(this.f10786a);
        l10.append(", bitmap=\"");
        l10.append(Base64.encodeToString(this.f10787b.z(), 2));
        l10.append("\"}");
        return l10.toString();
    }
}
