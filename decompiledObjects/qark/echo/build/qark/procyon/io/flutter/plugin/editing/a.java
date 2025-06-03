// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

public class a
{
    public final FlutterJNI a;
    
    public a(final FlutterJNI a) {
        this.a = a;
    }
    
    public int a(final CharSequence charSequence, final int index) {
        final int length = charSequence.length();
        final int n = length - 1;
        if (index >= n) {
            return length;
        }
        final int codePoint = Character.codePointAt(charSequence, index);
        final int charCount = Character.charCount(codePoint);
        final int index2 = index + charCount;
        int n2 = 0;
        if (index2 == 0) {
            return 0;
        }
        if (codePoint == 10) {
            int n3 = charCount;
            if (Character.codePointAt(charSequence, index2) == 13) {
                n3 = charCount + 1;
            }
            return index + n3;
        }
        if (this.g(codePoint)) {
            if (index2 >= n) {
                return index2;
            }
            if (!this.g(Character.codePointAt(charSequence, index2))) {
                return index2;
            }
            for (int n4 = index; n4 > 0 && this.g(Character.codePointBefore(charSequence, index)); n4 -= Character.charCount(Character.codePointBefore(charSequence, index)), ++n2) {}
            int n5 = charCount;
            if (n2 % 2 == 0) {
                n5 = charCount + 2;
            }
            return index + n5;
        }
        else {
            int n6 = charCount;
            if (this.f(codePoint)) {
                n6 = charCount + Character.charCount(codePoint);
            }
            if (codePoint == 8419) {
                final int codePointBefore = Character.codePointBefore(charSequence, index2);
                final int index3 = index2 + Character.charCount(codePointBefore);
                int n7;
                if (index3 < length && this.i(codePointBefore)) {
                    final int codePoint2 = Character.codePointAt(charSequence, index3);
                    n7 = n6;
                    if (this.f(codePoint2)) {
                        n7 = n6 + (Character.charCount(codePointBefore) + Character.charCount(codePoint2));
                    }
                }
                else {
                    n7 = n6;
                    if (this.f(codePointBefore)) {
                        n7 = n6 + Character.charCount(codePointBefore);
                    }
                }
                return index + n7;
            }
            int n8 = n6;
            if (this.c(codePoint)) {
                int charCount2;
                int n9 = charCount2 = 0;
                int n10 = index2;
                int n11 = n6;
                int codePoint3 = codePoint;
                int codePoint4 = 0;
                int n12;
                do {
                    n12 = n11;
                    int n13;
                    if ((n13 = n9) != 0) {
                        n12 = n11 + (Character.charCount(codePoint3) + charCount2 + 1);
                        n13 = 0;
                    }
                    if (this.d(codePoint3)) {
                        n8 = n12;
                        return index + n8;
                    }
                    Label_0649: {
                        int n14;
                        if ((n14 = n10) < length) {
                            final int codePoint5 = Character.codePointAt(charSequence, n10);
                            final int n15 = n10 + Character.charCount(codePoint5);
                            if (codePoint5 == 8419) {
                                final int codePointBefore2 = Character.codePointBefore(charSequence, n15);
                                final int index4 = n15 + Character.charCount(codePointBefore2);
                                int n16;
                                if (index4 < length && this.i(codePointBefore2)) {
                                    final int codePoint6 = Character.codePointAt(charSequence, index4);
                                    n16 = n12;
                                    if (this.f(codePoint6)) {
                                        n16 = n12 + (Character.charCount(codePointBefore2) + Character.charCount(codePoint6));
                                    }
                                }
                                else {
                                    n16 = n12;
                                    if (this.f(codePointBefore2)) {
                                        n16 = n12 + Character.charCount(codePointBefore2);
                                    }
                                }
                                return index + n16;
                            }
                            if (this.d(codePoint5) || this.i(codePoint5)) {
                                n8 = n12 + Character.charCount(codePoint5);
                                return index + n8;
                            }
                            codePoint3 = codePoint5;
                            n14 = n15;
                            if (codePoint5 == 8205) {
                                codePoint4 = Character.codePointAt(charSequence, n15);
                                n10 = n15 + Character.charCount(codePoint4);
                                if (n10 < length && this.i(codePoint4)) {
                                    codePoint4 = Character.codePointAt(charSequence, n10);
                                    charCount2 = Character.charCount(codePoint4);
                                    n10 += Character.charCount(codePoint4);
                                }
                                else {
                                    charCount2 = 0;
                                }
                                n9 = 1;
                                break Label_0649;
                            }
                        }
                        charCount2 = 0;
                        n9 = n13;
                        n10 = n14;
                        codePoint4 = codePoint3;
                    }
                    if (n10 >= length) {
                        n8 = n12;
                        return index + n8;
                    }
                    n8 = n12;
                    if (n9 == 0) {
                        return index + n8;
                    }
                    codePoint3 = codePoint4;
                    n11 = n12;
                } while (this.c(codePoint4));
                n8 = n12;
            }
            return index + n8;
        }
    }
    
    public int b(final CharSequence seq, final int index) {
        final int n = 0;
        int n2 = 1;
        if (index <= 1) {
            return 0;
        }
        final int codePointBefore = Character.codePointBefore(seq, index);
        int charCount = Character.charCount(codePointBefore);
        final int index2 = index - charCount;
        if (index2 == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            int n3 = charCount;
            if (Character.codePointBefore(seq, index2) == 13) {
                n3 = charCount + 1;
            }
            return index - n3;
        }
        if (this.g(codePointBefore)) {
            for (int n4 = Character.codePointBefore(seq, index2), index3 = index2 - Character.charCount(n4); index3 > 0 && this.g(n4); n4 = Character.codePointBefore(seq, index3), index3 -= Character.charCount(n4), ++n2) {}
            int n5 = charCount;
            if (n2 % 2 == 0) {
                n5 = charCount + 2;
            }
            return index - n5;
        }
        if (codePointBefore == 8419) {
            final int codePointBefore2 = Character.codePointBefore(seq, index2);
            final int index4 = index2 - Character.charCount(codePointBefore2);
            int n6;
            if (index4 > 0 && this.i(codePointBefore2)) {
                final int codePointBefore3 = Character.codePointBefore(seq, index4);
                n6 = charCount;
                if (this.f(codePointBefore3)) {
                    n6 = charCount + (Character.charCount(codePointBefore2) + Character.charCount(codePointBefore3));
                }
            }
            else {
                n6 = charCount;
                if (this.f(codePointBefore2)) {
                    n6 = charCount + Character.charCount(codePointBefore2);
                }
            }
            return index - n6;
        }
        int codePointBefore4 = codePointBefore;
        int n7 = charCount;
        int n8 = index2;
        if (codePointBefore == 917631) {
            n8 = index2;
            while (true) {
                codePointBefore4 = Character.codePointBefore(seq, n8);
                n8 -= Character.charCount(codePointBefore4);
                if (n8 <= 0 || !this.h(codePointBefore4)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore4);
            }
            if (!this.c(codePointBefore4)) {
                return index - 2;
            }
            n7 = charCount + Character.charCount(codePointBefore4);
        }
        int codePointBefore5 = codePointBefore4;
        int n9 = n7;
        int n10 = n8;
        if (this.i(codePointBefore4)) {
            codePointBefore5 = Character.codePointBefore(seq, n8);
            if (!this.c(codePointBefore5)) {
                return index - n7;
            }
            n9 = n7 + Character.charCount(codePointBefore5);
            n10 = n8 - n9;
        }
        int n11 = n9;
        if (this.c(codePointBefore5)) {
            int charCount2;
            int n12 = charCount2 = 0;
            int index5 = n10;
            int n13 = n9;
            int codePoint = codePointBefore5;
            int codePoint2 = 0;
            int n14;
            do {
                n14 = n13;
                int n15;
                if ((n15 = n12) != 0) {
                    n14 = n13 + (Character.charCount(codePoint) + charCount2 + 1);
                    n15 = 0;
                }
                if (this.d(codePoint)) {
                    final int codePointBefore6 = Character.codePointBefore(seq, index5);
                    final int index6 = index5 - Character.charCount(codePointBefore6);
                    int charCount3 = n;
                    int codePointBefore7 = codePointBefore6;
                    if (index6 > 0) {
                        charCount3 = n;
                        codePointBefore7 = codePointBefore6;
                        if (this.i(codePointBefore6)) {
                            codePointBefore7 = Character.codePointBefore(seq, index6);
                            if (!this.c(codePointBefore7)) {
                                return index - n14;
                            }
                            charCount3 = Character.charCount(codePointBefore7);
                            Character.charCount(codePointBefore7);
                        }
                    }
                    n11 = n14;
                    if (this.e(codePointBefore7)) {
                        n11 = n14 + (charCount3 + Character.charCount(codePointBefore7));
                        return index - n11;
                    }
                    return index - n11;
                }
                else {
                    Label_0709: {
                        int n16;
                        if ((n16 = index5) > 0) {
                            final int codePointBefore8 = Character.codePointBefore(seq, index5);
                            final int index7 = index5 - Character.charCount(codePointBefore8);
                            codePoint = codePointBefore8;
                            n16 = index7;
                            if (codePointBefore8 == 8205) {
                                codePoint2 = Character.codePointBefore(seq, index7);
                                index5 = index7 - Character.charCount(codePoint2);
                                if (index5 > 0 && this.i(codePoint2)) {
                                    codePoint2 = Character.codePointBefore(seq, index5);
                                    charCount2 = Character.charCount(codePoint2);
                                    index5 -= Character.charCount(codePoint2);
                                }
                                else {
                                    charCount2 = 0;
                                }
                                n12 = 1;
                                break Label_0709;
                            }
                        }
                        charCount2 = 0;
                        n12 = n15;
                        index5 = n16;
                        codePoint2 = codePoint;
                    }
                    if (index5 == 0) {
                        n11 = n14;
                        return index - n11;
                    }
                    n11 = n14;
                    if (n12 == 0) {
                        return index - n11;
                    }
                    codePoint = codePoint2;
                    n13 = n14;
                }
            } while (this.c(codePoint2));
            n11 = n14;
        }
        return index - n11;
    }
    
    public boolean c(final int n) {
        return this.a.isCodePointEmoji(n);
    }
    
    public boolean d(final int n) {
        return this.a.isCodePointEmojiModifier(n);
    }
    
    public boolean e(final int n) {
        return this.a.isCodePointEmojiModifierBase(n);
    }
    
    public boolean f(final int n) {
        return (48 <= n && n <= 57) || n == 35 || n == 42;
    }
    
    public boolean g(final int n) {
        return this.a.isCodePointRegionalIndicator(n);
    }
    
    public boolean h(final int n) {
        return 917536 <= n && n <= 917630;
    }
    
    public boolean i(final int n) {
        return this.a.isCodePointVariantSelector(n);
    }
}
