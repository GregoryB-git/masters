/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.xmlpull.v1.XmlPullParser
 */
package g0;

import org.xmlpull.v1.XmlPullParser;

public abstract class N {
    public static String a(XmlPullParser xmlPullParser, String string2) {
        int n8 = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!xmlPullParser.getAttributeName(i8).equals((Object)string2)) continue;
            return xmlPullParser.getAttributeValue(i8);
        }
        return null;
    }

    public static String b(XmlPullParser xmlPullParser, String string2) {
        int n8 = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!N.h(xmlPullParser.getAttributeName(i8)).equals((Object)string2)) continue;
            return xmlPullParser.getAttributeValue(i8);
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    public static boolean d(XmlPullParser xmlPullParser, String string2) {
        if (N.c(xmlPullParser) && xmlPullParser.getName().equals((Object)string2)) {
            return true;
        }
        return false;
    }

    public static boolean e(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean f(XmlPullParser xmlPullParser, String string2) {
        if (N.e(xmlPullParser) && xmlPullParser.getName().equals((Object)string2)) {
            return true;
        }
        return false;
    }

    public static boolean g(XmlPullParser xmlPullParser, String string2) {
        if (N.e(xmlPullParser) && N.h(xmlPullParser.getName()).equals((Object)string2)) {
            return true;
        }
        return false;
    }

    public static String h(String string2) {
        int n8 = string2.indexOf(58);
        if (n8 == -1) {
            return string2;
        }
        return string2.substring(n8 + 1);
    }
}

