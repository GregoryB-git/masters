/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.content.res.AssetManager$AssetInputStream
 *  android.media.MediaDataSource
 *  android.media.MediaMetadataRetriever
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.system.OsConstants
 *  android.util.Log
 *  java.io.BufferedInputStream
 *  java.io.ByteArrayInputStream
 *  java.io.DataInput
 *  java.io.DataInputStream
 *  java.io.EOFException
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.charset.Charset
 *  java.text.SimpleDateFormat
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.regex.Pattern
 *  java.util.zip.CRC32
 */
package T;

import T.b;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
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
    public AssetManager.AssetInputStream c;
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
        Integer n8 = 3;
        u = Log.isLoggable((String)"ExifInterface", (int)3);
        Integer n9 = 1;
        Integer n10 = 8;
        v = Arrays.asList((Object[])new Integer[]{n9, 6, n8, n10});
        Integer n11 = 2;
        Integer n12 = 7;
        Integer n13 = 5;
        w = Arrays.asList((Object[])new Integer[]{n11, n12, 4, n13});
        x = new int[]{8, 8, 8};
        y = new int[]{4};
        z = new int[]{8};
        A = new byte[]{-1, -40, -1};
        B = new byte[]{102, 116, 121, 112};
        C = new byte[]{109, 105, 102, 49};
        D = new byte[]{104, 101, 105, 99};
        E = new byte[]{79, 76, 89, 77, 80, 0};
        F = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        G = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        H = new byte[]{101, 88, 73, 102};
        I = new byte[]{73, 72, 68, 82};
        J = new byte[]{73, 69, 78, 68};
        K = new byte[]{82, 73, 70, 70};
        L = new byte[]{87, 69, 66, 80};
        M = new byte[]{69, 88, 73, 70};
        N = new byte[]{-99, 1, 42};
        O = "VP8X".getBytes(Charset.defaultCharset());
        P = "VP8L".getBytes(Charset.defaultCharset());
        Q = "VP8 ".getBytes(Charset.defaultCharset());
        R = "ANIM".getBytes(Charset.defaultCharset());
        S = "ANMF".getBytes(Charset.defaultCharset());
        V = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        W = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        X = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        HashMap hashMap = new HashMap("NewSubfileType", 254, 4);
        d[] arrd = new d[]("SubfileType", 255, 4);
        d[] arrd2 = new d[]("ImageWidth", 256, 3, 4);
        d[] arrd3 = new d[]("ImageLength", 257, 3, 4);
        d[] arrd4 = new d[]("BitsPerSample", 258, 3);
        d[] arrd5 = new d[]("Compression", 259, 3);
        d[] arrd6 = new d[]("PhotometricInterpretation", 262, 3);
        d[] arrd7 = new d[]("ImageDescription", 270, 2);
        d[][] arrarrd = new d[][]("Make", 271, 2);
        d d8 = new d("Model", 272, 2);
        d d9 = new d("StripOffsets", 273, 3, 4);
        d d10 = new d("Orientation", 274, 3);
        d d11 = new d("SamplesPerPixel", 277, 3);
        d d12 = new d("RowsPerStrip", 278, 3, 4);
        d d13 = new d("StripByteCounts", 279, 3, 4);
        d d14 = new d("XResolution", 282, 5);
        d d15 = new d("YResolution", 283, 5);
        d d16 = new d("PlanarConfiguration", 284, 3);
        d d17 = new d("ResolutionUnit", 296, 3);
        d d18 = new d("TransferFunction", 301, 3);
        d d19 = new d("Software", 305, 2);
        d d20 = new d("DateTime", 306, 2);
        d d21 = new d("Artist", 315, 2);
        d d22 = new d("WhitePoint", 318, 5);
        d d23 = new d("PrimaryChromaticities", 319, 5);
        d d24 = new d("SubIFDPointer", 330, 4);
        d d25 = new d("JPEGInterchangeFormat", 513, 4);
        d d26 = new d("JPEGInterchangeFormatLength", 514, 4);
        d d27 = new d("YCbCrCoefficients", 529, 5);
        d d28 = new d("YCbCrSubSampling", 530, 3);
        d d29 = new d("YCbCrPositioning", 531, 3);
        d d30 = new d("ReferenceBlackWhite", 532, 5);
        d d31 = new d("Copyright", 33432, 2);
        d d32 = new d("ExifIFDPointer", 34665, 4);
        d d33 = new d("GPSInfoIFDPointer", 34853, 4);
        d d34 = new d("SensorTopBorder", 4, 4);
        d d35 = new d("SensorLeftBorder", 5, 4);
        d d36 = new d("SensorBottomBorder", 6, 4);
        d d37 = new d("SensorRightBorder", 7, 4);
        d d38 = new d("ISO", 23, 3);
        d d39 = new d("JpgFromRaw", 46, 7);
        d d40 = new d("Xmp", 700, 1);
        HashMap hashMap2 = new HashMap[]{hashMap, arrd, arrd2, arrd3, arrd4, arrd5, arrd6, arrd7, arrarrd, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40};
        Y = hashMap2;
        arrd = new d("ExposureTime", 33434, 5);
        arrd2 = new d("FNumber", 33437, 5);
        arrd3 = new d("ExposureProgram", 34850, 3);
        arrd4 = new d("SpectralSensitivity", 34852, 2);
        arrd5 = new d("PhotographicSensitivity", 34855, 3);
        arrd6 = new d("OECF", 34856, 7);
        arrd7 = new d("SensitivityType", 34864, 3);
        arrarrd = new d("StandardOutputSensitivity", 34865, 4);
        d8 = new d("RecommendedExposureIndex", 34866, 4);
        d9 = new d("ISOSpeed", 34867, 4);
        d10 = new d("ISOSpeedLatitudeyyy", 34868, 4);
        d11 = new d("ISOSpeedLatitudezzz", 34869, 4);
        d12 = new d("ExifVersion", 36864, 2);
        d13 = new d("DateTimeOriginal", 36867, 2);
        d14 = new d("DateTimeDigitized", 36868, 2);
        d15 = new d("OffsetTime", 36880, 2);
        d16 = new d("OffsetTimeOriginal", 36881, 2);
        d17 = new d("OffsetTimeDigitized", 36882, 2);
        d18 = new d("ComponentsConfiguration", 37121, 7);
        d19 = new d("CompressedBitsPerPixel", 37122, 5);
        d20 = new d("ShutterSpeedValue", 37377, 10);
        d21 = new d("ApertureValue", 37378, 5);
        d22 = new d("BrightnessValue", 37379, 10);
        d23 = new d("ExposureBiasValue", 37380, 10);
        d24 = new d("MaxApertureValue", 37381, 5);
        d25 = new d("SubjectDistance", 37382, 5);
        d26 = new d("MeteringMode", 37383, 3);
        d27 = new d("LightSource", 37384, 3);
        d28 = new d("Flash", 37385, 3);
        d29 = new d("FocalLength", 37386, 5);
        d30 = new d("SubjectArea", 37396, 3);
        d31 = new d("MakerNote", 37500, 7);
        d32 = new d("UserComment", 37510, 7);
        d33 = new d("SubSecTime", 37520, 2);
        d34 = new d("SubSecTimeOriginal", 37521, 2);
        d35 = new d("SubSecTimeDigitized", 37522, 2);
        d36 = new d("FlashpixVersion", 40960, 7);
        d37 = new d("ColorSpace", 40961, 3);
        d38 = new d("PixelXDimension", 40962, 3, 4);
        d39 = new d("PixelYDimension", 40963, 3, 4);
        d40 = new d("RelatedSoundFile", 40964, 2);
        d d41 = new d("InteroperabilityIFDPointer", 40965, 4);
        d d42 = new d("FlashEnergy", 41483, 5);
        d d43 = new d("SpatialFrequencyResponse", 41484, 7);
        d d44 = new d("FocalPlaneXResolution", 41486, 5);
        d d45 = new d("FocalPlaneYResolution", 41487, 5);
        d d46 = new d("FocalPlaneResolutionUnit", 41488, 3);
        d d47 = new d("SubjectLocation", 41492, 3);
        d d48 = new d("ExposureIndex", 41493, 5);
        d d49 = new d("SensingMethod", 41495, 3);
        d d50 = new d("FileSource", 41728, 7);
        d d51 = new d("SceneType", 41729, 7);
        d d52 = new d("CFAPattern", 41730, 7);
        d d53 = new d("CustomRendered", 41985, 3);
        d d54 = new d("ExposureMode", 41986, 3);
        d d55 = new d("WhiteBalance", 41987, 3);
        d d56 = new d("DigitalZoomRatio", 41988, 5);
        d d57 = new d("FocalLengthIn35mmFilm", 41989, 3);
        d d58 = new d("SceneCaptureType", 41990, 3);
        d d59 = new d("GainControl", 41991, 3);
        d d60 = new d("Contrast", 41992, 3);
        d d61 = new d("Saturation", 41993, 3);
        d d62 = new d("Sharpness", 41994, 3);
        d d63 = new d("DeviceSettingDescription", 41995, 7);
        d d64 = new d("SubjectDistanceRange", 41996, 3);
        d d65 = new d("ImageUniqueID", 42016, 2);
        d d66 = new d("CameraOwnerName", 42032, 2);
        d d67 = new d("BodySerialNumber", 42033, 2);
        d d68 = new d("LensSpecification", 42034, 5);
        d d69 = new d("LensMake", 42035, 2);
        d d70 = new d("LensModel", 42036, 2);
        d d71 = new d("Gamma", 42240, 5);
        d d72 = new d("DNGVersion", 50706, 1);
        d d73 = new d("DefaultCropSize", 50720, 3, 4);
        hashMap = new HashMap[]{arrd, arrd2, arrd3, arrd4, arrd5, arrd6, arrd7, arrarrd, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42, d43, d44, d45, d46, d47, d48, d49, d50, d51, d52, d53, d54, d55, d56, d57, d58, d59, d60, d61, d62, d63, d64, d65, d66, d67, d68, d69, d70, d71, d72, d73};
        Z = hashMap;
        arrd2 = new d("GPSVersionID", 0, 1);
        arrd3 = new d("GPSLatitudeRef", 1, 2);
        arrd4 = new d("GPSLatitude", 2, 5, 10);
        arrd5 = new d("GPSLongitudeRef", 3, 2);
        arrd6 = new d("GPSLongitude", 4, 5, 10);
        arrd7 = new d("GPSAltitudeRef", 5, 1);
        arrarrd = new d("GPSAltitude", 6, 5);
        d8 = new d("GPSTimeStamp", 7, 5);
        d9 = new d("GPSSatellites", 8, 2);
        d10 = new d("GPSStatus", 9, 2);
        d11 = new d("GPSMeasureMode", 10, 2);
        d12 = new d("GPSDOP", 11, 5);
        d13 = new d("GPSSpeedRef", 12, 2);
        d14 = new d("GPSSpeed", 13, 5);
        d15 = new d("GPSTrackRef", 14, 2);
        d16 = new d("GPSTrack", 15, 5);
        d17 = new d("GPSImgDirectionRef", 16, 2);
        d18 = new d("GPSImgDirection", 17, 5);
        d19 = new d("GPSMapDatum", 18, 2);
        d20 = new d("GPSDestLatitudeRef", 19, 2);
        d21 = new d("GPSDestLatitude", 20, 5);
        d22 = new d("GPSDestLongitudeRef", 21, 2);
        d23 = new d("GPSDestLongitude", 22, 5);
        d24 = new d("GPSDestBearingRef", 23, 2);
        d25 = new d("GPSDestBearing", 24, 5);
        d26 = new d("GPSDestDistanceRef", 25, 2);
        d27 = new d("GPSDestDistance", 26, 5);
        d28 = new d("GPSProcessingMethod", 27, 7);
        d29 = new d("GPSAreaInformation", 28, 7);
        d30 = new d("GPSDateStamp", 29, 2);
        d31 = new d("GPSDifferential", 30, 3);
        d32 = new d("GPSHPositioningError", 31, 5);
        arrd = new d[]{arrd2, arrd3, arrd4, arrd5, arrd6, arrd7, arrarrd, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32};
        a0 = arrd;
        arrd3 = new d("InteroperabilityIndex", 1, 2);
        arrd2 = new d[]{arrd3};
        b0 = arrd2;
        arrd4 = new d("NewSubfileType", 254, 4);
        arrd5 = new d("SubfileType", 255, 4);
        arrd6 = new d("ThumbnailImageWidth", 256, 3, 4);
        arrd7 = new d("ThumbnailImageLength", 257, 3, 4);
        arrarrd = new d("BitsPerSample", 258, 3);
        d8 = new d("Compression", 259, 3);
        d9 = new d("PhotometricInterpretation", 262, 3);
        d10 = new d("ImageDescription", 270, 2);
        d11 = new d("Make", 271, 2);
        d12 = new d("Model", 272, 2);
        d13 = new d("StripOffsets", 273, 3, 4);
        d14 = new d("ThumbnailOrientation", 274, 3);
        d15 = new d("SamplesPerPixel", 277, 3);
        d16 = new d("RowsPerStrip", 278, 3, 4);
        d17 = new d("StripByteCounts", 279, 3, 4);
        d18 = new d("XResolution", 282, 5);
        d19 = new d("YResolution", 283, 5);
        d20 = new d("PlanarConfiguration", 284, 3);
        d21 = new d("ResolutionUnit", 296, 3);
        d22 = new d("TransferFunction", 301, 3);
        d23 = new d("Software", 305, 2);
        d24 = new d("DateTime", 306, 2);
        d25 = new d("Artist", 315, 2);
        d26 = new d("WhitePoint", 318, 5);
        d27 = new d("PrimaryChromaticities", 319, 5);
        d28 = new d("SubIFDPointer", 330, 4);
        d29 = new d("JPEGInterchangeFormat", 513, 4);
        d30 = new d("JPEGInterchangeFormatLength", 514, 4);
        d31 = new d("YCbCrCoefficients", 529, 5);
        d32 = new d("YCbCrSubSampling", 530, 3);
        d33 = new d("YCbCrPositioning", 531, 3);
        d34 = new d("ReferenceBlackWhite", 532, 5);
        d35 = new d("Copyright", 33432, 2);
        d36 = new d("ExifIFDPointer", 34665, 4);
        d37 = new d("GPSInfoIFDPointer", 34853, 4);
        d38 = new d("DNGVersion", 50706, 1);
        d39 = new d("DefaultCropSize", 50720, 3, 4);
        arrd3 = new d[]{arrd4, arrd5, arrd6, arrd7, arrarrd, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39};
        c0 = arrd3;
        d0 = new d("StripOffsets", 273, 3);
        arrd5 = new d("ThumbnailImage", 256, 7);
        arrd6 = new d("CameraSettingsIFDPointer", 8224, 4);
        arrd7 = new d("ImageProcessingIFDPointer", 8256, 4);
        arrd4 = new d[]{arrd5, arrd6, arrd7};
        e0 = arrd4;
        arrd6 = new d("PreviewImageStart", 257, 4);
        arrd7 = new d("PreviewImageLength", 258, 4);
        arrd5 = new d[]{arrd6, arrd7};
        f0 = arrd5;
        arrd7 = new d("AspectFrame", 4371, 3);
        arrd6 = new d[]{arrd7};
        g0 = arrd6;
        arrarrd = new d("ColorSpace", 55, 3);
        arrd7 = new d[]{arrarrd};
        h0 = arrd7;
        arrarrd = new d[][]{hashMap2, hashMap, arrd, arrd2, arrd3, hashMap2, arrd4, arrd5, arrd6, arrd7};
        i0 = arrarrd;
        j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        k0 = new HashMap[arrarrd.length];
        l0 = new HashMap[arrarrd.length];
        m0 = new HashSet((Collection)Arrays.asList((Object[])new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        n0 = new HashMap();
        hashMap2 = Charset.forName((String)"US-ASCII");
        o0 = hashMap2;
        p0 = "Exif\u0000\u0000".getBytes((Charset)hashMap2);
        q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes((Charset)hashMap2);
        hashMap = Locale.US;
        hashMap2 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", (Locale)hashMap);
        T = hashMap2;
        hashMap2.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        hashMap2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", (Locale)hashMap);
        U = hashMap2;
        hashMap2.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        for (int i8 = 0; i8 < (hashMap2 = i0).length; ++i8) {
            a.k0[i8] = new HashMap();
            a.l0[i8] = new HashMap();
            hashMap2 = hashMap2[i8];
            int n14 = hashMap2.length;
            for (int i9 = 0; i9 < n14; ++i9) {
                hashMap = hashMap2[i9];
                k0[i8].put((Object)hashMap.a, (Object)hashMap);
                l0[i8].put((Object)hashMap.b, (Object)hashMap);
            }
        }
        hashMap2 = n0;
        hashMap = j0;
        hashMap2.put((Object)hashMap[0].a, (Object)n13);
        hashMap2.put((Object)hashMap[1].a, (Object)n9);
        hashMap2.put((Object)hashMap[2].a, (Object)n11);
        hashMap2.put((Object)hashMap[3].a, (Object)n8);
        hashMap2.put((Object)hashMap[4].a, (Object)n12);
        hashMap2.put((Object)hashMap[5].a, (Object)n10);
        r0 = Pattern.compile((String)".*[1-9].*");
        s0 = Pattern.compile((String)"^(\\d{2}):(\\d{2}):(\\d{2})$");
        t0 = Pattern.compile((String)"^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        u0 = Pattern.compile((String)"^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public a(InputStream var1_1, int var2_2) {
        block4 : {
            block5 : {
                block3 : {
                    super();
                    var3_3 = a.i0;
                    this.f = new HashMap[var3_3.length];
                    this.g = new HashSet(var3_3.length);
                    this.h = ByteOrder.BIG_ENDIAN;
                    if (var1_1 == null) throw new NullPointerException("inputStream cannot be null");
                    this.a = null;
                    if (var2_2 != 1) break block3;
                    if (!a.r((BufferedInputStream)(var1_1 = new BufferedInputStream(var1_1, a.p0.length)))) {
                        Log.w((String)"ExifInterface", (String)"Given data does not follow the structure of an Exif-only data.");
                        return;
                    }
                    this.e = true;
                    this.c = null;
                    this.b = null;
                    break block4;
                }
                if (!(var1_1 instanceof AssetManager.AssetInputStream)) break block5;
                this.c = (AssetManager.AssetInputStream)var1_1;
                ** GOTO lbl26
            }
            if (var1_1 instanceof FileInputStream && a.y((var3_3 = (FileInputStream)var1_1).getFD())) {
                this.c = null;
                this.b = var3_3.getFD();
            } else {
                this.c = null;
lbl26: // 2 sources:
                this.b = null;
            }
        }
        this.C(var1_1);
    }

    public static boolean L(int n8) {
        if (n8 != 4 && n8 != 9 && n8 != 13 && n8 != 14) {
            return true;
        }
        return false;
    }

    public static boolean r(BufferedInputStream arrby) {
        byte[] arrby2 = p0;
        arrby.mark(arrby2.length);
        arrby2 = new byte[arrby2.length];
        arrby.read(arrby2);
        arrby.reset();
        for (int i8 = 0; i8 < (arrby = p0).length; ++i8) {
            if (arrby2[i8] == arrby[i8]) continue;
            return false;
        }
        return true;
    }

    public static boolean t(byte[] arrby) {
        byte[] arrby2;
        for (int i8 = 0; i8 < (arrby2 = A).length; ++i8) {
            if (arrby[i8] == arrby2[i8]) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean y(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        }
        catch (Exception exception) {}
        if (u) {
            Log.d((String)"ExifInterface", (String)"The file descriptor for the given input is not seekable");
        }
        return false;
    }

    public final boolean A(HashMap object) {
        c c8 = (c)object.get((Object)"ImageLength");
        object = (c)object.get((Object)"ImageWidth");
        if (c8 != null && object != null) {
            int n8 = c8.i(this.h);
            int n9 = object.i(this.h);
            if (n8 <= 512 && n9 <= 512) {
                return true;
            }
        }
        return false;
    }

    public final boolean B(byte[] arrby) {
        int n8;
        byte[] arrby2;
        for (n8 = 0; n8 < (arrby2 = K).length; ++n8) {
            if (arrby[n8] == arrby2[n8]) continue;
            return false;
        }
        for (n8 = 0; n8 < (arrby2 = L).length; ++n8) {
            if (arrby[K.length + n8 + 4] == arrby2[n8]) continue;
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void C(InputStream var1_1) {
        block21 : {
            block22 : {
                block26 : {
                    block25 : {
                        block20 : {
                            block24 : {
                                if (var1_1 == null) throw new NullPointerException("inputstream shouldn't be null");
                                for (var2_5 = 0; var2_5 < a.i0.length; ++var2_5) {
                                    this.f[var2_5] = new HashMap();
                                }
                                var4_6 = var1_1;
                                if (!this.e) {
                                    var4_6 = new BufferedInputStream(var1_1, 5000);
                                    this.d = this.g((BufferedInputStream)var4_6);
                                }
                                if (!a.L(this.d)) ** GOTO lbl36
                                var1_1 = new f(var4_6);
                                if (!this.e) break block24;
                                this.n((f)var1_1);
                                ** GOTO lbl32
                            }
                            var2_5 = this.d;
                            if (var2_5 != 12) break block20;
                            this.e((f)var1_1);
                            ** GOTO lbl32
                        }
                        if (var2_5 != 7) break block25;
                        this.h((f)var1_1);
                        ** GOTO lbl32
                    }
                    if (var2_5 != 10) ** GOTO lbl31
                    this.m((f)var1_1);
                    break block26;
lbl31: // 1 sources:
                    this.k((f)var1_1);
                }
                var1_1.h(this.p);
                this.K((b)var1_1);
                break block21;
lbl36: // 1 sources:
                var1_1 = new b(var4_6);
                var2_5 = this.d;
                if (var2_5 == 4) {
                    this.f((b)var1_1, 0, 0);
                    break block21;
                }
                if (var2_5 != 13) break block22;
                try {
                    this.i((b)var1_1);
                    break block21;
                }
                catch (UnsupportedOperationException var1_3) {
                    ** GOTO lbl59
                }
                catch (IOException var1_4) {
                    ** continue;
                }
            }
            if (var2_5 == 9) {
                this.j((b)var1_1);
            } else if (var2_5 == 14) {
                this.o((b)var1_1);
            }
        }
        this.a();
        if (a.u == false) return;
lbl56: // 2 sources:
        do {
            this.E();
            return;
            break;
        } while (true);
lbl59: // 2 sources:
        do {
            block23 : {
                try {
                    var3_7 = a.u;
                    if (!var3_7) break block23;
                    Log.w((String)"ExifInterface", (String)"Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", (Throwable)var1_1);
                }
                catch (Throwable var1_2) {}
            }
            this.a();
            if (var3_7 == false) return;
            ** continue;
            this.a();
            if (a.u == false) throw var1_2;
            this.E();
            throw var1_2;
            break;
        } while (true);
    }

    public final void D(b b8) {
        ByteOrder byteOrder;
        this.h = byteOrder = this.F(b8);
        b8.c(byteOrder);
        int n8 = b8.readUnsignedShort();
        int n9 = this.d;
        if (n9 != 7 && n9 != 10 && n8 != 42) {
            b8 = new StringBuilder();
            b8.append("Invalid start code: ");
            b8.append(Integer.toHexString((int)n8));
            throw new IOException(b8.toString());
        }
        n8 = b8.readInt();
        if (n8 >= 8) {
            if ((n8 -= 8) > 0) {
                b8.e(n8);
            }
            return;
        }
        b8 = new StringBuilder();
        b8.append("Invalid first Ifd offset: ");
        b8.append(n8);
        throw new IOException(b8.toString());
    }

    public final void E() {
        for (int i8 = 0; i8 < this.f.length; ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The size of tag group[");
            stringBuilder.append(i8);
            stringBuilder.append("]: ");
            stringBuilder.append(this.f[i8].size());
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
            for (Map.Entry entry : this.f[i8].entrySet()) {
                c c8 = (c)entry.getValue();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("tagName: ");
                stringBuilder2.append((String)entry.getKey());
                stringBuilder2.append(", tagType: ");
                stringBuilder2.append(c8.toString());
                stringBuilder2.append(", tagValue: '");
                stringBuilder2.append(c8.j(this.h));
                stringBuilder2.append("'");
                Log.d((String)"ExifInterface", (String)stringBuilder2.toString());
            }
        }
    }

    public final ByteOrder F(b b8) {
        short s8 = b8.readShort();
        if (s8 != 18761) {
            if (s8 == 19789) {
                if (u) {
                    Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            b8 = new StringBuilder();
            b8.append("Invalid byte order: ");
            b8.append(Integer.toHexString((int)s8));
            throw new IOException(b8.toString());
        }
        if (u) {
            Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void G(byte[] object, int n8) {
        object = new f((byte[])object);
        this.D((b)((Object)object));
        this.H((f)((Object)object), n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void H(f f8, int n8) {
        boolean bl;
        long l8;
        Object object;
        this.g.add((Object)f8.q);
        short s8 = f8.readShort();
        if (u) {
            object = new StringBuilder();
            object.append("numberOfDirectoryEntry: ");
            object.append((int)s8);
            Log.d((String)"ExifInterface", (String)object.toString());
        }
        if (s8 <= 0) {
            return;
        }
        short s9 = 0;
        do {
            block58 : {
                long l9;
                block46 : {
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    block47 : {
                        block56 : {
                            block57 : {
                                block54 : {
                                    d d8;
                                    block55 : {
                                        block52 : {
                                            block53 : {
                                                block48 : {
                                                    block49 : {
                                                        block50 : {
                                                            block51 : {
                                                                int n13;
                                                                Object object2;
                                                                int n14;
                                                                block44 : {
                                                                    block45 : {
                                                                        block39 : {
                                                                            block41 : {
                                                                                long l10;
                                                                                block43 : {
                                                                                    block42 : {
                                                                                        block40 : {
                                                                                            block38 : {
                                                                                                n13 = n8;
                                                                                                if (s9 >= s8) break;
                                                                                                n14 = f8.readUnsignedShort();
                                                                                                n12 = f8.readUnsignedShort();
                                                                                                n11 = f8.readInt();
                                                                                                l9 = (long)f8.a() + 4L;
                                                                                                d8 = (d)k0[n13].get((Object)n14);
                                                                                                bl = u;
                                                                                                if (bl) {
                                                                                                    object = d8 != null ? d8.b : null;
                                                                                                    Log.d((String)"ExifInterface", (String)String.format((String)"ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", (Object[])new Object[]{n8, n14, object, n12, n11}));
                                                                                                }
                                                                                                if (d8 != null) break block38;
                                                                                                if (!bl) break block39;
                                                                                                object = new StringBuilder();
                                                                                                object.append("Skip the tag entry since tag number is not defined: ");
                                                                                                object.append(n14);
                                                                                                object = object.toString();
                                                                                                break block40;
                                                                                            }
                                                                                            if (n12 <= 0 || n12 >= (object = W).length) break block41;
                                                                                            if (d8.a(n12)) break block42;
                                                                                            if (!bl) break block39;
                                                                                            object = new StringBuilder();
                                                                                            object.append("Skip the tag entry since data format (");
                                                                                            object.append(V[n12]);
                                                                                            object.append(") is unexpected for tag: ");
                                                                                            object.append(d8.b);
                                                                                            object = object.toString();
                                                                                        }
                                                                                        Log.d((String)"ExifInterface", (String)object);
                                                                                        break block39;
                                                                                    }
                                                                                    n9 = n12;
                                                                                    if (n12 == 7) {
                                                                                        n9 = d8.c;
                                                                                    }
                                                                                    if ((l10 = (long)object[n9] * (l8 = (long)n11)) < 0L || l10 > Integer.MAX_VALUE) break block43;
                                                                                    n10 = 1;
                                                                                    l8 = l10;
                                                                                    break block44;
                                                                                }
                                                                                l8 = l10;
                                                                                n12 = n9;
                                                                                if (bl) {
                                                                                    object = new StringBuilder();
                                                                                    object.append("Skip the tag entry since the number of components is invalid: ");
                                                                                    object.append(n11);
                                                                                    Log.d((String)"ExifInterface", (String)object.toString());
                                                                                    n12 = n9;
                                                                                    l8 = l10;
                                                                                }
                                                                                break block45;
                                                                            }
                                                                            if (bl) {
                                                                                object = new StringBuilder();
                                                                                object.append("Skip the tag entry since data format is invalid: ");
                                                                                object.append(n12);
                                                                                Log.d((String)"ExifInterface", (String)object.toString());
                                                                            }
                                                                        }
                                                                        l8 = 0L;
                                                                    }
                                                                    n10 = 0;
                                                                    n9 = n12;
                                                                }
                                                                if (n10 == 0) break block46;
                                                                if (l8 > 4L) {
                                                                    n12 = f8.readInt();
                                                                    if (bl) {
                                                                        object = new StringBuilder();
                                                                        object.append("seek to data offset: ");
                                                                        object.append(n12);
                                                                        Log.d((String)"ExifInterface", (String)object.toString());
                                                                    }
                                                                    if (this.d == 7) {
                                                                        if ("MakerNote".equals((Object)d8.b)) {
                                                                            this.q = n12;
                                                                        } else if (n13 == 6 && "ThumbnailImage".equals((Object)d8.b)) {
                                                                            this.r = n12;
                                                                            this.s = n11;
                                                                            object = c.f(6, this.h);
                                                                            object2 = c.b(this.r, this.h);
                                                                            c c8 = c.b(this.s, this.h);
                                                                            this.f[4].put((Object)"Compression", object);
                                                                            this.f[4].put((Object)"JPEGInterchangeFormat", object2);
                                                                            this.f[4].put((Object)"JPEGInterchangeFormatLength", (Object)c8);
                                                                        }
                                                                    }
                                                                    f8.h(n12);
                                                                }
                                                                object = (Integer)n0.get((Object)n14);
                                                                if (bl) {
                                                                    object2 = new StringBuilder();
                                                                    object2.append("nextIfdType: ");
                                                                    object2.append(object);
                                                                    object2.append(" byteCount: ");
                                                                    object2.append(l8);
                                                                    Log.d((String)"ExifInterface", (String)object2.toString());
                                                                }
                                                                if (object == null) break block47;
                                                                if (n9 == 3) break block48;
                                                                if (n9 == 4) break block49;
                                                                if (n9 == 8) break block50;
                                                                if (n9 == 9 || n9 == 13) break block51;
                                                                l8 = -1L;
                                                                break block52;
                                                            }
                                                            n9 = f8.readInt();
                                                            break block53;
                                                        }
                                                        n9 = f8.readShort();
                                                        break block53;
                                                    }
                                                    l8 = f8.b();
                                                    break block52;
                                                }
                                                n9 = f8.readUnsignedShort();
                                            }
                                            l8 = n9;
                                        }
                                        if (bl) {
                                            Log.d((String)"ExifInterface", (String)String.format((String)"Offset: %d, tagName: %s", (Object[])new Object[]{l8, d8.b}));
                                        }
                                        if (l8 <= 0L) break block54;
                                        if (this.g.contains((Object)((int)l8))) break block55;
                                        f8.h(l8);
                                        this.H(f8, object.intValue());
                                        break block56;
                                    }
                                    if (!bl) break block56;
                                    d8 = new StringBuilder();
                                    d8.append("Skip jump into the IFD since it has already been read: IfdType ");
                                    d8.append(object);
                                    d8.append(" (at ");
                                    d8.append(l8);
                                    d8.append(")");
                                    object = d8.toString();
                                    break block57;
                                }
                                if (!bl) break block56;
                                object = new StringBuilder();
                                object.append("Skip jump into the IFD since its offset is invalid: ");
                                object.append(l8);
                                object = object.toString();
                            }
                            Log.d((String)"ExifInterface", (String)object);
                        }
                        f8.h(l9);
                        break block58;
                    }
                    n12 = f8.a();
                    n10 = this.p;
                    object = new byte[(int)l8];
                    f8.readFully((byte[])object);
                    object = new c(n9, n11, n12 + n10, (byte[])object);
                    this.f[n8].put((Object)d8.b, object);
                    if ("DNGVersion".equals((Object)d8.b)) {
                        this.d = 3;
                    }
                    if (("Make".equals((Object)d8.b) || "Model".equals((Object)d8.b)) && object.j(this.h).contains((CharSequence)"PENTAX") || "Compression".equals((Object)d8.b) && object.i(this.h) == 65535) {
                        this.d = 8;
                    }
                    if ((long)f8.a() == l9) break block58;
                }
                f8.h(l9);
            }
            s9 = (short)(s9 + 1);
        } while (true);
        n8 = f8.readInt();
        bl = u;
        if (bl) {
            Log.d((String)"ExifInterface", (String)String.format((String)"nextIfdOffset: %d", (Object[])new Object[]{n8}));
        }
        if ((l8 = (long)n8) > 0L) {
            if (!this.g.contains((Object)n8)) {
                f8.h(l8);
                if (this.f[4].isEmpty()) {
                    this.H(f8, 4);
                    return;
                }
                if (!this.f[5].isEmpty()) return;
                {
                    this.H(f8, 5);
                    return;
                }
            }
            if (!bl) return;
            f8 = new StringBuilder();
            object = "Stop reading file since re-reading an IFD may cause an infinite loop: ";
        } else {
            if (!bl) return;
            f8 = new StringBuilder();
            object = "Stop reading file since a wrong offset may cause an infinite loop: ";
        }
        f8.append((String)object);
        f8.append(n8);
        Log.d((String)"ExifInterface", (String)f8.toString());
    }

    public final void I(int n8, String string2, String string3) {
        if (!this.f[n8].isEmpty() && this.f[n8].get((Object)string2) != null) {
            HashMap hashMap = this.f[n8];
            hashMap.put((Object)string3, hashMap.get((Object)string2));
            this.f[n8].remove((Object)string2);
        }
    }

    public final void J(f f8, int n8) {
        byte[] arrby = (byte[])this.f[n8].get((Object)"ImageLength");
        c c8 = (c)this.f[n8].get((Object)"ImageWidth");
        if (arrby == null || c8 == null) {
            arrby = (c)this.f[n8].get((Object)"JPEGInterchangeFormat");
            c8 = (c)this.f[n8].get((Object)"JPEGInterchangeFormatLength");
            if (arrby != null && c8 != null) {
                int n9 = arrby.i(this.h);
                int n10 = arrby.i(this.h);
                f8.h(n9);
                arrby = new byte[n10];
                f8.read(arrby);
                this.f(new b(arrby), n9, n8);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void K(b var1_1) {
        var3_2 = this.f[4];
        var4_3 = (c)var3_2.get((Object)"Compression");
        if (var4_3 == null) ** GOTO lbl13
        this.o = var2_4 = var4_3.i(this.h);
        if (var2_4 != 1) {
            if (var2_4 != 6) {
                if (var2_4 != 7) {
                    return;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000: // 3 sources:
        {
            if (this.z(var3_2) == false) return;
            this.q(var1_1, var3_2);
            return;
lbl13: // 1 sources:
            this.o = 6;
        }
        this.p(var1_1, var3_2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void M(int n8, int n9) {
        if (!this.f[n8].isEmpty() && !this.f[n9].isEmpty()) {
            HashMap[] arrhashMap = (c)this.f[n8].get((Object)"ImageLength");
            c c8 = (c)this.f[n8].get((Object)"ImageWidth");
            c c9 = (c)this.f[n9].get((Object)"ImageLength");
            c c10 = (c)this.f[n9].get((Object)"ImageWidth");
            if (arrhashMap != null && c8 != null) {
                if (c9 != null && c10 != null) {
                    int n10 = arrhashMap.i(this.h);
                    int n11 = c8.i(this.h);
                    int n12 = c9.i(this.h);
                    int n13 = c10.i(this.h);
                    if (n10 >= n12 || n11 >= n13) return;
                    {
                        arrhashMap = this.f;
                        c8 = arrhashMap[n8];
                        arrhashMap[n8] = arrhashMap[n9];
                        arrhashMap[n9] = c8;
                        return;
                    }
                }
                if (!u) return;
                arrhashMap = "Second image does not contain valid size information";
            } else {
                if (!u) return;
                arrhashMap = "First image does not contain valid size information";
            }
            Log.d((String)"ExifInterface", (String)arrhashMap);
            return;
        }
        if (!u) return;
        {
            Log.d((String)"ExifInterface", (String)"Cannot perform swap since only one image data exists");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void N(f object, int n8) {
        c c8;
        c c9;
        Object[] arrobject;
        c c10;
        c c11;
        block7 : {
            block11 : {
                block12 : {
                    block10 : {
                        block8 : {
                            block9 : {
                                c9 = (c)this.f[n8].get((Object)"DefaultCropSize");
                                arrobject = (Object[])this.f[n8].get((Object)"SensorTopBorder");
                                c8 = (c)this.f[n8].get((Object)"SensorLeftBorder");
                                c10 = (c)this.f[n8].get((Object)"SensorBottomBorder");
                                c11 = (c)this.f[n8].get((Object)"SensorRightBorder");
                                if (c9 == null) break block7;
                                if (c9.a != 5) break block8;
                                arrobject = (e[])c9.k(this.h);
                                if (arrobject == null || arrobject.length != 2) break block9;
                                object = c.d(arrobject[0], this.h);
                                c9 = c.d((e)arrobject[1], this.h);
                                break block10;
                            }
                            c9 = new StringBuilder();
                            c9.append("Invalid crop size values. cropSize=");
                            object = Arrays.toString((Object[])arrobject);
                            break block11;
                        }
                        arrobject = (int[])c9.k(this.h);
                        if (arrobject == null || arrobject.length != 2) break block12;
                        object = c.f((int)arrobject[0], this.h);
                        c9 = c.f((int)arrobject[1], this.h);
                    }
                    this.f[n8].put((Object)"ImageWidth", object);
                    this.f[n8].put((Object)"ImageLength", (Object)c9);
                    return;
                }
                c9 = new StringBuilder();
                c9.append("Invalid crop size values. cropSize=");
                object = Arrays.toString((int[])arrobject);
            }
            c9.append((String)object);
            Log.w((String)"ExifInterface", (String)c9.toString());
            return;
        }
        if (arrobject != null && c8 != null && c10 != null && c11 != null) {
            int n9 = arrobject.i(this.h);
            int n10 = c10.i(this.h);
            int n11 = c11.i(this.h);
            int n12 = c8.i(this.h);
            if (n10 <= n9 || n11 <= n12) return;
            {
                object = c.f(n10 - n9, this.h);
                c9 = c.f(n11 - n12, this.h);
                this.f[n8].put((Object)"ImageLength", object);
                this.f[n8].put((Object)"ImageWidth", (Object)c9);
                return;
            }
        } else {
            this.J((f)((Object)object), n8);
        }
    }

    public final void O() {
        this.M(0, 5);
        this.M(0, 4);
        this.M(5, 4);
        HashMap[] arrhashMap = (HashMap[])this.f[1].get((Object)"PixelXDimension");
        c c8 = (c)this.f[1].get((Object)"PixelYDimension");
        if (arrhashMap != null && c8 != null) {
            this.f[0].put((Object)"ImageWidth", (Object)arrhashMap);
            this.f[0].put((Object)"ImageLength", (Object)c8);
        }
        if (this.f[4].isEmpty() && this.A(this.f[5])) {
            arrhashMap = this.f;
            arrhashMap[4] = arrhashMap[5];
            arrhashMap[5] = new HashMap();
        }
        if (!this.A(this.f[4])) {
            Log.d((String)"ExifInterface", (String)"No image meets the size requirements of a thumbnail image.");
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
        String string2 = this.b("DateTimeOriginal");
        if (string2 != null && this.b("DateTime") == null) {
            this.f[0].put((Object)"DateTime", (Object)c.a(string2));
        }
        if (this.b("ImageWidth") == null) {
            this.f[0].put((Object)"ImageWidth", (Object)c.b(0L, this.h));
        }
        if (this.b("ImageLength") == null) {
            this.f[0].put((Object)"ImageLength", (Object)c.b(0L, this.h));
        }
        if (this.b("Orientation") == null) {
            this.f[0].put((Object)"Orientation", (Object)c.b(0L, this.h));
        }
        if (this.b("LightSource") == null) {
            this.f[1].put((Object)"LightSource", (Object)c.b(0L, this.h));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String b(String object) {
        if (object == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        Object object2 = this.d((String)object);
        if (object2 == null) {
            return null;
        }
        if (!m0.contains(object)) {
            return object2.j(this.h);
        }
        if (object.equals((Object)"GPSTimeStamp")) {
            int n8 = object2.a;
            if (n8 != 5 && n8 != 10) {
                object = new StringBuilder();
                object.append("GPS Timestamp format is not rational. format=");
                object.append(object2.a);
                object = object.toString();
            } else {
                object = (StringBuilder)object2.k(this.h);
                if (object != null && object.length == 3) {
                    object2 = object[0];
                    n8 = (int)((float)object2.a / (float)object2.b);
                    object2 = object[1];
                    int n9 = (int)((float)object2.a / (float)object2.b);
                    object = object[2];
                    return String.format((String)"%02d:%02d:%02d", (Object[])new Object[]{n8, n9, (int)((float)object.a / (float)object.b)});
                }
                object2 = new StringBuilder();
                object2.append("Invalid GPS Timestamp array. array=");
                object2.append(Arrays.toString((Object[])object));
                object = object2.toString();
            }
            Log.w((String)"ExifInterface", (String)object);
            return null;
        }
        try {
            return Double.toString((double)object2.h(this.h));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c(String object, int n8) {
        if (object == null) throw new NullPointerException("tag shouldn't be null");
        if ((object = this.d((String)object)) == null) {
            return n8;
        }
        try {
            return object.i(this.h);
        }
        catch (NumberFormatException numberFormatException) {
            return n8;
        }
    }

    public final c d(String object) {
        if (object != null) {
            String string2 = object;
            if ("ISOSpeedRatings".equals(object)) {
                if (u) {
                    Log.d((String)"ExifInterface", (String)"getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                string2 = "PhotographicSensitivity";
            }
            for (int i8 = 0; i8 < i0.length; ++i8) {
                object = (c)this.f[i8].get((Object)string2);
                if (object == null) continue;
                return object;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e(final f var1_1) {
        block14 : {
            block13 : {
                if (Build.VERSION.SDK_INT < 28) throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
                var7_4 = new MediaMetadataRetriever();
                b.b.a(var7_4, new MediaDataSource(){
                    public long o;

                    public void close() {
                    }

                    public long getSize() {
                        return -1L;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public int readAt(long l8, byte[] arrby, int n8, int n9) {
                        if (n9 == 0) {
                            return 0;
                        }
                        if (l8 < 0L) {
                            return -1;
                        }
                        try {
                            long l9 = this.o;
                            if (l9 != l8) {
                                if (l9 >= 0L && l8 >= l9 + (long)var1_1.available()) {
                                    return -1;
                                }
                                var1_1.h(l8);
                                this.o = l8;
                            }
                            int n10 = n9;
                            if (n9 > var1_1.available()) {
                                n10 = var1_1.available();
                            }
                            if ((n8 = var1_1.read(arrby, n8, n10)) >= 0) {
                                this.o += (long)n8;
                                return n8;
                            }
                        }
                        catch (IOException iOException) {}
                        this.o = -1L;
                        return -1;
                    }
                });
                var8_5 = var7_4.extractMetadata(33);
                var9_6 = var7_4.extractMetadata(34);
                var4_7 = var7_4.extractMetadata(26);
                var5_8 = var7_4.extractMetadata(17);
                if ("yes".equals((Object)var4_7)) {
                    var4_7 = var7_4.extractMetadata(29);
                    var5_8 = var7_4.extractMetadata(30);
                    var6_9 = var7_4.extractMetadata(31);
                } else if ("yes".equals((Object)var5_8)) {
                    var4_7 = var7_4.extractMetadata(18);
                    var5_8 = var7_4.extractMetadata(19);
                    var6_9 = var7_4.extractMetadata(24);
                } else {
                    var4_7 = null;
                    var6_9 = var5_8 = null;
                }
                if (var4_7 == null) ** GOTO lbl34
                this.f[0].put((Object)"ImageWidth", (Object)c.f(Integer.parseInt((String)var4_7), this.h));
                if (var5_8 != null) {
                    this.f[0].put((Object)"ImageLength", (Object)c.f(Integer.parseInt((String)var5_8), this.h));
                }
                if (var6_9 == null) ** GOTO lbl34
                var2_10 = Integer.parseInt((String)var6_9);
                if (var2_10 != 90) {
                    var2_10 = var2_10 != 180 ? (var2_10 != 270 ? 1 : 8) : 3;
                    break block13;
                }
                var2_10 = 6;
            }
            this.f[0].put((Object)"Orientation", (Object)c.f(var2_10, this.h));
lbl34: // 3 sources:
            if (var8_5 == null || var9_6 == null) ** GOTO lbl49
            var2_10 = Integer.parseInt((String)var8_5);
            var3_11 = Integer.parseInt((String)var9_6);
            if (var3_11 <= 6) throw new IOException("Invalid exif length");
            var1_1.h(var2_10);
            var8_5 = new byte[6];
            if (var1_1.read(var8_5) != 6) throw new IOException("Can't read identifier");
            var3_11 -= 6;
            try {
                if (Arrays.equals((byte[])var8_5, (byte[])a.p0) == false) throw new IOException("Invalid identifier");
                var8_5 = new byte[var3_11];
                if (var1_1.read(var8_5) != var3_11) throw new IOException("Can't read exif");
                this.p = var2_10 + 6;
                this.G(var8_5, 0);
lbl49: // 2 sources:
                if (!a.u) break block14;
                var1_1 = new StringBuilder();
                var1_1.append("Heif meta: ");
                var1_1.append(var4_7);
                var1_1.append("x");
                var1_1.append(var5_8);
                var1_1.append(", rotation ");
                var1_1.append(var6_9);
                Log.d((String)"ExifInterface", (String)var1_1.toString());
            }
            catch (RuntimeException var1_3) {}
        }
        var7_4.release();
        return;
        try {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
        }
        catch (Throwable var1_2) {}
        var7_4.release();
        throw var1_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(b b8, int n8, int n9) {
        byte[] arrby;
        if (u) {
            arrby = new byte[]();
            arrby.append("getJpegAttributes starting with: ");
            arrby.append((Object)b8);
            Log.d((String)"ExifInterface", (String)arrby.toString());
        }
        b8.c(ByteOrder.BIG_ENDIAN);
        int n10 = b8.readByte();
        if (n10 != -1) {
            b8 = new StringBuilder();
            b8.append("Invalid marker: ");
            b8.append(Integer.toHexString((int)(n10 & 255)));
            throw new IOException(b8.toString());
        }
        if (b8.readByte() != -40) {
            b8 = new StringBuilder();
            b8.append("Invalid marker: ");
            b8.append(Integer.toHexString((int)(n10 & 255)));
            throw new IOException(b8.toString());
        }
        n10 = 2;
        do {
            int n11;
            block29 : {
                int n12;
                block30 : {
                    HashMap hashMap;
                    block27 : {
                        block28 : {
                            if ((n11 = b8.readByte()) != -1) {
                                b8 = new StringBuilder();
                                b8.append("Invalid marker:");
                                b8.append(Integer.toHexString((int)(n11 & 255)));
                                throw new IOException(b8.toString());
                            }
                            byte by = b8.readByte();
                            boolean bl = u;
                            if (bl) {
                                arrby = new StringBuilder();
                                arrby.append("Found JPEG segment indicator: ");
                                arrby.append(Integer.toHexString((int)(by & 255)));
                                Log.d((String)"ExifInterface", (String)arrby.toString());
                            }
                            if (by == -39 || by == -38) break;
                            int n13 = b8.readUnsignedShort();
                            n12 = n13 - 2;
                            n11 = n10 + 4;
                            if (bl) {
                                arrby = new StringBuilder();
                                arrby.append("JPEG segment: ");
                                arrby.append(Integer.toHexString((int)(by & 255)));
                                arrby.append(" (length: ");
                                arrby.append(n13);
                                arrby.append(")");
                                Log.d((String)"ExifInterface", (String)arrby.toString());
                            }
                            if (n12 < 0) {
                                throw new IOException("Invalid length");
                            }
                            if (by == -31) break block27;
                            if (by == -2) break block28;
                            switch (by) {
                                default: {
                                    switch (by) {
                                        default: {
                                            switch (by) {
                                                default: {
                                                    switch (by) {
                                                        default: {
                                                            n10 = n12;
                                                            break block29;
                                                        }
                                                        case -51: 
                                                        case -50: 
                                                        case -49: 
                                                    }
                                                }
                                                case -55: 
                                                case -54: 
                                                case -53: 
                                            }
                                        }
                                        case -59: 
                                        case -58: 
                                        case -57: 
                                    }
                                }
                                case -64: 
                                case -63: 
                                case -62: 
                                case -61: 
                            }
                            b8.e(1);
                            hashMap = this.f[n9];
                            arrby = n9 != 4 ? "ImageLength" : "ThumbnailImageLength";
                            hashMap.put((Object)arrby, (Object)c.b(b8.readUnsignedShort(), this.h));
                            hashMap = this.f[n9];
                            arrby = n9 != 4 ? "ImageWidth" : "ThumbnailImageWidth";
                            hashMap.put((Object)arrby, (Object)c.b(b8.readUnsignedShort(), this.h));
                            n10 = n13 - 7;
                            break block29;
                        }
                        arrby = new byte[n12];
                        if (b8.read(arrby) != n12) {
                            throw new IOException("Invalid exif");
                        }
                        if (this.b("UserComment") == null) {
                            this.f[1].put((Object)"UserComment", (Object)c.a(new String(arrby, o0)));
                        }
                        n10 = n11;
                        break block30;
                    }
                    arrby = new byte[n12];
                    b8.readFully(arrby);
                    hashMap = p0;
                    if (T.b.c(arrby, (byte[])hashMap)) {
                        arrby = Arrays.copyOfRange((byte[])arrby, (int)hashMap.length, (int)n12);
                        this.p = n8 + n11 + hashMap.length;
                        this.G(arrby, n9);
                        this.K(new b(arrby));
                    } else {
                        hashMap = q0;
                        if (T.b.c(arrby, (byte[])hashMap)) {
                            n10 = hashMap.length;
                            arrby = Arrays.copyOfRange((byte[])arrby, (int)hashMap.length, (int)n12);
                            if (this.b("Xmp") == null) {
                                this.f[0].put((Object)"Xmp", (Object)new c(1, arrby.length, n11 + n10, arrby));
                                this.t = true;
                            }
                        }
                    }
                    n10 = n11 + n12;
                }
                n12 = 0;
                n11 = n10;
                n10 = n12;
            }
            if (n10 < 0) {
                throw new IOException("Invalid length");
            }
            b8.e(n10);
            n10 = n11 + n10;
        } while (true);
        b8.c(this.h);
    }

    public final int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] arrby = new byte[5000];
        bufferedInputStream.read(arrby);
        bufferedInputStream.reset();
        if (a.t(arrby)) {
            return 4;
        }
        if (this.w(arrby)) {
            return 9;
        }
        if (this.s(arrby)) {
            return 12;
        }
        if (this.u(arrby)) {
            return 7;
        }
        if (this.x(arrby)) {
            return 10;
        }
        if (this.v(arrby)) {
            return 13;
        }
        if (this.B(arrby)) {
            return 14;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(f object) {
        Object object2;
        block12 : {
            long l8;
            block11 : {
                byte[] arrby;
                byte[] arrby2;
                block10 : {
                    this.k((f)((Object)object));
                    object = (c)this.f[1].get((Object)"MakerNote");
                    if (object == null) return;
                    object = new f(object.d);
                    object.c(this.h);
                    object2 = E;
                    byte[] arrby3 = new byte[object2.length];
                    object.readFully(arrby3);
                    object.h(0L);
                    arrby = F;
                    arrby2 = new byte[arrby.length];
                    object.readFully(arrby2);
                    if (!Arrays.equals((byte[])arrby3, (byte[])object2)) break block10;
                    l8 = 8L;
                    break block11;
                }
                if (!Arrays.equals((byte[])arrby2, (byte[])arrby)) break block12;
                l8 = 12L;
            }
            object.h(l8);
        }
        this.H((f)((Object)object), 6);
        object = (c)this.f[7].get((Object)"PreviewImageStart");
        object2 = (c)this.f[7].get((Object)"PreviewImageLength");
        if (object != null && object2 != null) {
            this.f[5].put((Object)"JPEGInterchangeFormat", object);
            this.f[5].put((Object)"JPEGInterchangeFormatLength", object2);
        }
        if ((object = (c)this.f[8].get((Object)"AspectFrame")) == null) return;
        {
            if ((object = (int[])object.k(this.h)) != null && object.length == 4) {
                int n8;
                int n9;
                int n10 = object[2];
                int n11 = object[0];
                if (n10 <= n11 || (n8 = object[3]) <= (n9 = object[1])) return;
                {
                    n10 = n10 - n11 + 1;
                    n11 = n8 - n9 + 1;
                    n9 = n10;
                    n8 = n11;
                    if (n10 < n11) {
                        n9 = n10 + n11;
                        n8 = n9 - n11;
                        n9 -= n8;
                    }
                    object = c.f(n9, this.h);
                    object2 = c.f(n8, this.h);
                    this.f[0].put((Object)"ImageWidth", object);
                    this.f[0].put((Object)"ImageLength", object2);
                    return;
                }
            } else {
                object2 = new StringBuilder();
                object2.append("Invalid aspect frame values. frame=");
                object2.append(Arrays.toString((int[])object));
                Log.w((String)"ExifInterface", (String)object2.toString());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(b b8) {
        StringBuilder stringBuilder;
        if (u) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("getPngAttributes starting with: ");
            stringBuilder.append((Object)b8);
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
        }
        b8.c(ByteOrder.BIG_ENDIAN);
        stringBuilder = G;
        b8.e(stringBuilder.length);
        int n8 = stringBuilder.length;
        do {
            int n9 = b8.readInt();
            stringBuilder = new byte[4];
            if (b8.read((byte[])stringBuilder) != 4) break;
            if ((n8 += 8) == 16) {
                if (!Arrays.equals((byte[])stringBuilder, (byte[])I)) throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
            }
            if (Arrays.equals((byte[])stringBuilder, (byte[])J)) {
                return;
            }
            if (Arrays.equals((byte[])stringBuilder, (byte[])H)) {
                byte[] arrby = new byte[n9];
                if (b8.read(arrby) != n9) {
                    b8 = new StringBuilder();
                    b8.append("Failed to read given length for given PNG chunk type: ");
                    b8.append(T.b.a((byte[])stringBuilder));
                    throw new IOException(b8.toString());
                }
                n9 = b8.readInt();
                b8 = new CRC32();
                b8.update((byte[])stringBuilder);
                b8.update(arrby);
                if ((int)b8.getValue() == n9) {
                    this.p = n8;
                    this.G(arrby, 0);
                    this.O();
                    this.K(new b(arrby));
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                stringBuilder.append(n9);
                stringBuilder.append(", calculated CRC value: ");
                stringBuilder.append(b8.getValue());
                throw new IOException(stringBuilder.toString());
            }
            n9 += 4;
            b8.e(n9);
            n8 += n9;
            continue;
            break;
        } while (true);
        try {
            throw new IOException("Encountered invalid length while parsing PNG chunktype");
        }
        catch (EOFException eOFException) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }

    public final void j(b object) {
        Object object2;
        boolean bl = u;
        if (bl) {
            object2 = new StringBuilder();
            object2.append("getRafAttributes starting with: ");
            object2.append(object);
            Log.d((String)"ExifInterface", (String)object2.toString());
        }
        object.e(84);
        object2 = new byte[4];
        byte[] arrby = new byte[4];
        byte[] arrby2 = new byte[4];
        object.read((byte[])object2);
        object.read(arrby);
        object.read(arrby2);
        int n8 = ByteBuffer.wrap((byte[])object2).getInt();
        int n9 = ByteBuffer.wrap((byte[])arrby).getInt();
        int n10 = ByteBuffer.wrap((byte[])arrby2).getInt();
        object2 = new byte[n9];
        object.e(n8 - object.a());
        object.read((byte[])object2);
        this.f(new b((byte[])object2), n8, 5);
        object.e(n10 - object.a());
        object.c(ByteOrder.BIG_ENDIAN);
        n9 = object.readInt();
        if (bl) {
            object2 = new StringBuilder();
            object2.append("numberOfDirectoryEntry: ");
            object2.append(n9);
            Log.d((String)"ExifInterface", (String)object2.toString());
        }
        for (n8 = 0; n8 < n9; ++n8) {
            n10 = object.readUnsignedShort();
            int n11 = object.readUnsignedShort();
            if (n10 == a.d0.a) {
                n8 = object.readShort();
                n9 = object.readShort();
                object = c.f(n8, this.h);
                object2 = c.f(n9, this.h);
                this.f[0].put((Object)"ImageLength", object);
                this.f[0].put((Object)"ImageWidth", object2);
                if (u) {
                    object = new StringBuilder();
                    object.append("Updated to length: ");
                    object.append(n8);
                    object.append(", width: ");
                    object.append(n9);
                    Log.d((String)"ExifInterface", (String)object.toString());
                }
                return;
            }
            object.e(n11);
        }
    }

    public final void k(f object) {
        this.D((b)((Object)object));
        this.H((f)((Object)object), 0);
        this.N((f)((Object)object), 0);
        this.N((f)((Object)object), 5);
        this.N((f)((Object)object), 4);
        this.O();
        if (this.d == 8 && (object = (c)this.f[1].get((Object)"MakerNote")) != null) {
            object = new f(object.d);
            object.c(this.h);
            object.e(6);
            this.H((f)((Object)object), 9);
            object = (c)this.f[9].get((Object)"ColorSpace");
            if (object != null) {
                this.f[1].put((Object)"ColorSpace", object);
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
            case 4: 
        }
        return 180;
    }

    public final void m(f object) {
        Object object2;
        if (u) {
            object2 = new StringBuilder();
            object2.append("getRw2Attributes starting with: ");
            object2.append(object);
            Log.d((String)"ExifInterface", (String)object2.toString());
        }
        this.k((f)((Object)object));
        object = (c)this.f[0].get((Object)"JpgFromRaw");
        if (object != null) {
            this.f(new b(object.d), (int)object.c, 5);
        }
        object = (c)this.f[0].get((Object)"ISO");
        object2 = (c)this.f[1].get((Object)"PhotographicSensitivity");
        if (object != null && object2 == null) {
            this.f[1].put((Object)"PhotographicSensitivity", object);
        }
    }

    public final void n(f f8) {
        byte[] arrby = p0;
        f8.e(arrby.length);
        byte[] arrby2 = new byte[f8.available()];
        f8.readFully(arrby2);
        this.p = arrby.length;
        this.G(arrby2, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(b b8) {
        byte[] arrby;
        if (u) {
            arrby = new byte[]();
            arrby.append("getWebpAttributes starting with: ");
            arrby.append((Object)b8);
            Log.d((String)"ExifInterface", (String)arrby.toString());
        }
        b8.c(ByteOrder.LITTLE_ENDIAN);
        b8.e(K.length);
        int n8 = b8.readInt() + 8;
        arrby = L;
        b8.e(arrby.length);
        int n9 = arrby.length + 8;
        do {
            int n10;
            try {
                arrby = new byte[4];
                if (b8.read(arrby) != 4) throw new IOException("Encountered invalid length while parsing WebP chunktype");
                n10 = b8.readInt();
            }
            catch (EOFException eOFException) {
                throw new IOException("Encountered corrupt WebP file.");
            }
            int n11 = n9 + 8;
            if (Arrays.equals((byte[])M, (byte[])arrby)) {
                byte[] arrby2 = new byte[n10];
                if (b8.read(arrby2) == n10) {
                    this.p = n11;
                    this.G(arrby2, 0);
                    this.K(new b(arrby2));
                    return;
                }
                b8 = new StringBuilder();
                b8.append("Failed to read given length for given PNG chunk type: ");
                b8.append(T.b.a(arrby));
                throw new IOException(b8.toString());
            }
            n9 = n10;
            if (n10 % 2 == 1) {
                n9 = n10 + 1;
            }
            if ((n10 = n11 + n9) == n8) {
                return;
            }
            if (n10 > n8) throw new IOException("Encountered WebP file with invalid chunk size");
            b8.e(n9);
            n9 = n10;
        } while (true);
    }

    public final void p(b b8, HashMap arrby) {
        c c8 = (c)arrby.get((Object)"JPEGInterchangeFormat");
        arrby = (c)arrby.get((Object)"JPEGInterchangeFormatLength");
        if (c8 != null && arrby != null) {
            int n8 = c8.i(this.h);
            int n9 = arrby.i(this.h);
            int n10 = n8;
            if (this.d == 7) {
                n10 = n8 + this.q;
            }
            if (n10 > 0 && n9 > 0) {
                this.i = true;
                if (this.a == null && this.c == null && this.b == null) {
                    arrby = new byte[n9];
                    b8.skip((long)n10);
                    b8.read(arrby);
                    this.n = arrby;
                }
                this.l = n10;
                this.m = n9;
            }
            if (u) {
                b8 = new StringBuilder();
                b8.append("Setting thumbnail attributes with offset: ");
                b8.append(n10);
                b8.append(", length: ");
                b8.append(n9);
                Log.d((String)"ExifInterface", (String)b8.toString());
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void q(b b8, HashMap arrl) {
        long[] arrl2 = (long[])arrl.get((Object)"StripOffsets");
        byte[] arrby = (byte[])arrl.get((Object)"StripByteCounts");
        if (arrl2 == null || arrby == null) return;
        arrl = T.b.b(arrl2.k(this.h));
        arrl2 = T.b.b(arrby.k(this.h));
        if (arrl != null && arrl.length != 0) {
            if (arrl2 != null && arrl2.length != 0) {
                int n8;
                int n9;
                if (arrl.length != arrl2.length) {
                    Log.w((String)"ExifInterface", (String)"stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                int n10 = arrl2.length;
                long l8 = 0L;
                for (n9 = 0; n9 < n10; ++n9) {
                    l8 += arrl2[n9];
                }
                int n11 = (int)l8;
                arrby = new byte[n11];
                this.k = true;
                this.j = true;
                this.i = true;
                n10 = n9 = (n8 = 0);
                int n12 = n9;
                for (n9 = n8; n9 < arrl.length; ++n9) {
                    int n13 = (int)arrl[n9];
                    n8 = (int)arrl2[n9];
                    if (n9 < arrl.length - 1 && (long)(n13 + n8) != arrl[n9 + 1]) {
                        this.k = false;
                    }
                    if ((n13 -= n12) < 0) {
                        Log.d((String)"ExifInterface", (String)"Invalid strip offset value");
                        return;
                    }
                    l8 = n13;
                    if (b8.skip(l8) != l8) {
                        b8 = new StringBuilder();
                        b8.append("Failed to skip ");
                        b8.append(n13);
                        b8.append(" bytes.");
                        Log.d((String)"ExifInterface", (String)b8.toString());
                        return;
                    }
                    byte[] arrby2 = new byte[n8];
                    if (b8.read(arrby2) != n8) {
                        b8 = new StringBuilder();
                        b8.append("Failed to read ");
                        b8.append(n8);
                        b8.append(" bytes.");
                        Log.d((String)"ExifInterface", (String)b8.toString());
                        return;
                    }
                    n12 = n12 + n13 + n8;
                    System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n10, (int)n8);
                    n10 += n8;
                }
                this.n = arrby;
                if (!this.k) return;
                this.l = (int)arrl[0];
                this.m = n11;
                return;
            }
            Log.w((String)"ExifInterface", (String)"stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w((String)"ExifInterface", (String)"stripOffsets should not be null or have zero length.");
    }

    /*
     * Exception decompiling
     */
    public final boolean s(byte[] var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean u(byte[] object) {
        block8 : {
            void var4_7;
            ByteOrder byteOrder;
            block7 : {
                boolean bl;
                Object var5_9;
                block6 : {
                    bl = false;
                    byteOrder = null;
                    var5_9 = null;
                    object = new b((byte[])object);
                    try {
                        this.h = byteOrder = this.F((b)((Object)object));
                        object.c(byteOrder);
                        short s8 = object.readShort();
                        if (s8 != 20306 && s8 != 21330) break block6;
                        bl = true;
                    }
                    catch (Throwable throwable) {
                        break block7;
                    }
                }
                object.close();
                return bl;
                catch (Throwable throwable) {
                    object = var5_9;
                }
            }
            if (object == null) throw var4_7;
            object.close();
            throw var4_7;
            catch (Exception exception) {
                object = byteOrder;
                break block8;
            }
            catch (Exception exception) {}
        }
        if (object == null) return false;
        object.close();
        return false;
    }

    public final boolean v(byte[] arrby) {
        byte[] arrby2;
        for (int i8 = 0; i8 < (arrby2 = G).length; ++i8) {
            if (arrby[i8] == arrby2[i8]) continue;
            return false;
        }
        return true;
    }

    public final boolean w(byte[] arrby) {
        byte[] arrby2 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < arrby2.length; ++i8) {
            if (arrby[i8] == arrby2[i8]) continue;
            return false;
        }
        return true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean x(byte[] object) {
        block8 : {
            void var4_7;
            ByteOrder byteOrder;
            block7 : {
                boolean bl;
                Object var5_9;
                block6 : {
                    bl = false;
                    byteOrder = null;
                    var5_9 = null;
                    object = new b((byte[])object);
                    try {
                        this.h = byteOrder = this.F((b)((Object)object));
                        object.c(byteOrder);
                        short s8 = object.readShort();
                        if (s8 != 85) break block6;
                        bl = true;
                    }
                    catch (Throwable throwable) {
                        break block7;
                    }
                }
                object.close();
                return bl;
                catch (Throwable throwable) {
                    object = var5_9;
                }
            }
            if (object == null) throw var4_7;
            object.close();
            throw var4_7;
            catch (Exception exception) {
                object = byteOrder;
                break block8;
            }
            catch (Exception exception) {}
        }
        if (object == null) return false;
        object.close();
        return false;
    }

    public final boolean z(HashMap object) {
        int[] arrn = (int[])object.get((Object)"BitsPerSample");
        if (arrn != null) {
            int n8;
            int[] arrn2 = x;
            if (Arrays.equals((int[])arrn2, (int[])(arrn = (int[])arrn.k(this.h)))) {
                return true;
            }
            if (this.d == 3 && (object = (c)object.get((Object)"PhotometricInterpretation")) != null && ((n8 = object.i(this.h)) == 1 && Arrays.equals((int[])arrn, (int[])z) || n8 == 6 && Arrays.equals((int[])arrn, (int[])arrn2))) {
                return true;
            }
        }
        if (u) {
            Log.d((String)"ExifInterface", (String)"Unsupported data type value");
        }
        return false;
    }

    public static class b
    extends InputStream
    implements DataInput {
        public static final ByteOrder s = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder t = ByteOrder.BIG_ENDIAN;
        public final DataInputStream o;
        public ByteOrder p = ByteOrder.BIG_ENDIAN;
        public int q;
        public byte[] r;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            inputStream = new DataInputStream(inputStream);
            this.o = inputStream;
            inputStream.mark(0);
            this.q = 0;
            this.p = byteOrder;
        }

        public b(byte[] arrby) {
            this((InputStream)new ByteArrayInputStream(arrby), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.q;
        }

        public int available() {
            return this.o.available();
        }

        public long b() {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }

        public void c(ByteOrder byteOrder) {
            this.p = byteOrder;
        }

        public void e(int n8) {
            int n9;
            int n10;
            for (n9 = 0; n9 < n8; n9 += n10) {
                int n11;
                DataInputStream dataInputStream = this.o;
                int n12 = n8 - n9;
                n10 = n11 = (int)dataInputStream.skip((long)n12);
                if (n11 > 0) continue;
                if (this.r == null) {
                    this.r = new byte[8192];
                }
                n10 = Math.min((int)8192, (int)n12);
                if ((n10 = this.o.read(this.r, 0, n10)) != -1) continue;
                dataInputStream = new StringBuilder();
                dataInputStream.append("Reached EOF while skipping ");
                dataInputStream.append(n8);
                dataInputStream.append(" bytes.");
                throw new EOFException(dataInputStream.toString());
            }
            this.q += n9;
        }

        public void mark(int n8) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int read() {
            ++this.q;
            return this.o.read();
        }

        public int read(byte[] arrby, int n8, int n9) {
            n8 = this.o.read(arrby, n8, n9);
            this.q += n8;
            return n8;
        }

        public boolean readBoolean() {
            ++this.q;
            return this.o.readBoolean();
        }

        public byte readByte() {
            ++this.q;
            int n8 = this.o.read();
            if (n8 >= 0) {
                return (byte)n8;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.q += 2;
            return this.o.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble((long)this.readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat((int)this.readInt());
        }

        public void readFully(byte[] arrby) {
            this.q += arrby.length;
            this.o.readFully(arrby);
        }

        public void readFully(byte[] arrby, int n8, int n9) {
            this.q += n9;
            this.o.readFully(arrby, n8, n9);
        }

        public int readInt() {
            int n8;
            int n9;
            int n10;
            this.q += 4;
            int n11 = this.o.read();
            if ((n11 | (n8 = this.o.read()) | (n10 = this.o.read()) | (n9 = this.o.read())) >= 0) {
                ByteOrder byteOrder = this.p;
                if (byteOrder == s) {
                    return (n9 << 24) + (n10 << 16) + (n8 << 8) + n11;
                }
                if (byteOrder == t) {
                    return (n11 << 24) + (n8 << 16) + (n10 << 8) + n9;
                }
                byteOrder = new StringBuilder();
                byteOrder.append("Invalid byte order: ");
                byteOrder.append((Object)this.p);
                throw new IOException(byteOrder.toString());
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d((String)"ExifInterface", (String)"Currently unsupported");
            return null;
        }

        public long readLong() {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            this.q += 8;
            int n15 = this.o.read();
            if ((n15 | (n9 = this.o.read()) | (n12 = this.o.read()) | (n11 = this.o.read()) | (n8 = this.o.read()) | (n10 = this.o.read()) | (n13 = this.o.read()) | (n14 = this.o.read())) >= 0) {
                ByteOrder byteOrder = this.p;
                if (byteOrder == s) {
                    return ((long)n14 << 56) + ((long)n13 << 48) + ((long)n10 << 40) + ((long)n8 << 32) + ((long)n11 << 24) + ((long)n12 << 16) + ((long)n9 << 8) + (long)n15;
                }
                if (byteOrder == t) {
                    return ((long)n15 << 56) + ((long)n9 << 48) + ((long)n12 << 40) + ((long)n11 << 32) + ((long)n8 << 24) + ((long)n10 << 16) + ((long)n13 << 8) + (long)n14;
                }
                byteOrder = new StringBuilder();
                byteOrder.append("Invalid byte order: ");
                byteOrder.append((Object)this.p);
                throw new IOException(byteOrder.toString());
            }
            throw new EOFException();
        }

        public short readShort() {
            int n8;
            this.q += 2;
            int n9 = this.o.read();
            if ((n9 | (n8 = this.o.read())) >= 0) {
                ByteOrder byteOrder = this.p;
                if (byteOrder == s) {
                    return (short)((n8 << 8) + n9);
                }
                if (byteOrder == t) {
                    return (short)((n9 << 8) + n8);
                }
                byteOrder = new StringBuilder();
                byteOrder.append("Invalid byte order: ");
                byteOrder.append((Object)this.p);
                throw new IOException(byteOrder.toString());
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.q += 2;
            return this.o.readUTF();
        }

        public int readUnsignedByte() {
            ++this.q;
            return this.o.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int n8;
            this.q += 2;
            int n9 = this.o.read();
            if ((n9 | (n8 = this.o.read())) >= 0) {
                ByteOrder byteOrder = this.p;
                if (byteOrder == s) {
                    return (n8 << 8) + n9;
                }
                if (byteOrder == t) {
                    return (n9 << 8) + n8;
                }
                byteOrder = new StringBuilder();
                byteOrder.append("Invalid byte order: ");
                byteOrder.append((Object)this.p);
                throw new IOException(byteOrder.toString());
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int n8) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    public static class c {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public c(int n8, int n9, long l8, byte[] arrby) {
            this.a = n8;
            this.b = n9;
            this.c = l8;
            this.d = arrby;
        }

        public c(int n8, int n9, byte[] arrby) {
            this(n8, n9, -1L, arrby);
        }

        public static c a(String arrby) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)arrby);
            stringBuilder.append('\u0000');
            arrby = stringBuilder.toString().getBytes(a.o0);
            return new c(2, arrby.length, arrby);
        }

        public static c b(long l8, ByteOrder byteOrder) {
            return c.c(new long[]{l8}, byteOrder);
        }

        public static c c(long[] arrl, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[a.W[4] * arrl.length]);
            byteBuffer.order(byteOrder);
            int n8 = arrl.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.putInt((int)arrl[i8]);
            }
            return new c(4, arrl.length, byteBuffer.array());
        }

        public static c d(e e8, ByteOrder byteOrder) {
            return c.e(new e[]{e8}, byteOrder);
        }

        public static c e(e[] arre, ByteOrder object) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[a.W[5] * arre.length]);
            byteBuffer.order((ByteOrder)object);
            int n8 = arre.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object = arre[i8];
                byteBuffer.putInt((int)object.a);
                byteBuffer.putInt((int)object.b);
            }
            return new c(5, arre.length, byteBuffer.array());
        }

        public static c f(int n8, ByteOrder byteOrder) {
            return c.g(new int[]{n8}, byteOrder);
        }

        public static c g(int[] arrn, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[a.W[3] * arrn.length]);
            byteBuffer.order(byteOrder);
            int n8 = arrn.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.putShort((short)arrn[i8]);
            }
            return new c(3, arrn.length, byteBuffer.array());
        }

        public double h(ByteOrder arrl) {
            if ((arrl = this.k((ByteOrder)arrl)) != null) {
                if (arrl instanceof String) {
                    return Double.parseDouble((String)((String)arrl));
                }
                if (arrl instanceof long[]) {
                    if ((arrl = (long[])arrl).length == 1) {
                        return arrl[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (arrl instanceof int[]) {
                    if ((arrl = (int[])arrl).length == 1) {
                        return arrl[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (arrl instanceof double[]) {
                    if ((arrl = (double[])arrl).length == 1) {
                        return arrl[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (arrl instanceof e[]) {
                    if ((arrl = (e[])arrl).length == 1) {
                        return arrl[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int i(ByteOrder arrl) {
            if ((arrl = this.k((ByteOrder)arrl)) != null) {
                if (arrl instanceof String) {
                    return Integer.parseInt((String)((String)arrl));
                }
                if (arrl instanceof long[]) {
                    if ((arrl = (long[])arrl).length == 1) {
                        return (int)arrl[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (arrl instanceof int[]) {
                    if ((arrl = (int[])arrl).length == 1) {
                        return (int)arrl[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String j(ByteOrder byteOrder) {
            long[] arrl = this.k(byteOrder);
            if (arrl == null) {
                return null;
            }
            if (arrl instanceof String) {
                return (String)arrl;
            }
            byteOrder = new StringBuilder();
            boolean bl = arrl instanceof long[];
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            if (bl) {
                arrl = arrl;
                while (n11 < arrl.length) {
                    byteOrder.append(arrl[n11]);
                    n11 = n8 = n11 + 1;
                    if (n8 == arrl.length) continue;
                    byteOrder.append(",");
                    n11 = n8;
                }
                return byteOrder.toString();
            }
            if (arrl instanceof int[]) {
                arrl = (int[])arrl;
                n11 = n8;
                while (n11 < arrl.length) {
                    byteOrder.append((int)arrl[n11]);
                    n11 = n8 = n11 + 1;
                    if (n8 == arrl.length) continue;
                    byteOrder.append(",");
                    n11 = n8;
                }
                return byteOrder.toString();
            }
            if (arrl instanceof double[]) {
                arrl = arrl;
                n11 = n9;
                while (n11 < arrl.length) {
                    byteOrder.append((double)arrl[n11]);
                    n11 = n8 = n11 + 1;
                    if (n8 == arrl.length) continue;
                    byteOrder.append(",");
                    n11 = n8;
                }
                return byteOrder.toString();
            }
            if (arrl instanceof e[]) {
                arrl = (e[])arrl;
                n11 = n10;
                while (n11 < arrl.length) {
                    byteOrder.append(arrl[n11].a);
                    byteOrder.append('/');
                    byteOrder.append(arrl[n11].b);
                    n11 = n8 = n11 + 1;
                    if (n8 == arrl.length) continue;
                    byteOrder.append(",");
                    n11 = n8;
                }
                return byteOrder.toString();
            }
            return null;
        }

        /*
         * Exception decompiling
         */
        public Object k(ByteOrder var1_1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[CASE]], but top level block is 3[TRYBLOCK]
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(a.V[this.a]);
            stringBuilder.append(", data length:");
            stringBuilder.append(this.d.length);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static class d {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public d(String string2, int n8, int n9) {
            this.b = string2;
            this.a = n8;
            this.c = n9;
            this.d = -1;
        }

        public d(String string2, int n8, int n9, int n10) {
            this.b = string2;
            this.a = n8;
            this.c = n9;
            this.d = n10;
        }

        public boolean a(int n8) {
            int n9 = this.c;
            if (n9 != 7) {
                if (n8 == 7) {
                    return true;
                }
                if (n9 != n8) {
                    int n10 = this.d;
                    if (n10 == n8) {
                        return true;
                    }
                    if ((n9 == 4 || n10 == 4) && n8 == 3) {
                        return true;
                    }
                    if ((n9 == 9 || n10 == 9) && n8 == 8) {
                        return true;
                    }
                    if ((n9 == 12 || n10 == 12) && n8 == 11) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
    }

    public static class e {
        public final long a;
        public final long b;

        public e(long l8, long l9) {
            if (l9 == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = l8;
            this.b = l9;
        }

        public double a() {
            return (double)this.a / (double)this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("/");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    public static class f
    extends b {
        public f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.o.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }

        public f(byte[] arrby) {
            super(arrby);
            this.o.mark(Integer.MAX_VALUE);
        }

        public void h(long l8) {
            int n8 = this.q;
            if ((long)n8 > l8) {
                this.q = 0;
                this.o.reset();
            } else {
                l8 -= (long)n8;
            }
            this.e((int)l8);
        }
    }

}

