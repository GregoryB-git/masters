package T;

import android.content.res.AssetManager.AssetInputStream;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

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
  public static final Pattern r0 = Pattern.compile(".*[1-9].*");
  public static final Pattern s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
  public static final Pattern t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
  public static final boolean u;
  public static final Pattern u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
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
  
  static
  {
    Integer localInteger1 = Integer.valueOf(3);
    u = Log.isLoggable("ExifInterface", 3);
    Integer localInteger2 = Integer.valueOf(1);
    Integer localInteger3 = Integer.valueOf(8);
    v = Arrays.asList(new Integer[] { localInteger2, Integer.valueOf(6), localInteger1, localInteger3 });
    Integer localInteger4 = Integer.valueOf(2);
    Integer localInteger5 = Integer.valueOf(7);
    Integer localInteger6 = Integer.valueOf(5);
    w = Arrays.asList(new Integer[] { localInteger4, localInteger5, Integer.valueOf(4), localInteger6 });
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
    d locald1 = new d("NewSubfileType", 254, 4);
    Object localObject1 = new d("SubfileType", 255, 4);
    d locald2 = new d("ImageWidth", 256, 3, 4);
    d locald3 = new d("ImageLength", 257, 3, 4);
    d locald4 = new d("BitsPerSample", 258, 3);
    d locald5 = new d("Compression", 259, 3);
    d locald6 = new d("PhotometricInterpretation", 262, 3);
    Object localObject2 = new d("ImageDescription", 270, 2);
    d locald7 = new d("Make", 271, 2);
    d locald8 = new d("Model", 272, 2);
    Object localObject3 = new d("StripOffsets", 273, 3, 4);
    Object localObject4 = new d("Orientation", 274, 3);
    Object localObject5 = new d("SamplesPerPixel", 277, 3);
    d locald9 = new d("RowsPerStrip", 278, 3, 4);
    d locald10 = new d("StripByteCounts", 279, 3, 4);
    d locald11 = new d("XResolution", 282, 5);
    d locald12 = new d("YResolution", 283, 5);
    d locald13 = new d("PlanarConfiguration", 284, 3);
    d locald14 = new d("ResolutionUnit", 296, 3);
    d locald15 = new d("TransferFunction", 301, 3);
    d locald16 = new d("Software", 305, 2);
    d locald17 = new d("DateTime", 306, 2);
    d locald18 = new d("Artist", 315, 2);
    Object localObject6 = new d("WhitePoint", 318, 5);
    d locald19 = new d("PrimaryChromaticities", 319, 5);
    d locald20 = new d("SubIFDPointer", 330, 4);
    d locald21 = new d("JPEGInterchangeFormat", 513, 4);
    d locald22 = new d("JPEGInterchangeFormatLength", 514, 4);
    d locald23 = new d("YCbCrCoefficients", 529, 5);
    d locald24 = new d("YCbCrSubSampling", 530, 3);
    d locald25 = new d("YCbCrPositioning", 531, 3);
    d locald26 = new d("ReferenceBlackWhite", 532, 5);
    Object localObject7 = new d("Copyright", 33432, 2);
    d locald27 = new d("ExifIFDPointer", 34665, 4);
    Object localObject8 = new d("GPSInfoIFDPointer", 34853, 4);
    d locald28 = new d("SensorTopBorder", 4, 4);
    d locald29 = new d("SensorLeftBorder", 5, 4);
    d locald30 = new d("SensorBottomBorder", 6, 4);
    d locald31 = new d("SensorRightBorder", 7, 4);
    d locald32 = new d("ISO", 23, 3);
    Object localObject9 = new d("JpgFromRaw", 46, 7);
    d locald33 = new d("Xmp", 700, 1);
    Object localObject10 = new d[42];
    localObject10[0] = locald1;
    localObject10[1] = localObject1;
    localObject10[2] = locald2;
    localObject10[3] = locald3;
    localObject10[4] = locald4;
    localObject10[5] = locald5;
    localObject10[6] = locald6;
    localObject10[7] = localObject2;
    localObject10[8] = locald7;
    localObject10[9] = locald8;
    localObject10[10] = localObject3;
    localObject10[11] = localObject4;
    localObject10[12] = localObject5;
    localObject10[13] = locald9;
    localObject10[14] = locald10;
    localObject10[15] = locald11;
    localObject10[16] = locald12;
    localObject10[17] = locald13;
    localObject10[18] = locald14;
    localObject10[19] = locald15;
    localObject10[20] = locald16;
    localObject10[21] = locald17;
    localObject10[22] = locald18;
    localObject10[23] = localObject6;
    localObject10[24] = locald19;
    localObject10[25] = locald20;
    localObject10[26] = locald21;
    localObject10[27] = locald22;
    localObject10[28] = locald23;
    localObject10[29] = locald24;
    localObject10[30] = locald25;
    localObject10[31] = locald26;
    localObject10[32] = localObject7;
    localObject10[33] = locald27;
    localObject10[34] = localObject8;
    localObject10[35] = locald28;
    localObject10[36] = locald29;
    localObject10[37] = locald30;
    localObject10[38] = locald31;
    localObject10[39] = locald32;
    localObject10[40] = localObject9;
    localObject10[41] = locald33;
    Y = (d[])localObject10;
    d locald34 = new d("ExposureTime", 33434, 5);
    d locald35 = new d("FNumber", 33437, 5);
    localObject2 = new d("ExposureProgram", 34850, 3);
    d locald36 = new d("SpectralSensitivity", 34852, 2);
    locald23 = new d("PhotographicSensitivity", 34855, 3);
    locald30 = new d("OECF", 34856, 7);
    locald11 = new d("SensitivityType", 34864, 3);
    locald10 = new d("StandardOutputSensitivity", 34865, 4);
    localObject4 = new d("RecommendedExposureIndex", 34866, 4);
    d locald37 = new d("ISOSpeed", 34867, 4);
    locald16 = new d("ISOSpeedLatitudeyyy", 34868, 4);
    localObject9 = new d("ISOSpeedLatitudezzz", 34869, 4);
    locald29 = new d("ExifVersion", 36864, 2);
    localObject8 = new d("DateTimeOriginal", 36867, 2);
    d locald38 = new d("DateTimeDigitized", 36868, 2);
    locald3 = new d("OffsetTime", 36880, 2);
    localObject3 = new d("OffsetTimeOriginal", 36881, 2);
    d locald39 = new d("OffsetTimeDigitized", 36882, 2);
    locald5 = new d("ComponentsConfiguration", 37121, 7);
    d locald40 = new d("CompressedBitsPerPixel", 37122, 5);
    locald2 = new d("ShutterSpeedValue", 37377, 10);
    locald17 = new d("ApertureValue", 37378, 5);
    locald31 = new d("BrightnessValue", 37379, 10);
    d locald41 = new d("ExposureBiasValue", 37380, 10);
    d locald42 = new d("MaxApertureValue", 37381, 5);
    locald28 = new d("SubjectDistance", 37382, 5);
    locald26 = new d("MeteringMode", 37383, 3);
    locald6 = new d("LightSource", 37384, 3);
    locald18 = new d("Flash", 37385, 3);
    d locald43 = new d("FocalLength", 37386, 5);
    locald32 = new d("SubjectArea", 37396, 3);
    d locald44 = new d("MakerNote", 37500, 7);
    d locald45 = new d("UserComment", 37510, 7);
    d locald46 = new d("SubSecTime", 37520, 2);
    d locald47 = new d("SubSecTimeOriginal", 37521, 2);
    locald14 = new d("SubSecTimeDigitized", 37522, 2);
    localObject6 = new d("FlashpixVersion", 40960, 7);
    locald1 = new d("ColorSpace", 40961, 3);
    d locald48 = new d("PixelXDimension", 40962, 3, 4);
    locald19 = new d("PixelYDimension", 40963, 3, 4);
    d locald49 = new d("RelatedSoundFile", 40964, 2);
    locald8 = new d("InteroperabilityIFDPointer", 40965, 4);
    d locald50 = new d("FlashEnergy", 41483, 5);
    d locald51 = new d("SpatialFrequencyResponse", 41484, 7);
    locald27 = new d("FocalPlaneXResolution", 41486, 5);
    locald15 = new d("FocalPlaneYResolution", 41487, 5);
    localObject7 = new d("FocalPlaneResolutionUnit", 41488, 3);
    d locald52 = new d("SubjectLocation", 41492, 3);
    locald33 = new d("ExposureIndex", 41493, 5);
    d locald53 = new d("SensingMethod", 41495, 3);
    locald25 = new d("FileSource", 41728, 7);
    locald9 = new d("SceneType", 41729, 7);
    locald21 = new d("CFAPattern", 41730, 7);
    d locald54 = new d("CustomRendered", 41985, 3);
    d locald55 = new d("ExposureMode", 41986, 3);
    d locald56 = new d("WhiteBalance", 41987, 3);
    locald13 = new d("DigitalZoomRatio", 41988, 5);
    locald24 = new d("FocalLengthIn35mmFilm", 41989, 3);
    d locald57 = new d("SceneCaptureType", 41990, 3);
    d locald58 = new d("GainControl", 41991, 3);
    d locald59 = new d("Contrast", 41992, 3);
    locald12 = new d("Saturation", 41993, 3);
    locald7 = new d("Sharpness", 41994, 3);
    d locald60 = new d("DeviceSettingDescription", 41995, 7);
    d locald61 = new d("SubjectDistanceRange", 41996, 3);
    d locald62 = new d("ImageUniqueID", 42016, 2);
    localObject5 = new d("CameraOwnerName", 42032, 2);
    d locald63 = new d("BodySerialNumber", 42033, 2);
    d locald64 = new d("LensSpecification", 42034, 5);
    locald20 = new d("LensMake", 42035, 2);
    d locald65 = new d("LensModel", 42036, 2);
    d locald66 = new d("Gamma", 42240, 5);
    locald22 = new d("DNGVersion", 50706, 1);
    locald4 = new d("DefaultCropSize", 50720, 3, 4);
    localObject1 = new d[74];
    localObject1[0] = locald34;
    localObject1[1] = locald35;
    localObject1[2] = localObject2;
    localObject1[3] = locald36;
    localObject1[4] = locald23;
    localObject1[5] = locald30;
    localObject1[6] = locald11;
    localObject1[7] = locald10;
    localObject1[8] = localObject4;
    localObject1[9] = locald37;
    localObject1[10] = locald16;
    localObject1[11] = localObject9;
    localObject1[12] = locald29;
    localObject1[13] = localObject8;
    localObject1[14] = locald38;
    localObject1[15] = locald3;
    localObject1[16] = localObject3;
    localObject1[17] = locald39;
    localObject1[18] = locald5;
    localObject1[19] = locald40;
    localObject1[20] = locald2;
    localObject1[21] = locald17;
    localObject1[22] = locald31;
    localObject1[23] = locald41;
    localObject1[24] = locald42;
    localObject1[25] = locald28;
    localObject1[26] = locald26;
    localObject1[27] = locald6;
    localObject1[28] = locald18;
    localObject1[29] = locald43;
    localObject1[30] = locald32;
    localObject1[31] = locald44;
    localObject1[32] = locald45;
    localObject1[33] = locald46;
    localObject1[34] = locald47;
    localObject1[35] = locald14;
    localObject1[36] = localObject6;
    localObject1[37] = locald1;
    localObject1[38] = locald48;
    localObject1[39] = locald19;
    localObject1[40] = locald49;
    localObject1[41] = locald8;
    localObject1[42] = locald50;
    localObject1[43] = locald51;
    localObject1[44] = locald27;
    localObject1[45] = locald15;
    localObject1[46] = localObject7;
    localObject1[47] = locald52;
    localObject1[48] = locald33;
    localObject1[49] = locald53;
    localObject1[50] = locald25;
    localObject1[51] = locald9;
    localObject1[52] = locald21;
    localObject1[53] = locald54;
    localObject1[54] = locald55;
    localObject1[55] = locald56;
    localObject1[56] = locald13;
    localObject1[57] = locald24;
    localObject1[58] = locald57;
    localObject1[59] = locald58;
    localObject1[60] = locald59;
    localObject1[61] = locald12;
    localObject1[62] = locald7;
    localObject1[63] = locald60;
    localObject1[64] = locald61;
    localObject1[65] = locald62;
    localObject1[66] = localObject5;
    localObject1[67] = locald63;
    localObject1[68] = locald64;
    localObject1[69] = locald20;
    localObject1[70] = locald65;
    localObject1[71] = locald66;
    localObject1[72] = locald22;
    localObject1[73] = locald4;
    Z = (d[])localObject1;
    locald7 = new d("GPSVersionID", 0, 1);
    locald12 = new d("GPSLatitudeRef", 1, 2);
    locald2 = new d("GPSLatitude", 2, 5, 10);
    localObject4 = new d("GPSLongitudeRef", 3, 2);
    locald1 = new d("GPSLongitude", 4, 5, 10);
    locald3 = new d("GPSAltitudeRef", 5, 1);
    locald5 = new d("GPSAltitude", 6, 5);
    locald4 = new d("GPSTimeStamp", 7, 5);
    localObject2 = new d("GPSSatellites", 8, 2);
    locald32 = new d("GPSStatus", 9, 2);
    locald20 = new d("GPSMeasureMode", 10, 2);
    locald13 = new d("GPSDOP", 11, 5);
    locald30 = new d("GPSSpeedRef", 12, 2);
    locald25 = new d("GPSSpeed", 13, 5);
    locald33 = new d("GPSTrackRef", 14, 2);
    locald18 = new d("GPSTrack", 15, 5);
    locald16 = new d("GPSImgDirectionRef", 16, 2);
    locald21 = new d("GPSImgDirection", 17, 5);
    locald15 = new d("GPSMapDatum", 18, 2);
    localObject9 = new d("GPSDestLatitudeRef", 19, 2);
    locald29 = new d("GPSDestLatitude", 20, 5);
    locald14 = new d("GPSDestLongitudeRef", 21, 2);
    localObject5 = new d("GPSDestLongitude", 22, 5);
    locald31 = new d("GPSDestBearingRef", 23, 2);
    locald22 = new d("GPSDestBearing", 24, 5);
    locald24 = new d("GPSDestDistanceRef", 25, 2);
    locald23 = new d("GPSDestDistance", 26, 5);
    localObject3 = new d("GPSProcessingMethod", 27, 7);
    localObject6 = new d("GPSAreaInformation", 28, 7);
    localObject7 = new d("GPSDateStamp", 29, 2);
    locald27 = new d("GPSDifferential", 30, 3);
    locald28 = new d("GPSHPositioningError", 31, 5);
    localObject8 = new d[32];
    localObject8[0] = locald7;
    localObject8[1] = locald12;
    localObject8[2] = locald2;
    localObject8[3] = localObject4;
    localObject8[4] = locald1;
    localObject8[5] = locald3;
    localObject8[6] = locald5;
    localObject8[7] = locald4;
    localObject8[8] = localObject2;
    localObject8[9] = locald32;
    localObject8[10] = locald20;
    localObject8[11] = locald13;
    localObject8[12] = locald30;
    localObject8[13] = locald25;
    localObject8[14] = locald33;
    localObject8[15] = locald18;
    localObject8[16] = locald16;
    localObject8[17] = locald21;
    localObject8[18] = locald15;
    localObject8[19] = localObject9;
    localObject8[20] = locald29;
    localObject8[21] = locald14;
    localObject8[22] = localObject5;
    localObject8[23] = locald31;
    localObject8[24] = locald22;
    localObject8[25] = locald24;
    localObject8[26] = locald23;
    localObject8[27] = localObject3;
    localObject8[28] = localObject6;
    localObject8[29] = localObject7;
    localObject8[30] = locald27;
    localObject8[31] = locald28;
    a0 = (d[])localObject8;
    localObject4 = new d("InteroperabilityIndex", 1, 2);
    localObject6 = new d[1];
    localObject6[0] = localObject4;
    b0 = (d[])localObject6;
    locald25 = new d("NewSubfileType", 254, 4);
    locald26 = new d("SubfileType", 255, 4);
    locald13 = new d("ThumbnailImageWidth", 256, 3, 4);
    locald20 = new d("ThumbnailImageLength", 257, 3, 4);
    locald9 = new d("BitsPerSample", 258, 3);
    locald30 = new d("Compression", 259, 3);
    locald16 = new d("PhotometricInterpretation", 262, 3);
    locald29 = new d("ImageDescription", 270, 2);
    locald22 = new d("Make", 271, 2);
    locald24 = new d("Model", 272, 2);
    locald18 = new d("StripOffsets", 273, 3, 4);
    localObject3 = new d("ThumbnailOrientation", 274, 3);
    locald14 = new d("SamplesPerPixel", 277, 3);
    locald1 = new d("RowsPerStrip", 278, 3, 4);
    locald2 = new d("StripByteCounts", 279, 3, 4);
    locald12 = new d("XResolution", 282, 5);
    localObject2 = new d("YResolution", 283, 5);
    locald28 = new d("PlanarConfiguration", 284, 3);
    locald10 = new d("ResolutionUnit", 296, 3);
    locald27 = new d("TransferFunction", 301, 3);
    locald19 = new d("Software", 305, 2);
    locald6 = new d("DateTime", 306, 2);
    locald8 = new d("Artist", 315, 2);
    locald31 = new d("WhitePoint", 318, 5);
    locald3 = new d("PrimaryChromaticities", 319, 5);
    localObject9 = new d("SubIFDPointer", 330, 4);
    locald15 = new d("JPEGInterchangeFormat", 513, 4);
    locald17 = new d("JPEGInterchangeFormatLength", 514, 4);
    locald23 = new d("YCbCrCoefficients", 529, 5);
    locald32 = new d("YCbCrSubSampling", 530, 3);
    locald4 = new d("YCbCrPositioning", 531, 3);
    locald21 = new d("ReferenceBlackWhite", 532, 5);
    locald5 = new d("Copyright", 33432, 2);
    localObject7 = new d("ExifIFDPointer", 34665, 4);
    locald7 = new d("GPSInfoIFDPointer", 34853, 4);
    locald33 = new d("DNGVersion", 50706, 1);
    localObject5 = new d("DefaultCropSize", 50720, 3, 4);
    localObject4 = new d[37];
    localObject4[0] = locald25;
    localObject4[1] = locald26;
    localObject4[2] = locald13;
    localObject4[3] = locald20;
    localObject4[4] = locald9;
    localObject4[5] = locald30;
    localObject4[6] = locald16;
    localObject4[7] = locald29;
    localObject4[8] = locald22;
    localObject4[9] = locald24;
    localObject4[10] = locald18;
    localObject4[11] = localObject3;
    localObject4[12] = locald14;
    localObject4[13] = locald1;
    localObject4[14] = locald2;
    localObject4[15] = locald12;
    localObject4[16] = localObject2;
    localObject4[17] = locald28;
    localObject4[18] = locald10;
    localObject4[19] = locald27;
    localObject4[20] = locald19;
    localObject4[21] = locald6;
    localObject4[22] = locald8;
    localObject4[23] = locald31;
    localObject4[24] = locald3;
    localObject4[25] = localObject9;
    localObject4[26] = locald15;
    localObject4[27] = locald17;
    localObject4[28] = locald23;
    localObject4[29] = locald32;
    localObject4[30] = locald4;
    localObject4[31] = locald21;
    localObject4[32] = locald5;
    localObject4[33] = localObject7;
    localObject4[34] = locald7;
    localObject4[35] = locald33;
    localObject4[36] = localObject5;
    c0 = (d[])localObject4;
    d0 = new d("StripOffsets", 273, 3);
    localObject5 = new d("ThumbnailImage", 256, 7);
    localObject2 = new d("CameraSettingsIFDPointer", 8224, 4);
    localObject9 = new d("ImageProcessingIFDPointer", 8256, 4);
    localObject7 = new d[3];
    localObject7[0] = localObject5;
    localObject7[1] = localObject2;
    localObject7[2] = localObject9;
    e0 = (d[])localObject7;
    localObject9 = new d("PreviewImageStart", 257, 4);
    localObject2 = new d("PreviewImageLength", 258, 4);
    localObject5 = new d[2];
    localObject5[0] = localObject9;
    localObject5[1] = localObject2;
    f0 = (d[])localObject5;
    localObject9 = new d("AspectFrame", 4371, 3);
    localObject2 = new d[1];
    localObject2[0] = localObject9;
    g0 = (d[])localObject2;
    localObject3 = new d("ColorSpace", 55, 3);
    localObject9 = new d[1];
    localObject9[0] = localObject3;
    h0 = (d[])localObject9;
    localObject3 = new d[10][];
    localObject3[0] = localObject10;
    localObject3[1] = localObject1;
    localObject3[2] = localObject8;
    localObject3[3] = localObject6;
    localObject3[4] = localObject4;
    localObject3[5] = localObject10;
    localObject3[6] = localObject7;
    localObject3[7] = localObject5;
    localObject3[8] = localObject2;
    localObject3[9] = localObject9;
    i0 = (d[][])localObject3;
    j0 = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
    k0 = new HashMap[localObject3.length];
    l0 = new HashMap[localObject3.length];
    m0 = new HashSet(Arrays.asList(new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp" }));
    n0 = new HashMap();
    localObject10 = Charset.forName("US-ASCII");
    o0 = (Charset)localObject10;
    p0 = "Exif\000\000".getBytes((Charset)localObject10);
    q0 = "http://ns.adobe.com/xap/1.0/\000".getBytes((Charset)localObject10);
    localObject1 = Locale.US;
    localObject10 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", (Locale)localObject1);
    T = (SimpleDateFormat)localObject10;
    ((DateFormat)localObject10).setTimeZone(TimeZone.getTimeZone("UTC"));
    localObject10 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", (Locale)localObject1);
    U = (SimpleDateFormat)localObject10;
    ((DateFormat)localObject10).setTimeZone(TimeZone.getTimeZone("UTC"));
    for (int i1 = 0;; i1++)
    {
      localObject10 = i0;
      if (i1 >= localObject10.length) {
        break;
      }
      k0[i1] = new HashMap();
      l0[i1] = new HashMap();
      for (localObject10 : localObject10[i1])
      {
        k0[i1].put(Integer.valueOf(a), localObject10);
        l0[i1].put(b, localObject10);
      }
    }
    localObject1 = n0;
    localObject10 = j0;
    ((HashMap)localObject1).put(Integer.valueOf(0a), localInteger6);
    ((HashMap)localObject1).put(Integer.valueOf(1a), localInteger2);
    ((HashMap)localObject1).put(Integer.valueOf(2a), localInteger4);
    ((HashMap)localObject1).put(Integer.valueOf(3a), localInteger1);
    ((HashMap)localObject1).put(Integer.valueOf(4a), localInteger5);
    ((HashMap)localObject1).put(Integer.valueOf(5a), localInteger3);
  }
  
  public a(InputStream paramInputStream)
  {
    this(paramInputStream, 0);
  }
  
  public a(InputStream paramInputStream, int paramInt)
  {
    Object localObject = i0;
    f = new HashMap[localObject.length];
    g = new HashSet(localObject.length);
    h = ByteOrder.BIG_ENDIAN;
    if (paramInputStream != null)
    {
      a = null;
      if (paramInt == 1)
      {
        paramInputStream = new BufferedInputStream(paramInputStream, p0.length);
        if (!r(paramInputStream))
        {
          Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
          return;
        }
        e = true;
        c = null;
        b = null;
      }
      else
      {
        if ((paramInputStream instanceof AssetManager.AssetInputStream)) {}
        for (c = ((AssetManager.AssetInputStream)paramInputStream);; c = null)
        {
          b = null;
          break;
          if ((paramInputStream instanceof FileInputStream))
          {
            localObject = (FileInputStream)paramInputStream;
            if (y(((FileInputStream)localObject).getFD()))
            {
              c = null;
              b = ((FileInputStream)localObject).getFD();
              break;
            }
          }
        }
      }
      C(paramInputStream);
      return;
    }
    throw new NullPointerException("inputStream cannot be null");
  }
  
  public static boolean L(int paramInt)
  {
    return (paramInt != 4) && (paramInt != 9) && (paramInt != 13) && (paramInt != 14);
  }
  
  public static boolean r(BufferedInputStream paramBufferedInputStream)
  {
    byte[] arrayOfByte = p0;
    paramBufferedInputStream.mark(arrayOfByte.length);
    arrayOfByte = new byte[arrayOfByte.length];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    for (int i1 = 0;; i1++)
    {
      paramBufferedInputStream = p0;
      if (i1 >= paramBufferedInputStream.length) {
        break;
      }
      if (arrayOfByte[i1] != paramBufferedInputStream[i1]) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean t(byte[] paramArrayOfByte)
  {
    for (int i1 = 0;; i1++)
    {
      byte[] arrayOfByte = A;
      if (i1 >= arrayOfByte.length) {
        break;
      }
      if (paramArrayOfByte[i1] != arrayOfByte[i1]) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean y(FileDescriptor paramFileDescriptor)
  {
    try
    {
      b.a.c(paramFileDescriptor, 0L, OsConstants.SEEK_CUR);
      return true;
    }
    catch (Exception paramFileDescriptor)
    {
      if (u) {
        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
      }
    }
    return false;
  }
  
  public final boolean A(HashMap paramHashMap)
  {
    c localc = (c)paramHashMap.get("ImageLength");
    paramHashMap = (c)paramHashMap.get("ImageWidth");
    if ((localc != null) && (paramHashMap != null))
    {
      int i1 = localc.i(h);
      int i2 = paramHashMap.i(h);
      if ((i1 <= 512) && (i2 <= 512)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean B(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte;
    for (int i1 = 0;; i1++)
    {
      arrayOfByte = K;
      if (i1 >= arrayOfByte.length) {
        break;
      }
      if (paramArrayOfByte[i1] != arrayOfByte[i1]) {
        return false;
      }
    }
    for (i1 = 0;; i1++)
    {
      arrayOfByte = L;
      if (i1 >= arrayOfByte.length) {
        break;
      }
      if (paramArrayOfByte[(K.length + i1 + 4)] != arrayOfByte[i1]) {
        return false;
      }
    }
    return true;
  }
  
  /* Error */
  public final void C(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +311 -> 312
    //   4: iconst_0
    //   5: istore_2
    //   6: iload_2
    //   7: getstatic 698	T/a:i0	[[LT/a$d;
    //   10: arraylength
    //   11: if_icmpge +34 -> 45
    //   14: aload_0
    //   15: getfield 804	T/a:f	[Ljava/util/HashMap;
    //   18: iload_2
    //   19: new 702	java/util/HashMap
    //   22: dup
    //   23: invokespecial 715	java/util/HashMap:<init>	()V
    //   26: aastore
    //   27: iinc 2 1
    //   30: goto -24 -> 6
    //   33: astore_1
    //   34: goto +262 -> 296
    //   37: astore_1
    //   38: goto +225 -> 263
    //   41: astore_1
    //   42: goto +221 -> 263
    //   45: aload_1
    //   46: astore_3
    //   47: aload_0
    //   48: getfield 831	T/a:e	Z
    //   51: ifne +24 -> 75
    //   54: new 820	java/io/BufferedInputStream
    //   57: astore_3
    //   58: aload_3
    //   59: aload_1
    //   60: sipush 5000
    //   63: invokespecial 821	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   66: aload_0
    //   67: aload_0
    //   68: aload_3
    //   69: invokevirtual 900	T/a:g	(Ljava/io/BufferedInputStream;)I
    //   72: putfield 902	T/a:d	I
    //   75: aload_0
    //   76: getfield 902	T/a:d	I
    //   79: invokestatic 904	T/a:L	(I)Z
    //   82: ifeq +96 -> 178
    //   85: new 20	T/a$f
    //   88: astore_1
    //   89: aload_1
    //   90: aload_3
    //   91: invokespecial 906	T/a$f:<init>	(Ljava/io/InputStream;)V
    //   94: aload_0
    //   95: getfield 831	T/a:e	Z
    //   98: ifeq +11 -> 109
    //   101: aload_0
    //   102: aload_1
    //   103: invokevirtual 909	T/a:n	(LT/a$f;)V
    //   106: goto +55 -> 161
    //   109: aload_0
    //   110: getfield 902	T/a:d	I
    //   113: istore_2
    //   114: iload_2
    //   115: bipush 12
    //   117: if_icmpne +11 -> 128
    //   120: aload_0
    //   121: aload_1
    //   122: invokevirtual 911	T/a:e	(LT/a$f;)V
    //   125: goto +36 -> 161
    //   128: iload_2
    //   129: bipush 7
    //   131: if_icmpne +11 -> 142
    //   134: aload_0
    //   135: aload_1
    //   136: invokevirtual 913	T/a:h	(LT/a$f;)V
    //   139: goto +22 -> 161
    //   142: iload_2
    //   143: bipush 10
    //   145: if_icmpne +11 -> 156
    //   148: aload_0
    //   149: aload_1
    //   150: invokevirtual 915	T/a:m	(LT/a$f;)V
    //   153: goto +8 -> 161
    //   156: aload_0
    //   157: aload_1
    //   158: invokevirtual 917	T/a:k	(LT/a$f;)V
    //   161: aload_1
    //   162: aload_0
    //   163: getfield 919	T/a:p	I
    //   166: i2l
    //   167: invokevirtual 922	T/a$f:h	(J)V
    //   170: aload_0
    //   171: aload_1
    //   172: invokevirtual 925	T/a:K	(LT/a$b;)V
    //   175: goto +71 -> 246
    //   178: new 8	T/a$b
    //   181: astore_1
    //   182: aload_1
    //   183: aload_3
    //   184: invokespecial 926	T/a$b:<init>	(Ljava/io/InputStream;)V
    //   187: aload_0
    //   188: getfield 902	T/a:d	I
    //   191: istore_2
    //   192: iload_2
    //   193: iconst_4
    //   194: if_icmpne +13 -> 207
    //   197: aload_0
    //   198: aload_1
    //   199: iconst_0
    //   200: iconst_0
    //   201: invokevirtual 929	T/a:f	(LT/a$b;II)V
    //   204: goto +42 -> 246
    //   207: iload_2
    //   208: bipush 13
    //   210: if_icmpne +11 -> 221
    //   213: aload_0
    //   214: aload_1
    //   215: invokevirtual 931	T/a:i	(LT/a$b;)V
    //   218: goto +28 -> 246
    //   221: iload_2
    //   222: bipush 9
    //   224: if_icmpne +11 -> 235
    //   227: aload_0
    //   228: aload_1
    //   229: invokevirtual 933	T/a:j	(LT/a$b;)V
    //   232: goto +14 -> 246
    //   235: iload_2
    //   236: bipush 14
    //   238: if_icmpne +8 -> 246
    //   241: aload_0
    //   242: aload_1
    //   243: invokevirtual 935	T/a:o	(LT/a$b;)V
    //   246: aload_0
    //   247: invokevirtual 937	T/a:a	()V
    //   250: getstatic 125	T/a:u	Z
    //   253: ifeq +42 -> 295
    //   256: aload_0
    //   257: invokevirtual 939	T/a:E	()V
    //   260: goto +35 -> 295
    //   263: getstatic 125	T/a:u	Z
    //   266: istore 4
    //   268: iload 4
    //   270: ifeq +13 -> 283
    //   273: ldc 117
    //   275: ldc_w 941
    //   278: aload_1
    //   279: invokestatic 944	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   282: pop
    //   283: aload_0
    //   284: invokevirtual 937	T/a:a	()V
    //   287: iload 4
    //   289: ifeq +6 -> 295
    //   292: goto -36 -> 256
    //   295: return
    //   296: aload_0
    //   297: invokevirtual 937	T/a:a	()V
    //   300: getstatic 125	T/a:u	Z
    //   303: ifeq +7 -> 310
    //   306: aload_0
    //   307: invokevirtual 939	T/a:E	()V
    //   310: aload_1
    //   311: athrow
    //   312: new 850	java/lang/NullPointerException
    //   315: dup
    //   316: ldc_w 946
    //   319: invokespecial 855	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   322: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	this	a
    //   0	323	1	paramInputStream	InputStream
    //   5	234	2	i1	int
    //   46	138	3	localObject	Object
    //   266	22	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	27	33	finally
    //   47	75	33	finally
    //   75	106	33	finally
    //   109	114	33	finally
    //   120	125	33	finally
    //   134	139	33	finally
    //   148	153	33	finally
    //   156	161	33	finally
    //   161	175	33	finally
    //   178	192	33	finally
    //   197	204	33	finally
    //   213	218	33	finally
    //   227	232	33	finally
    //   241	246	33	finally
    //   263	268	33	finally
    //   273	283	33	finally
    //   6	27	37	java/lang/UnsupportedOperationException
    //   47	75	37	java/lang/UnsupportedOperationException
    //   75	106	37	java/lang/UnsupportedOperationException
    //   109	114	37	java/lang/UnsupportedOperationException
    //   120	125	37	java/lang/UnsupportedOperationException
    //   134	139	37	java/lang/UnsupportedOperationException
    //   148	153	37	java/lang/UnsupportedOperationException
    //   156	161	37	java/lang/UnsupportedOperationException
    //   161	175	37	java/lang/UnsupportedOperationException
    //   178	192	37	java/lang/UnsupportedOperationException
    //   197	204	37	java/lang/UnsupportedOperationException
    //   213	218	37	java/lang/UnsupportedOperationException
    //   227	232	37	java/lang/UnsupportedOperationException
    //   241	246	37	java/lang/UnsupportedOperationException
    //   6	27	41	java/io/IOException
    //   47	75	41	java/io/IOException
    //   75	106	41	java/io/IOException
    //   109	114	41	java/io/IOException
    //   120	125	41	java/io/IOException
    //   134	139	41	java/io/IOException
    //   148	153	41	java/io/IOException
    //   156	161	41	java/io/IOException
    //   161	175	41	java/io/IOException
    //   178	192	41	java/io/IOException
    //   197	204	41	java/io/IOException
    //   213	218	41	java/io/IOException
    //   227	232	41	java/io/IOException
    //   241	246	41	java/io/IOException
  }
  
  public final void D(b paramb)
  {
    ByteOrder localByteOrder = F(paramb);
    h = localByteOrder;
    paramb.c(localByteOrder);
    int i1 = paramb.readUnsignedShort();
    int i2 = d;
    if ((i2 != 7) && (i2 != 10) && (i1 != 42))
    {
      paramb = new StringBuilder();
      paramb.append("Invalid start code: ");
      paramb.append(Integer.toHexString(i1));
      throw new IOException(paramb.toString());
    }
    i2 = paramb.readInt();
    if (i2 >= 8)
    {
      i2 -= 8;
      if (i2 > 0) {
        paramb.e(i2);
      }
      return;
    }
    paramb = new StringBuilder();
    paramb.append("Invalid first Ifd offset: ");
    paramb.append(i2);
    throw new IOException(paramb.toString());
  }
  
  public final void E()
  {
    for (int i1 = 0; i1 < f.length; i1++)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("The size of tag group[");
      ((StringBuilder)localObject).append(i1);
      ((StringBuilder)localObject).append("]: ");
      ((StringBuilder)localObject).append(f[i1].size());
      Log.d("ExifInterface", ((StringBuilder)localObject).toString());
      Iterator localIterator = f[i1].entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        c localc = (c)((Map.Entry)localObject).getValue();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("tagName: ");
        localStringBuilder.append((String)((Map.Entry)localObject).getKey());
        localStringBuilder.append(", tagType: ");
        localStringBuilder.append(localc.toString());
        localStringBuilder.append(", tagValue: '");
        localStringBuilder.append(localc.j(h));
        localStringBuilder.append("'");
        Log.d("ExifInterface", localStringBuilder.toString());
      }
    }
  }
  
  public final ByteOrder F(b paramb)
  {
    int i1 = paramb.readShort();
    if (i1 != 18761)
    {
      if (i1 == 19789)
      {
        if (u) {
          Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
      }
      paramb = new StringBuilder();
      paramb.append("Invalid byte order: ");
      paramb.append(Integer.toHexString(i1));
      throw new IOException(paramb.toString());
    }
    if (u) {
      Log.d("ExifInterface", "readExifSegment: Byte Align II");
    }
    return ByteOrder.LITTLE_ENDIAN;
  }
  
  public final void G(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = new f(paramArrayOfByte);
    D(paramArrayOfByte);
    H(paramArrayOfByte, paramInt);
  }
  
  public final void H(f paramf, int paramInt)
  {
    g.add(Integer.valueOf(q));
    int i1 = paramf.readShort();
    Object localObject1;
    if (u)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("numberOfDirectoryEntry: ");
      ((StringBuilder)localObject1).append(i1);
      Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
    }
    if (i1 <= 0) {
      return;
    }
    label493:
    label535:
    label647:
    label936:
    label1020:
    label1139:
    label1325:
    for (int i2 = 0;; i2 = (short)(i2 + 1))
    {
      int i3 = paramInt;
      if (i2 >= i1) {
        break;
      }
      int i4 = paramf.readUnsignedShort();
      int i5 = paramf.readUnsignedShort();
      int i6 = paramf.readInt();
      long l1 = paramf.a() + 4L;
      Object localObject2 = (d)k0[i3].get(Integer.valueOf(i4));
      bool = u;
      if (bool)
      {
        if (localObject2 != null) {}
        for (localObject1 = b;; localObject1 = null) {
          break;
        }
        Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i4), localObject1, Integer.valueOf(i5), Integer.valueOf(i6) }));
      }
      if (localObject2 == null) {
        if (bool)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Skip the tag entry since tag number is not defined: ");
          ((StringBuilder)localObject1).append(i4);
        }
      }
      for (localObject1 = ((StringBuilder)localObject1).toString();; localObject1 = ((StringBuilder)localObject1).toString())
      {
        Log.d("ExifInterface", (String)localObject1);
        do
        {
          break label535;
          if (i5 > 0)
          {
            localObject1 = W;
            if (i5 >= localObject1.length) {
              break label493;
            }
          }
          if (((d)localObject2).a(i5)) {
            break;
          }
        } while (!bool);
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Skip the tag entry since data format (");
        ((StringBuilder)localObject1).append(V[i5]);
        ((StringBuilder)localObject1).append(") is unexpected for tag: ");
        ((StringBuilder)localObject1).append(b);
      }
      int i7 = i5;
      if (i5 == 7) {
        i7 = c;
      }
      l2 = i6;
      long l3 = localObject1[i7] * l2;
      int i8;
      if ((l3 >= 0L) && (l3 <= 2147483647L))
      {
        i8 = 1;
        l2 = l3;
      }
      else
      {
        l2 = l3;
        i5 = i7;
        if (bool)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Skip the tag entry since the number of components is invalid: ");
          ((StringBuilder)localObject1).append(i6);
          Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
          i5 = i7;
        }
        for (l2 = l3;; l2 = 0L)
        {
          i8 = 0;
          i7 = i5;
          break;
          if (bool)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Skip the tag entry since data format is invalid: ");
            ((StringBuilder)localObject1).append(i5);
            Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
          }
        }
      }
      if (i8 == 0) {}
      for (;;)
      {
        paramf.h(l1);
        do
        {
          for (;;)
          {
            break label1325;
            Object localObject3;
            if (l2 > 4L)
            {
              i5 = paramf.readInt();
              if (bool)
              {
                localObject1 = new StringBuilder();
                ((StringBuilder)localObject1).append("seek to data offset: ");
                ((StringBuilder)localObject1).append(i5);
                Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
              }
              if (d == 7)
              {
                if (!"MakerNote".equals(b)) {
                  break label647;
                }
                q = i5;
              }
              for (;;)
              {
                break;
                if ((i3 == 6) && ("ThumbnailImage".equals(b)))
                {
                  r = i5;
                  s = i6;
                  localObject1 = c.f(6, h);
                  localObject3 = c.b(r, h);
                  c localc = c.b(s, h);
                  f[4].put("Compression", localObject1);
                  f[4].put("JPEGInterchangeFormat", localObject3);
                  f[4].put("JPEGInterchangeFormatLength", localc);
                }
              }
              paramf.h(i5);
            }
            localObject1 = (Integer)n0.get(Integer.valueOf(i4));
            if (bool)
            {
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append("nextIfdType: ");
              ((StringBuilder)localObject3).append(localObject1);
              ((StringBuilder)localObject3).append(" byteCount: ");
              ((StringBuilder)localObject3).append(l2);
              Log.d("ExifInterface", ((StringBuilder)localObject3).toString());
            }
            if (localObject1 == null) {
              break;
            }
            if (i7 != 3) {
              if (i7 != 4) {
                if (i7 != 8)
                {
                  if ((i7 != 9) && (i7 != 13))
                  {
                    l2 = -1L;
                    break label936;
                  }
                  i7 = paramf.readInt();
                }
              }
            }
            for (;;)
            {
              l2 = i7;
              break;
              i7 = paramf.readShort();
              continue;
              l2 = paramf.b();
              break;
              i7 = paramf.readUnsignedShort();
            }
            if (bool) {
              Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", new Object[] { Long.valueOf(l2), b }));
            }
            for (;;)
            {
              break;
            }
            if (l2 > 0L)
            {
              if (!g.contains(Integer.valueOf((int)l2)))
              {
                paramf.h(l2);
                H(paramf, ((Integer)localObject1).intValue());
                break label1139;
              }
              if (bool)
              {
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("Skip jump into the IFD since it has already been read: IfdType ");
                ((StringBuilder)localObject2).append(localObject1);
                ((StringBuilder)localObject2).append(" (at ");
                ((StringBuilder)localObject2).append(l2);
                ((StringBuilder)localObject2).append(")");
              }
            }
            for (localObject1 = ((StringBuilder)localObject2).toString();; localObject1 = ((StringBuilder)localObject1).toString())
            {
              Log.d("ExifInterface", (String)localObject1);
              break label1020;
              break label1020;
              if (!bool) {
                break;
              }
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Skip jump into the IFD since its offset is invalid: ");
              ((StringBuilder)localObject1).append(l2);
            }
            paramf.h(l1);
          }
          i5 = paramf.a();
          i8 = p;
          localObject1 = new byte[(int)l2];
          paramf.readFully((byte[])localObject1);
          localObject1 = new c(i7, i6, i5 + i8, (byte[])localObject1);
          f[paramInt].put(b, localObject1);
          if ("DNGVersion".equals(b)) {
            d = 3;
          }
          if (((!"Make".equals(b)) && (!"Model".equals(b))) || ((((c)localObject1).j(h).contains("PENTAX")) || (("Compression".equals(b)) && (((c)localObject1).i(h) == 65535)))) {
            d = 8;
          }
        } while (paramf.a() == l1);
      }
    }
    paramInt = paramf.readInt();
    boolean bool = u;
    if (bool) {
      Log.d("ExifInterface", String.format("nextIfdOffset: %d", new Object[] { Integer.valueOf(paramInt) }));
    }
    long l2 = paramInt;
    if (l2 > 0L)
    {
      if (!g.contains(Integer.valueOf(paramInt)))
      {
        paramf.h(l2);
        if (f[4].isEmpty()) {
          H(paramf, 4);
        } else if (f[5].isEmpty()) {
          H(paramf, 5);
        }
      }
      else if (bool)
      {
        localObject1 = new StringBuilder();
      }
    }
    else {
      for (paramf = "Stop reading file since re-reading an IFD may cause an infinite loop: ";; paramf = "Stop reading file since a wrong offset may cause an infinite loop: ")
      {
        ((StringBuilder)localObject1).append(paramf);
        ((StringBuilder)localObject1).append(paramInt);
        Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
        break;
        if (!bool) {
          break;
        }
        localObject1 = new StringBuilder();
      }
    }
  }
  
  public final void I(int paramInt, String paramString1, String paramString2)
  {
    if ((!f[paramInt].isEmpty()) && (f[paramInt].get(paramString1) != null))
    {
      HashMap localHashMap = f[paramInt];
      localHashMap.put(paramString2, localHashMap.get(paramString1));
      f[paramInt].remove(paramString1);
    }
  }
  
  public final void J(f paramf, int paramInt)
  {
    Object localObject = (c)f[paramInt].get("ImageLength");
    c localc = (c)f[paramInt].get("ImageWidth");
    if ((localObject == null) || (localc == null))
    {
      localc = (c)f[paramInt].get("JPEGInterchangeFormat");
      localObject = (c)f[paramInt].get("JPEGInterchangeFormatLength");
      if ((localc != null) && (localObject != null))
      {
        int i1 = localc.i(h);
        int i2 = localc.i(h);
        paramf.h(i1);
        localObject = new byte[i2];
        paramf.read((byte[])localObject);
        f(new b((byte[])localObject), i1, paramInt);
      }
    }
  }
  
  public final void K(b paramb)
  {
    HashMap localHashMap = f[4];
    c localc = (c)localHashMap.get("Compression");
    if (localc != null)
    {
      int i1 = localc.i(h);
      o = i1;
      if (i1 != 1)
      {
        if (i1 != 6) {
          if (i1 != 7) {
            return;
          }
        }
      }
      else
      {
        if (!z(localHashMap)) {
          return;
        }
        q(paramb, localHashMap);
        return;
      }
    }
    else
    {
      o = 6;
    }
    p(paramb, localHashMap);
  }
  
  public final void M(int paramInt1, int paramInt2)
  {
    if ((!f[paramInt1].isEmpty()) && (!f[paramInt2].isEmpty()))
    {
      c localc1 = (c)f[paramInt1].get("ImageLength");
      c localc2 = (c)f[paramInt1].get("ImageWidth");
      c localc3 = (c)f[paramInt2].get("ImageLength");
      Object localObject = (c)f[paramInt2].get("ImageWidth");
      if ((localc1 != null) && (localc2 != null))
      {
        if ((localc3 != null) && (localObject != null))
        {
          int i1 = localc1.i(h);
          int i2 = localc2.i(h);
          int i3 = localc3.i(h);
          int i4 = ((c)localObject).i(h);
          if ((i1 < i3) && (i2 < i4))
          {
            localObject = f;
            localc2 = localObject[paramInt1];
            localObject[paramInt1] = localObject[paramInt2];
            localObject[paramInt2] = localc2;
          }
        }
        else if (!u) {}
      }
      else {
        for (localObject = "Second image does not contain valid size information";; localObject = "First image does not contain valid size information")
        {
          Log.d("ExifInterface", (String)localObject);
          break;
          if (!u) {
            break;
          }
        }
      }
      return;
    }
    if (u) {
      Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
    }
  }
  
  public final void N(f paramf, int paramInt)
  {
    c localc1 = (c)f[paramInt].get("DefaultCropSize");
    c localc2 = (c)f[paramInt].get("SensorTopBorder");
    Object localObject1 = (c)f[paramInt].get("SensorLeftBorder");
    c localc3 = (c)f[paramInt].get("SensorBottomBorder");
    Object localObject2 = (c)f[paramInt].get("SensorRightBorder");
    if (localc1 != null)
    {
      if (a == 5)
      {
        localObject2 = (e[])localc1.k(h);
        if ((localObject2 != null) && (localObject2.length == 2))
        {
          localObject1 = c.d(localObject2[0], h);
          paramf = c.d(localObject2[1], h);
          break label246;
        }
        paramf = new StringBuilder();
        paramf.append("Invalid crop size values. cropSize=");
      }
      for (localObject1 = Arrays.toString((Object[])localObject2);; localObject1 = Arrays.toString((int[])localObject2))
      {
        paramf.append((String)localObject1);
        Log.w("ExifInterface", paramf.toString());
        return;
        localObject2 = (int[])localc1.k(h);
        if ((localObject2 != null) && (localObject2.length == 2))
        {
          localObject1 = c.f(localObject2[0], h);
          paramf = c.f(localObject2[1], h);
          label246:
          f[paramInt].put("ImageWidth", localObject1);
          f[paramInt].put("ImageLength", paramf);
          break;
        }
        paramf = new StringBuilder();
        paramf.append("Invalid crop size values. cropSize=");
      }
    }
    if ((localc2 != null) && (localObject1 != null) && (localc3 != null) && (localObject2 != null))
    {
      int i1 = localc2.i(h);
      int i2 = localc3.i(h);
      int i3 = ((c)localObject2).i(h);
      int i4 = ((c)localObject1).i(h);
      if ((i2 > i1) && (i3 > i4))
      {
        paramf = c.f(i2 - i1, h);
        localObject1 = c.f(i3 - i4, h);
        f[paramInt].put("ImageLength", paramf);
        f[paramInt].put("ImageWidth", localObject1);
      }
    }
    else
    {
      J(paramf, paramInt);
    }
  }
  
  public final void O()
  {
    M(0, 5);
    M(0, 4);
    M(5, 4);
    c localc = (c)f[1].get("PixelXDimension");
    Object localObject = (c)f[1].get("PixelYDimension");
    if ((localc != null) && (localObject != null))
    {
      f[0].put("ImageWidth", localc);
      f[0].put("ImageLength", localObject);
    }
    if ((f[4].isEmpty()) && (A(f[5])))
    {
      localObject = f;
      localObject[4] = localObject[5];
      localObject[5] = new HashMap();
    }
    if (!A(f[4])) {
      Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }
    I(0, "ThumbnailOrientation", "Orientation");
    I(0, "ThumbnailImageLength", "ImageLength");
    I(0, "ThumbnailImageWidth", "ImageWidth");
    I(5, "ThumbnailOrientation", "Orientation");
    I(5, "ThumbnailImageLength", "ImageLength");
    I(5, "ThumbnailImageWidth", "ImageWidth");
    I(4, "Orientation", "ThumbnailOrientation");
    I(4, "ImageLength", "ThumbnailImageLength");
    I(4, "ImageWidth", "ThumbnailImageWidth");
  }
  
  public final void a()
  {
    String str = b("DateTimeOriginal");
    if ((str != null) && (b("DateTime") == null)) {
      f[0].put("DateTime", c.a(str));
    }
    if (b("ImageWidth") == null) {
      f[0].put("ImageWidth", c.b(0L, h));
    }
    if (b("ImageLength") == null) {
      f[0].put("ImageLength", c.b(0L, h));
    }
    if (b("Orientation") == null) {
      f[0].put("Orientation", c.b(0L, h));
    }
    if (b("LightSource") == null) {
      f[1].put("LightSource", c.b(0L, h));
    }
  }
  
  public String b(String paramString)
  {
    Object localObject;
    if (paramString != null)
    {
      localObject = d(paramString);
      if (localObject != null)
      {
        if (!m0.contains(paramString)) {
          return ((c)localObject).j(h);
        }
        if (paramString.equals("GPSTimeStamp"))
        {
          int i1 = a;
          if ((i1 != 5) && (i1 != 10))
          {
            paramString = new StringBuilder();
            paramString.append("GPS Timestamp format is not rational. format=");
            paramString.append(a);
          }
          for (paramString = paramString.toString();; paramString = ((StringBuilder)localObject).toString())
          {
            Log.w("ExifInterface", paramString);
            return null;
            paramString = (e[])((c)localObject).k(h);
            if ((paramString != null) && (paramString.length == 3))
            {
              localObject = paramString[0];
              int i2 = (int)((float)a / (float)b);
              localObject = paramString[1];
              i1 = (int)((float)a / (float)b);
              paramString = paramString[2];
              return String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf(i2), Integer.valueOf(i1), Integer.valueOf((int)((float)a / (float)b)) });
            }
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Invalid GPS Timestamp array. array=");
            ((StringBuilder)localObject).append(Arrays.toString(paramString));
          }
        }
      }
    }
    try
    {
      paramString = Double.toString(((c)localObject).h(h));
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return null;
    throw new NullPointerException("tag shouldn't be null");
  }
  
  public int c(String paramString, int paramInt)
  {
    if (paramString != null)
    {
      paramString = d(paramString);
      if (paramString == null) {
        return paramInt;
      }
      try
      {
        int i1 = paramString.i(h);
        return i1;
      }
      catch (NumberFormatException paramString)
      {
        return paramInt;
      }
    }
    throw new NullPointerException("tag shouldn't be null");
  }
  
  public final c d(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString;
      if ("ISOSpeedRatings".equals(paramString))
      {
        if (u) {
          Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
        }
        str = "PhotographicSensitivity";
      }
      for (int i1 = 0; i1 < i0.length; i1++)
      {
        paramString = (c)f[i1].get(str);
        if (paramString != null) {
          return paramString;
        }
      }
      return null;
    }
    throw new NullPointerException("tag shouldn't be null");
  }
  
  public final void e(f paramf)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
      try
      {
        Object localObject1;
        Object localObject2;
        String str1;
        String str2;
        String str3;
        try
        {
          localObject1 = new T/a$a;
          ((a)localObject1).<init>(this, paramf);
          b.b.a(localMediaMetadataRetriever, (MediaDataSource)localObject1);
          localObject2 = localMediaMetadataRetriever.extractMetadata(33);
          str1 = localMediaMetadataRetriever.extractMetadata(34);
          localObject1 = localMediaMetadataRetriever.extractMetadata(26);
          str2 = localMediaMetadataRetriever.extractMetadata(17);
          if ("yes".equals(localObject1))
          {
            localObject1 = localMediaMetadataRetriever.extractMetadata(29);
            str2 = localMediaMetadataRetriever.extractMetadata(30);
            str3 = localMediaMetadataRetriever.extractMetadata(31);
          }
        }
        finally
        {
          break label530;
        }
        if ("yes".equals(str2))
        {
          localObject1 = localMediaMetadataRetriever.extractMetadata(18);
          str2 = localMediaMetadataRetriever.extractMetadata(19);
          str3 = localMediaMetadataRetriever.extractMetadata(24);
        }
        else
        {
          localObject1 = null;
          str2 = null;
          str3 = str2;
        }
        if (localObject1 != null) {
          f[0].put("ImageWidth", c.f(Integer.parseInt((String)localObject1), h));
        }
        if (str2 != null) {
          f[0].put("ImageLength", c.f(Integer.parseInt(str2), h));
        }
        int i1;
        if (str3 != null)
        {
          i1 = Integer.parseInt(str3);
          if (i1 != 90)
          {
            if (i1 != 180)
            {
              if (i1 != 270) {
                i1 = 1;
              } else {
                i1 = 8;
              }
            }
            else {
              i1 = 3;
            }
          }
          else {
            i1 = 6;
          }
          f[0].put("Orientation", c.f(i1, h));
        }
        if ((localObject2 != null) && (str1 != null))
        {
          i1 = Integer.parseInt((String)localObject2);
          int i2 = Integer.parseInt(str1);
          if (i2 > 6)
          {
            paramf.h(i1);
            localObject2 = new byte[6];
            if (paramf.read((byte[])localObject2) == 6)
            {
              i2 -= 6;
              if (Arrays.equals((byte[])localObject2, p0))
              {
                localObject2 = new byte[i2];
                if (paramf.read((byte[])localObject2) == i2)
                {
                  p = (i1 + 6);
                  G((byte[])localObject2, 0);
                }
                else
                {
                  paramf = new java/io/IOException;
                  paramf.<init>("Can't read exif");
                  throw paramf;
                }
              }
              else
              {
                paramf = new java/io/IOException;
                paramf.<init>("Invalid identifier");
                throw paramf;
              }
            }
            else
            {
              paramf = new java/io/IOException;
              paramf.<init>("Can't read identifier");
              throw paramf;
            }
          }
          else
          {
            paramf = new java/io/IOException;
            paramf.<init>("Invalid exif length");
            throw paramf;
          }
        }
        if (u)
        {
          paramf = new java/lang/StringBuilder;
          paramf.<init>();
          paramf.append("Heif meta: ");
          paramf.append((String)localObject1);
          paramf.append("x");
          paramf.append(str2);
          paramf.append(", rotation ");
          paramf.append(str3);
          Log.d("ExifInterface", paramf.toString());
        }
        localMediaMetadataRetriever.release();
        return;
      }
      catch (RuntimeException paramf)
      {
        paramf = new java/lang/UnsupportedOperationException;
        paramf.<init>("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
        throw paramf;
      }
      label530:
      localMediaMetadataRetriever.release();
      throw paramf;
    }
    throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
  }
  
  public final void f(b paramb, int paramInt1, int paramInt2)
  {
    Object localObject1;
    if (u)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("getJpegAttributes starting with: ");
      ((StringBuilder)localObject1).append(paramb);
      Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
    }
    paramb.c(ByteOrder.BIG_ENDIAN);
    int i1 = paramb.readByte();
    if (i1 == -1)
    {
      if (paramb.readByte() == -40)
      {
        int i2;
        for (i1 = 2;; i1 = i2 + i1)
        {
          i2 = paramb.readByte();
          if (i2 != -1) {
            break label805;
          }
          int i3 = paramb.readByte();
          boolean bool = u;
          if (bool)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Found JPEG segment indicator: ");
            ((StringBuilder)localObject1).append(Integer.toHexString(i3 & 0xFF));
            Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
          }
          if ((i3 == -39) || (i3 == -38)) {
            break label796;
          }
          int i4 = paramb.readUnsignedShort();
          int i5 = i4 - 2;
          i2 = i1 + 4;
          if (bool)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("JPEG segment: ");
            ((StringBuilder)localObject1).append(Integer.toHexString(i3 & 0xFF));
            ((StringBuilder)localObject1).append(" (length: ");
            ((StringBuilder)localObject1).append(i4);
            ((StringBuilder)localObject1).append(")");
            Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
          }
          if (i5 < 0) {
            break label785;
          }
          Object localObject2;
          if (i3 != -31)
          {
            if (i3 != -2)
            {
              switch (i3)
              {
              default: 
                switch (i3)
                {
                default: 
                  switch (i3)
                  {
                  default: 
                    switch (i3)
                    {
                    }
                    break;
                  }
                  break;
                }
                break;
              }
              for (i1 = i5;; i1 = i4 - 7)
              {
                break;
                paramb.e(1);
                localObject2 = f[paramInt2];
                if (paramInt2 != 4) {
                  localObject1 = "ImageLength";
                } else {
                  localObject1 = "ThumbnailImageLength";
                }
                ((HashMap)localObject2).put(localObject1, c.b(paramb.readUnsignedShort(), h));
                localObject2 = f[paramInt2];
                if (paramInt2 != 4) {
                  localObject1 = "ImageWidth";
                } else {
                  localObject1 = "ThumbnailImageWidth";
                }
                ((HashMap)localObject2).put(localObject1, c.b(paramb.readUnsignedShort(), h));
              }
            }
            localObject1 = new byte[i5];
            if (paramb.read((byte[])localObject1) == i5) {
              if (b("UserComment") == null) {
                f[1].put("UserComment", c.a(new String((byte[])localObject1, o0)));
              }
            }
          }
          for (i1 = i2;; i1 = i2 + i5)
          {
            i5 = 0;
            i2 = i1;
            i1 = i5;
            break;
            throw new IOException("Invalid exif");
            localObject2 = new byte[i5];
            paramb.readFully((byte[])localObject2);
            localObject1 = p0;
            if (b.c((byte[])localObject2, (byte[])localObject1))
            {
              localObject2 = Arrays.copyOfRange((byte[])localObject2, localObject1.length, i5);
              p = (paramInt1 + i2 + localObject1.length);
              G((byte[])localObject2, paramInt2);
              K(new b((byte[])localObject2));
            }
            for (;;)
            {
              break;
              localObject1 = q0;
              if (b.c((byte[])localObject2, (byte[])localObject1))
              {
                i1 = localObject1.length;
                localObject1 = Arrays.copyOfRange((byte[])localObject2, localObject1.length, i5);
                if (b("Xmp") == null)
                {
                  f[0].put("Xmp", new c(1, localObject1.length, i2 + i1, (byte[])localObject1));
                  t = true;
                }
              }
            }
          }
          if (i1 < 0) {
            break;
          }
          paramb.e(i1);
        }
        throw new IOException("Invalid length");
        label785:
        throw new IOException("Invalid length");
        label796:
        paramb.c(h);
        return;
        label805:
        paramb = new StringBuilder();
        paramb.append("Invalid marker:");
        paramb.append(Integer.toHexString(i2 & 0xFF));
        throw new IOException(paramb.toString());
      }
      paramb = new StringBuilder();
      paramb.append("Invalid marker: ");
      paramb.append(Integer.toHexString(i1 & 0xFF));
      throw new IOException(paramb.toString());
    }
    paramb = new StringBuilder();
    paramb.append("Invalid marker: ");
    paramb.append(Integer.toHexString(i1 & 0xFF));
    throw new IOException(paramb.toString());
  }
  
  public final int g(BufferedInputStream paramBufferedInputStream)
  {
    paramBufferedInputStream.mark(5000);
    byte[] arrayOfByte = new byte['ᎈ'];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    if (t(arrayOfByte)) {
      return 4;
    }
    if (w(arrayOfByte)) {
      return 9;
    }
    if (s(arrayOfByte)) {
      return 12;
    }
    if (u(arrayOfByte)) {
      return 7;
    }
    if (x(arrayOfByte)) {
      return 10;
    }
    if (v(arrayOfByte)) {
      return 13;
    }
    if (B(arrayOfByte)) {
      return 14;
    }
    return 0;
  }
  
  public final void h(f paramf)
  {
    k(paramf);
    paramf = (c)f[1].get("MakerNote");
    if (paramf != null)
    {
      f localf = new f(d);
      localf.c(h);
      paramf = E;
      byte[] arrayOfByte1 = new byte[paramf.length];
      localf.readFully(arrayOfByte1);
      localf.h(0L);
      byte[] arrayOfByte2 = F;
      Object localObject = new byte[arrayOfByte2.length];
      localf.readFully((byte[])localObject);
      if (Arrays.equals(arrayOfByte1, paramf)) {}
      for (long l1 = 8L;; l1 = 12L)
      {
        localf.h(l1);
        break;
        if (!Arrays.equals((byte[])localObject, arrayOfByte2)) {
          break;
        }
      }
      H(localf, 6);
      localObject = (c)f[7].get("PreviewImageStart");
      paramf = (c)f[7].get("PreviewImageLength");
      if ((localObject != null) && (paramf != null))
      {
        f[5].put("JPEGInterchangeFormat", localObject);
        f[5].put("JPEGInterchangeFormatLength", paramf);
      }
      paramf = (c)f[8].get("AspectFrame");
      if (paramf != null)
      {
        localObject = (int[])paramf.k(h);
        if ((localObject != null) && (localObject.length == 4))
        {
          int i1 = localObject[2];
          int i2 = localObject[0];
          if (i1 > i2)
          {
            int i3 = localObject[3];
            int i4 = localObject[1];
            if (i3 > i4)
            {
              i1 = i1 - i2 + 1;
              i2 = i3 - i4 + 1;
              i4 = i1;
              i3 = i2;
              if (i1 < i2)
              {
                i4 = i1 + i2;
                i3 = i4 - i2;
                i4 -= i3;
              }
              paramf = c.f(i4, h);
              localObject = c.f(i3, h);
              f[0].put("ImageWidth", paramf);
              f[0].put("ImageLength", localObject);
            }
          }
        }
        else
        {
          paramf = new StringBuilder();
          paramf.append("Invalid aspect frame values. frame=");
          paramf.append(Arrays.toString((int[])localObject));
          Log.w("ExifInterface", paramf.toString());
        }
      }
    }
  }
  
  public final void i(b paramb)
  {
    if (u)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("getPngAttributes starting with: ");
      ((StringBuilder)localObject1).append(paramb);
      Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
    }
    paramb.c(ByteOrder.BIG_ENDIAN);
    Object localObject1 = G;
    paramb.e(localObject1.length);
    int i1 = localObject1.length;
    try
    {
      for (;;)
      {
        int i2 = paramb.readInt();
        localObject1 = new byte[4];
        if (paramb.read((byte[])localObject1) != 4) {
          break;
        }
        i1 += 8;
        if ((i1 == 16) && (!Arrays.equals((byte[])localObject1, I)))
        {
          paramb = new java/io/IOException;
          paramb.<init>("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
          throw paramb;
        }
        if (!Arrays.equals((byte[])localObject1, J))
        {
          if (!Arrays.equals((byte[])localObject1, H)) {
            break label320;
          }
          localObject2 = new byte[i2];
          if (paramb.read((byte[])localObject2) != i2) {
            break label276;
          }
          i2 = paramb.readInt();
          paramb = new java/util/zip/CRC32;
          paramb.<init>();
          paramb.update((byte[])localObject1);
          paramb.update((byte[])localObject2);
          if ((int)paramb.getValue() == i2)
          {
            p = i1;
            G((byte[])localObject2, 0);
            O();
            paramb = new T/a$b;
            paramb.<init>((byte[])localObject2);
            K(paramb);
          }
        }
        else
        {
          return;
        }
        Object localObject2 = new java/io/IOException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
        ((StringBuilder)localObject1).append(i2);
        ((StringBuilder)localObject1).append(", calculated CRC value: ");
        ((StringBuilder)localObject1).append(paramb.getValue());
        ((IOException)localObject2).<init>(((StringBuilder)localObject1).toString());
        throw ((Throwable)localObject2);
        label276:
        paramb = new java/io/IOException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Failed to read given length for given PNG chunk type: ");
        ((StringBuilder)localObject2).append(b.a((byte[])localObject1));
        paramb.<init>(((StringBuilder)localObject2).toString());
        throw paramb;
        label320:
        i2 += 4;
        paramb.e(i2);
        i1 += i2;
      }
      paramb = new java/io/IOException;
      paramb.<init>("Encountered invalid length while parsing PNG chunktype");
      throw paramb;
    }
    catch (EOFException paramb)
    {
      throw new IOException("Encountered corrupt PNG file.");
    }
  }
  
  public final void j(b paramb)
  {
    boolean bool = u;
    if (bool)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("getRafAttributes starting with: ");
      ((StringBuilder)localObject).append(paramb);
      Log.d("ExifInterface", ((StringBuilder)localObject).toString());
    }
    paramb.e(84);
    Object localObject = new byte[4];
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[4];
    paramb.read((byte[])localObject);
    paramb.read(arrayOfByte1);
    paramb.read(arrayOfByte2);
    int i1 = ByteBuffer.wrap((byte[])localObject).getInt();
    int i2 = ByteBuffer.wrap(arrayOfByte1).getInt();
    int i3 = ByteBuffer.wrap(arrayOfByte2).getInt();
    localObject = new byte[i2];
    paramb.e(i1 - paramb.a());
    paramb.read((byte[])localObject);
    f(new b((byte[])localObject), i1, 5);
    paramb.e(i3 - paramb.a());
    paramb.c(ByteOrder.BIG_ENDIAN);
    i2 = paramb.readInt();
    if (bool)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("numberOfDirectoryEntry: ");
      ((StringBuilder)localObject).append(i2);
      Log.d("ExifInterface", ((StringBuilder)localObject).toString());
    }
    for (i3 = 0; i3 < i2; i3++)
    {
      int i4 = paramb.readUnsignedShort();
      i1 = paramb.readUnsignedShort();
      if (i4 == d0a)
      {
        i2 = paramb.readShort();
        i3 = paramb.readShort();
        localObject = c.f(i2, h);
        paramb = c.f(i3, h);
        f[0].put("ImageLength", localObject);
        f[0].put("ImageWidth", paramb);
        if (u)
        {
          paramb = new StringBuilder();
          paramb.append("Updated to length: ");
          paramb.append(i2);
          paramb.append(", width: ");
          paramb.append(i3);
          Log.d("ExifInterface", paramb.toString());
        }
        return;
      }
      paramb.e(i1);
    }
  }
  
  public final void k(f paramf)
  {
    D(paramf);
    H(paramf, 0);
    N(paramf, 0);
    N(paramf, 5);
    N(paramf, 4);
    O();
    if (d == 8)
    {
      paramf = (c)f[1].get("MakerNote");
      if (paramf != null)
      {
        paramf = new f(d);
        paramf.c(h);
        paramf.e(6);
        H(paramf, 9);
        paramf = (c)f[9].get("ColorSpace");
        if (paramf != null) {
          f[1].put("ColorSpace", paramf);
        }
      }
    }
  }
  
  public int l()
  {
    switch (c("Orientation", 1))
    {
    default: 
      return 0;
    case 6: 
    case 7: 
      return 90;
    case 5: 
    case 8: 
      return 270;
    }
    return 180;
  }
  
  public final void m(f paramf)
  {
    if (u)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("getRw2Attributes starting with: ");
      ((StringBuilder)localObject).append(paramf);
      Log.d("ExifInterface", ((StringBuilder)localObject).toString());
    }
    k(paramf);
    paramf = (c)f[0].get("JpgFromRaw");
    if (paramf != null) {
      f(new b(d), (int)c, 5);
    }
    paramf = (c)f[0].get("ISO");
    Object localObject = (c)f[1].get("PhotographicSensitivity");
    if ((paramf != null) && (localObject == null)) {
      f[1].put("PhotographicSensitivity", paramf);
    }
  }
  
  public final void n(f paramf)
  {
    byte[] arrayOfByte1 = p0;
    paramf.e(arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[paramf.available()];
    paramf.readFully(arrayOfByte2);
    p = arrayOfByte1.length;
    G(arrayOfByte2, 0);
  }
  
  public final void o(b paramb)
  {
    if (u)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("getWebpAttributes starting with: ");
      ((StringBuilder)localObject1).append(paramb);
      Log.d("ExifInterface", ((StringBuilder)localObject1).toString());
    }
    paramb.c(ByteOrder.LITTLE_ENDIAN);
    paramb.e(K.length);
    int i1 = paramb.readInt() + 8;
    Object localObject1 = L;
    paramb.e(localObject1.length);
    int i2 = localObject1.length + 8;
    try
    {
      for (;;)
      {
        localObject1 = new byte[4];
        if (paramb.read((byte[])localObject1) != 4) {
          break label268;
        }
        int i3 = paramb.readInt();
        int i4 = i2 + 8;
        if (Arrays.equals(M, (byte[])localObject1))
        {
          Object localObject2 = new byte[i3];
          if (paramb.read((byte[])localObject2) == i3)
          {
            p = i4;
            G((byte[])localObject2, 0);
            paramb = new T/a$b;
            paramb.<init>((byte[])localObject2);
            K(paramb);
          }
          else
          {
            localObject2 = new java/io/IOException;
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            paramb.append("Failed to read given length for given PNG chunk type: ");
            paramb.append(b.a((byte[])localObject1));
            ((IOException)localObject2).<init>(paramb.toString());
            throw ((Throwable)localObject2);
          }
        }
        else
        {
          i2 = i3;
          if (i3 % 2 == 1) {
            i2 = i3 + 1;
          }
          i3 = i4 + i2;
          if (i3 != i1) {
            break label236;
          }
        }
        return;
        label236:
        if (i3 > i1) {
          break;
        }
        paramb.e(i2);
        i2 = i3;
      }
      paramb = new java/io/IOException;
      paramb.<init>("Encountered WebP file with invalid chunk size");
      throw paramb;
      label268:
      paramb = new java/io/IOException;
      paramb.<init>("Encountered invalid length while parsing WebP chunktype");
      throw paramb;
    }
    catch (EOFException paramb)
    {
      throw new IOException("Encountered corrupt WebP file.");
    }
  }
  
  public final void p(b paramb, HashMap paramHashMap)
  {
    c localc = (c)paramHashMap.get("JPEGInterchangeFormat");
    paramHashMap = (c)paramHashMap.get("JPEGInterchangeFormatLength");
    if ((localc != null) && (paramHashMap != null))
    {
      int i1 = localc.i(h);
      int i2 = paramHashMap.i(h);
      int i3 = i1;
      if (d == 7) {
        i3 = i1 + q;
      }
      if ((i3 > 0) && (i2 > 0))
      {
        i = true;
        if ((a == null) && (c == null) && (b == null))
        {
          paramHashMap = new byte[i2];
          paramb.skip(i3);
          paramb.read(paramHashMap);
          n = paramHashMap;
        }
        l = i3;
        m = i2;
      }
      if (u)
      {
        paramb = new StringBuilder();
        paramb.append("Setting thumbnail attributes with offset: ");
        paramb.append(i3);
        paramb.append(", length: ");
        paramb.append(i2);
        Log.d("ExifInterface", paramb.toString());
      }
    }
  }
  
  public final void q(b paramb, HashMap paramHashMap)
  {
    Object localObject1 = (c)paramHashMap.get("StripOffsets");
    Object localObject2 = (c)paramHashMap.get("StripByteCounts");
    if ((localObject1 != null) && (localObject2 != null))
    {
      paramHashMap = b.b(((c)localObject1).k(h));
      localObject2 = b.b(((c)localObject2).k(h));
      if ((paramHashMap != null) && (paramHashMap.length != 0))
      {
        if ((localObject2 != null) && (localObject2.length != 0))
        {
          if (paramHashMap.length != localObject2.length)
          {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
          }
          int i1 = localObject2.length;
          long l1 = 0L;
          for (int i2 = 0; i2 < i1; i2++) {
            l1 += localObject2[i2];
          }
          int i3 = (int)l1;
          localObject1 = new byte[i3];
          k = true;
          j = true;
          i = true;
          int i4 = 0;
          i2 = i4;
          i1 = i2;
          int i5 = i2;
          for (i2 = i4; i2 < paramHashMap.length; i2++)
          {
            int i6 = (int)paramHashMap[i2];
            i4 = (int)localObject2[i2];
            if ((i2 < paramHashMap.length - 1) && (i6 + i4 != paramHashMap[(i2 + 1)])) {
              k = false;
            }
            i6 -= i5;
            if (i6 < 0)
            {
              Log.d("ExifInterface", "Invalid strip offset value");
              return;
            }
            l1 = i6;
            if (paramb.skip(l1) != l1)
            {
              paramb = new StringBuilder();
              paramb.append("Failed to skip ");
              paramb.append(i6);
              paramb.append(" bytes.");
              Log.d("ExifInterface", paramb.toString());
              return;
            }
            byte[] arrayOfByte = new byte[i4];
            if (paramb.read(arrayOfByte) != i4)
            {
              paramb = new StringBuilder();
              paramb.append("Failed to read ");
              paramb.append(i4);
              paramb.append(" bytes.");
              Log.d("ExifInterface", paramb.toString());
              return;
            }
            i5 = i5 + i6 + i4;
            System.arraycopy(arrayOfByte, 0, localObject1, i1, i4);
            i1 += i4;
          }
          n = ((byte[])localObject1);
          if (k)
          {
            l = ((int)paramHashMap[0]);
            m = i3;
          }
        }
        else
        {
          Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        }
      }
      else {
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
      }
    }
  }
  
  /* Error */
  public final boolean s(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_3
    //   5: astore 4
    //   7: new 8	T/a$b
    //   10: astore 5
    //   12: aload_3
    //   13: astore 4
    //   15: aload 5
    //   17: aload_1
    //   18: invokespecial 1165	T/a$b:<init>	([B)V
    //   21: aload 5
    //   23: invokevirtual 977	T/a$b:readInt	()I
    //   26: i2l
    //   27: lstore 6
    //   29: iconst_4
    //   30: newarray <illegal type>
    //   32: astore 4
    //   34: aload 5
    //   36: aload 4
    //   38: invokevirtual 865	java/io/InputStream:read	([B)I
    //   41: pop
    //   42: aload 4
    //   44: getstatic 151	T/a:B	[B
    //   47: invokestatic 1275	java/util/Arrays:equals	([B[B)Z
    //   50: istore 8
    //   52: iload 8
    //   54: ifne +10 -> 64
    //   57: aload 5
    //   59: invokevirtual 1462	java/io/InputStream:close	()V
    //   62: iconst_0
    //   63: ireturn
    //   64: lload 6
    //   66: lconst_1
    //   67: lcmp
    //   68: ifne +55 -> 123
    //   71: aload 5
    //   73: invokevirtual 1465	T/a$b:readLong	()J
    //   76: lstore 9
    //   78: ldc2_w 1466
    //   81: lstore 11
    //   83: lload 9
    //   85: lstore 6
    //   87: lload 9
    //   89: ldc2_w 1466
    //   92: lcmp
    //   93: ifge +35 -> 128
    //   96: aload 5
    //   98: invokevirtual 1462	java/io/InputStream:close	()V
    //   101: iconst_0
    //   102: ireturn
    //   103: astore_1
    //   104: aload 5
    //   106: astore 4
    //   108: goto +262 -> 370
    //   111: astore 4
    //   113: aload 5
    //   115: astore_1
    //   116: aload 4
    //   118: astore 5
    //   120: goto +217 -> 337
    //   123: ldc2_w 1348
    //   126: lstore 11
    //   128: lload 6
    //   130: lstore 9
    //   132: lload 6
    //   134: aload_1
    //   135: arraylength
    //   136: i2l
    //   137: lcmp
    //   138: ifle +12 -> 150
    //   141: aload_1
    //   142: arraylength
    //   143: istore 13
    //   145: iload 13
    //   147: i2l
    //   148: lstore 9
    //   150: lload 9
    //   152: lload 11
    //   154: lsub
    //   155: lstore 11
    //   157: lload 11
    //   159: ldc2_w 1348
    //   162: lcmp
    //   163: ifge +10 -> 173
    //   166: aload 5
    //   168: invokevirtual 1462	java/io/InputStream:close	()V
    //   171: iconst_0
    //   172: ireturn
    //   173: iconst_4
    //   174: newarray <illegal type>
    //   176: astore_1
    //   177: lconst_0
    //   178: lstore 6
    //   180: iconst_0
    //   181: istore 14
    //   183: iload 14
    //   185: istore 13
    //   187: lload 6
    //   189: lload 11
    //   191: ldc2_w 1064
    //   194: ldiv
    //   195: lcmp
    //   196: ifge +125 -> 321
    //   199: aload 5
    //   201: aload_1
    //   202: invokevirtual 865	java/io/InputStream:read	([B)I
    //   205: istore 15
    //   207: iload 15
    //   209: iconst_4
    //   210: if_icmpeq +10 -> 220
    //   213: aload 5
    //   215: invokevirtual 1462	java/io/InputStream:close	()V
    //   218: iconst_0
    //   219: ireturn
    //   220: lload 6
    //   222: lconst_1
    //   223: lcmp
    //   224: ifne +10 -> 234
    //   227: iload 13
    //   229: istore 16
    //   231: goto +77 -> 308
    //   234: aload_1
    //   235: getstatic 156	T/a:C	[B
    //   238: invokestatic 1275	java/util/Arrays:equals	([B[B)Z
    //   241: ifeq +9 -> 250
    //   244: iconst_1
    //   245: istore 15
    //   247: goto +28 -> 275
    //   250: aload_1
    //   251: getstatic 161	T/a:D	[B
    //   254: invokestatic 1275	java/util/Arrays:equals	([B[B)Z
    //   257: istore 8
    //   259: iload 14
    //   261: istore 15
    //   263: iload 8
    //   265: ifeq +10 -> 275
    //   268: iconst_1
    //   269: istore 13
    //   271: iload 14
    //   273: istore 15
    //   275: iload 15
    //   277: istore 14
    //   279: iload 13
    //   281: istore 16
    //   283: iload 15
    //   285: ifeq +23 -> 308
    //   288: iload 15
    //   290: istore 14
    //   292: iload 13
    //   294: istore 16
    //   296: iload 13
    //   298: ifeq +10 -> 308
    //   301: aload 5
    //   303: invokevirtual 1462	java/io/InputStream:close	()V
    //   306: iconst_1
    //   307: ireturn
    //   308: lload 6
    //   310: lconst_1
    //   311: ladd
    //   312: lstore 6
    //   314: iload 16
    //   316: istore 13
    //   318: goto -131 -> 187
    //   321: aload 5
    //   323: invokevirtual 1462	java/io/InputStream:close	()V
    //   326: goto +42 -> 368
    //   329: astore_1
    //   330: goto +40 -> 370
    //   333: astore 5
    //   335: aload_2
    //   336: astore_1
    //   337: aload_1
    //   338: astore 4
    //   340: getstatic 125	T/a:u	Z
    //   343: ifeq +17 -> 360
    //   346: aload_1
    //   347: astore 4
    //   349: ldc 117
    //   351: ldc_w 1469
    //   354: aload 5
    //   356: invokestatic 1471	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   359: pop
    //   360: aload_1
    //   361: ifnull +7 -> 368
    //   364: aload_1
    //   365: invokevirtual 1462	java/io/InputStream:close	()V
    //   368: iconst_0
    //   369: ireturn
    //   370: aload 4
    //   372: ifnull +8 -> 380
    //   375: aload 4
    //   377: invokevirtual 1462	java/io/InputStream:close	()V
    //   380: aload_1
    //   381: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	382	0	this	a
    //   0	382	1	paramArrayOfByte	byte[]
    //   1	335	2	localObject1	Object
    //   3	10	3	localObject2	Object
    //   5	102	4	localObject3	Object
    //   111	6	4	localException1	Exception
    //   338	38	4	arrayOfByte	byte[]
    //   10	312	5	localObject4	Object
    //   333	22	5	localException2	Exception
    //   27	286	6	l1	long
    //   50	214	8	bool	boolean
    //   76	75	9	l2	long
    //   81	109	11	l3	long
    //   143	174	13	i1	int
    //   181	110	14	i2	int
    //   205	84	15	i3	int
    //   229	86	16	i4	int
    // Exception table:
    //   from	to	target	type
    //   21	52	103	finally
    //   71	78	103	finally
    //   132	145	103	finally
    //   173	177	103	finally
    //   187	207	103	finally
    //   234	244	103	finally
    //   250	259	103	finally
    //   21	52	111	java/lang/Exception
    //   71	78	111	java/lang/Exception
    //   132	145	111	java/lang/Exception
    //   173	177	111	java/lang/Exception
    //   187	207	111	java/lang/Exception
    //   234	244	111	java/lang/Exception
    //   250	259	111	java/lang/Exception
    //   7	12	329	finally
    //   15	21	329	finally
    //   340	346	329	finally
    //   349	360	329	finally
    //   7	12	333	java/lang/Exception
    //   15	21	333	java/lang/Exception
  }
  
  /* Error */
  public final boolean u(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: new 8	T/a$b
    //   10: astore 5
    //   12: aload 5
    //   14: aload_1
    //   15: invokespecial 1165	T/a$b:<init>	([B)V
    //   18: aload_0
    //   19: aload 5
    //   21: invokevirtual 949	T/a:F	(LT/a$b;)Ljava/nio/ByteOrder;
    //   24: astore_1
    //   25: aload_0
    //   26: aload_1
    //   27: putfield 816	T/a:h	Ljava/nio/ByteOrder;
    //   30: aload 5
    //   32: aload_1
    //   33: invokevirtual 952	T/a$b:c	(Ljava/nio/ByteOrder;)V
    //   36: aload 5
    //   38: invokevirtual 1035	T/a$b:readShort	()S
    //   41: istore 6
    //   43: iload 6
    //   45: sipush 20306
    //   48: if_icmpeq +11 -> 59
    //   51: iload 6
    //   53: sipush 21330
    //   56: if_icmpne +5 -> 61
    //   59: iconst_1
    //   60: istore_2
    //   61: aload 5
    //   63: invokevirtual 1462	java/io/InputStream:close	()V
    //   66: iload_2
    //   67: ireturn
    //   68: astore_1
    //   69: goto +15 -> 84
    //   72: astore_1
    //   73: aload 5
    //   75: astore_1
    //   76: goto +20 -> 96
    //   79: astore_1
    //   80: aload 4
    //   82: astore 5
    //   84: aload 5
    //   86: ifnull +8 -> 94
    //   89: aload 5
    //   91: invokevirtual 1462	java/io/InputStream:close	()V
    //   94: aload_1
    //   95: athrow
    //   96: aload_1
    //   97: ifnull +7 -> 104
    //   100: aload_1
    //   101: invokevirtual 1462	java/io/InputStream:close	()V
    //   104: iconst_0
    //   105: ireturn
    //   106: astore_1
    //   107: aload_3
    //   108: astore_1
    //   109: goto -13 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	a
    //   0	112	1	paramArrayOfByte	byte[]
    //   1	66	2	bool	boolean
    //   3	105	3	localObject1	Object
    //   5	76	4	localObject2	Object
    //   10	80	5	localObject3	Object
    //   41	16	6	i1	int
    // Exception table:
    //   from	to	target	type
    //   18	43	68	finally
    //   18	43	72	java/lang/Exception
    //   7	18	79	finally
    //   7	18	106	java/lang/Exception
  }
  
  public final boolean v(byte[] paramArrayOfByte)
  {
    for (int i1 = 0;; i1++)
    {
      byte[] arrayOfByte = G;
      if (i1 >= arrayOfByte.length) {
        break;
      }
      if (paramArrayOfByte[i1] != arrayOfByte[i1]) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean w(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
    for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
      if (paramArrayOfByte[i1] != arrayOfByte[i1]) {
        return false;
      }
    }
    return true;
  }
  
  /* Error */
  public final boolean x(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: new 8	T/a$b
    //   10: astore 5
    //   12: aload 5
    //   14: aload_1
    //   15: invokespecial 1165	T/a$b:<init>	([B)V
    //   18: aload_0
    //   19: aload 5
    //   21: invokevirtual 949	T/a:F	(LT/a$b;)Ljava/nio/ByteOrder;
    //   24: astore_1
    //   25: aload_0
    //   26: aload_1
    //   27: putfield 816	T/a:h	Ljava/nio/ByteOrder;
    //   30: aload 5
    //   32: aload_1
    //   33: invokevirtual 952	T/a$b:c	(Ljava/nio/ByteOrder;)V
    //   36: aload 5
    //   38: invokevirtual 1035	T/a$b:readShort	()S
    //   41: istore 6
    //   43: iload 6
    //   45: bipush 85
    //   47: if_icmpne +5 -> 52
    //   50: iconst_1
    //   51: istore_2
    //   52: aload 5
    //   54: invokevirtual 1462	java/io/InputStream:close	()V
    //   57: iload_2
    //   58: ireturn
    //   59: astore_1
    //   60: goto +12 -> 72
    //   63: astore_1
    //   64: goto +20 -> 84
    //   67: astore_1
    //   68: aload 4
    //   70: astore 5
    //   72: aload 5
    //   74: ifnull +8 -> 82
    //   77: aload 5
    //   79: invokevirtual 1462	java/io/InputStream:close	()V
    //   82: aload_1
    //   83: athrow
    //   84: aload 5
    //   86: ifnull +8 -> 94
    //   89: aload 5
    //   91: invokevirtual 1462	java/io/InputStream:close	()V
    //   94: iconst_0
    //   95: ireturn
    //   96: astore_1
    //   97: aload_3
    //   98: astore 5
    //   100: goto -16 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	a
    //   0	103	1	paramArrayOfByte	byte[]
    //   1	57	2	bool	boolean
    //   3	95	3	localObject1	Object
    //   5	64	4	localObject2	Object
    //   10	89	5	localObject3	Object
    //   41	7	6	i1	int
    // Exception table:
    //   from	to	target	type
    //   18	43	59	finally
    //   18	43	63	java/lang/Exception
    //   7	18	67	finally
    //   7	18	96	java/lang/Exception
  }
  
  public final boolean z(HashMap paramHashMap)
  {
    Object localObject = (c)paramHashMap.get("BitsPerSample");
    if (localObject != null)
    {
      localObject = (int[])((c)localObject).k(h);
      int[] arrayOfInt = x;
      if (Arrays.equals(arrayOfInt, (int[])localObject)) {
        return true;
      }
      if (d == 3)
      {
        paramHashMap = (c)paramHashMap.get("PhotometricInterpretation");
        if (paramHashMap != null)
        {
          int i1 = paramHashMap.i(h);
          if (((i1 == 1) && (Arrays.equals((int[])localObject, z))) || ((i1 == 6) && (Arrays.equals((int[])localObject, arrayOfInt)))) {
            return true;
          }
        }
      }
    }
    if (u) {
      Log.d("ExifInterface", "Unsupported data type value");
    }
    return false;
  }
  
  public class a
    extends MediaDataSource
  {
    public long o;
    
    public a(a.f paramf) {}
    
    public void close() {}
    
    public long getSize()
    {
      return -1L;
    }
    
    public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        return 0;
      }
      if (paramLong < 0L) {
        return -1;
      }
      try
      {
        long l = o;
        if (l != paramLong)
        {
          if ((l >= 0L) && (paramLong >= l + p.available())) {
            return -1;
          }
          p.h(paramLong);
          o = paramLong;
        }
        int i = paramInt2;
        if (paramInt2 > p.available()) {
          i = p.available();
        }
        paramInt1 = p.read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 >= 0)
        {
          o += paramInt1;
          return paramInt1;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;) {}
      }
      o = -1L;
      return -1;
    }
  }
  
  public static class b
    extends InputStream
    implements DataInput
  {
    public static final ByteOrder s = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder t = ByteOrder.BIG_ENDIAN;
    public final DataInputStream o;
    public ByteOrder p = ByteOrder.BIG_ENDIAN;
    public int q;
    public byte[] r;
    
    public b(InputStream paramInputStream)
    {
      this(paramInputStream, ByteOrder.BIG_ENDIAN);
    }
    
    public b(InputStream paramInputStream, ByteOrder paramByteOrder)
    {
      paramInputStream = new DataInputStream(paramInputStream);
      o = paramInputStream;
      paramInputStream.mark(0);
      q = 0;
      p = paramByteOrder;
    }
    
    public b(byte[] paramArrayOfByte)
    {
      this(new ByteArrayInputStream(paramArrayOfByte), ByteOrder.BIG_ENDIAN);
    }
    
    public int a()
    {
      return q;
    }
    
    public int available()
    {
      return o.available();
    }
    
    public long b()
    {
      return readInt() & 0xFFFFFFFF;
    }
    
    public void c(ByteOrder paramByteOrder)
    {
      p = paramByteOrder;
    }
    
    public void e(int paramInt)
    {
      int i = 0;
      while (i < paramInt)
      {
        Object localObject = o;
        int j = paramInt - i;
        int k = (int)((InputStream)localObject).skip(j);
        int m = k;
        if (k <= 0)
        {
          if (r == null) {
            r = new byte[' '];
          }
          m = Math.min(8192, j);
          m = o.read(r, 0, m);
          if (m == -1)
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Reached EOF while skipping ");
            ((StringBuilder)localObject).append(paramInt);
            ((StringBuilder)localObject).append(" bytes.");
            throw new EOFException(((StringBuilder)localObject).toString());
          }
        }
        i += m;
      }
      q += i;
    }
    
    public void mark(int paramInt)
    {
      throw new UnsupportedOperationException("Mark is currently unsupported");
    }
    
    public int read()
    {
      q += 1;
      return o.read();
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt1 = o.read(paramArrayOfByte, paramInt1, paramInt2);
      q += paramInt1;
      return paramInt1;
    }
    
    public boolean readBoolean()
    {
      q += 1;
      return o.readBoolean();
    }
    
    public byte readByte()
    {
      q += 1;
      int i = o.read();
      if (i >= 0) {
        return (byte)i;
      }
      throw new EOFException();
    }
    
    public char readChar()
    {
      q += 2;
      return o.readChar();
    }
    
    public double readDouble()
    {
      return Double.longBitsToDouble(readLong());
    }
    
    public float readFloat()
    {
      return Float.intBitsToFloat(readInt());
    }
    
    public void readFully(byte[] paramArrayOfByte)
    {
      q += paramArrayOfByte.length;
      o.readFully(paramArrayOfByte);
    }
    
    public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      q += paramInt2;
      o.readFully(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public int readInt()
    {
      q += 4;
      int i = o.read();
      int j = o.read();
      int k = o.read();
      int m = o.read();
      if ((i | j | k | m) >= 0)
      {
        Object localObject = p;
        if (localObject == s) {
          return (m << 24) + (k << 16) + (j << 8) + i;
        }
        if (localObject == t) {
          return (i << 24) + (j << 16) + (k << 8) + m;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(p);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    
    public String readLine()
    {
      Log.d("ExifInterface", "Currently unsupported");
      return null;
    }
    
    public long readLong()
    {
      q += 8;
      int i = o.read();
      int j = o.read();
      int k = o.read();
      int m = o.read();
      int n = o.read();
      int i1 = o.read();
      int i2 = o.read();
      int i3 = o.read();
      if ((i | j | k | m | n | i1 | i2 | i3) >= 0)
      {
        Object localObject = p;
        if (localObject == s) {
          return (i3 << 56) + (i2 << 48) + (i1 << 40) + (n << 32) + (m << 24) + (k << 16) + (j << 8) + i;
        }
        if (localObject == t) {
          return (i << 56) + (j << 48) + (k << 40) + (m << 32) + (n << 24) + (i1 << 16) + (i2 << 8) + i3;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(p);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    
    public short readShort()
    {
      q += 2;
      int i = o.read();
      int j = o.read();
      if ((i | j) >= 0)
      {
        Object localObject = p;
        if (localObject == s) {
          return (short)((j << 8) + i);
        }
        if (localObject == t) {
          return (short)((i << 8) + j);
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(p);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    
    public String readUTF()
    {
      q += 2;
      return o.readUTF();
    }
    
    public int readUnsignedByte()
    {
      q += 1;
      return o.readUnsignedByte();
    }
    
    public int readUnsignedShort()
    {
      q += 2;
      int i = o.read();
      int j = o.read();
      if ((i | j) >= 0)
      {
        Object localObject = p;
        if (localObject == s) {
          return (j << 8) + i;
        }
        if (localObject == t) {
          return (i << 8) + j;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(p);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    
    public void reset()
    {
      throw new UnsupportedOperationException("Reset is currently unsupported");
    }
    
    public int skipBytes(int paramInt)
    {
      throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
  }
  
  public static class c
  {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;
    
    public c(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfByte)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramLong;
      d = paramArrayOfByte;
    }
    
    public c(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    {
      this(paramInt1, paramInt2, -1L, paramArrayOfByte);
    }
    
    public static c a(String paramString)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append('\000');
      paramString = localStringBuilder.toString().getBytes(a.o0);
      return new c(2, paramString.length, paramString);
    }
    
    public static c b(long paramLong, ByteOrder paramByteOrder)
    {
      return c(new long[] { paramLong }, paramByteOrder);
    }
    
    public static c c(long[] paramArrayOfLong, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.W[4] * paramArrayOfLong.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfLong.length;
      for (int j = 0; j < i; j++) {
        localByteBuffer.putInt((int)paramArrayOfLong[j]);
      }
      return new c(4, paramArrayOfLong.length, localByteBuffer.array());
    }
    
    public static c d(a.e parame, ByteOrder paramByteOrder)
    {
      return e(new a.e[] { parame }, paramByteOrder);
    }
    
    public static c e(a.e[] paramArrayOfe, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.W[5] * paramArrayOfe.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfe.length;
      for (int j = 0; j < i; j++)
      {
        paramByteOrder = paramArrayOfe[j];
        localByteBuffer.putInt((int)a);
        localByteBuffer.putInt((int)b);
      }
      return new c(5, paramArrayOfe.length, localByteBuffer.array());
    }
    
    public static c f(int paramInt, ByteOrder paramByteOrder)
    {
      return g(new int[] { paramInt }, paramByteOrder);
    }
    
    public static c g(int[] paramArrayOfInt, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[a.W[3] * paramArrayOfInt.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++) {
        localByteBuffer.putShort((short)paramArrayOfInt[j]);
      }
      return new c(3, paramArrayOfInt.length, localByteBuffer.array());
    }
    
    public double h(ByteOrder paramByteOrder)
    {
      paramByteOrder = k(paramByteOrder);
      if (paramByteOrder != null)
      {
        if ((paramByteOrder instanceof String)) {
          return Double.parseDouble((String)paramByteOrder);
        }
        if ((paramByteOrder instanceof long[]))
        {
          paramByteOrder = (long[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return paramByteOrder[0];
          }
          throw new NumberFormatException("There are more than one component");
        }
        if ((paramByteOrder instanceof int[]))
        {
          paramByteOrder = (int[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return paramByteOrder[0];
          }
          throw new NumberFormatException("There are more than one component");
        }
        if ((paramByteOrder instanceof double[]))
        {
          paramByteOrder = (double[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return paramByteOrder[0];
          }
          throw new NumberFormatException("There are more than one component");
        }
        if ((paramByteOrder instanceof a.e[]))
        {
          paramByteOrder = (a.e[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return paramByteOrder[0].a();
          }
          throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
      }
      throw new NumberFormatException("NULL can't be converted to a double value");
    }
    
    public int i(ByteOrder paramByteOrder)
    {
      paramByteOrder = k(paramByteOrder);
      if (paramByteOrder != null)
      {
        if ((paramByteOrder instanceof String)) {
          return Integer.parseInt((String)paramByteOrder);
        }
        if ((paramByteOrder instanceof long[]))
        {
          paramByteOrder = (long[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return (int)paramByteOrder[0];
          }
          throw new NumberFormatException("There are more than one component");
        }
        if ((paramByteOrder instanceof int[]))
        {
          paramByteOrder = (int[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return paramByteOrder[0];
          }
          throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
      }
      throw new NumberFormatException("NULL can't be converted to a integer value");
    }
    
    public String j(ByteOrder paramByteOrder)
    {
      Object localObject = k(paramByteOrder);
      if (localObject == null) {
        return null;
      }
      if ((localObject instanceof String)) {
        return (String)localObject;
      }
      paramByteOrder = new StringBuilder();
      boolean bool = localObject instanceof long[];
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      if (bool)
      {
        localObject = (long[])localObject;
        while (m < localObject.length)
        {
          paramByteOrder.append(localObject[m]);
          i = m + 1;
          m = i;
          if (i != localObject.length)
          {
            paramByteOrder.append(",");
            m = i;
          }
        }
        return paramByteOrder.toString();
      }
      if ((localObject instanceof int[]))
      {
        localObject = (int[])localObject;
        m = i;
        while (m < localObject.length)
        {
          paramByteOrder.append(localObject[m]);
          i = m + 1;
          m = i;
          if (i != localObject.length)
          {
            paramByteOrder.append(",");
            m = i;
          }
        }
        return paramByteOrder.toString();
      }
      if ((localObject instanceof double[]))
      {
        localObject = (double[])localObject;
        m = j;
        while (m < localObject.length)
        {
          paramByteOrder.append(localObject[m]);
          i = m + 1;
          m = i;
          if (i != localObject.length)
          {
            paramByteOrder.append(",");
            m = i;
          }
        }
        return paramByteOrder.toString();
      }
      if ((localObject instanceof a.e[]))
      {
        localObject = (a.e[])localObject;
        m = k;
        while (m < localObject.length)
        {
          paramByteOrder.append(a);
          paramByteOrder.append('/');
          paramByteOrder.append(b);
          i = m + 1;
          m = i;
          if (i != localObject.length)
          {
            paramByteOrder.append(",");
            m = i;
          }
        }
        return paramByteOrder.toString();
      }
      return null;
    }
    
    /* Error */
    public Object k(ByteOrder paramByteOrder)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: new 168	T/a$b
      //   5: astore_3
      //   6: aload_3
      //   7: aload_0
      //   8: getfield 26	T/a$c:d	[B
      //   11: invokespecial 171	T/a$b:<init>	([B)V
      //   14: aload_3
      //   15: astore_2
      //   16: aload_3
      //   17: aload_1
      //   18: invokevirtual 174	T/a$b:c	(Ljava/nio/ByteOrder;)V
      //   21: aload_3
      //   22: astore_2
      //   23: aload_0
      //   24: getfield 20	T/a$c:a	I
      //   27: istore 4
      //   29: iconst_0
      //   30: istore 5
      //   32: iconst_0
      //   33: istore 6
      //   35: iconst_0
      //   36: istore 7
      //   38: iconst_0
      //   39: istore 8
      //   41: iconst_0
      //   42: istore 9
      //   44: iconst_0
      //   45: istore 10
      //   47: iconst_0
      //   48: istore 11
      //   50: iconst_0
      //   51: istore 12
      //   53: iconst_0
      //   54: istore 13
      //   56: iload 4
      //   58: tableswitch	default:+62->120, 1:+761->819, 2:+588->646, 3:+529->587, 4:+470->528, 5:+399->457, 6:+761->819, 7:+588->646, 8:+340->398, 9:+281->339, 10:+208->266, 11:+148->206, 12:+81->139
      //   120: aload_3
      //   121: invokevirtual 179	java/io/InputStream:close	()V
      //   124: goto +13 -> 137
      //   127: astore_1
      //   128: ldc -75
      //   130: ldc -73
      //   132: aload_1
      //   133: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   136: pop
      //   137: aconst_null
      //   138: areturn
      //   139: aload_3
      //   140: astore_2
      //   141: aload_0
      //   142: getfield 22	T/a$c:b	I
      //   145: newarray <illegal type>
      //   147: astore_1
      //   148: aload_3
      //   149: astore_2
      //   150: iload 13
      //   152: aload_0
      //   153: getfield 22	T/a$c:b	I
      //   156: if_icmpge +31 -> 187
      //   159: aload_3
      //   160: astore_2
      //   161: aload_1
      //   162: iload 13
      //   164: aload_3
      //   165: invokevirtual 191	T/a$b:readDouble	()D
      //   168: dastore
      //   169: iinc 13 1
      //   172: goto -24 -> 148
      //   175: astore_1
      //   176: goto +789 -> 965
      //   179: astore_2
      //   180: aload_3
      //   181: astore_1
      //   182: aload_2
      //   183: astore_3
      //   184: goto +747 -> 931
      //   187: aload_3
      //   188: invokevirtual 179	java/io/InputStream:close	()V
      //   191: goto +13 -> 204
      //   194: astore_2
      //   195: ldc -75
      //   197: ldc -73
      //   199: aload_2
      //   200: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   203: pop
      //   204: aload_1
      //   205: areturn
      //   206: aload_3
      //   207: astore_2
      //   208: aload_0
      //   209: getfield 22	T/a$c:b	I
      //   212: newarray <illegal type>
      //   214: astore_1
      //   215: iload 5
      //   217: istore 13
      //   219: aload_3
      //   220: astore_2
      //   221: iload 13
      //   223: aload_0
      //   224: getfield 22	T/a$c:b	I
      //   227: if_icmpge +20 -> 247
      //   230: aload_3
      //   231: astore_2
      //   232: aload_1
      //   233: iload 13
      //   235: aload_3
      //   236: invokevirtual 195	T/a$b:readFloat	()F
      //   239: f2d
      //   240: dastore
      //   241: iinc 13 1
      //   244: goto -25 -> 219
      //   247: aload_3
      //   248: invokevirtual 179	java/io/InputStream:close	()V
      //   251: goto +13 -> 264
      //   254: astore_2
      //   255: ldc -75
      //   257: ldc -73
      //   259: aload_2
      //   260: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   263: pop
      //   264: aload_1
      //   265: areturn
      //   266: aload_3
      //   267: astore_2
      //   268: aload_0
      //   269: getfield 22	T/a$c:b	I
      //   272: anewarray 88	T/a$e
      //   275: astore_1
      //   276: iload 6
      //   278: istore 13
      //   280: aload_3
      //   281: astore_2
      //   282: iload 13
      //   284: aload_0
      //   285: getfield 22	T/a$c:b	I
      //   288: if_icmpge +32 -> 320
      //   291: aload_3
      //   292: astore_2
      //   293: aload_1
      //   294: iload 13
      //   296: new 88	T/a$e
      //   299: dup
      //   300: aload_3
      //   301: invokevirtual 199	T/a$b:readInt	()I
      //   304: i2l
      //   305: aload_3
      //   306: invokevirtual 199	T/a$b:readInt	()I
      //   309: i2l
      //   310: invokespecial 202	T/a$e:<init>	(JJ)V
      //   313: aastore
      //   314: iinc 13 1
      //   317: goto -37 -> 280
      //   320: aload_3
      //   321: invokevirtual 179	java/io/InputStream:close	()V
      //   324: goto +13 -> 337
      //   327: astore_2
      //   328: ldc -75
      //   330: ldc -73
      //   332: aload_2
      //   333: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   336: pop
      //   337: aload_1
      //   338: areturn
      //   339: aload_3
      //   340: astore_2
      //   341: aload_0
      //   342: getfield 22	T/a$c:b	I
      //   345: newarray <illegal type>
      //   347: astore_1
      //   348: iload 7
      //   350: istore 13
      //   352: aload_3
      //   353: astore_2
      //   354: iload 13
      //   356: aload_0
      //   357: getfield 22	T/a$c:b	I
      //   360: if_icmpge +19 -> 379
      //   363: aload_3
      //   364: astore_2
      //   365: aload_1
      //   366: iload 13
      //   368: aload_3
      //   369: invokevirtual 199	T/a$b:readInt	()I
      //   372: iastore
      //   373: iinc 13 1
      //   376: goto -24 -> 352
      //   379: aload_3
      //   380: invokevirtual 179	java/io/InputStream:close	()V
      //   383: goto +13 -> 396
      //   386: astore_2
      //   387: ldc -75
      //   389: ldc -73
      //   391: aload_2
      //   392: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   395: pop
      //   396: aload_1
      //   397: areturn
      //   398: aload_3
      //   399: astore_2
      //   400: aload_0
      //   401: getfield 22	T/a$c:b	I
      //   404: newarray <illegal type>
      //   406: astore_1
      //   407: iload 8
      //   409: istore 13
      //   411: aload_3
      //   412: astore_2
      //   413: iload 13
      //   415: aload_0
      //   416: getfield 22	T/a$c:b	I
      //   419: if_icmpge +19 -> 438
      //   422: aload_3
      //   423: astore_2
      //   424: aload_1
      //   425: iload 13
      //   427: aload_3
      //   428: invokevirtual 206	T/a$b:readShort	()S
      //   431: iastore
      //   432: iinc 13 1
      //   435: goto -24 -> 411
      //   438: aload_3
      //   439: invokevirtual 179	java/io/InputStream:close	()V
      //   442: goto +13 -> 455
      //   445: astore_2
      //   446: ldc -75
      //   448: ldc -73
      //   450: aload_2
      //   451: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   454: pop
      //   455: aload_1
      //   456: areturn
      //   457: aload_3
      //   458: astore_2
      //   459: aload_0
      //   460: getfield 22	T/a$c:b	I
      //   463: anewarray 88	T/a$e
      //   466: astore_1
      //   467: iload 9
      //   469: istore 13
      //   471: aload_3
      //   472: astore_2
      //   473: iload 13
      //   475: aload_0
      //   476: getfield 22	T/a$c:b	I
      //   479: if_icmpge +30 -> 509
      //   482: aload_3
      //   483: astore_2
      //   484: aload_1
      //   485: iload 13
      //   487: new 88	T/a$e
      //   490: dup
      //   491: aload_3
      //   492: invokevirtual 209	T/a$b:b	()J
      //   495: aload_3
      //   496: invokevirtual 209	T/a$b:b	()J
      //   499: invokespecial 202	T/a$e:<init>	(JJ)V
      //   502: aastore
      //   503: iinc 13 1
      //   506: goto -35 -> 471
      //   509: aload_3
      //   510: invokevirtual 179	java/io/InputStream:close	()V
      //   513: goto +13 -> 526
      //   516: astore_2
      //   517: ldc -75
      //   519: ldc -73
      //   521: aload_2
      //   522: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   525: pop
      //   526: aload_1
      //   527: areturn
      //   528: aload_3
      //   529: astore_2
      //   530: aload_0
      //   531: getfield 22	T/a$c:b	I
      //   534: newarray <illegal type>
      //   536: astore_1
      //   537: iload 10
      //   539: istore 13
      //   541: aload_3
      //   542: astore_2
      //   543: iload 13
      //   545: aload_0
      //   546: getfield 22	T/a$c:b	I
      //   549: if_icmpge +19 -> 568
      //   552: aload_3
      //   553: astore_2
      //   554: aload_1
      //   555: iload 13
      //   557: aload_3
      //   558: invokevirtual 209	T/a$b:b	()J
      //   561: lastore
      //   562: iinc 13 1
      //   565: goto -24 -> 541
      //   568: aload_3
      //   569: invokevirtual 179	java/io/InputStream:close	()V
      //   572: goto +13 -> 585
      //   575: astore_2
      //   576: ldc -75
      //   578: ldc -73
      //   580: aload_2
      //   581: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   584: pop
      //   585: aload_1
      //   586: areturn
      //   587: aload_3
      //   588: astore_2
      //   589: aload_0
      //   590: getfield 22	T/a$c:b	I
      //   593: newarray <illegal type>
      //   595: astore_1
      //   596: iload 11
      //   598: istore 13
      //   600: aload_3
      //   601: astore_2
      //   602: iload 13
      //   604: aload_0
      //   605: getfield 22	T/a$c:b	I
      //   608: if_icmpge +19 -> 627
      //   611: aload_3
      //   612: astore_2
      //   613: aload_1
      //   614: iload 13
      //   616: aload_3
      //   617: invokevirtual 212	T/a$b:readUnsignedShort	()I
      //   620: iastore
      //   621: iinc 13 1
      //   624: goto -24 -> 600
      //   627: aload_3
      //   628: invokevirtual 179	java/io/InputStream:close	()V
      //   631: goto +13 -> 644
      //   634: astore_2
      //   635: ldc -75
      //   637: ldc -73
      //   639: aload_2
      //   640: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   643: pop
      //   644: aload_1
      //   645: areturn
      //   646: aload_3
      //   647: astore_2
      //   648: iload 12
      //   650: istore 13
      //   652: aload_0
      //   653: getfield 22	T/a$c:b	I
      //   656: getstatic 215	T/a:X	[B
      //   659: arraylength
      //   660: if_icmplt +56 -> 716
      //   663: iconst_0
      //   664: istore 13
      //   666: aload_3
      //   667: astore_2
      //   668: getstatic 215	T/a:X	[B
      //   671: astore_1
      //   672: aload_3
      //   673: astore_2
      //   674: iload 13
      //   676: aload_1
      //   677: arraylength
      //   678: if_icmpge +32 -> 710
      //   681: aload_3
      //   682: astore_2
      //   683: aload_0
      //   684: getfield 26	T/a$c:d	[B
      //   687: iload 13
      //   689: baload
      //   690: aload_1
      //   691: iload 13
      //   693: baload
      //   694: if_icmpeq +10 -> 704
      //   697: iload 12
      //   699: istore 13
      //   701: goto +15 -> 716
      //   704: iinc 13 1
      //   707: goto -41 -> 666
      //   710: aload_3
      //   711: astore_2
      //   712: aload_1
      //   713: arraylength
      //   714: istore 13
      //   716: aload_3
      //   717: astore_2
      //   718: new 35	java/lang/StringBuilder
      //   721: astore_1
      //   722: aload_3
      //   723: astore_2
      //   724: aload_1
      //   725: invokespecial 36	java/lang/StringBuilder:<init>	()V
      //   728: aload_3
      //   729: astore_2
      //   730: iload 13
      //   732: aload_0
      //   733: getfield 22	T/a$c:b	I
      //   736: if_icmpge +57 -> 793
      //   739: aload_3
      //   740: astore_2
      //   741: aload_0
      //   742: getfield 26	T/a$c:d	[B
      //   745: iload 13
      //   747: baload
      //   748: istore 12
      //   750: iload 12
      //   752: ifne +6 -> 758
      //   755: goto +38 -> 793
      //   758: iload 12
      //   760: bipush 32
      //   762: if_icmplt +16 -> 778
      //   765: aload_3
      //   766: astore_2
      //   767: aload_1
      //   768: iload 12
      //   770: i2c
      //   771: invokevirtual 43	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
      //   774: pop
      //   775: goto +12 -> 787
      //   778: aload_3
      //   779: astore_2
      //   780: aload_1
      //   781: bipush 63
      //   783: invokevirtual 43	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
      //   786: pop
      //   787: iinc 13 1
      //   790: goto -62 -> 728
      //   793: aload_3
      //   794: astore_2
      //   795: aload_1
      //   796: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   799: astore_1
      //   800: aload_3
      //   801: invokevirtual 179	java/io/InputStream:close	()V
      //   804: goto +13 -> 817
      //   807: astore_2
      //   808: ldc -75
      //   810: ldc -73
      //   812: aload_2
      //   813: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   816: pop
      //   817: aload_1
      //   818: areturn
      //   819: aload_3
      //   820: astore_2
      //   821: aload_0
      //   822: getfield 26	T/a$c:d	[B
      //   825: astore_1
      //   826: aload_3
      //   827: astore_2
      //   828: aload_1
      //   829: arraylength
      //   830: iconst_1
      //   831: if_icmpne +60 -> 891
      //   834: aload_1
      //   835: iconst_0
      //   836: baload
      //   837: istore 13
      //   839: iload 13
      //   841: iflt +50 -> 891
      //   844: iload 13
      //   846: iconst_1
      //   847: if_icmpgt +44 -> 891
      //   850: aload_3
      //   851: astore_2
      //   852: new 53	java/lang/String
      //   855: dup
      //   856: iconst_1
      //   857: newarray <illegal type>
      //   859: dup
      //   860: iconst_0
      //   861: iload 13
      //   863: bipush 48
      //   865: iadd
      //   866: i2c
      //   867: castore
      //   868: invokespecial 218	java/lang/String:<init>	([C)V
      //   871: astore_1
      //   872: aload_3
      //   873: invokevirtual 179	java/io/InputStream:close	()V
      //   876: goto +13 -> 889
      //   879: astore_2
      //   880: ldc -75
      //   882: ldc -73
      //   884: aload_2
      //   885: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   888: pop
      //   889: aload_1
      //   890: areturn
      //   891: aload_3
      //   892: astore_2
      //   893: new 53	java/lang/String
      //   896: dup
      //   897: aload_1
      //   898: getstatic 51	T/a:o0	Ljava/nio/charset/Charset;
      //   901: invokespecial 221	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
      //   904: astore_1
      //   905: aload_3
      //   906: invokevirtual 179	java/io/InputStream:close	()V
      //   909: goto +13 -> 922
      //   912: astore_2
      //   913: ldc -75
      //   915: ldc -73
      //   917: aload_2
      //   918: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   921: pop
      //   922: aload_1
      //   923: areturn
      //   924: astore_1
      //   925: goto +40 -> 965
      //   928: astore_3
      //   929: aconst_null
      //   930: astore_1
      //   931: aload_1
      //   932: astore_2
      //   933: ldc -75
      //   935: ldc -33
      //   937: aload_3
      //   938: invokestatic 226	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   941: pop
      //   942: aload_1
      //   943: ifnull +20 -> 963
      //   946: aload_1
      //   947: invokevirtual 179	java/io/InputStream:close	()V
      //   950: goto +13 -> 963
      //   953: astore_1
      //   954: ldc -75
      //   956: ldc -73
      //   958: aload_1
      //   959: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   962: pop
      //   963: aconst_null
      //   964: areturn
      //   965: aload_2
      //   966: ifnull +20 -> 986
      //   969: aload_2
      //   970: invokevirtual 179	java/io/InputStream:close	()V
      //   973: goto +13 -> 986
      //   976: astore_2
      //   977: ldc -75
      //   979: ldc -73
      //   981: aload_2
      //   982: invokestatic 188	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   985: pop
      //   986: aload_1
      //   987: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	988	0	this	c
      //   0	988	1	paramByteOrder	ByteOrder
      //   1	160	2	localObject1	Object
      //   179	4	2	localIOException1	IOException
      //   194	6	2	localIOException2	IOException
      //   207	25	2	localObject2	Object
      //   254	6	2	localIOException3	IOException
      //   267	26	2	localObject3	Object
      //   327	6	2	localIOException4	IOException
      //   340	25	2	localObject4	Object
      //   386	6	2	localIOException5	IOException
      //   399	25	2	localObject5	Object
      //   445	6	2	localIOException6	IOException
      //   458	26	2	localObject6	Object
      //   516	6	2	localIOException7	IOException
      //   529	25	2	localObject7	Object
      //   575	6	2	localIOException8	IOException
      //   588	25	2	localObject8	Object
      //   634	6	2	localIOException9	IOException
      //   647	148	2	localObject9	Object
      //   807	6	2	localIOException10	IOException
      //   820	32	2	localObject10	Object
      //   879	6	2	localIOException11	IOException
      //   892	1	2	localObject11	Object
      //   912	6	2	localIOException12	IOException
      //   932	38	2	localByteOrder	ByteOrder
      //   976	6	2	localIOException13	IOException
      //   5	901	3	localObject12	Object
      //   928	10	3	localIOException14	IOException
      //   27	30	4	i	int
      //   30	186	5	j	int
      //   33	244	6	k	int
      //   36	313	7	m	int
      //   39	369	8	n	int
      //   42	426	9	i1	int
      //   45	493	10	i2	int
      //   48	549	11	i3	int
      //   51	718	12	i4	int
      //   54	812	13	i5	int
      // Exception table:
      //   from	to	target	type
      //   120	124	127	java/io/IOException
      //   16	21	175	finally
      //   23	29	175	finally
      //   141	148	175	finally
      //   150	159	175	finally
      //   161	169	175	finally
      //   208	215	175	finally
      //   221	230	175	finally
      //   232	241	175	finally
      //   268	276	175	finally
      //   282	291	175	finally
      //   293	314	175	finally
      //   341	348	175	finally
      //   354	363	175	finally
      //   365	373	175	finally
      //   400	407	175	finally
      //   413	422	175	finally
      //   424	432	175	finally
      //   459	467	175	finally
      //   473	482	175	finally
      //   484	503	175	finally
      //   530	537	175	finally
      //   543	552	175	finally
      //   554	562	175	finally
      //   589	596	175	finally
      //   602	611	175	finally
      //   613	621	175	finally
      //   652	663	175	finally
      //   668	672	175	finally
      //   674	681	175	finally
      //   683	697	175	finally
      //   712	716	175	finally
      //   718	722	175	finally
      //   724	728	175	finally
      //   730	739	175	finally
      //   741	750	175	finally
      //   767	775	175	finally
      //   780	787	175	finally
      //   795	800	175	finally
      //   821	826	175	finally
      //   828	834	175	finally
      //   852	872	175	finally
      //   893	905	175	finally
      //   933	942	175	finally
      //   16	21	179	java/io/IOException
      //   23	29	179	java/io/IOException
      //   141	148	179	java/io/IOException
      //   150	159	179	java/io/IOException
      //   161	169	179	java/io/IOException
      //   208	215	179	java/io/IOException
      //   221	230	179	java/io/IOException
      //   232	241	179	java/io/IOException
      //   268	276	179	java/io/IOException
      //   282	291	179	java/io/IOException
      //   293	314	179	java/io/IOException
      //   341	348	179	java/io/IOException
      //   354	363	179	java/io/IOException
      //   365	373	179	java/io/IOException
      //   400	407	179	java/io/IOException
      //   413	422	179	java/io/IOException
      //   424	432	179	java/io/IOException
      //   459	467	179	java/io/IOException
      //   473	482	179	java/io/IOException
      //   484	503	179	java/io/IOException
      //   530	537	179	java/io/IOException
      //   543	552	179	java/io/IOException
      //   554	562	179	java/io/IOException
      //   589	596	179	java/io/IOException
      //   602	611	179	java/io/IOException
      //   613	621	179	java/io/IOException
      //   652	663	179	java/io/IOException
      //   668	672	179	java/io/IOException
      //   674	681	179	java/io/IOException
      //   683	697	179	java/io/IOException
      //   712	716	179	java/io/IOException
      //   718	722	179	java/io/IOException
      //   724	728	179	java/io/IOException
      //   730	739	179	java/io/IOException
      //   741	750	179	java/io/IOException
      //   767	775	179	java/io/IOException
      //   780	787	179	java/io/IOException
      //   795	800	179	java/io/IOException
      //   821	826	179	java/io/IOException
      //   828	834	179	java/io/IOException
      //   852	872	179	java/io/IOException
      //   893	905	179	java/io/IOException
      //   187	191	194	java/io/IOException
      //   247	251	254	java/io/IOException
      //   320	324	327	java/io/IOException
      //   379	383	386	java/io/IOException
      //   438	442	445	java/io/IOException
      //   509	513	516	java/io/IOException
      //   568	572	575	java/io/IOException
      //   627	631	634	java/io/IOException
      //   800	804	807	java/io/IOException
      //   872	876	879	java/io/IOException
      //   905	909	912	java/io/IOException
      //   2	14	924	finally
      //   2	14	928	java/io/IOException
      //   946	950	953	java/io/IOException
      //   969	973	976	java/io/IOException
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("(");
      localStringBuilder.append(a.V[a]);
      localStringBuilder.append(", data length:");
      localStringBuilder.append(d.length);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static class d
  {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    
    public d(String paramString, int paramInt1, int paramInt2)
    {
      b = paramString;
      a = paramInt1;
      c = paramInt2;
      d = -1;
    }
    
    public d(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      b = paramString;
      a = paramInt1;
      c = paramInt2;
      d = paramInt3;
    }
    
    public boolean a(int paramInt)
    {
      int i = c;
      if ((i != 7) && (paramInt != 7) && (i != paramInt))
      {
        int j = d;
        if (j != paramInt)
        {
          if (((i == 4) || (j == 4)) && (paramInt == 3)) {
            return true;
          }
          if (((i == 9) || (j == 9)) && (paramInt == 8)) {
            return true;
          }
          return ((i == 12) || (j == 12)) && (paramInt == 11);
        }
      }
      return true;
    }
  }
  
  public static class e
  {
    public final long a;
    public final long b;
    
    public e(long paramLong1, long paramLong2)
    {
      if (paramLong2 == 0L)
      {
        a = 0L;
        b = 1L;
        return;
      }
      a = paramLong1;
      b = paramLong2;
    }
    
    public double a()
    {
      return a / b;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append("/");
      localStringBuilder.append(b);
      return localStringBuilder.toString();
    }
  }
  
  public static class f
    extends a.b
  {
    public f(InputStream paramInputStream)
    {
      super();
      if (paramInputStream.markSupported())
      {
        o.mark(Integer.MAX_VALUE);
        return;
      }
      throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
    
    public f(byte[] paramArrayOfByte)
    {
      super();
      o.mark(Integer.MAX_VALUE);
    }
    
    public void h(long paramLong)
    {
      int i = q;
      if (i > paramLong)
      {
        q = 0;
        o.reset();
      }
      else
      {
        paramLong -= i;
      }
      e((int)paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     T.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */