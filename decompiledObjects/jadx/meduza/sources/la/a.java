package la;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import defpackage.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f9809a;

    /* renamed from: p, reason: collision with root package name */
    public long f9815p;

    /* renamed from: q, reason: collision with root package name */
    public int f9816q;

    /* renamed from: r, reason: collision with root package name */
    public String f9817r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f9818s;

    /* renamed from: u, reason: collision with root package name */
    public String[] f9819u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f9820v;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f9810b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f9811c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9812d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9813e = 0;
    public int f = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f9814o = 0;
    public int t = 1;

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f9818s = iArr;
        iArr[0] = 6;
        this.f9819u = new String[32];
        this.f9820v = new int[32];
        this.f9809a = stringReader;
    }

    public final boolean C(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f9810b;
        int i13 = this.f;
        int i14 = this.f9811c;
        this.f = i13 - i14;
        int i15 = this.f9812d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f9812d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f9812d = 0;
        }
        this.f9811c = 0;
        do {
            Reader reader = this.f9809a;
            int i17 = this.f9812d;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f9812d + read;
            this.f9812d = i11;
            if (this.f9813e == 0 && (i12 = this.f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f9811c++;
                this.f = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String H() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i10 = 0; i10 < this.t; i10++) {
            int i11 = this.f9818s[i10];
            if (i11 == 1 || i11 == 2) {
                int i12 = this.f9820v[i10];
                sb2.append('[');
                sb2.append(i12);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = this.f9819u[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public final boolean I() {
        int i10 = this.f9814o;
        if (i10 == 0) {
            i10 = g();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public final boolean M(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            return false;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        throw null;
    }

    public final String Q() {
        return " at line " + (this.f9813e + 1) + " column " + ((this.f9811c - this.f) + 1) + " path " + H();
    }

    public final int b0(boolean z10) {
        char[] cArr = this.f9810b;
        int i10 = this.f9811c;
        int i11 = this.f9812d;
        while (true) {
            if (i10 == i11) {
                this.f9811c = i10;
                if (!C(1)) {
                    if (!z10) {
                        return -1;
                    }
                    StringBuilder l10 = f.l("End of input");
                    l10.append(Q());
                    throw new EOFException(l10.toString());
                }
                i10 = this.f9811c;
                i11 = this.f9812d;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f9813e++;
                this.f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 != '/') {
                    this.f9811c = i12;
                    if (c10 != '#') {
                        return c10;
                    }
                    f();
                    throw null;
                }
                this.f9811c = i12;
                if (i12 == i11) {
                    this.f9811c = i12 - 1;
                    boolean C = C(2);
                    this.f9811c++;
                    if (!C) {
                        return c10;
                    }
                }
                f();
                throw null;
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ce, code lost:
    
        r0 = defpackage.f.l("\\u");
        r0.append(new java.lang.String(r11.f9810b, r11.f9811c, 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e9, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c0(char r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.c0(char):java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9814o = 0;
        this.f9818s[0] = 8;
        this.t = 1;
        this.f9809a.close();
    }

    public final void f() {
        l0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a7, code lost:
    
        if (M(r7) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a9, code lost:
    
        if (r14 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ab, code lost:
    
        if (r16 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b1, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b3, code lost:
    
        if (r17 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b7, code lost:
    
        if (r9 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b9, code lost:
    
        if (r17 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bb, code lost:
    
        if (r17 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01be, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01bf, code lost:
    
        r20.f9815p = r9;
        r20.f9811c += r5;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d5, code lost:
    
        r5 = r1;
        r20.f9814o = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        if (r14 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cc, code lost:
    
        if (r14 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cf, code lost:
    
        if (r14 != 7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d1, code lost:
    
        r20.f9816q = r5;
        r1 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g() {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.g():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004b, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004e, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.f9811c
            int r5 = r4 + r2
            int r6 = r7.f9812d
            if (r5 >= r6) goto L4f
            char[] r5 = r7.f9810b
            int r4 = r4 + r2
            char r4 = r5[r4]
            r5 = 9
            if (r4 == r5) goto L5d
            r5 = 10
            if (r4 == r5) goto L5d
            r5 = 12
            if (r4 == r5) goto L5d
            r5 = 13
            if (r4 == r5) goto L5d
            r5 = 32
            if (r4 == r5) goto L5d
            r5 = 35
            if (r4 == r5) goto L4b
            r5 = 44
            if (r4 == r5) goto L5d
            r5 = 47
            if (r4 == r5) goto L4b
            r5 = 61
            if (r4 == r5) goto L4b
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5d
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5d
            r5 = 58
            if (r4 == r5) goto L5d
            r5 = 59
            if (r4 == r5) goto L4b
            switch(r4) {
                case 91: goto L5d;
                case 92: goto L4b;
                case 93: goto L5d;
                default: goto L48;
            }
        L48:
            int r2 = r2 + 1
            goto L4
        L4b:
            r7.f()
            throw r1
        L4f:
            char[] r4 = r7.f9810b
            int r4 = r4.length
            if (r2 >= r4) goto L5f
            int r4 = r2 + 1
            boolean r4 = r7.C(r4)
            if (r4 == 0) goto L5d
            goto L4
        L5d:
            r0 = r2
            goto L7f
        L5f:
            if (r3 != 0) goto L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L6c:
            char[] r4 = r7.f9810b
            int r5 = r7.f9811c
            r3.append(r4, r5, r2)
            int r4 = r7.f9811c
            int r4 = r4 + r2
            r7.f9811c = r4
            r2 = 1
            boolean r2 = r7.C(r2)
            if (r2 != 0) goto L9c
        L7f:
            if (r3 != 0) goto L8b
            java.lang.String r1 = new java.lang.String
            char[] r2 = r7.f9810b
            int r3 = r7.f9811c
            r1.<init>(r2, r3, r0)
            goto L96
        L8b:
            char[] r1 = r7.f9810b
            int r2 = r7.f9811c
            r3.append(r1, r2, r0)
            java.lang.String r1 = r3.toString()
        L96:
            int r2 = r7.f9811c
            int r2 = r2 + r0
            r7.f9811c = r2
            return r1
        L9c:
            r2 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.h0():java.lang.String");
    }

    public final int i0() {
        int i10 = this.f9814o;
        if (i10 == 0) {
            i10 = g();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void k0(int i10) {
        int i11 = this.t;
        int[] iArr = this.f9818s;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f9818s = Arrays.copyOf(iArr, i12);
            this.f9820v = Arrays.copyOf(this.f9820v, i12);
            this.f9819u = (String[]) Arrays.copyOf(this.f9819u, i12);
        }
        int[] iArr2 = this.f9818s;
        int i13 = this.t;
        this.t = i13 + 1;
        iArr2[i13] = i10;
    }

    public final void l0(String str) {
        StringBuilder l10 = f.l(str);
        l10.append(Q());
        throw new y3.a(l10.toString());
    }

    public final String toString() {
        return a.class.getSimpleName() + Q();
    }
}
