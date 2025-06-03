// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import g0.D;
import android.media.metrics.LogSessionId;
import m0.O;
import k0.g0;
import l0.y1;
import java.util.UUID;
import d0.g;
import k0.v0;
import java.util.Collection;
import x0.x;
import F0.K;
import java.util.Objects;
import g0.F;
import j0.b;
import android.media.MediaCryptoException;
import p0.G;
import android.os.Bundle;
import java.util.List;
import android.media.MediaCodec$CodecException;
import g0.M;
import java.nio.ByteOrder;
import g0.a;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCrypto;
import k0.Y0;
import k0.o;
import d0.q;
import k0.u;
import m0.c0;
import java.util.ArrayDeque;
import android.media.MediaCodec$BufferInfo;
import j0.i;
import k0.n;

public abstract class w extends n
{
    public static final byte[] U0;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public final m.b F;
    public int F0;
    public final z G;
    public boolean G0;
    public final boolean H;
    public boolean H0;
    public final float I;
    public boolean I0;
    public final i J;
    public long J0;
    public final i K;
    public long K0;
    public final i L;
    public boolean L0;
    public final j M;
    public boolean M0;
    public final MediaCodec$BufferInfo N;
    public boolean N0;
    public final ArrayDeque O;
    public boolean O0;
    public final c0 P;
    public u P0;
    public q Q;
    public o Q0;
    public q R;
    public f R0;
    public p0.n S;
    public long S0;
    public p0.n T;
    public boolean T0;
    public Y0.a U;
    public MediaCrypto V;
    public long W;
    public float X;
    public float Y;
    public m Z;
    public q a0;
    public MediaFormat b0;
    public boolean c0;
    public float d0;
    public ArrayDeque e0;
    public d f0;
    public p g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public long t0;
    public int u0;
    public int v0;
    public ByteBuffer w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    
    static {
        U0 = new byte[] { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
    }
    
    public w(final int n, final m.b f, final z z, final boolean h, final float i) {
        super(n);
        this.F = f;
        this.G = (z)a.e(z);
        this.H = h;
        this.I = i;
        this.J = j0.i.F();
        this.K = new i(0);
        this.L = new i(2);
        final j m = new j();
        this.M = m;
        this.N = new MediaCodec$BufferInfo();
        this.X = 1.0f;
        this.Y = 1.0f;
        this.W = -9223372036854775807L;
        this.O = new ArrayDeque();
        this.R0 = f.e;
        m.z(0);
        m.r.order(ByteOrder.nativeOrder());
        this.P = new c0();
        this.d0 = -1.0f;
        this.h0 = 0;
        this.D0 = 0;
        this.u0 = -1;
        this.v0 = -1;
        this.t0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.E0 = 0;
        this.F0 = 0;
        this.Q0 = new o();
    }
    
    public static boolean M1(final q q) {
        final int k = q.K;
        return k == 0 || k == 2;
    }
    
    public static boolean c1(final IllegalStateException ex) {
        if (M.a >= 21 && d1(ex)) {
            return true;
        }
        final StackTraceElement[] stackTrace = ex.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }
    
    public static boolean d1(final IllegalStateException ex) {
        return ex instanceof MediaCodec$CodecException;
    }
    
    public static boolean e1(final IllegalStateException ex) {
        return ex instanceof MediaCodec$CodecException && ((MediaCodec$CodecException)ex).isRecoverable();
    }
    
    public static /* synthetic */ Y0.a h0(final w w) {
        return w.U;
    }
    
    public static boolean m0(final String anObject, final q q) {
        return M.a < 21 && q.q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(anObject);
    }
    
    public static boolean n0(String b) {
        if (M.a < 21 && "OMX.SEC.mp3.dec".equals(b) && "samsung".equals(M.c)) {
            b = M.b;
            if (b.startsWith("baffin") || b.startsWith("grand") || b.startsWith("fortuna") || b.startsWith("gprimelte") || b.startsWith("j2y18lte") || b.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean o0(final String anObject) {
        final int a = M.a;
        if (a > 23 || !"OMX.google.vorbis.decoder".equals(anObject)) {
            if (a == 19) {
                final String b = M.b;
                if (("hb2000".equals(b) || "stvm8".equals(b)) && ("OMX.amlogic.avc.decoder.awesome".equals(anObject) || "OMX.amlogic.avc.decoder.awesome.secure".equals(anObject))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean p0(final String anObject) {
        return M.a == 21 && "OMX.google.aac.decoder".equals(anObject);
    }
    
    public static boolean q0(final p p) {
        final String a = p.a;
        final int a2 = M.a;
        return (a2 <= 25 && "OMX.rk.video_decoder.avc".equals(a)) || (a2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(a) || "OMX.broadcom.video_decoder.tunnel.secure".equals(a) || "OMX.bcm.vdec.avc.tunnel".equals(a) || "OMX.bcm.vdec.avc.tunnel.secure".equals(a) || "OMX.bcm.vdec.hevc.tunnel".equals(a) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(a))) || ("Amazon".equals(M.c) && "AFTS".equals(M.d) && p.g);
    }
    
    public static boolean r0(final String s) {
        return M.a == 19 && M.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(s) || "OMX.Exynos.avc.dec.secure".equals(s));
    }
    
    public static boolean s0(final String anObject) {
        return M.a == 29 && "c2.android.aac.decoder".equals(anObject);
    }
    
    public final boolean A0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        t0/w.Z:Lt0/m;
        //     4: ifnull          919
        //     7: aload_0        
        //     8: getfield        t0/w.E0:I
        //    11: istore_1       
        //    12: iload_1        
        //    13: iconst_2       
        //    14: if_icmpeq       919
        //    17: aload_0        
        //    18: getfield        t0/w.L0:Z
        //    21: ifeq            26
        //    24: iconst_0       
        //    25: ireturn        
        //    26: iload_1        
        //    27: ifne            41
        //    30: aload_0        
        //    31: invokevirtual   t0/w.J1:()Z
        //    34: ifeq            41
        //    37: aload_0        
        //    38: invokevirtual   t0/w.w0:()V
        //    41: aload_0        
        //    42: getfield        t0/w.Z:Lt0/m;
        //    45: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //    48: checkcast       Lt0/m;
        //    51: astore          7
        //    53: aload_0        
        //    54: getfield        t0/w.u0:I
        //    57: ifge            101
        //    60: aload           7
        //    62: invokeinterface t0/m.n:()I
        //    67: istore_1       
        //    68: aload_0        
        //    69: iload_1        
        //    70: putfield        t0/w.u0:I
        //    73: iload_1        
        //    74: ifge            79
        //    77: iconst_0       
        //    78: ireturn        
        //    79: aload_0        
        //    80: getfield        t0/w.K:Lj0/i;
        //    83: aload           7
        //    85: iload_1        
        //    86: invokeinterface t0/m.i:(I)Ljava/nio/ByteBuffer;
        //    91: putfield        j0/i.r:Ljava/nio/ByteBuffer;
        //    94: aload_0        
        //    95: getfield        t0/w.K:Lj0/i;
        //    98: invokevirtual   j0/i.m:()V
        //   101: aload_0        
        //   102: getfield        t0/w.E0:I
        //   105: iconst_1       
        //   106: if_icmpne       150
        //   109: aload_0        
        //   110: getfield        t0/w.r0:Z
        //   113: ifeq            119
        //   116: goto            143
        //   119: aload_0        
        //   120: iconst_1       
        //   121: putfield        t0/w.H0:Z
        //   124: aload           7
        //   126: aload_0        
        //   127: getfield        t0/w.u0:I
        //   130: iconst_0       
        //   131: iconst_0       
        //   132: lconst_0       
        //   133: iconst_4       
        //   134: invokeinterface t0/m.b:(IIIJI)V
        //   139: aload_0        
        //   140: invokevirtual   t0/w.A1:()V
        //   143: aload_0        
        //   144: iconst_2       
        //   145: putfield        t0/w.E0:I
        //   148: iconst_0       
        //   149: ireturn        
        //   150: aload_0        
        //   151: getfield        t0/w.p0:Z
        //   154: ifeq            218
        //   157: aload_0        
        //   158: iconst_0       
        //   159: putfield        t0/w.p0:Z
        //   162: aload_0        
        //   163: getfield        t0/w.K:Lj0/i;
        //   166: getfield        j0/i.r:Ljava/nio/ByteBuffer;
        //   169: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   172: checkcast       Ljava/nio/ByteBuffer;
        //   175: astore          6
        //   177: getstatic       t0/w.U0:[B
        //   180: astore          8
        //   182: aload           6
        //   184: aload           8
        //   186: invokevirtual   java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        //   189: pop            
        //   190: aload           7
        //   192: aload_0        
        //   193: getfield        t0/w.u0:I
        //   196: iconst_0       
        //   197: aload           8
        //   199: arraylength    
        //   200: lconst_0       
        //   201: iconst_0       
        //   202: invokeinterface t0/m.b:(IIIJI)V
        //   207: aload_0        
        //   208: invokevirtual   t0/w.A1:()V
        //   211: aload_0        
        //   212: iconst_1       
        //   213: putfield        t0/w.G0:Z
        //   216: iconst_1       
        //   217: ireturn        
        //   218: aload_0        
        //   219: getfield        t0/w.D0:I
        //   222: iconst_1       
        //   223: if_icmpne       299
        //   226: iconst_0       
        //   227: istore_1       
        //   228: iload_1        
        //   229: aload_0        
        //   230: getfield        t0/w.a0:Ld0/q;
        //   233: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   236: checkcast       Ld0/q;
        //   239: getfield        d0/q.q:Ljava/util/List;
        //   242: invokeinterface java/util/List.size:()I
        //   247: if_icmpge       294
        //   250: aload_0        
        //   251: getfield        t0/w.a0:Ld0/q;
        //   254: getfield        d0/q.q:Ljava/util/List;
        //   257: iload_1        
        //   258: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   263: checkcast       [B
        //   266: astore          6
        //   268: aload_0        
        //   269: getfield        t0/w.K:Lj0/i;
        //   272: getfield        j0/i.r:Ljava/nio/ByteBuffer;
        //   275: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   278: checkcast       Ljava/nio/ByteBuffer;
        //   281: aload           6
        //   283: invokevirtual   java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        //   286: pop            
        //   287: iload_1        
        //   288: iconst_1       
        //   289: iadd           
        //   290: istore_1       
        //   291: goto            228
        //   294: aload_0        
        //   295: iconst_2       
        //   296: putfield        t0/w.D0:I
        //   299: aload_0        
        //   300: getfield        t0/w.K:Lj0/i;
        //   303: getfield        j0/i.r:Ljava/nio/ByteBuffer;
        //   306: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   309: checkcast       Ljava/nio/ByteBuffer;
        //   312: invokevirtual   java/nio/Buffer.position:()I
        //   315: istore_1       
        //   316: aload_0        
        //   317: invokevirtual   k0/n.N:()Lk0/v0;
        //   320: astore          6
        //   322: aload_0        
        //   323: aload           6
        //   325: aload_0        
        //   326: getfield        t0/w.K:Lj0/i;
        //   329: iconst_0       
        //   330: invokevirtual   k0/n.e0:(Lk0/v0;Lj0/i;I)I
        //   333: istore_2       
        //   334: iload_2        
        //   335: bipush          -3
        //   337: if_icmpne       357
        //   340: aload_0        
        //   341: invokevirtual   k0/n.p:()Z
        //   344: ifeq            355
        //   347: aload_0        
        //   348: aload_0        
        //   349: getfield        t0/w.J0:J
        //   352: putfield        t0/w.K0:J
        //   355: iconst_0       
        //   356: ireturn        
        //   357: iload_2        
        //   358: bipush          -5
        //   360: if_icmpne       392
        //   363: aload_0        
        //   364: getfield        t0/w.D0:I
        //   367: iconst_2       
        //   368: if_icmpne       383
        //   371: aload_0        
        //   372: getfield        t0/w.K:Lj0/i;
        //   375: invokevirtual   j0/i.m:()V
        //   378: aload_0        
        //   379: iconst_1       
        //   380: putfield        t0/w.D0:I
        //   383: aload_0        
        //   384: aload           6
        //   386: invokevirtual   t0/w.k1:(Lk0/v0;)Lk0/p;
        //   389: pop            
        //   390: iconst_1       
        //   391: ireturn        
        //   392: aload_0        
        //   393: getfield        t0/w.K:Lj0/i;
        //   396: invokevirtual   j0/a.p:()Z
        //   399: ifeq            504
        //   402: aload_0        
        //   403: aload_0        
        //   404: getfield        t0/w.J0:J
        //   407: putfield        t0/w.K0:J
        //   410: aload_0        
        //   411: getfield        t0/w.D0:I
        //   414: iconst_2       
        //   415: if_icmpne       430
        //   418: aload_0        
        //   419: getfield        t0/w.K:Lj0/i;
        //   422: invokevirtual   j0/i.m:()V
        //   425: aload_0        
        //   426: iconst_1       
        //   427: putfield        t0/w.D0:I
        //   430: aload_0        
        //   431: iconst_1       
        //   432: putfield        t0/w.L0:Z
        //   435: aload_0        
        //   436: getfield        t0/w.G0:Z
        //   439: ifne            448
        //   442: aload_0        
        //   443: invokevirtual   t0/w.r1:()V
        //   446: iconst_0       
        //   447: ireturn        
        //   448: aload_0        
        //   449: getfield        t0/w.r0:Z
        //   452: ifeq            457
        //   455: iconst_0       
        //   456: ireturn        
        //   457: aload_0        
        //   458: iconst_1       
        //   459: putfield        t0/w.H0:Z
        //   462: aload           7
        //   464: aload_0        
        //   465: getfield        t0/w.u0:I
        //   468: iconst_0       
        //   469: iconst_0       
        //   470: lconst_0       
        //   471: iconst_4       
        //   472: invokeinterface t0/m.b:(IIIJI)V
        //   477: aload_0        
        //   478: invokevirtual   t0/w.A1:()V
        //   481: iconst_0       
        //   482: ireturn        
        //   483: astore          6
        //   485: aload_0        
        //   486: aload           6
        //   488: aload_0        
        //   489: getfield        t0/w.Q:Ld0/q;
        //   492: aload           6
        //   494: invokevirtual   android/media/MediaCodec$CryptoException.getErrorCode:()I
        //   497: invokestatic    g0/M.W:(I)I
        //   500: invokevirtual   k0/n.J:(Ljava/lang/Throwable;Ld0/q;I)Lk0/u;
        //   503: athrow         
        //   504: aload_0        
        //   505: getfield        t0/w.G0:Z
        //   508: ifne            543
        //   511: aload_0        
        //   512: getfield        t0/w.K:Lj0/i;
        //   515: invokevirtual   j0/a.s:()Z
        //   518: ifne            543
        //   521: aload_0        
        //   522: getfield        t0/w.K:Lj0/i;
        //   525: invokevirtual   j0/i.m:()V
        //   528: aload_0        
        //   529: getfield        t0/w.D0:I
        //   532: iconst_2       
        //   533: if_icmpne       541
        //   536: aload_0        
        //   537: iconst_1       
        //   538: putfield        t0/w.D0:I
        //   541: iconst_1       
        //   542: ireturn        
        //   543: aload_0        
        //   544: getfield        t0/w.K:Lj0/i;
        //   547: invokevirtual   j0/i.D:()Z
        //   550: istore_3       
        //   551: iload_3        
        //   552: ifeq            566
        //   555: aload_0        
        //   556: getfield        t0/w.K:Lj0/i;
        //   559: getfield        j0/i.q:Lj0/c;
        //   562: iload_1        
        //   563: invokevirtual   j0/c.b:(I)V
        //   566: aload_0        
        //   567: getfield        t0/w.i0:Z
        //   570: ifeq            619
        //   573: iload_3        
        //   574: ifne            619
        //   577: aload_0        
        //   578: getfield        t0/w.K:Lj0/i;
        //   581: getfield        j0/i.r:Ljava/nio/ByteBuffer;
        //   584: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   587: checkcast       Ljava/nio/ByteBuffer;
        //   590: invokestatic    h0/d.b:(Ljava/nio/ByteBuffer;)V
        //   593: aload_0        
        //   594: getfield        t0/w.K:Lj0/i;
        //   597: getfield        j0/i.r:Ljava/nio/ByteBuffer;
        //   600: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   603: checkcast       Ljava/nio/ByteBuffer;
        //   606: invokevirtual   java/nio/Buffer.position:()I
        //   609: ifne            614
        //   612: iconst_1       
        //   613: ireturn        
        //   614: aload_0        
        //   615: iconst_0       
        //   616: putfield        t0/w.i0:Z
        //   619: aload_0        
        //   620: getfield        t0/w.K:Lj0/i;
        //   623: getfield        j0/i.t:J
        //   626: lstore          4
        //   628: aload_0        
        //   629: getfield        t0/w.N0:Z
        //   632: ifeq            694
        //   635: aload_0        
        //   636: getfield        t0/w.O:Ljava/util/ArrayDeque;
        //   639: invokevirtual   java/util/ArrayDeque.isEmpty:()Z
        //   642: ifne            680
        //   645: aload_0        
        //   646: getfield        t0/w.O:Ljava/util/ArrayDeque;
        //   649: invokevirtual   java/util/ArrayDeque.peekLast:()Ljava/lang/Object;
        //   652: checkcast       Lt0/w$f;
        //   655: astore          6
        //   657: aload           6
        //   659: getfield        t0/w$f.d:Lg0/D;
        //   662: lload           4
        //   664: aload_0        
        //   665: getfield        t0/w.Q:Ld0/q;
        //   668: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   671: checkcast       Ld0/q;
        //   674: invokevirtual   g0/D.a:(JLjava/lang/Object;)V
        //   677: goto            689
        //   680: aload_0        
        //   681: getfield        t0/w.R0:Lt0/w$f;
        //   684: astore          6
        //   686: goto            657
        //   689: aload_0        
        //   690: iconst_0       
        //   691: putfield        t0/w.N0:Z
        //   694: aload_0        
        //   695: aload_0        
        //   696: getfield        t0/w.J0:J
        //   699: lload           4
        //   701: invokestatic    java/lang/Math.max:(JJ)J
        //   704: putfield        t0/w.J0:J
        //   707: aload_0        
        //   708: invokevirtual   k0/n.p:()Z
        //   711: ifne            724
        //   714: aload_0        
        //   715: getfield        t0/w.K:Lj0/i;
        //   718: invokevirtual   j0/a.u:()Z
        //   721: ifeq            732
        //   724: aload_0        
        //   725: aload_0        
        //   726: getfield        t0/w.J0:J
        //   729: putfield        t0/w.K0:J
        //   732: aload_0        
        //   733: getfield        t0/w.K:Lj0/i;
        //   736: invokevirtual   j0/i.C:()V
        //   739: aload_0        
        //   740: getfield        t0/w.K:Lj0/i;
        //   743: invokevirtual   j0/a.o:()Z
        //   746: ifeq            757
        //   749: aload_0        
        //   750: aload_0        
        //   751: getfield        t0/w.K:Lj0/i;
        //   754: invokevirtual   t0/w.T0:(Lj0/i;)V
        //   757: aload_0        
        //   758: aload_0        
        //   759: getfield        t0/w.K:Lj0/i;
        //   762: invokevirtual   t0/w.p1:(Lj0/i;)V
        //   765: aload_0        
        //   766: aload_0        
        //   767: getfield        t0/w.K:Lj0/i;
        //   770: invokevirtual   t0/w.G0:(Lj0/i;)I
        //   773: istore_1       
        //   774: iload_3        
        //   775: ifeq            809
        //   778: aload           7
        //   780: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   783: checkcast       Lt0/m;
        //   786: aload_0        
        //   787: getfield        t0/w.u0:I
        //   790: iconst_0       
        //   791: aload_0        
        //   792: getfield        t0/w.K:Lj0/i;
        //   795: getfield        j0/i.q:Lj0/c;
        //   798: lload           4
        //   800: iload_1        
        //   801: invokeinterface t0/m.a:(IILj0/c;JI)V
        //   806: goto            846
        //   809: aload           7
        //   811: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   814: checkcast       Lt0/m;
        //   817: aload_0        
        //   818: getfield        t0/w.u0:I
        //   821: iconst_0       
        //   822: aload_0        
        //   823: getfield        t0/w.K:Lj0/i;
        //   826: getfield        j0/i.r:Ljava/nio/ByteBuffer;
        //   829: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   832: checkcast       Ljava/nio/ByteBuffer;
        //   835: invokevirtual   java/nio/Buffer.limit:()I
        //   838: lload           4
        //   840: iload_1        
        //   841: invokeinterface t0/m.b:(IIIJI)V
        //   846: aload_0        
        //   847: invokevirtual   t0/w.A1:()V
        //   850: aload_0        
        //   851: iconst_1       
        //   852: putfield        t0/w.G0:Z
        //   855: aload_0        
        //   856: iconst_0       
        //   857: putfield        t0/w.D0:I
        //   860: aload_0        
        //   861: getfield        t0/w.Q0:Lk0/o;
        //   864: astore          6
        //   866: aload           6
        //   868: aload           6
        //   870: getfield        k0/o.c:I
        //   873: iconst_1       
        //   874: iadd           
        //   875: putfield        k0/o.c:I
        //   878: iconst_1       
        //   879: ireturn        
        //   880: aload_0        
        //   881: aload           6
        //   883: aload_0        
        //   884: getfield        t0/w.Q:Ld0/q;
        //   887: aload           6
        //   889: invokevirtual   android/media/MediaCodec$CryptoException.getErrorCode:()I
        //   892: invokestatic    g0/M.W:(I)I
        //   895: invokevirtual   k0/n.J:(Ljava/lang/Throwable;Ld0/q;I)Lk0/u;
        //   898: athrow         
        //   899: astore          6
        //   901: aload_0        
        //   902: aload           6
        //   904: invokevirtual   t0/w.h1:(Ljava/lang/Exception;)V
        //   907: aload_0        
        //   908: iconst_0       
        //   909: invokevirtual   t0/w.u1:(I)Z
        //   912: pop            
        //   913: aload_0        
        //   914: invokevirtual   t0/w.B0:()V
        //   917: iconst_1       
        //   918: ireturn        
        //   919: iconst_0       
        //   920: ireturn        
        //   921: astore          6
        //   923: goto            880
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  322    334    899    919    Lj0/i$a;
        //  448    455    483    504    Landroid/media/MediaCodec$CryptoException;
        //  457    481    483    504    Landroid/media/MediaCodec$CryptoException;
        //  778    806    921    899    Landroid/media/MediaCodec$CryptoException;
        //  809    846    921    899    Landroid/media/MediaCodec$CryptoException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0809:
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
    
    public final void A1() {
        this.u0 = -1;
        this.K.r = null;
    }
    
    public final void B0() {
        try {
            ((m)a.h(this.Z)).flush();
        }
        finally {
            this.y1();
        }
    }
    
    public final void B1() {
        this.v0 = -1;
        this.w0 = null;
    }
    
    public final boolean C0() {
        final boolean d0 = this.D0();
        if (d0) {
            this.f1();
        }
        return d0;
    }
    
    public final void C1(final p0.n s) {
        p0.m.a(this.S, s);
        this.S = s;
    }
    
    public boolean D0() {
        if (this.Z == null) {
            return false;
        }
        final int f0 = this.F0;
        if (f0 != 3 && !this.j0 && (!this.k0 || this.I0) && (!this.l0 || !this.H0)) {
            if (f0 == 2) {
                final int a = g0.M.a;
                g0.a.f(a >= 23);
                if (a >= 23) {
                    try {
                        this.O1();
                    }
                    catch (u u) {
                        g0.o.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", u);
                        this.w1();
                        return true;
                    }
                }
            }
            this.B0();
            return false;
        }
        this.w1();
        return true;
    }
    
    public final void D1(final f r0) {
        this.R0 = r0;
        final long c = r0.c;
        if (c != -9223372036854775807L) {
            this.T0 = true;
            this.m1(c);
        }
    }
    
    public final List E0(final boolean b) {
        final q q = (q)a.e(this.Q);
        List list2;
        final List list = list2 = this.L0(this.G, q, b);
        if (list.isEmpty()) {
            list2 = list;
            if (b) {
                final List obj = list2 = this.L0(this.G, q, (boolean)(0 != 0));
                if (!obj.isEmpty()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Drm session requires secure decoder for ");
                    sb.append(q.n);
                    sb.append(", but no secure decoder available. Trying to proceed with ");
                    sb.append(obj);
                    sb.append(".");
                    g0.o.h("MediaCodecRenderer", sb.toString());
                    list2 = obj;
                }
            }
        }
        return list2;
    }
    
    public final void E1() {
        this.O0 = true;
    }
    
    public final m F0() {
        return this.Z;
    }
    
    public final void F1(final u p) {
        this.P0 = p;
    }
    
    public int G0(final i i) {
        return 0;
    }
    
    public final void G1(final p0.n t) {
        p0.m.a(this.T, t);
        this.T = t;
    }
    
    public final p H0() {
        return this.g0;
    }
    
    public final boolean H1(final long n) {
        return this.W == -9223372036854775807L || this.L().b() - n < this.W;
    }
    
    @Override
    public void I(final float x, final float y) {
        this.X = x;
        this.Y = y;
        this.N1(this.a0);
    }
    
    public boolean I0() {
        return false;
    }
    
    public boolean I1(final p p) {
        return true;
    }
    
    public abstract float J0(final float p0, final q p1, final q[] p2);
    
    public boolean J1() {
        return false;
    }
    
    public final MediaFormat K0() {
        return this.b0;
    }
    
    public boolean K1(final q q) {
        return false;
    }
    
    public abstract List L0(final z p0, final q p1, final boolean p2);
    
    public abstract int L1(final z p0, final q p1);
    
    public long M0(final boolean b, final long n, final long n2) {
        return super.q(n, n2);
    }
    
    public long N0() {
        return this.K0;
    }
    
    public final boolean N1(final q q) {
        if (g0.M.a < 23) {
            return true;
        }
        if (this.Z != null && this.F0 != 3) {
            if (this.getState() == 0) {
                return true;
            }
            final float j0 = this.J0(this.Y, (q)a.e(q), this.R());
            final float d0 = this.d0;
            if (d0 == j0) {
                return true;
            }
            if (j0 == -1.0f) {
                this.w0();
                return false;
            }
            if (d0 == -1.0f && j0 <= this.I) {
                return true;
            }
            final Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", j0);
            ((m)a.e(this.Z)).c(bundle);
            this.d0 = j0;
        }
        return true;
    }
    
    public abstract m.a O0(final p p0, final q p1, final MediaCrypto p2, final float p3);
    
    public final void O1() {
        final j0.b h = ((p0.n)a.e(this.T)).h();
        if (h instanceof G) {
            try {
                ((MediaCrypto)a.e(this.V)).setMediaDrmSession(((G)h).b);
            }
            catch (MediaCryptoException ex) {
                throw this.J((Throwable)ex, this.Q, 6006);
            }
        }
        this.C1(this.T);
        this.E0 = 0;
        this.F0 = 0;
    }
    
    public final long P0() {
        return this.R0.c;
    }
    
    public final void P1(final long n) {
        q r;
        final q q = r = (q)this.R0.d.i(n);
        if (q == null) {
            r = q;
            if (this.T0) {
                r = q;
                if (this.b0 != null) {
                    r = (q)this.R0.d.h();
                }
            }
        }
        if (r != null) {
            this.R = r;
        }
        else if (!this.c0 || this.R == null) {
            return;
        }
        this.l1((q)a.e(this.R), this.b0);
        this.c0 = false;
        this.T0 = false;
    }
    
    public final long Q0() {
        return this.R0.b;
    }
    
    public float R0() {
        return this.X;
    }
    
    public final Y0.a S0() {
        return this.U;
    }
    
    @Override
    public void T() {
        this.Q = null;
        this.D1(f.e);
        this.O.clear();
        this.D0();
    }
    
    public abstract void T0(final i p0);
    
    @Override
    public void U(final boolean b, final boolean b2) {
        this.Q0 = new o();
    }
    
    public final boolean U0() {
        return this.v0 >= 0;
    }
    
    public final boolean V0() {
        if (!this.M.U()) {
            return true;
        }
        final long p = this.P();
        return this.b1(p, this.M.S()) == this.b1(p, this.L.t);
    }
    
    @Override
    public void W(final long n, final boolean b) {
        this.L0 = false;
        this.M0 = false;
        this.O0 = false;
        if (this.z0) {
            this.M.m();
            this.L.m();
            this.A0 = false;
            this.P.d();
        }
        else {
            this.C0();
        }
        if (this.R0.d.k() > 0) {
            this.N0 = true;
        }
        this.R0.d.c();
        this.O.clear();
    }
    
    public final void W0(final q q) {
        this.u0();
        final String n = q.n;
        if (!"audio/mp4a-latm".equals(n) && !"audio/mpeg".equals(n) && !"audio/opus".equals(n)) {
            this.M.V(1);
        }
        else {
            this.M.V(32);
        }
        this.z0 = true;
    }
    
    public final void X0(p g0, MediaCrypto o0) {
        final boolean b = false;
        final q a0 = (q)a.e(this.Q);
        final String a2 = g0.a;
        final int a3 = g0.M.a;
        final float n = -1.0f;
        float j0;
        if (a3 < 23) {
            j0 = -1.0f;
        }
        else {
            j0 = this.J0(this.Y, a0, this.R());
        }
        if (j0 <= this.I) {
            j0 = n;
        }
        this.q1(a0);
        final long b2 = this.L().b();
        o0 = (MediaCrypto)this.O0(g0, a0, o0, j0);
        if (a3 >= 31) {
            c.a((m.a)o0, this.Q());
        }
        while (true) {
            while (true) {
                Label_0494: {
                    while (true) {
                        try {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("createCodec:");
                            sb.append(a2);
                            g0.F.a(sb.toString());
                            final m a4 = this.F.a((m.a)o0);
                            this.Z = a4;
                            if (a3 >= 21 && w.b.a(a4, new e(null))) {
                                final boolean s0 = true;
                                this.s0 = s0;
                                g0.F.b();
                                final long b3 = this.L().b();
                                if (!g0.m(a0)) {
                                    g0.o.h("MediaCodecRenderer", g0.M.G("Format exceeds selected codec's capabilities [%s, %s]", d0.q.g(a0), a2));
                                }
                                this.g0 = g0;
                                this.d0 = j0;
                                this.a0 = a0;
                                this.h0 = this.l0(a2);
                                this.i0 = m0(a2, (q)a.e(this.a0));
                                this.j0 = r0(a2);
                                this.k0 = s0(a2);
                                this.l0 = o0(a2);
                                this.m0 = p0(a2);
                                this.n0 = n0(a2);
                                this.o0 = false;
                                this.r0 = (q0(g0) || this.I0());
                                if (((m)a.e(this.Z)).e()) {
                                    this.C0 = true;
                                    this.D0 = 1;
                                    boolean p0 = b;
                                    if (this.h0 != 0) {
                                        p0 = true;
                                    }
                                    this.p0 = p0;
                                }
                                if (this.getState() == 2) {
                                    this.t0 = this.L().b() + 1000L;
                                }
                                final o q0 = this.Q0;
                                ++q0.a;
                                this.i1(a2, (m.a)o0, b3, b3 - b2);
                                return;
                            }
                            break Label_0494;
                            g0.F.b();
                            throw g0;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final boolean s0 = false;
                continue;
            }
        }
    }
    
    public final boolean Y0() {
        a.f(this.V == null);
        final p0.n s = this.S;
        final j0.b h = s.h();
        if (p0.G.d && h instanceof G) {
            final int state = s.getState();
            if (state == 1) {
                final p0.n.a a = (p0.n.a)g0.a.e(s.g());
                throw this.J(a, this.Q, a.o);
            }
            if (state != 4) {
                return false;
            }
        }
        if (h == null) {
            return s.g() != null;
        }
        if (h instanceof G) {
            final G g = (G)h;
            try {
                this.V = new MediaCrypto(g.a, g.b);
                return true;
            }
            catch (MediaCryptoException ex) {
                throw this.J((Throwable)ex, this.Q, 6006);
            }
        }
        return true;
    }
    
    @Override
    public void Z() {
        try {
            this.u0();
            this.w1();
        }
        finally {
            this.G1(null);
        }
    }
    
    public final boolean Z0() {
        return this.z0;
    }
    
    @Override
    public final int a(final q q) {
        try {
            return this.L1(this.G, q);
        }
        catch (I.c c) {
            throw this.J(c, q, 4002);
        }
    }
    
    @Override
    public void a0() {
    }
    
    public final boolean a1(final q q) {
        return this.T == null && this.K1(q);
    }
    
    @Override
    public void b0() {
    }
    
    public final boolean b1(final long n, final long n2) {
        if (n2 < n) {
            final q r = this.R;
            if (r == null || !Objects.equals(r.n, "audio/opus") || !F0.K.g(n, n2)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean c() {
        return this.M0;
    }
    
    @Override
    public void c0(final q[] array, final long n, final long n2, final x.b b) {
        if (this.R0.c == -9223372036854775807L) {
            this.D1(new f(-9223372036854775807L, n, n2));
            return;
        }
        Label_0116: {
            if (this.O.isEmpty()) {
                final long j0 = this.J0;
                if (j0 != -9223372036854775807L) {
                    final long s0 = this.S0;
                    if (s0 == -9223372036854775807L || s0 < j0) {
                        break Label_0116;
                    }
                }
                this.D1(new f(-9223372036854775807L, n, n2));
                if (this.R0.c != -9223372036854775807L) {
                    this.o1();
                }
                return;
            }
        }
        this.O.add(new f(this.J0, n, n2));
    }
    
    @Override
    public boolean e() {
        return this.Q != null && (this.S() || this.U0() || (this.t0 != -9223372036854775807L && this.L().b() < this.t0));
    }
    
    @Override
    public void f(final long n, final long n2) {
        final boolean o0 = this.O0;
        final boolean b = false;
        if (o0) {
            this.O0 = false;
            this.r1();
        }
        final u p2 = this.P0;
        while (true) {
            if (p2 == null) {
            Label_0247_Outer:
                while (true) {
                    try {
                        if (this.M0) {
                            this.x1();
                            return;
                        }
                        if (this.Q == null && !this.u1(2)) {
                            return;
                        }
                        this.f1();
                        Label_0189: {
                            if (this.z0) {
                                g0.F.a("bypassRender");
                                while (this.j0(n, n2)) {}
                            }
                            else {
                                if (this.Z == null) {
                                    final o q0 = this.Q0;
                                    q0.d += this.g0(n);
                                    this.u1(1);
                                    break Label_0189;
                                }
                                final long b2 = this.L().b();
                                g0.F.a("drainAndFeed");
                                while (this.y0(n, n2) && this.H1(b2)) {}
                                while (this.A0() && this.H1(b2)) {}
                            }
                            g0.F.b();
                        }
                        this.Q0.c();
                        return;
                        final IllegalStateException ex;
                        Label_0298: {
                            throw ex;
                        }
                        // iftrue(Label_0238:, M.a < 21)
                        // iftrue(Label_0238:, !e1(ex))
                        // iftrue(Label_0247:, !b3)
                        // iftrue(Label_0298:, !c1(ex))
                        // iftrue(Label_0278:, t0.q != 1101)
                        while (true) {
                        Block_17:
                            while (true) {
                            Block_16:
                                while (true) {
                                    while (true) {
                                        this.h1(ex);
                                        boolean b3 = b;
                                        Block_15: {
                                            break Block_15;
                                            final int n3 = 4006;
                                            final t0.o t0;
                                            throw this.K(t0, this.Q, b3, n3);
                                        }
                                        b3 = b;
                                        break Block_16;
                                        break Block_17;
                                        Label_0278:
                                        final int n3 = 4003;
                                        final t0.o t0;
                                        throw this.K(t0, this.Q, b3, n3);
                                        continue Label_0247_Outer;
                                    }
                                    final t0.o t0 = this.t0(ex, this.H0());
                                    continue Label_0247_Outer;
                                }
                                boolean b3 = true;
                                continue Label_0247_Outer;
                            }
                            this.w1();
                            continue;
                        }
                        this.P0 = null;
                        throw p2;
                    }
                    catch (IllegalStateException ex2) {}
                    final IllegalStateException ex2;
                    final IllegalStateException ex = ex2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void f1() {
        if (this.Z != null || this.z0) {
            return;
        }
        Object o = this.Q;
        if (o == null) {
            return;
        }
        if (this.a1((q)o)) {
            this.W0((q)o);
            return;
        }
        this.C1(this.T);
        Label_0102: {
            if (this.S != null) {
                if (!this.Y0()) {
                    break Label_0102;
                }
            }
            while (true) {
                while (true) {
                    Label_0143: {
                        while (true) {
                            try {
                                final p0.n s = this.S;
                                if (s != null && s.f((String)a.h(((q)o).n))) {
                                    final boolean b = true;
                                    this.g1(this.V, b);
                                    o = this.V;
                                    if (o != null && this.Z == null) {
                                        ((MediaCrypto)o).release();
                                        this.V = null;
                                    }
                                    return;
                                }
                                break Label_0143;
                                final d d;
                                throw this.J(d, (q)o, 4001);
                            }
                            catch (d d2) {}
                            final d d2;
                            final d d = d2;
                            continue;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
    }
    
    public final void g1(final MediaCrypto mediaCrypto, final boolean b) {
        final q q = (q)a.e(this.Q);
    Label_0095_Outer:
        while (true) {
            if (this.e0 == null) {
                while (true) {
                    try {
                        final List e0 = this.E0(b);
                        final ArrayDeque e2 = new ArrayDeque();
                        this.e0 = e2;
                        if (this.H) {
                            e2.addAll(e0);
                        }
                        else if (!e0.isEmpty()) {
                            this.e0.add(e0.get(0));
                        }
                        this.f0 = null;
                        if (!this.e0.isEmpty()) {
                            final ArrayDeque arrayDeque = (ArrayDeque)a.e(this.e0);
                            while (this.Z == null) {
                                final p obj = (p)a.e(arrayDeque.peekFirst());
                                if (!this.I1(obj)) {
                                    return;
                                }
                                try {
                                    this.X0(obj, mediaCrypto);
                                    continue Label_0095_Outer;
                                }
                                catch (Exception ex) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to initialize decoder: ");
                                    sb.append(obj);
                                    g0.o.i("MediaCodecRenderer", sb.toString(), ex);
                                    arrayDeque.removeFirst();
                                    final d f0 = new d(q, ex, b, obj);
                                    this.h1(f0);
                                    if (this.f0 == null) {
                                        this.f0 = f0;
                                    }
                                    else {
                                        this.f0 = this.f0.c(f0);
                                    }
                                    if (!arrayDeque.isEmpty()) {
                                        continue Label_0095_Outer;
                                    }
                                    throw this.f0;
                                }
                                break;
                            }
                            this.e0 = null;
                            return;
                        }
                        throw new d(q, null, b, -49999);
                        final I.c c;
                        throw new d(q, c, b, -49998);
                    }
                    catch (I.c c2) {}
                    final I.c c2;
                    final I.c c = c2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public abstract void h1(final Exception p0);
    
    public final void i0() {
        a.f(this.L0 ^ true);
        final v0 n = this.N();
        this.L.m();
        do {
            this.L.m();
            final int e0 = this.e0(n, this.L, 0);
            if (e0 == -5) {
                this.k1(n);
                return;
            }
            if (e0 != -4) {
                if (e0 == -3) {
                    if (this.p()) {
                        this.K0 = this.J0;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
            else {
                if (this.L.p()) {
                    this.L0 = true;
                    this.K0 = this.J0;
                    return;
                }
                this.J0 = Math.max(this.J0, this.L.t);
                if (this.p() || this.K.u()) {
                    this.K0 = this.J0;
                }
                if (this.N0) {
                    final q r = (q)a.e(this.Q);
                    this.R = r;
                    if (Objects.equals(r.n, "audio/opus") && !this.R.q.isEmpty()) {
                        this.R = ((q)a.e(this.R)).a().V(F0.K.f(this.R.q.get(0))).K();
                    }
                    this.l1(this.R, null);
                    this.N0 = false;
                }
                this.L.C();
                final q r2 = this.R;
                if (r2 == null || !Objects.equals(r2.n, "audio/opus")) {
                    continue;
                }
                if (this.L.o()) {
                    final i l = this.L;
                    l.p = this.R;
                    this.T0(l);
                }
                if (!F0.K.g(this.P(), this.L.t)) {
                    continue;
                }
                this.P.a(this.L, ((q)a.e(this.R)).q);
            }
        } while (this.V0() && this.M.H(this.L));
        this.A0 = true;
    }
    
    public abstract void i1(final String p0, final m.a p1, final long p2, final long p3);
    
    public final boolean j0(final long n, final long n2) {
        a.f(this.M0 ^ true);
        if (this.M.U()) {
            final j m = this.M;
            if (!this.s1(n, n2, null, m.r, this.v0, 0, m.T(), this.M.M(), this.b1(this.P(), this.M.S()), this.M.p(), (q)a.e(this.R))) {
                return false;
            }
            this.n1(this.M.S());
            this.M.m();
        }
        if (this.L0) {
            this.M0 = true;
            return false;
        }
        if (this.A0) {
            a.f(this.M.H(this.L));
            this.A0 = false;
        }
        if (this.B0) {
            if (this.M.U()) {
                return true;
            }
            this.u0();
            this.B0 = false;
            this.f1();
            if (!this.z0) {
                return false;
            }
        }
        this.i0();
        if (this.M.U()) {
            this.M.C();
        }
        return this.M.U() || this.L0 || this.B0;
    }
    
    public abstract void j1(final String p0);
    
    public abstract k0.p k0(final p p0, final q p1, final q p2);
    
    public k0.p k1(final v0 v0) {
        final boolean b = true;
        this.N0 = true;
        final q q = (q)a.e(v0.b);
        final String n = q.n;
        if (n == null) {
            throw this.J(new IllegalArgumentException("Sample MIME type is null."), q, 4005);
        }
        q k = q;
        if (Objects.equals(n, "video/av01")) {
            k = q;
            if (!q.q.isEmpty()) {
                k = q.a().b0(null).K();
            }
        }
        this.G1(v0.a);
        this.Q = k;
        if (this.z0) {
            this.B0 = true;
            return null;
        }
        final m z = this.Z;
        if (z == null) {
            this.e0 = null;
            this.f1();
            return null;
        }
        final p p = (p)a.e(this.g0);
        final q q2 = (q)a.e(this.a0);
        if (this.z0(p, k, this.S, this.T)) {
            this.w0();
            return new k0.p(p.a, q2, k, 0, 128);
        }
        final boolean b2 = this.T != this.S;
        a.f(!b2 || g0.M.a >= 23);
        final k0.p k2 = this.k0(p, q2, k);
        final int d = k2.d;
        int n3 = 0;
        Label_0485: {
            Label_0483: {
                if (d != 0) {
                    final int n2 = 16;
                    if (d != 1) {
                        if (d != 2) {
                            if (d != 3) {
                                throw new IllegalStateException();
                            }
                            if (!this.N1(k)) {
                                n3 = n2;
                                break Label_0485;
                            }
                            this.a0 = k;
                            if (!b2 || this.x0()) {
                                break Label_0483;
                            }
                        }
                        else {
                            if (!this.N1(k)) {
                                n3 = n2;
                                break Label_0485;
                            }
                            this.C0 = true;
                            this.D0 = 1;
                            final int h0 = this.h0;
                            boolean p2 = b;
                            if (h0 != 2) {
                                p2 = (h0 == 1 && k.t == q2.t && k.u == q2.u && b);
                            }
                            this.p0 = p2;
                            this.a0 = k;
                            if (!b2 || this.x0()) {
                                break Label_0483;
                            }
                        }
                    }
                    else {
                        if (!this.N1(k)) {
                            n3 = n2;
                            break Label_0485;
                        }
                        this.a0 = k;
                        if (b2 ? this.x0() : this.v0()) {
                            break Label_0483;
                        }
                    }
                    n3 = 2;
                    break Label_0485;
                }
                this.w0();
            }
            n3 = 0;
        }
        if (k2.d != 0 && (this.Z != z || this.F0 == 3)) {
            return new k0.p(p.a, q2, k, 0, n3);
        }
        return k2;
    }
    
    public final int l0(String b) {
        final int a = g0.M.a;
        if (a <= 25 && "OMX.Exynos.avc.dec.secure".equals(b)) {
            final String d = g0.M.d;
            if (d.startsWith("SM-T585") || d.startsWith("SM-A510") || d.startsWith("SM-A520") || d.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (a < 24 && ("OMX.Nvidia.h264.decode".equals(b) || "OMX.Nvidia.h264.decode.secure".equals(b))) {
            b = g0.M.b;
            if ("flounder".equals(b) || "flounder_lte".equals(b) || "grouper".equals(b) || "tilapia".equals(b)) {
                return 1;
            }
        }
        return 0;
    }
    
    public abstract void l1(final q p0, final MediaFormat p1);
    
    public void m1(final long n) {
    }
    
    public void n1(final long s0) {
        this.S0 = s0;
        while (!this.O.isEmpty() && s0 >= this.O.peek().a) {
            this.D1((f)a.e(this.O.poll()));
            this.o1();
        }
    }
    
    public void o1() {
    }
    
    public void p1(final i i) {
    }
    
    @Override
    public final long q(final long n, final long n2) {
        return this.M0(this.s0, n, n2);
    }
    
    public void q1(final q q) {
    }
    
    public final void r1() {
        final int f0 = this.F0;
        if (f0 == 1) {
            this.B0();
            return;
        }
        if (f0 == 2) {
            this.B0();
            this.O1();
            return;
        }
        if (f0 != 3) {
            this.M0 = true;
            this.x1();
            return;
        }
        this.v1();
    }
    
    @Override
    public final int s() {
        return 8;
    }
    
    public abstract boolean s1(final long p0, final long p1, final m p2, final ByteBuffer p3, final int p4, final int p5, final int p6, final long p7, final boolean p8, final boolean p9, final q p10);
    
    @Override
    public void t(final int n, final Object o) {
        if (n == 11) {
            this.U = (Y0.a)o;
            return;
        }
        super.t(n, o);
    }
    
    public t0.o t0(final Throwable t, final p p2) {
        return new t0.o(t, p2);
    }
    
    public final void t1() {
        this.I0 = true;
        final MediaFormat h = ((m)a.e(this.Z)).h();
        if (this.h0 != 0 && h.getInteger("width") == 32 && h.getInteger("height") == 32) {
            this.q0 = true;
            return;
        }
        if (this.o0) {
            h.setInteger("channel-count", 1);
        }
        this.b0 = h;
        this.c0 = true;
    }
    
    public final void u0() {
        this.B0 = false;
        this.M.m();
        this.L.m();
        this.A0 = false;
        this.z0 = false;
        this.P.d();
    }
    
    public final boolean u1(int e0) {
        final v0 n = this.N();
        this.J.m();
        e0 = this.e0(n, this.J, e0 | 0x4);
        if (e0 == -5) {
            this.k1(n);
            return true;
        }
        if (e0 == -4 && this.J.p()) {
            this.L0 = true;
            this.r1();
        }
        return false;
    }
    
    public final boolean v0() {
        if (!this.G0) {
            return true;
        }
        this.E0 = 1;
        if (!this.j0 && !this.l0) {
            this.F0 = 1;
            return true;
        }
        this.F0 = 3;
        return false;
    }
    
    public final void v1() {
        this.w1();
        this.f1();
    }
    
    public final void w0() {
        if (this.G0) {
            this.E0 = 1;
            this.F0 = 3;
            return;
        }
        this.v1();
    }
    
    public void w1() {
        Label_0054: {
            try {
                final m z = this.Z;
                if (z != null) {
                    z.release();
                    final o q0 = this.Q0;
                    ++q0.b;
                    this.j1(((p)a.e(this.g0)).a);
                }
                break Label_0054;
            }
            finally {
                this.Z = null;
                Label_0151: {
                    try {
                        final MediaCrypto v = this.V;
                        if (v != null) {
                            v.release();
                        }
                    }
                    finally {
                        break Label_0151;
                    }
                    this.V = null;
                    this.C1(null);
                    this.z1();
                    throw;
                }
                this.V = null;
                this.C1(null);
                this.z1();
                this.Z = null;
                Label_0094: {
                    try {
                        final MediaCrypto v2 = this.V;
                        if (v2 != null) {
                            v2.release();
                        }
                    }
                    finally {
                        break Label_0094;
                    }
                    this.V = null;
                    this.C1(null);
                    this.z1();
                    return;
                }
                this.V = null;
                this.C1(null);
                this.z1();
            }
        }
    }
    
    public final boolean x0() {
        if (!this.G0) {
            this.O1();
            return true;
        }
        this.E0 = 1;
        if (!this.j0 && !this.l0) {
            this.F0 = 2;
            return true;
        }
        this.F0 = 3;
        return false;
    }
    
    public void x1() {
    }
    
    public final boolean y0(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        t0/w.Z:Lt0/m;
        //     4: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //     7: checkcast       Lt0/m;
        //    10: astore          11
        //    12: aload_0        
        //    13: invokevirtual   t0/w.U0:()Z
        //    16: ifne            386
        //    19: aload_0        
        //    20: getfield        t0/w.m0:Z
        //    23: ifeq            66
        //    26: aload_0        
        //    27: getfield        t0/w.H0:Z
        //    30: ifeq            66
        //    33: aload           11
        //    35: aload_0        
        //    36: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //    39: invokeinterface t0/m.d:(Landroid/media/MediaCodec$BufferInfo;)I
        //    44: istore          5
        //    46: goto            79
        //    49: aload_0        
        //    50: invokevirtual   t0/w.r1:()V
        //    53: aload_0        
        //    54: getfield        t0/w.M0:Z
        //    57: ifeq            64
        //    60: aload_0        
        //    61: invokevirtual   t0/w.w1:()V
        //    64: iconst_0       
        //    65: ireturn        
        //    66: aload           11
        //    68: aload_0        
        //    69: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //    72: invokeinterface t0/m.d:(Landroid/media/MediaCodec$BufferInfo;)I
        //    77: istore          5
        //    79: iload           5
        //    81: ifge            125
        //    84: iload           5
        //    86: bipush          -2
        //    88: if_icmpne       97
        //    91: aload_0        
        //    92: invokevirtual   t0/w.t1:()V
        //    95: iconst_1       
        //    96: ireturn        
        //    97: aload_0        
        //    98: getfield        t0/w.r0:Z
        //   101: ifeq            123
        //   104: aload_0        
        //   105: getfield        t0/w.L0:Z
        //   108: ifne            119
        //   111: aload_0        
        //   112: getfield        t0/w.E0:I
        //   115: iconst_2       
        //   116: if_icmpne       123
        //   119: aload_0        
        //   120: invokevirtual   t0/w.r1:()V
        //   123: iconst_0       
        //   124: ireturn        
        //   125: aload_0        
        //   126: getfield        t0/w.q0:Z
        //   129: ifeq            149
        //   132: aload_0        
        //   133: iconst_0       
        //   134: putfield        t0/w.q0:Z
        //   137: aload           11
        //   139: iload           5
        //   141: iconst_0       
        //   142: invokeinterface t0/m.f:(IZ)V
        //   147: iconst_1       
        //   148: ireturn        
        //   149: aload_0        
        //   150: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   153: astore          12
        //   155: aload           12
        //   157: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   160: ifne            179
        //   163: aload           12
        //   165: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   168: iconst_4       
        //   169: iand           
        //   170: ifeq            179
        //   173: aload_0        
        //   174: invokevirtual   t0/w.r1:()V
        //   177: iconst_0       
        //   178: ireturn        
        //   179: aload_0        
        //   180: iload           5
        //   182: putfield        t0/w.v0:I
        //   185: aload           11
        //   187: iload           5
        //   189: invokeinterface t0/m.k:(I)Ljava/nio/ByteBuffer;
        //   194: astore          12
        //   196: aload_0        
        //   197: aload           12
        //   199: putfield        t0/w.w0:Ljava/nio/ByteBuffer;
        //   202: aload           12
        //   204: ifnull          249
        //   207: aload           12
        //   209: aload_0        
        //   210: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   213: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   216: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   219: pop            
        //   220: aload_0        
        //   221: getfield        t0/w.w0:Ljava/nio/ByteBuffer;
        //   224: astore          12
        //   226: aload_0        
        //   227: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   230: astore          13
        //   232: aload           12
        //   234: aload           13
        //   236: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   239: aload           13
        //   241: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   244: iadd           
        //   245: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //   248: pop            
        //   249: aload_0        
        //   250: getfield        t0/w.n0:Z
        //   253: ifeq            302
        //   256: aload_0        
        //   257: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   260: astore          12
        //   262: aload           12
        //   264: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   267: lconst_0       
        //   268: lcmp           
        //   269: ifne            302
        //   272: aload           12
        //   274: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   277: iconst_4       
        //   278: iand           
        //   279: ifeq            302
        //   282: aload_0        
        //   283: getfield        t0/w.J0:J
        //   286: ldc2_w          -9223372036854775807
        //   289: lcmp           
        //   290: ifeq            302
        //   293: aload           12
        //   295: aload_0        
        //   296: getfield        t0/w.K0:J
        //   299: putfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   302: aload_0        
        //   303: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   306: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   309: aload_0        
        //   310: invokevirtual   k0/n.P:()J
        //   313: lcmp           
        //   314: ifge            323
        //   317: iconst_1       
        //   318: istore          9
        //   320: goto            326
        //   323: iconst_0       
        //   324: istore          9
        //   326: aload_0        
        //   327: iload           9
        //   329: putfield        t0/w.x0:Z
        //   332: aload_0        
        //   333: getfield        t0/w.K0:J
        //   336: lstore          7
        //   338: lload           7
        //   340: ldc2_w          -9223372036854775807
        //   343: lcmp           
        //   344: ifeq            366
        //   347: lload           7
        //   349: aload_0        
        //   350: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   353: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   356: lcmp           
        //   357: ifgt            366
        //   360: iconst_1       
        //   361: istore          9
        //   363: goto            369
        //   366: iconst_0       
        //   367: istore          9
        //   369: aload_0        
        //   370: iload           9
        //   372: putfield        t0/w.y0:Z
        //   375: aload_0        
        //   376: aload_0        
        //   377: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   380: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   383: invokevirtual   t0/w.P1:(J)V
        //   386: aload_0        
        //   387: getfield        t0/w.m0:Z
        //   390: ifeq            501
        //   393: aload_0        
        //   394: getfield        t0/w.H0:Z
        //   397: ifeq            501
        //   400: aload_0        
        //   401: getfield        t0/w.w0:Ljava/nio/ByteBuffer;
        //   404: astore          12
        //   406: aload_0        
        //   407: getfield        t0/w.v0:I
        //   410: istore          5
        //   412: aload_0        
        //   413: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   416: astore          13
        //   418: aload           13
        //   420: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   423: istore          6
        //   425: aload           13
        //   427: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   430: lstore          7
        //   432: aload_0        
        //   433: getfield        t0/w.x0:Z
        //   436: istore          9
        //   438: aload_0        
        //   439: getfield        t0/w.y0:Z
        //   442: istore          10
        //   444: aload_0        
        //   445: getfield        t0/w.R:Ld0/q;
        //   448: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   451: checkcast       Ld0/q;
        //   454: astore          13
        //   456: aload_0        
        //   457: lload_1        
        //   458: lload_3        
        //   459: aload           11
        //   461: aload           12
        //   463: iload           5
        //   465: iload           6
        //   467: iconst_1       
        //   468: lload           7
        //   470: iload           9
        //   472: iload           10
        //   474: aload           13
        //   476: invokevirtual   t0/w.s1:(JJLt0/m;Ljava/nio/ByteBuffer;IIIJZZLd0/q;)Z
        //   479: istore          9
        //   481: goto            562
        //   484: aload_0        
        //   485: invokevirtual   t0/w.r1:()V
        //   488: aload_0        
        //   489: getfield        t0/w.M0:Z
        //   492: ifeq            499
        //   495: aload_0        
        //   496: invokevirtual   t0/w.w1:()V
        //   499: iconst_0       
        //   500: ireturn        
        //   501: aload_0        
        //   502: getfield        t0/w.w0:Ljava/nio/ByteBuffer;
        //   505: astore          12
        //   507: aload_0        
        //   508: getfield        t0/w.v0:I
        //   511: istore          5
        //   513: aload_0        
        //   514: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   517: astore          13
        //   519: aload_0        
        //   520: lload_1        
        //   521: lload_3        
        //   522: aload           11
        //   524: aload           12
        //   526: iload           5
        //   528: aload           13
        //   530: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   533: iconst_1       
        //   534: aload           13
        //   536: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   539: aload_0        
        //   540: getfield        t0/w.x0:Z
        //   543: aload_0        
        //   544: getfield        t0/w.y0:Z
        //   547: aload_0        
        //   548: getfield        t0/w.R:Ld0/q;
        //   551: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   554: checkcast       Ld0/q;
        //   557: invokevirtual   t0/w.s1:(JJLt0/m;Ljava/nio/ByteBuffer;IIIJZZLd0/q;)Z
        //   560: istore          9
        //   562: iload           9
        //   564: ifeq            614
        //   567: aload_0        
        //   568: aload_0        
        //   569: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   572: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   575: invokevirtual   t0/w.n1:(J)V
        //   578: aload_0        
        //   579: getfield        t0/w.N:Landroid/media/MediaCodec$BufferInfo;
        //   582: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   585: iconst_4       
        //   586: iand           
        //   587: ifeq            596
        //   590: iconst_1       
        //   591: istore          5
        //   593: goto            599
        //   596: iconst_0       
        //   597: istore          5
        //   599: aload_0        
        //   600: invokevirtual   t0/w.B1:()V
        //   603: iload           5
        //   605: ifne            610
        //   608: iconst_1       
        //   609: ireturn        
        //   610: aload_0        
        //   611: invokevirtual   t0/w.r1:()V
        //   614: iconst_0       
        //   615: ireturn        
        //   616: astore          11
        //   618: goto            49
        //   621: astore          11
        //   623: goto            484
        //   626: astore          11
        //   628: goto            484
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  33     46     616    66     Ljava/lang/IllegalStateException;
        //  400    456    621    626    Ljava/lang/IllegalStateException;
        //  456    481    626    631    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 302 out of bounds for length 302
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
    
    public void y1() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final boolean z0(final p p4, final q q, final p0.n n, final p0.n n2) {
        final boolean b = false;
        if (n == n2) {
            return false;
        }
        if (n2 != null) {
            if (n == null) {
                return true;
            }
            final j0.b h = n2.h();
            if (h == null) {
                return true;
            }
            final j0.b h2 = n.h();
            if (h2 != null) {
                if (!h.getClass().equals(h2.getClass())) {
                    return true;
                }
                if (!(h instanceof G)) {
                    return false;
                }
                if (!n2.d().equals(n.d())) {
                    return true;
                }
                if (g0.M.a < 23) {
                    return true;
                }
                final UUID e = d0.g.e;
                if (!e.equals(n.d())) {
                    if (e.equals(n2.d())) {
                        return true;
                    }
                    boolean b2 = b;
                    if (!p4.g) {
                        b2 = b;
                        if (n2.f((String)a.e(q.n))) {
                            b2 = true;
                        }
                    }
                    return b2;
                }
            }
        }
        return true;
    }
    
    public void z1() {
        this.y1();
        this.P0 = null;
        this.e0 = null;
        this.g0 = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = false;
        this.I0 = false;
        this.d0 = -1.0f;
        this.h0 = 0;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = false;
        this.s0 = false;
        this.C0 = false;
        this.D0 = 0;
    }
    
    public abstract static final class b
    {
        public static boolean a(final m m, final e e) {
            return m.l((m.c)e);
        }
    }
    
    public abstract static final class c
    {
        public static void a(final m.a a, final y1 y1) {
            final LogSessionId a2 = y1.a();
            if (!O.a(a2, (Object)g0.a())) {
                a.b.setString("log-session-id", t0.x.a(a2));
            }
        }
    }
    
    public static class d extends Exception
    {
        public final String o;
        public final boolean p;
        public final p q;
        public final String r;
        public final d s;
        
        public d(final q obj, final Throwable t, final boolean b, final int i) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(obj);
            this(sb.toString(), t, obj.n, b, null, b(i), null);
        }
        
        public d(final q obj, final Throwable t, final boolean b, final p p4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: ");
            sb.append(p4.a);
            sb.append(", ");
            sb.append(obj);
            final String string = sb.toString();
            final String n = obj.n;
            String d;
            if (M.a >= 21) {
                d = d(t);
            }
            else {
                d = null;
            }
            this(string, t, n, b, p4, d, null);
        }
        
        public d(final String message, final Throwable cause, final String o, final boolean p7, final p q, final String r, final d s) {
            super(message, cause);
            this.o = o;
            this.p = p7;
            this.q = q;
            this.r = r;
            this.s = s;
        }
        
        public static String b(final int a) {
            String str;
            if (a < 0) {
                str = "neg_";
            }
            else {
                str = "";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("androidx.media3.exoplayer.mediacodec");
            sb.append(".MediaCodecRenderer_");
            sb.append(str);
            sb.append(Math.abs(a));
            return sb.toString();
        }
        
        public static String d(final Throwable t) {
            if (t instanceof MediaCodec$CodecException) {
                return ((MediaCodec$CodecException)t).getDiagnosticInfo();
            }
            return null;
        }
        
        public final d c(final d d) {
            return new d(this.getMessage(), this.getCause(), this.o, this.p, this.q, this.r, d);
        }
    }
    
    public final class e implements m.c
    {
        @Override
        public void a() {
            if (w.h0(w.this) != null) {
                w.h0(w.this).b();
            }
        }
        
        @Override
        public void b() {
            if (w.h0(w.this) != null) {
                w.h0(w.this).b();
            }
        }
    }
    
    public static final class f
    {
        public static final f e;
        public final long a;
        public final long b;
        public final long c;
        public final D d;
        
        static {
            e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        }
        
        public f(final long a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = new D();
        }
    }
}
