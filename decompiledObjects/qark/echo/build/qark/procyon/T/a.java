// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T;

import java.io.Serializable;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataInput;
import java.nio.ByteBuffer;
import java.io.EOFException;
import java.util.zip.CRC32;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.Map;
import java.io.IOException;
import android.system.OsConstants;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.TimeZone;
import java.util.Locale;
import java.util.Collection;
import java.util.Arrays;
import android.util.Log;
import java.nio.ByteOrder;
import java.util.Set;
import android.content.res.AssetManager$AssetInputStream;
import java.io.FileDescriptor;
import java.util.List;
import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.HashMap;
import java.text.SimpleDateFormat;

public class a
{
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final byte[] S;
    public static SimpleDateFormat T;
    public static SimpleDateFormat U;
    public static final String[] V;
    public static final int[] W;
    public static final byte[] X;
    public static final d[] Y;
    public static final d[] Z;
    public static final d[] a0;
    public static final d[] b0;
    public static final d[] c0;
    public static final d d0;
    public static final d[] e0;
    public static final d[] f0;
    public static final d[] g0;
    public static final d[] h0;
    public static final d[][] i0;
    public static final d[] j0;
    public static final HashMap[] k0;
    public static final HashMap[] l0;
    public static final HashSet m0;
    public static final HashMap n0;
    public static final Charset o0;
    public static final byte[] p0;
    public static final byte[] q0;
    public static final Pattern r0;
    public static final Pattern s0;
    public static final Pattern t0;
    public static final boolean u;
    public static final Pattern u0;
    public static final List v;
    public static final List w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    public String a;
    public FileDescriptor b;
    public AssetManager$AssetInputStream c;
    public int d;
    public boolean e;
    public final HashMap[] f;
    public Set g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    
    static {
        final Integer value = 3;
        u = Log.isLoggable("ExifInterface", 3);
        final Integer value2 = 1;
        final Integer value3 = 8;
        v = Arrays.asList(value2, 6, value, value3);
        final Integer value4 = 2;
        final Integer value5 = 7;
        final Integer value6 = 5;
        w = Arrays.asList(value4, value5, 4, value6);
        x = new int[] { 8, 8, 8 };
        y = new int[] { 4 };
        z = new int[] { 8 };
        A = new byte[] { -1, -40, -1 };
        B = new byte[] { 102, 116, 121, 112 };
        C = new byte[] { 109, 105, 102, 49 };
        D = new byte[] { 104, 101, 105, 99 };
        E = new byte[] { 79, 76, 89, 77, 80, 0 };
        F = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        G = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        H = new byte[] { 101, 88, 73, 102 };
        I = new byte[] { 73, 72, 68, 82 };
        J = new byte[] { 73, 69, 78, 68 };
        K = new byte[] { 82, 73, 70, 70 };
        L = new byte[] { 87, 69, 66, 80 };
        M = new byte[] { 69, 88, 73, 70 };
        N = new byte[] { -99, 1, 42 };
        O = "VP8X".getBytes(Charset.defaultCharset());
        P = "VP8L".getBytes(Charset.defaultCharset());
        Q = "VP8 ".getBytes(Charset.defaultCharset());
        R = "ANIM".getBytes(Charset.defaultCharset());
        S = "ANMF".getBytes(Charset.defaultCharset());
        V = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
        W = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        X = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final d[] array = Y = new d[] { new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1) };
        final d[] array2 = Z = new d[] { new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4) };
        final d[] array3 = a0 = new d[] { new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5) };
        final d[] array4 = b0 = new d[] { new d("InteroperabilityIndex", 1, 2) };
        final d[] array5 = c0 = new d[] { new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4) };
        d0 = new d("StripOffsets", 273, 3);
        final d[][] array6 = i0 = new d[][] { array, array2, array3, array4, array5, array, e0 = new d[] { new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4) }, f0 = new d[] { new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4) }, g0 = new d[] { new d("AspectFrame", 4371, 3) }, h0 = new d[] { new d("ColorSpace", 55, 3) } };
        j0 = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
        k0 = new HashMap[array6.length];
        l0 = new HashMap[array6.length];
        m0 = new HashSet((Collection<? extends E>)Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        n0 = new HashMap();
        final Charset charset = o0 = Charset.forName("US-ASCII");
        p0 = "Exif\u0000\u0000".getBytes(charset);
        q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset);
        final Locale us = Locale.US;
        (a.T = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", us)).setTimeZone(TimeZone.getTimeZone("UTC"));
        (a.U = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", us)).setTimeZone(TimeZone.getTimeZone("UTC"));
        int n = 0;
        while (true) {
            final d[][] i = a.i0;
            if (n >= i.length) {
                break;
            }
            a.k0[n] = new HashMap();
            a.l0[n] = new HashMap();
            final d[] array7 = i[n];
            for (int length = array7.length, n2 = 0; n2 < length; ++n2) {
                final d d = array7[n2];
                a.k0[n].put(d.a, d);
                a.l0[n].put(d.b, d);
            }
            ++n;
        }
        final HashMap n3 = a.n0;
        final d[] j = a.j0;
        n3.put(j[0].a, value6);
        n3.put(j[1].a, value2);
        n3.put(j[2].a, value4);
        n3.put(j[3].a, value);
        n3.put(j[4].a, value5);
        n3.put(j[5].a, value3);
        r0 = Pattern.compile(".*[1-9].*");
        s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }
    
    public a(final InputStream inputStream) {
        this(inputStream, 0);
    }
    
    public a(InputStream in, final int n) {
        final d[][] i0 = T.a.i0;
        this.f = new HashMap[i0.length];
        this.g = new HashSet(i0.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (in != null) {
            this.a = null;
            Label_0168: {
                if (n == 1) {
                    in = new BufferedInputStream(in, T.a.p0.length);
                    if (!r((BufferedInputStream)in)) {
                        Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                        return;
                    }
                    this.e = true;
                    this.c = null;
                    this.b = null;
                }
                else {
                    if (in instanceof AssetManager$AssetInputStream) {
                        this.c = (AssetManager$AssetInputStream)in;
                    }
                    else {
                        if (in instanceof FileInputStream) {
                            final FileInputStream fileInputStream = (FileInputStream)in;
                            if (y(fileInputStream.getFD())) {
                                this.c = null;
                                this.b = fileInputStream.getFD();
                                break Label_0168;
                            }
                        }
                        this.c = null;
                    }
                    this.b = null;
                }
            }
            this.C(in);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
    
    public static boolean L(final int n) {
        return n != 4 && n != 9 && n != 13 && n != 14;
    }
    
    public static boolean r(final BufferedInputStream bufferedInputStream) {
        final byte[] p = a.p0;
        bufferedInputStream.mark(p.length);
        final byte[] b = new byte[p.length];
        bufferedInputStream.read(b);
        bufferedInputStream.reset();
        int n = 0;
        while (true) {
            final byte[] p2 = a.p0;
            if (n >= p2.length) {
                return true;
            }
            if (b[n] != p2[n]) {
                return false;
            }
            ++n;
        }
    }
    
    public static boolean t(final byte[] array) {
        int n = 0;
        while (true) {
            final byte[] a = T.a.A;
            if (n >= a.length) {
                return true;
            }
            if (array[n] != a[n]) {
                return false;
            }
            ++n;
        }
    }
    
    public static boolean y(final FileDescriptor fileDescriptor) {
        while (true) {
            try {
                T.b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
                while (true) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    Label_0026: {
                        return false;
                    }
                    continue;
                }
            }
            // iftrue(Label_0026:, !a.u)
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean A(final HashMap hashMap) {
        final c c = hashMap.get("ImageLength");
        final c c2 = hashMap.get("ImageWidth");
        if (c != null && c2 != null) {
            final int i = c.i(this.h);
            final int j = c2.i(this.h);
            if (i <= 512 && j <= 512) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean B(final byte[] array) {
        int n = 0;
        while (true) {
            final byte[] k = T.a.K;
            if (n < k.length) {
                if (array[n] != k[n]) {
                    return false;
                }
                ++n;
            }
            else {
                int n2 = 0;
                while (true) {
                    final byte[] l = T.a.L;
                    if (n2 >= l.length) {
                        return true;
                    }
                    if (array[T.a.K.length + n2 + 4] != l[n2]) {
                        return false;
                    }
                    ++n2;
                }
            }
        }
    }
    
    public final void C(final InputStream in) {
        Label_0301: {
            if (in == null) {
                break Label_0301;
            }
            int i = 0;
            while (true) {
                try {
                    InputStream inputStream;
                    f f;
                    int d;
                    b b;
                    int d2;
                    final UnsupportedOperationException ex;
                    boolean u;
                    Block_16_Outer:Block_15_Outer:Label_0285_Outer:
                    while (true) {
                        while (true) {
                            try {
                                while (i < T.a.i0.length) {
                                    this.f[i] = new HashMap();
                                    ++i;
                                }
                                inputStream = in;
                                if (!this.e) {
                                    inputStream = new BufferedInputStream(in, 5000);
                                    this.d = this.g((BufferedInputStream)inputStream);
                                }
                                if (L(this.d)) {
                                    f = new f(inputStream);
                                    if (this.e) {
                                        this.n(f);
                                    }
                                    else {
                                        d = this.d;
                                        if (d == 12) {
                                            this.e(f);
                                        }
                                        else if (d == 7) {
                                            this.h(f);
                                        }
                                        else if (d == 10) {
                                            this.m(f);
                                        }
                                        else {
                                            this.k(f);
                                        }
                                    }
                                    f.h(this.p);
                                    this.K((b)f);
                                }
                                else {
                                    b = new b(inputStream);
                                    d2 = this.d;
                                    if (d2 == 4) {
                                        this.f(b, 0, 0);
                                    }
                                    else if (d2 == 13) {
                                        this.i(b);
                                    }
                                    else if (d2 == 9) {
                                        this.j(b);
                                    }
                                    else if (d2 == 14) {
                                        this.o(b);
                                    }
                                }
                                this.a();
                                if (!T.a.u) {
                                    return;
                                }
                                // iftrue(Label_0284:, !u)
                            Block_17_Outer:
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                this.E();
                                                return;
                                                Label_0284: {
                                                    return;
                                                }
                                                continue Block_16_Outer;
                                            }
                                            throw new NullPointerException("inputstream shouldn't be null");
                                            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", (Throwable)ex);
                                            Label_0299: {
                                                break Label_0299;
                                                this.E();
                                            }
                                            this.a();
                                            continue Block_15_Outer;
                                        }
                                        this.a();
                                        continue Label_0285_Outer;
                                    }
                                    u = T.a.u;
                                    continue Block_17_Outer;
                                }
                            }
                            // iftrue(Label_0299:, !a.u)
                            // iftrue(Label_0299:, !u)
                            finally {}
                            continue;
                        }
                    }
                }
                catch (UnsupportedOperationException ex) {
                    continue;
                }
                catch (IOException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void D(final b b) {
        b.c(this.h = this.F(b));
        final int unsignedShort = b.readUnsignedShort();
        final int d = this.d;
        if (d != 7 && d != 10 && unsignedShort != 42) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid start code: ");
            sb.append(Integer.toHexString(unsignedShort));
            throw new IOException(sb.toString());
        }
        final int int1 = b.readInt();
        if (int1 >= 8) {
            final int n = int1 - 8;
            if (n > 0) {
                b.e(n);
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid first Ifd offset: ");
        sb2.append(int1);
        throw new IOException(sb2.toString());
    }
    
    public final void E() {
        for (int i = 0; i < this.f.length; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f[i].size());
            Log.d("ExifInterface", sb.toString());
            for (final Map.Entry<K, c> entry : this.f[i].entrySet()) {
                final c c = entry.getValue();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String)entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(c.toString());
                sb2.append(", tagValue: '");
                sb2.append(c.j(this.h));
                sb2.append("'");
                Log.d("ExifInterface", sb2.toString());
            }
        }
    }
    
    public final ByteOrder F(final b b) {
        final short short1 = b.readShort();
        if (short1 == 18761) {
            if (T.a.u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            if (T.a.u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(short1));
        throw new IOException(sb.toString());
    }
    
    public final void G(final byte[] array, final int n) {
        final f f = new f(array);
        this.D((b)f);
        this.H(f, n);
    }
    
    public final void H(final f f, int int1) {
        this.g.add(((b)f).q);
        final short short1 = ((b)f).readShort();
        if (T.a.u) {
            final StringBuilder sb = new StringBuilder();
            sb.append("numberOfDirectoryEntry: ");
            sb.append(short1);
            Log.d("ExifInterface", sb.toString());
        }
        if (short1 <= 0) {
            return;
        }
        short n = 0;
        while (true) {
            final int n2 = int1;
            if (n >= short1) {
                break;
            }
            final int unsignedShort = ((b)f).readUnsignedShort();
            int unsignedShort2 = ((b)f).readUnsignedShort();
            final int int2 = ((b)f).readInt();
            final long n3 = ((b)f).a() + 4L;
            final d d = T.a.k0[n2].get(unsignedShort);
            final boolean u = T.a.u;
            if (u) {
                String b;
                if (d != null) {
                    b = d.b;
                }
                else {
                    b = null;
                }
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", int1, unsignedShort, b, unsignedShort2, int2));
            }
            int c = 0;
            boolean b2 = false;
            long lng = 0L;
            Label_0539: {
                while (true) {
                    Label_0533: {
                        Label_0267: {
                            String s = null;
                            Label_0259: {
                                if (d == null) {
                                    if (!u) {
                                        break Label_0267;
                                    }
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Skip the tag entry since tag number is not defined: ");
                                    sb2.append(unsignedShort);
                                    s = sb2.toString();
                                }
                                else {
                                    if (unsignedShort2 > 0) {
                                        final int[] w = T.a.W;
                                        if (unsignedShort2 < w.length) {
                                            if (!d.a(unsignedShort2)) {
                                                if (u) {
                                                    final StringBuilder sb3 = new StringBuilder();
                                                    sb3.append("Skip the tag entry since data format (");
                                                    sb3.append(T.a.V[unsignedShort2]);
                                                    sb3.append(") is unexpected for tag: ");
                                                    sb3.append(d.b);
                                                    s = sb3.toString();
                                                    break Label_0259;
                                                }
                                                break Label_0267;
                                            }
                                            else {
                                                if ((c = unsignedShort2) == 7) {
                                                    c = d.c;
                                                }
                                                final long n4 = w[c] * (long)int2;
                                                if (n4 >= 0L && n4 <= 2147483647L) {
                                                    b2 = true;
                                                    lng = n4;
                                                    break Label_0539;
                                                }
                                                lng = n4;
                                                unsignedShort2 = c;
                                                if (u) {
                                                    final StringBuilder sb4 = new StringBuilder();
                                                    sb4.append("Skip the tag entry since the number of components is invalid: ");
                                                    sb4.append(int2);
                                                    Log.d("ExifInterface", sb4.toString());
                                                    unsignedShort2 = c;
                                                    lng = n4;
                                                }
                                                break Label_0482;
                                            }
                                        }
                                    }
                                    if (u) {
                                        final StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Skip the tag entry since data format is invalid: ");
                                        sb5.append(unsignedShort2);
                                        Log.d("ExifInterface", sb5.toString());
                                    }
                                    break Label_0533;
                                }
                            }
                            Log.d("ExifInterface", s);
                        }
                        break Label_0533;
                        b2 = false;
                        c = unsignedShort2;
                        break Label_0539;
                    }
                    lng = 0L;
                    continue;
                }
            }
            Label_0550: {
                if (b2) {
                    if (lng > 4L) {
                        final int int3 = ((b)f).readInt();
                        if (u) {
                            final StringBuilder sb6 = new StringBuilder();
                            sb6.append("seek to data offset: ");
                            sb6.append(int3);
                            Log.d("ExifInterface", sb6.toString());
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(d.b)) {
                                this.q = int3;
                            }
                            else if (n2 == 6 && "ThumbnailImage".equals(d.b)) {
                                this.r = int3;
                                this.s = int2;
                                final c f2 = T.a.c.f(6, this.h);
                                final c b3 = T.a.c.b(this.r, this.h);
                                final c b4 = T.a.c.b(this.s, this.h);
                                this.f[4].put("Compression", f2);
                                this.f[4].put("JPEGInterchangeFormat", b3);
                                this.f[4].put("JPEGInterchangeFormatLength", b4);
                            }
                        }
                        f.h(int3);
                    }
                    final Integer n5 = T.a.n0.get(unsignedShort);
                    if (u) {
                        final StringBuilder sb7 = new StringBuilder();
                        sb7.append("nextIfdType: ");
                        sb7.append(n5);
                        sb7.append(" byteCount: ");
                        sb7.append(lng);
                        Log.d("ExifInterface", sb7.toString());
                    }
                    if (n5 != null) {
                        long b5 = 0L;
                        Label_0925: {
                            int n6;
                            if (c != 3) {
                                if (c == 4) {
                                    b5 = ((b)f).b();
                                    break Label_0925;
                                }
                                if (c != 8) {
                                    if (c != 9 && c != 13) {
                                        b5 = -1L;
                                        break Label_0925;
                                    }
                                    n6 = ((b)f).readInt();
                                }
                                else {
                                    n6 = ((b)f).readShort();
                                }
                            }
                            else {
                                n6 = ((b)f).readUnsignedShort();
                            }
                            b5 = n6;
                        }
                        if (u) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", b5, d.b));
                        }
                        while (true) {
                            String s2 = null;
                            Label_1076: {
                                if (b5 > 0L) {
                                    if (!this.g.contains((int)b5)) {
                                        f.h(b5);
                                        this.H(f, n5);
                                    }
                                    else if (u) {
                                        final StringBuilder sb8 = new StringBuilder();
                                        sb8.append("Skip jump into the IFD since it has already been read: IfdType ");
                                        sb8.append(n5);
                                        sb8.append(" (at ");
                                        sb8.append(b5);
                                        sb8.append(")");
                                        s2 = sb8.toString();
                                        break Label_1076;
                                    }
                                }
                                else if (u) {
                                    final StringBuilder sb9 = new StringBuilder();
                                    sb9.append("Skip jump into the IFD since its offset is invalid: ");
                                    sb9.append(b5);
                                    s2 = sb9.toString();
                                    break Label_1076;
                                }
                                f.h(n3);
                                break Label_0550;
                            }
                            Log.d("ExifInterface", s2);
                            continue;
                        }
                    }
                    final int a = ((b)f).a();
                    final int p2 = this.p;
                    final byte[] array = new byte[(int)lng];
                    ((b)f).readFully(array);
                    final c value = new c(c, int2, a + p2, array);
                    this.f[int1].put(d.b, value);
                    if ("DNGVersion".equals(d.b)) {
                        this.d = 3;
                    }
                    if ((("Make".equals(d.b) || "Model".equals(d.b)) && value.j(this.h).contains("PENTAX")) || ("Compression".equals(d.b) && value.i(this.h) == 65535)) {
                        this.d = 8;
                    }
                    if (((b)f).a() == n3) {
                        break Label_0550;
                    }
                }
                f.h(n3);
            }
            ++n;
        }
        int1 = ((b)f).readInt();
        final boolean u2 = T.a.u;
        if (u2) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", int1));
        }
        final long n7 = int1;
        StringBuilder sb10;
        String str;
        if (n7 > 0L) {
            if (!this.g.contains(int1)) {
                f.h(n7);
                if (this.f[4].isEmpty()) {
                    this.H(f, 4);
                    return;
                }
                if (this.f[5].isEmpty()) {
                    this.H(f, 5);
                }
                return;
            }
            else {
                if (!u2) {
                    return;
                }
                sb10 = new StringBuilder();
                str = "Stop reading file since re-reading an IFD may cause an infinite loop: ";
            }
        }
        else {
            if (!u2) {
                return;
            }
            sb10 = new StringBuilder();
            str = "Stop reading file since a wrong offset may cause an infinite loop: ";
        }
        sb10.append(str);
        sb10.append(int1);
        Log.d("ExifInterface", sb10.toString());
    }
    
    public final void I(final int n, final String key, final String key2) {
        if (!this.f[n].isEmpty() && this.f[n].get(key) != null) {
            final HashMap hashMap = this.f[n];
            hashMap.put(key2, hashMap.get(key));
            this.f[n].remove(key);
        }
    }
    
    public final void J(final f f, final int n) {
        final c c = this.f[n].get("ImageLength");
        final c c2 = this.f[n].get("ImageWidth");
        if (c == null || c2 == null) {
            final c c3 = this.f[n].get("JPEGInterchangeFormat");
            final c c4 = this.f[n].get("JPEGInterchangeFormatLength");
            if (c3 != null && c4 != null) {
                final int i = c3.i(this.h);
                final int j = c3.i(this.h);
                f.h(i);
                final byte[] b = new byte[j];
                f.read(b);
                this.f(new b(b), i, n);
            }
        }
    }
    
    public final void K(final b b) {
        final HashMap hashMap = this.f[4];
        final c c = hashMap.get("Compression");
        Label_0078: {
            if (c != null) {
                final int i = c.i(this.h);
                if ((this.o = i) != 1) {
                    if (i == 6) {
                        break Label_0078;
                    }
                    if (i != 7) {
                        return;
                    }
                }
                if (this.z(hashMap)) {
                    this.q(b, hashMap);
                }
                return;
            }
            else {
                this.o = 6;
            }
        }
        this.p(b, hashMap);
    }
    
    public final void M(final int n, final int n2) {
        if (!this.f[n].isEmpty() && !this.f[n2].isEmpty()) {
            final c c = this.f[n].get("ImageLength");
            final c c2 = this.f[n].get("ImageWidth");
            final c c3 = this.f[n2].get("ImageLength");
            final c c4 = this.f[n2].get("ImageWidth");
            String s;
            if (c != null && c2 != null) {
                if (c3 != null && c4 != null) {
                    final int i = c.i(this.h);
                    final int j = c2.i(this.h);
                    final int k = c3.i(this.h);
                    final int l = c4.i(this.h);
                    if (i < k && j < l) {
                        final HashMap[] f = this.f;
                        final HashMap hashMap = f[n];
                        f[n] = f[n2];
                        f[n2] = hashMap;
                    }
                    return;
                }
                else {
                    if (!T.a.u) {
                        return;
                    }
                    s = "Second image does not contain valid size information";
                }
            }
            else {
                if (!T.a.u) {
                    return;
                }
                s = "First image does not contain valid size information";
            }
            Log.d("ExifInterface", s);
            return;
        }
        if (T.a.u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }
    
    public final void N(final f f, final int n) {
        final c c = this.f[n].get("DefaultCropSize");
        final c c2 = this.f[n].get("SensorTopBorder");
        final c c3 = this.f[n].get("SensorLeftBorder");
        final c c4 = this.f[n].get("SensorBottomBorder");
        final c c5 = this.f[n].get("SensorRightBorder");
        if (c != null) {
            c value = null;
            c value2 = null;
            Label_0253: {
                StringBuilder sb;
                String str;
                if (c.a == 5) {
                    final e[] a = (e[])c.k(this.h);
                    if (a != null && a.length == 2) {
                        value = T.a.c.d(a[0], this.h);
                        value2 = T.a.c.d(a[1], this.h);
                        break Label_0253;
                    }
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(a);
                }
                else {
                    final int[] a2 = (int[])c.k(this.h);
                    if (a2 != null && a2.length == 2) {
                        value = T.a.c.f(a2[0], this.h);
                        value2 = T.a.c.f(a2[1], this.h);
                        break Label_0253;
                    }
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(a2);
                }
                sb.append(str);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            this.f[n].put("ImageWidth", value);
            this.f[n].put("ImageLength", value2);
            return;
        }
        if (c2 != null && c3 != null && c4 != null && c5 != null) {
            final int i = c2.i(this.h);
            final int j = c4.i(this.h);
            final int k = c5.i(this.h);
            final int l = c3.i(this.h);
            if (j > i && k > l) {
                final c f2 = T.a.c.f(j - i, this.h);
                final c f3 = T.a.c.f(k - l, this.h);
                this.f[n].put("ImageLength", f2);
                this.f[n].put("ImageWidth", f3);
            }
        }
        else {
            this.J(f, n);
        }
    }
    
    public final void O() {
        this.M(0, 5);
        this.M(0, 4);
        this.M(5, 4);
        final c value = this.f[1].get("PixelXDimension");
        final c value2 = this.f[1].get("PixelYDimension");
        if (value != null && value2 != null) {
            this.f[0].put("ImageWidth", value);
            this.f[0].put("ImageLength", value2);
        }
        if (this.f[4].isEmpty() && this.A(this.f[5])) {
            final HashMap[] f = this.f;
            f[4] = f[5];
            f[5] = new HashMap();
        }
        if (!this.A(this.f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        this.I(0, "ThumbnailOrientation", "Orientation");
        this.I(0, "ThumbnailImageLength", "ImageLength");
        this.I(0, "ThumbnailImageWidth", "ImageWidth");
        this.I(5, "ThumbnailOrientation", "Orientation");
        this.I(5, "ThumbnailImageLength", "ImageLength");
        this.I(5, "ThumbnailImageWidth", "ImageWidth");
        this.I(4, "Orientation", "ThumbnailOrientation");
        this.I(4, "ImageLength", "ThumbnailImageLength");
        this.I(4, "ImageWidth", "ThumbnailImageWidth");
    }
    
    public final void a() {
        final String b = this.b("DateTimeOriginal");
        if (b != null && this.b("DateTime") == null) {
            this.f[0].put("DateTime", T.a.c.a(b));
        }
        if (this.b("ImageWidth") == null) {
            this.f[0].put("ImageWidth", T.a.c.b(0L, this.h));
        }
        if (this.b("ImageLength") == null) {
            this.f[0].put("ImageLength", T.a.c.b(0L, this.h));
        }
        if (this.b("Orientation") == null) {
            this.f[0].put("Orientation", T.a.c.b(0L, this.h));
        }
        if (this.b("LightSource") == null) {
            this.f[1].put("LightSource", T.a.c.b(0L, this.h));
        }
    }
    
    public String b(String o) {
        Label_0270: {
            if (o == null) {
                break Label_0270;
            }
            final c d = this.d(o);
            Label_0268: {
                if (d == null) {
                    break Label_0268;
                }
                if (!T.a.m0.contains(o)) {
                    return d.j(this.h);
                }
                if (o.equals("GPSTimeStamp")) {
                    final int a = d.a;
                    if (a != 5 && a != 10) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("GPS Timestamp format is not rational. format=");
                        sb.append(d.a);
                        o = sb.toString();
                    }
                    else {
                        final e[] a2 = (e[])d.k(this.h);
                        if (a2 != null && a2.length == 3) {
                            final e e = a2[0];
                            final int i = (int)(e.a / (float)e.b);
                            final e e2 = a2[1];
                            final int j = (int)(e2.a / (float)e2.b);
                            final e e3 = a2[2];
                            return String.format("%02d:%02d:%02d", i, j, (int)(e3.a / (float)e3.b));
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid GPS Timestamp array. array=");
                        sb2.append(Arrays.toString(a2));
                        o = sb2.toString();
                    }
                    Log.w("ExifInterface", o);
                    return null;
                }
                try {
                    o = Double.toString(d.h(this.h));
                    return o;
                    return null;
                    throw new NullPointerException("tag shouldn't be null");
                }
                catch (NumberFormatException ex) {
                    return null;
                }
            }
        }
    }
    
    public int c(final String s, final int n) {
        Label_0027: {
            if (s == null) {
                break Label_0027;
            }
            final c d = this.d(s);
            if (d == null) {
                return n;
            }
            try {
                return d.i(this.h);
                throw new NullPointerException("tag shouldn't be null");
            }
            catch (NumberFormatException ex) {
                return n;
            }
        }
    }
    
    public final c d(final String anObject) {
        if (anObject != null) {
            String key = anObject;
            if ("ISOSpeedRatings".equals(anObject)) {
                if (T.a.u) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                key = "PhotographicSensitivity";
            }
            for (int i = 0; i < T.a.i0.length; ++i) {
                final c c = this.f[i].get(key);
                if (c != null) {
                    return c;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }
    
    public final void e(f f) {
        Label_0503: {
            if (Build$VERSION.SDK_INT < 28) {
                break Label_0503;
            }
            MediaMetadataRetriever mediaMetadataRetriever;
            Object metadata;
            String metadata2;
            String str;
            String str2;
            String s;
            int int1;
            int n;
            int int2;
            int int3;
            int n2;
            StringBuilder sb;
            final f f2;
            Label_0149_Outer:Label_0245_Outer:
            while (true) {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                while (true) {
                    Label_0546: {
                        Label_0541: {
                            Label_0535:Label_0496_Outer:
                            while (true) {
                                Label_0522: {
                                    while (true) {
                                        try {
                                            while (true) {
                                                while (true) {
                                                    try {
                                                        T.b.b.a(mediaMetadataRetriever, new MediaDataSource() {
                                                            public long o;
                                                            
                                                            public void close() {
                                                            }
                                                            
                                                            public long getSize() {
                                                                return -1L;
                                                            }
                                                            
                                                            public int readAt(final long o, final byte[] array, int read, final int n) {
                                                                if (n == 0) {
                                                                    return 0;
                                                                }
                                                                if (o < 0L) {
                                                                    return -1;
                                                                }
                                                                while (true) {
                                                                    try {
                                                                        final long o2 = this.o;
                                                                        if (o2 != o) {
                                                                            if (o2 >= 0L && o >= o2 + ((b)f).available()) {
                                                                                return -1;
                                                                            }
                                                                            f.h(o);
                                                                            this.o = o;
                                                                        }
                                                                        int available;
                                                                        if ((available = n) > ((b)f).available()) {
                                                                            available = ((b)f).available();
                                                                        }
                                                                        read = ((b)f).read(array, read, available);
                                                                        if (read >= 0) {
                                                                            this.o += read;
                                                                            return read;
                                                                        }
                                                                        this.o = -1L;
                                                                        return -1;
                                                                    }
                                                                    catch (IOException ex) {
                                                                        continue Label_0149_Outer;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                        });
                                                        metadata = mediaMetadataRetriever.extractMetadata(33);
                                                        metadata2 = mediaMetadataRetriever.extractMetadata(34);
                                                        str = mediaMetadataRetriever.extractMetadata(26);
                                                        str2 = mediaMetadataRetriever.extractMetadata(17);
                                                        if ("yes".equals(str)) {
                                                            str = mediaMetadataRetriever.extractMetadata(29);
                                                            str2 = mediaMetadataRetriever.extractMetadata(30);
                                                            s = mediaMetadataRetriever.extractMetadata(31);
                                                        }
                                                        else {
                                                            if (!"yes".equals(str2)) {
                                                                break Label_0522;
                                                            }
                                                            str = mediaMetadataRetriever.extractMetadata(18);
                                                            str2 = mediaMetadataRetriever.extractMetadata(19);
                                                            s = mediaMetadataRetriever.extractMetadata(24);
                                                        }
                                                        if (str != null) {
                                                            this.f[0].put("ImageWidth", T.a.c.f(Integer.parseInt(str), this.h));
                                                        }
                                                        if (str2 != null) {
                                                            this.f[0].put("ImageLength", T.a.c.f(Integer.parseInt(str2), this.h));
                                                        }
                                                        if (s != null) {
                                                            int1 = Integer.parseInt(s);
                                                            if (int1 == 90) {
                                                                break Label_0546;
                                                            }
                                                            if (int1 == 180) {
                                                                break Label_0541;
                                                            }
                                                            if (int1 == 270) {
                                                                break Label_0535;
                                                            }
                                                            n = 1;
                                                            this.f[0].put("Orientation", T.a.c.f(n, this.h));
                                                        }
                                                        if (metadata != null && metadata2 != null) {
                                                            int2 = Integer.parseInt((String)metadata);
                                                            int3 = Integer.parseInt(metadata2);
                                                            if (int3 <= 6) {
                                                                throw new IOException("Invalid exif length");
                                                            }
                                                            f.h(int2);
                                                            metadata = new byte[6];
                                                            if (f.read((byte[])metadata) != 6) {
                                                                throw new IOException("Can't read identifier");
                                                            }
                                                            n2 = int3 - 6;
                                                            if (!Arrays.equals((byte[])metadata, T.a.p0)) {
                                                                throw new IOException("Invalid identifier");
                                                            }
                                                            metadata = new byte[n2];
                                                            if (f.read((byte[])metadata) != n2) {
                                                                throw new IOException("Can't read exif");
                                                            }
                                                            this.p = int2 + 6;
                                                            this.G((byte[])metadata, 0);
                                                        }
                                                        if (T.a.u) {
                                                            sb = new StringBuilder();
                                                            sb.append("Heif meta: ");
                                                            sb.append(str);
                                                            sb.append("x");
                                                            sb.append(str2);
                                                            sb.append(", rotation ");
                                                            sb.append(s);
                                                            Log.d("ExifInterface", sb.toString());
                                                        }
                                                        mediaMetadataRetriever.release();
                                                        return;
                                                        throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                                                        mediaMetadataRetriever.release();
                                                        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
                                                    }
                                                    catch (RuntimeException ex) {}
                                                    continue Label_0496_Outer;
                                                }
                                            }
                                        }
                                        finally {}
                                        f = f2;
                                        continue;
                                    }
                                }
                                str = null;
                                str2 = (s = null);
                                continue Label_0245_Outer;
                            }
                            n = 8;
                            continue;
                        }
                        n = 3;
                        continue;
                    }
                    n = 6;
                    continue;
                }
            }
        }
    }
    
    public final void f(final b obj, final int n, final int n2) {
        if (T.a.u) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getJpegAttributes starting with: ");
            sb.append(obj);
            Log.d("ExifInterface", sb.toString());
        }
        obj.c(ByteOrder.BIG_ENDIAN);
        final byte byte1 = obj.readByte();
        if (byte1 != -1) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid marker: ");
            sb2.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(sb2.toString());
        }
        if (obj.readByte() != -40) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid marker: ");
            sb3.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(sb3.toString());
        }
        int n3 = 2;
        while (true) {
            final byte byte2 = obj.readByte();
            if (byte2 != -1) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Invalid marker:");
                sb4.append(Integer.toHexString(byte2 & 0xFF));
                throw new IOException(sb4.toString());
            }
            final byte byte3 = obj.readByte();
            final boolean u = T.a.u;
            if (u) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("Found JPEG segment indicator: ");
                sb5.append(Integer.toHexString(byte3 & 0xFF));
                Log.d("ExifInterface", sb5.toString());
            }
            if (byte3 == -39 || byte3 == -38) {
                obj.c(this.h);
                return;
            }
            final int unsignedShort = obj.readUnsignedShort();
            final int n4 = unsignedShort - 2;
            int n5 = n3 + 4;
            if (u) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append("JPEG segment: ");
                sb6.append(Integer.toHexString(byte3 & 0xFF));
                sb6.append(" (length: ");
                sb6.append(unsignedShort);
                sb6.append(")");
                Log.d("ExifInterface", sb6.toString());
            }
            if (n4 < 0) {
                throw new IOException("Invalid length");
            }
            int n6 = 0;
            Label_0753: {
                int n7;
                if (byte3 != -31) {
                    if (byte3 != -2) {
                        Label_0399: {
                            switch (byte3) {
                                default: {
                                    switch (byte3) {
                                        default: {
                                            switch (byte3) {
                                                default: {
                                                    switch (byte3) {
                                                        default: {
                                                            n6 = n4;
                                                            break Label_0399;
                                                        }
                                                        case -51:
                                                        case -50:
                                                        case -49: {
                                                            break Label_0399;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case -55:
                                                case -54:
                                                case -53: {
                                                    break Label_0399;
                                                }
                                            }
                                            break;
                                        }
                                        case -59:
                                        case -58:
                                        case -57: {
                                            break Label_0399;
                                        }
                                    }
                                    break;
                                }
                                case -64:
                                case -63:
                                case -62:
                                case -61: {
                                    obj.e(1);
                                    final HashMap hashMap = this.f[n2];
                                    String key;
                                    if (n2 != 4) {
                                        key = "ImageLength";
                                    }
                                    else {
                                        key = "ThumbnailImageLength";
                                    }
                                    hashMap.put(key, T.a.c.b(obj.readUnsignedShort(), this.h));
                                    final HashMap hashMap2 = this.f[n2];
                                    String key2;
                                    if (n2 != 4) {
                                        key2 = "ImageWidth";
                                    }
                                    else {
                                        key2 = "ThumbnailImageWidth";
                                    }
                                    hashMap2.put(key2, T.a.c.b(obj.readUnsignedShort(), this.h));
                                    n6 = unsignedShort - 7;
                                    break;
                                }
                            }
                        }
                        break Label_0753;
                    }
                    final byte[] array = new byte[n4];
                    if (obj.read(array) != n4) {
                        throw new IOException("Invalid exif");
                    }
                    if (this.b("UserComment") == null) {
                        this.f[1].put("UserComment", T.a.c.a(new String(array, T.a.o0)));
                    }
                    n7 = n5;
                }
                else {
                    final byte[] array2 = new byte[n4];
                    obj.readFully(array2);
                    final byte[] p3 = T.a.p0;
                    if (T.b.c(array2, p3)) {
                        final byte[] copyOfRange = Arrays.copyOfRange(array2, p3.length, n4);
                        this.p = n + n5 + p3.length;
                        this.G(copyOfRange, n2);
                        this.K(new b(copyOfRange));
                    }
                    else {
                        final byte[] q0 = T.a.q0;
                        if (T.b.c(array2, q0)) {
                            final int length = q0.length;
                            final byte[] copyOfRange2 = Arrays.copyOfRange(array2, q0.length, n4);
                            if (this.b("Xmp") == null) {
                                this.f[0].put("Xmp", new c(1, copyOfRange2.length, n5 + length, copyOfRange2));
                                this.t = true;
                            }
                        }
                    }
                    n7 = n5 + n4;
                }
                final int n8 = 0;
                n5 = n7;
                n6 = n8;
            }
            if (n6 < 0) {
                throw new IOException("Invalid length");
            }
            obj.e(n6);
            n3 = n5 + n6;
        }
    }
    
    public final int g(final BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        final byte[] b = new byte[5000];
        bufferedInputStream.read(b);
        bufferedInputStream.reset();
        if (t(b)) {
            return 4;
        }
        if (this.w(b)) {
            return 9;
        }
        if (this.s(b)) {
            return 12;
        }
        if (this.u(b)) {
            return 7;
        }
        if (this.x(b)) {
            return 10;
        }
        if (this.v(b)) {
            return 13;
        }
        if (this.B(b)) {
            return 14;
        }
        return 0;
    }
    
    public final void h(f f) {
        this.k(f);
        final c c = this.f[1].get("MakerNote");
        if (c != null) {
            f = new f(c.d);
            ((b)f).c(this.h);
            final byte[] e = T.a.E;
            final byte[] a = new byte[e.length];
            ((b)f).readFully(a);
            f.h(0L);
            final byte[] f2 = T.a.F;
            final byte[] a2 = new byte[f2.length];
            ((b)f).readFully(a2);
            Label_0128: {
                long n;
                if (Arrays.equals(a, e)) {
                    n = 8L;
                }
                else {
                    if (!Arrays.equals(a2, f2)) {
                        break Label_0128;
                    }
                    n = 12L;
                }
                f.h(n);
            }
            this.H(f, 6);
            final c value = this.f[7].get("PreviewImageStart");
            final c value2 = this.f[7].get("PreviewImageLength");
            if (value != null && value2 != null) {
                this.f[5].put("JPEGInterchangeFormat", value);
                this.f[5].put("JPEGInterchangeFormatLength", value2);
            }
            final c c2 = this.f[8].get("AspectFrame");
            if (c2 != null) {
                final int[] a3 = (int[])c2.k(this.h);
                if (a3 != null && a3.length == 4) {
                    final int n2 = a3[2];
                    final int n3 = a3[0];
                    if (n2 > n3) {
                        final int n4 = a3[3];
                        final int n5 = a3[1];
                        if (n4 > n5) {
                            final int n6 = n2 - n3 + 1;
                            final int n7 = n4 - n5 + 1;
                            int n8;
                            int n9;
                            if ((n8 = n6) < (n9 = n7)) {
                                final int n10 = n6 + n7;
                                n9 = n10 - n7;
                                n8 = n10 - n9;
                            }
                            final c f3 = T.a.c.f(n8, this.h);
                            final c f4 = T.a.c.f(n9, this.h);
                            this.f[0].put("ImageWidth", f3);
                            this.f[0].put("ImageLength", f4);
                        }
                    }
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(a3));
                    Log.w("ExifInterface", sb.toString());
                }
            }
        }
    }
    
    public final void i(final b obj) {
        if (T.a.u) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(obj);
            Log.d("ExifInterface", sb.toString());
        }
        obj.c(ByteOrder.BIG_ENDIAN);
        final byte[] g = T.a.G;
        obj.e(g.length);
        int length = g.length;
        try {
            while (true) {
                final int int1 = obj.readInt();
                final byte[] b = new byte[4];
                if (obj.read(b) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                final int p = length + 8;
                if (p == 16 && !Arrays.equals(b, T.a.I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(b, T.a.J)) {
                    return;
                }
                if (Arrays.equals(b, T.a.H)) {
                    final byte[] array = new byte[int1];
                    if (obj.read(array) != int1) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to read given length for given PNG chunk type: ");
                        sb2.append(T.b.a(b));
                        throw new IOException(sb2.toString());
                    }
                    final int int2 = obj.readInt();
                    final CRC32 crc32 = new CRC32();
                    crc32.update(b);
                    crc32.update(array);
                    if ((int)crc32.getValue() == int2) {
                        this.p = p;
                        this.G(array, 0);
                        this.O();
                        this.K(new b(array));
                        return;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                    sb3.append(int2);
                    sb3.append(", calculated CRC value: ");
                    sb3.append(crc32.getValue());
                    throw new IOException(sb3.toString());
                }
                else {
                    final int n = int1 + 4;
                    obj.e(n);
                    length = p + n;
                }
            }
            throw new IOException("Encountered corrupt PNG file.");
        }
        catch (EOFException ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }
    
    public final void j(final b obj) {
        final boolean u = T.a.u;
        if (u) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(obj);
            Log.d("ExifInterface", sb.toString());
        }
        obj.e(84);
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[4];
        final byte[] array3 = new byte[4];
        obj.read(array);
        obj.read(array2);
        obj.read(array3);
        final int int1 = ByteBuffer.wrap(array).getInt();
        final int int2 = ByteBuffer.wrap(array2).getInt();
        final int int3 = ByteBuffer.wrap(array3).getInt();
        final byte[] b = new byte[int2];
        obj.e(int1 - obj.a());
        obj.read(b);
        this.f(new b(b), int1, 5);
        obj.e(int3 - obj.a());
        obj.c(ByteOrder.BIG_ENDIAN);
        final int int4 = obj.readInt();
        if (u) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(int4);
            Log.d("ExifInterface", sb2.toString());
        }
        for (int i = 0; i < int4; ++i) {
            final int unsignedShort = obj.readUnsignedShort();
            final int unsignedShort2 = obj.readUnsignedShort();
            if (unsignedShort == T.a.d0.a) {
                final short short1 = obj.readShort();
                final short short2 = obj.readShort();
                final c f = T.a.c.f(short1, this.h);
                final c f2 = T.a.c.f(short2, this.h);
                this.f[0].put("ImageLength", f);
                this.f[0].put("ImageWidth", f2);
                if (T.a.u) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append(short1);
                    sb3.append(", width: ");
                    sb3.append(short2);
                    Log.d("ExifInterface", sb3.toString());
                }
                return;
            }
            obj.e(unsignedShort2);
        }
    }
    
    public final void k(f f) {
        this.D((b)f);
        this.H(f, 0);
        this.N(f, 0);
        this.N(f, 5);
        this.N(f, 4);
        this.O();
        if (this.d == 8) {
            final c c = this.f[1].get("MakerNote");
            if (c != null) {
                f = new f(c.d);
                ((b)f).c(this.h);
                ((b)f).e(6);
                this.H(f, 9);
                final c value = this.f[9].get("ColorSpace");
                if (value != null) {
                    this.f[1].put("ColorSpace", value);
                }
            }
        }
    }
    
    public int l() {
        switch (this.c("Orientation", 1)) {
            default: {
                return 0;
            }
            case 6:
            case 7: {
                return 90;
            }
            case 5:
            case 8: {
                return 270;
            }
            case 3:
            case 4: {
                return 180;
            }
        }
    }
    
    public final void m(final f obj) {
        if (T.a.u) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(obj);
            Log.d("ExifInterface", sb.toString());
        }
        this.k(obj);
        final c c = this.f[0].get("JpgFromRaw");
        if (c != null) {
            this.f(new b(c.d), (int)c.c, 5);
        }
        final c value = this.f[0].get("ISO");
        final c c2 = this.f[1].get("PhotographicSensitivity");
        if (value != null && c2 == null) {
            this.f[1].put("PhotographicSensitivity", value);
        }
    }
    
    public final void n(final f f) {
        final byte[] p = T.a.p0;
        ((b)f).e(p.length);
        final byte[] array = new byte[((b)f).available()];
        ((b)f).readFully(array);
        this.p = p.length;
        this.G(array, 0);
    }
    
    public final void o(final b obj) {
        if (T.a.u) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(obj);
            Log.d("ExifInterface", sb.toString());
        }
        obj.c(ByteOrder.LITTLE_ENDIAN);
        obj.e(T.a.K.length);
        final int n = obj.readInt() + 8;
        final byte[] l = T.a.L;
        obj.e(l.length);
        int n2 = l.length + 8;
        Block_2: {
            break Block_2;
            int i;
            do {
                while (true) {
                    break Label_0202;
                    int int1 = 0;
                    int p = 0;
                    Label_0255: {
                        try {
                            // iftrue(Label_0218:, i > n)
                            while (true) {
                                final byte[] array = new byte[4];
                                if (obj.read(array) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                                }
                                int1 = obj.readInt();
                                p = n2 + 8;
                                if (!Arrays.equals(T.a.M, array)) {
                                    break Label_0255;
                                }
                                final byte[] b = new byte[int1];
                                if (obj.read(b) == int1) {
                                    this.p = p;
                                    this.G(b, 0);
                                    this.K(new b(b));
                                    return;
                                }
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Failed to read given length for given PNG chunk type: ");
                                sb2.append(T.b.a(array));
                                throw new IOException(sb2.toString());
                                final int n3;
                                obj.e(n3);
                                n2 = i;
                                continue;
                            }
                            Label_0218: {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        }
                        catch (EOFException ex) {
                            throw new IOException("Encountered corrupt WebP file.");
                        }
                    }
                    int n3 = int1;
                    if (int1 % 2 == 1) {
                        n3 = int1 + 1;
                    }
                    i = p + n3;
                    continue;
                }
            } while (i != n);
        }
    }
    
    public final void p(final b b, final HashMap hashMap) {
        final c c = hashMap.get("JPEGInterchangeFormat");
        final c c2 = hashMap.get("JPEGInterchangeFormatLength");
        if (c != null && c2 != null) {
            final int i = c.i(this.h);
            final int j = c2.i(this.h);
            int n = i;
            if (this.d == 7) {
                n = i + this.q;
            }
            if (n > 0 && j > 0) {
                this.i = true;
                if (this.a == null && this.c == null && this.b == null) {
                    final byte[] array = new byte[j];
                    b.skip(n);
                    b.read(array);
                    this.n = array;
                }
                this.l = n;
                this.m = j;
            }
            if (T.a.u) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(n);
                sb.append(", length: ");
                sb.append(j);
                Log.d("ExifInterface", sb.toString());
            }
        }
    }
    
    public final void q(final b b, final HashMap hashMap) {
        final c c = hashMap.get("StripOffsets");
        final c c2 = hashMap.get("StripByteCounts");
        if (c != null && c2 != null) {
            final long[] b2 = b.b(c.k(this.h));
            final long[] b3 = b.b(c2.k(this.h));
            if (b2 != null && b2.length != 0) {
                if (b3 == null || b3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (b2.length != b3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                final int length = b3.length;
                long n = 0L;
                for (int i = 0; i < length; ++i) {
                    n += b3[i];
                }
                final int m = (int)n;
                final byte[] n2 = new byte[m];
                this.k = true;
                this.j = true;
                this.i = true;
                final int n3 = 0;
                int n5;
                int n4 = n5 = n3;
                for (int j = n3; j < b2.length; ++j) {
                    final int n6 = (int)b2[j];
                    final int k = (int)b3[j];
                    if (j < b2.length - 1 && n6 + k != b2[j + 1]) {
                        this.k = false;
                    }
                    final int l = n6 - n5;
                    if (l < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    final long n7 = l;
                    if (b.skip(n7) != n7) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed to skip ");
                        sb.append(l);
                        sb.append(" bytes.");
                        Log.d("ExifInterface", sb.toString());
                        return;
                    }
                    final byte[] b4 = new byte[k];
                    if (b.read(b4) != k) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to read ");
                        sb2.append(k);
                        sb2.append(" bytes.");
                        Log.d("ExifInterface", sb2.toString());
                        return;
                    }
                    n5 = n5 + l + k;
                    System.arraycopy(b4, 0, n2, n4, k);
                    n4 += k;
                }
                this.n = n2;
                if (this.k) {
                    this.l = (int)b2[0];
                    this.m = m;
                }
            }
            else {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            }
        }
    }
    
    public final boolean s(byte[] a) {
        final InputStream inputStream = null;
        Object o = null;
        Label_0350: {
            b b = null;
            InputStream inputStream2;
            try {
                try {
                    b = new b(a);
                    long n = 0L;
                    long n2 = 0L;
                    Label_0123: {
                        try {
                            n = b.readInt();
                            o = new byte[4];
                            b.read((byte[])o);
                            if (!Arrays.equals((byte[])o, a.B)) {
                                b.close();
                                return false;
                            }
                            if (n == 1L) {
                                final long long1 = b.readLong();
                                n2 = 16L;
                                n = long1;
                                if (long1 < 16L) {
                                    b.close();
                                    return false;
                                }
                                break Label_0123;
                            }
                        }
                        catch (Exception o) {}
                        finally {
                            o = b;
                            break Label_0350;
                        }
                        n2 = 8L;
                    }
                    long n3 = n;
                    final Throwable t;
                    if (n > t.length) {
                        n3 = t.length;
                    }
                    final long n4 = n3 - n2;
                    if (n4 < 8L) {
                        b.close();
                        return false;
                    }
                    a = new byte[4];
                    long n5 = 0L;
                    int n7;
                    int n6 = n7 = 0;
                    while (n5 < n4 / 4L) {
                        if (b.read(a) != 4) {
                            b.close();
                            return false;
                        }
                        int n8;
                        if (n5 == 1L) {
                            n8 = n7;
                        }
                        else {
                            int n9;
                            if (Arrays.equals(a, a.C)) {
                                n9 = 1;
                            }
                            else {
                                final boolean equals = Arrays.equals(a, a.D);
                                n9 = n6;
                                if (equals) {
                                    n7 = 1;
                                    n9 = n6;
                                }
                            }
                            n6 = n9;
                            n8 = n7;
                            if (n9 != 0) {
                                n6 = n9;
                                if ((n8 = n7) != 0) {
                                    b.close();
                                    return true;
                                }
                            }
                        }
                        ++n5;
                        n7 = n8;
                    }
                    b.close();
                    return false;
                }
                finally {}
            }
            catch (Exception b) {
                inputStream2 = inputStream;
            }
            if (a.u) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", (Throwable)b);
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            return false;
        }
        if (o != null) {
            ((InputStream)o).close();
        }
    }
    
    public final boolean u(final byte[] array) {
        boolean b = false;
        try {
            final b b2 = new b(array);
            try {
                b2.c(this.h = this.F(b2));
                final short short1 = b2.readShort();
                if (short1 == 20306 || short1 == 21330) {
                    b = true;
                }
                b2.close();
                return b;
            }
            catch (Exception ex) {}
        }
        catch (Exception ex2) {}
        goto Label_0068;
    }
    
    public final boolean v(final byte[] array) {
        int n = 0;
        while (true) {
            final byte[] g = T.a.G;
            if (n >= g.length) {
                return true;
            }
            if (array[n] != g[n]) {
                return false;
            }
            ++n;
        }
    }
    
    public final boolean w(final byte[] array) {
        final byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; ++i) {
            if (array[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean x(final byte[] array) {
        boolean b = false;
        try {
            final b b2 = new b(array);
            try {
                b2.c(this.h = this.F(b2));
                if (b2.readShort() == 85) {
                    b = true;
                }
                b2.close();
                return b;
            }
            catch (Exception ex) {}
        }
        catch (Exception ex2) {}
        goto Label_0060;
    }
    
    public final boolean z(final HashMap hashMap) {
        final c c = hashMap.get("BitsPerSample");
        if (c != null) {
            final int[] a = (int[])c.k(this.h);
            final int[] x = T.a.x;
            if (Arrays.equals(x, a)) {
                return true;
            }
            if (this.d == 3) {
                final c c2 = hashMap.get("PhotometricInterpretation");
                if (c2 != null) {
                    final int i = c2.i(this.h);
                    if ((i == 1 && Arrays.equals(a, T.a.z)) || (i == 6 && Arrays.equals(a, x))) {
                        return true;
                    }
                }
            }
        }
        if (T.a.u) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
        return false;
    }
    
    public static class b extends InputStream implements DataInput
    {
        public static final ByteOrder s;
        public static final ByteOrder t;
        public final DataInputStream o;
        public ByteOrder p;
        public int q;
        public byte[] r;
        
        static {
            s = ByteOrder.LITTLE_ENDIAN;
            t = ByteOrder.BIG_ENDIAN;
        }
        
        public b(final InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }
        
        public b(final InputStream in, final ByteOrder p2) {
            this.p = ByteOrder.BIG_ENDIAN;
            (this.o = new DataInputStream(in)).mark(0);
            this.q = 0;
            this.p = p2;
        }
        
        public b(final byte[] buf) {
            this(new ByteArrayInputStream(buf), ByteOrder.BIG_ENDIAN);
        }
        
        public int a() {
            return this.q;
        }
        
        @Override
        public int available() {
            return this.o.available();
        }
        
        public long b() {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }
        
        public void c(final ByteOrder p) {
            this.p = p;
        }
        
        public void e(final int i) {
            int j;
            int read;
            for (j = 0; j < i; j += read) {
                final DataInputStream o = this.o;
                final int b = i - j;
                if ((read = (int)o.skip(b)) <= 0) {
                    if (this.r == null) {
                        this.r = new byte[8192];
                    }
                    read = this.o.read(this.r, 0, Math.min(8192, b));
                    if (read == -1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Reached EOF while skipping ");
                        sb.append(i);
                        sb.append(" bytes.");
                        throw new EOFException(sb.toString());
                    }
                }
            }
            this.q += j;
        }
        
        @Override
        public void mark(final int n) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }
        
        @Override
        public int read() {
            ++this.q;
            return this.o.read();
        }
        
        @Override
        public int read(final byte[] b, int read, final int len) {
            read = this.o.read(b, read, len);
            this.q += read;
            return read;
        }
        
        @Override
        public boolean readBoolean() {
            ++this.q;
            return this.o.readBoolean();
        }
        
        @Override
        public byte readByte() {
            ++this.q;
            final int read = this.o.read();
            if (read >= 0) {
                return (byte)read;
            }
            throw new EOFException();
        }
        
        @Override
        public char readChar() {
            this.q += 2;
            return this.o.readChar();
        }
        
        @Override
        public double readDouble() {
            return Double.longBitsToDouble(this.readLong());
        }
        
        @Override
        public float readFloat() {
            return Float.intBitsToFloat(this.readInt());
        }
        
        @Override
        public void readFully(final byte[] b) {
            this.q += b.length;
            this.o.readFully(b);
        }
        
        @Override
        public void readFully(final byte[] b, final int off, final int len) {
            this.q += len;
            this.o.readFully(b, off, len);
        }
        
        @Override
        public int readInt() {
            this.q += 4;
            final int read = this.o.read();
            final int read2 = this.o.read();
            final int read3 = this.o.read();
            final int read4 = this.o.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            final ByteOrder p = this.p;
            if (p == b.s) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (p == b.t) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.p);
            throw new IOException(sb.toString());
        }
        
        @Override
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }
        
        @Override
        public long readLong() {
            this.q += 8;
            final int read = this.o.read();
            final int read2 = this.o.read();
            final int read3 = this.o.read();
            final int read4 = this.o.read();
            final int read5 = this.o.read();
            final int read6 = this.o.read();
            final int read7 = this.o.read();
            final int read8 = this.o.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            final ByteOrder p = this.p;
            if (p == b.s) {
                return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
            }
            if (p == b.t) {
                return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.p);
            throw new IOException(sb.toString());
        }
        
        @Override
        public short readShort() {
            this.q += 2;
            final int read = this.o.read();
            final int read2 = this.o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder p = this.p;
            if (p == b.s) {
                return (short)((read2 << 8) + read);
            }
            if (p == b.t) {
                return (short)((read << 8) + read2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.p);
            throw new IOException(sb.toString());
        }
        
        @Override
        public String readUTF() {
            this.q += 2;
            return this.o.readUTF();
        }
        
        @Override
        public int readUnsignedByte() {
            ++this.q;
            return this.o.readUnsignedByte();
        }
        
        @Override
        public int readUnsignedShort() {
            this.q += 2;
            final int read = this.o.read();
            final int read2 = this.o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder p = this.p;
            if (p == b.s) {
                return (read2 << 8) + read;
            }
            if (p == b.t) {
                return (read << 8) + read2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(this.p);
            throw new IOException(sb.toString());
        }
        
        @Override
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }
        
        @Override
        public int skipBytes(final int n) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }
    
    public static class c
    {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;
        
        public c(final int a, final int b, final long c, final byte[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public c(final int n, final int n2, final byte[] array) {
            this(n, n2, -1L, array);
        }
        
        public static c a(final String str) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('\0');
            final byte[] bytes = sb.toString().getBytes(a.o0);
            return new c(2, bytes.length, bytes);
        }
        
        public static c b(final long n, final ByteOrder byteOrder) {
            return c(new long[] { n }, byteOrder);
        }
        
        public static c c(final long[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[4] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putInt((int)array[i]);
            }
            return new c(4, array.length, wrap.array());
        }
        
        public static c d(final e e, final ByteOrder byteOrder) {
            return e(new e[] { e }, byteOrder);
        }
        
        public static c e(final e[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[5] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                final e e = array[i];
                wrap.putInt((int)e.a);
                wrap.putInt((int)e.b);
            }
            return new c(5, array.length, wrap.array());
        }
        
        public static c f(final int n, final ByteOrder byteOrder) {
            return g(new int[] { n }, byteOrder);
        }
        
        public static c g(final int[] array, final ByteOrder bo) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[3] * array.length]);
            wrap.order(bo);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putShort((short)array[i]);
            }
            return new c(3, array.length, wrap.array());
        }
        
        public double h(final ByteOrder byteOrder) {
            final Object k = this.k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (k instanceof String) {
                return Double.parseDouble((String)k);
            }
            if (k instanceof long[]) {
                final long[] array = (long[])k;
                if (array.length == 1) {
                    return (double)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (k instanceof int[]) {
                final int[] array2 = (int[])k;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (k instanceof double[]) {
                final double[] array3 = (double[])k;
                if (array3.length == 1) {
                    return array3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(k instanceof e[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                final e[] array4 = (e[])k;
                if (array4.length == 1) {
                    return array4[0].a();
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public int i(final ByteOrder byteOrder) {
            final Object k = this.k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (k instanceof String) {
                return Integer.parseInt((String)k);
            }
            if (k instanceof long[]) {
                final long[] array = (long[])k;
                if (array.length == 1) {
                    return (int)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(k instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
                final int[] array2 = (int[])k;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public String j(final ByteOrder byteOrder) {
            final Object k = this.k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String)k;
            }
            final StringBuilder sb = new StringBuilder();
            final boolean b = k instanceof long[];
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int i = 0;
            if (b) {
                int n4;
                for (long[] array = (long[])k; i < array.length; i = n4) {
                    sb.append(array[i]);
                    n4 = i + 1;
                    if ((i = n4) != array.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k instanceof int[]) {
                final int[] array2 = (int[])k;
                int n5;
                for (int j = n; j < array2.length; j = n5) {
                    sb.append(array2[j]);
                    n5 = j + 1;
                    if ((j = n5) != array2.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k instanceof double[]) {
                final double[] array3 = (double[])k;
                int n6;
                for (int l = n2; l < array3.length; l = n6) {
                    sb.append(array3[l]);
                    n6 = l + 1;
                    if ((l = n6) != array3.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k instanceof e[]) {
                final e[] array4 = (e[])k;
                int n8;
                for (int n7 = n3; n7 < array4.length; n7 = n8) {
                    sb.append(array4[n7].a);
                    sb.append('/');
                    sb.append(array4[n7].b);
                    n8 = n7 + 1;
                    if ((n7 = n8) != array4.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            return null;
        }
        
        public Object k(ByteOrder string) {
            Throwable t = null;
            Serializable s = null;
            Label_1056: {
            Label_0798_Outer:
                while (true) {
                    t = null;
                    while (true) {
                        int length = 0;
                    Label_1087:
                        while (true) {
                            Label_1080: {
                                b b = null;
                                try {
                                    b = (b)(t = (Throwable)new b(this.d));
                                    Label_0892: {
                                        int n8 = 0;
                                        Label_0721: {
                                            int n7 = 0;
                                            Label_0655: {
                                                int n6 = 0;
                                                Label_0589: {
                                                    int n5 = 0;
                                                    Label_0510: {
                                                        int n4 = 0;
                                                        Label_0444: {
                                                            int n3 = 0;
                                                            Label_0378: {
                                                                int n2 = 0;
                                                                Label_0297: {
                                                                    int n = 0;
                                                                    Label_0209: {
                                                                        try {
                                                                            try {
                                                                                b.c(string);
                                                                                t = (Throwable)b;
                                                                                final int a = this.a;
                                                                                n = 0;
                                                                                n2 = 0;
                                                                                n3 = 0;
                                                                                n4 = 0;
                                                                                n5 = 0;
                                                                                n6 = 0;
                                                                                n7 = 0;
                                                                                n8 = 0;
                                                                                length = 0;
                                                                                switch (a) {
                                                                                    default: {
                                                                                        try {
                                                                                            b.close();
                                                                                            return null;
                                                                                        }
                                                                                        catch (IOException ex) {
                                                                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)ex);
                                                                                            return null;
                                                                                        }
                                                                                    }
                                                                                    case 12: {
                                                                                        t = (Throwable)b;
                                                                                        final double[] array = new double[this.b];
                                                                                        while (true) {
                                                                                            t = (Throwable)b;
                                                                                            if (length >= this.b) {
                                                                                                break Label_0209;
                                                                                            }
                                                                                            t = (Throwable)b;
                                                                                            array[length] = b.readDouble();
                                                                                            ++length;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 11: {
                                                                                        break Label_0209;
                                                                                    }
                                                                                    case 10: {
                                                                                        break Label_0297;
                                                                                    }
                                                                                    case 9: {
                                                                                        break Label_0378;
                                                                                    }
                                                                                    case 8: {
                                                                                        break Label_0444;
                                                                                    }
                                                                                    case 5: {
                                                                                        break Label_0510;
                                                                                    }
                                                                                    case 4: {
                                                                                        break Label_0589;
                                                                                    }
                                                                                    case 3: {
                                                                                        break Label_0655;
                                                                                    }
                                                                                    case 2:
                                                                                    case 7: {
                                                                                        break Label_0721;
                                                                                    }
                                                                                    case 1:
                                                                                    case 6: {
                                                                                        break Label_0892;
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                string = (ByteOrder)t;
                                                                            }
                                                                        }
                                                                        catch (IOException t) {}
                                                                        try {
                                                                            final InputStream inputStream;
                                                                            inputStream.close();
                                                                            return string;
                                                                        }
                                                                        catch (IOException t) {
                                                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                                            return string;
                                                                        }
                                                                    }
                                                                    t = (Throwable)b;
                                                                    string = (ByteOrder)(Object)new double[this.b];
                                                                    length = n;
                                                                    while (true) {
                                                                        t = (Throwable)b;
                                                                        if (length >= this.b) {
                                                                            break;
                                                                        }
                                                                        t = (Throwable)b;
                                                                        string[length] = (double)b.readFloat();
                                                                        ++length;
                                                                    }
                                                                    try {
                                                                        b.close();
                                                                        return string;
                                                                    }
                                                                    catch (IOException t) {
                                                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                                        return string;
                                                                    }
                                                                }
                                                                t = (Throwable)b;
                                                                string = (ByteOrder)(Object)new e[this.b];
                                                                length = n2;
                                                                while (true) {
                                                                    t = (Throwable)b;
                                                                    if (length >= this.b) {
                                                                        break;
                                                                    }
                                                                    t = (Throwable)b;
                                                                    string[length] = new e(b.readInt(), b.readInt());
                                                                    ++length;
                                                                }
                                                                try {
                                                                    b.close();
                                                                    return string;
                                                                }
                                                                catch (IOException t) {
                                                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                                    return string;
                                                                }
                                                            }
                                                            t = (Throwable)b;
                                                            string = (ByteOrder)(Object)new int[this.b];
                                                            length = n3;
                                                            while (true) {
                                                                t = (Throwable)b;
                                                                if (length >= this.b) {
                                                                    break;
                                                                }
                                                                t = (Throwable)b;
                                                                string[length] = b.readInt();
                                                                ++length;
                                                            }
                                                            try {
                                                                b.close();
                                                                return string;
                                                            }
                                                            catch (IOException t) {
                                                                Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                                return string;
                                                            }
                                                        }
                                                        t = (Throwable)b;
                                                        string = (ByteOrder)(Object)new int[this.b];
                                                        length = n4;
                                                        while (true) {
                                                            t = (Throwable)b;
                                                            if (length >= this.b) {
                                                                break;
                                                            }
                                                            t = (Throwable)b;
                                                            string[length] = b.readShort();
                                                            ++length;
                                                        }
                                                        try {
                                                            b.close();
                                                            return string;
                                                        }
                                                        catch (IOException t) {
                                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                            return string;
                                                        }
                                                    }
                                                    t = (Throwable)b;
                                                    string = (ByteOrder)(Object)new e[this.b];
                                                    length = n5;
                                                    while (true) {
                                                        t = (Throwable)b;
                                                        if (length >= this.b) {
                                                            break;
                                                        }
                                                        t = (Throwable)b;
                                                        string[length] = new e(b.b(), b.b());
                                                        ++length;
                                                    }
                                                    try {
                                                        b.close();
                                                        return string;
                                                    }
                                                    catch (IOException t) {
                                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                        return string;
                                                    }
                                                }
                                                t = (Throwable)b;
                                                string = (ByteOrder)(Object)new long[this.b];
                                                length = n6;
                                                while (true) {
                                                    t = (Throwable)b;
                                                    if (length >= this.b) {
                                                        break;
                                                    }
                                                    t = (Throwable)b;
                                                    string[length] = b.b();
                                                    ++length;
                                                }
                                                try {
                                                    b.close();
                                                    return string;
                                                }
                                                catch (IOException t) {
                                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                    return string;
                                                }
                                            }
                                            t = (Throwable)b;
                                            string = (ByteOrder)(Object)new int[this.b];
                                            length = n7;
                                            while (true) {
                                                t = (Throwable)b;
                                                if (length >= this.b) {
                                                    break;
                                                }
                                                t = (Throwable)b;
                                                string[length] = b.readUnsignedShort();
                                                ++length;
                                            }
                                            try {
                                                b.close();
                                                return string;
                                            }
                                            catch (IOException t) {
                                                Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                return string;
                                            }
                                        }
                                        t = (Throwable)b;
                                        length = n8;
                                        if (this.b >= T.a.X.length) {
                                            length = 0;
                                            t = (Throwable)b;
                                            final byte[] x = T.a.X;
                                            t = (Throwable)b;
                                            if (length < x.length) {
                                                t = (Throwable)b;
                                                if (this.d[length] == x[length]) {
                                                    break Label_1080;
                                                }
                                                length = n8;
                                            }
                                            else {
                                                t = (Throwable)b;
                                                length = x.length;
                                            }
                                        }
                                        t = (Throwable)b;
                                        s = new StringBuilder();
                                        t = (Throwable)b;
                                        if (length < this.b) {
                                            t = (Throwable)b;
                                            n8 = this.d[length];
                                            if (n8 != 0) {
                                                if (n8 >= 32) {
                                                    t = (Throwable)b;
                                                    ((StringBuilder)s).append((char)n8);
                                                    break Label_1087;
                                                }
                                                t = (Throwable)b;
                                                ((StringBuilder)s).append('?');
                                                break Label_1087;
                                            }
                                        }
                                        t = (Throwable)b;
                                        string = (ByteOrder)((StringBuilder)s).toString();
                                        try {
                                            b.close();
                                            return string;
                                        }
                                        catch (IOException t) {
                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                            return string;
                                        }
                                    }
                                    t = (Throwable)b;
                                    final byte[] d = this.d;
                                    t = (Throwable)b;
                                    if (d.length == 1) {
                                        length = d[0];
                                        if (length >= 0 && length <= 1) {
                                            t = (Throwable)b;
                                            string = (ByteOrder)new String(new char[] { (char)(length + 48) });
                                            try {
                                                b.close();
                                                return string;
                                            }
                                            catch (IOException t) {
                                                Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                                return string;
                                            }
                                        }
                                    }
                                    t = (Throwable)b;
                                    string = (ByteOrder)new String(d, T.a.o0);
                                    try {
                                        b.close();
                                        return string;
                                    }
                                    catch (IOException t) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", t);
                                        return string;
                                    }
                                }
                                catch (IOException b) {
                                    s = null;
                                }
                                finally {
                                    s = t;
                                    t = (Throwable)b;
                                    break Label_1056;
                                }
                                Log.w("ExifInterface", "IOException occurred during reading a value", (Throwable)b);
                                if (s != null) {
                                    try {
                                        ((InputStream)s).close();
                                        return null;
                                    }
                                    catch (IOException ex2) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)ex2);
                                    }
                                    break;
                                }
                                break;
                            }
                            ++length;
                            continue Label_0798_Outer;
                        }
                        ++length;
                        continue;
                    }
                }
                return null;
            }
            if (s != null) {
                try {
                    ((InputStream)s).close();
                }
                catch (IOException ex3) {
                    Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)ex3);
                }
            }
            throw t;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(T.a.V[this.a]);
            sb.append(", data length:");
            sb.append(this.d.length);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static class d
    {
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        
        public d(final String b, final int a, final int c) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = -1;
        }
        
        public d(final String b, final int a, final int c, final int d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
        }
        
        public boolean a(final int n) {
            final int c = this.c;
            if (c != 7) {
                if (n == 7) {
                    return true;
                }
                if (c != n) {
                    final int d = this.d;
                    return d == n || ((c == 4 || d == 4) && n == 3) || ((c == 9 || d == 9) && n == 8) || ((c == 12 || d == 12) && n == 11);
                }
            }
            return true;
        }
    }
    
    public static class e
    {
        public final long a;
        public final long b;
        
        public e(final long a, final long b) {
            if (b == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = a;
            this.b = b;
        }
        
        public double a() {
            return this.a / (double)this.b;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/");
            sb.append(this.b);
            return sb.toString();
        }
    }
    
    public static class f extends b
    {
        public f(final InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                super.o.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        
        public f(final byte[] array) {
            super(array);
            super.o.mark(Integer.MAX_VALUE);
        }
        
        public void h(long n) {
            final int q = super.q;
            if (q > n) {
                super.q = 0;
                super.o.reset();
            }
            else {
                n -= q;
            }
            ((b)this).e((int)n);
        }
    }
}
