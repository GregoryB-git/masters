/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X4;

import X4.g;
import Y4.a;

public final class b
extends g {
    public final short c;
    public final short d;

    public b(g g8, int n8, int n9) {
        super(g8);
        this.c = (short)n8;
        this.d = (short)n9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void c(a var1_1, byte[] var2_2) {
        var3_3 = 0;
        while (var3_3 < (var4_4 = this.d)) {
            block3 : {
                block4 : {
                    if (var3_3 != 0 && (var3_3 != 31 || var4_4 > 62)) break block3;
                    var4_4 = 5;
                    var1_1.d(31, 5);
                    var5_5 = this.d;
                    if (var5_5 <= 62) break block4;
                    var5_5 -= 31;
                    var4_4 = 16;
                    ** GOTO lbl16
                }
                if (var3_3 == 0) {
                    var1_1.d(Math.min((int)var5_5, (int)31), 5);
                } else {
                    var5_5 -= 31;
lbl16: // 2 sources:
                    var1_1.d(var5_5, var4_4);
                }
            }
            var1_1.d(var2_2[this.c + var3_3], 8);
            ++var3_3;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append((int)this.c);
        stringBuilder.append("::");
        stringBuilder.append(this.c + this.d - 1);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

