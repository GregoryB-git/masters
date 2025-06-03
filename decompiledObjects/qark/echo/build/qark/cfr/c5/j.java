/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 */
package c5;

import V4.a;
import V4.d;
import Y4.b;
import c5.i;
import c5.n;
import c5.p;
import c5.q;
import java.util.Map;

public final class j
extends q {
    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.v) {
            return n.super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf((Object)((Object)a8))));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public boolean[] c(String string2) {
        boolean[] arrbl;
        int n8;
        int n9 = string2.length();
        if (n9 != 12) {
            if (n9 != 13) throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf((int)n9)));
            if (!p.a(string2)) throw new IllegalArgumentException("Contents do not pass checksum");
        } else {
            n9 = p.b(string2);
            arrbl = new boolean[]();
            arrbl.append(string2);
            arrbl.append(n9);
            string2 = arrbl.toString();
        }
        n9 = Character.digit((char)string2.charAt(0), (int)10);
        int n10 = i.f[n9];
        arrbl = new boolean[95];
        int n11 = n.b(arrbl, 0, p.a, true);
        for (n9 = 1; n9 <= 6; n11 += n.b((boolean[])arrbl, (int)n11, (int[])p.e[n8], (boolean)false), ++n9) {
            int n12;
            n8 = n12 = Character.digit((char)string2.charAt(n9), (int)10);
            if ((n10 >> 6 - n9 & 1) != 1) continue;
            n8 = n12 + 10;
        }
        n11 += n.b(arrbl, n11, p.b, false);
        n9 = 7;
        do {
            if (n9 > 12) {
                n.b(arrbl, n11, p.a, true);
                return arrbl;
            }
            n8 = Character.digit((char)string2.charAt(n9), (int)10);
            n11 += n.b(arrbl, n11, p.d[n8], true);
            ++n9;
        } while (true);
        catch (d d8) {
            throw new IllegalArgumentException((Throwable)d8);
        }
        catch (d d9) {
            throw new IllegalArgumentException("Illegal contents");
        }
    }
}

