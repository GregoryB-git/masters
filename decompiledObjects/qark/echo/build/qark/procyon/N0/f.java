// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N0;

import org.xmlpull.v1.XmlPullParser;
import java.util.List;
import X2.v;
import g0.N;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParserFactory;
import d0.A;
import org.xmlpull.v1.XmlPullParserException;
import g0.o;

public abstract class f
{
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    
    static {
        a = new String[] { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
        b = new String[] { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
        c = new String[] { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
    }
    
    public static c a(final String s) {
        while (true) {
            try {
                return b(s);
                o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                return null;
            }
            catch (XmlPullParserException | A | NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public static c b(String s) {
        final XmlPullParser pullParser = XmlPullParserFactory.newInstance().newPullParser();
        pullParser.setInput((Reader)new StringReader(s));
        pullParser.next();
        if (!N.f(pullParser, "x:xmpmeta")) {
            throw A.a("Couldn't find xmp metadata", null);
        }
        v y = v.Y();
        long n = -9223372036854775807L;
        long e = 0L;
        v v = null;
        do {
            pullParser.next();
            Label_0149: {
                if (N.f(pullParser, "rdf:Description")) {
                    if (!d(pullParser)) {
                        return null;
                    }
                    e = e(pullParser);
                    v = c(pullParser);
                }
                else {
                    String s2;
                    if (N.f(pullParser, "Container:Directory")) {
                        s = "Container";
                        s2 = "Item";
                    }
                    else {
                        v = y;
                        e = n;
                        if (!N.f(pullParser, "GContainer:Directory")) {
                            break Label_0149;
                        }
                        s = "GContainer";
                        s2 = "GContainerItem";
                    }
                    v = f(pullParser, s, s2);
                    e = n;
                }
            }
            y = v;
            n = e;
        } while (!N.d(pullParser, "x:xmpmeta"));
        if (v.isEmpty()) {
            return null;
        }
        return new c(e, v);
    }
    
    public static v c(final XmlPullParser xmlPullParser) {
        final String[] c = f.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            final String a = N.a(xmlPullParser, c[i]);
            if (a != null) {
                return v.a0(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(a), 0L));
            }
        }
        return v.Y();
    }
    
    public static boolean d(final XmlPullParser xmlPullParser) {
        final String[] a = f.a;
        final int length = a.length;
        boolean b = false;
        for (int i = 0; i < length; ++i) {
            final String a2 = N.a(xmlPullParser, a[i]);
            if (a2 != null) {
                if (Integer.parseInt(a2) == 1) {
                    b = true;
                }
                return b;
            }
        }
        return false;
    }
    
    public static long e(final XmlPullParser xmlPullParser) {
        final String[] b = f.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            final String a = N.a(xmlPullParser, b[i]);
            if (a != null) {
                final long long1 = Long.parseLong(a);
                if (long1 == -1L) {
                    return -9223372036854775807L;
                }
                return long1;
            }
            else {
                ++i;
            }
        }
        return -9223372036854775807L;
    }
    
    public static v f(final XmlPullParser xmlPullParser, String string, final String s) {
        final v.a m = v.M();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(":Item");
        final String string2 = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(":Directory");
        string = sb2.toString();
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, string2)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(s);
                sb3.append(":Mime");
                final String string3 = sb3.toString();
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(s);
                sb4.append(":Semantic");
                final String string4 = sb4.toString();
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(s);
                sb5.append(":Length");
                final String string5 = sb5.toString();
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(s);
                sb6.append(":Padding");
                final String string6 = sb6.toString();
                final String a = N.a(xmlPullParser, string3);
                final String a2 = N.a(xmlPullParser, string4);
                final String a3 = N.a(xmlPullParser, string5);
                final String a4 = N.a(xmlPullParser, string6);
                if (a == null || a2 == null) {
                    return v.Y();
                }
                long long1;
                if (a3 != null) {
                    long1 = Long.parseLong(a3);
                }
                else {
                    long1 = 0L;
                }
                long long2;
                if (a4 != null) {
                    long2 = Long.parseLong(a4);
                }
                else {
                    long2 = 0L;
                }
                m.h(new c.a(a, a2, long1, long2));
            }
        } while (!N.d(xmlPullParser, string));
        return m.k();
    }
}
