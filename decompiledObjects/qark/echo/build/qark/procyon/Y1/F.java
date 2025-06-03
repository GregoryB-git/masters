// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import x1.o;
import x1.h;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import O1.P;
import x1.B;
import android.os.Bundle;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public abstract class F extends A
{
    public static final a s;
    public String r;
    
    static {
        s = new a(null);
    }
    
    public F(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
    }
    
    public F(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
    }
    
    public Bundle p(final Bundle bundle, final u.e e) {
        Intrinsics.checkNotNullParameter(bundle, "parameters");
        Intrinsics.checkNotNullParameter(e, "request");
        ((BaseBundle)bundle).putString("redirect_uri", this.g());
        String s;
        if (e.r()) {
            s = "app_id";
        }
        else {
            s = "client_id";
        }
        ((BaseBundle)bundle).putString(s, e.a());
        ((BaseBundle)bundle).putString("e2e", u.A.a());
        String s2;
        if (e.r()) {
            s2 = "token,signed_request,graph_domain,granted_scopes";
        }
        else {
            if (e.n().contains("openid")) {
                ((BaseBundle)bundle).putString("nonce", e.m());
            }
            s2 = "id_token,token,signed_request,graph_domain";
        }
        ((BaseBundle)bundle).putString("response_type", s2);
        ((BaseBundle)bundle).putString("code_challenge", e.d());
        final Y1.a e2 = e.e();
        String name;
        if (e2 == null) {
            name = null;
        }
        else {
            name = e2.name();
        }
        ((BaseBundle)bundle).putString("code_challenge_method", name);
        ((BaseBundle)bundle).putString("return_scopes", "true");
        ((BaseBundle)bundle).putString("auth_type", e.c());
        ((BaseBundle)bundle).putString("login_behavior", e.j().name());
        ((BaseBundle)bundle).putString("sdk", Intrinsics.i("android-", B.B()));
        if (this.r() != null) {
            ((BaseBundle)bundle).putString("sso", this.r());
        }
        final boolean q = B.q;
        final String s3 = "0";
        String s4;
        if (q) {
            s4 = "1";
        }
        else {
            s4 = "0";
        }
        ((BaseBundle)bundle).putString("cct_prefetching", s4);
        if (e.q()) {
            ((BaseBundle)bundle).putString("fx_app", e.k().toString());
        }
        if (e.v()) {
            ((BaseBundle)bundle).putString("skip_dedupe", "true");
        }
        if (e.l() != null) {
            ((BaseBundle)bundle).putString("messenger_page_id", e.l());
            String s5 = s3;
            if (e.o()) {
                s5 = "1";
            }
            ((BaseBundle)bundle).putString("reset_messenger_state", s5);
        }
        return bundle;
    }
    
    public Bundle q(final u.e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        final Bundle bundle = new Bundle();
        final P a = P.a;
        if (!P.d0(e.n())) {
            final String join = TextUtils.join((CharSequence)",", (Iterable)e.n());
            ((BaseBundle)bundle).putString("scope", join);
            this.a("scope", join);
        }
        e e2;
        if ((e2 = e.g()) == null) {
            e2 = e.p;
        }
        ((BaseBundle)bundle).putString("default_audience", e2.e());
        ((BaseBundle)bundle).putString("state", this.c(e.b()));
        final x1.a e3 = x1.a.z.e();
        String l;
        if (e3 == null) {
            l = null;
        }
        else {
            l = e3.l();
        }
        final String s = "0";
        if (l != null && Intrinsics.a(l, this.u())) {
            ((BaseBundle)bundle).putString("access_token", l);
            this.a("access_token", "1");
        }
        else {
            final androidx.fragment.app.e i = this.d().i();
            if (i != null) {
                P.i((Context)i);
            }
            this.a("access_token", "0");
        }
        ((BaseBundle)bundle).putString("cbt", String.valueOf(System.currentTimeMillis()));
        String s2 = s;
        if (B.p()) {
            s2 = "1";
        }
        ((BaseBundle)bundle).putString("ies", s2);
        return bundle;
    }
    
    public String r() {
        return null;
    }
    
    public abstract h t();
    
    public final String u() {
        Object o;
        if ((o = this.d().i()) == null) {
            o = B.l();
        }
        return ((Context)o).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }
    
    public void v(final u.e p0, final Bundle p1, final o p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "request"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokevirtual   Y1/A.d:()LY1/u;
        //    10: astore          4
        //    12: aload_0        
        //    13: aconst_null    
        //    14: putfield        Y1/F.r:Ljava/lang/String;
        //    17: aload_2        
        //    18: ifnull          158
        //    21: aload_2        
        //    22: ldc             "e2e"
        //    24: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //    27: ifeq            40
        //    30: aload_0        
        //    31: aload_2        
        //    32: ldc             "e2e"
        //    34: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    37: putfield        Y1/F.r:Ljava/lang/String;
        //    40: getstatic       Y1/A.q:LY1/A$a;
        //    43: astore          5
        //    45: aload           5
        //    47: aload_1        
        //    48: invokevirtual   Y1/u$e.n:()Ljava/util/Set;
        //    51: aload_2        
        //    52: aload_0        
        //    53: invokevirtual   Y1/F.t:()Lx1/h;
        //    56: aload_1        
        //    57: invokevirtual   Y1/u$e.a:()Ljava/lang/String;
        //    60: invokevirtual   Y1/A$a.b:(Ljava/util/Collection;Landroid/os/Bundle;Lx1/h;Ljava/lang/String;)Lx1/a;
        //    63: astore_3       
        //    64: aload           5
        //    66: aload_2        
        //    67: aload_1        
        //    68: invokevirtual   Y1/u$e.m:()Ljava/lang/String;
        //    71: invokevirtual   Y1/A$a.d:(Landroid/os/Bundle;Ljava/lang/String;)Lx1/i;
        //    74: astore_1       
        //    75: getstatic       Y1/u$f.w:LY1/u$f$c;
        //    78: aload           4
        //    80: invokevirtual   Y1/u.o:()LY1/u$e;
        //    83: aload_3        
        //    84: aload_1        
        //    85: invokevirtual   Y1/u$f$c.b:(LY1/u$e;Lx1/a;Lx1/i;)LY1/u$f;
        //    88: astore_2       
        //    89: aload           4
        //    91: invokevirtual   Y1/u.i:()Landroidx/fragment/app/e;
        //    94: astore          5
        //    96: aload_2        
        //    97: astore_1       
        //    98: aload           5
        //   100: ifnull          250
        //   103: aload           4
        //   105: invokevirtual   Y1/u.i:()Landroidx/fragment/app/e;
        //   108: invokestatic    android/webkit/CookieSyncManager.createInstance:(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
        //   111: invokevirtual   android/webkit/CookieSyncManager.sync:()V
        //   114: aload_2        
        //   115: astore_1       
        //   116: aload_3        
        //   117: ifnull          250
        //   120: aload_0        
        //   121: aload_3        
        //   122: invokevirtual   x1/a.l:()Ljava/lang/String;
        //   125: invokevirtual   Y1/F.w:(Ljava/lang/String;)V
        //   128: aload_2        
        //   129: astore_1       
        //   130: goto            250
        //   133: astore_1       
        //   134: getstatic       Y1/u$f.w:LY1/u$f$c;
        //   137: aload           4
        //   139: invokevirtual   Y1/u.o:()LY1/u$e;
        //   142: aconst_null    
        //   143: aload_1        
        //   144: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   147: aconst_null    
        //   148: bipush          8
        //   150: aconst_null    
        //   151: invokestatic    Y1/u$f$c.d:(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;
        //   154: astore_1       
        //   155: goto            250
        //   158: aload_3        
        //   159: instanceof      Lx1/q;
        //   162: ifeq            183
        //   165: getstatic       Y1/u$f.w:LY1/u$f$c;
        //   168: aload           4
        //   170: invokevirtual   Y1/u.o:()LY1/u$e;
        //   173: ldc_w           "User canceled log in."
        //   176: invokevirtual   Y1/u$f$c.a:(LY1/u$e;Ljava/lang/String;)LY1/u$f;
        //   179: astore_1       
        //   180: goto            250
        //   183: aload_0        
        //   184: aconst_null    
        //   185: putfield        Y1/F.r:Ljava/lang/String;
        //   188: aload_3        
        //   189: ifnonnull       197
        //   192: aconst_null    
        //   193: astore_1       
        //   194: goto            202
        //   197: aload_3        
        //   198: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   201: astore_1       
        //   202: aload_3        
        //   203: instanceof      Lx1/D;
        //   206: ifeq            233
        //   209: aload_3        
        //   210: checkcast       Lx1/D;
        //   213: invokevirtual   x1/D.c:()Lx1/r;
        //   216: astore_1       
        //   217: aload_1        
        //   218: invokevirtual   x1/r.b:()I
        //   221: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   224: astore_2       
        //   225: aload_1        
        //   226: invokevirtual   x1/r.toString:()Ljava/lang/String;
        //   229: astore_1       
        //   230: goto            235
        //   233: aconst_null    
        //   234: astore_2       
        //   235: getstatic       Y1/u$f.w:LY1/u$f$c;
        //   238: aload           4
        //   240: invokevirtual   Y1/u.o:()LY1/u$e;
        //   243: aconst_null    
        //   244: aload_1        
        //   245: aload_2        
        //   246: invokevirtual   Y1/u$f$c.c:(LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LY1/u$f;
        //   249: astore_1       
        //   250: getstatic       O1/P.a:LO1/P;
        //   253: astore_2       
        //   254: aload_0        
        //   255: getfield        Y1/F.r:Ljava/lang/String;
        //   258: invokestatic    O1/P.c0:(Ljava/lang/String;)Z
        //   261: ifne            272
        //   264: aload_0        
        //   265: aload_0        
        //   266: getfield        Y1/F.r:Ljava/lang/String;
        //   269: invokevirtual   Y1/A.h:(Ljava/lang/String;)V
        //   272: aload           4
        //   274: aload_1        
        //   275: invokevirtual   Y1/u.g:(LY1/u$f;)V
        //   278: return         
        //   279: astore_1       
        //   280: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  40     96     133    158    Lx1/o;
        //  103    114    279    283    Ljava/lang/Exception;
        //  120    128    133    158    Lx1/o;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
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
    
    public final void w(final String s) {
        Object o;
        if ((o = this.d().i()) == null) {
            o = B.l();
        }
        ((Context)o).getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
    }
    
    public static final class a
    {
    }
}
