/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Shader
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.c;
import z.f;

public final class d {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public d(Shader shader, ColorStateList colorStateList, int n8) {
        this.a = shader;
        this.b = colorStateList;
        this.c = n8;
    }

    public static d a(Resources resources, int n8, Resources.Theme theme) {
        XmlResourceParser xmlResourceParser = resources.getXml(n8);
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while ((n8 = xmlResourceParser.next()) != 2 && n8 != 1) {
        }
        if (n8 == 2) {
            String string2 = xmlResourceParser.getName();
            string2.hashCode();
            if (!string2.equals((Object)"gradient")) {
                if (string2.equals((Object)"selector")) {
                    return d.c(c.b(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme));
                }
                resources = new StringBuilder();
                resources.append(xmlResourceParser.getPositionDescription());
                resources.append(": unsupported complex color tag ");
                resources.append(string2);
                throw new XmlPullParserException(resources.toString());
            }
            return d.d(f.b(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static d b(int n8) {
        return new d(null, null, n8);
    }

    public static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources object, int n8, Resources.Theme theme) {
        try {
            object = d.a((Resources)object, n8, theme);
            return object;
        }
        catch (Exception exception) {
            Log.e((String)"ComplexColorCompat", (String)"Failed to inflate ComplexColor.", (Throwable)exception);
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public boolean j(int[] arrn) {
        int n8;
        ColorStateList colorStateList;
        if (this.i() && (n8 = (colorStateList = this.b).getColorForState(arrn, colorStateList.getDefaultColor())) != this.c) {
            this.c = n8;
            return true;
        }
        return false;
    }

    public void k(int n8) {
        this.c = n8;
    }

    public boolean l() {
        if (!this.h() && this.c == 0) {
            return false;
        }
        return true;
    }
}

