/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.regex.Pattern
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.YandexMetrica;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Pattern;

public class h2 {
    private static final Pattern a = Pattern.compile((String)".*at com\\.yandex\\.metrica\\.push\\.*");
    private static final Pattern b = Pattern.compile((String)".*at com\\.yandex\\.metrica\\.(?!push)");

    @NonNull
    public static String a() {
        return com.yandex.metrica.impl.ob.h2$a.a;
    }

    public static void a(@NonNull String string, Object ... objectArray) {
        Log.i((String)"AppMetrica-Attribution", (String)String.format((String)string, (Object[])objectArray));
    }

    public static void a(@NonNull Throwable throwable, @NonNull String string, Object ... objectArray) {
        Log.e((String)"AppMetrica-Attribution", (String)String.format((String)string, (Object[])objectArray), (Throwable)throwable);
    }

    public static boolean a(String string) {
        boolean bl = h2.b(string) != null;
        return bl;
    }

    public static boolean a(@Nullable Throwable object) {
        if (object != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer)stringWriter);
            object.printStackTrace(printWriter);
            object = stringWriter.toString();
            printWriter.close();
        } else {
            object = "";
        }
        boolean bl = !TextUtils.isEmpty((CharSequence)object) && b.matcher((CharSequence)object).find();
        return bl;
    }

    @Nullable
    public static Class b(@NonNull String string) {
        try {
            string = Class.forName((String)string, (boolean)false, (ClassLoader)h2.class.getClassLoader());
            return string;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void b() {
        StringBuilder stringBuilder = z2.t("Initializing of Metrica, ");
        String string = "release";
        if (TextUtils.isEmpty((CharSequence)"release")) {
            string = "";
        } else {
            char c3 = "release".charAt(0);
            if (!Character.isUpperCase((char)c3)) {
                string = new StringBuilder();
                string.append(Character.toUpperCase((char)c3));
                string.append("elease");
                string = string.toString();
            }
        }
        stringBuilder.append(string);
        stringBuilder.append(" type, Version ");
        stringBuilder.append("5.2.0");
        stringBuilder.append(", API Level ");
        stringBuilder.append(YandexMetrica.getLibraryApiLevel());
        stringBuilder.append(", Dated ");
        stringBuilder.append("16.09.2022");
        stringBuilder.append(".");
        Log.i((String)"AppMetrica", (String)stringBuilder.toString());
    }

    public static void b(@NonNull String string, Object ... objectArray) {
        Log.w((String)"AppMetrica-Attribution", (String)String.format((String)string, (Object[])objectArray));
    }

    public static boolean b(@Nullable Throwable object) {
        if (object != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer)stringWriter);
            object.printStackTrace(printWriter);
            object = stringWriter.toString();
            printWriter.close();
        } else {
            object = "";
        }
        boolean bl = !TextUtils.isEmpty((CharSequence)object) && a.matcher((CharSequence)object).find();
        return bl;
    }

    @VisibleForTesting
    public static class a {
        @NonNull
        public static final String a;

        static {
            String string = h2.a("com.unity3d.player.UnityPlayer") ? "unity" : (h2.a("mono.MonoPackageManager") ? "xamarin" : (h2.a("org.apache.cordova.CordovaPlugin") ? "cordova" : (h2.a("com.facebook.react.ReactRootView") ? "react" : (h2.a("io.flutter.embedding.engine.FlutterEngine") ? "flutter" : "native"))));
            a = string;
        }
    }
}

