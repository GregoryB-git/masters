package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public int getOffsetAfter(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = length - 1;
        if (i10 >= i11) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i10);
        int charCount = Character.charCount(codePointAt);
        int i12 = i10 + charCount;
        int i13 = 0;
        if (i12 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i12) == 13) {
                charCount++;
            }
            return i10 + charCount;
        }
        if (isRegionalIndicatorSymbol(codePointAt)) {
            if (i12 >= i11 || !isRegionalIndicatorSymbol(Character.codePointAt(charSequence, i12))) {
                return i12;
            }
            int i14 = i10;
            while (i14 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i10))) {
                i14 -= Character.charCount(Character.codePointBefore(charSequence, i10));
                i13++;
            }
            if (i13 % 2 == 0) {
                charCount += 2;
            }
            return i10 + charCount;
        }
        if (isKeycapBase(codePointAt)) {
            charCount += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i12);
            int charCount2 = Character.charCount(codePointBefore) + i12;
            if (charCount2 < length && isVariationSelector(codePointBefore)) {
                int codePointAt2 = Character.codePointAt(charSequence, charCount2);
                if (isKeycapBase(codePointAt2)) {
                    charCount = Character.charCount(codePointAt2) + Character.charCount(codePointBefore) + charCount;
                }
            } else if (isKeycapBase(codePointBefore)) {
                charCount += Character.charCount(codePointBefore);
            }
            return i10 + charCount;
        }
        if (isEmoji(codePointAt)) {
            boolean z10 = false;
            int i15 = 0;
            do {
                if (z10) {
                    charCount = Character.charCount(codePointAt) + i15 + 1 + charCount;
                    z10 = false;
                }
                if (isEmojiModifier(codePointAt)) {
                    break;
                }
                if (i12 < length) {
                    codePointAt = Character.codePointAt(charSequence, i12);
                    int charCount3 = Character.charCount(codePointAt) + i12;
                    if (codePointAt != 8419) {
                        if (isEmojiModifier(codePointAt) || isVariationSelector(codePointAt)) {
                            charCount += Character.charCount(codePointAt) + 0;
                            break;
                        }
                        if (codePointAt == 8205) {
                            codePointAt = Character.codePointAt(charSequence, charCount3);
                            i12 = Character.charCount(codePointAt) + charCount3;
                            if (i12 >= length || !isVariationSelector(codePointAt)) {
                                i15 = 0;
                            } else {
                                codePointAt = Character.codePointAt(charSequence, i12);
                                int charCount4 = Character.charCount(codePointAt);
                                i12 = Character.charCount(codePointAt) + i12;
                                i15 = charCount4;
                            }
                            z10 = true;
                            if (i12 < length || !z10) {
                                break;
                                break;
                            }
                        } else {
                            i12 = charCount3;
                        }
                    } else {
                        int codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                        int charCount5 = Character.charCount(codePointBefore2) + charCount3;
                        if (charCount5 < length && isVariationSelector(codePointBefore2)) {
                            int codePointAt3 = Character.codePointAt(charSequence, charCount5);
                            if (isKeycapBase(codePointAt3)) {
                                charCount = Character.charCount(codePointAt3) + Character.charCount(codePointBefore2) + charCount;
                            }
                        } else if (isKeycapBase(codePointBefore2)) {
                            charCount += Character.charCount(codePointBefore2);
                        }
                        return i10 + charCount;
                    }
                }
                i15 = 0;
                if (i12 < length) {
                    break;
                }
            } while (isEmoji(codePointAt));
        }
        return i10 + charCount;
    }

    public int getOffsetBefore(CharSequence charSequence, int i10) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i11 = 0;
        int i12 = 1;
        if (i10 <= 1 || (charCount2 = i10 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i10))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i10 - charCount;
        }
        if (isRegionalIndicatorSymbol(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount3 > 0 && isRegionalIndicatorSymbol(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                charCount3 -= Character.charCount(codePointBefore2);
                i12++;
            }
            if (i12 % 2 == 0) {
                charCount += 2;
            }
            return i10 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount4 > 0 && isVariationSelector(codePointBefore3)) {
                int codePointBefore4 = Character.codePointBefore(charSequence, charCount4);
                if (isKeycapBase(codePointBefore4)) {
                    charCount = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3) + charCount;
                }
            } else if (isKeycapBase(codePointBefore3)) {
                charCount += Character.charCount(codePointBefore3);
            }
            return i10 - charCount;
        }
        if (codePointBefore == 917631) {
            while (true) {
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount2 -= Character.charCount(codePointBefore);
                if (charCount2 <= 0 || !isTagSpecChar(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
            }
            if (!isEmoji(codePointBefore)) {
                return i10 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (isVariationSelector(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!isEmoji(codePointBefore)) {
                return i10 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (isEmoji(codePointBefore)) {
            boolean z10 = false;
            int i13 = 0;
            while (true) {
                if (z10) {
                    charCount = Character.charCount(codePointBefore) + i13 + 1 + charCount;
                    z10 = false;
                }
                if (isEmojiModifier(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount5 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount5 > 0 && isVariationSelector(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount5);
                        if (!isEmoji(codePointBefore5)) {
                            return i10 - charCount;
                        }
                        i11 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (isEmojiModifierBase(codePointBefore5)) {
                        charCount += Character.charCount(codePointBefore5) + i11;
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !isVariationSelector(codePointBefore)) {
                                i13 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount6 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i13 = charCount6;
                            }
                            z10 = true;
                            if (charCount2 != 0 || !z10 || !isEmoji(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i13 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i10 - charCount;
    }

    public boolean isEmoji(int i10) {
        return this.flutterJNI.isCodePointEmoji(i10);
    }

    public boolean isEmojiModifier(int i10) {
        return this.flutterJNI.isCodePointEmojiModifier(i10);
    }

    public boolean isEmojiModifierBase(int i10) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i10);
    }

    public boolean isKeycapBase(int i10) {
        return (48 <= i10 && i10 <= 57) || i10 == 35 || i10 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i10) {
        return this.flutterJNI.isCodePointRegionalIndicator(i10);
    }

    public boolean isTagSpecChar(int i10) {
        return 917536 <= i10 && i10 <= 917630;
    }

    public boolean isVariationSelector(int i10) {
        return this.flutterJNI.isCodePointVariantSelector(i10);
    }
}
