/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package N0;

import N0.c;
import X2.v;
import d0.A;
import g0.N;
import g0.o;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public abstract class f {
    public static final String[] a = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a(String object) {
        try {
            return f.b((String)object);
        }
        catch (A | NumberFormatException | XmlPullParserException object2) {}
        o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static c b(String object) {
        long l8;
        XmlPullParser xmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParser.setInput((Reader)new StringReader((String)object));
        xmlPullParser.next();
        if (!N.f(xmlPullParser, "x:xmpmeta")) {
            throw A.a("Couldn't find xmp metadata", null);
        }
        Object object2 = v.Y();
        long l9 = -9223372036854775807L;
        do {
            block8 : {
                block10 : {
                    block9 : {
                        block7 : {
                            xmlPullParser.next();
                            if (!N.f(xmlPullParser, "rdf:Description")) break block7;
                            if (!f.d(xmlPullParser)) {
                                return null;
                            }
                            l8 = f.e(xmlPullParser);
                            object = f.c(xmlPullParser);
                            break block8;
                        }
                        if (!N.f(xmlPullParser, "Container:Directory")) break block9;
                        object = "Container";
                        object2 = "Item";
                        break block10;
                    }
                    object = object2;
                    l8 = l9;
                    if (!N.f(xmlPullParser, "GContainer:Directory")) break block8;
                    object = "GContainer";
                    object2 = "GContainerItem";
                }
                object = f.f(xmlPullParser, (String)object, (String)object2);
                l8 = l9;
            }
            object2 = object;
            l9 = l8;
        } while (!N.d(xmlPullParser, "x:xmpmeta"));
        if (object.isEmpty()) {
            return null;
        }
        return new c(l8, (List)object);
    }

    public static v c(XmlPullParser xmlPullParser) {
        String[] arrstring = c;
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = N.a(xmlPullParser, arrstring[i8]);
            if (string2 == null) continue;
            long l8 = Long.parseLong((String)string2);
            return v.a0(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", l8, 0L));
        }
        return v.Y();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        String[] arrstring = a;
        int n8 = arrstring.length;
        boolean bl = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = N.a(xmlPullParser, arrstring[i8]);
            if (string2 == null) continue;
            if (Integer.parseInt((String)string2) == 1) {
                bl = true;
            }
            return bl;
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        String[] arrstring = b;
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = N.a(xmlPullParser, arrstring[i8]);
            if (string2 == null) continue;
            long l8 = Long.parseLong((String)string2);
            if (l8 == -1L) {
                return -9223372036854775807L;
            }
            return l8;
        }
        return -9223372036854775807L;
    }

    public static v f(XmlPullParser xmlPullParser, String string2, String string3) {
        v.a a8 = v.M();
        Object object = new StringBuilder();
        object.append(string2);
        object.append(":Item");
        object = object.toString();
        Object object2 = new StringBuilder();
        object2.append(string2);
        object2.append(":Directory");
        string2 = object2.toString();
        do {
            xmlPullParser.next();
            if (!N.f(xmlPullParser, (String)object)) continue;
            object2 = new StringBuilder();
            object2.append(string3);
            object2.append(":Mime");
            object2 = object2.toString();
            Object object3 = new StringBuilder();
            object3.append(string3);
            object3.append(":Semantic");
            object3 = object3.toString();
            Object object4 = new StringBuilder();
            object4.append(string3);
            object4.append(":Length");
            object4 = object4.toString();
            Object object5 = new StringBuilder();
            object5.append(string3);
            object5.append(":Padding");
            object5 = object5.toString();
            object2 = N.a(xmlPullParser, (String)object2);
            object3 = N.a(xmlPullParser, (String)object3);
            object4 = N.a(xmlPullParser, (String)object4);
            object5 = N.a(xmlPullParser, (String)object5);
            if (object2 != null && object3 != null) {
                long l8 = object4 != null ? Long.parseLong((String)object4) : 0L;
                long l9 = object5 != null ? Long.parseLong((String)object5) : 0L;
                a8.h(new c.a((String)object2, (String)object3, l8, l9));
                continue;
            }
            return v.Y();
        } while (!N.d(xmlPullParser, string2));
        return a8.k();
    }
}

