package ib;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7909b;

    /* renamed from: c, reason: collision with root package name */
    public int f7910c;

    /* renamed from: d, reason: collision with root package name */
    public int f7911d;

    /* renamed from: e, reason: collision with root package name */
    public int f7912e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f7913g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f7908a = name;
        this.f7909b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f7909b) {
            StringBuilder l10 = defpackage.f.l("Malformed DN: ");
            l10.append(this.f7908a);
            throw new IllegalStateException(l10.toString());
        }
        char[] cArr = this.f7913g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                StringBuilder l11 = defpackage.f.l("Malformed DN: ");
                l11.append(this.f7908a);
                throw new IllegalStateException(l11.toString());
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                StringBuilder l12 = defpackage.f.l("Malformed DN: ");
                l12.append(this.f7908a);
                throw new IllegalStateException(l12.toString());
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    public final char b() {
        int i10;
        int i11 = this.f7910c + 1;
        this.f7910c = i11;
        if (i11 == this.f7909b) {
            StringBuilder l10 = defpackage.f.l("Unexpected end of DN: ");
            l10.append(this.f7908a);
            throw new IllegalStateException(l10.toString());
        }
        char c10 = this.f7913g[i11];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            break;
                        default:
                            int a10 = a(i11);
                            this.f7910c++;
                            if (a10 >= 128) {
                                if (a10 < 192 || a10 > 247) {
                                    return '?';
                                }
                                if (a10 <= 223) {
                                    a10 &= 31;
                                    i10 = 1;
                                } else if (a10 <= 239) {
                                    i10 = 2;
                                    a10 &= 15;
                                } else {
                                    i10 = 3;
                                    a10 &= 7;
                                }
                                for (int i12 = 0; i12 < i10; i12++) {
                                    int i13 = this.f7910c + 1;
                                    this.f7910c = i13;
                                    if (i13 == this.f7909b || this.f7913g[i13] != '\\') {
                                        return '?';
                                    }
                                    int i14 = i13 + 1;
                                    this.f7910c = i14;
                                    int a11 = a(i14);
                                    this.f7910c++;
                                    if ((a11 & 192) != 128) {
                                        return '?';
                                    }
                                    a10 = (a10 << 6) + (a11 & 63);
                                }
                            }
                            return (char) a10;
                    }
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    return c10;
            }
        }
        return c10;
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        int i14;
        char c11;
        char c12;
        while (true) {
            i10 = this.f7910c;
            i11 = this.f7909b;
            if (i10 >= i11 || this.f7913g[i10] != ' ') {
                break;
            }
            this.f7910c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f7911d = i10;
        do {
            this.f7910c = i10 + 1;
            i10 = this.f7910c;
            i12 = this.f7909b;
            if (i10 >= i12 || (c12 = this.f7913g[i10]) == '=') {
                break;
            }
        } while (c12 != ' ');
        if (i10 >= i12) {
            StringBuilder l10 = defpackage.f.l("Unexpected end of DN: ");
            l10.append(this.f7908a);
            throw new IllegalStateException(l10.toString());
        }
        this.f7912e = i10;
        if (this.f7913g[i10] == ' ') {
            while (true) {
                i13 = this.f7910c;
                i14 = this.f7909b;
                if (i13 >= i14 || (c11 = this.f7913g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.f7910c = i13 + 1;
            }
            if (this.f7913g[i13] != '=' || i13 == i14) {
                StringBuilder l11 = defpackage.f.l("Unexpected end of DN: ");
                l11.append(this.f7908a);
                throw new IllegalStateException(l11.toString());
            }
        }
        int i15 = this.f7910c;
        do {
            this.f7910c = i15 + 1;
            i15 = this.f7910c;
            if (i15 >= this.f7909b) {
                break;
            }
        } while (this.f7913g[i15] == ' ');
        int i16 = this.f7912e;
        int i17 = this.f7911d;
        if (i16 - i17 > 4) {
            char[] cArr = this.f7913g;
            if (cArr[i17 + 3] == '.' && (((c10 = cArr[i17]) == 'O' || c10 == 'o') && ((cArr[i17 + 1] == 'I' || cArr[i17 + 1] == 'i') && (cArr[i17 + 2] == 'D' || cArr[i17 + 2] == 'd')))) {
                this.f7911d = i17 + 4;
            }
        }
        char[] cArr2 = this.f7913g;
        int i18 = this.f7911d;
        return new String(cArr2, i18, i16 - i18);
    }
}
