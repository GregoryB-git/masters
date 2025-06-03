// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import org.xmlpull.v1.XmlPullParser;

public abstract class N
{
    public static String a(final XmlPullParser xmlPullParser, final String anObject) {
        for (int attributeCount = xmlPullParser.getAttributeCount(), i = 0; i < attributeCount; ++i) {
            if (xmlPullParser.getAttributeName(i).equals(anObject)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
    
    public static String b(final XmlPullParser xmlPullParser, final String anObject) {
        for (int attributeCount = xmlPullParser.getAttributeCount(), i = 0; i < attributeCount; ++i) {
            if (h(xmlPullParser.getAttributeName(i)).equals(anObject)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
    
    public static boolean c(final XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }
    
    public static boolean d(final XmlPullParser xmlPullParser, final String anObject) {
        return c(xmlPullParser) && xmlPullParser.getName().equals(anObject);
    }
    
    public static boolean e(final XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }
    
    public static boolean f(final XmlPullParser xmlPullParser, final String anObject) {
        return e(xmlPullParser) && xmlPullParser.getName().equals(anObject);
    }
    
    public static boolean g(final XmlPullParser xmlPullParser, final String anObject) {
        return e(xmlPullParser) && h(xmlPullParser.getName()).equals(anObject);
    }
    
    public static String h(final String s) {
        final int index = s.indexOf(58);
        if (index == -1) {
            return s;
        }
        return s.substring(index + 1);
    }
}
