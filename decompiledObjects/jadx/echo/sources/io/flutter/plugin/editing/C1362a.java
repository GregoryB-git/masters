package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: io.flutter.plugin.editing.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1362a {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f15016a;

    public C1362a(FlutterJNI flutterJNI) {
        this.f15016a = flutterJNI;
    }

    public int a(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = length - 1;
        if (i7 >= i8) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i7);
        int charCount = Character.charCount(codePointAt);
        int i9 = i7 + charCount;
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i9) == 13) {
                charCount++;
            }
            return i7 + charCount;
        }
        if (g(codePointAt)) {
            if (i9 >= i8 || !g(Character.codePointAt(charSequence, i9))) {
                return i9;
            }
            int i11 = i7;
            while (i11 > 0 && g(Character.codePointBefore(charSequence, i7))) {
                i11 -= Character.charCount(Character.codePointBefore(charSequence, i7));
                i10++;
            }
            if (i10 % 2 == 0) {
                charCount += 2;
            }
            return i7 + charCount;
        }
        if (f(codePointAt)) {
            charCount += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i9);
            int charCount2 = i9 + Character.charCount(codePointBefore);
            if (charCount2 < length && i(codePointBefore)) {
                int codePointAt2 = Character.codePointAt(charSequence, charCount2);
                if (f(codePointAt2)) {
                    charCount += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                }
            } else if (f(codePointBefore)) {
                charCount += Character.charCount(codePointBefore);
            }
            return i7 + charCount;
        }
        if (c(codePointAt)) {
            boolean z7 = false;
            int i12 = 0;
            do {
                if (z7) {
                    charCount += Character.charCount(codePointAt) + i12 + 1;
                    z7 = false;
                }
                if (d(codePointAt)) {
                    break;
                }
                if (i9 < length) {
                    codePointAt = Character.codePointAt(charSequence, i9);
                    i9 += Character.charCount(codePointAt);
                    if (codePointAt != 8419) {
                        if (!d(codePointAt) && !i(codePointAt)) {
                            if (codePointAt == 8205) {
                                codePointAt = Character.codePointAt(charSequence, i9);
                                i9 += Character.charCount(codePointAt);
                                if (i9 >= length || !i(codePointAt)) {
                                    i12 = 0;
                                } else {
                                    codePointAt = Character.codePointAt(charSequence, i9);
                                    int charCount3 = Character.charCount(codePointAt);
                                    i9 += Character.charCount(codePointAt);
                                    i12 = charCount3;
                                }
                                z7 = true;
                                if (i9 < length || !z7) {
                                    break;
                                    break;
                                }
                            }
                        } else {
                            charCount += Character.charCount(codePointAt);
                            break;
                        }
                    } else {
                        int codePointBefore2 = Character.codePointBefore(charSequence, i9);
                        int charCount4 = i9 + Character.charCount(codePointBefore2);
                        if (charCount4 < length && i(codePointBefore2)) {
                            int codePointAt3 = Character.codePointAt(charSequence, charCount4);
                            if (f(codePointAt3)) {
                                charCount += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                            }
                        } else if (f(codePointBefore2)) {
                            charCount += Character.charCount(codePointBefore2);
                        }
                        return i7 + charCount;
                    }
                }
                i12 = 0;
                if (i9 < length) {
                    break;
                }
            } while (c(codePointAt));
        }
        return i7 + charCount;
    }

    public int b(CharSequence charSequence, int i7) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i8 = 0;
        int i9 = 1;
        if (i7 <= 1 || (charCount2 = i7 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i7))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i7 - charCount;
        }
        if (g(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount3 > 0 && g(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                charCount3 -= Character.charCount(codePointBefore2);
                i9++;
            }
            if (i9 % 2 == 0) {
                charCount += 2;
            }
            return i7 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount4 > 0 && i(codePointBefore3)) {
                int codePointBefore4 = Character.codePointBefore(charSequence, charCount4);
                if (f(codePointBefore4)) {
                    charCount += Character.charCount(codePointBefore3) + Character.charCount(codePointBefore4);
                }
            } else if (f(codePointBefore3)) {
                charCount += Character.charCount(codePointBefore3);
            }
            return i7 - charCount;
        }
        if (codePointBefore == 917631) {
            while (true) {
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount2 -= Character.charCount(codePointBefore);
                if (charCount2 <= 0 || !h(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
            }
            if (!c(codePointBefore)) {
                return i7 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (i(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!c(codePointBefore)) {
                return i7 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (c(codePointBefore)) {
            boolean z7 = false;
            int i10 = 0;
            while (true) {
                if (z7) {
                    charCount += Character.charCount(codePointBefore) + i10 + 1;
                    z7 = false;
                }
                if (d(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount5 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount5 > 0 && i(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount5);
                        if (!c(codePointBefore5)) {
                            return i7 - charCount;
                        }
                        i8 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (e(codePointBefore5)) {
                        charCount += i8 + Character.charCount(codePointBefore5);
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !i(codePointBefore)) {
                                i10 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount6 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i10 = charCount6;
                            }
                            z7 = true;
                            if (charCount2 != 0 || !z7 || !c(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i10 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i7 - charCount;
    }

    public boolean c(int i7) {
        return this.f15016a.isCodePointEmoji(i7);
    }

    public boolean d(int i7) {
        return this.f15016a.isCodePointEmojiModifier(i7);
    }

    public boolean e(int i7) {
        return this.f15016a.isCodePointEmojiModifierBase(i7);
    }

    public boolean f(int i7) {
        return (48 <= i7 && i7 <= 57) || i7 == 35 || i7 == 42;
    }

    public boolean g(int i7) {
        return this.f15016a.isCodePointRegionalIndicator(i7);
    }

    public boolean h(int i7) {
        return 917536 <= i7 && i7 <= 917630;
    }

    public boolean i(int i7) {
        return this.f15016a.isCodePointVariantSelector(i7);
    }
}
