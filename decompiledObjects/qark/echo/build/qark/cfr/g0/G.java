/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package g0;

import W2.c;
import android.net.Uri;
import android.text.TextUtils;
import g0.M;
import java.util.List;

public abstract class G {
    public static String a(Uri uri, Uri uri2) {
        if (!uri.isOpaque() && !uri2.isOpaque()) {
            String string2 = uri.getScheme();
            String string3 = uri2.getScheme();
            if ((string2 == null ? string3 == null : string3 != null && c.a(string2, string3)) && M.c(uri.getAuthority(), uri2.getAuthority())) {
                int n8;
                uri = uri.getPathSegments();
                uri2 = uri2.getPathSegments();
                int n9 = Math.min((int)uri.size(), (int)uri2.size());
                int n10 = 0;
                for (n8 = 0; n8 < n9 && ((String)uri.get(n8)).equals(uri2.get(n8)); ++n8) {
                    ++n10;
                }
                string2 = new StringBuilder();
                n8 = n10;
                do {
                    if (n8 >= uri.size()) break;
                    string2.append("../");
                    ++n8;
                } while (true);
                for (n9 = n10; n9 < uri2.size(); ++n9) {
                    string2.append((String)uri2.get(n9));
                    if (n9 >= uri2.size() - 1) continue;
                    string2.append("/");
                }
                return string2.toString();
            }
            return uri2.toString();
        }
        return uri2.toString();
    }

    public static int[] b(String string2) {
        int n8;
        int n9;
        int[] arrn;
        int n10;
        int n11;
        block19 : {
            block17 : {
                block18 : {
                    int n12;
                    block16 : {
                        block15 : {
                            block14 : {
                                block13 : {
                                    arrn = new int[4];
                                    if (TextUtils.isEmpty((CharSequence)string2)) {
                                        arrn[0] = -1;
                                        return arrn;
                                    }
                                    n8 = string2.length();
                                    n9 = string2.indexOf(35);
                                    if (n9 != -1) {
                                        n8 = n9;
                                    }
                                    n11 = string2.indexOf(63);
                                    if (n11 == -1) break block13;
                                    n9 = n11;
                                    if (n11 <= n8) break block14;
                                }
                                n9 = n8;
                            }
                            if ((n10 = string2.indexOf(47)) == -1) break block15;
                            n11 = n10;
                            if (n10 <= n9) break block16;
                        }
                        n11 = n9;
                    }
                    n10 = n12 = string2.indexOf(58);
                    if (n12 > n11) {
                        n10 = -1;
                    }
                    if ((n11 = n10 + 2) >= n9 || string2.charAt(n10 + 1) != '/' || string2.charAt(n11) != '/') break block17;
                    n12 = string2.indexOf(47, n10 + 3);
                    if (n12 == -1) break block18;
                    n11 = n12;
                    if (n12 <= n9) break block19;
                }
                n11 = n9;
                break block19;
            }
            n11 = n10 + 1;
        }
        arrn[0] = n10;
        arrn[1] = n11;
        arrn[2] = n9;
        arrn[3] = n8;
        return arrn;
    }

    public static boolean c(String string2) {
        boolean bl;
        boolean bl2 = bl = false;
        if (string2 != null) {
            bl2 = bl;
            if (G.b(string2)[0] != -1) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String d(StringBuilder stringBuilder, int n8, int n9) {
        if (n8 >= n9) {
            return stringBuilder.toString();
        }
        int n10 = n8;
        if (stringBuilder.charAt(n8) == '/') {
            n10 = n8 + 1;
        }
        int n11 = n8 = n10;
        do {
            block13 : {
                int n12;
                block12 : {
                    block11 : {
                        if (n8 > n9) {
                            return stringBuilder.toString();
                        }
                        if (n8 != n9) break block11;
                        n12 = n8;
                        break block12;
                    }
                    if (stringBuilder.charAt(n8) != '/') break block13;
                    n12 = n8 + 1;
                }
                int n13 = n11 + 1;
                if (n8 == n13 && stringBuilder.charAt(n11) == '.') {
                    stringBuilder.delete(n11, n12);
                    n12 = n9 - (n12 - n11);
                    n9 = n11;
                } else {
                    if (n8 == n11 + 2 && stringBuilder.charAt(n11) == '.' && stringBuilder.charAt(n13) == '.') {
                        n8 = (n11 = stringBuilder.lastIndexOf("/", n11 - 2) + 1) > n10 ? n11 : n10;
                        stringBuilder.delete(n8, n12);
                        n8 = n9 - (n12 - n8);
                        n12 = n11;
                    } else {
                        n12 = n8 + 1;
                        n8 = n9;
                    }
                    n9 = n12;
                    n12 = n8;
                }
                n8 = n9;
                n11 = n9;
                n9 = n12;
                continue;
            }
            ++n8;
        } while (true);
    }

    public static String e(String string2, String arrn) {
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        string2 = arrn;
        if (arrn == null) {
            string2 = "";
        }
        if ((arrn = G.b(string2))[0] != -1) {
            stringBuilder.append(string2);
            G.d(stringBuilder, arrn[1], arrn[2]);
            return stringBuilder.toString();
        }
        int[] arrn2 = G.b(string3);
        if (arrn[3] == 0) {
            stringBuilder.append((CharSequence)string3, 0, arrn2[3]);
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        if (arrn[2] == 0) {
            stringBuilder.append((CharSequence)string3, 0, arrn2[2]);
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        int n8 = arrn[1];
        if (n8 != 0) {
            n8 = arrn2[0] + 1;
            stringBuilder.append((CharSequence)string3, 0, n8);
            stringBuilder.append(string2);
            return G.d(stringBuilder, arrn[1] + n8, n8 + arrn[2]);
        }
        if (string2.charAt(n8) == '/') {
            stringBuilder.append((CharSequence)string3, 0, arrn2[1]);
            stringBuilder.append(string2);
            n8 = arrn2[1];
            return G.d(stringBuilder, n8, arrn[2] + n8);
        }
        n8 = arrn2[0];
        int n9 = arrn2[1];
        if (n8 + 2 < n9 && n9 == arrn2[2]) {
            stringBuilder.append((CharSequence)string3, 0, n9);
            stringBuilder.append('/');
            stringBuilder.append(string2);
            n8 = arrn2[1];
            return G.d(stringBuilder, n8, arrn[2] + n8 + 1);
        }
        n8 = string3.lastIndexOf(47, arrn2[2] - 1);
        n8 = n8 == -1 ? arrn2[1] : ++n8;
        stringBuilder.append((CharSequence)string3, 0, n8);
        stringBuilder.append(string2);
        return G.d(stringBuilder, arrn2[1], n8 + arrn[2]);
    }

    public static Uri f(String string2, String string3) {
        return Uri.parse((String)G.e(string2, string3));
    }
}

