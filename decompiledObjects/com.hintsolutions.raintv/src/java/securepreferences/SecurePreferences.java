/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.Build
 *  android.preference.PreferenceManager
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.security.NoSuchProviderException
 *  java.security.SecureRandom
 *  java.security.spec.InvalidKeySpecException
 *  java.security.spec.KeySpec
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.crypto.Cipher
 *  javax.crypto.KeyGenerator
 *  javax.crypto.SecretKey
 *  javax.crypto.SecretKeyFactory
 *  javax.crypto.spec.PBEKeySpec
 *  javax.crypto.spec.SecretKeySpec
 */
package securepreferences;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import securepreferences.util.Base64;

public class SecurePreferences
implements SharedPreferences {
    private static final String AES_KEY_ALG = "AES";
    private static final String BACKUP_PBE_KEY_ALG = "PBEWithMD5AndDES";
    private static final int ITERATIONS = 2000;
    private static final int KEY_SIZE = 256;
    private static final String PRIMARY_PBE_KEY_ALG = "PBKDF2WithHmacSHA1";
    private static final String PROVIDER = "BC";
    private static final String TAG = SecurePreferences.class.getName();
    private static SharedPreferences sFile;
    private static byte[] sKey;
    private static boolean sLoggingEnabled;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SecurePreferences(Context object) {
        if (sFile == null) {
            sFile = PreferenceManager.getDefaultSharedPreferences((Context)object);
        }
        try {
            void var1_4;
            String string2;
            String string3 = SecurePreferences.generateAesKeyName(object);
            String string4 = string2 = sFile.getString(string3, null);
            if (string2 == null) {
                String string5 = SecurePreferences.generateAesKeyValue();
                sFile.edit().putString(string3, string5).commit();
            }
            sKey = SecurePreferences.decode((String)var1_4);
            return;
        }
        catch (Exception exception) {
            if (sLoggingEnabled) {
                String string6 = TAG;
                StringBuilder stringBuilder = z2.t("Error init:");
                stringBuilder.append(exception.getMessage());
                Log.e((String)string6, (String)stringBuilder.toString());
            }
            throw new IllegalStateException((Throwable)exception);
        }
    }

    public static /* synthetic */ SharedPreferences access$100() {
        return sFile;
    }

    private static byte[] decode(String string2) {
        return Base64.decode(string2, 3);
    }

    private static String decrypt(String string2) {
        String string3 = string2;
        if (string2 != null) {
            if (string2.length() == 0) {
                string3 = string2;
            } else {
                try {
                    Cipher cipher = Cipher.getInstance((String)AES_KEY_ALG, (String)PROVIDER);
                    string3 = new SecretKeySpec(sKey, AES_KEY_ALG);
                    cipher.init(2, (Key)string3);
                    string2 = new String(cipher.doFinal(SecurePreferences.decode(string2)), "UTF-8");
                    return string2;
                }
                catch (Exception exception) {
                    if (sLoggingEnabled) {
                        Log.w((String)TAG, (String)"decrypt", (Throwable)exception);
                    }
                    string3 = null;
                }
            }
        }
        return string3;
    }

    private static String encode(byte[] byArray) {
        return Base64.encodeToString(byArray, 3);
    }

    private static String encrypt(String string2) {
        String string3 = string2;
        if (string2 != null) {
            if (string2.length() == 0) {
                string3 = string2;
            } else {
                try {
                    string3 = Cipher.getInstance((String)AES_KEY_ALG, (String)PROVIDER);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(sKey, AES_KEY_ALG);
                    string3.init(1, (Key)secretKeySpec);
                    string2 = SecurePreferences.encode(string3.doFinal(string2.getBytes("UTF-8")));
                    return string2;
                }
                catch (Exception exception) {
                    if (sLoggingEnabled) {
                        Log.w((String)TAG, (String)"encrypt", (Throwable)exception);
                    }
                    string3 = null;
                }
            }
        }
        return string3;
    }

    private static String generateAesKeyName(Context context) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        char[] cArray = context.getPackageName().toCharArray();
        byte[] byArray = SecurePreferences.getDeviceSerialNumber(context).getBytes();
        try {
            context = SecurePreferences.generatePBEKey(cArray, byArray, PRIMARY_PBE_KEY_ALG, 2000, 256);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            context = SecurePreferences.generatePBEKey(cArray, byArray, BACKUP_PBE_KEY_ALG, 2000, 256);
        }
        return SecurePreferences.encode(context.getEncoded());
    }

    private static String generateAesKeyValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance((String)AES_KEY_ALG);
        try {
            keyGenerator.init(256, secureRandom);
        }
        catch (Exception exception) {
            try {
                keyGenerator.init(192, secureRandom);
            }
            catch (Exception exception2) {
                keyGenerator.init(128, secureRandom);
            }
        }
        return SecurePreferences.encode(keyGenerator.generateKey().getEncoded());
    }

    private static SecretKey generatePBEKey(char[] cArray, byte[] byArray, String string2, int n3, int n7) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        int n8 = n3;
        if (n3 == 0) {
            n8 = 1000;
        }
        return SecretKeyFactory.getInstance((String)string2, (String)PROVIDER).generateSecret((KeySpec)new PBEKeySpec(cArray, byArray, n8, n7));
    }

    private static String getDeviceSerialNumber(Context context) {
        String string2;
        String string3;
        try {
            string2 = string3 = (String)Build.class.getField("SERIAL").get(null);
        }
        catch (Exception exception) {
            return Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
        }
        if (TextUtils.isEmpty((CharSequence)string3)) {
            string2 = Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
        }
        return string2;
    }

    public static boolean isLoggingEnabled() {
        return sLoggingEnabled;
    }

    public static void setLoggingEnabled(boolean bl) {
        sLoggingEnabled = bl;
    }

    public boolean contains(String string2) {
        return sFile.contains(SecurePreferences.encrypt(string2));
    }

    public Editor edit() {
        return new Editor(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Map<String, String> getAll() {
        Map map = sFile.getAll();
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            try {
                hashMap.put((Object)SecurePreferences.decrypt((String)entry.getKey()), (Object)SecurePreferences.decrypt(entry.getValue().toString()));
            }
            catch (Exception exception) {}
        }
        return hashMap;
    }

    public boolean getBoolean(String string2, boolean bl) {
        if ((string2 = sFile.getString(SecurePreferences.encrypt(string2), null)) == null) {
            return bl;
        }
        try {
            bl = Boolean.parseBoolean((String)SecurePreferences.decrypt(string2));
            return bl;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ClassCastException(numberFormatException.getMessage());
        }
    }

    public float getFloat(String string2, float f7) {
        if ((string2 = sFile.getString(SecurePreferences.encrypt(string2), null)) == null) {
            return f7;
        }
        try {
            f7 = Float.parseFloat((String)SecurePreferences.decrypt(string2));
            return f7;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ClassCastException(numberFormatException.getMessage());
        }
    }

    public int getInt(String string2, int n3) {
        if ((string2 = sFile.getString(SecurePreferences.encrypt(string2), null)) == null) {
            return n3;
        }
        try {
            n3 = Integer.parseInt((String)SecurePreferences.decrypt(string2));
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ClassCastException(numberFormatException.getMessage());
        }
    }

    public long getLong(String string2, long l4) {
        if ((string2 = sFile.getString(SecurePreferences.encrypt(string2), null)) == null) {
            return l4;
        }
        try {
            l4 = Long.parseLong((String)SecurePreferences.decrypt(string2));
            return l4;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ClassCastException(numberFormatException.getMessage());
        }
    }

    public String getString(String string2, String string3) {
        if ((string2 = sFile.getString(SecurePreferences.encrypt(string2), null)) != null) {
            string3 = SecurePreferences.decrypt(string2);
        }
        return string3;
    }

    @TargetApi(value=11)
    public Set<String> getStringSet(String string2, Set<String> iterator) {
        Set set = sFile.getStringSet(SecurePreferences.encrypt(string2), null);
        if (set == null) {
            return iterator;
        }
        string2 = new HashSet(set.size());
        iterator = set.iterator();
        while (iterator.hasNext()) {
            string2.add((Object)SecurePreferences.decrypt((String)iterator.next()));
        }
        return string2;
    }

    public String getStringUnencrypted(String string2, String string3) {
        if ((string2 = sFile.getString(SecurePreferences.encrypt(string2), null)) != null) {
            string3 = string2;
        }
        return string3;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sFile.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sFile.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static class Editor
    implements SharedPreferences.Editor {
        private SharedPreferences.Editor mEditor = SecurePreferences.access$100().edit();

        private Editor() {
        }

        public /* synthetic */ Editor(1 var1_1) {
            this();
        }

        @TargetApi(value=9)
        public void apply() {
            this.mEditor.apply();
        }

        public SharedPreferences.Editor clear() {
            this.mEditor.clear();
            return this;
        }

        public boolean commit() {
            return this.mEditor.commit();
        }

        public SharedPreferences.Editor putBoolean(String string2, boolean bl) {
            this.mEditor.putString(SecurePreferences.encrypt(string2), SecurePreferences.encrypt(Boolean.toString((boolean)bl)));
            return this;
        }

        public SharedPreferences.Editor putFloat(String string2, float f7) {
            this.mEditor.putString(SecurePreferences.encrypt(string2), SecurePreferences.encrypt(Float.toString((float)f7)));
            return this;
        }

        public SharedPreferences.Editor putInt(String string2, int n3) {
            this.mEditor.putString(SecurePreferences.encrypt(string2), SecurePreferences.encrypt(Integer.toString((int)n3)));
            return this;
        }

        public SharedPreferences.Editor putLong(String string2, long l4) {
            this.mEditor.putString(SecurePreferences.encrypt(string2), SecurePreferences.encrypt(Long.toString((long)l4)));
            return this;
        }

        public SharedPreferences.Editor putString(String string2, String string3) {
            this.mEditor.putString(SecurePreferences.encrypt(string2), SecurePreferences.encrypt(string3));
            return this;
        }

        public SharedPreferences.Editor putStringNoEncrypted(String string2, String string3) {
            this.mEditor.putString(SecurePreferences.encrypt(string2), string3);
            return this;
        }

        @TargetApi(value=11)
        public SharedPreferences.Editor putStringSet(String string2, Set<String> iterator) {
            HashSet hashSet = new HashSet(iterator.size());
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                hashSet.add((Object)SecurePreferences.encrypt((String)iterator.next()));
            }
            this.mEditor.putStringSet(SecurePreferences.encrypt(string2), (Set)hashSet);
            return this;
        }

        public SharedPreferences.Editor remove(String string2) {
            this.mEditor.remove(SecurePreferences.encrypt(string2));
            return this;
        }
    }
}

