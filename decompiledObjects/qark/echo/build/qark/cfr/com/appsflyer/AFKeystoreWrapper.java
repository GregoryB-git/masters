/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.security.KeyPair
 *  java.security.KeyPairGenerator
 *  java.security.KeyStore
 *  java.security.KeyStore$LoadStoreParameter
 *  java.security.KeyStoreException
 *  java.security.NoSuchAlgorithmException
 *  java.security.cert.CertificateException
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Enumeration
 *  javax.security.auth.x500.X500Principal
 */
package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

public class AFKeystoreWrapper {
    private Context AFInAppEventParameterName;
    public KeyStore AFInAppEventType;
    public String AFKeystoreWrapper;
    public final Object valueOf = new Object();
    public int values;

    public AFKeystoreWrapper(Context context) {
        void var1_6;
        this.AFInAppEventParameterName = context;
        this.AFKeystoreWrapper = "";
        this.values = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            context = KeyStore.getInstance((String)"AndroidKeyStore");
            this.AFInAppEventType = context;
            context.load(null);
            return;
        }
        catch (KeyStoreException keyStoreException) {
        }
        catch (CertificateException certificateException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", (Throwable)var1_6);
    }

    private static boolean AFInAppEventParameterName(String string2) {
        return string2.startsWith("com.appsflyer");
    }

    public final String AFInAppEventParameterName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.appsflyer,");
        Object object = this.valueOf;
        synchronized (object) {
            stringBuilder.append("KSAppsFlyerId=");
            stringBuilder.append(this.AFKeystoreWrapper);
            stringBuilder.append(",");
            stringBuilder.append("KSAppsFlyerRICounter=");
            stringBuilder.append(this.values);
            return stringBuilder.toString();
        }
    }

    public final int AFInAppEventType() {
        Object object = this.valueOf;
        synchronized (object) {
            int n8 = this.values;
            return n8;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void AFKeystoreWrapper(String string2) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf((Object)string2)));
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 5);
        Object object = this.valueOf;
        // MONITORENTER : object
        {
            catch (Throwable throwable) {
                object = new StringBuilder("Exception ");
                object.append(throwable.getMessage());
                object.append(" occurred");
                AFLogger.afErrorLog(object.toString(), throwable);
                return;
            }
        }
        if (!this.AFInAppEventType.containsAlias(string2)) {
            string2 = new KeyGenParameterSpec.Builder(string2, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
            calendar = KeyPairGenerator.getInstance((String)"RSA", (String)"AndroidKeyStore");
            calendar.initialize((AlgorithmParameterSpec)string2);
            calendar.generateKeyPair();
            return;
        }
        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf((Object)string2)));
        // MONITOREXIT : object
        return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean AFKeystoreWrapper() {
        var5_1 = this.valueOf;
        // MONITORENTER : var5_1
        var6_2 = this.AFInAppEventType;
        var4_5 = false;
        var3_6 = false;
        var2_7 = var4_5;
        if (var6_2 == null) return var2_7;
        var1_8 = var3_6;
        try {
            var7_9 = var6_2.aliases();
            do lbl-1000: // 3 sources:
            {
                var1_8 = var3_6;
                var2_7 = var4_5;
                if (var7_9.hasMoreElements() == false) return var2_7;
                var1_8 = var3_6;
                var6_2 = (String)var7_9.nextElement();
                if (var6_2 == null) ** GOTO lbl-1000
                var1_8 = var3_6;
            } while (!AFKeystoreWrapper.AFInAppEventParameterName((String)var6_2));
            var1_8 = var3_6;
            var7_9 = var6_2.split(",");
            var1_8 = var3_6;
            var2_7 = var4_5;
            if (var7_9.length != 3) return var2_7;
            var1_8 = var3_6;
            AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat((String)var6_2));
            var4_5 = true;
            var1_8 = var3_6 = true;
            var6_2 = var7_9[1].trim().split("=");
            var1_8 = var3_6;
            var7_9 = var7_9[2].trim().split("=");
            var1_8 = var3_6;
            var2_7 = var4_5;
            if (var6_2.length != 2) return var2_7;
            var1_8 = var3_6;
            var2_7 = var4_5;
            if (var7_9.length != 2) return var2_7;
            var1_8 = var3_6;
            this.AFKeystoreWrapper = var6_2[1].trim();
            var1_8 = var3_6;
            this.values = Integer.parseInt((String)var7_9[1].trim());
            return var4_5;
        }
        catch (Throwable var6_3) {
            var7_10 = new StringBuilder("Couldn't list KeyStore Aliases: ");
            var7_10.append(var6_3.getClass().getName());
            AFLogger.afErrorLog(var7_10.toString(), var6_3);
            var2_7 = var1_8;
            // MONITOREXIT : var5_1
            return var2_7;
        }
    }

    public final String valueOf() {
        Object object = this.valueOf;
        synchronized (object) {
            String string2 = this.AFKeystoreWrapper;
            return string2;
        }
    }
}

