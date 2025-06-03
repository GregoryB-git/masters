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
import java.util.Map;

public final class k
extends q {
    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.u) {
            return n.super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf((Object)((Object)a8))));
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
        if (n9 != 7) {
            if (n9 != 8) throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf((int)n9)));
            if (!p.a(string2)) throw new IllegalArgumentException("Contents do not pass checksum");
        } else {
            n9 = p.b(string2);
            arrbl = new boolean[]();
            arrbl.append(string2);
            arrbl.append(n9);
            string2 = arrbl.toString();
        }
        arrbl = new boolean[67];
        int n10 = n.b(arrbl, 0, p.a, true);
        for (n9 = 0; n9 <= 3; n10 += n.b((boolean[])arrbl, (int)n10, (int[])p.d[n8], (boolean)false), ++n9) {
            n8 = Character.digit((char)string2.charAt(n9), (int)10);
        }
        n10 += n.b(arrbl, n10, p.b, false);
        n9 = 4;
        do {
            if (n9 > 7) {
                n.b(arrbl, n10, p.a, true);
                return arrbl;
            }
            n8 = Character.digit((char)string2.charAt(n9), (int)10);
            n10 += n.b(arrbl, n10, p.d[n8], true);
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

