/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 */
package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

public class a {
    public final FlutterJNI a;

    public a(FlutterJNI flutterJNI) {
        this.a = flutterJNI;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(CharSequence var1_1, int var2_2) {
        var10_3 = var1_1.length();
        var6_4 = var10_3 - 1;
        if (var2_2 >= var6_4) {
            return var10_3;
        }
        var5_5 = Character.codePointAt((CharSequence)var1_1, (int)var2_2);
        var4_6 = Character.charCount((int)var5_5);
        var9_7 = var2_2 + var4_6;
        var3_8 = 0;
        if (var9_7 == 0) {
            return 0;
        }
        if (var5_5 == 10) {
            var3_8 = var4_6;
            if (Character.codePointAt((CharSequence)var1_1, (int)var9_7) != 13) return var2_2 + var3_8;
            var3_8 = var4_6 + 1;
            return var2_2 + var3_8;
        }
        if (this.g(var5_5)) {
            if (var9_7 >= var6_4) return var9_7;
            if (!this.g(Character.codePointAt((CharSequence)var1_1, (int)var9_7))) {
                return var9_7;
            }
            for (var5_5 = var2_2; var5_5 > 0 && this.g(Character.codePointBefore((CharSequence)var1_1, (int)var2_2)); var5_5 -= Character.charCount((int)Character.codePointBefore((CharSequence)var1_1, (int)var2_2)), ++var3_8) {
            }
            var5_5 = var4_6;
            if (var3_8 % 2 != 0) return var2_2 + var5_5;
            var5_5 = var4_6 + 2;
            return var2_2 + var5_5;
        }
        var3_8 = var4_6;
        if (this.f(var5_5)) {
            var3_8 = var4_6 + Character.charCount((int)var5_5);
        }
        if (var5_5 == 8419) {
            var5_5 = Character.codePointBefore((CharSequence)var1_1, (int)var9_7);
            var4_6 = var9_7 + Character.charCount((int)var5_5);
            if (var4_6 < var10_3 && this.i(var5_5)) {
                var6_4 = Character.codePointAt((CharSequence)var1_1, (int)var4_6);
                var4_6 = var3_8;
                if (this.f(var6_4) == false) return var2_2 + var4_6;
                var4_6 = var3_8 + (Character.charCount((int)var5_5) + Character.charCount((int)var6_4));
                return var2_2 + var4_6;
            }
            var4_6 = var3_8;
            if (this.f(var5_5) == false) return var2_2 + var4_6;
            var4_6 = var3_8 + Character.charCount((int)var5_5);
            return var2_2 + var4_6;
        }
        var6_4 = var3_8;
        if (this.c(var5_5) == false) return var2_2 + var6_4;
        var7_10 = var8_9 = 0;
        var4_6 = var9_7;
        var9_7 = var3_8;
        var6_4 = var5_5;
        do {
            var3_8 = var9_7;
            var5_5 = var8_9;
            if (var8_9 != 0) {
                var3_8 = var9_7 + (Character.charCount((int)var6_4) + var7_10 + 1);
                var5_5 = 0;
            }
            if (this.d(var6_4)) {
                var6_4 = var3_8;
                return var2_2 + var6_4;
            }
            var9_7 = var4_6;
            if (var4_6 >= var10_3) ** GOTO lbl-1000
            var7_10 = Character.codePointAt((CharSequence)var1_1, (int)var4_6);
            var4_6 += Character.charCount((int)var7_10);
            if (var7_10 == 8419) {
                if ((var4_6 += Character.charCount((int)(var5_5 = Character.codePointBefore((CharSequence)var1_1, (int)var4_6)))) < var10_3 && this.i(var5_5)) {
                    var6_4 = Character.codePointAt((CharSequence)var1_1, (int)var4_6);
                    var4_6 = var3_8;
                    if (this.f(var6_4) == false) return var2_2 + var4_6;
                    var4_6 = var3_8 + (Character.charCount((int)var5_5) + Character.charCount((int)var6_4));
                    return var2_2 + var4_6;
                }
                var4_6 = var3_8;
                if (this.f(var5_5) == false) return var2_2 + var4_6;
                var4_6 = var3_8 + Character.charCount((int)var5_5);
                return var2_2 + var4_6;
            }
            if (this.d(var7_10) || this.i(var7_10)) {
                var6_4 = var3_8 + Character.charCount((int)var7_10);
                return var2_2 + var6_4;
            }
            var6_4 = var7_10;
            var9_7 = var4_6;
            if (var7_10 == 8205) {
                if ((var4_6 += Character.charCount((int)(var5_5 = Character.codePointAt((CharSequence)var1_1, (int)var4_6)))) < var10_3 && this.i(var5_5)) {
                    var5_5 = Character.codePointAt((CharSequence)var1_1, (int)var4_6);
                    var7_10 = Character.charCount((int)var5_5);
                    var4_6 += Character.charCount((int)var5_5);
                } else {
                    var7_10 = 0;
                }
                var8_9 = 1;
            } else lbl-1000: // 2 sources:
            {
                var7_10 = 0;
                var8_9 = var5_5;
                var4_6 = var9_7;
                var5_5 = var6_4;
            }
            if (var4_6 >= var10_3) {
                var6_4 = var3_8;
                return var2_2 + var6_4;
            }
            var6_4 = var3_8;
            if (var8_9 == 0) return var2_2 + var6_4;
            var6_4 = var5_5;
            var9_7 = var3_8;
        } while (this.c(var5_5));
        var6_4 = var3_8;
        return var2_2 + var6_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int b(CharSequence var1_1, int var2_2) {
        var10_3 = 0;
        var4_4 = 1;
        if (var2_2 <= 1) {
            return 0;
        }
        var6_5 = Character.codePointBefore((CharSequence)var1_1, (int)var2_2);
        var3_6 = Character.charCount((int)var6_5);
        var5_7 = var2_2 - var3_6;
        if (var5_7 == 0) {
            return 0;
        }
        if (var6_5 == 10) {
            var4_4 = var3_6;
            if (Character.codePointBefore((CharSequence)var1_1, (int)var5_7) != 13) return var2_2 - var4_4;
            var4_4 = var3_6 + 1;
            return var2_2 - var4_4;
        }
        if (this.g(var6_5)) {
            var6_5 = Character.codePointBefore((CharSequence)var1_1, (int)var5_7);
            var5_7 -= Character.charCount((int)var6_5);
            while (var5_7 > 0 && this.g(var6_5)) {
                var6_5 = Character.codePointBefore((CharSequence)var1_1, (int)var5_7);
                var5_7 -= Character.charCount((int)var6_5);
                ++var4_4;
            }
            var5_7 = var3_6;
            if (var4_4 % 2 != 0) return var2_2 - var5_7;
            var5_7 = var3_6 + 2;
            return var2_2 - var5_7;
        }
        if (var6_5 == 8419) {
            var6_5 = Character.codePointBefore((CharSequence)var1_1, (int)var5_7);
            var4_4 = var5_7 - Character.charCount((int)var6_5);
            if (var4_4 > 0 && this.i(var6_5)) {
                var5_7 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4);
                var4_4 = var3_6;
                if (this.f(var5_7) == false) return var2_2 - var4_4;
                var4_4 = var3_6 + (Character.charCount((int)var6_5) + Character.charCount((int)var5_7));
                return var2_2 - var4_4;
            }
            var4_4 = var3_6;
            if (this.f(var6_5) == false) return var2_2 - var4_4;
            var4_4 = var3_6 + Character.charCount((int)var6_5);
            return var2_2 - var4_4;
        }
        var8_8 = var6_5;
        var7_9 = var3_6;
        var4_4 = var5_7;
        if (var6_5 == 917631) {
            var4_4 = var5_7;
            while ((var4_4 -= Character.charCount((int)(var8_8 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4)))) > 0 && this.h(var8_8)) {
                var3_6 += Character.charCount((int)var8_8);
            }
            if (!this.c(var8_8)) {
                return var2_2 - 2;
            }
            var7_9 = var3_6 + Character.charCount((int)var8_8);
        }
        var5_7 = var8_8;
        var3_6 = var7_9;
        var6_5 = var4_4;
        if (this.i(var8_8)) {
            var5_7 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4);
            if (!this.c(var5_7)) {
                return var2_2 - var7_9;
            }
            var3_6 = var7_9 + Character.charCount((int)var5_7);
            var6_5 = var4_4 - var3_6;
        }
        var9_10 = var3_6;
        if (this.c(var5_7) == false) return var2_2 - var9_10;
        var7_9 = var8_8 = 0;
        var4_4 = var6_5;
        var9_10 = var3_6;
        var6_5 = var5_7;
        do {
            var3_6 = var9_10;
            var5_7 = var8_8;
            if (var8_8 != 0) {
                var3_6 = var9_10 + (Character.charCount((int)var6_5) + var7_9 + 1);
                var5_7 = 0;
            }
            if (this.d(var6_5)) {
                var6_5 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4);
                var7_9 = var4_4 - Character.charCount((int)var6_5);
                var5_7 = var10_3;
                var4_4 = var6_5;
                if (var7_9 > 0) {
                    var5_7 = var10_3;
                    var4_4 = var6_5;
                    if (this.i(var6_5)) {
                        var4_4 = Character.codePointBefore((CharSequence)var1_1, (int)var7_9);
                        if (!this.c(var4_4)) {
                            return var2_2 - var3_6;
                        }
                        var5_7 = Character.charCount((int)var4_4);
                        Character.charCount((int)var4_4);
                    }
                }
                var9_10 = var3_6;
                if (this.e(var4_4) == false) return var2_2 - var9_10;
                var9_10 = var3_6 + (var5_7 + Character.charCount((int)var4_4));
                return var2_2 - var9_10;
            }
            var9_10 = var4_4;
            if (var4_4 <= 0) ** GOTO lbl-1000
            var7_9 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4);
            var6_5 = var7_9;
            var9_10 = var4_4 -= Character.charCount((int)var7_9);
            if (var7_9 == 8205) {
                if ((var4_4 -= Character.charCount((int)(var5_7 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4)))) > 0 && this.i(var5_7)) {
                    var5_7 = Character.codePointBefore((CharSequence)var1_1, (int)var4_4);
                    var7_9 = Character.charCount((int)var5_7);
                    var4_4 -= Character.charCount((int)var5_7);
                } else {
                    var7_9 = 0;
                }
                var8_8 = 1;
            } else lbl-1000: // 2 sources:
            {
                var7_9 = 0;
                var8_8 = var5_7;
                var4_4 = var9_10;
                var5_7 = var6_5;
            }
            if (var4_4 == 0) {
                var9_10 = var3_6;
                return var2_2 - var9_10;
            }
            var9_10 = var3_6;
            if (var8_8 == 0) return var2_2 - var9_10;
            var6_5 = var5_7;
            var9_10 = var3_6;
        } while (this.c(var5_7));
        var9_10 = var3_6;
        return var2_2 - var9_10;
    }

    public boolean c(int n8) {
        return this.a.isCodePointEmoji(n8);
    }

    public boolean d(int n8) {
        return this.a.isCodePointEmojiModifier(n8);
    }

    public boolean e(int n8) {
        return this.a.isCodePointEmojiModifierBase(n8);
    }

    public boolean f(int n8) {
        if ((48 > n8 || n8 > 57) && n8 != 35 && n8 != 42) {
            return false;
        }
        return true;
    }

    public boolean g(int n8) {
        return this.a.isCodePointRegionalIndicator(n8);
    }

    public boolean h(int n8) {
        if (917536 <= n8 && n8 <= 917630) {
            return true;
        }
        return false;
    }

    public boolean i(int n8) {
        return this.a.isCodePointVariantSelector(n8);
    }
}

