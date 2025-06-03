// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.util.Log;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.graphics.Shader;

public final class d
{
    public final Shader a;
    public final ColorStateList b;
    public int c;
    
    public d(final Shader a, final ColorStateList b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static d a(final Resources resources, int next, final Resources$Theme resources$Theme) {
        final XmlResourceParser xml = resources.getXml(next);
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
        do {
            next = ((XmlPullParser)xml).next();
        } while (next != 2 && next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        final String name = ((XmlPullParser)xml).getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, (XmlPullParser)xml, attributeSet, resources$Theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, (XmlPullParser)xml, attributeSet, resources$Theme));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((XmlPullParser)xml).getPositionDescription());
        sb.append(": unsupported complex color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    public static d b(final int n) {
        return new d(null, null, n);
    }
    
    public static d c(final ColorStateList list) {
        return new d(null, list, list.getDefaultColor());
    }
    
    public static d d(final Shader shader) {
        return new d(shader, null, 0);
    }
    
    public static d g(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        try {
            return a(resources, n, resources$Theme);
        }
        catch (Exception ex) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", (Throwable)ex);
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
        return this.a != null;
    }
    
    public boolean i() {
        if (this.a == null) {
            final ColorStateList b = this.b;
            if (b != null && b.isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean j(final int[] array) {
        if (this.i()) {
            final ColorStateList b = this.b;
            final int colorForState = b.getColorForState(array, b.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }
    
    public void k(final int c) {
        this.c = c;
    }
    
    public boolean l() {
        return this.h() || this.c != 0;
    }
}
