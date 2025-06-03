// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y5;

import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.os.BaseBundle;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.json.JSONArray;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public abstract class a
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    
    static {
        final StringBuilder sb = new StringBuilder();
        sb.append(f.class.getName());
        sb.append('.');
        sb.append("aot-shared-library-name");
        a = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getName());
        sb2.append('.');
        sb2.append("vm-snapshot-data");
        b = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(f.class.getName());
        sb3.append('.');
        sb3.append("isolate-snapshot-data");
        c = sb3.toString();
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(f.class.getName());
        sb4.append('.');
        sb4.append("flutter-assets-dir");
        d = sb4.toString();
    }
    
    public static ApplicationInfo a(final Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        catch (PackageManager$NameNotFoundException cause) {
            throw new RuntimeException((Throwable)cause);
        }
    }
    
    public static boolean b(final Bundle bundle, final String s, final boolean b) {
        if (bundle == null) {
            return b;
        }
        return ((BaseBundle)bundle).getBoolean(s, b);
    }
    
    public static String c(final ApplicationInfo applicationInfo, final Context context) {
        final Bundle metaData = applicationInfo.metaData;
        if (metaData == null) {
            return null;
        }
        final int int1 = ((BaseBundle)metaData).getInt("io.flutter.network-policy", 0);
        if (int1 <= 0) {
            return null;
        }
        final JSONArray jsonArray = new JSONArray();
        try {
            final XmlResourceParser xml = context.getResources().getXml(int1);
            ((XmlPullParser)xml).next();
            for (int i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                if (i == 2 && ((XmlPullParser)xml).getName().equals("domain-config")) {
                    g(xml, jsonArray, false);
                }
            }
            return jsonArray.toString();
        }
        catch (IOException | XmlPullParserException ex) {
            return null;
        }
    }
    
    public static String d(final Bundle bundle, final String s) {
        if (bundle == null) {
            return null;
        }
        return ((BaseBundle)bundle).getString(s, (String)null);
    }
    
    public static b e(final Context context) {
        final ApplicationInfo a = a(context);
        return new b(d(a.metaData, y5.a.a), d(a.metaData, y5.a.b), d(a.metaData, y5.a.c), d(a.metaData, y5.a.d), c(a, context), a.nativeLibraryDir, b(a.metaData, "io.flutter.automatically-register-plugins", true));
    }
    
    public static void f(final XmlResourceParser xmlResourceParser, final JSONArray jsonArray, final boolean b) {
        final boolean attributeBooleanValue = ((AttributeSet)xmlResourceParser).getAttributeBooleanValue((String)null, "includeSubdomains", false);
        ((XmlPullParser)xmlResourceParser).next();
        if (((XmlPullParser)xmlResourceParser).getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        final String trim = ((XmlPullParser)xmlResourceParser).getText().trim();
        final JSONArray jsonArray2 = new JSONArray();
        jsonArray2.put((Object)trim);
        jsonArray2.put(attributeBooleanValue);
        jsonArray2.put(b);
        jsonArray.put((Object)jsonArray2);
        ((XmlPullParser)xmlResourceParser).next();
        if (((XmlPullParser)xmlResourceParser).getEventType() == 3) {
            return;
        }
        throw new IllegalStateException("Expected end of domain tag");
    }
    
    public static void g(final XmlResourceParser xmlResourceParser, final JSONArray jsonArray, final boolean b) {
        final boolean attributeBooleanValue = ((AttributeSet)xmlResourceParser).getAttributeBooleanValue((String)null, "cleartextTrafficPermitted", b);
        while (true) {
            final int next = ((XmlPullParser)xmlResourceParser).next();
            if (next == 2) {
                if (((XmlPullParser)xmlResourceParser).getName().equals("domain")) {
                    f(xmlResourceParser, jsonArray, attributeBooleanValue);
                }
                else if (((XmlPullParser)xmlResourceParser).getName().equals("domain-config")) {
                    g(xmlResourceParser, jsonArray, attributeBooleanValue);
                }
                else {
                    h(xmlResourceParser);
                }
            }
            else {
                if (next == 3) {
                    break;
                }
                continue;
            }
        }
    }
    
    public static void h(final XmlResourceParser xmlResourceParser) {
        final String name = ((XmlPullParser)xmlResourceParser).getName();
        for (int n = ((XmlPullParser)xmlResourceParser).getEventType(); n != 3 || ((XmlPullParser)xmlResourceParser).getName() != name; n = ((XmlPullParser)xmlResourceParser).next()) {}
    }
}
