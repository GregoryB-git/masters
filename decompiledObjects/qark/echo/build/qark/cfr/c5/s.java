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
import c5.n;
import c5.p;
import c5.q;
import c5.r;
import java.util.Map;

public final class s
extends q {
    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.D) {
            return n.super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf((Object)((Object)a8))));
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
        int n8 = string2.length();
        if (n8 != 7) {
            if (n8 != 8) throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf((int)n8)));
            if (!p.a(string2)) throw new IllegalArgumentException("Contents do not pass checksum");
        } else {
            n8 = p.b(r.c(string2));
            arrbl = new boolean[]();
            arrbl.append(string2);
            arrbl.append(n8);
            string2 = arrbl.toString();
        }
        n8 = Character.digit((char)string2.charAt(0), (int)10);
        if (n8 != 0) {
            if (n8 != 1) throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int n9 = Character.digit((char)string2.charAt(7), (int)10);
        int n10 = r.g[n8][n9];
        arrbl = new boolean[51];
        n9 = n.b(arrbl, 0, p.a, true);
        n8 = 1;
        do {
            int n11;
            if (n8 > 6) {
                n.b(arrbl, n9, p.c, false);
                return arrbl;
            }
            int n12 = n11 = Character.digit((char)string2.charAt(n8), (int)10);
            if ((n10 >> 6 - n8 & 1) == 1) {
                n12 = n11 + 10;
            }
            n9 += n.b(arrbl, n9, p.e[n12], false);
            ++n8;
        } while (true);
        catch (d d8) {
            throw new IllegalArgumentException((Throwable)d8);
        }
        catch (d d9) {
            throw new IllegalArgumentException("Illegal contents");
        }
    }
}

