package N0;

import N0.c;
import X2.AbstractC0703v;
import d0.C1162A;
import g0.N;
import g0.o;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3602a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3603b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3604c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (C1162A | NumberFormatException | XmlPullParserException unused) {
            o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static c b(String str) {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!N.f(newPullParser, "x:xmpmeta")) {
            throw C1162A.a("Couldn't find xmp metadata", null);
        }
        AbstractC0703v Y6 = AbstractC0703v.Y();
        long j7 = -9223372036854775807L;
        do {
            newPullParser.next();
            if (!N.f(newPullParser, "rdf:Description")) {
                if (N.f(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (N.f(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                Y6 = f(newPullParser, str2, str3);
            } else {
                if (!d(newPullParser)) {
                    return null;
                }
                j7 = e(newPullParser);
                Y6 = c(newPullParser);
            }
        } while (!N.d(newPullParser, "x:xmpmeta"));
        if (Y6.isEmpty()) {
            return null;
        }
        return new c(j7, Y6);
    }

    public static AbstractC0703v c(XmlPullParser xmlPullParser) {
        for (String str : f3604c) {
            String a7 = N.a(xmlPullParser, str);
            if (a7 != null) {
                return AbstractC0703v.a0(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(a7), 0L));
            }
        }
        return AbstractC0703v.Y();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f3602a) {
            String a7 = N.a(xmlPullParser, str);
            if (a7 != null) {
                return Integer.parseInt(a7) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f3603b) {
            String a7 = N.a(xmlPullParser, str);
            if (a7 != null) {
                long parseLong = Long.parseLong(a7);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    public static AbstractC0703v f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC0703v.a M6 = AbstractC0703v.M();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, str3)) {
                String a7 = N.a(xmlPullParser, str2 + ":Mime");
                String a8 = N.a(xmlPullParser, str2 + ":Semantic");
                String a9 = N.a(xmlPullParser, str2 + ":Length");
                String a10 = N.a(xmlPullParser, str2 + ":Padding");
                if (a7 == null || a8 == null) {
                    return AbstractC0703v.Y();
                }
                M6.a(new c.a(a7, a8, a9 != null ? Long.parseLong(a9) : 0L, a10 != null ? Long.parseLong(a10) : 0L));
            }
        } while (!N.d(xmlPullParser, str4));
        return M6.k();
    }
}
