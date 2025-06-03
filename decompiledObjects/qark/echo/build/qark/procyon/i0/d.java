// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import android.os.BaseBundle;
import g0.M;
import java.nio.channels.FileChannel;
import java.io.IOException;
import android.os.Bundle;
import android.content.Context;
import java.io.FileInputStream;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.ContentResolver;

public final class d extends b
{
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;
    
    public d(final Context context) {
        super(false);
        this.e = context.getContentResolver();
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: putfield        i0/d.f:Landroid/net/Uri;
        //     5: aload_0        
        //     6: getfield        i0/d.h:Ljava/io/FileInputStream;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ifnull          29
        //    14: aload_1        
        //    15: invokevirtual   java/io/FileInputStream.close:()V
        //    18: goto            29
        //    21: astore_1       
        //    22: goto            127
        //    25: astore_1       
        //    26: goto            115
        //    29: aload_0        
        //    30: aconst_null    
        //    31: putfield        i0/d.h:Ljava/io/FileInputStream;
        //    34: aload_0        
        //    35: getfield        i0/d.g:Landroid/content/res/AssetFileDescriptor;
        //    38: astore_1       
        //    39: aload_1        
        //    40: ifnull          58
        //    43: aload_1        
        //    44: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    47: goto            58
        //    50: astore_1       
        //    51: goto            92
        //    54: astore_1       
        //    55: goto            80
        //    58: aload_0        
        //    59: aconst_null    
        //    60: putfield        i0/d.g:Landroid/content/res/AssetFileDescriptor;
        //    63: aload_0        
        //    64: getfield        i0/d.j:Z
        //    67: ifeq            79
        //    70: aload_0        
        //    71: iconst_0       
        //    72: putfield        i0/d.j:Z
        //    75: aload_0        
        //    76: invokevirtual   i0/b.r:()V
        //    79: return         
        //    80: new             Li0/d$a;
        //    83: dup            
        //    84: aload_1        
        //    85: sipush          2000
        //    88: invokespecial   i0/d$a.<init>:(Ljava/io/IOException;I)V
        //    91: athrow         
        //    92: aload_0        
        //    93: aconst_null    
        //    94: putfield        i0/d.g:Landroid/content/res/AssetFileDescriptor;
        //    97: aload_0        
        //    98: getfield        i0/d.j:Z
        //   101: ifeq            113
        //   104: aload_0        
        //   105: iconst_0       
        //   106: putfield        i0/d.j:Z
        //   109: aload_0        
        //   110: invokevirtual   i0/b.r:()V
        //   113: aload_1        
        //   114: athrow         
        //   115: new             Li0/d$a;
        //   118: dup            
        //   119: aload_1        
        //   120: sipush          2000
        //   123: invokespecial   i0/d$a.<init>:(Ljava/io/IOException;I)V
        //   126: athrow         
        //   127: aload_0        
        //   128: aconst_null    
        //   129: putfield        i0/d.h:Ljava/io/FileInputStream;
        //   132: aload_0        
        //   133: getfield        i0/d.g:Landroid/content/res/AssetFileDescriptor;
        //   136: astore_2       
        //   137: aload_2        
        //   138: ifnull          156
        //   141: aload_2        
        //   142: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   145: goto            156
        //   148: astore_1       
        //   149: goto            191
        //   152: astore_1       
        //   153: goto            179
        //   156: aload_0        
        //   157: aconst_null    
        //   158: putfield        i0/d.g:Landroid/content/res/AssetFileDescriptor;
        //   161: aload_0        
        //   162: getfield        i0/d.j:Z
        //   165: ifeq            177
        //   168: aload_0        
        //   169: iconst_0       
        //   170: putfield        i0/d.j:Z
        //   173: aload_0        
        //   174: invokevirtual   i0/b.r:()V
        //   177: aload_1        
        //   178: athrow         
        //   179: new             Li0/d$a;
        //   182: dup            
        //   183: aload_1        
        //   184: sipush          2000
        //   187: invokespecial   i0/d$a.<init>:(Ljava/io/IOException;I)V
        //   190: athrow         
        //   191: aload_0        
        //   192: aconst_null    
        //   193: putfield        i0/d.g:Landroid/content/res/AssetFileDescriptor;
        //   196: aload_0        
        //   197: getfield        i0/d.j:Z
        //   200: ifeq            212
        //   203: aload_0        
        //   204: iconst_0       
        //   205: putfield        i0/d.j:Z
        //   208: aload_0        
        //   209: invokevirtual   i0/b.r:()V
        //   212: aload_1        
        //   213: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      10     25     29     Ljava/io/IOException;
        //  5      10     21     214    Any
        //  14     18     25     29     Ljava/io/IOException;
        //  14     18     21     214    Any
        //  34     39     54     58     Ljava/io/IOException;
        //  34     39     50     115    Any
        //  43     47     54     58     Ljava/io/IOException;
        //  43     47     50     115    Any
        //  80     92     50     115    Any
        //  115    127    21     214    Any
        //  132    137    152    156    Ljava/io/IOException;
        //  132    137    148    214    Any
        //  141    145    152    156    Ljava/io/IOException;
        //  141    145    148    214    Any
        //  179    191    148    214    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 114 out of bounds for length 114
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
    public long e(final k k) {
        int n = 2000;
        while (true) {
            try {
                final Uri normalizeScheme = k.a.normalizeScheme();
                this.f = normalizeScheme;
                this.s(k);
                AssetFileDescriptor g;
                if ("content".equals(normalizeScheme.getScheme())) {
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    g = this.e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                }
                else {
                    g = this.e.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.g = g;
                if (g == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not open file descriptor for: ");
                    sb.append(normalizeScheme);
                    throw new a(new IOException(sb.toString()), 2000);
                }
                final long length = g.getLength();
                final FileInputStream h = new FileInputStream(g.getFileDescriptor());
                this.h = h;
                final long n2 = lcmp(length, -1L);
                if (n2 != 0 && k.g > length) {
                    throw new a((IOException)null, 2008);
                }
                final long startOffset = g.getStartOffset();
                final long n3 = h.skip(k.g + startOffset) - startOffset;
                if (n3 != k.g) {
                    throw new a((IOException)null, 2008);
                }
                if (n2 == 0) {
                    final FileChannel channel = h.getChannel();
                    final long size = channel.size();
                    if (size == 0L) {
                        this.i = -1L;
                    }
                    else {
                        final long i = size - channel.position();
                        this.i = i;
                        if (i < 0L) {
                            throw new a((IOException)null, 2008);
                        }
                    }
                }
                else {
                    final long j = length - n3;
                    this.i = j;
                    if (j < 0L) {
                        throw new a((IOException)null, 2008);
                    }
                }
                long n4 = k.h;
                if (n4 != -1L) {
                    final long l = this.i;
                    if (l != -1L) {
                        n4 = Math.min(l, n4);
                    }
                    this.i = n4;
                }
                this.j = true;
                this.t(k);
                final long h2 = k.h;
                if (h2 != -1L) {
                    return h2;
                }
                return this.i;
                n = 2005;
                final IOException ex;
                throw new a(ex, n);
                throw;
            }
            catch (IOException ex2) {}
            catch (a a2) {}
            final a a2;
            final a a = a2;
            continue;
        }
    }
    
    @Override
    public Uri k() {
        return this.f;
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
                read = ((FileInputStream)M.i(this.h)).read(b, read, len);
                if (read == -1) {
                    return -1;
                }
                final long j = this.i;
                if (j != -1L) {
                    this.i = j - read;
                }
                this.q(read);
                return read;
            }
            catch (IOException ex) {
                throw new a(ex, 2000);
            }
        }
    }
    
    public static class a extends h
    {
        public a(final IOException ex, final int n) {
            super(ex, n);
        }
    }
}
