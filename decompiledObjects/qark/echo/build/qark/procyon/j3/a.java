// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j3;

import java.security.KeyStoreException;
import java.security.ProviderException;
import android.util.Log;
import c3.b;
import c3.c;
import java.security.GeneralSecurityException;
import android.content.SharedPreferences;
import java.io.CharConversionException;
import q3.k;
import android.preference.PreferenceManager;
import c3.l;
import android.content.Context;
import c3.n;
import c3.o;
import c3.q;

public final class a
{
    public static final Object d;
    public static final String e = "a";
    public final q a;
    public final c3.a b;
    public o c;
    
    static {
        d = new Object();
    }
    
    public a(final b b) {
        this.a = new d(j3.a.b.a(b), j3.a.b.b(b), j3.a.b.c(b));
        this.b = j3.a.b.d(b);
        this.c = j3.a.b.e(b);
    }
    
    public static /* synthetic */ Object a() {
        return a.d;
    }
    
    public static /* synthetic */ String c() {
        return a.e;
    }
    
    public static boolean e() {
        return true;
    }
    
    public n d() {
        synchronized (this) {
            return this.c.d();
        }
    }
    
    public static final class b
    {
        public Context a;
        public String b;
        public String c;
        public String d;
        public c3.a e;
        public boolean f;
        public l g;
        public o h;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = true;
            this.g = null;
        }
        
        public static /* synthetic */ Context a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ String b(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ String c(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ c3.a d(final b b) {
            return b.e;
        }
        
        public static /* synthetic */ o e(final b b) {
            return b.h;
        }
        
        public static byte[] h(Context applicationContext, final String s, final String s2) {
            Label_0071: {
                if (s == null) {
                    break Label_0071;
                }
                applicationContext = applicationContext.getApplicationContext();
                SharedPreferences sharedPreferences;
                if (s2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                }
                else {
                    sharedPreferences = applicationContext.getSharedPreferences(s2, 0);
                }
                while (true) {
                    while (true) {
                        try {
                            final String string = sharedPreferences.getString(s, (String)null);
                            if (string == null) {
                                return null;
                            }
                            return k.a(string);
                            throw new IllegalArgumentException("keysetName cannot be null");
                            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", s));
                        }
                        catch (ClassCastException ex) {}
                        catch (IllegalArgumentException ex2) {}
                        continue;
                    }
                }
            }
        }
        
        public a f() {
            // monitorenter(this)
            while (true) {
                try {
                    while (true) {
                        if (this.b != null) {
                            final Object a = j3.a.a();
                            // monitorenter(a)
                            while (true) {
                                try {
                                    final byte[] h = h(this.a, this.b, this.c);
                                    o h2;
                                    if (h == null) {
                                        if (this.d != null) {
                                            this.e = this.k();
                                        }
                                        h2 = this.g();
                                    }
                                    else if (this.d != null && e()) {
                                        h2 = this.j(h);
                                    }
                                    else {
                                        h2 = this.i(h);
                                    }
                                    this.h = h2;
                                    // monitorexit(a)
                                    // monitorexit(this)
                                    return new a(this, null);
                                    // monitorexit(this)
                                    throw new IllegalArgumentException("keysetName cannot be null");
                                }
                                // monitorexit(a)
                                finally {}
                                continue;
                            }
                        }
                        continue;
                    }
                }
                finally {}
                continue;
            }
        }
        
        public final o g() {
            if (this.g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            final o a = o.i().a(this.g);
            final o h = a.h(a.d().i().Z(0).Z());
            final d d = new d(this.a, this.b, this.c);
            if (this.e != null) {
                h.d().r(d, this.e);
                return h;
            }
            c3.c.b(h.d(), d);
            return h;
        }
        
        public final o i(final byte[] array) {
            return o.j(c3.c.a(c3.b.b(array)));
        }
        
        public final o j(final byte[] p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: new             Lj3/c;
            //     4: dup            
            //     5: invokespecial   j3/c.<init>:()V
            //     8: aload_0        
            //     9: getfield        j3/a$b.d:Ljava/lang/String;
            //    12: invokevirtual   j3/c.a:(Ljava/lang/String;)Lc3/a;
            //    15: putfield        j3/a$b.e:Lc3/a;
            //    18: aload_1        
            //    19: invokestatic    c3/b.b:([B)Lc3/p;
            //    22: aload_0        
            //    23: getfield        j3/a$b.e:Lc3/a;
            //    26: invokestatic    c3/n.n:(Lc3/p;Lc3/a;)Lc3/n;
            //    29: invokestatic    c3/o.j:(Lc3/n;)Lc3/o;
            //    32: astore_2       
            //    33: aload_2        
            //    34: areturn        
            //    35: astore_2       
            //    36: goto            40
            //    39: astore_2       
            //    40: aload_0        
            //    41: aload_1        
            //    42: invokevirtual   j3/a$b.i:([B)Lc3/o;
            //    45: astore_1       
            //    46: aload_1        
            //    47: areturn        
            //    48: aload_2        
            //    49: athrow         
            //    50: astore_2       
            //    51: goto            55
            //    54: astore_2       
            //    55: aload_0        
            //    56: aload_1        
            //    57: invokevirtual   j3/a$b.i:([B)Lc3/o;
            //    60: astore_1       
            //    61: invokestatic    j3/a.c:()Ljava/lang/String;
            //    64: ldc             "cannot use Android Keystore, it'll be disabled"
            //    66: aload_2        
            //    67: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //    70: pop            
            //    71: aload_1        
            //    72: areturn        
            //    73: aload_2        
            //    74: athrow         
            //    75: astore_1       
            //    76: goto            48
            //    79: astore_1       
            //    80: goto            73
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                    
            //  -----  -----  -----  -----  ----------------------------------------
            //  0      18     54     55     Ljava/security/GeneralSecurityException;
            //  0      18     50     54     Ljava/security/ProviderException;
            //  18     33     39     40     Ljava/io/IOException;
            //  18     33     35     39     Ljava/security/GeneralSecurityException;
            //  40     46     75     50     Ljava/io/IOException;
            //  55     71     79     75     Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final c3.a k() {
            if (!e()) {
                Log.w(j3.a.c(), "Android Keystore requires at least Android M");
                return null;
            }
            Object a = new j3.c();
            try {
                final boolean d = j3.c.d(this.d);
                try {
                    a = ((j3.c)a).a(this.d);
                    return (c3.a)a;
                }
                catch (ProviderException a) {}
                catch (GeneralSecurityException ex) {}
                if (d) {
                    Log.w(j3.a.c(), "cannot use Android Keystore, it'll be disabled", (Throwable)a);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.d), (Throwable)a);
            }
            catch (ProviderException a) {}
            catch (GeneralSecurityException ex2) {}
            Log.w(j3.a.c(), "cannot use Android Keystore, it'll be disabled", (Throwable)a);
            return null;
        }
        
        public b l(final l g) {
            this.g = g;
            return this;
        }
        
        public b m(final String d) {
            if (!d.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (this.f) {
                this.d = d;
                return this;
            }
            throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
        }
        
        public b n(final Context a, final String b, final String c) {
            if (a == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (b != null) {
                this.a = a;
                this.b = b;
                this.c = c;
                return this;
            }
            throw new IllegalArgumentException("need a keyset name");
        }
    }
}
