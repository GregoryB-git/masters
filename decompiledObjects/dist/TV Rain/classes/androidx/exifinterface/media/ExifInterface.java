package androidx.exifinterface.media;

import a;
import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public class ExifInterface
{
  public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
  public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
  public static final Charset ASCII;
  public static final int[] BITS_PER_SAMPLE_GREYSCALE_1;
  public static final int[] BITS_PER_SAMPLE_GREYSCALE_2;
  public static final int[] BITS_PER_SAMPLE_RGB;
  public static final short BYTE_ALIGN_II = 18761;
  public static final short BYTE_ALIGN_MM = 19789;
  public static final int COLOR_SPACE_S_RGB = 1;
  public static final int COLOR_SPACE_UNCALIBRATED = 65535;
  public static final short CONTRAST_HARD = 2;
  public static final short CONTRAST_NORMAL = 0;
  public static final short CONTRAST_SOFT = 1;
  public static final int DATA_DEFLATE_ZIP = 8;
  public static final int DATA_HUFFMAN_COMPRESSED = 2;
  public static final int DATA_JPEG = 6;
  public static final int DATA_JPEG_COMPRESSED = 7;
  public static final int DATA_LOSSY_JPEG = 34892;
  public static final int DATA_PACK_BITS_COMPRESSED = 32773;
  public static final int DATA_UNCOMPRESSED = 1;
  private static final boolean DEBUG = false;
  public static final byte[] EXIF_ASCII_PREFIX;
  private static final ExifTag[] EXIF_POINTER_TAGS;
  public static final ExifTag[][] EXIF_TAGS;
  public static final short EXPOSURE_MODE_AUTO = 0;
  public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
  public static final short EXPOSURE_MODE_MANUAL = 1;
  public static final short EXPOSURE_PROGRAM_ACTION = 6;
  public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
  public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
  public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
  public static final short EXPOSURE_PROGRAM_MANUAL = 1;
  public static final short EXPOSURE_PROGRAM_NORMAL = 2;
  public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
  public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
  public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
  public static final short FILE_SOURCE_DSC = 3;
  public static final short FILE_SOURCE_OTHER = 0;
  public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
  public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
  public static final short FLAG_FLASH_FIRED = 1;
  public static final short FLAG_FLASH_MODE_AUTO = 24;
  public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
  public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
  public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
  public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
  public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
  public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
  private static final List<Integer> FLIPPED_ROTATION_ORDER;
  public static final short FORMAT_CHUNKY = 1;
  public static final short FORMAT_PLANAR = 2;
  public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
  public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
  public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
  public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
  public static final short GAIN_CONTROL_NONE = 0;
  public static final String GPS_DIRECTION_MAGNETIC = "M";
  public static final String GPS_DIRECTION_TRUE = "T";
  public static final String GPS_DISTANCE_KILOMETERS = "K";
  public static final String GPS_DISTANCE_MILES = "M";
  public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
  public static final String GPS_MEASUREMENT_2D = "2";
  public static final String GPS_MEASUREMENT_3D = "3";
  public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
  public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
  public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
  public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
  public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
  public static final String GPS_SPEED_KNOTS = "N";
  public static final String GPS_SPEED_MILES_PER_HOUR = "M";
  public static final byte[] IDENTIFIER_EXIF_APP1;
  private static final ExifTag[] IFD_EXIF_TAGS;
  private static final int IFD_FORMAT_BYTE = 1;
  public static final int[] IFD_FORMAT_BYTES_PER_FORMAT;
  private static final int IFD_FORMAT_DOUBLE = 12;
  private static final int IFD_FORMAT_IFD = 13;
  public static final String[] IFD_FORMAT_NAMES;
  private static final int IFD_FORMAT_SBYTE = 6;
  private static final int IFD_FORMAT_SINGLE = 11;
  private static final int IFD_FORMAT_SLONG = 9;
  private static final int IFD_FORMAT_SRATIONAL = 10;
  private static final int IFD_FORMAT_SSHORT = 8;
  private static final int IFD_FORMAT_STRING = 2;
  private static final int IFD_FORMAT_ULONG = 4;
  private static final int IFD_FORMAT_UNDEFINED = 7;
  private static final int IFD_FORMAT_URATIONAL = 5;
  private static final int IFD_FORMAT_USHORT = 3;
  private static final ExifTag[] IFD_GPS_TAGS;
  private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
  private static final int IFD_OFFSET = 8;
  private static final ExifTag[] IFD_THUMBNAIL_TAGS;
  private static final ExifTag[] IFD_TIFF_TAGS;
  private static final int IFD_TYPE_EXIF = 1;
  private static final int IFD_TYPE_GPS = 2;
  private static final int IFD_TYPE_INTEROPERABILITY = 3;
  private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
  private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
  private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
  private static final int IFD_TYPE_PEF = 9;
  public static final int IFD_TYPE_PREVIEW = 5;
  public static final int IFD_TYPE_PRIMARY = 0;
  public static final int IFD_TYPE_THUMBNAIL = 4;
  private static final int IMAGE_TYPE_ARW = 1;
  private static final int IMAGE_TYPE_CR2 = 2;
  private static final int IMAGE_TYPE_DNG = 3;
  private static final int IMAGE_TYPE_JPEG = 4;
  private static final int IMAGE_TYPE_NEF = 5;
  private static final int IMAGE_TYPE_NRW = 6;
  private static final int IMAGE_TYPE_ORF = 7;
  private static final int IMAGE_TYPE_PEF = 8;
  private static final int IMAGE_TYPE_RAF = 9;
  private static final int IMAGE_TYPE_RW2 = 10;
  private static final int IMAGE_TYPE_SRW = 11;
  private static final int IMAGE_TYPE_UNKNOWN = 0;
  private static final ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG;
  private static final ExifTag JPEG_INTERCHANGE_FORMAT_TAG;
  public static final byte[] JPEG_SIGNATURE;
  public static final String LATITUDE_NORTH = "N";
  public static final String LATITUDE_SOUTH = "S";
  public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
  public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
  public static final short LIGHT_SOURCE_D50 = 23;
  public static final short LIGHT_SOURCE_D55 = 20;
  public static final short LIGHT_SOURCE_D65 = 21;
  public static final short LIGHT_SOURCE_D75 = 22;
  public static final short LIGHT_SOURCE_DAYLIGHT = 1;
  public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
  public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
  public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
  public static final short LIGHT_SOURCE_FLASH = 4;
  public static final short LIGHT_SOURCE_FLUORESCENT = 2;
  public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
  public static final short LIGHT_SOURCE_OTHER = 255;
  public static final short LIGHT_SOURCE_SHADE = 11;
  public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
  public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
  public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
  public static final short LIGHT_SOURCE_TUNGSTEN = 3;
  public static final short LIGHT_SOURCE_UNKNOWN = 0;
  public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
  public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
  public static final String LONGITUDE_EAST = "E";
  public static final String LONGITUDE_WEST = "W";
  public static final byte MARKER = -1;
  public static final byte MARKER_APP1 = -31;
  private static final byte MARKER_COM = -2;
  public static final byte MARKER_EOI = -39;
  private static final byte MARKER_SOF0 = -64;
  private static final byte MARKER_SOF1 = -63;
  private static final byte MARKER_SOF10 = -54;
  private static final byte MARKER_SOF11 = -53;
  private static final byte MARKER_SOF13 = -51;
  private static final byte MARKER_SOF14 = -50;
  private static final byte MARKER_SOF15 = -49;
  private static final byte MARKER_SOF2 = -62;
  private static final byte MARKER_SOF3 = -61;
  private static final byte MARKER_SOF5 = -59;
  private static final byte MARKER_SOF6 = -58;
  private static final byte MARKER_SOF7 = -57;
  private static final byte MARKER_SOF9 = -55;
  private static final byte MARKER_SOI = -40;
  private static final byte MARKER_SOS = -38;
  private static final int MAX_THUMBNAIL_SIZE = 512;
  public static final short METERING_MODE_AVERAGE = 1;
  public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
  public static final short METERING_MODE_MULTI_SPOT = 4;
  public static final short METERING_MODE_OTHER = 255;
  public static final short METERING_MODE_PARTIAL = 6;
  public static final short METERING_MODE_PATTERN = 5;
  public static final short METERING_MODE_SPOT = 3;
  public static final short METERING_MODE_UNKNOWN = 0;
  private static final ExifTag[] ORF_CAMERA_SETTINGS_TAGS;
  private static final ExifTag[] ORF_IMAGE_PROCESSING_TAGS;
  private static final byte[] ORF_MAKER_NOTE_HEADER_1;
  private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
  private static final byte[] ORF_MAKER_NOTE_HEADER_2;
  private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
  private static final ExifTag[] ORF_MAKER_NOTE_TAGS;
  private static final short ORF_SIGNATURE_1 = 20306;
  private static final short ORF_SIGNATURE_2 = 21330;
  public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
  public static final int ORIENTATION_FLIP_VERTICAL = 4;
  public static final int ORIENTATION_NORMAL = 1;
  public static final int ORIENTATION_ROTATE_180 = 3;
  public static final int ORIENTATION_ROTATE_270 = 8;
  public static final int ORIENTATION_ROTATE_90 = 6;
  public static final int ORIENTATION_TRANSPOSE = 5;
  public static final int ORIENTATION_TRANSVERSE = 7;
  public static final int ORIENTATION_UNDEFINED = 0;
  public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
  private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
  private static final String PEF_SIGNATURE = "PENTAX";
  private static final ExifTag[] PEF_TAGS;
  public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
  public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
  public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
  public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
  private static final int RAF_INFO_SIZE = 160;
  private static final int RAF_JPEG_LENGTH_VALUE_SIZE = 4;
  private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
  private static final String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
  public static final int REDUCED_RESOLUTION_IMAGE = 1;
  public static final short RENDERED_PROCESS_CUSTOM = 1;
  public static final short RENDERED_PROCESS_NORMAL = 0;
  public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
  public static final short RESOLUTION_UNIT_INCHES = 2;
  private static final List<Integer> ROTATION_ORDER;
  private static final short RW2_SIGNATURE = 85;
  public static final short SATURATION_HIGH = 0;
  public static final short SATURATION_LOW = 0;
  public static final short SATURATION_NORMAL = 0;
  public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
  public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
  public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
  public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
  public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
  public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
  public static final short SENSITIVITY_TYPE_REI = 2;
  public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
  public static final short SENSITIVITY_TYPE_SOS = 1;
  public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
  public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
  public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
  public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
  public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
  public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
  public static final short SENSOR_TYPE_NOT_DEFINED = 1;
  public static final short SENSOR_TYPE_ONE_CHIP = 2;
  public static final short SENSOR_TYPE_THREE_CHIP = 4;
  public static final short SENSOR_TYPE_TRILINEAR = 7;
  public static final short SENSOR_TYPE_TWO_CHIP = 3;
  public static final short SHARPNESS_HARD = 2;
  public static final short SHARPNESS_NORMAL = 0;
  public static final short SHARPNESS_SOFT = 1;
  private static final int SIGNATURE_CHECK_SIZE = 5000;
  public static final byte START_CODE = 42;
  public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
  public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
  public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
  public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
  private static final String TAG = "ExifInterface";
  public static final String TAG_APERTURE_VALUE = "ApertureValue";
  public static final String TAG_ARTIST = "Artist";
  public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
  public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
  public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
  public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
  public static final String TAG_CFA_PATTERN = "CFAPattern";
  public static final String TAG_COLOR_SPACE = "ColorSpace";
  public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
  public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
  public static final String TAG_COMPRESSION = "Compression";
  public static final String TAG_CONTRAST = "Contrast";
  public static final String TAG_COPYRIGHT = "Copyright";
  public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
  public static final String TAG_DATETIME = "DateTime";
  public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
  public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
  public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
  public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
  public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
  public static final String TAG_DNG_VERSION = "DNGVersion";
  private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
  public static final String TAG_EXIF_VERSION = "ExifVersion";
  public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
  public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
  public static final String TAG_EXPOSURE_MODE = "ExposureMode";
  public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
  public static final String TAG_EXPOSURE_TIME = "ExposureTime";
  public static final String TAG_FILE_SOURCE = "FileSource";
  public static final String TAG_FLASH = "Flash";
  public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
  public static final String TAG_FLASH_ENERGY = "FlashEnergy";
  public static final String TAG_FOCAL_LENGTH = "FocalLength";
  public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
  public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
  public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
  public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
  public static final String TAG_F_NUMBER = "FNumber";
  public static final String TAG_GAIN_CONTROL = "GainControl";
  public static final String TAG_GAMMA = "Gamma";
  public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
  public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
  public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
  public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
  public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
  public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
  public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
  public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
  public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
  public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
  public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
  public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
  public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
  public static final String TAG_GPS_DOP = "GPSDOP";
  public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
  public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
  public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
  private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
  public static final String TAG_GPS_LATITUDE = "GPSLatitude";
  public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
  public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
  public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
  public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
  public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
  public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
  public static final String TAG_GPS_SATELLITES = "GPSSatellites";
  public static final String TAG_GPS_SPEED = "GPSSpeed";
  public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
  public static final String TAG_GPS_STATUS = "GPSStatus";
  public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
  public static final String TAG_GPS_TRACK = "GPSTrack";
  public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
  public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
  private static final String TAG_HAS_THUMBNAIL = "HasThumbnail";
  public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
  public static final String TAG_IMAGE_LENGTH = "ImageLength";
  public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
  public static final String TAG_IMAGE_WIDTH = "ImageWidth";
  private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
  public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
  public static final String TAG_ISO_SPEED = "ISOSpeed";
  public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
  public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
  @Deprecated
  public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
  public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
  public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
  public static final String TAG_LENS_MAKE = "LensMake";
  public static final String TAG_LENS_MODEL = "LensModel";
  public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
  public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
  public static final String TAG_LIGHT_SOURCE = "LightSource";
  public static final String TAG_MAKE = "Make";
  public static final String TAG_MAKER_NOTE = "MakerNote";
  public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
  public static final String TAG_METERING_MODE = "MeteringMode";
  public static final String TAG_MODEL = "Model";
  public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
  public static final String TAG_OECF = "OECF";
  public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
  private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
  private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
  public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
  public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
  public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
  public static final String TAG_ORIENTATION = "Orientation";
  public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
  public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
  public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
  public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
  public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
  public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
  private static final ExifTag TAG_RAF_IMAGE_SIZE;
  public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
  public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
  public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
  public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
  public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
  public static final String TAG_RW2_ISO = "ISO";
  public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
  public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
  public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
  public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
  public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
  public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
  public static final String TAG_SATURATION = "Saturation";
  public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
  public static final String TAG_SCENE_TYPE = "SceneType";
  public static final String TAG_SENSING_METHOD = "SensingMethod";
  public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
  public static final String TAG_SHARPNESS = "Sharpness";
  public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
  public static final String TAG_SOFTWARE = "Software";
  public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
  public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
  public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
  public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
  public static final String TAG_STRIP_OFFSETS = "StripOffsets";
  public static final String TAG_SUBFILE_TYPE = "SubfileType";
  public static final String TAG_SUBJECT_AREA = "SubjectArea";
  public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
  public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
  public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
  public static final String TAG_SUBSEC_TIME = "SubSecTime";
  public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
  public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
  private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
  private static final String TAG_THUMBNAIL_DATA = "ThumbnailData";
  public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
  public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
  private static final String TAG_THUMBNAIL_LENGTH = "ThumbnailLength";
  private static final String TAG_THUMBNAIL_OFFSET = "ThumbnailOffset";
  public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
  public static final String TAG_USER_COMMENT = "UserComment";
  public static final String TAG_WHITE_BALANCE = "WhiteBalance";
  public static final String TAG_WHITE_POINT = "WhitePoint";
  public static final String TAG_X_RESOLUTION = "XResolution";
  public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
  public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
  public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
  public static final String TAG_Y_RESOLUTION = "YResolution";
  @Deprecated
  public static final int WHITEBALANCE_AUTO = 0;
  @Deprecated
  public static final int WHITEBALANCE_MANUAL = 1;
  public static final short WHITE_BALANCE_AUTO = 0;
  public static final short WHITE_BALANCE_MANUAL = 1;
  public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
  public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
  private static final HashMap<Integer, Integer> sExifPointerTagMap;
  private static final HashMap<Integer, ExifTag>[] sExifTagMapsForReading;
  private static final HashMap<String, ExifTag>[] sExifTagMapsForWriting;
  private static SimpleDateFormat sFormatter;
  private static final Pattern sGpsTimestampPattern = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
  private static final Pattern sNonZeroTimePattern;
  private static final HashSet<String> sTagSetForCompatibility;
  private final AssetManager.AssetInputStream mAssetInputStream;
  private final HashMap<String, ExifAttribute>[] mAttributes;
  private Set<Integer> mAttributesOffsets;
  private ByteOrder mExifByteOrder;
  private int mExifOffset;
  private final String mFilename;
  private boolean mHasThumbnail;
  private boolean mIsSupportedFile;
  private int mMimeType;
  private int mOrfMakerNoteOffset;
  private int mOrfThumbnailLength;
  private int mOrfThumbnailOffset;
  private int mRw2JpgFromRawOffset;
  private byte[] mThumbnailBytes;
  private int mThumbnailCompression;
  private int mThumbnailLength;
  private int mThumbnailOffset;
  
  static
  {
    Integer localInteger1 = Integer.valueOf(1);
    Integer localInteger2 = Integer.valueOf(3);
    Integer localInteger3 = Integer.valueOf(2);
    Integer localInteger4 = Integer.valueOf(8);
    ROTATION_ORDER = Arrays.asList(new Integer[] { localInteger1, Integer.valueOf(6), localInteger2, localInteger4 });
    Integer localInteger5 = Integer.valueOf(7);
    Integer localInteger6 = Integer.valueOf(5);
    FLIPPED_ROTATION_ORDER = Arrays.asList(new Integer[] { localInteger3, localInteger5, Integer.valueOf(4), localInteger6 });
    BITS_PER_SAMPLE_RGB = new int[] { 8, 8, 8 };
    BITS_PER_SAMPLE_GREYSCALE_1 = new int[] { 4 };
    BITS_PER_SAMPLE_GREYSCALE_2 = new int[] { 8 };
    JPEG_SIGNATURE = new byte[] { -1, -40, -1 };
    ORF_MAKER_NOTE_HEADER_1 = new byte[] { 79, 76, 89, 77, 80, 0 };
    ORF_MAKER_NOTE_HEADER_2 = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
    IFD_FORMAT_NAMES = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE" };
    IFD_FORMAT_BYTES_PER_FORMAT = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
    EXIF_ASCII_PREFIX = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
    ExifTag[] arrayOfExifTag1 = new ExifTag[41];
    arrayOfExifTag1[0] = new ExifTag("NewSubfileType", 254, 4);
    arrayOfExifTag1[1] = new ExifTag("SubfileType", 255, 4);
    arrayOfExifTag1[2] = new ExifTag("ImageWidth", 256, 3, 4);
    arrayOfExifTag1[3] = new ExifTag("ImageLength", 257, 3, 4);
    arrayOfExifTag1[4] = new ExifTag("BitsPerSample", 258, 3);
    arrayOfExifTag1[5] = new ExifTag("Compression", 259, 3);
    arrayOfExifTag1[6] = new ExifTag("PhotometricInterpretation", 262, 3);
    arrayOfExifTag1[7] = new ExifTag("ImageDescription", 270, 2);
    arrayOfExifTag1[8] = new ExifTag("Make", 271, 2);
    arrayOfExifTag1[9] = new ExifTag("Model", 272, 2);
    arrayOfExifTag1[10] = new ExifTag("StripOffsets", 273, 3, 4);
    arrayOfExifTag1[11] = new ExifTag("Orientation", 274, 3);
    arrayOfExifTag1[12] = new ExifTag("SamplesPerPixel", 277, 3);
    arrayOfExifTag1[13] = new ExifTag("RowsPerStrip", 278, 3, 4);
    arrayOfExifTag1[14] = new ExifTag("StripByteCounts", 279, 3, 4);
    arrayOfExifTag1[15] = new ExifTag("XResolution", 282, 5);
    arrayOfExifTag1[16] = new ExifTag("YResolution", 283, 5);
    arrayOfExifTag1[17] = new ExifTag("PlanarConfiguration", 284, 3);
    arrayOfExifTag1[18] = new ExifTag("ResolutionUnit", 296, 3);
    arrayOfExifTag1[19] = new ExifTag("TransferFunction", 301, 3);
    arrayOfExifTag1[20] = new ExifTag("Software", 305, 2);
    arrayOfExifTag1[21] = new ExifTag("DateTime", 306, 2);
    arrayOfExifTag1[22] = new ExifTag("Artist", 315, 2);
    arrayOfExifTag1[23] = new ExifTag("WhitePoint", 318, 5);
    arrayOfExifTag1[24] = new ExifTag("PrimaryChromaticities", 319, 5);
    arrayOfExifTag1[25] = new ExifTag("SubIFDPointer", 330, 4);
    arrayOfExifTag1[26] = new ExifTag("JPEGInterchangeFormat", 513, 4);
    arrayOfExifTag1[27] = new ExifTag("JPEGInterchangeFormatLength", 514, 4);
    arrayOfExifTag1[28] = new ExifTag("YCbCrCoefficients", 529, 5);
    arrayOfExifTag1[29] = new ExifTag("YCbCrSubSampling", 530, 3);
    arrayOfExifTag1[30] = new ExifTag("YCbCrPositioning", 531, 3);
    arrayOfExifTag1[31] = new ExifTag("ReferenceBlackWhite", 532, 5);
    arrayOfExifTag1[32] = new ExifTag("Copyright", 33432, 2);
    arrayOfExifTag1[33] = new ExifTag("ExifIFDPointer", 34665, 4);
    arrayOfExifTag1[34] = new ExifTag("GPSInfoIFDPointer", 34853, 4);
    arrayOfExifTag1[35] = new ExifTag("SensorTopBorder", 4, 4);
    arrayOfExifTag1[36] = new ExifTag("SensorLeftBorder", 5, 4);
    arrayOfExifTag1[37] = new ExifTag("SensorBottomBorder", 6, 4);
    arrayOfExifTag1[38] = new ExifTag("SensorRightBorder", 7, 4);
    arrayOfExifTag1[39] = new ExifTag("ISO", 23, 3);
    arrayOfExifTag1[40] = new ExifTag("JpgFromRaw", 46, 7);
    IFD_TIFF_TAGS = arrayOfExifTag1;
    Object localObject = new ExifTag[59];
    localObject[0] = new ExifTag("ExposureTime", 33434, 5);
    localObject[1] = new ExifTag("FNumber", 33437, 5);
    localObject[2] = new ExifTag("ExposureProgram", 34850, 3);
    localObject[3] = new ExifTag("SpectralSensitivity", 34852, 2);
    localObject[4] = new ExifTag("PhotographicSensitivity", 34855, 3);
    localObject[5] = new ExifTag("OECF", 34856, 7);
    localObject[6] = new ExifTag("ExifVersion", 36864, 2);
    localObject[7] = new ExifTag("DateTimeOriginal", 36867, 2);
    localObject[8] = new ExifTag("DateTimeDigitized", 36868, 2);
    localObject[9] = new ExifTag("ComponentsConfiguration", 37121, 7);
    localObject[10] = new ExifTag("CompressedBitsPerPixel", 37122, 5);
    localObject[11] = new ExifTag("ShutterSpeedValue", 37377, 10);
    localObject[12] = new ExifTag("ApertureValue", 37378, 5);
    localObject[13] = new ExifTag("BrightnessValue", 37379, 10);
    localObject[14] = new ExifTag("ExposureBiasValue", 37380, 10);
    localObject[15] = new ExifTag("MaxApertureValue", 37381, 5);
    localObject[16] = new ExifTag("SubjectDistance", 37382, 5);
    localObject[17] = new ExifTag("MeteringMode", 37383, 3);
    localObject[18] = new ExifTag("LightSource", 37384, 3);
    localObject[19] = new ExifTag("Flash", 37385, 3);
    localObject[20] = new ExifTag("FocalLength", 37386, 5);
    localObject[21] = new ExifTag("SubjectArea", 37396, 3);
    localObject[22] = new ExifTag("MakerNote", 37500, 7);
    localObject[23] = new ExifTag("UserComment", 37510, 7);
    localObject[24] = new ExifTag("SubSecTime", 37520, 2);
    localObject[25] = new ExifTag("SubSecTimeOriginal", 37521, 2);
    localObject[26] = new ExifTag("SubSecTimeDigitized", 37522, 2);
    localObject[27] = new ExifTag("FlashpixVersion", 40960, 7);
    localObject[28] = new ExifTag("ColorSpace", 40961, 3);
    localObject[29] = new ExifTag("PixelXDimension", 40962, 3, 4);
    localObject[30] = new ExifTag("PixelYDimension", 40963, 3, 4);
    localObject[31] = new ExifTag("RelatedSoundFile", 40964, 2);
    localObject[32] = new ExifTag("InteroperabilityIFDPointer", 40965, 4);
    localObject[33] = new ExifTag("FlashEnergy", 41483, 5);
    localObject[34] = new ExifTag("SpatialFrequencyResponse", 41484, 7);
    localObject[35] = new ExifTag("FocalPlaneXResolution", 41486, 5);
    localObject[36] = new ExifTag("FocalPlaneYResolution", 41487, 5);
    localObject[37] = new ExifTag("FocalPlaneResolutionUnit", 41488, 3);
    localObject[38] = new ExifTag("SubjectLocation", 41492, 3);
    localObject[39] = new ExifTag("ExposureIndex", 41493, 5);
    localObject[40] = new ExifTag("SensingMethod", 41495, 3);
    localObject[41] = new ExifTag("FileSource", 41728, 7);
    localObject[42] = new ExifTag("SceneType", 41729, 7);
    localObject[43] = new ExifTag("CFAPattern", 41730, 7);
    localObject[44] = new ExifTag("CustomRendered", 41985, 3);
    localObject[45] = new ExifTag("ExposureMode", 41986, 3);
    localObject[46] = new ExifTag("WhiteBalance", 41987, 3);
    localObject[47] = new ExifTag("DigitalZoomRatio", 41988, 5);
    localObject[48] = new ExifTag("FocalLengthIn35mmFilm", 41989, 3);
    localObject[49] = new ExifTag("SceneCaptureType", 41990, 3);
    localObject[50] = new ExifTag("GainControl", 41991, 3);
    localObject[51] = new ExifTag("Contrast", 41992, 3);
    localObject[52] = new ExifTag("Saturation", 41993, 3);
    localObject[53] = new ExifTag("Sharpness", 41994, 3);
    localObject[54] = new ExifTag("DeviceSettingDescription", 41995, 7);
    localObject[55] = new ExifTag("SubjectDistanceRange", 41996, 3);
    localObject[56] = new ExifTag("ImageUniqueID", 42016, 2);
    localObject[57] = new ExifTag("DNGVersion", 50706, 1);
    localObject[58] = new ExifTag("DefaultCropSize", 50720, 3, 4);
    IFD_EXIF_TAGS = (ExifTag[])localObject;
    ExifTag[] arrayOfExifTag2 = new ExifTag[31];
    arrayOfExifTag2[0] = new ExifTag("GPSVersionID", 0, 1);
    arrayOfExifTag2[1] = new ExifTag("GPSLatitudeRef", 1, 2);
    arrayOfExifTag2[2] = new ExifTag("GPSLatitude", 2, 5);
    arrayOfExifTag2[3] = new ExifTag("GPSLongitudeRef", 3, 2);
    arrayOfExifTag2[4] = new ExifTag("GPSLongitude", 4, 5);
    arrayOfExifTag2[5] = new ExifTag("GPSAltitudeRef", 5, 1);
    arrayOfExifTag2[6] = new ExifTag("GPSAltitude", 6, 5);
    arrayOfExifTag2[7] = new ExifTag("GPSTimeStamp", 7, 5);
    arrayOfExifTag2[8] = new ExifTag("GPSSatellites", 8, 2);
    arrayOfExifTag2[9] = new ExifTag("GPSStatus", 9, 2);
    arrayOfExifTag2[10] = new ExifTag("GPSMeasureMode", 10, 2);
    arrayOfExifTag2[11] = new ExifTag("GPSDOP", 11, 5);
    arrayOfExifTag2[12] = new ExifTag("GPSSpeedRef", 12, 2);
    arrayOfExifTag2[13] = new ExifTag("GPSSpeed", 13, 5);
    arrayOfExifTag2[14] = new ExifTag("GPSTrackRef", 14, 2);
    arrayOfExifTag2[15] = new ExifTag("GPSTrack", 15, 5);
    arrayOfExifTag2[16] = new ExifTag("GPSImgDirectionRef", 16, 2);
    arrayOfExifTag2[17] = new ExifTag("GPSImgDirection", 17, 5);
    arrayOfExifTag2[18] = new ExifTag("GPSMapDatum", 18, 2);
    arrayOfExifTag2[19] = new ExifTag("GPSDestLatitudeRef", 19, 2);
    arrayOfExifTag2[20] = new ExifTag("GPSDestLatitude", 20, 5);
    arrayOfExifTag2[21] = new ExifTag("GPSDestLongitudeRef", 21, 2);
    arrayOfExifTag2[22] = new ExifTag("GPSDestLongitude", 22, 5);
    arrayOfExifTag2[23] = new ExifTag("GPSDestBearingRef", 23, 2);
    arrayOfExifTag2[24] = new ExifTag("GPSDestBearing", 24, 5);
    arrayOfExifTag2[25] = new ExifTag("GPSDestDistanceRef", 25, 2);
    arrayOfExifTag2[26] = new ExifTag("GPSDestDistance", 26, 5);
    arrayOfExifTag2[27] = new ExifTag("GPSProcessingMethod", 27, 7);
    arrayOfExifTag2[28] = new ExifTag("GPSAreaInformation", 28, 7);
    arrayOfExifTag2[29] = new ExifTag("GPSDateStamp", 29, 2);
    arrayOfExifTag2[30] = new ExifTag("GPSDifferential", 30, 3);
    IFD_GPS_TAGS = arrayOfExifTag2;
    ExifTag[] arrayOfExifTag3 = new ExifTag[1];
    arrayOfExifTag3[0] = new ExifTag("InteroperabilityIndex", 1, 2);
    IFD_INTEROPERABILITY_TAGS = arrayOfExifTag3;
    ExifTag[] arrayOfExifTag4 = new ExifTag[37];
    arrayOfExifTag4[0] = new ExifTag("NewSubfileType", 254, 4);
    arrayOfExifTag4[1] = new ExifTag("SubfileType", 255, 4);
    arrayOfExifTag4[2] = new ExifTag("ThumbnailImageWidth", 256, 3, 4);
    arrayOfExifTag4[3] = new ExifTag("ThumbnailImageLength", 257, 3, 4);
    arrayOfExifTag4[4] = new ExifTag("BitsPerSample", 258, 3);
    arrayOfExifTag4[5] = new ExifTag("Compression", 259, 3);
    arrayOfExifTag4[6] = new ExifTag("PhotometricInterpretation", 262, 3);
    arrayOfExifTag4[7] = new ExifTag("ImageDescription", 270, 2);
    arrayOfExifTag4[8] = new ExifTag("Make", 271, 2);
    arrayOfExifTag4[9] = new ExifTag("Model", 272, 2);
    arrayOfExifTag4[10] = new ExifTag("StripOffsets", 273, 3, 4);
    arrayOfExifTag4[11] = new ExifTag("Orientation", 274, 3);
    arrayOfExifTag4[12] = new ExifTag("SamplesPerPixel", 277, 3);
    arrayOfExifTag4[13] = new ExifTag("RowsPerStrip", 278, 3, 4);
    arrayOfExifTag4[14] = new ExifTag("StripByteCounts", 279, 3, 4);
    arrayOfExifTag4[15] = new ExifTag("XResolution", 282, 5);
    arrayOfExifTag4[16] = new ExifTag("YResolution", 283, 5);
    arrayOfExifTag4[17] = new ExifTag("PlanarConfiguration", 284, 3);
    arrayOfExifTag4[18] = new ExifTag("ResolutionUnit", 296, 3);
    arrayOfExifTag4[19] = new ExifTag("TransferFunction", 301, 3);
    arrayOfExifTag4[20] = new ExifTag("Software", 305, 2);
    arrayOfExifTag4[21] = new ExifTag("DateTime", 306, 2);
    arrayOfExifTag4[22] = new ExifTag("Artist", 315, 2);
    arrayOfExifTag4[23] = new ExifTag("WhitePoint", 318, 5);
    arrayOfExifTag4[24] = new ExifTag("PrimaryChromaticities", 319, 5);
    arrayOfExifTag4[25] = new ExifTag("SubIFDPointer", 330, 4);
    arrayOfExifTag4[26] = new ExifTag("JPEGInterchangeFormat", 513, 4);
    arrayOfExifTag4[27] = new ExifTag("JPEGInterchangeFormatLength", 514, 4);
    arrayOfExifTag4[28] = new ExifTag("YCbCrCoefficients", 529, 5);
    arrayOfExifTag4[29] = new ExifTag("YCbCrSubSampling", 530, 3);
    arrayOfExifTag4[30] = new ExifTag("YCbCrPositioning", 531, 3);
    arrayOfExifTag4[31] = new ExifTag("ReferenceBlackWhite", 532, 5);
    arrayOfExifTag4[32] = new ExifTag("Copyright", 33432, 2);
    arrayOfExifTag4[33] = new ExifTag("ExifIFDPointer", 34665, 4);
    arrayOfExifTag4[34] = new ExifTag("GPSInfoIFDPointer", 34853, 4);
    arrayOfExifTag4[35] = new ExifTag("DNGVersion", 50706, 1);
    arrayOfExifTag4[36] = new ExifTag("DefaultCropSize", 50720, 3, 4);
    IFD_THUMBNAIL_TAGS = arrayOfExifTag4;
    TAG_RAF_IMAGE_SIZE = new ExifTag("StripOffsets", 273, 3);
    ExifTag[] arrayOfExifTag5 = new ExifTag[3];
    arrayOfExifTag5[0] = new ExifTag("ThumbnailImage", 256, 7);
    arrayOfExifTag5[1] = new ExifTag("CameraSettingsIFDPointer", 8224, 4);
    arrayOfExifTag5[2] = new ExifTag("ImageProcessingIFDPointer", 8256, 4);
    ORF_MAKER_NOTE_TAGS = arrayOfExifTag5;
    ExifTag[] arrayOfExifTag6 = new ExifTag[2];
    arrayOfExifTag6[0] = new ExifTag("PreviewImageStart", 257, 4);
    arrayOfExifTag6[1] = new ExifTag("PreviewImageLength", 258, 4);
    ORF_CAMERA_SETTINGS_TAGS = arrayOfExifTag6;
    ExifTag[] arrayOfExifTag7 = new ExifTag[1];
    arrayOfExifTag7[0] = new ExifTag("AspectFrame", 4371, 3);
    ORF_IMAGE_PROCESSING_TAGS = arrayOfExifTag7;
    ExifTag[] arrayOfExifTag8 = new ExifTag[1];
    arrayOfExifTag8[0] = new ExifTag("ColorSpace", 55, 3);
    PEF_TAGS = arrayOfExifTag8;
    ExifTag[][] arrayOfExifTag = new ExifTag[10][];
    arrayOfExifTag[0] = arrayOfExifTag1;
    arrayOfExifTag[1] = localObject;
    arrayOfExifTag[2] = arrayOfExifTag2;
    arrayOfExifTag[3] = arrayOfExifTag3;
    arrayOfExifTag[4] = arrayOfExifTag4;
    arrayOfExifTag[5] = arrayOfExifTag1;
    arrayOfExifTag[6] = arrayOfExifTag5;
    arrayOfExifTag[7] = arrayOfExifTag6;
    arrayOfExifTag[8] = arrayOfExifTag7;
    arrayOfExifTag[9] = arrayOfExifTag8;
    EXIF_TAGS = arrayOfExifTag;
    EXIF_POINTER_TAGS = new ExifTag[] { new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1) };
    JPEG_INTERCHANGE_FORMAT_TAG = new ExifTag("JPEGInterchangeFormat", 513, 4);
    JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = new ExifTag("JPEGInterchangeFormatLength", 514, 4);
    sExifTagMapsForReading = new HashMap[arrayOfExifTag.length];
    sExifTagMapsForWriting = new HashMap[arrayOfExifTag.length];
    sTagSetForCompatibility = new HashSet(Arrays.asList(new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp" }));
    sExifPointerTagMap = new HashMap();
    localObject = Charset.forName("US-ASCII");
    ASCII = (Charset)localObject;
    IDENTIFIER_EXIF_APP1 = "Exif\000\000".getBytes((Charset)localObject);
    localObject = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    sFormatter = (SimpleDateFormat)localObject;
    ((DateFormat)localObject).setTimeZone(TimeZone.getTimeZone("UTC"));
    for (int i = 0;; i++)
    {
      localObject = EXIF_TAGS;
      if (i >= localObject.length) {
        break;
      }
      sExifTagMapsForReading[i] = new HashMap();
      sExifTagMapsForWriting[i] = new HashMap();
      for (arrayOfExifTag4 : localObject[i])
      {
        sExifTagMapsForReading[i].put(Integer.valueOf(number), arrayOfExifTag4);
        sExifTagMapsForWriting[i].put(name, arrayOfExifTag4);
      }
    }
    localObject = sExifPointerTagMap;
    arrayOfExifTag4 = EXIF_POINTER_TAGS;
    ((HashMap)localObject).put(Integer.valueOf(0number), localInteger6);
    ((HashMap)localObject).put(Integer.valueOf(1number), localInteger1);
    ((HashMap)localObject).put(Integer.valueOf(2number), localInteger3);
    ((HashMap)localObject).put(Integer.valueOf(3number), localInteger2);
    ((HashMap)localObject).put(Integer.valueOf(4number), localInteger5);
    ((HashMap)localObject).put(Integer.valueOf(5number), localInteger4);
    sNonZeroTimePattern = Pattern.compile(".*[1-9].*");
  }
  
  public ExifInterface(@NonNull InputStream paramInputStream)
    throws IOException
  {
    ExifTag[][] arrayOfExifTag = EXIF_TAGS;
    mAttributes = new HashMap[arrayOfExifTag.length];
    mAttributesOffsets = new HashSet(arrayOfExifTag.length);
    mExifByteOrder = ByteOrder.BIG_ENDIAN;
    if (paramInputStream != null)
    {
      mFilename = null;
      if ((paramInputStream instanceof AssetManager.AssetInputStream)) {
        mAssetInputStream = ((AssetManager.AssetInputStream)paramInputStream);
      } else {
        mAssetInputStream = null;
      }
      loadAttributes(paramInputStream);
      return;
    }
    throw new IllegalArgumentException("inputStream cannot be null");
  }
  
  /* Error */
  public ExifInterface(@NonNull String paramString)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 1146	java/lang/Object:<init>	()V
    //   4: getstatic 1052	androidx/exifinterface/media/ExifInterface:EXIF_TAGS	[[Landroidx/exifinterface/media/ExifInterface$ExifTag;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: arraylength
    //   11: anewarray 1060	java/util/HashMap
    //   14: putfield 1148	androidx/exifinterface/media/ExifInterface:mAttributes	[Ljava/util/HashMap;
    //   17: aload_0
    //   18: new 1066	java/util/HashSet
    //   21: dup
    //   22: aload_2
    //   23: arraylength
    //   24: invokespecial 1151	java/util/HashSet:<init>	(I)V
    //   27: putfield 1153	androidx/exifinterface/media/ExifInterface:mAttributesOffsets	Ljava/util/Set;
    //   30: aload_0
    //   31: getstatic 1158	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   34: putfield 1160	androidx/exifinterface/media/ExifInterface:mExifByteOrder	Ljava/nio/ByteOrder;
    //   37: aload_1
    //   38: ifnull +47 -> 85
    //   41: aconst_null
    //   42: astore_2
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 1166	androidx/exifinterface/media/ExifInterface:mAssetInputStream	Landroid/content/res/AssetManager$AssetInputStream;
    //   48: aload_0
    //   49: aload_1
    //   50: putfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   53: new 1178	java/io/FileInputStream
    //   56: astore_3
    //   57: aload_3
    //   58: aload_1
    //   59: invokespecial 1179	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: aload_3
    //   64: invokespecial 1169	androidx/exifinterface/media/ExifInterface:loadAttributes	(Ljava/io/InputStream;)V
    //   67: aload_3
    //   68: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   71: return
    //   72: astore_1
    //   73: aload_3
    //   74: astore_2
    //   75: goto +4 -> 79
    //   78: astore_1
    //   79: aload_2
    //   80: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   83: aload_1
    //   84: athrow
    //   85: new 1171	java/lang/IllegalArgumentException
    //   88: dup
    //   89: ldc_w 1185
    //   92: invokespecial 1174	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	ExifInterface
    //   0	96	1	paramString	String
    //   7	73	2	localObject	Object
    //   56	18	3	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   62	67	72	finally
    //   53	62	78	finally
  }
  
  private void addDefaultValuesForCompatibility()
  {
    String str = getAttribute("DateTimeOriginal");
    if ((str != null) && (getAttribute("DateTime") == null)) {
      mAttributes[0].put("DateTime", ExifAttribute.createString(str));
    }
    if (getAttribute("ImageWidth") == null) {
      mAttributes[0].put("ImageWidth", ExifAttribute.createULong(0L, mExifByteOrder));
    }
    if (getAttribute("ImageLength") == null) {
      mAttributes[0].put("ImageLength", ExifAttribute.createULong(0L, mExifByteOrder));
    }
    if (getAttribute("Orientation") == null) {
      mAttributes[0].put("Orientation", ExifAttribute.createULong(0L, mExifByteOrder));
    }
    if (getAttribute("LightSource") == null) {
      mAttributes[1].put("LightSource", ExifAttribute.createULong(0L, mExifByteOrder));
    }
  }
  
  private static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      try
      {
        paramCloseable.close();
      }
      catch (RuntimeException paramCloseable)
      {
        throw paramCloseable;
      }
      return;
    }
    catch (Exception paramCloseable)
    {
      for (;;) {}
    }
  }
  
  private String convertDecimalDegree(double paramDouble)
  {
    long l1 = paramDouble;
    paramDouble -= l1;
    long l2 = (paramDouble * 60.0D);
    long l3 = Math.round((paramDouble - l2 / 60.0D) * 3600.0D * 1.0E7D);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(l1);
    localStringBuilder.append("/1,");
    localStringBuilder.append(l2);
    localStringBuilder.append("/1,");
    localStringBuilder.append(l3);
    localStringBuilder.append("/10000000");
    return localStringBuilder.toString();
  }
  
  private static double convertRationalLatLonToDouble(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = paramString1.split(",", -1);
      String[] arrayOfString = paramString1[0].split("/", -1);
      double d1 = Double.parseDouble(arrayOfString[0].trim()) / Double.parseDouble(arrayOfString[1].trim());
      arrayOfString = paramString1[1].split("/", -1);
      double d2 = Double.parseDouble(arrayOfString[0].trim()) / Double.parseDouble(arrayOfString[1].trim());
      paramString1 = paramString1[2].split("/", -1);
      double d3 = Double.parseDouble(paramString1[0].trim()) / Double.parseDouble(paramString1[1].trim());
      d2 /= 60.0D;
      d3 = d3 / 3600.0D + (d2 + d1);
      if ((!paramString2.equals("S")) && (!paramString2.equals("W")))
      {
        if ((!paramString2.equals("N")) && (!paramString2.equals("E")))
        {
          paramString1 = new java/lang/IllegalArgumentException;
          paramString1.<init>();
          throw paramString1;
        }
        return d3;
      }
      return -d3;
    }
    catch (NumberFormatException|ArrayIndexOutOfBoundsException paramString1)
    {
      throw new IllegalArgumentException();
    }
  }
  
  private static long[] convertToLongArray(Object paramObject)
  {
    if ((paramObject instanceof int[]))
    {
      int[] arrayOfInt = (int[])paramObject;
      paramObject = new long[arrayOfInt.length];
      for (int i = 0; i < arrayOfInt.length; i++) {
        paramObject[i] = arrayOfInt[i];
      }
      return (long[])paramObject;
    }
    if ((paramObject instanceof long[])) {
      return (long[])paramObject;
    }
    return null;
  }
  
  private static int copy(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    byte[] arrayOfByte = new byte[' '];
    int i = 0;
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j == -1) {
        break;
      }
      i += j;
      paramOutputStream.write(arrayOfByte, 0, j);
    }
    return i;
  }
  
  @Nullable
  private ExifAttribute getExifAttribute(@NonNull String paramString)
  {
    String str = paramString;
    if ("ISOSpeedRatings".equals(paramString)) {
      str = "PhotographicSensitivity";
    }
    for (int i = 0; i < EXIF_TAGS.length; i++)
    {
      paramString = (ExifAttribute)mAttributes[i].get(str);
      if (paramString != null) {
        return paramString;
      }
    }
    return null;
  }
  
  private void getJpegAttributes(ByteOrderedDataInputStream paramByteOrderedDataInputStream, int paramInt1, int paramInt2)
    throws IOException
  {
    paramByteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
    paramByteOrderedDataInputStream.seek(paramInt1);
    int i = paramByteOrderedDataInputStream.readByte();
    if (i == -1)
    {
      if (paramByteOrderedDataInputStream.readByte() == -40)
      {
        for (paramInt1 = paramInt1 + 1 + 1;; paramInt1 = i + paramInt1)
        {
          i = paramByteOrderedDataInputStream.readByte();
          if (i != -1) {
            break label594;
          }
          int j = paramByteOrderedDataInputStream.readByte();
          if ((j == -39) || (j == -38)) {
            break label585;
          }
          i = paramByteOrderedDataInputStream.readUnsignedShort() - 2;
          int k = paramInt1 + 1 + 1 + 2;
          if (i < 0) {
            break label574;
          }
          byte[] arrayOfByte;
          if (j != -31)
          {
            if (j != -2) {
              switch (j)
              {
              default: 
                switch (j)
                {
                default: 
                  switch (j)
                  {
                  default: 
                    switch (j)
                    {
                    default: 
                      paramInt1 = i;
                      i = k;
                    }
                    break;
                  }
                  break;
                }
                break;
              case -64: 
              case -63: 
              case -62: 
              case -61: 
                if (paramByteOrderedDataInputStream.skipBytes(1) == 1)
                {
                  mAttributes[paramInt2].put("ImageLength", ExifAttribute.createULong(paramByteOrderedDataInputStream.readUnsignedShort(), mExifByteOrder));
                  mAttributes[paramInt2].put("ImageWidth", ExifAttribute.createULong(paramByteOrderedDataInputStream.readUnsignedShort(), mExifByteOrder));
                  paramInt1 = i - 5;
                  i = k;
                  break;
                }
                throw new IOException("Invalid SOFx");
              }
            }
            arrayOfByte = new byte[i];
            if (paramByteOrderedDataInputStream.read(arrayOfByte) == i)
            {
              i = k;
              if (getAttribute("UserComment") == null)
              {
                mAttributes[1].put("UserComment", ExifAttribute.createString(new String(arrayOfByte, ASCII)));
                i = k;
              }
            }
            else
            {
              throw new IOException("Invalid exif");
            }
          }
          else
          {
            if (i < 6)
            {
              paramInt1 = i;
              i = k;
              break label498;
            }
            arrayOfByte = new byte[6];
            if (paramByteOrderedDataInputStream.read(arrayOfByte) != 6) {
              break label563;
            }
            k += 6;
            paramInt1 = i - 6;
            if (!Arrays.equals(arrayOfByte, IDENTIFIER_EXIF_APP1))
            {
              i = k;
              break label498;
            }
            if (paramInt1 <= 0) {
              break label552;
            }
            mExifOffset = k;
            arrayOfByte = new byte[paramInt1];
            if (paramByteOrderedDataInputStream.read(arrayOfByte) != paramInt1) {
              break label541;
            }
            i = k + paramInt1;
            readExifSegment(arrayOfByte, paramInt2);
          }
          paramInt1 = 0;
          label498:
          if (paramInt1 < 0) {
            break label530;
          }
          if (paramByteOrderedDataInputStream.skipBytes(paramInt1) != paramInt1) {
            break;
          }
        }
        throw new IOException("Invalid JPEG segment");
        label530:
        throw new IOException("Invalid length");
        label541:
        throw new IOException("Invalid exif");
        label552:
        throw new IOException("Invalid exif");
        label563:
        throw new IOException("Invalid exif");
        label574:
        throw new IOException("Invalid length");
        label585:
        paramByteOrderedDataInputStream.setByteOrder(mExifByteOrder);
        return;
        label594:
        paramByteOrderedDataInputStream = z2.t("Invalid marker:");
        paramByteOrderedDataInputStream.append(Integer.toHexString(i & 0xFF));
        throw new IOException(paramByteOrderedDataInputStream.toString());
      }
      paramByteOrderedDataInputStream = z2.t("Invalid marker: ");
      paramByteOrderedDataInputStream.append(Integer.toHexString(i & 0xFF));
      throw new IOException(paramByteOrderedDataInputStream.toString());
    }
    paramByteOrderedDataInputStream = z2.t("Invalid marker: ");
    paramByteOrderedDataInputStream.append(Integer.toHexString(i & 0xFF));
    throw new IOException(paramByteOrderedDataInputStream.toString());
  }
  
  private int getMimeType(BufferedInputStream paramBufferedInputStream)
    throws IOException
  {
    paramBufferedInputStream.mark(5000);
    byte[] arrayOfByte = new byte['ᎈ'];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    if (isJpegFormat(arrayOfByte)) {
      return 4;
    }
    if (isRafFormat(arrayOfByte)) {
      return 9;
    }
    if (isOrfFormat(arrayOfByte)) {
      return 7;
    }
    if (isRw2Format(arrayOfByte)) {
      return 10;
    }
    return 0;
  }
  
  private void getOrfAttributes(ByteOrderedDataInputStream paramByteOrderedDataInputStream)
    throws IOException
  {
    getRawAttributes(paramByteOrderedDataInputStream);
    paramByteOrderedDataInputStream = (ExifAttribute)mAttributes[1].get("MakerNote");
    if (paramByteOrderedDataInputStream != null)
    {
      ByteOrderedDataInputStream localByteOrderedDataInputStream = new ByteOrderedDataInputStream(bytes);
      localByteOrderedDataInputStream.setByteOrder(mExifByteOrder);
      byte[] arrayOfByte1 = ORF_MAKER_NOTE_HEADER_1;
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
      localByteOrderedDataInputStream.readFully(arrayOfByte2);
      localByteOrderedDataInputStream.seek(0L);
      Object localObject = ORF_MAKER_NOTE_HEADER_2;
      paramByteOrderedDataInputStream = new byte[localObject.length];
      localByteOrderedDataInputStream.readFully(paramByteOrderedDataInputStream);
      if (Arrays.equals(arrayOfByte2, arrayOfByte1)) {
        localByteOrderedDataInputStream.seek(8L);
      } else if (Arrays.equals(paramByteOrderedDataInputStream, (byte[])localObject)) {
        localByteOrderedDataInputStream.seek(12L);
      }
      readImageFileDirectory(localByteOrderedDataInputStream, 6);
      paramByteOrderedDataInputStream = (ExifAttribute)mAttributes[7].get("PreviewImageStart");
      localObject = (ExifAttribute)mAttributes[7].get("PreviewImageLength");
      if ((paramByteOrderedDataInputStream != null) && (localObject != null))
      {
        mAttributes[5].put("JPEGInterchangeFormat", paramByteOrderedDataInputStream);
        mAttributes[5].put("JPEGInterchangeFormatLength", localObject);
      }
      paramByteOrderedDataInputStream = (ExifAttribute)mAttributes[8].get("AspectFrame");
      if (paramByteOrderedDataInputStream != null)
      {
        localObject = (int[])paramByteOrderedDataInputStream.getValue(mExifByteOrder);
        if ((localObject != null) && (localObject.length == 4))
        {
          int i = localObject[2];
          int j = localObject[0];
          if (i > j)
          {
            int k = localObject[3];
            int m = localObject[1];
            if (k > m)
            {
              i = i - j + 1;
              j = k - m + 1;
              k = i;
              m = j;
              if (i < j)
              {
                k = i + j;
                m = k - j;
                k -= m;
              }
              localObject = ExifAttribute.createUShort(k, mExifByteOrder);
              paramByteOrderedDataInputStream = ExifAttribute.createUShort(m, mExifByteOrder);
              mAttributes[0].put("ImageWidth", localObject);
              mAttributes[0].put("ImageLength", paramByteOrderedDataInputStream);
            }
          }
        }
        else
        {
          paramByteOrderedDataInputStream = z2.t("Invalid aspect frame values. frame=");
          paramByteOrderedDataInputStream.append(Arrays.toString((int[])localObject));
          Log.w("ExifInterface", paramByteOrderedDataInputStream.toString());
        }
      }
    }
  }
  
  private void getRafAttributes(ByteOrderedDataInputStream paramByteOrderedDataInputStream)
    throws IOException
  {
    paramByteOrderedDataInputStream.skipBytes(84);
    byte[] arrayOfByte = new byte[4];
    Object localObject = new byte[4];
    paramByteOrderedDataInputStream.read(arrayOfByte);
    paramByteOrderedDataInputStream.skipBytes(4);
    paramByteOrderedDataInputStream.read((byte[])localObject);
    int i = ByteBuffer.wrap(arrayOfByte).getInt();
    int j = ByteBuffer.wrap((byte[])localObject).getInt();
    getJpegAttributes(paramByteOrderedDataInputStream, i, 5);
    paramByteOrderedDataInputStream.seek(j);
    paramByteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
    i = paramByteOrderedDataInputStream.readInt();
    for (j = 0; j < i; j++)
    {
      int k = paramByteOrderedDataInputStream.readUnsignedShort();
      int m = paramByteOrderedDataInputStream.readUnsignedShort();
      if (k == TAG_RAF_IMAGE_SIZEnumber)
      {
        i = paramByteOrderedDataInputStream.readShort();
        j = paramByteOrderedDataInputStream.readShort();
        paramByteOrderedDataInputStream = ExifAttribute.createUShort(i, mExifByteOrder);
        localObject = ExifAttribute.createUShort(j, mExifByteOrder);
        mAttributes[0].put("ImageLength", paramByteOrderedDataInputStream);
        mAttributes[0].put("ImageWidth", localObject);
        return;
      }
      paramByteOrderedDataInputStream.skipBytes(m);
    }
  }
  
  private void getRawAttributes(ByteOrderedDataInputStream paramByteOrderedDataInputStream)
    throws IOException
  {
    parseTiffHeaders(paramByteOrderedDataInputStream, paramByteOrderedDataInputStream.available());
    readImageFileDirectory(paramByteOrderedDataInputStream, 0);
    updateImageSizeValues(paramByteOrderedDataInputStream, 0);
    updateImageSizeValues(paramByteOrderedDataInputStream, 5);
    updateImageSizeValues(paramByteOrderedDataInputStream, 4);
    validateImages(paramByteOrderedDataInputStream);
    if (mMimeType == 8)
    {
      paramByteOrderedDataInputStream = (ExifAttribute)mAttributes[1].get("MakerNote");
      if (paramByteOrderedDataInputStream != null)
      {
        paramByteOrderedDataInputStream = new ByteOrderedDataInputStream(bytes);
        paramByteOrderedDataInputStream.setByteOrder(mExifByteOrder);
        paramByteOrderedDataInputStream.seek(6L);
        readImageFileDirectory(paramByteOrderedDataInputStream, 9);
        paramByteOrderedDataInputStream = (ExifAttribute)mAttributes[9].get("ColorSpace");
        if (paramByteOrderedDataInputStream != null) {
          mAttributes[1].put("ColorSpace", paramByteOrderedDataInputStream);
        }
      }
    }
  }
  
  private void getRw2Attributes(ByteOrderedDataInputStream paramByteOrderedDataInputStream)
    throws IOException
  {
    getRawAttributes(paramByteOrderedDataInputStream);
    if ((ExifAttribute)mAttributes[0].get("JpgFromRaw") != null) {
      getJpegAttributes(paramByteOrderedDataInputStream, mRw2JpgFromRawOffset, 5);
    }
    paramByteOrderedDataInputStream = (ExifAttribute)mAttributes[0].get("ISO");
    ExifAttribute localExifAttribute = (ExifAttribute)mAttributes[1].get("PhotographicSensitivity");
    if ((paramByteOrderedDataInputStream != null) && (localExifAttribute == null)) {
      mAttributes[1].put("PhotographicSensitivity", paramByteOrderedDataInputStream);
    }
  }
  
  private static Pair<Integer, Integer> guessDataFormat(String paramString)
  {
    boolean bool = paramString.contains(",");
    int i = 1;
    Integer localInteger1 = Integer.valueOf(2);
    Integer localInteger2 = Integer.valueOf(-1);
    Object localObject;
    if (bool)
    {
      String[] arrayOfString = paramString.split(",", -1);
      localObject = guessDataFormat(arrayOfString[0]);
      paramString = (String)localObject;
      if (((Integer)first).intValue() == 2) {
        return (Pair<Integer, Integer>)localObject;
      }
      while (i < arrayOfString.length)
      {
        localObject = guessDataFormat(arrayOfString[i]);
        int j;
        if ((!((Integer)first).equals(first)) && (!((Integer)second).equals(first))) {
          j = -1;
        } else {
          j = ((Integer)first).intValue();
        }
        int k;
        if ((((Integer)second).intValue() != -1) && ((((Integer)first).equals(second)) || (((Integer)second).equals(second)))) {
          k = ((Integer)second).intValue();
        } else {
          k = -1;
        }
        if ((j == -1) && (k == -1)) {
          return new Pair(localInteger1, localInteger2);
        }
        if (j == -1) {
          paramString = new Pair(Integer.valueOf(k), localInteger2);
        } else if (k == -1) {
          paramString = new Pair(Integer.valueOf(j), localInteger2);
        }
        i++;
      }
      return paramString;
    }
    if (paramString.contains("/"))
    {
      paramString = paramString.split("/", -1);
      if (paramString.length != 2) {}
    }
    try
    {
      long l1 = Double.parseDouble(paramString[0]);
      long l2 = Double.parseDouble(paramString[1]);
      if ((l1 >= 0L) && (l2 >= 0L))
      {
        if ((l1 <= 2147483647L) && (l2 <= 2147483647L)) {
          return new Pair(Integer.valueOf(10), Integer.valueOf(5));
        }
        return new Pair(Integer.valueOf(5), localInteger2);
      }
      paramString = new Pair(Integer.valueOf(10), localInteger2);
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return new Pair(localInteger1, localInteger2);
    try
    {
      localObject = Long.valueOf(Long.parseLong(paramString));
      if ((((Long)localObject).longValue() >= 0L) && (((Long)localObject).longValue() <= 65535L)) {
        return new Pair(Integer.valueOf(3), Integer.valueOf(4));
      }
      if (((Long)localObject).longValue() < 0L) {
        return new Pair(Integer.valueOf(9), localInteger2);
      }
      localObject = new Pair(Integer.valueOf(4), localInteger2);
      return (Pair<Integer, Integer>)localObject;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      try
      {
        Double.parseDouble(paramString);
        paramString = new Pair(Integer.valueOf(12), localInteger2);
        return paramString;
      }
      catch (NumberFormatException paramString)
      {
        return new Pair(localInteger1, localInteger2);
      }
    }
  }
  
  private void handleThumbnailFromJfif(ByteOrderedDataInputStream paramByteOrderedDataInputStream, HashMap paramHashMap)
    throws IOException
  {
    ExifAttribute localExifAttribute = (ExifAttribute)paramHashMap.get("JPEGInterchangeFormat");
    paramHashMap = (ExifAttribute)paramHashMap.get("JPEGInterchangeFormatLength");
    if ((localExifAttribute != null) && (paramHashMap != null))
    {
      int i = localExifAttribute.getIntValue(mExifByteOrder);
      int j = Math.min(paramHashMap.getIntValue(mExifByteOrder), paramByteOrderedDataInputStream.available() - i);
      int k = mMimeType;
      if ((k != 4) && (k != 9) && (k != 10))
      {
        m = i;
        if (k != 7) {
          break label122;
        }
        m = mOrfMakerNoteOffset;
      }
      else
      {
        m = mExifOffset;
      }
      int m = i + m;
      label122:
      if ((m > 0) && (j > 0))
      {
        mHasThumbnail = true;
        mThumbnailOffset = m;
        mThumbnailLength = j;
        if ((mFilename == null) && (mAssetInputStream == null))
        {
          paramHashMap = new byte[j];
          paramByteOrderedDataInputStream.seek(m);
          paramByteOrderedDataInputStream.readFully(paramHashMap);
          mThumbnailBytes = paramHashMap;
        }
      }
    }
  }
  
  private void handleThumbnailFromStrips(ByteOrderedDataInputStream paramByteOrderedDataInputStream, HashMap paramHashMap)
    throws IOException
  {
    Object localObject1 = (ExifAttribute)paramHashMap.get("StripOffsets");
    Object localObject2 = (ExifAttribute)paramHashMap.get("StripByteCounts");
    if ((localObject1 != null) && (localObject2 != null))
    {
      paramHashMap = convertToLongArray(((ExifAttribute)localObject1).getValue(mExifByteOrder));
      localObject2 = convertToLongArray(((ExifAttribute)localObject2).getValue(mExifByteOrder));
      if (paramHashMap == null)
      {
        Log.w("ExifInterface", "stripOffsets should not be null.");
        return;
      }
      if (localObject2 == null)
      {
        Log.w("ExifInterface", "stripByteCounts should not be null.");
        return;
      }
      long l = 0L;
      int i = localObject2.length;
      for (int j = 0; j < i; j++) {
        l += localObject2[j];
      }
      int k = (int)l;
      localObject1 = new byte[k];
      int m = 0;
      j = m;
      i = j;
      int n = j;
      for (j = m; j < paramHashMap.length; j++)
      {
        int i1 = (int)paramHashMap[j];
        m = (int)localObject2[j];
        i1 -= n;
        if (i1 < 0) {
          Log.d("ExifInterface", "Invalid strip offset value");
        }
        paramByteOrderedDataInputStream.seek(i1);
        byte[] arrayOfByte = new byte[m];
        paramByteOrderedDataInputStream.read(arrayOfByte);
        n = n + i1 + m;
        System.arraycopy(arrayOfByte, 0, localObject1, i, m);
        i += m;
      }
      mHasThumbnail = true;
      mThumbnailBytes = ((byte[])localObject1);
      mThumbnailLength = k;
    }
  }
  
  private static boolean isJpegFormat(byte[] paramArrayOfByte)
    throws IOException
  {
    for (int i = 0;; i++)
    {
      byte[] arrayOfByte = JPEG_SIGNATURE;
      if (i >= arrayOfByte.length) {
        break;
      }
      if (paramArrayOfByte[i] != arrayOfByte[i]) {
        return false;
      }
    }
    return true;
  }
  
  private boolean isOrfFormat(byte[] paramArrayOfByte)
    throws IOException
  {
    paramArrayOfByte = new ByteOrderedDataInputStream(paramArrayOfByte);
    ByteOrder localByteOrder = readByteOrder(paramArrayOfByte);
    mExifByteOrder = localByteOrder;
    paramArrayOfByte.setByteOrder(localByteOrder);
    int i = paramArrayOfByte.readShort();
    paramArrayOfByte.close();
    boolean bool;
    if ((i != 20306) && (i != 21330)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean isRafFormat(byte[] paramArrayOfByte)
    throws IOException
  {
    byte[] arrayOfByte = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
    for (int i = 0; i < arrayOfByte.length; i++) {
      if (paramArrayOfByte[i] != arrayOfByte[i]) {
        return false;
      }
    }
    return true;
  }
  
  private boolean isRw2Format(byte[] paramArrayOfByte)
    throws IOException
  {
    paramArrayOfByte = new ByteOrderedDataInputStream(paramArrayOfByte);
    ByteOrder localByteOrder = readByteOrder(paramArrayOfByte);
    mExifByteOrder = localByteOrder;
    paramArrayOfByte.setByteOrder(localByteOrder);
    int i = paramArrayOfByte.readShort();
    paramArrayOfByte.close();
    boolean bool;
    if (i == 85) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isSupportedDataType(HashMap paramHashMap)
    throws IOException
  {
    Object localObject = (ExifAttribute)paramHashMap.get("BitsPerSample");
    if (localObject != null)
    {
      int[] arrayOfInt = (int[])((ExifAttribute)localObject).getValue(mExifByteOrder);
      localObject = BITS_PER_SAMPLE_RGB;
      if (Arrays.equals((int[])localObject, arrayOfInt)) {
        return true;
      }
      if (mMimeType == 3)
      {
        paramHashMap = (ExifAttribute)paramHashMap.get("PhotometricInterpretation");
        if (paramHashMap != null)
        {
          int i = paramHashMap.getIntValue(mExifByteOrder);
          if (((i == 1) && (Arrays.equals(arrayOfInt, BITS_PER_SAMPLE_GREYSCALE_2))) || ((i == 6) && (Arrays.equals(arrayOfInt, (int[])localObject)))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private boolean isThumbnail(HashMap paramHashMap)
    throws IOException
  {
    ExifAttribute localExifAttribute = (ExifAttribute)paramHashMap.get("ImageLength");
    paramHashMap = (ExifAttribute)paramHashMap.get("ImageWidth");
    if ((localExifAttribute != null) && (paramHashMap != null))
    {
      int i = localExifAttribute.getIntValue(mExifByteOrder);
      int j = paramHashMap.getIntValue(mExifByteOrder);
      if ((i <= 512) && (j <= 512)) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  private void loadAttributes(@NonNull InputStream paramInputStream)
    throws IOException
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: getstatic 1052	androidx/exifinterface/media/ExifInterface:EXIF_TAGS	[[Landroidx/exifinterface/media/ExifInterface$ExifTag;
    //   6: arraylength
    //   7: if_icmpge +22 -> 29
    //   10: aload_0
    //   11: getfield 1148	androidx/exifinterface/media/ExifInterface:mAttributes	[Ljava/util/HashMap;
    //   14: iload_2
    //   15: new 1060	java/util/HashMap
    //   18: dup
    //   19: invokespecial 1073	java/util/HashMap:<init>	()V
    //   22: aastore
    //   23: iinc 2 1
    //   26: goto -24 -> 2
    //   29: new 1353	java/io/BufferedInputStream
    //   32: astore_3
    //   33: aload_3
    //   34: aload_1
    //   35: sipush 5000
    //   38: invokespecial 1550	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   41: aload_0
    //   42: aload_0
    //   43: aload_3
    //   44: invokespecial 1552	androidx/exifinterface/media/ExifInterface:getMimeType	(Ljava/io/BufferedInputStream;)I
    //   47: putfield 1446	androidx/exifinterface/media/ExifInterface:mMimeType	I
    //   50: new 6	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream
    //   53: astore_1
    //   54: aload_1
    //   55: aload_3
    //   56: invokespecial 1554	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:<init>	(Ljava/io/InputStream;)V
    //   59: aload_0
    //   60: getfield 1446	androidx/exifinterface/media/ExifInterface:mMimeType	I
    //   63: tableswitch	default:+61->124, 0:+98->161, 1:+98->161, 2:+98->161, 3:+98->161, 4:+88->151, 5:+98->161, 6:+98->161, 7:+80->143, 8:+98->161, 9:+72->135, 10:+64->127, 11:+98->161
    //   124: goto +42 -> 166
    //   127: aload_0
    //   128: aload_1
    //   129: invokespecial 1556	androidx/exifinterface/media/ExifInterface:getRw2Attributes	(Landroidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream;)V
    //   132: goto +34 -> 166
    //   135: aload_0
    //   136: aload_1
    //   137: invokespecial 1558	androidx/exifinterface/media/ExifInterface:getRafAttributes	(Landroidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream;)V
    //   140: goto +26 -> 166
    //   143: aload_0
    //   144: aload_1
    //   145: invokespecial 1560	androidx/exifinterface/media/ExifInterface:getOrfAttributes	(Landroidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream;)V
    //   148: goto +18 -> 166
    //   151: aload_0
    //   152: aload_1
    //   153: iconst_0
    //   154: iconst_0
    //   155: invokespecial 1425	androidx/exifinterface/media/ExifInterface:getJpegAttributes	(Landroidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream;II)V
    //   158: goto +8 -> 166
    //   161: aload_0
    //   162: aload_1
    //   163: invokespecial 1377	androidx/exifinterface/media/ExifInterface:getRawAttributes	(Landroidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream;)V
    //   166: aload_0
    //   167: aload_1
    //   168: invokespecial 1563	androidx/exifinterface/media/ExifInterface:setThumbnailData	(Landroidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream;)V
    //   171: aload_0
    //   172: iconst_1
    //   173: putfield 1565	androidx/exifinterface/media/ExifInterface:mIsSupportedFile	Z
    //   176: goto +13 -> 189
    //   179: astore_1
    //   180: goto +14 -> 194
    //   183: astore_1
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield 1565	androidx/exifinterface/media/ExifInterface:mIsSupportedFile	Z
    //   189: aload_0
    //   190: invokespecial 1567	androidx/exifinterface/media/ExifInterface:addDefaultValuesForCompatibility	()V
    //   193: return
    //   194: aload_0
    //   195: invokespecial 1567	androidx/exifinterface/media/ExifInterface:addDefaultValuesForCompatibility	()V
    //   198: aload_1
    //   199: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	ExifInterface
    //   0	200	1	paramInputStream	InputStream
    //   1	23	2	i	int
    //   32	24	3	localBufferedInputStream	BufferedInputStream
    // Exception table:
    //   from	to	target	type
    //   2	23	179	finally
    //   29	124	179	finally
    //   127	132	179	finally
    //   135	140	179	finally
    //   143	148	179	finally
    //   151	158	179	finally
    //   161	166	179	finally
    //   166	176	179	finally
    //   184	189	179	finally
    //   2	23	183	java/io/IOException
    //   29	124	183	java/io/IOException
    //   127	132	183	java/io/IOException
    //   135	140	183	java/io/IOException
    //   143	148	183	java/io/IOException
    //   151	158	183	java/io/IOException
    //   161	166	183	java/io/IOException
    //   166	176	183	java/io/IOException
  }
  
  private void parseTiffHeaders(ByteOrderedDataInputStream paramByteOrderedDataInputStream, int paramInt)
    throws IOException
  {
    ByteOrder localByteOrder = readByteOrder(paramByteOrderedDataInputStream);
    mExifByteOrder = localByteOrder;
    paramByteOrderedDataInputStream.setByteOrder(localByteOrder);
    int i = paramByteOrderedDataInputStream.readUnsignedShort();
    int j = mMimeType;
    if ((j != 7) && (j != 10) && (i != 42))
    {
      paramByteOrderedDataInputStream = z2.t("Invalid start code: ");
      paramByteOrderedDataInputStream.append(Integer.toHexString(i));
      throw new IOException(paramByteOrderedDataInputStream.toString());
    }
    i = paramByteOrderedDataInputStream.readInt();
    if ((i >= 8) && (i < paramInt))
    {
      paramInt = i - 8;
      if ((paramInt > 0) && (paramByteOrderedDataInputStream.skipBytes(paramInt) != paramInt)) {
        throw new IOException(a.f("Couldn't jump to first Ifd: ", paramInt));
      }
      return;
    }
    throw new IOException(a.f("Invalid first Ifd offset: ", i));
  }
  
  private void printAttributes()
  {
    for (int i = 0; i < mAttributes.length; i++)
    {
      StringBuilder localStringBuilder = a.r("The size of tag group[", i, "]: ");
      localStringBuilder.append(mAttributes[i].size());
      Log.d("ExifInterface", localStringBuilder.toString());
      Iterator localIterator = mAttributes[i].entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        ExifAttribute localExifAttribute = (ExifAttribute)localEntry.getValue();
        localStringBuilder = z2.t("tagName: ");
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append(", tagType: ");
        localStringBuilder.append(localExifAttribute.toString());
        localStringBuilder.append(", tagValue: '");
        localStringBuilder.append(localExifAttribute.getStringValue(mExifByteOrder));
        localStringBuilder.append("'");
        Log.d("ExifInterface", localStringBuilder.toString());
      }
    }
  }
  
  private ByteOrder readByteOrder(ByteOrderedDataInputStream paramByteOrderedDataInputStream)
    throws IOException
  {
    int i = paramByteOrderedDataInputStream.readShort();
    if (i != 18761)
    {
      if (i == 19789) {
        return ByteOrder.BIG_ENDIAN;
      }
      paramByteOrderedDataInputStream = z2.t("Invalid byte order: ");
      paramByteOrderedDataInputStream.append(Integer.toHexString(i));
      throw new IOException(paramByteOrderedDataInputStream.toString());
    }
    return ByteOrder.LITTLE_ENDIAN;
  }
  
  private void readExifSegment(byte[] paramArrayOfByte, int paramInt)
    throws IOException
  {
    ByteOrderedDataInputStream localByteOrderedDataInputStream = new ByteOrderedDataInputStream(paramArrayOfByte);
    parseTiffHeaders(localByteOrderedDataInputStream, paramArrayOfByte.length);
    readImageFileDirectory(localByteOrderedDataInputStream, paramInt);
  }
  
  private void readImageFileDirectory(ByteOrderedDataInputStream paramByteOrderedDataInputStream, int paramInt)
    throws IOException
  {
    mAttributesOffsets.add(Integer.valueOf(mPosition));
    if (mPosition + 2 > mLength) {
      return;
    }
    int i = paramByteOrderedDataInputStream.readShort();
    if ((i * 12 + mPosition <= mLength) && (i > 0))
    {
      long l2;
      for (int j = 0;; j = (short)(j + 1))
      {
        int k = paramInt;
        if (j >= i) {
          break;
        }
        int m = paramByteOrderedDataInputStream.readUnsignedShort();
        int n = paramByteOrderedDataInputStream.readUnsignedShort();
        int i1 = paramByteOrderedDataInputStream.readInt();
        long l1 = paramByteOrderedDataInputStream.peek() + 4L;
        Object localObject1 = (ExifTag)sExifTagMapsForReading[k].get(Integer.valueOf(m));
        Object localObject2;
        if (localObject1 == null)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Skip the tag entry since tag number is not defined: ");
          ((StringBuilder)localObject2).append(m);
          Log.w("ExifInterface", ((StringBuilder)localObject2).toString());
        }
        else
        {
          if (n > 0)
          {
            localObject2 = IFD_FORMAT_BYTES_PER_FORMAT;
            if (n < localObject2.length)
            {
              if (!((ExifTag)localObject1).isFormatCompatible(n))
              {
                localObject2 = z2.t("Skip the tag entry since data format (");
                ((StringBuilder)localObject2).append(IFD_FORMAT_NAMES[n]);
                ((StringBuilder)localObject2).append(") is unexpected for tag: ");
                ((StringBuilder)localObject2).append(name);
                Log.w("ExifInterface", ((StringBuilder)localObject2).toString());
                break label389;
              }
              i2 = n;
              if (n == 7) {
                i2 = primaryFormat;
              }
              l2 = i1;
              l2 = localObject2[i2] * l2;
              if ((l2 >= 0L) && (l2 <= 2147483647L))
              {
                n = 1;
                break label399;
              }
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Skip the tag entry since the number of components is invalid: ");
              ((StringBuilder)localObject2).append(i1);
              Log.w("ExifInterface", ((StringBuilder)localObject2).toString());
              break label396;
            }
          }
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Skip the tag entry since data format is invalid: ");
          ((StringBuilder)localObject2).append(n);
          Log.w("ExifInterface", ((StringBuilder)localObject2).toString());
        }
        label389:
        l2 = 0L;
        int i2 = n;
        label396:
        n = 0;
        label399:
        if (n == 0)
        {
          paramByteOrderedDataInputStream.seek(l1);
        }
        else
        {
          if (l2 > 4L)
          {
            n = paramByteOrderedDataInputStream.readInt();
            int i3 = mMimeType;
            if (i3 == 7)
            {
              if ("MakerNote".equals(name))
              {
                mOrfMakerNoteOffset = n;
              }
              else if ((k == 6) && ("ThumbnailImage".equals(name)))
              {
                mOrfThumbnailOffset = n;
                mOrfThumbnailLength = i1;
                ExifAttribute localExifAttribute1 = ExifAttribute.createUShort(6, mExifByteOrder);
                ExifAttribute localExifAttribute2 = ExifAttribute.createULong(mOrfThumbnailOffset, mExifByteOrder);
                localObject2 = ExifAttribute.createULong(mOrfThumbnailLength, mExifByteOrder);
                mAttributes[4].put("Compression", localExifAttribute1);
                mAttributes[4].put("JPEGInterchangeFormat", localExifAttribute2);
                mAttributes[4].put("JPEGInterchangeFormatLength", localObject2);
                break label614;
              }
            }
            else if ((i3 == 10) && ("JpgFromRaw".equals(name))) {
              mRw2JpgFromRawOffset = n;
            }
            label614:
            long l3 = n;
            if (l3 + l2 <= mLength)
            {
              paramByteOrderedDataInputStream.seek(l3);
            }
            else
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Skip the tag entry since data offset is invalid: ");
              ((StringBuilder)localObject1).append(n);
              Log.w("ExifInterface", ((StringBuilder)localObject1).toString());
              paramByteOrderedDataInputStream.seek(l1);
              continue;
            }
          }
          localObject2 = (Integer)sExifPointerTagMap.get(Integer.valueOf(m));
          if (localObject2 != null)
          {
            l2 = -1L;
            if (i2 != 3)
            {
              if (i2 != 4)
              {
                if (i2 != 8)
                {
                  if ((i2 != 9) && (i2 != 13)) {
                    break label789;
                  }
                  i2 = paramByteOrderedDataInputStream.readInt();
                }
                else
                {
                  i2 = paramByteOrderedDataInputStream.readShort();
                }
              }
              else
              {
                l2 = paramByteOrderedDataInputStream.readUnsignedInt();
                break label789;
              }
            }
            else {
              i2 = paramByteOrderedDataInputStream.readUnsignedShort();
            }
            l2 = i2;
            label789:
            if ((l2 > 0L) && (l2 < mLength))
            {
              if (!mAttributesOffsets.contains(Integer.valueOf((int)l2)))
              {
                paramByteOrderedDataInputStream.seek(l2);
                readImageFileDirectory(paramByteOrderedDataInputStream, ((Integer)localObject2).intValue());
              }
              else
              {
                localObject1 = new StringBuilder();
                ((StringBuilder)localObject1).append("Skip jump into the IFD since it has already been read: IfdType ");
                ((StringBuilder)localObject1).append(localObject2);
                ((StringBuilder)localObject1).append(" (at ");
                ((StringBuilder)localObject1).append(l2);
                ((StringBuilder)localObject1).append(")");
                Log.w("ExifInterface", ((StringBuilder)localObject1).toString());
              }
            }
            else
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Skip jump into the IFD since its offset is invalid: ");
              ((StringBuilder)localObject1).append(l2);
              Log.w("ExifInterface", ((StringBuilder)localObject1).toString());
            }
            paramByteOrderedDataInputStream.seek(l1);
          }
          else
          {
            localObject2 = new byte[(int)l2];
            paramByteOrderedDataInputStream.readFully((byte[])localObject2);
            localObject2 = new ExifAttribute(i2, i1, (byte[])localObject2);
            mAttributes[paramInt].put(name, localObject2);
            if ("DNGVersion".equals(name)) {
              mMimeType = 3;
            }
            if (((!"Make".equals(name)) && (!"Model".equals(name))) || ((((ExifAttribute)localObject2).getStringValue(mExifByteOrder).contains("PENTAX")) || (("Compression".equals(name)) && (((ExifAttribute)localObject2).getIntValue(mExifByteOrder) == 65535)))) {
              mMimeType = 8;
            }
            if (paramByteOrderedDataInputStream.peek() != l1) {
              paramByteOrderedDataInputStream.seek(l1);
            }
          }
        }
      }
      if (paramByteOrderedDataInputStream.peek() + 4 <= mLength)
      {
        paramInt = paramByteOrderedDataInputStream.readInt();
        l2 = paramInt;
        if ((l2 > 0L) && (paramInt < mLength))
        {
          if (!mAttributesOffsets.contains(Integer.valueOf(paramInt)))
          {
            paramByteOrderedDataInputStream.seek(l2);
            if (mAttributes[4].isEmpty()) {
              readImageFileDirectory(paramByteOrderedDataInputStream, 4);
            } else if (mAttributes[5].isEmpty()) {
              readImageFileDirectory(paramByteOrderedDataInputStream, 5);
            }
          }
          else
          {
            paramByteOrderedDataInputStream = new StringBuilder();
            paramByteOrderedDataInputStream.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
            paramByteOrderedDataInputStream.append(paramInt);
            Log.w("ExifInterface", paramByteOrderedDataInputStream.toString());
          }
        }
        else
        {
          paramByteOrderedDataInputStream = new StringBuilder();
          paramByteOrderedDataInputStream.append("Stop reading file since a wrong offset may cause an infinite loop: ");
          paramByteOrderedDataInputStream.append(paramInt);
          Log.w("ExifInterface", paramByteOrderedDataInputStream.toString());
        }
      }
    }
  }
  
  private void removeAttribute(String paramString)
  {
    for (int i = 0; i < EXIF_TAGS.length; i++) {
      mAttributes[i].remove(paramString);
    }
  }
  
  private void retrieveJpegImageSize(ByteOrderedDataInputStream paramByteOrderedDataInputStream, int paramInt)
    throws IOException
  {
    ExifAttribute localExifAttribute1 = (ExifAttribute)mAttributes[paramInt].get("ImageLength");
    ExifAttribute localExifAttribute2 = (ExifAttribute)mAttributes[paramInt].get("ImageWidth");
    if ((localExifAttribute1 == null) || (localExifAttribute2 == null))
    {
      localExifAttribute1 = (ExifAttribute)mAttributes[paramInt].get("JPEGInterchangeFormat");
      if (localExifAttribute1 != null) {
        getJpegAttributes(paramByteOrderedDataInputStream, localExifAttribute1.getIntValue(mExifByteOrder), paramInt);
      }
    }
  }
  
  private void saveJpegAttributes(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    paramInputStream = new DataInputStream(paramInputStream);
    paramOutputStream = new ByteOrderedDataOutputStream(paramOutputStream, ByteOrder.BIG_ENDIAN);
    if (paramInputStream.readByte() == -1)
    {
      paramOutputStream.writeByte(-1);
      if (paramInputStream.readByte() == -40)
      {
        paramOutputStream.writeByte(-40);
        paramOutputStream.writeByte(-1);
        paramOutputStream.writeByte(-31);
        writeExifSegment(paramOutputStream, 6);
        byte[] arrayOfByte1 = new byte['က'];
        while (paramInputStream.readByte() == -1)
        {
          int i = paramInputStream.readByte();
          if ((i != -39) && (i != -38))
          {
            int j;
            if (i != -31)
            {
              paramOutputStream.writeByte(-1);
              paramOutputStream.writeByte(i);
              i = paramInputStream.readUnsignedShort();
              paramOutputStream.writeUnsignedShort(i);
              i -= 2;
              if (i >= 0) {
                for (;;)
                {
                  if (i <= 0) {
                    break label182;
                  }
                  j = paramInputStream.read(arrayOfByte1, 0, Math.min(i, 4096));
                  if (j < 0) {
                    break;
                  }
                  paramOutputStream.write(arrayOfByte1, 0, j);
                  i -= j;
                }
              } else {
                label182:
                throw new IOException("Invalid length");
              }
            }
            else
            {
              j = paramInputStream.readUnsignedShort() - 2;
              if (j >= 0)
              {
                byte[] arrayOfByte2 = new byte[6];
                if (j >= 6) {
                  if (paramInputStream.read(arrayOfByte2) == 6)
                  {
                    if (Arrays.equals(arrayOfByte2, IDENTIFIER_EXIF_APP1))
                    {
                      i = j - 6;
                      if (paramInputStream.skipBytes(i) == i) {
                        continue;
                      }
                      throw new IOException("Invalid length");
                    }
                  }
                  else {
                    throw new IOException("Invalid exif");
                  }
                }
                paramOutputStream.writeByte(-1);
                paramOutputStream.writeByte(i);
                paramOutputStream.writeUnsignedShort(j + 2);
                i = j;
                if (j >= 6)
                {
                  i = j - 6;
                  paramOutputStream.write(arrayOfByte2);
                }
                for (;;)
                {
                  if (i <= 0) {
                    break label371;
                  }
                  j = paramInputStream.read(arrayOfByte1, 0, Math.min(i, 4096));
                  if (j < 0) {
                    break;
                  }
                  paramOutputStream.write(arrayOfByte1, 0, j);
                  i -= j;
                }
              }
              else
              {
                label371:
                throw new IOException("Invalid length");
              }
            }
          }
          else
          {
            paramOutputStream.writeByte(-1);
            paramOutputStream.writeByte(i);
            copy(paramInputStream, paramOutputStream);
            return;
          }
        }
        throw new IOException("Invalid marker");
      }
      throw new IOException("Invalid marker");
    }
    throw new IOException("Invalid marker");
  }
  
  private void setThumbnailData(ByteOrderedDataInputStream paramByteOrderedDataInputStream)
    throws IOException
  {
    HashMap localHashMap = mAttributes[4];
    ExifAttribute localExifAttribute = (ExifAttribute)localHashMap.get("Compression");
    if (localExifAttribute != null)
    {
      int i = localExifAttribute.getIntValue(mExifByteOrder);
      mThumbnailCompression = i;
      if (i != 1) {
        if (i != 6)
        {
          if (i != 7) {
            return;
          }
        }
        else
        {
          handleThumbnailFromJfif(paramByteOrderedDataInputStream, localHashMap);
          return;
        }
      }
      if (isSupportedDataType(localHashMap)) {
        handleThumbnailFromStrips(paramByteOrderedDataInputStream, localHashMap);
      }
    }
    else
    {
      mThumbnailCompression = 6;
      handleThumbnailFromJfif(paramByteOrderedDataInputStream, localHashMap);
    }
  }
  
  private void swapBasedOnImageSize(int paramInt1, int paramInt2)
    throws IOException
  {
    if ((!mAttributes[paramInt1].isEmpty()) && (!mAttributes[paramInt2].isEmpty()))
    {
      ExifAttribute localExifAttribute1 = (ExifAttribute)mAttributes[paramInt1].get("ImageLength");
      Object localObject = (ExifAttribute)mAttributes[paramInt1].get("ImageWidth");
      ExifAttribute localExifAttribute2 = (ExifAttribute)mAttributes[paramInt2].get("ImageLength");
      ExifAttribute localExifAttribute3 = (ExifAttribute)mAttributes[paramInt2].get("ImageWidth");
      if ((localExifAttribute1 != null) && (localObject != null) && (localExifAttribute2 != null) && (localExifAttribute3 != null))
      {
        int i = localExifAttribute1.getIntValue(mExifByteOrder);
        int j = ((ExifAttribute)localObject).getIntValue(mExifByteOrder);
        int k = localExifAttribute2.getIntValue(mExifByteOrder);
        int m = localExifAttribute3.getIntValue(mExifByteOrder);
        if ((i < k) && (j < m))
        {
          localObject = mAttributes;
          localExifAttribute2 = localObject[paramInt1];
          localObject[paramInt1] = localObject[paramInt2];
          localObject[paramInt2] = localExifAttribute2;
        }
      }
    }
  }
  
  private boolean updateAttribute(String paramString, ExifAttribute paramExifAttribute)
  {
    int i = 0;
    boolean bool = false;
    while (i < EXIF_TAGS.length)
    {
      if (mAttributes[i].containsKey(paramString))
      {
        mAttributes[i].put(paramString, paramExifAttribute);
        bool = true;
      }
      i++;
    }
    return bool;
  }
  
  private void updateImageSizeValues(ByteOrderedDataInputStream paramByteOrderedDataInputStream, int paramInt)
    throws IOException
  {
    ExifAttribute localExifAttribute1 = (ExifAttribute)mAttributes[paramInt].get("DefaultCropSize");
    Object localObject = (ExifAttribute)mAttributes[paramInt].get("SensorTopBorder");
    ExifAttribute localExifAttribute2 = (ExifAttribute)mAttributes[paramInt].get("SensorLeftBorder");
    ExifAttribute localExifAttribute3 = (ExifAttribute)mAttributes[paramInt].get("SensorBottomBorder");
    ExifAttribute localExifAttribute4 = (ExifAttribute)mAttributes[paramInt].get("SensorRightBorder");
    if (localExifAttribute1 != null)
    {
      if (format == 5)
      {
        paramByteOrderedDataInputStream = (Rational[])localExifAttribute1.getValue(mExifByteOrder);
        if ((paramByteOrderedDataInputStream != null) && (paramByteOrderedDataInputStream.length == 2))
        {
          localObject = ExifAttribute.createURational(paramByteOrderedDataInputStream[0], mExifByteOrder);
          paramByteOrderedDataInputStream = ExifAttribute.createURational(paramByteOrderedDataInputStream[1], mExifByteOrder);
        }
        else
        {
          localObject = z2.t("Invalid crop size values. cropSize=");
          ((StringBuilder)localObject).append(Arrays.toString(paramByteOrderedDataInputStream));
          Log.w("ExifInterface", ((StringBuilder)localObject).toString());
        }
      }
      else
      {
        paramByteOrderedDataInputStream = (int[])localExifAttribute1.getValue(mExifByteOrder);
        if ((paramByteOrderedDataInputStream == null) || (paramByteOrderedDataInputStream.length != 2)) {
          break label258;
        }
        localObject = ExifAttribute.createUShort(paramByteOrderedDataInputStream[0], mExifByteOrder);
        paramByteOrderedDataInputStream = ExifAttribute.createUShort(paramByteOrderedDataInputStream[1], mExifByteOrder);
      }
      mAttributes[paramInt].put("ImageWidth", localObject);
      mAttributes[paramInt].put("ImageLength", paramByteOrderedDataInputStream);
      return;
      label258:
      localObject = z2.t("Invalid crop size values. cropSize=");
      ((StringBuilder)localObject).append(Arrays.toString(paramByteOrderedDataInputStream));
      Log.w("ExifInterface", ((StringBuilder)localObject).toString());
    }
    else if ((localObject != null) && (localExifAttribute2 != null) && (localExifAttribute3 != null) && (localExifAttribute4 != null))
    {
      int i = ((ExifAttribute)localObject).getIntValue(mExifByteOrder);
      int j = localExifAttribute3.getIntValue(mExifByteOrder);
      int k = localExifAttribute4.getIntValue(mExifByteOrder);
      int m = localExifAttribute2.getIntValue(mExifByteOrder);
      if ((j > i) && (k > m))
      {
        paramByteOrderedDataInputStream = ExifAttribute.createUShort(j - i, mExifByteOrder);
        localObject = ExifAttribute.createUShort(k - m, mExifByteOrder);
        mAttributes[paramInt].put("ImageLength", paramByteOrderedDataInputStream);
        mAttributes[paramInt].put("ImageWidth", localObject);
      }
    }
    else
    {
      retrieveJpegImageSize(paramByteOrderedDataInputStream, paramInt);
    }
  }
  
  private void validateImages(InputStream paramInputStream)
    throws IOException
  {
    swapBasedOnImageSize(0, 5);
    swapBasedOnImageSize(0, 4);
    swapBasedOnImageSize(5, 4);
    ExifAttribute localExifAttribute = (ExifAttribute)mAttributes[1].get("PixelXDimension");
    paramInputStream = (ExifAttribute)mAttributes[1].get("PixelYDimension");
    if ((localExifAttribute != null) && (paramInputStream != null))
    {
      mAttributes[0].put("ImageWidth", localExifAttribute);
      mAttributes[0].put("ImageLength", paramInputStream);
    }
    if ((mAttributes[4].isEmpty()) && (isThumbnail(mAttributes[5])))
    {
      paramInputStream = mAttributes;
      paramInputStream[4] = paramInputStream[5];
      paramInputStream[5] = new HashMap();
    }
    if (!isThumbnail(mAttributes[4])) {
      Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }
  }
  
  private int writeExifSegment(ByteOrderedDataOutputStream paramByteOrderedDataOutputStream, int paramInt)
    throws IOException
  {
    Object localObject1 = EXIF_TAGS;
    int[] arrayOfInt = new int[localObject1.length];
    localObject1 = new int[localObject1.length];
    Object localObject2 = EXIF_POINTER_TAGS;
    int i = localObject2.length;
    for (int j = 0; j < i; j++) {
      removeAttribute(name);
    }
    removeAttribute(JPEG_INTERCHANGE_FORMAT_TAGname);
    removeAttribute(JPEG_INTERCHANGE_FORMAT_LENGTH_TAGname);
    for (j = 0; j < EXIF_TAGS.length; j++)
    {
      Object[] arrayOfObject = mAttributes[j].entrySet().toArray();
      k = arrayOfObject.length;
      for (i = 0; i < k; i++)
      {
        localObject2 = (Map.Entry)arrayOfObject[i];
        if (((Map.Entry)localObject2).getValue() == null) {
          mAttributes[j].remove(((Map.Entry)localObject2).getKey());
        }
      }
    }
    if (!mAttributes[1].isEmpty()) {
      mAttributes[0].put(EXIF_POINTER_TAGS1name, ExifAttribute.createULong(0L, mExifByteOrder));
    }
    if (!mAttributes[2].isEmpty()) {
      mAttributes[0].put(EXIF_POINTER_TAGS2name, ExifAttribute.createULong(0L, mExifByteOrder));
    }
    if (!mAttributes[3].isEmpty()) {
      mAttributes[1].put(EXIF_POINTER_TAGS3name, ExifAttribute.createULong(0L, mExifByteOrder));
    }
    if (mHasThumbnail)
    {
      mAttributes[4].put(JPEG_INTERCHANGE_FORMAT_TAGname, ExifAttribute.createULong(0L, mExifByteOrder));
      mAttributes[4].put(JPEG_INTERCHANGE_FORMAT_LENGTH_TAGname, ExifAttribute.createULong(mThumbnailLength, mExifByteOrder));
    }
    for (j = 0; j < EXIF_TAGS.length; j++)
    {
      localObject2 = mAttributes[j].entrySet().iterator();
      i = 0;
      while (((Iterator)localObject2).hasNext())
      {
        k = ((ExifAttribute)((Map.Entry)((Iterator)localObject2).next()).getValue()).size();
        if (k > 4) {
          i += k;
        }
      }
      localObject1[j] += i;
    }
    j = 8;
    int k = 0;
    while (k < EXIF_TAGS.length)
    {
      i = j;
      if (!mAttributes[k].isEmpty())
      {
        arrayOfInt[k] = j;
        i = j + (mAttributes[k].size() * 12 + 2 + 4 + localObject1[k]);
      }
      k++;
      j = i;
    }
    i = j;
    if (mHasThumbnail)
    {
      mAttributes[4].put(JPEG_INTERCHANGE_FORMAT_TAGname, ExifAttribute.createULong(j, mExifByteOrder));
      mThumbnailOffset = (paramInt + j);
      i = j + mThumbnailLength;
    }
    k = i + 8;
    if (!mAttributes[1].isEmpty()) {
      mAttributes[0].put(EXIF_POINTER_TAGS1name, ExifAttribute.createULong(arrayOfInt[1], mExifByteOrder));
    }
    if (!mAttributes[2].isEmpty()) {
      mAttributes[0].put(EXIF_POINTER_TAGS2name, ExifAttribute.createULong(arrayOfInt[2], mExifByteOrder));
    }
    if (!mAttributes[3].isEmpty()) {
      mAttributes[1].put(EXIF_POINTER_TAGS3name, ExifAttribute.createULong(arrayOfInt[3], mExifByteOrder));
    }
    paramByteOrderedDataOutputStream.writeUnsignedShort(k);
    paramByteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
    int m;
    if (mExifByteOrder == ByteOrder.BIG_ENDIAN)
    {
      paramInt = 19789;
      m = paramInt;
    }
    else
    {
      paramInt = 18761;
      m = paramInt;
    }
    paramByteOrderedDataOutputStream.writeShort(m);
    paramByteOrderedDataOutputStream.setByteOrder(mExifByteOrder);
    paramByteOrderedDataOutputStream.writeUnsignedShort(42);
    paramByteOrderedDataOutputStream.writeUnsignedInt(8L);
    for (paramInt = 0; paramInt < EXIF_TAGS.length; paramInt++) {
      if (!mAttributes[paramInt].isEmpty())
      {
        paramByteOrderedDataOutputStream.writeUnsignedShort(mAttributes[paramInt].size());
        j = arrayOfInt[paramInt];
        j = mAttributes[paramInt].size() * 12 + (j + 2) + 4;
        localObject1 = mAttributes[paramInt].entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          int n = sExifTagMapsForWritinggetgetKeynumber;
          localObject2 = (ExifAttribute)((Map.Entry)localObject2).getValue();
          i = ((ExifAttribute)localObject2).size();
          paramByteOrderedDataOutputStream.writeUnsignedShort(n);
          paramByteOrderedDataOutputStream.writeUnsignedShort(format);
          paramByteOrderedDataOutputStream.writeInt(numberOfComponents);
          if (i > 4)
          {
            paramByteOrderedDataOutputStream.writeUnsignedInt(j);
            j += i;
          }
          else
          {
            paramByteOrderedDataOutputStream.write(bytes);
            if (i < 4) {
              while (i < 4)
              {
                paramByteOrderedDataOutputStream.writeByte(0);
                i++;
              }
            }
          }
        }
        if ((paramInt == 0) && (!mAttributes[4].isEmpty())) {
          paramByteOrderedDataOutputStream.writeUnsignedInt(arrayOfInt[4]);
        } else {
          paramByteOrderedDataOutputStream.writeUnsignedInt(0L);
        }
        localObject2 = mAttributes[paramInt].entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = nextgetValuebytes;
          if (localObject1.length > 4) {
            paramByteOrderedDataOutputStream.write((byte[])localObject1, 0, localObject1.length);
          }
        }
      }
    }
    if (mHasThumbnail) {
      paramByteOrderedDataOutputStream.write(getThumbnailBytes());
    }
    paramByteOrderedDataOutputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
    return k;
  }
  
  public void flipHorizontally()
  {
    int i = 1;
    switch (getAttributeInt("Orientation", 1))
    {
    default: 
      i = 0;
      break;
    case 8: 
      i = 7;
      break;
    case 7: 
      i = 8;
      break;
    case 6: 
      i = 5;
      break;
    case 5: 
      i = 6;
      break;
    case 4: 
      i = 3;
      break;
    case 3: 
      i = 4;
      break;
    case 1: 
      i = 2;
    }
    setAttribute("Orientation", Integer.toString(i));
  }
  
  public void flipVertically()
  {
    int i = 1;
    switch (getAttributeInt("Orientation", 1))
    {
    default: 
      i = 0;
      break;
    case 8: 
      i = 5;
      break;
    case 7: 
      i = 6;
      break;
    case 6: 
      i = 7;
      break;
    case 5: 
      i = 8;
      break;
    case 3: 
      i = 2;
      break;
    case 2: 
      i = 3;
      break;
    case 1: 
      i = 4;
    }
    setAttribute("Orientation", Integer.toString(i));
  }
  
  public double getAltitude(double paramDouble)
  {
    double d = getAttributeDouble("GPSAltitude", -1.0D);
    int i = -1;
    int j = getAttributeInt("GPSAltitudeRef", -1);
    if ((d >= 0.0D) && (j >= 0))
    {
      if (j != 1) {
        i = 1;
      }
      return d * i;
    }
    return paramDouble;
  }
  
  @Nullable
  public String getAttribute(@NonNull String paramString)
  {
    Object localObject = getExifAttribute(paramString);
    if (localObject != null)
    {
      if (!sTagSetForCompatibility.contains(paramString)) {
        return ((ExifAttribute)localObject).getStringValue(mExifByteOrder);
      }
      if (paramString.equals("GPSTimeStamp"))
      {
        int i = format;
        if ((i != 5) && (i != 10))
        {
          paramString = z2.t("GPS Timestamp format is not rational. format=");
          paramString.append(format);
          Log.w("ExifInterface", paramString.toString());
          return null;
        }
        paramString = (Rational[])((ExifAttribute)localObject).getValue(mExifByteOrder);
        if ((paramString != null) && (paramString.length == 3))
        {
          localObject = paramString[0];
          int j = (int)((float)numerator / (float)denominator);
          localObject = paramString[1];
          i = (int)((float)numerator / (float)denominator);
          paramString = paramString[2];
          return String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf((int)((float)numerator / (float)denominator)) });
        }
        localObject = z2.t("Invalid GPS Timestamp array. array=");
        ((StringBuilder)localObject).append(Arrays.toString(paramString));
        Log.w("ExifInterface", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    try
    {
      paramString = Double.toString(((ExifAttribute)localObject).getDoubleValue(mExifByteOrder));
      return paramString;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return null;
  }
  
  public double getAttributeDouble(@NonNull String paramString, double paramDouble)
  {
    paramString = getExifAttribute(paramString);
    if (paramString == null) {
      return paramDouble;
    }
    try
    {
      double d = paramString.getDoubleValue(mExifByteOrder);
      return d;
    }
    catch (NumberFormatException paramString) {}
    return paramDouble;
  }
  
  public int getAttributeInt(@NonNull String paramString, int paramInt)
  {
    paramString = getExifAttribute(paramString);
    if (paramString == null) {
      return paramInt;
    }
    try
    {
      int i = paramString.getIntValue(mExifByteOrder);
      return i;
    }
    catch (NumberFormatException paramString) {}
    return paramInt;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public long getDateTime()
  {
    String str = getAttribute("DateTime");
    Object localObject;
    if ((str != null) && (sNonZeroTimePattern.matcher(str).matches())) {
      localObject = new ParsePosition(0);
    }
    for (;;)
    {
      long l1;
      long l2;
      try
      {
        localObject = sFormatter.parse(str, (ParsePosition)localObject);
        if (localObject == null) {
          return -1L;
        }
        l1 = ((Date)localObject).getTime();
        localObject = getAttribute("SubSecTime");
        l2 = l1;
        if (localObject == null) {}
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        continue;
      }
      try
      {
        l2 = Long.parseLong((String)localObject);
        if (l2 > 1000L) {
          l2 /= 10L;
        } else {
          l2 = l1 + l2;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        l2 = l1;
      }
    }
    return l2;
    return -1L;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public long getGpsDateTime()
  {
    Object localObject1 = getAttribute("GPSDateStamp");
    String str = getAttribute("GPSTimeStamp");
    if ((localObject1 != null) && (str != null))
    {
      Object localObject2 = sNonZeroTimePattern;
      if ((((Pattern)localObject2).matcher((CharSequence)localObject1).matches()) || (((Pattern)localObject2).matcher(str).matches()))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(' ');
        ((StringBuilder)localObject2).append(str);
        str = ((StringBuilder)localObject2).toString();
        localObject1 = new ParsePosition(0);
      }
    }
    try
    {
      localObject1 = sFormatter.parse(str, (ParsePosition)localObject1);
      if (localObject1 == null) {
        return -1L;
      }
      long l = ((Date)localObject1).getTime();
      return l;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    return -1L;
  }
  
  @Deprecated
  public boolean getLatLong(float[] paramArrayOfFloat)
  {
    double[] arrayOfDouble = getLatLong();
    if (arrayOfDouble == null) {
      return false;
    }
    paramArrayOfFloat[0] = ((float)arrayOfDouble[0]);
    paramArrayOfFloat[1] = ((float)arrayOfDouble[1]);
    return true;
  }
  
  @Nullable
  public double[] getLatLong()
  {
    String str1 = getAttribute("GPSLatitude");
    String str2 = getAttribute("GPSLatitudeRef");
    String str3 = getAttribute("GPSLongitude");
    String str4 = getAttribute("GPSLongitudeRef");
    if ((str1 != null) && (str2 != null) && (str3 != null) && (str4 != null)) {
      try
      {
        double d1 = convertRationalLatLonToDouble(str1, str2);
        double d2 = convertRationalLatLonToDouble(str3, str4);
        return new double[] { d1, d2 };
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        StringBuilder localStringBuilder = z2.t("Latitude/longitude values are not parseable. ");
        localStringBuilder.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[] { str1, str2, str3, str4 }));
        Log.w("ExifInterface", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public int getRotationDegrees()
  {
    switch (getAttributeInt("Orientation", 1))
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
  
  @Nullable
  public byte[] getThumbnail()
  {
    int i = mThumbnailCompression;
    if ((i != 6) && (i != 7)) {
      return null;
    }
    return getThumbnailBytes();
  }
  
  @Nullable
  public Bitmap getThumbnailBitmap()
  {
    if (!mHasThumbnail) {
      return null;
    }
    if (mThumbnailBytes == null) {
      mThumbnailBytes = getThumbnailBytes();
    }
    int i = mThumbnailCompression;
    if ((i != 6) && (i != 7))
    {
      if (i == 1)
      {
        int j = mThumbnailBytes.length / 3;
        int[] arrayOfInt = new int[j];
        for (i = 0; i < j; i++)
        {
          localObject = mThumbnailBytes;
          int k = i * 3;
          arrayOfInt[i] = ((localObject[k] << 16) + 0 + (localObject[(k + 1)] << 8) + localObject[(k + 2)]);
        }
        ExifAttribute localExifAttribute = (ExifAttribute)mAttributes[4].get("ImageLength");
        Object localObject = (ExifAttribute)mAttributes[4].get("ImageWidth");
        if ((localExifAttribute != null) && (localObject != null))
        {
          i = localExifAttribute.getIntValue(mExifByteOrder);
          return Bitmap.createBitmap(arrayOfInt, ((ExifAttribute)localObject).getIntValue(mExifByteOrder), i, Bitmap.Config.ARGB_8888);
        }
      }
      return null;
    }
    return BitmapFactory.decodeByteArray(mThumbnailBytes, 0, mThumbnailLength);
  }
  
  /* Error */
  @Nullable
  public byte[] getThumbnailBytes()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 1508	androidx/exifinterface/media/ExifInterface:mHasThumbnail	Z
    //   4: istore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: iload_1
    //   8: ifne +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_0
    //   14: getfield 1514	androidx/exifinterface/media/ExifInterface:mThumbnailBytes	[B
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull +5 -> 24
    //   22: aload_3
    //   23: areturn
    //   24: aload_0
    //   25: getfield 1166	androidx/exifinterface/media/ExifInterface:mAssetInputStream	Landroid/content/res/AssetManager$AssetInputStream;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull +52 -> 82
    //   33: aload_3
    //   34: astore 4
    //   36: aload_3
    //   37: astore_2
    //   38: aload_3
    //   39: invokevirtual 1919	java/io/InputStream:markSupported	()Z
    //   42: ifeq +15 -> 57
    //   45: aload_3
    //   46: astore 4
    //   48: aload_3
    //   49: astore_2
    //   50: aload_3
    //   51: invokevirtual 1920	java/io/InputStream:reset	()V
    //   54: goto +52 -> 106
    //   57: aload_3
    //   58: astore 4
    //   60: aload_3
    //   61: astore_2
    //   62: ldc_w 364
    //   65: ldc_w 1922
    //   68: invokestatic 1526	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   71: pop
    //   72: aload_3
    //   73: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   76: aconst_null
    //   77: areturn
    //   78: astore_3
    //   79: goto +214 -> 293
    //   82: aload_0
    //   83: getfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   86: ifnull +18 -> 104
    //   89: new 1178	java/io/FileInputStream
    //   92: dup
    //   93: aload_0
    //   94: getfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   97: invokespecial 1179	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   100: astore_3
    //   101: goto +5 -> 106
    //   104: aconst_null
    //   105: astore_3
    //   106: aload_3
    //   107: ifnull +150 -> 257
    //   110: aload_3
    //   111: astore 4
    //   113: aload_3
    //   114: astore_2
    //   115: aload_3
    //   116: aload_0
    //   117: getfield 1510	androidx/exifinterface/media/ExifInterface:mThumbnailOffset	I
    //   120: i2l
    //   121: invokevirtual 1926	java/io/InputStream:skip	(J)J
    //   124: lstore 5
    //   126: aload_3
    //   127: astore 4
    //   129: aload_3
    //   130: astore_2
    //   131: aload_0
    //   132: getfield 1510	androidx/exifinterface/media/ExifInterface:mThumbnailOffset	I
    //   135: istore 7
    //   137: lload 5
    //   139: iload 7
    //   141: i2l
    //   142: lcmp
    //   143: ifne +83 -> 226
    //   146: aload_3
    //   147: astore 4
    //   149: aload_3
    //   150: astore_2
    //   151: aload_0
    //   152: getfield 1512	androidx/exifinterface/media/ExifInterface:mThumbnailLength	I
    //   155: newarray <illegal type>
    //   157: astore 8
    //   159: aload_3
    //   160: astore 4
    //   162: aload_3
    //   163: astore_2
    //   164: aload_3
    //   165: aload 8
    //   167: invokevirtual 1280	java/io/InputStream:read	([B)I
    //   170: aload_0
    //   171: getfield 1512	androidx/exifinterface/media/ExifInterface:mThumbnailLength	I
    //   174: if_icmpne +21 -> 195
    //   177: aload_3
    //   178: astore 4
    //   180: aload_3
    //   181: astore_2
    //   182: aload_0
    //   183: aload 8
    //   185: putfield 1514	androidx/exifinterface/media/ExifInterface:mThumbnailBytes	[B
    //   188: aload_3
    //   189: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   192: aload 8
    //   194: areturn
    //   195: aload_3
    //   196: astore 4
    //   198: aload_3
    //   199: astore_2
    //   200: new 1144	java/io/IOException
    //   203: astore 8
    //   205: aload_3
    //   206: astore 4
    //   208: aload_3
    //   209: astore_2
    //   210: aload 8
    //   212: ldc_w 1928
    //   215: invokespecial 1318	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   218: aload_3
    //   219: astore 4
    //   221: aload_3
    //   222: astore_2
    //   223: aload 8
    //   225: athrow
    //   226: aload_3
    //   227: astore 4
    //   229: aload_3
    //   230: astore_2
    //   231: new 1144	java/io/IOException
    //   234: astore 8
    //   236: aload_3
    //   237: astore 4
    //   239: aload_3
    //   240: astore_2
    //   241: aload 8
    //   243: ldc_w 1928
    //   246: invokespecial 1318	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   249: aload_3
    //   250: astore 4
    //   252: aload_3
    //   253: astore_2
    //   254: aload 8
    //   256: athrow
    //   257: aload_3
    //   258: astore 4
    //   260: aload_3
    //   261: astore_2
    //   262: new 1930	java/io/FileNotFoundException
    //   265: astore 8
    //   267: aload_3
    //   268: astore 4
    //   270: aload_3
    //   271: astore_2
    //   272: aload 8
    //   274: invokespecial 1931	java/io/FileNotFoundException:<init>	()V
    //   277: aload_3
    //   278: astore 4
    //   280: aload_3
    //   281: astore_2
    //   282: aload 8
    //   284: athrow
    //   285: astore_3
    //   286: goto +29 -> 315
    //   289: astore_3
    //   290: aconst_null
    //   291: astore 4
    //   293: aload 4
    //   295: astore_2
    //   296: ldc_w 364
    //   299: ldc_w 1933
    //   302: aload_3
    //   303: invokestatic 1936	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   306: pop
    //   307: aload 4
    //   309: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   312: aconst_null
    //   313: areturn
    //   314: astore_3
    //   315: aload_2
    //   316: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   319: aload_3
    //   320: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	321	0	this	ExifInterface
    //   4	4	1	bool	boolean
    //   6	310	2	localObject1	Object
    //   17	56	3	localObject2	Object
    //   78	1	3	localIOException1	IOException
    //   100	181	3	localFileInputStream	java.io.FileInputStream
    //   285	1	3	localObject3	Object
    //   289	14	3	localIOException2	IOException
    //   314	6	3	localObject4	Object
    //   34	274	4	localObject5	Object
    //   124	14	5	l	long
    //   135	5	7	i	int
    //   157	126	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   38	45	78	java/io/IOException
    //   50	54	78	java/io/IOException
    //   62	72	78	java/io/IOException
    //   115	126	78	java/io/IOException
    //   131	137	78	java/io/IOException
    //   151	159	78	java/io/IOException
    //   164	177	78	java/io/IOException
    //   182	188	78	java/io/IOException
    //   200	205	78	java/io/IOException
    //   210	218	78	java/io/IOException
    //   223	226	78	java/io/IOException
    //   231	236	78	java/io/IOException
    //   241	249	78	java/io/IOException
    //   254	257	78	java/io/IOException
    //   262	267	78	java/io/IOException
    //   272	277	78	java/io/IOException
    //   282	285	78	java/io/IOException
    //   24	29	285	finally
    //   82	101	285	finally
    //   24	29	289	java/io/IOException
    //   82	101	289	java/io/IOException
    //   38	45	314	finally
    //   50	54	314	finally
    //   62	72	314	finally
    //   115	126	314	finally
    //   131	137	314	finally
    //   151	159	314	finally
    //   164	177	314	finally
    //   182	188	314	finally
    //   200	205	314	finally
    //   210	218	314	finally
    //   223	226	314	finally
    //   231	236	314	finally
    //   241	249	314	finally
    //   254	257	314	finally
    //   262	267	314	finally
    //   272	277	314	finally
    //   282	285	314	finally
    //   296	307	314	finally
  }
  
  @Nullable
  public long[] getThumbnailRange()
  {
    if (!mHasThumbnail) {
      return null;
    }
    return new long[] { mThumbnailOffset, mThumbnailLength };
  }
  
  public boolean hasThumbnail()
  {
    return mHasThumbnail;
  }
  
  public boolean isFlipped()
  {
    int i = getAttributeInt("Orientation", 1);
    return (i == 2) || (i == 7) || (i == 4) || (i == 5);
  }
  
  public boolean isThumbnailCompressed()
  {
    int i = mThumbnailCompression;
    boolean bool;
    if ((i != 6) && (i != 7)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void resetOrientation()
  {
    setAttribute("Orientation", Integer.toString(1));
  }
  
  public void rotate(int paramInt)
  {
    if (paramInt % 90 == 0)
    {
      int i = getAttributeInt("Orientation", 1);
      List localList = ROTATION_ORDER;
      boolean bool = localList.contains(Integer.valueOf(i));
      int j = 0;
      int k = 0;
      int m = 0;
      if (bool)
      {
        j = localList.indexOf(Integer.valueOf(i));
        j = (paramInt / 90 + j) % 4;
        paramInt = m;
        if (j < 0) {
          paramInt = 4;
        }
        m = ((Integer)localList.get(j + paramInt)).intValue();
      }
      else
      {
        localList = FLIPPED_ROTATION_ORDER;
        m = k;
        if (localList.contains(Integer.valueOf(i)))
        {
          m = localList.indexOf(Integer.valueOf(i));
          m = (paramInt / 90 + m) % 4;
          paramInt = j;
          if (m < 0) {
            paramInt = 4;
          }
          m = ((Integer)localList.get(m + paramInt)).intValue();
        }
      }
      setAttribute("Orientation", Integer.toString(m));
      return;
    }
    throw new IllegalArgumentException("degree should be a multiple of 90");
  }
  
  /* Error */
  public void saveAttributes()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 1565	androidx/exifinterface/media/ExifInterface:mIsSupportedFile	Z
    //   4: ifeq +197 -> 201
    //   7: aload_0
    //   8: getfield 1446	androidx/exifinterface/media/ExifInterface:mMimeType	I
    //   11: iconst_4
    //   12: if_icmpne +189 -> 201
    //   15: aload_0
    //   16: getfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   19: ifnull +171 -> 190
    //   22: aload_0
    //   23: aload_0
    //   24: invokevirtual 1958	androidx/exifinterface/media/ExifInterface:getThumbnail	()[B
    //   27: putfield 1514	androidx/exifinterface/media/ExifInterface:mThumbnailBytes	[B
    //   30: new 1960	java/io/File
    //   33: dup
    //   34: new 1223	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 1224	java/lang/StringBuilder:<init>	()V
    //   41: aload_0
    //   42: getfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   45: ldc_w 1962
    //   48: invokestatic 1966	z2:s	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   51: invokespecial 1967	java/io/File:<init>	(Ljava/lang/String;)V
    //   54: astore_1
    //   55: new 1960	java/io/File
    //   58: dup
    //   59: aload_0
    //   60: getfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   63: invokespecial 1967	java/io/File:<init>	(Ljava/lang/String;)V
    //   66: aload_1
    //   67: invokevirtual 1971	java/io/File:renameTo	(Ljava/io/File;)Z
    //   70: ifeq +92 -> 162
    //   73: aconst_null
    //   74: astore_2
    //   75: new 1178	java/io/FileInputStream
    //   78: astore_3
    //   79: aload_3
    //   80: aload_1
    //   81: invokespecial 1974	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   84: new 1976	java/io/FileOutputStream
    //   87: astore 4
    //   89: aload 4
    //   91: aload_0
    //   92: getfield 1162	androidx/exifinterface/media/ExifInterface:mFilename	Ljava/lang/String;
    //   95: invokespecial 1977	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   98: aload_0
    //   99: aload_3
    //   100: aload 4
    //   102: invokespecial 1979	androidx/exifinterface/media/ExifInterface:saveJpegAttributes	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   105: aload_3
    //   106: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   109: aload 4
    //   111: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   114: aload_1
    //   115: invokevirtual 1982	java/io/File:delete	()Z
    //   118: pop
    //   119: aload_0
    //   120: aconst_null
    //   121: putfield 1514	androidx/exifinterface/media/ExifInterface:mThumbnailBytes	[B
    //   124: return
    //   125: astore 5
    //   127: goto +18 -> 145
    //   130: astore 5
    //   132: aconst_null
    //   133: astore 4
    //   135: goto +10 -> 145
    //   138: astore 5
    //   140: aconst_null
    //   141: astore 4
    //   143: aload_2
    //   144: astore_3
    //   145: aload_3
    //   146: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   149: aload 4
    //   151: invokestatic 1183	androidx/exifinterface/media/ExifInterface:closeQuietly	(Ljava/io/Closeable;)V
    //   154: aload_1
    //   155: invokevirtual 1982	java/io/File:delete	()Z
    //   158: pop
    //   159: aload 5
    //   161: athrow
    //   162: ldc_w 1984
    //   165: invokestatic 1343	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: astore_3
    //   169: aload_3
    //   170: aload_1
    //   171: invokevirtual 1987	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   174: invokevirtual 1233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: new 1144	java/io/IOException
    //   181: dup
    //   182: aload_3
    //   183: invokevirtual 1239	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokespecial 1318	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   189: athrow
    //   190: new 1144	java/io/IOException
    //   193: dup
    //   194: ldc_w 1989
    //   197: invokespecial 1318	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   200: athrow
    //   201: new 1144	java/io/IOException
    //   204: dup
    //   205: ldc_w 1991
    //   208: invokespecial 1318	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   211: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	ExifInterface
    //   54	117	1	localFile	java.io.File
    //   74	70	2	localObject1	Object
    //   78	105	3	localObject2	Object
    //   87	63	4	localFileOutputStream	java.io.FileOutputStream
    //   125	1	5	localObject3	Object
    //   130	1	5	localObject4	Object
    //   138	22	5	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   98	105	125	finally
    //   84	98	130	finally
    //   75	84	138	finally
  }
  
  public void setAltitude(double paramDouble)
  {
    String str;
    if (paramDouble >= 0.0D) {
      str = "0";
    } else {
      str = "1";
    }
    setAttribute("GPSAltitude", new Rational(Math.abs(paramDouble)).toString());
    setAttribute("GPSAltitudeRef", str);
  }
  
  public void setAttribute(@NonNull String paramString1, @Nullable String paramString2)
  {
    String str = paramString1;
    if ("ISOSpeedRatings".equals(paramString1)) {
      str = "PhotographicSensitivity";
    }
    int i = 1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (sTagSetForCompatibility.contains(str)) {
        if (str.equals("GPSTimeStamp"))
        {
          paramString1 = sGpsTimestampPattern.matcher(paramString2);
          if (!paramString1.find())
          {
            paramString1 = new StringBuilder();
            paramString1.append("Invalid value for ");
            paramString1.append(str);
            paramString1.append(" : ");
            paramString1.append(paramString2);
            Log.w("ExifInterface", paramString1.toString());
            return;
          }
          paramString2 = new StringBuilder();
          paramString2.append(Integer.parseInt(paramString1.group(1)));
          paramString2.append("/1,");
          paramString2.append(Integer.parseInt(paramString1.group(2)));
          paramString2.append("/1,");
          paramString2.append(Integer.parseInt(paramString1.group(3)));
          paramString2.append("/1");
          paramString1 = paramString2.toString();
        }
        else
        {
          try
          {
            double d = Double.parseDouble(paramString2);
            paramString1 = new androidx/exifinterface/media/ExifInterface$Rational;
            paramString1.<init>(d);
            paramString1 = paramString1.toString();
          }
          catch (NumberFormatException paramString1)
          {
            paramString1 = new StringBuilder();
            paramString1.append("Invalid value for ");
            paramString1.append(str);
            paramString1.append(" : ");
            paramString1.append(paramString2);
            Log.w("ExifInterface", paramString1.toString());
            return;
          }
        }
      }
    }
    int j = 0;
    for (;;)
    {
      int k = 0;
      int m = 0;
      if (j >= EXIF_TAGS.length) {
        break;
      }
      int n;
      if ((j == 4) && (!mHasThumbnail))
      {
        n = i;
      }
      else
      {
        ExifTag localExifTag = (ExifTag)sExifTagMapsForWriting[j].get(str);
        n = i;
        if (localExifTag != null) {
          if (paramString1 == null)
          {
            mAttributes[j].remove(str);
            n = i;
          }
          else
          {
            Pair localPair = guessDataFormat(paramString1);
            Object localObject1;
            Object localObject2;
            if ((primaryFormat != ((Integer)first).intValue()) && (primaryFormat != ((Integer)second).intValue()))
            {
              n = secondaryFormat;
              if ((n != -1) && ((n == ((Integer)first).intValue()) || (secondaryFormat == ((Integer)second).intValue())))
              {
                n = secondaryFormat;
              }
              else
              {
                n = primaryFormat;
                if ((n != i) && (n != 7) && (n != 2))
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("Given tag (");
                  ((StringBuilder)localObject1).append(str);
                  ((StringBuilder)localObject1).append(") value didn't match with one of expected ");
                  ((StringBuilder)localObject1).append("formats: ");
                  String[] arrayOfString = IFD_FORMAT_NAMES;
                  ((StringBuilder)localObject1).append(arrayOfString[primaryFormat]);
                  n = secondaryFormat;
                  localObject2 = "";
                  if (n == -1)
                  {
                    paramString2 = "";
                  }
                  else
                  {
                    paramString2 = z2.t(", ");
                    paramString2.append(arrayOfString[secondaryFormat]);
                    paramString2 = paramString2.toString();
                  }
                  ((StringBuilder)localObject1).append(paramString2);
                  ((StringBuilder)localObject1).append(" (guess: ");
                  ((StringBuilder)localObject1).append(arrayOfString[((Integer)first).intValue()]);
                  if (((Integer)second).intValue() == -1)
                  {
                    paramString2 = (String)localObject2;
                  }
                  else
                  {
                    paramString2 = z2.t(", ");
                    paramString2.append(arrayOfString[((Integer)second).intValue()]);
                    paramString2 = paramString2.toString();
                  }
                  ((StringBuilder)localObject1).append(paramString2);
                  ((StringBuilder)localObject1).append(")");
                  Log.w("ExifInterface", ((StringBuilder)localObject1).toString());
                  n = i;
                  break label1370;
                }
              }
            }
            else
            {
              n = primaryFormat;
            }
            switch (n)
            {
            case 6: 
            case 8: 
            case 11: 
            default: 
              paramString2 = new StringBuilder();
              paramString2.append("Data format isn't one of expected formats: ");
              paramString2.append(n);
              Log.w("ExifInterface", paramString2.toString());
              n = i;
              break;
            case 12: 
              localObject2 = paramString1.split(",", -1);
              paramString2 = new double[localObject2.length];
              for (n = m; n < localObject2.length; n++) {
                paramString2[n] = Double.parseDouble(localObject2[n]);
              }
              mAttributes[j].put(str, ExifAttribute.createDouble(paramString2, mExifByteOrder));
              n = i;
              break;
            case 10: 
              paramString2 = paramString1.split(",", -1);
              localObject1 = new Rational[paramString2.length];
              m = 0;
              n = k;
              while (n < paramString2.length)
              {
                localObject2 = paramString2[n].split("/", -1);
                localObject1[n] = new Rational(Double.parseDouble(localObject2[m]), Double.parseDouble(localObject2[i]));
                n++;
                i = 1;
                m = 0;
              }
              mAttributes[j].put(str, ExifAttribute.createSRational((Rational[])localObject1, mExifByteOrder));
              break;
            case 9: 
              localObject2 = paramString1.split(",", -1);
              paramString2 = new int[localObject2.length];
              for (i = 0; i < localObject2.length; i++) {
                paramString2[i] = Integer.parseInt(localObject2[i]);
              }
              mAttributes[j].put(str, ExifAttribute.createSLong(paramString2, mExifByteOrder));
            case 5: 
              for (;;)
              {
                n = 1;
                break;
                localObject1 = paramString1.split(",", -1);
                paramString2 = new Rational[localObject1.length];
                for (i = 0; i < localObject1.length; i++)
                {
                  localObject2 = localObject1[i].split("/", -1);
                  paramString2[i] = new Rational(Double.parseDouble(localObject2[0]), Double.parseDouble(localObject2[1]));
                }
                mAttributes[j].put(str, ExifAttribute.createURational(paramString2, mExifByteOrder));
              }
            case 4: 
              paramString2 = paramString1.split(",", -1);
              localObject2 = new long[paramString2.length];
              for (n = 0; n < paramString2.length; n++) {
                localObject2[n] = Long.parseLong(paramString2[n]);
              }
              mAttributes[j].put(str, ExifAttribute.createULong((long[])localObject2, mExifByteOrder));
              n = i;
              break;
            case 3: 
              localObject2 = paramString1.split(",", -1);
              paramString2 = new int[localObject2.length];
              for (n = 0; n < localObject2.length; n++) {
                paramString2[n] = Integer.parseInt(localObject2[n]);
              }
              mAttributes[j].put(str, ExifAttribute.createUShort(paramString2, mExifByteOrder));
              n = i;
              break;
            case 2: 
            case 7: 
              mAttributes[j].put(str, ExifAttribute.createString(paramString1));
              n = i;
              break;
            }
            mAttributes[j].put(str, ExifAttribute.createByte(paramString1));
            n = i;
          }
        }
      }
      label1370:
      j++;
      i = n;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void setDateTime(long paramLong)
  {
    setAttribute("DateTime", sFormatter.format(new Date(paramLong)));
    setAttribute("SubSecTime", Long.toString(paramLong % 1000L));
  }
  
  public void setGpsInfo(Location paramLocation)
  {
    if (paramLocation == null) {
      return;
    }
    setAttribute("GPSProcessingMethod", paramLocation.getProvider());
    setLatLong(paramLocation.getLatitude(), paramLocation.getLongitude());
    setAltitude(paramLocation.getAltitude());
    setAttribute("GPSSpeedRef", "K");
    setAttribute("GPSSpeed", new Rational(paramLocation.getSpeed() * (float)TimeUnit.HOURS.toSeconds(1L) / 1000.0F).toString());
    paramLocation = sFormatter.format(new Date(paramLocation.getTime())).split("\\s+", -1);
    setAttribute("GPSDateStamp", paramLocation[0]);
    setAttribute("GPSTimeStamp", paramLocation[1]);
  }
  
  public void setLatLong(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 >= -90.0D) && (paramDouble1 <= 90.0D) && (!Double.isNaN(paramDouble1)))
    {
      if ((paramDouble2 >= -180.0D) && (paramDouble2 <= 180.0D) && (!Double.isNaN(paramDouble2)))
      {
        if (paramDouble1 >= 0.0D) {
          localObject = "N";
        } else {
          localObject = "S";
        }
        setAttribute("GPSLatitudeRef", (String)localObject);
        setAttribute("GPSLatitude", convertDecimalDegree(Math.abs(paramDouble1)));
        if (paramDouble2 >= 0.0D) {
          localObject = "E";
        } else {
          localObject = "W";
        }
        setAttribute("GPSLongitudeRef", (String)localObject);
        setAttribute("GPSLongitude", convertDecimalDegree(Math.abs(paramDouble2)));
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Longitude value ");
      ((StringBuilder)localObject).append(paramDouble2);
      ((StringBuilder)localObject).append(" is not valid.");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Latitude value ");
    ((StringBuilder)localObject).append(paramDouble1);
    ((StringBuilder)localObject).append(" is not valid.");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public static class ByteOrderedDataInputStream
    extends InputStream
    implements DataInput
  {
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private ByteOrder mByteOrder = ByteOrder.BIG_ENDIAN;
    private DataInputStream mDataInputStream;
    public final int mLength;
    public int mPosition;
    
    public ByteOrderedDataInputStream(InputStream paramInputStream)
      throws IOException
    {
      paramInputStream = new DataInputStream(paramInputStream);
      mDataInputStream = paramInputStream;
      int i = paramInputStream.available();
      mLength = i;
      mPosition = 0;
      mDataInputStream.mark(i);
    }
    
    public ByteOrderedDataInputStream(byte[] paramArrayOfByte)
      throws IOException
    {
      this(new ByteArrayInputStream(paramArrayOfByte));
    }
    
    public int available()
      throws IOException
    {
      return mDataInputStream.available();
    }
    
    public int peek()
    {
      return mPosition;
    }
    
    public int read()
      throws IOException
    {
      mPosition += 1;
      return mDataInputStream.read();
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      paramInt1 = mDataInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      mPosition += paramInt1;
      return paramInt1;
    }
    
    public boolean readBoolean()
      throws IOException
    {
      mPosition += 1;
      return mDataInputStream.readBoolean();
    }
    
    public byte readByte()
      throws IOException
    {
      int i = mPosition + 1;
      mPosition = i;
      if (i <= mLength)
      {
        i = mDataInputStream.read();
        if (i >= 0) {
          return (byte)i;
        }
        throw new EOFException();
      }
      throw new EOFException();
    }
    
    public char readChar()
      throws IOException
    {
      mPosition += 2;
      return mDataInputStream.readChar();
    }
    
    public double readDouble()
      throws IOException
    {
      return Double.longBitsToDouble(readLong());
    }
    
    public float readFloat()
      throws IOException
    {
      return Float.intBitsToFloat(readInt());
    }
    
    public void readFully(byte[] paramArrayOfByte)
      throws IOException
    {
      int i = mPosition + paramArrayOfByte.length;
      mPosition = i;
      if (i <= mLength)
      {
        if (mDataInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length) == paramArrayOfByte.length) {
          return;
        }
        throw new IOException("Couldn't read up to the length of buffer");
      }
      throw new EOFException();
    }
    
    public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      int i = mPosition + paramInt2;
      mPosition = i;
      if (i <= mLength)
      {
        if (mDataInputStream.read(paramArrayOfByte, paramInt1, paramInt2) == paramInt2) {
          return;
        }
        throw new IOException("Couldn't read up to the length of buffer");
      }
      throw new EOFException();
    }
    
    public int readInt()
      throws IOException
    {
      int i = mPosition + 4;
      mPosition = i;
      if (i <= mLength)
      {
        int j = mDataInputStream.read();
        int k = mDataInputStream.read();
        i = mDataInputStream.read();
        int m = mDataInputStream.read();
        if ((j | k | i | m) >= 0)
        {
          Object localObject = mByteOrder;
          if (localObject == LITTLE_ENDIAN) {
            return (m << 24) + (i << 16) + (k << 8) + j;
          }
          if (localObject == BIG_ENDIAN) {
            return (j << 24) + (k << 16) + (i << 8) + m;
          }
          localObject = z2.t("Invalid byte order: ");
          ((StringBuilder)localObject).append(mByteOrder);
          throw new IOException(((StringBuilder)localObject).toString());
        }
        throw new EOFException();
      }
      throw new EOFException();
    }
    
    public String readLine()
      throws IOException
    {
      Log.d("ExifInterface", "Currently unsupported");
      return null;
    }
    
    public long readLong()
      throws IOException
    {
      int i = mPosition + 8;
      mPosition = i;
      if (i <= mLength)
      {
        int j = mDataInputStream.read();
        int k = mDataInputStream.read();
        int m = mDataInputStream.read();
        i = mDataInputStream.read();
        int n = mDataInputStream.read();
        int i1 = mDataInputStream.read();
        int i2 = mDataInputStream.read();
        int i3 = mDataInputStream.read();
        if ((j | k | m | i | n | i1 | i2 | i3) >= 0)
        {
          Object localObject = mByteOrder;
          if (localObject == LITTLE_ENDIAN) {
            return (i3 << 56) + (i2 << 48) + (i1 << 40) + (n << 32) + (i << 24) + (m << 16) + (k << 8) + j;
          }
          if (localObject == BIG_ENDIAN) {
            return (j << 56) + (k << 48) + (m << 40) + (i << 32) + (n << 24) + (i1 << 16) + (i2 << 8) + i3;
          }
          localObject = z2.t("Invalid byte order: ");
          ((StringBuilder)localObject).append(mByteOrder);
          throw new IOException(((StringBuilder)localObject).toString());
        }
        throw new EOFException();
      }
      throw new EOFException();
    }
    
    public short readShort()
      throws IOException
    {
      int i = mPosition + 2;
      mPosition = i;
      if (i <= mLength)
      {
        i = mDataInputStream.read();
        int j = mDataInputStream.read();
        if ((i | j) >= 0)
        {
          Object localObject = mByteOrder;
          if (localObject == LITTLE_ENDIAN) {
            return (short)((j << 8) + i);
          }
          if (localObject == BIG_ENDIAN) {
            return (short)((i << 8) + j);
          }
          localObject = z2.t("Invalid byte order: ");
          ((StringBuilder)localObject).append(mByteOrder);
          throw new IOException(((StringBuilder)localObject).toString());
        }
        throw new EOFException();
      }
      throw new EOFException();
    }
    
    public String readUTF()
      throws IOException
    {
      mPosition += 2;
      return mDataInputStream.readUTF();
    }
    
    public int readUnsignedByte()
      throws IOException
    {
      mPosition += 1;
      return mDataInputStream.readUnsignedByte();
    }
    
    public long readUnsignedInt()
      throws IOException
    {
      return readInt() & 0xFFFFFFFF;
    }
    
    public int readUnsignedShort()
      throws IOException
    {
      int i = mPosition + 2;
      mPosition = i;
      if (i <= mLength)
      {
        i = mDataInputStream.read();
        int j = mDataInputStream.read();
        if ((i | j) >= 0)
        {
          Object localObject = mByteOrder;
          if (localObject == LITTLE_ENDIAN) {
            return (j << 8) + i;
          }
          if (localObject == BIG_ENDIAN) {
            return (i << 8) + j;
          }
          localObject = z2.t("Invalid byte order: ");
          ((StringBuilder)localObject).append(mByteOrder);
          throw new IOException(((StringBuilder)localObject).toString());
        }
        throw new EOFException();
      }
      throw new EOFException();
    }
    
    public void seek(long paramLong)
      throws IOException
    {
      int i = mPosition;
      if (i > paramLong)
      {
        mPosition = 0;
        mDataInputStream.reset();
        mDataInputStream.mark(mLength);
      }
      else
      {
        paramLong -= i;
      }
      i = (int)paramLong;
      if (skipBytes(i) == i) {
        return;
      }
      throw new IOException("Couldn't seek up to the byteCount");
    }
    
    public void setByteOrder(ByteOrder paramByteOrder)
    {
      mByteOrder = paramByteOrder;
    }
    
    public int skipBytes(int paramInt)
      throws IOException
    {
      int i = Math.min(paramInt, mLength - mPosition);
      paramInt = 0;
      while (paramInt < i) {
        paramInt += mDataInputStream.skipBytes(i - paramInt);
      }
      mPosition += paramInt;
      return paramInt;
    }
  }
  
  public static class ByteOrderedDataOutputStream
    extends FilterOutputStream
  {
    private ByteOrder mByteOrder;
    private final OutputStream mOutputStream;
    
    public ByteOrderedDataOutputStream(OutputStream paramOutputStream, ByteOrder paramByteOrder)
    {
      super();
      mOutputStream = paramOutputStream;
      mByteOrder = paramByteOrder;
    }
    
    public void setByteOrder(ByteOrder paramByteOrder)
    {
      mByteOrder = paramByteOrder;
    }
    
    public void write(byte[] paramArrayOfByte)
      throws IOException
    {
      mOutputStream.write(paramArrayOfByte);
    }
    
    public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      mOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public void writeByte(int paramInt)
      throws IOException
    {
      mOutputStream.write(paramInt);
    }
    
    public void writeInt(int paramInt)
      throws IOException
    {
      ByteOrder localByteOrder = mByteOrder;
      if (localByteOrder == ByteOrder.LITTLE_ENDIAN)
      {
        mOutputStream.write(paramInt >>> 0 & 0xFF);
        mOutputStream.write(paramInt >>> 8 & 0xFF);
        mOutputStream.write(paramInt >>> 16 & 0xFF);
        mOutputStream.write(paramInt >>> 24 & 0xFF);
      }
      else if (localByteOrder == ByteOrder.BIG_ENDIAN)
      {
        mOutputStream.write(paramInt >>> 24 & 0xFF);
        mOutputStream.write(paramInt >>> 16 & 0xFF);
        mOutputStream.write(paramInt >>> 8 & 0xFF);
        mOutputStream.write(paramInt >>> 0 & 0xFF);
      }
    }
    
    public void writeShort(short paramShort)
      throws IOException
    {
      ByteOrder localByteOrder = mByteOrder;
      if (localByteOrder == ByteOrder.LITTLE_ENDIAN)
      {
        mOutputStream.write(paramShort >>> 0 & 0xFF);
        mOutputStream.write(paramShort >>> 8 & 0xFF);
      }
      else if (localByteOrder == ByteOrder.BIG_ENDIAN)
      {
        mOutputStream.write(paramShort >>> 8 & 0xFF);
        mOutputStream.write(paramShort >>> 0 & 0xFF);
      }
    }
    
    public void writeUnsignedInt(long paramLong)
      throws IOException
    {
      writeInt((int)paramLong);
    }
    
    public void writeUnsignedShort(int paramInt)
      throws IOException
    {
      writeShort((short)paramInt);
    }
  }
  
  public static class ExifAttribute
  {
    public final byte[] bytes;
    public final int format;
    public final int numberOfComponents;
    
    public ExifAttribute(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    {
      format = paramInt1;
      numberOfComponents = paramInt2;
      bytes = paramArrayOfByte;
    }
    
    public static ExifAttribute createByte(String paramString)
    {
      if ((paramString.length() == 1) && (paramString.charAt(0) >= '0') && (paramString.charAt(0) <= '1')) {
        return new ExifAttribute(1, 1, new byte[] { (byte)(paramString.charAt(0) - '0') });
      }
      paramString = paramString.getBytes(ExifInterface.ASCII);
      return new ExifAttribute(1, paramString.length, paramString);
    }
    
    public static ExifAttribute createDouble(double paramDouble, ByteOrder paramByteOrder)
    {
      return createDouble(new double[] { paramDouble }, paramByteOrder);
    }
    
    public static ExifAttribute createDouble(double[] paramArrayOfDouble, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * paramArrayOfDouble.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfDouble.length;
      for (int j = 0; j < i; j++) {
        localByteBuffer.putDouble(paramArrayOfDouble[j]);
      }
      return new ExifAttribute(12, paramArrayOfDouble.length, localByteBuffer.array());
    }
    
    public static ExifAttribute createSLong(int paramInt, ByteOrder paramByteOrder)
    {
      return createSLong(new int[] { paramInt }, paramByteOrder);
    }
    
    public static ExifAttribute createSLong(int[] paramArrayOfInt, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * paramArrayOfInt.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++) {
        localByteBuffer.putInt(paramArrayOfInt[j]);
      }
      return new ExifAttribute(9, paramArrayOfInt.length, localByteBuffer.array());
    }
    
    public static ExifAttribute createSRational(ExifInterface.Rational paramRational, ByteOrder paramByteOrder)
    {
      return createSRational(new ExifInterface.Rational[] { paramRational }, paramByteOrder);
    }
    
    public static ExifAttribute createSRational(ExifInterface.Rational[] paramArrayOfRational, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * paramArrayOfRational.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfRational.length;
      for (int j = 0; j < i; j++)
      {
        paramByteOrder = paramArrayOfRational[j];
        localByteBuffer.putInt((int)numerator);
        localByteBuffer.putInt((int)denominator);
      }
      return new ExifAttribute(10, paramArrayOfRational.length, localByteBuffer.array());
    }
    
    public static ExifAttribute createString(String paramString)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append('\000');
      paramString = localStringBuilder.toString().getBytes(ExifInterface.ASCII);
      return new ExifAttribute(2, paramString.length, paramString);
    }
    
    public static ExifAttribute createULong(long paramLong, ByteOrder paramByteOrder)
    {
      return createULong(new long[] { paramLong }, paramByteOrder);
    }
    
    public static ExifAttribute createULong(long[] paramArrayOfLong, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * paramArrayOfLong.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfLong.length;
      for (int j = 0; j < i; j++) {
        localByteBuffer.putInt((int)paramArrayOfLong[j]);
      }
      return new ExifAttribute(4, paramArrayOfLong.length, localByteBuffer.array());
    }
    
    public static ExifAttribute createURational(ExifInterface.Rational paramRational, ByteOrder paramByteOrder)
    {
      return createURational(new ExifInterface.Rational[] { paramRational }, paramByteOrder);
    }
    
    public static ExifAttribute createURational(ExifInterface.Rational[] paramArrayOfRational, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * paramArrayOfRational.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfRational.length;
      for (int j = 0; j < i; j++)
      {
        paramByteOrder = paramArrayOfRational[j];
        localByteBuffer.putInt((int)numerator);
        localByteBuffer.putInt((int)denominator);
      }
      return new ExifAttribute(5, paramArrayOfRational.length, localByteBuffer.array());
    }
    
    public static ExifAttribute createUShort(int paramInt, ByteOrder paramByteOrder)
    {
      return createUShort(new int[] { paramInt }, paramByteOrder);
    }
    
    public static ExifAttribute createUShort(int[] paramArrayOfInt, ByteOrder paramByteOrder)
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * paramArrayOfInt.length]);
      localByteBuffer.order(paramByteOrder);
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++) {
        localByteBuffer.putShort((short)paramArrayOfInt[j]);
      }
      return new ExifAttribute(3, paramArrayOfInt.length, localByteBuffer.array());
    }
    
    public double getDoubleValue(ByteOrder paramByteOrder)
    {
      paramByteOrder = getValue(paramByteOrder);
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
        if ((paramByteOrder instanceof ExifInterface.Rational[]))
        {
          paramByteOrder = (ExifInterface.Rational[])paramByteOrder;
          if (paramByteOrder.length == 1) {
            return paramByteOrder[0].calculate();
          }
          throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
      }
      throw new NumberFormatException("NULL can't be converted to a double value");
    }
    
    public int getIntValue(ByteOrder paramByteOrder)
    {
      paramByteOrder = getValue(paramByteOrder);
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
    
    public String getStringValue(ByteOrder paramByteOrder)
    {
      Object localObject = getValue(paramByteOrder);
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
      if ((localObject instanceof ExifInterface.Rational[]))
      {
        localObject = (ExifInterface.Rational[])localObject;
        m = k;
        while (m < localObject.length)
        {
          paramByteOrder.append(numerator);
          paramByteOrder.append('/');
          paramByteOrder.append(denominator);
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
    public Object getValue(ByteOrder paramByteOrder)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: new 189	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream
      //   5: astore_3
      //   6: aload_3
      //   7: aload_0
      //   8: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
      //   11: invokespecial 192	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:<init>	([B)V
      //   14: aload_3
      //   15: astore_2
      //   16: aload_3
      //   17: aload_1
      //   18: invokevirtual 196	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:setByteOrder	(Ljava/nio/ByteOrder;)V
      //   21: aload_3
      //   22: astore_2
      //   23: aload_0
      //   24: getfield 19	androidx/exifinterface/media/ExifInterface$ExifAttribute:format	I
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
      //   56: iconst_1
      //   57: istore 14
      //   59: iload 4
      //   61: tableswitch	default:+63->124, 1:+746->807, 2:+561->622, 3:+502->563, 4:+443->504, 5:+372->433, 6:+746->807, 7:+561->622, 8:+313->374, 9:+254->315, 10:+181->242, 11:+121->182, 12:+66->127
      //   124: goto +788 -> 912
      //   127: aload_3
      //   128: astore_2
      //   129: aload_0
      //   130: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   133: newarray <illegal type>
      //   135: astore_1
      //   136: aload_3
      //   137: astore_2
      //   138: iload 13
      //   140: aload_0
      //   141: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   144: if_icmpge +19 -> 163
      //   147: aload_3
      //   148: astore_2
      //   149: aload_1
      //   150: iload 13
      //   152: aload_3
      //   153: invokevirtual 199	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readDouble	()D
      //   156: dastore
      //   157: iinc 13 1
      //   160: goto -24 -> 136
      //   163: aload_3
      //   164: invokevirtual 204	java/io/InputStream:close	()V
      //   167: goto +13 -> 180
      //   170: astore_2
      //   171: ldc -50
      //   173: ldc -48
      //   175: aload_2
      //   176: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   179: pop
      //   180: aload_1
      //   181: areturn
      //   182: aload_3
      //   183: astore_2
      //   184: aload_0
      //   185: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   188: newarray <illegal type>
      //   190: astore_1
      //   191: iload 5
      //   193: istore 13
      //   195: aload_3
      //   196: astore_2
      //   197: iload 13
      //   199: aload_0
      //   200: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   203: if_icmpge +20 -> 223
      //   206: aload_3
      //   207: astore_2
      //   208: aload_1
      //   209: iload 13
      //   211: aload_3
      //   212: invokevirtual 218	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readFloat	()F
      //   215: f2d
      //   216: dastore
      //   217: iinc 13 1
      //   220: goto -25 -> 195
      //   223: aload_3
      //   224: invokevirtual 204	java/io/InputStream:close	()V
      //   227: goto +13 -> 240
      //   230: astore_2
      //   231: ldc -50
      //   233: ldc -48
      //   235: aload_2
      //   236: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   239: pop
      //   240: aload_1
      //   241: areturn
      //   242: aload_3
      //   243: astore_2
      //   244: aload_0
      //   245: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   248: anewarray 86	androidx/exifinterface/media/ExifInterface$Rational
      //   251: astore_1
      //   252: iload 6
      //   254: istore 13
      //   256: aload_3
      //   257: astore_2
      //   258: iload 13
      //   260: aload_0
      //   261: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   264: if_icmpge +32 -> 296
      //   267: aload_3
      //   268: astore_2
      //   269: aload_1
      //   270: iload 13
      //   272: new 86	androidx/exifinterface/media/ExifInterface$Rational
      //   275: dup
      //   276: aload_3
      //   277: invokevirtual 221	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readInt	()I
      //   280: i2l
      //   281: aload_3
      //   282: invokevirtual 221	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readInt	()I
      //   285: i2l
      //   286: invokespecial 224	androidx/exifinterface/media/ExifInterface$Rational:<init>	(JJ)V
      //   289: aastore
      //   290: iinc 13 1
      //   293: goto -37 -> 256
      //   296: aload_3
      //   297: invokevirtual 204	java/io/InputStream:close	()V
      //   300: goto +13 -> 313
      //   303: astore_2
      //   304: ldc -50
      //   306: ldc -48
      //   308: aload_2
      //   309: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   312: pop
      //   313: aload_1
      //   314: areturn
      //   315: aload_3
      //   316: astore_2
      //   317: aload_0
      //   318: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   321: newarray <illegal type>
      //   323: astore_1
      //   324: iload 7
      //   326: istore 13
      //   328: aload_3
      //   329: astore_2
      //   330: iload 13
      //   332: aload_0
      //   333: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   336: if_icmpge +19 -> 355
      //   339: aload_3
      //   340: astore_2
      //   341: aload_1
      //   342: iload 13
      //   344: aload_3
      //   345: invokevirtual 221	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readInt	()I
      //   348: iastore
      //   349: iinc 13 1
      //   352: goto -24 -> 328
      //   355: aload_3
      //   356: invokevirtual 204	java/io/InputStream:close	()V
      //   359: goto +13 -> 372
      //   362: astore_2
      //   363: ldc -50
      //   365: ldc -48
      //   367: aload_2
      //   368: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   371: pop
      //   372: aload_1
      //   373: areturn
      //   374: aload_3
      //   375: astore_2
      //   376: aload_0
      //   377: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   380: newarray <illegal type>
      //   382: astore_1
      //   383: iload 8
      //   385: istore 13
      //   387: aload_3
      //   388: astore_2
      //   389: iload 13
      //   391: aload_0
      //   392: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   395: if_icmpge +19 -> 414
      //   398: aload_3
      //   399: astore_2
      //   400: aload_1
      //   401: iload 13
      //   403: aload_3
      //   404: invokevirtual 228	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readShort	()S
      //   407: iastore
      //   408: iinc 13 1
      //   411: goto -24 -> 387
      //   414: aload_3
      //   415: invokevirtual 204	java/io/InputStream:close	()V
      //   418: goto +13 -> 431
      //   421: astore_2
      //   422: ldc -50
      //   424: ldc -48
      //   426: aload_2
      //   427: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   430: pop
      //   431: aload_1
      //   432: areturn
      //   433: aload_3
      //   434: astore_2
      //   435: aload_0
      //   436: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   439: anewarray 86	androidx/exifinterface/media/ExifInterface$Rational
      //   442: astore_1
      //   443: iload 9
      //   445: istore 13
      //   447: aload_3
      //   448: astore_2
      //   449: iload 13
      //   451: aload_0
      //   452: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   455: if_icmpge +30 -> 485
      //   458: aload_3
      //   459: astore_2
      //   460: aload_1
      //   461: iload 13
      //   463: new 86	androidx/exifinterface/media/ExifInterface$Rational
      //   466: dup
      //   467: aload_3
      //   468: invokevirtual 232	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedInt	()J
      //   471: aload_3
      //   472: invokevirtual 232	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedInt	()J
      //   475: invokespecial 224	androidx/exifinterface/media/ExifInterface$Rational:<init>	(JJ)V
      //   478: aastore
      //   479: iinc 13 1
      //   482: goto -35 -> 447
      //   485: aload_3
      //   486: invokevirtual 204	java/io/InputStream:close	()V
      //   489: goto +13 -> 502
      //   492: astore_2
      //   493: ldc -50
      //   495: ldc -48
      //   497: aload_2
      //   498: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   501: pop
      //   502: aload_1
      //   503: areturn
      //   504: aload_3
      //   505: astore_2
      //   506: aload_0
      //   507: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   510: newarray <illegal type>
      //   512: astore_1
      //   513: iload 10
      //   515: istore 13
      //   517: aload_3
      //   518: astore_2
      //   519: iload 13
      //   521: aload_0
      //   522: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   525: if_icmpge +19 -> 544
      //   528: aload_3
      //   529: astore_2
      //   530: aload_1
      //   531: iload 13
      //   533: aload_3
      //   534: invokevirtual 232	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedInt	()J
      //   537: lastore
      //   538: iinc 13 1
      //   541: goto -24 -> 517
      //   544: aload_3
      //   545: invokevirtual 204	java/io/InputStream:close	()V
      //   548: goto +13 -> 561
      //   551: astore_2
      //   552: ldc -50
      //   554: ldc -48
      //   556: aload_2
      //   557: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   560: pop
      //   561: aload_1
      //   562: areturn
      //   563: aload_3
      //   564: astore_2
      //   565: aload_0
      //   566: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   569: newarray <illegal type>
      //   571: astore_1
      //   572: iload 11
      //   574: istore 13
      //   576: aload_3
      //   577: astore_2
      //   578: iload 13
      //   580: aload_0
      //   581: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   584: if_icmpge +19 -> 603
      //   587: aload_3
      //   588: astore_2
      //   589: aload_1
      //   590: iload 13
      //   592: aload_3
      //   593: invokevirtual 235	androidx/exifinterface/media/ExifInterface$ByteOrderedDataInputStream:readUnsignedShort	()I
      //   596: iastore
      //   597: iinc 13 1
      //   600: goto -24 -> 576
      //   603: aload_3
      //   604: invokevirtual 204	java/io/InputStream:close	()V
      //   607: goto +13 -> 620
      //   610: astore_2
      //   611: ldc -50
      //   613: ldc -48
      //   615: aload_2
      //   616: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   619: pop
      //   620: aload_1
      //   621: areturn
      //   622: iload 12
      //   624: istore 13
      //   626: aload_3
      //   627: astore_2
      //   628: aload_0
      //   629: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   632: getstatic 238	androidx/exifinterface/media/ExifInterface:EXIF_ASCII_PREFIX	[B
      //   635: arraylength
      //   636: if_icmplt +68 -> 704
      //   639: iconst_0
      //   640: istore 13
      //   642: aload_3
      //   643: astore_2
      //   644: getstatic 238	androidx/exifinterface/media/ExifInterface:EXIF_ASCII_PREFIX	[B
      //   647: astore_1
      //   648: iload 14
      //   650: istore 5
      //   652: aload_3
      //   653: astore_2
      //   654: iload 13
      //   656: aload_1
      //   657: arraylength
      //   658: if_icmpge +31 -> 689
      //   661: aload_3
      //   662: astore_2
      //   663: aload_0
      //   664: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
      //   667: iload 13
      //   669: baload
      //   670: aload_1
      //   671: iload 13
      //   673: baload
      //   674: if_icmpeq +9 -> 683
      //   677: iconst_0
      //   678: istore 5
      //   680: goto +9 -> 689
      //   683: iinc 13 1
      //   686: goto -44 -> 642
      //   689: iload 12
      //   691: istore 13
      //   693: iload 5
      //   695: ifeq +9 -> 704
      //   698: aload_3
      //   699: astore_2
      //   700: aload_1
      //   701: arraylength
      //   702: istore 13
      //   704: aload_3
      //   705: astore_2
      //   706: new 99	java/lang/StringBuilder
      //   709: astore_1
      //   710: aload_3
      //   711: astore_2
      //   712: aload_1
      //   713: invokespecial 100	java/lang/StringBuilder:<init>	()V
      //   716: aload_3
      //   717: astore_2
      //   718: iload 13
      //   720: aload_0
      //   721: getfield 21	androidx/exifinterface/media/ExifInterface$ExifAttribute:numberOfComponents	I
      //   724: if_icmpge +57 -> 781
      //   727: aload_3
      //   728: astore_2
      //   729: aload_0
      //   730: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
      //   733: iload 13
      //   735: baload
      //   736: istore 5
      //   738: iload 5
      //   740: ifne +6 -> 746
      //   743: goto +38 -> 781
      //   746: iload 5
      //   748: bipush 32
      //   750: if_icmplt +16 -> 766
      //   753: aload_3
      //   754: astore_2
      //   755: aload_1
      //   756: iload 5
      //   758: i2c
      //   759: invokevirtual 107	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
      //   762: pop
      //   763: goto +12 -> 775
      //   766: aload_3
      //   767: astore_2
      //   768: aload_1
      //   769: bipush 63
      //   771: invokevirtual 107	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
      //   774: pop
      //   775: iinc 13 1
      //   778: goto -62 -> 716
      //   781: aload_3
      //   782: astore_2
      //   783: aload_1
      //   784: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   787: astore_1
      //   788: aload_3
      //   789: invokevirtual 204	java/io/InputStream:close	()V
      //   792: goto +13 -> 805
      //   795: astore_2
      //   796: ldc -50
      //   798: ldc -48
      //   800: aload_2
      //   801: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   804: pop
      //   805: aload_1
      //   806: areturn
      //   807: aload_3
      //   808: astore_2
      //   809: aload_0
      //   810: getfield 23	androidx/exifinterface/media/ExifInterface$ExifAttribute:bytes	[B
      //   813: astore_1
      //   814: aload_3
      //   815: astore_2
      //   816: aload_1
      //   817: arraylength
      //   818: iconst_1
      //   819: if_icmpne +60 -> 879
      //   822: aload_1
      //   823: iconst_0
      //   824: baload
      //   825: istore 13
      //   827: iload 13
      //   829: iflt +50 -> 879
      //   832: iload 13
      //   834: iconst_1
      //   835: if_icmpgt +44 -> 879
      //   838: aload_3
      //   839: astore_2
      //   840: new 28	java/lang/String
      //   843: dup
      //   844: iconst_1
      //   845: newarray <illegal type>
      //   847: dup
      //   848: iconst_0
      //   849: iload 13
      //   851: bipush 48
      //   853: iadd
      //   854: i2c
      //   855: castore
      //   856: invokespecial 241	java/lang/String:<init>	([C)V
      //   859: astore_1
      //   860: aload_3
      //   861: invokevirtual 204	java/io/InputStream:close	()V
      //   864: goto +13 -> 877
      //   867: astore_2
      //   868: ldc -50
      //   870: ldc -48
      //   872: aload_2
      //   873: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   876: pop
      //   877: aload_1
      //   878: areturn
      //   879: aload_3
      //   880: astore_2
      //   881: new 28	java/lang/String
      //   884: dup
      //   885: aload_1
      //   886: getstatic 42	androidx/exifinterface/media/ExifInterface:ASCII	Ljava/nio/charset/Charset;
      //   889: invokespecial 244	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
      //   892: astore_1
      //   893: aload_3
      //   894: invokevirtual 204	java/io/InputStream:close	()V
      //   897: goto +13 -> 910
      //   900: astore_2
      //   901: ldc -50
      //   903: ldc -48
      //   905: aload_2
      //   906: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   909: pop
      //   910: aload_1
      //   911: areturn
      //   912: aload_3
      //   913: invokevirtual 204	java/io/InputStream:close	()V
      //   916: goto +13 -> 929
      //   919: astore_1
      //   920: ldc -50
      //   922: ldc -48
      //   924: aload_1
      //   925: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   928: pop
      //   929: aconst_null
      //   930: areturn
      //   931: astore_2
      //   932: aload_3
      //   933: astore_1
      //   934: aload_2
      //   935: astore_3
      //   936: goto +10 -> 946
      //   939: astore_1
      //   940: goto +41 -> 981
      //   943: astore_3
      //   944: aconst_null
      //   945: astore_1
      //   946: aload_1
      //   947: astore_2
      //   948: ldc -50
      //   950: ldc -10
      //   952: aload_3
      //   953: invokestatic 249	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   956: pop
      //   957: aload_1
      //   958: ifnull +20 -> 978
      //   961: aload_1
      //   962: invokevirtual 204	java/io/InputStream:close	()V
      //   965: goto +13 -> 978
      //   968: astore_1
      //   969: ldc -50
      //   971: ldc -48
      //   973: aload_1
      //   974: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   977: pop
      //   978: aconst_null
      //   979: areturn
      //   980: astore_1
      //   981: aload_2
      //   982: ifnull +20 -> 1002
      //   985: aload_2
      //   986: invokevirtual 204	java/io/InputStream:close	()V
      //   989: goto +13 -> 1002
      //   992: astore_2
      //   993: ldc -50
      //   995: ldc -48
      //   997: aload_2
      //   998: invokestatic 214	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   1001: pop
      //   1002: aload_1
      //   1003: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1004	0	this	ExifAttribute
      //   0	1004	1	paramByteOrder	ByteOrder
      //   1	148	2	localObject1	Object
      //   170	6	2	localIOException1	IOException
      //   183	25	2	localObject2	Object
      //   230	6	2	localIOException2	IOException
      //   243	26	2	localObject3	Object
      //   303	6	2	localIOException3	IOException
      //   316	25	2	localObject4	Object
      //   362	6	2	localIOException4	IOException
      //   375	25	2	localObject5	Object
      //   421	6	2	localIOException5	IOException
      //   434	26	2	localObject6	Object
      //   492	6	2	localIOException6	IOException
      //   505	25	2	localObject7	Object
      //   551	6	2	localIOException7	IOException
      //   564	25	2	localObject8	Object
      //   610	6	2	localIOException8	IOException
      //   627	156	2	localObject9	Object
      //   795	6	2	localIOException9	IOException
      //   808	32	2	localObject10	Object
      //   867	6	2	localIOException10	IOException
      //   880	1	2	localObject11	Object
      //   900	6	2	localIOException11	IOException
      //   931	4	2	localIOException12	IOException
      //   947	39	2	localByteOrder	ByteOrder
      //   992	6	2	localIOException13	IOException
      //   5	931	3	localObject12	Object
      //   943	10	3	localIOException14	IOException
      //   27	33	4	i	int
      //   30	727	5	j	int
      //   33	220	6	k	int
      //   36	289	7	m	int
      //   39	345	8	n	int
      //   42	402	9	i1	int
      //   45	469	10	i2	int
      //   48	525	11	i3	int
      //   51	639	12	i4	int
      //   54	800	13	i5	int
      //   57	592	14	i6	int
      // Exception table:
      //   from	to	target	type
      //   163	167	170	java/io/IOException
      //   223	227	230	java/io/IOException
      //   296	300	303	java/io/IOException
      //   355	359	362	java/io/IOException
      //   414	418	421	java/io/IOException
      //   485	489	492	java/io/IOException
      //   544	548	551	java/io/IOException
      //   603	607	610	java/io/IOException
      //   788	792	795	java/io/IOException
      //   860	864	867	java/io/IOException
      //   893	897	900	java/io/IOException
      //   912	916	919	java/io/IOException
      //   16	21	931	java/io/IOException
      //   23	29	931	java/io/IOException
      //   129	136	931	java/io/IOException
      //   138	147	931	java/io/IOException
      //   149	157	931	java/io/IOException
      //   184	191	931	java/io/IOException
      //   197	206	931	java/io/IOException
      //   208	217	931	java/io/IOException
      //   244	252	931	java/io/IOException
      //   258	267	931	java/io/IOException
      //   269	290	931	java/io/IOException
      //   317	324	931	java/io/IOException
      //   330	339	931	java/io/IOException
      //   341	349	931	java/io/IOException
      //   376	383	931	java/io/IOException
      //   389	398	931	java/io/IOException
      //   400	408	931	java/io/IOException
      //   435	443	931	java/io/IOException
      //   449	458	931	java/io/IOException
      //   460	479	931	java/io/IOException
      //   506	513	931	java/io/IOException
      //   519	528	931	java/io/IOException
      //   530	538	931	java/io/IOException
      //   565	572	931	java/io/IOException
      //   578	587	931	java/io/IOException
      //   589	597	931	java/io/IOException
      //   628	639	931	java/io/IOException
      //   644	648	931	java/io/IOException
      //   654	661	931	java/io/IOException
      //   663	677	931	java/io/IOException
      //   700	704	931	java/io/IOException
      //   706	710	931	java/io/IOException
      //   712	716	931	java/io/IOException
      //   718	727	931	java/io/IOException
      //   729	738	931	java/io/IOException
      //   755	763	931	java/io/IOException
      //   768	775	931	java/io/IOException
      //   783	788	931	java/io/IOException
      //   809	814	931	java/io/IOException
      //   816	822	931	java/io/IOException
      //   840	860	931	java/io/IOException
      //   881	893	931	java/io/IOException
      //   2	14	939	finally
      //   2	14	943	java/io/IOException
      //   961	965	968	java/io/IOException
      //   16	21	980	finally
      //   23	29	980	finally
      //   129	136	980	finally
      //   138	147	980	finally
      //   149	157	980	finally
      //   184	191	980	finally
      //   197	206	980	finally
      //   208	217	980	finally
      //   244	252	980	finally
      //   258	267	980	finally
      //   269	290	980	finally
      //   317	324	980	finally
      //   330	339	980	finally
      //   341	349	980	finally
      //   376	383	980	finally
      //   389	398	980	finally
      //   400	408	980	finally
      //   435	443	980	finally
      //   449	458	980	finally
      //   460	479	980	finally
      //   506	513	980	finally
      //   519	528	980	finally
      //   530	538	980	finally
      //   565	572	980	finally
      //   578	587	980	finally
      //   589	597	980	finally
      //   628	639	980	finally
      //   644	648	980	finally
      //   654	661	980	finally
      //   663	677	980	finally
      //   700	704	980	finally
      //   706	710	980	finally
      //   712	716	980	finally
      //   718	727	980	finally
      //   729	738	980	finally
      //   755	763	980	finally
      //   768	775	980	finally
      //   783	788	980	finally
      //   809	814	980	finally
      //   816	822	980	finally
      //   840	860	980	finally
      //   881	893	980	finally
      //   948	957	980	finally
      //   985	989	992	java/io/IOException
    }
    
    public int size()
    {
      return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[format] * numberOfComponents;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("(");
      localStringBuilder.append(ExifInterface.IFD_FORMAT_NAMES[format]);
      localStringBuilder.append(", data length:");
      return z2.q(localStringBuilder, bytes.length, ")");
    }
  }
  
  public static class ExifTag
  {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;
    
    public ExifTag(String paramString, int paramInt1, int paramInt2)
    {
      name = paramString;
      number = paramInt1;
      primaryFormat = paramInt2;
      secondaryFormat = -1;
    }
    
    public ExifTag(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      name = paramString;
      number = paramInt1;
      primaryFormat = paramInt2;
      secondaryFormat = paramInt3;
    }
    
    public boolean isFormatCompatible(int paramInt)
    {
      int i = primaryFormat;
      if ((i != 7) && (paramInt != 7) && (i != paramInt))
      {
        int j = secondaryFormat;
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
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface IfdType {}
  
  public static class Rational
  {
    public final long denominator;
    public final long numerator;
    
    public Rational(double paramDouble)
    {
      this((paramDouble * 10000.0D), 10000L);
    }
    
    public Rational(long paramLong1, long paramLong2)
    {
      if (paramLong2 == 0L)
      {
        numerator = 0L;
        denominator = 1L;
        return;
      }
      numerator = paramLong1;
      denominator = paramLong2;
    }
    
    public double calculate()
    {
      return numerator / denominator;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(numerator);
      localStringBuilder.append("/");
      localStringBuilder.append(denominator);
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.exifinterface.media.ExifInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */