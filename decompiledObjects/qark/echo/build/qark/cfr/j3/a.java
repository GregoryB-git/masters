/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.preference.PreferenceManager
 *  android.util.Log
 *  java.io.CharConversionException
 *  java.io.IOException
 *  java.lang.ClassCastException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.KeyStoreException
 *  java.security.ProviderException
 */
package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import c3.l;
import c3.n;
import c3.o;
import c3.q;
import j3.c;
import j3.d;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p3.D;
import q3.k;

public final class a {
    public static final Object d = new Object();
    public static final String e = "a";
    public final q a;
    public final c3.a b;
    public o c;

    public a(b b8) {
        this.a = new d(b8.a, b8.b, b8.c);
        this.b = b8.e;
        this.c = b8.h;
    }

    public /* synthetic */ a(b b8,  a8) {
        this(b8);
    }

    public static boolean e() {
        return true;
    }

    public n d() {
        synchronized (this) {
            n n8 = this.c.d();
            return n8;
        }
    }

    public static final class b {
        public Context a = null;
        public String b = null;
        public String c = null;
        public String d = null;
        public c3.a e = null;
        public boolean f = true;
        public l g = null;
        public o h;

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static byte[] h(Context sharedPreferences, String string2, String string3) {
            block4 : {
                if (string2 == null) throw new IllegalArgumentException("keysetName cannot be null");
                sharedPreferences = sharedPreferences.getApplicationContext();
                sharedPreferences = string3 == null ? PreferenceManager.getDefaultSharedPreferences((Context)sharedPreferences) : sharedPreferences.getSharedPreferences(string3, 0);
                sharedPreferences = sharedPreferences.getString(string2, null);
                if (sharedPreferences != null) break block4;
                return null;
            }
            try {
                return k.a((String)sharedPreferences);
            }
            catch (ClassCastException | IllegalArgumentException illegalArgumentException) {
                throw new CharConversionException(String.format((String)"can't read keyset; the pref value %s is not a valid hex string", (Object[])new Object[]{string2}));
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public a f() {
            // MONITORENTER : this
            if (this.b == null) throw new IllegalArgumentException("keysetName cannot be null");
            Object object = d;
            // MONITORENTER : object
            try {
                Object object2 = b.h(this.a, this.b, this.c);
                if (object2 == null) {
                    if (this.d != null) {
                        this.e = this.k();
                    }
                    object2 = this.g();
                } else {
                    object2 = this.d != null && a.e() ? this.j((byte[])object2) : this.i((byte[])object2);
                }
                this.h = object2;
                object2 = new a(this, null);
                // MONITOREXIT : object
                // MONITOREXIT : this
                return object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }

        public final o g() {
            if (this.g != null) {
                o o8 = o.i().a(this.g);
                o8 = o8.h(o8.d().i().Z(0).Z());
                d d8 = new d(this.a, this.b, this.c);
                if (this.e != null) {
                    o8.d().r(d8, this.e);
                    return o8;
                }
                c3.c.b(o8.d(), d8);
                return o8;
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }

        public final o i(byte[] arrby) {
            return o.j(c3.c.a(c3.b.b(arrby)));
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final o j(byte[] object) {
            void var2_10;
            this.e = new c().a(this.d);
            try {
                return o.j(n.n(c3.b.b((byte[])object), this.e));
            }
            catch (GeneralSecurityException generalSecurityException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            try {
                return this.i((byte[])object);
            }
            catch (IOException iOException) {
                void var2_7;
                throw var2_7;
            }
            catch (ProviderException providerException) {
            }
            catch (GeneralSecurityException generalSecurityException) {
                // empty catch block
            }
            try {
                object = this.i((byte[])object);
                Log.w((String)e, (String)"cannot use Android Keystore, it'll be disabled", (Throwable)var2_10);
                return object;
            }
            catch (IOException iOException) {
                throw var2_10;
            }
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final c3.a k() {
            void var2_4;
            void var2_7;
            if (!a.e()) {
                Log.w((String)e, (String)"Android Keystore requires at least Android M");
                return null;
            }
            c object = new c();
            boolean bl = c.d(this.d);
            try {
                return object.a(this.d);
            }
            catch (ProviderException providerException) {
            }
            catch (GeneralSecurityException generalSecurityException) {
                // empty catch block
            }
            if (!bl) throw new KeyStoreException(String.format((String)"the master key %s exists but is unusable", (Object[])new Object[]{this.d}), (Throwable)var2_4);
            Log.w((String)e, (String)"cannot use Android Keystore, it'll be disabled", (Throwable)var2_4);
            return null;
            catch (ProviderException providerException) {
            }
            catch (GeneralSecurityException generalSecurityException) {
                // empty catch block
            }
            Log.w((String)e, (String)"cannot use Android Keystore, it'll be disabled", (Throwable)var2_7);
            return null;
        }

        public b l(l l8) {
            this.g = l8;
            return this;
        }

        public b m(String string2) {
            if (string2.startsWith("android-keystore://")) {
                if (this.f) {
                    this.d = string2;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public b n(Context context, String string2, String string3) {
            if (context != null) {
                if (string2 != null) {
                    this.a = context;
                    this.b = string2;
                    this.c = string3;
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

}

