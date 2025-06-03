// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.io.EOFException;
import g0.M;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.List;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources$NotFoundException;
import g0.a;
import android.text.TextUtils;
import android.net.Uri;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import android.content.Context;

public final class w extends b
{
    public final Context e;
    public k f;
    public AssetFileDescriptor g;
    public InputStream h;
    public long i;
    public boolean j;
    
    public w(final Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }
    
    @Deprecated
    public static Uri buildRawResourceUri(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }
    
    public static AssetFileDescriptor u(final Context context, final k k) {
        final Uri normalizeScheme = k.a.normalizeScheme();
        Label_0186: {
            String substring;
            if (TextUtils.equals((CharSequence)"rawresource", (CharSequence)normalizeScheme.getScheme())) {
                final Resources resources = context.getResources();
                final List pathSegments = normalizeScheme.getPathSegments();
                if (pathSegments.size() != 1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("rawresource:// URI must have exactly one path element, found ");
                    sb.append(pathSegments.size());
                    throw new a(sb.toString());
                }
                substring = pathSegments.get(0);
            }
            else {
                if (!TextUtils.equals((CharSequence)"android.resource", (CharSequence)normalizeScheme.getScheme())) {
                    break Label_0186;
                }
                final String s = substring = (String)g0.a.e(normalizeScheme.getPath());
                if (s.startsWith("/")) {
                    substring = s.substring(1);
                }
                String str;
                if (TextUtils.isEmpty((CharSequence)normalizeScheme.getHost())) {
                    str = context.getPackageName();
                }
                else {
                    str = normalizeScheme.getHost();
                }
                if (str.equals(context.getPackageName())) {
                    final Resources resources = context.getResources();
                    break Label_0186;
                }
                break Label_0186;
            }
            while (true) {
                int n = v(substring);
                Label_0255: {
                    break Label_0255;
                    try {
                        final String str;
                        final Resources resources = context.getPackageManager().getResourcesForApplication(str);
                        if (substring.matches("\\d+")) {
                            continue;
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(":");
                        sb2.append(substring);
                        n = resources.getIdentifier(sb2.toString(), "raw", (String)null);
                        if (n != 0) {
                            try {
                                final AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(n);
                                if (openRawResourceFd != null) {
                                    return openRawResourceFd;
                                }
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Resource is compressed: ");
                                sb3.append(normalizeScheme);
                                throw new a(sb3.toString(), null, 2000);
                            }
                            catch (Resources$NotFoundException ex) {
                                throw new a(null, (Throwable)ex, 2005);
                            }
                        }
                        throw new a("Resource not found.", null, 2005);
                    }
                    catch (PackageManager$NameNotFoundException ex2) {
                        throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", (Throwable)ex2, 2005);
                    }
                }
                break;
            }
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Unsupported URI scheme (");
        sb4.append(normalizeScheme.getScheme());
        sb4.append("). Only ");
        sb4.append("android.resource");
        sb4.append(" is supported.");
        throw new a(sb4.toString(), null, 1004);
    }
    
    public static int v(final String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: putfield        i0/w.f:Li0/k;
        //     5: aload_0        
        //     6: getfield        i0/w.h:Ljava/io/InputStream;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ifnull          29
        //    14: aload_1        
        //    15: invokevirtual   java/io/InputStream.close:()V
        //    18: goto            29
        //    21: astore_1       
        //    22: goto            129
        //    25: astore_1       
        //    26: goto            116
        //    29: aload_0        
        //    30: aconst_null    
        //    31: putfield        i0/w.h:Ljava/io/InputStream;
        //    34: aload_0        
        //    35: getfield        i0/w.g:Landroid/content/res/AssetFileDescriptor;
        //    38: astore_1       
        //    39: aload_1        
        //    40: ifnull          58
        //    43: aload_1        
        //    44: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    47: goto            58
        //    50: astore_1       
        //    51: goto            93
        //    54: astore_1       
        //    55: goto            80
        //    58: aload_0        
        //    59: aconst_null    
        //    60: putfield        i0/w.g:Landroid/content/res/AssetFileDescriptor;
        //    63: aload_0        
        //    64: getfield        i0/w.j:Z
        //    67: ifeq            79
        //    70: aload_0        
        //    71: iconst_0       
        //    72: putfield        i0/w.j:Z
        //    75: aload_0        
        //    76: invokevirtual   i0/b.r:()V
        //    79: return         
        //    80: new             Li0/w$a;
        //    83: dup            
        //    84: aconst_null    
        //    85: aload_1        
        //    86: sipush          2000
        //    89: invokespecial   i0/w$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;I)V
        //    92: athrow         
        //    93: aload_0        
        //    94: aconst_null    
        //    95: putfield        i0/w.g:Landroid/content/res/AssetFileDescriptor;
        //    98: aload_0        
        //    99: getfield        i0/w.j:Z
        //   102: ifeq            114
        //   105: aload_0        
        //   106: iconst_0       
        //   107: putfield        i0/w.j:Z
        //   110: aload_0        
        //   111: invokevirtual   i0/b.r:()V
        //   114: aload_1        
        //   115: athrow         
        //   116: new             Li0/w$a;
        //   119: dup            
        //   120: aconst_null    
        //   121: aload_1        
        //   122: sipush          2000
        //   125: invokespecial   i0/w$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;I)V
        //   128: athrow         
        //   129: aload_0        
        //   130: aconst_null    
        //   131: putfield        i0/w.h:Ljava/io/InputStream;
        //   134: aload_0        
        //   135: getfield        i0/w.g:Landroid/content/res/AssetFileDescriptor;
        //   138: astore_2       
        //   139: aload_2        
        //   140: ifnull          158
        //   143: aload_2        
        //   144: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   147: goto            158
        //   150: astore_1       
        //   151: goto            194
        //   154: astore_1       
        //   155: goto            181
        //   158: aload_0        
        //   159: aconst_null    
        //   160: putfield        i0/w.g:Landroid/content/res/AssetFileDescriptor;
        //   163: aload_0        
        //   164: getfield        i0/w.j:Z
        //   167: ifeq            179
        //   170: aload_0        
        //   171: iconst_0       
        //   172: putfield        i0/w.j:Z
        //   175: aload_0        
        //   176: invokevirtual   i0/b.r:()V
        //   179: aload_1        
        //   180: athrow         
        //   181: new             Li0/w$a;
        //   184: dup            
        //   185: aconst_null    
        //   186: aload_1        
        //   187: sipush          2000
        //   190: invokespecial   i0/w$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;I)V
        //   193: athrow         
        //   194: aload_0        
        //   195: aconst_null    
        //   196: putfield        i0/w.g:Landroid/content/res/AssetFileDescriptor;
        //   199: aload_0        
        //   200: getfield        i0/w.j:Z
        //   203: ifeq            215
        //   206: aload_0        
        //   207: iconst_0       
        //   208: putfield        i0/w.j:Z
        //   211: aload_0        
        //   212: invokevirtual   i0/b.r:()V
        //   215: aload_1        
        //   216: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      10     25     29     Ljava/io/IOException;
        //  5      10     21     217    Any
        //  14     18     25     29     Ljava/io/IOException;
        //  14     18     21     217    Any
        //  34     39     54     58     Ljava/io/IOException;
        //  34     39     50     116    Any
        //  43     47     54     58     Ljava/io/IOException;
        //  43     47     50     116    Any
        //  80     93     50     116    Any
        //  116    129    21     217    Any
        //  134    139    154    158    Ljava/io/IOException;
        //  134    139    150    217    Any
        //  143    147    154    158    Ljava/io/IOException;
        //  143    147    150    217    Any
        //  181    194    150    217    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 117 out of bounds for length 117
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    @Override
    public long e(final k f) {
        this.s(this.f = f);
        final AssetFileDescriptor u = u(this.e, f);
        this.g = u;
        final long length = u.getLength();
        final FileInputStream h = new FileInputStream(this.g.getFileDescriptor());
        this.h = h;
        final long n = lcmp(length, -1L);
        while (true) {
            if (n != 0) {
                while (true) {
                    try {
                        if (f.g > length) {
                            throw new a(null, null, 2008);
                        }
                        final long startOffset = this.g.getStartOffset();
                        final long n2 = h.skip(f.g + startOffset) - startOffset;
                        if (n2 != f.g) {
                            throw new a(null, null, 2008);
                        }
                        if (n == 0) {
                            final FileChannel channel = h.getChannel();
                            if (channel.size() == 0L) {
                                this.i = -1L;
                            }
                            else {
                                final long i = channel.size() - channel.position();
                                this.i = i;
                                if (i < 0L) {
                                    throw new a(null, null, 2008);
                                }
                            }
                        }
                        else {
                            final long j = length - n2;
                            this.i = j;
                            if (j < 0L) {
                                throw new h(2008);
                            }
                        }
                        long n3 = f.h;
                        if (n3 != -1L) {
                            final long k = this.i;
                            if (k != -1L) {
                                n3 = Math.min(k, n3);
                            }
                            this.i = n3;
                        }
                        this.j = true;
                        this.t(f);
                        final long h2 = f.h;
                        if (h2 != -1L) {
                            return h2;
                        }
                        return this.i;
                        throw;
                    }
                    catch (IOException ex) {}
                    catch (a a2) {}
                    final a a2;
                    final a a = a2;
                    continue;
                }
            }
            continue;
        }
    }
    
    @Override
    public Uri k() {
        final k f = this.f;
        if (f != null) {
            return f.a;
        }
        return null;
    }
    
    @Override
    public int read(final byte[] b, int read, int len) {
        if (len == 0) {
            return 0;
        }
        final long i = this.i;
        if (i == 0L) {
            return -1;
        }
        Label_0046: {
            if (i == -1L) {
                break Label_0046;
            }
            final long b2 = len;
            try {
                len = (int)Math.min(i, b2);
                read = ((InputStream)M.i(this.h)).read(b, read, len);
                if (read != -1) {
                    final long j = this.i;
                    if (j != -1L) {
                        this.i = j - read;
                    }
                    this.q(read);
                    return read;
                }
                if (this.i == -1L) {
                    return -1;
                }
                throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            catch (IOException ex) {
                throw new a(null, ex, 2000);
            }
        }
    }
    
    public static class a extends h
    {
        public a(final String s) {
            super(s, null, 2000);
        }
        
        public a(final String s, final Throwable t, final int n) {
            super(s, t, n);
        }
    }
}
