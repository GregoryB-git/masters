/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.XmlResourceParser
 *  android.os.Bundle
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.xmlpull.v1.XmlPullParserException
 */
package y5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import y5.b;
import y5.f;

public abstract class a {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.class.getName());
        stringBuilder.append('.');
        stringBuilder.append("aot-shared-library-name");
        a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f.class.getName());
        stringBuilder.append('.');
        stringBuilder.append("vm-snapshot-data");
        b = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f.class.getName());
        stringBuilder.append('.');
        stringBuilder.append("isolate-snapshot-data");
        c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f.class.getName());
        stringBuilder.append('.');
        stringBuilder.append("flutter-assets-dir");
        d = stringBuilder.toString();
    }

    public static ApplicationInfo a(Context context) {
        try {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new RuntimeException((Throwable)nameNotFoundException);
        }
    }

    public static boolean b(Bundle bundle, String string2, boolean bl) {
        if (bundle == null) {
            return bl;
        }
        return bundle.getBoolean(string2, bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String c(ApplicationInfo applicationInfo, Context context) {
        applicationInfo = applicationInfo.metaData;
        if (applicationInfo == null) {
            return null;
        }
        int n8 = applicationInfo.getInt("io.flutter.network-policy", 0);
        if (n8 <= 0) {
            return null;
        }
        applicationInfo = new JSONArray();
        try {
            context = context.getResources().getXml(n8);
            context.next();
            n8 = context.getEventType();
            while (n8 != 1) {
                if (n8 == 2 && context.getName().equals((Object)"domain-config")) {
                    a.g((XmlResourceParser)context, (JSONArray)applicationInfo, false);
                }
                n8 = context.next();
            }
        }
        catch (IOException | XmlPullParserException iOException) {
            return null;
        }
        return applicationInfo.toString();
    }

    public static String d(Bundle bundle, String string2) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(string2, null);
    }

    public static b e(Context context) {
        ApplicationInfo applicationInfo = a.a(context);
        return new b(a.d(applicationInfo.metaData, a), a.d(applicationInfo.metaData, b), a.d(applicationInfo.metaData, c), a.d(applicationInfo.metaData, d), a.c(applicationInfo, context), applicationInfo.nativeLibraryDir, a.b(applicationInfo.metaData, "io.flutter.automatically-register-plugins", true));
    }

    public static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean bl) {
        boolean bl2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String string2 = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put((Object)string2);
            jSONArray2.put(bl2);
            jSONArray2.put(bl);
            jSONArray.put((Object)jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() == 3) {
                return;
            }
            throw new IllegalStateException("Expected end of domain tag");
        }
        throw new IllegalStateException("Expected text");
    }

    public static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean bl) {
        bl = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", bl);
        do {
            int n8;
            if ((n8 = xmlResourceParser.next()) == 2) {
                if (xmlResourceParser.getName().equals((Object)"domain")) {
                    a.f(xmlResourceParser, jSONArray, bl);
                    continue;
                }
                if (xmlResourceParser.getName().equals((Object)"domain-config")) {
                    a.g(xmlResourceParser, jSONArray, bl);
                    continue;
                }
                a.h(xmlResourceParser);
                continue;
            }
            if (n8 == 3) break;
        } while (true);
    }

    public static void h(XmlResourceParser xmlResourceParser) {
        String string2 = xmlResourceParser.getName();
        int n8 = xmlResourceParser.getEventType();
        while (n8 != 3 || xmlResourceParser.getName() != string2) {
            n8 = xmlResourceParser.next();
        }
        return;
    }
}

