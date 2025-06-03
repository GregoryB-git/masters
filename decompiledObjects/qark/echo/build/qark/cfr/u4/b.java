/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.KeyFactory
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.security.PublicKey
 *  java.security.spec.InvalidKeySpecException
 *  java.security.spec.KeySpec
 *  java.security.spec.X509EncodedKeySpec
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;
import s3.m;

public class b {
    public static final String[] c = new String[]{"*", "FCM", "GCM", ""};
    public final SharedPreferences a;
    public final String b;

    public b(e e8) {
        this.a = e8.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b.b(e8);
    }

    public static String b(e object) {
        String string2 = object.r().f();
        if (string2 != null) {
            return string2;
        }
        if (!(object = object.r().c()).startsWith("1:") && !object.startsWith("2:")) {
            return object;
        }
        if ((object = object.split(":")).length != 4) {
            return null;
        }
        if ((object = object[1]).isEmpty()) {
            return null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String c(PublicKey object) {
        object = object.getEncoded();
        try {
            object = MessageDigest.getInstance((String)"SHA1").digest((byte[])object);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        object[0] = (byte)((object[0] & 15) + 112 & 255);
        return Base64.encodeToString((byte[])object, (int)0, (int)8, (int)11);
        Log.w((String)"ContentValues", (String)"Unexpected error, device missing required algorithms");
        return null;
    }

    public final String a(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|T|");
        stringBuilder.append(string2);
        stringBuilder.append("|");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String d(String string2) {
        try {
            return new JSONObject(string2).getString("token");
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final PublicKey e(String publicKey) {
        void var1_5;
        try {
            publicKey = Base64.decode((String)publicKey, (int)8);
            publicKey = KeyFactory.getInstance((String)"RSA").generatePublic((KeySpec)new X509EncodedKeySpec((byte[])publicKey));
            return publicKey;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid key stored ");
        stringBuilder.append((Object)var1_5);
        Log.w((String)"ContentValues", (String)stringBuilder.toString());
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String f() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            try {
                String string2 = this.g();
                if (string2 == null) return this.h();
                return string2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String g() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            return this.a.getString("|S|id", null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String h() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            try {
                String string2 = this.a.getString("|S||P|", null);
                if (string2 == null) {
                    return null;
                }
                if ((string2 = this.e(string2)) != null) return b.c((PublicKey)string2);
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String i() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            Object object = c;
            int n8 = object.length;
            int n9 = 0;
            while (n9 < n8) {
                block6 : {
                    String string2 = object[n9];
                    try {
                        string2 = this.a(this.b, string2);
                        string2 = this.a.getString(string2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            object = string2;
                            if (!string2.startsWith("{")) return object;
                            return this.d(string2);
                        }
                        break block6;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                ++n9;
            }
            return null;
        }
    }
}

