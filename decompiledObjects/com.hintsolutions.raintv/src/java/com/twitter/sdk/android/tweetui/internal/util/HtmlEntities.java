/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.twitter.sdk.android.tweetui.internal.util;

import java.util.ArrayList;

public class HtmlEntities {
    private static final String[][] BASIC_ARRAY;
    public static final HtmlEntities HTML40;
    public static final String[][] HTML40_ARRAY;
    public static final String[][] ISO8859_1_ARRAY;
    public final EntityMap map = new /* Unavailable Anonymous Inner Class!! */;

    static {
        String[] stringArray = new String[]{"frac14", "188"};
        Object object = new String[]{"aring", "229"};
        String[] stringArray2 = new String[]{"ograve", "242"};
        ISO8859_1_ARRAY = new String[][]{{"nbsp", "160"}, {"iexcl", "161"}, {"cent", "162"}, {"pound", "163"}, {"curren", "164"}, {"yen", "165"}, {"brvbar", "166"}, {"sect", "167"}, {"uml", "168"}, {"copy", "169"}, {"ordf", "170"}, {"laquo", "171"}, {"not", "172"}, {"shy", "173"}, {"reg", "174"}, {"macr", "175"}, {"deg", "176"}, {"plusmn", "177"}, {"sup2", "178"}, {"sup3", "179"}, {"acute", "180"}, {"micro", "181"}, {"para", "182"}, {"middot", "183"}, {"cedil", "184"}, {"sup1", "185"}, {"ordm", "186"}, {"raquo", "187"}, stringArray, {"frac12", "189"}, {"frac34", "190"}, {"iquest", "191"}, {"Agrave", "192"}, {"Aacute", "193"}, {"Acirc", "194"}, {"Atilde", "195"}, {"Auml", "196"}, {"Aring", "197"}, {"AElig", "198"}, {"Ccedil", "199"}, {"Egrave", "200"}, {"Eacute", "201"}, {"Ecirc", "202"}, {"Euml", "203"}, {"Igrave", "204"}, {"Iacute", "205"}, {"Icirc", "206"}, {"Iuml", "207"}, {"ETH", "208"}, {"Ntilde", "209"}, {"Ograve", "210"}, {"Oacute", "211"}, {"Ocirc", "212"}, {"Otilde", "213"}, {"Ouml", "214"}, {"times", "215"}, {"Oslash", "216"}, {"Ugrave", "217"}, {"Uacute", "218"}, {"Ucirc", "219"}, {"Uuml", "220"}, {"Yacute", "221"}, {"THORN", "222"}, {"szlig", "223"}, {"agrave", "224"}, {"aacute", "225"}, {"acirc", "226"}, {"atilde", "227"}, {"auml", "228"}, object, {"aelig", "230"}, {"ccedil", "231"}, {"egrave", "232"}, {"eacute", "233"}, {"ecirc", "234"}, {"euml", "235"}, {"igrave", "236"}, {"iacute", "237"}, {"icirc", "238"}, {"iuml", "239"}, {"eth", "240"}, {"ntilde", "241"}, stringArray2, {"oacute", "243"}, {"ocirc", "244"}, {"otilde", "245"}, {"ouml", "246"}, {"divide", "247"}, {"oslash", "248"}, {"ugrave", "249"}, {"uacute", "250"}, {"ucirc", "251"}, {"uuml", "252"}, {"yacute", "253"}, {"thorn", "254"}, {"yuml", "255"}};
        String[] stringArray3 = new String[]{"fnof", "402"};
        String[] stringArray4 = new String[]{"Alpha", "913"};
        String[] stringArray5 = new String[]{"Beta", "914"};
        String[] stringArray6 = new String[]{"Gamma", "915"};
        String[] stringArray7 = new String[]{"Delta", "916"};
        String[] stringArray8 = new String[]{"Epsilon", "917"};
        String[] stringArray9 = new String[]{"Zeta", "918"};
        String[] stringArray10 = new String[]{"Eta", "919"};
        String[] stringArray11 = new String[]{"Iota", "921"};
        String[] stringArray12 = new String[]{"Kappa", "922"};
        String[] stringArray13 = new String[]{"Lambda", "923"};
        String[] stringArray14 = new String[]{"Mu", "924"};
        String[] stringArray15 = new String[]{"Nu", "925"};
        String[] stringArray16 = new String[]{"Xi", "926"};
        String[] stringArray17 = new String[]{"Omicron", "927"};
        String[] stringArray18 = new String[]{"Pi", "928"};
        String[] stringArray19 = new String[]{"Rho", "929"};
        String[] stringArray20 = new String[]{"Sigma", "931"};
        String[] stringArray21 = new String[]{"Tau", "932"};
        String[] stringArray22 = new String[]{"Upsilon", "933"};
        String[] stringArray23 = new String[]{"Phi", "934"};
        String[] stringArray24 = new String[]{"Chi", "935"};
        String[] stringArray25 = new String[]{"Omega", "937"};
        String[] stringArray26 = new String[]{"alpha", "945"};
        String[] stringArray27 = new String[]{"beta", "946"};
        String[] stringArray28 = new String[]{"gamma", "947"};
        String[] stringArray29 = new String[]{"delta", "948"};
        String[] stringArray30 = new String[]{"epsilon", "949"};
        String[] stringArray31 = new String[]{"zeta", "950"};
        String[] stringArray32 = new String[]{"eta", "951"};
        String[] stringArray33 = new String[]{"theta", "952"};
        String[] stringArray34 = new String[]{"iota", "953"};
        String[] stringArray35 = new String[]{"kappa", "954"};
        stringArray2 = new String[]{"lambda", "955"};
        String[] stringArray36 = new String[]{"mu", "956"};
        String[] stringArray37 = new String[]{"nu", "957"};
        String[] stringArray38 = new String[]{"xi", "958"};
        String[] stringArray39 = new String[]{"omicron", "959"};
        String[] stringArray40 = new String[]{"pi", "960"};
        String[] stringArray41 = new String[]{"rho", "961"};
        String[] stringArray42 = new String[]{"sigmaf", "962"};
        String[] stringArray43 = new String[]{"sigma", "963"};
        String[] stringArray44 = new String[]{"tau", "964"};
        String[] stringArray45 = new String[]{"upsilon", "965"};
        String[] stringArray46 = new String[]{"phi", "966"};
        String[] stringArray47 = new String[]{"chi", "967"};
        String[] stringArray48 = new String[]{"psi", "968"};
        String[] stringArray49 = new String[]{"omega", "969"};
        String[] stringArray50 = new String[]{"thetasym", "977"};
        String[] stringArray51 = new String[]{"upsih", "978"};
        String[] stringArray52 = new String[]{"piv", "982"};
        String[] stringArray53 = new String[]{"bull", "8226"};
        String[] stringArray54 = new String[]{"hellip", "8230"};
        String[] stringArray55 = new String[]{"prime", "8242"};
        String[] stringArray56 = new String[]{"Prime", "8243"};
        String[] stringArray57 = new String[]{"oline", "8254"};
        String[] stringArray58 = new String[]{"frasl", "8260"};
        String[] stringArray59 = new String[]{"weierp", "8472"};
        String[] stringArray60 = new String[]{"image", "8465"};
        String[] stringArray61 = new String[]{"real", "8476"};
        String[] stringArray62 = new String[]{"trade", "8482"};
        String[] stringArray63 = new String[]{"alefsym", "8501"};
        String[] stringArray64 = new String[]{"larr", "8592"};
        String[] stringArray65 = new String[]{"uarr", "8593"};
        String[] stringArray66 = new String[]{"rarr", "8594"};
        String[] stringArray67 = new String[]{"darr", "8595"};
        String[] stringArray68 = new String[]{"harr", "8596"};
        String[] stringArray69 = new String[]{"crarr", "8629"};
        String[] stringArray70 = new String[]{"lArr", "8656"};
        String[] stringArray71 = new String[]{"uArr", "8657"};
        object = new String[]{"rArr", "8658"};
        String[] stringArray72 = new String[]{"dArr", "8659"};
        String[] stringArray73 = new String[]{"hArr", "8660"};
        String[] stringArray74 = new String[]{"forall", "8704"};
        String[] stringArray75 = new String[]{"part", "8706"};
        String[] stringArray76 = new String[]{"exist", "8707"};
        stringArray = new String[]{"empty", "8709"};
        String[] stringArray77 = new String[]{"nabla", "8711"};
        String[] stringArray78 = new String[]{"isin", "8712"};
        String[] stringArray79 = new String[]{"ni", "8715"};
        String[] stringArray80 = new String[]{"prod", "8719"};
        String[] stringArray81 = new String[]{"sum", "8721"};
        String[] stringArray82 = new String[]{"minus", "8722"};
        String[] stringArray83 = new String[]{"lowast", "8727"};
        String[] stringArray84 = new String[]{"radic", "8730"};
        String[] stringArray85 = new String[]{"prop", "8733"};
        String[] stringArray86 = new String[]{"infin", "8734"};
        String[] stringArray87 = new String[]{"ang", "8736"};
        String[] stringArray88 = new String[]{"and", "8743"};
        String[] stringArray89 = new String[]{"or", "8744"};
        String[] stringArray90 = new String[]{"cap", "8745"};
        String[] stringArray91 = new String[]{"cup", "8746"};
        String[] stringArray92 = new String[]{"int", "8747"};
        String[] stringArray93 = new String[]{"there4", "8756"};
        String[] stringArray94 = new String[]{"sim", "8764"};
        String[] stringArray95 = new String[]{"cong", "8773"};
        String[] stringArray96 = new String[]{"asymp", "8776"};
        String[] stringArray97 = new String[]{"ne", "8800"};
        String[] stringArray98 = new String[]{"equiv", "8801"};
        String[] stringArray99 = new String[]{"le", "8804"};
        String[] stringArray100 = new String[]{"ge", "8805"};
        String[] stringArray101 = new String[]{"sub", "8834"};
        String[] stringArray102 = new String[]{"sup", "8835"};
        String[] stringArray103 = new String[]{"sube", "8838"};
        String[] stringArray104 = new String[]{"supe", "8839"};
        String[] stringArray105 = new String[]{"oplus", "8853"};
        String[] stringArray106 = new String[]{"otimes", "8855"};
        String[] stringArray107 = new String[]{"perp", "8869"};
        String[] stringArray108 = new String[]{"sdot", "8901"};
        String[] stringArray109 = new String[]{"lceil", "8968"};
        String[] stringArray110 = new String[]{"rceil", "8969"};
        String[] stringArray111 = new String[]{"lfloor", "8970"};
        String[] stringArray112 = new String[]{"rfloor", "8971"};
        String[] stringArray113 = new String[]{"lang", "9001"};
        String[] stringArray114 = new String[]{"rang", "9002"};
        String[] stringArray115 = new String[]{"loz", "9674"};
        String[] stringArray116 = new String[]{"spades", "9824"};
        String[] stringArray117 = new String[]{"clubs", "9827"};
        String[] stringArray118 = new String[]{"hearts", "9829"};
        String[] stringArray119 = new String[]{"diams", "9830"};
        String[] stringArray120 = new String[]{"OElig", "338"};
        String[] stringArray121 = new String[]{"oelig", "339"};
        String[] stringArray122 = new String[]{"Scaron", "352"};
        String[] stringArray123 = new String[]{"scaron", "353"};
        String[] stringArray124 = new String[]{"Yuml", "376"};
        String[] stringArray125 = new String[]{"circ", "710"};
        String[] stringArray126 = new String[]{"tilde", "732"};
        String[] stringArray127 = new String[]{"ensp", "8194"};
        String[] stringArray128 = new String[]{"emsp", "8195"};
        String[] stringArray129 = new String[]{"thinsp", "8201"};
        String[] stringArray130 = new String[]{"zwnj", "8204"};
        String[] stringArray131 = new String[]{"zwj", "8205"};
        String[] stringArray132 = new String[]{"lrm", "8206"};
        String[] stringArray133 = new String[]{"rlm", "8207"};
        String[] stringArray134 = new String[]{"ndash", "8211"};
        String[] stringArray135 = new String[]{"mdash", "8212"};
        String[] stringArray136 = new String[]{"lsquo", "8216"};
        String[] stringArray137 = new String[]{"rsquo", "8217"};
        String[] stringArray138 = new String[]{"sbquo", "8218"};
        String[] stringArray139 = new String[]{"ldquo", "8220"};
        String[] stringArray140 = new String[]{"rdquo", "8221"};
        String[] stringArray141 = new String[]{"bdquo", "8222"};
        String[] stringArray142 = new String[]{"dagger", "8224"};
        String[] stringArray143 = new String[]{"Dagger", "8225"};
        String[] stringArray144 = new String[]{"permil", "8240"};
        String[] stringArray145 = new String[]{"lsaquo", "8249"};
        String[] stringArray146 = new String[]{"rsaquo", "8250"};
        String[] stringArray147 = new String[]{"euro", "8364"};
        HTML40_ARRAY = new String[][]{stringArray3, stringArray4, stringArray5, stringArray6, stringArray7, stringArray8, stringArray9, stringArray10, {"Theta", "920"}, stringArray11, stringArray12, stringArray13, stringArray14, stringArray15, stringArray16, stringArray17, stringArray18, stringArray19, stringArray20, stringArray21, stringArray22, stringArray23, stringArray24, {"Psi", "936"}, stringArray25, stringArray26, stringArray27, stringArray28, stringArray29, stringArray30, stringArray31, stringArray32, stringArray33, stringArray34, stringArray35, stringArray2, stringArray36, stringArray37, stringArray38, stringArray39, stringArray40, stringArray41, stringArray42, stringArray43, stringArray44, stringArray45, stringArray46, stringArray47, stringArray48, stringArray49, stringArray50, stringArray51, stringArray52, stringArray53, stringArray54, stringArray55, stringArray56, stringArray57, stringArray58, stringArray59, stringArray60, stringArray61, stringArray62, stringArray63, stringArray64, stringArray65, stringArray66, stringArray67, stringArray68, stringArray69, stringArray70, stringArray71, object, stringArray72, stringArray73, stringArray74, stringArray75, stringArray76, stringArray, stringArray77, stringArray78, {"notin", "8713"}, stringArray79, stringArray80, stringArray81, stringArray82, stringArray83, stringArray84, stringArray85, stringArray86, stringArray87, stringArray88, stringArray89, stringArray90, stringArray91, stringArray92, stringArray93, stringArray94, stringArray95, stringArray96, stringArray97, stringArray98, stringArray99, stringArray100, stringArray101, stringArray102, stringArray103, stringArray104, stringArray105, stringArray106, stringArray107, stringArray108, stringArray109, stringArray110, stringArray111, stringArray112, stringArray113, stringArray114, stringArray115, stringArray116, stringArray117, stringArray118, stringArray119, stringArray120, stringArray121, stringArray122, stringArray123, stringArray124, stringArray125, stringArray126, stringArray127, stringArray128, stringArray129, stringArray130, stringArray131, stringArray132, stringArray133, stringArray134, stringArray135, stringArray136, stringArray137, stringArray138, stringArray139, stringArray140, stringArray141, stringArray142, stringArray143, stringArray144, stringArray145, stringArray146, stringArray147};
        BASIC_ARRAY = new String[][]{{"quot", "34"}, {"amp", "38"}, {"lt", "60"}, {"gt", "62"}};
        HTML40 = object = new HtmlEntities();
        HtmlEntities.fillWithHtml40Entities((HtmlEntities)object);
    }

    public static void fillWithHtml40Entities(HtmlEntities htmlEntities) {
        htmlEntities.addEntities(BASIC_ARRAY);
        htmlEntities.addEntities(ISO8859_1_ARRAY);
        htmlEntities.addEntities(HTML40_ARRAY);
    }

    public void addEntities(String[][] stringArray) {
        for (String[] stringArray2 : stringArray) {
            this.addEntity(stringArray2[0], Integer.parseInt((String)stringArray2[1]));
        }
    }

    public void addEntity(String string2, int n) {
        this.map.add(string2, n);
    }

    public int entityValue(String string2) {
        return this.map.value(string2);
    }

    /*
     * Unable to fully structure code
     */
    public Unescaped unescape(String var1_1) {
        var6_2 = var1_1.length();
        var10_3 = new StringBuilder(var6_2);
        var8_4 = new ArrayList(5);
        block3: for (var4_5 = 0; var4_5 < var6_2; ++var4_5) {
            var2_6 = var1_1.charAt(var4_5);
            if (var2_6 == '&') {
                block14: {
                    var3_7 = var4_5 + 1;
                    var5_8 = var1_1.indexOf(59, var3_7);
                    if (var5_8 == -1) {
                        var10_3.append(var2_6);
                        continue;
                    }
                    var9_10 = var1_1.substring(var3_7, var5_8);
                    var7_9 = var9_10.length();
                    if (var7_9 > 0) {
                        if (var9_10.charAt(0) == '#' && var7_9 > 1) {
                            var3_7 = var9_10.charAt(1);
                            if (var3_7 != 120 && var3_7 != 88) {
                                var3_7 = Integer.parseInt((String)var9_10.substring(1));
                                break block14;
                            }
                            if (var7_9 > 2) {
                                var3_7 = Integer.valueOf((String)var9_10.substring(2), (int)16);
                                break block14;
                            }
lbl26:
                            // 3 sources

                            while (true) {
                                var3_7 = -1;
                                break block14;
                                break;
                            }
                        }
                        var3_7 = this.entityValue(var9_10);
                    } else {
                        var3_7 = -1;
                    }
                }
                if (var3_7 == -1) {
                    var10_3.append('&');
                    if (var9_10.indexOf(38) != -1) continue;
                    var10_3.append(var9_10);
                    var10_3.append(';');
lbl41:
                    // 2 sources

                    while (true) {
                        var4_5 = var5_8;
                        continue block3;
                        break;
                    }
                }
                var10_3.append((char)var3_7);
                var8_4.add((Object)new int[]{var4_5, var5_8});
                ** continue;
            }
            var10_3.append(var2_6);
        }
        return new Unescaped(var10_3.toString(), (ArrayList<int[]>)var8_4);
        catch (Exception var11_11) {
            ** continue;
        }
    }

    public static interface EntityMap {
        public void add(String var1, int var2);

        public String name(int var1);

        public int value(String var1);
    }

    public static final class Unescaped {
        public final ArrayList<int[]> indices;
        public final String unescaped;

        public Unescaped(String string2, ArrayList<int[]> arrayList) {
            this.unescaped = string2;
            this.indices = arrayList;
        }
    }
}

