package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

public final class C
{
  public static final String ASCII_NAME = "US-ASCII";
  public static final int AUDIOFOCUS_GAIN = 1;
  public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
  public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
  public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
  public static final int AUDIOFOCUS_NONE = 0;
  public static final int AUDIO_SESSION_ID_UNSET = 0;
  public static final int BITS_PER_BYTE = 8;
  public static final int BUFFER_FLAG_DECODE_ONLY = Integer.MIN_VALUE;
  public static final int BUFFER_FLAG_ENCRYPTED = 1073741824;
  public static final int BUFFER_FLAG_END_OF_STREAM = 4;
  public static final int BUFFER_FLAG_KEY_FRAME = 1;
  public static final int BYTES_PER_FLOAT = 4;
  public static final String CENC_TYPE_cbc1 = "cbc1";
  public static final String CENC_TYPE_cbcs = "cbcs";
  public static final String CENC_TYPE_cenc = "cenc";
  public static final String CENC_TYPE_cens = "cens";
  public static final UUID CLEARKEY_UUID;
  public static final int COLOR_RANGE_FULL = 1;
  public static final int COLOR_RANGE_LIMITED = 2;
  public static final int COLOR_SPACE_BT2020 = 6;
  public static final int COLOR_SPACE_BT601 = 2;
  public static final int COLOR_SPACE_BT709 = 1;
  public static final int COLOR_TRANSFER_HLG = 7;
  public static final int COLOR_TRANSFER_SDR = 3;
  public static final int COLOR_TRANSFER_ST2084 = 6;
  public static final UUID COMMON_PSSH_UUID;
  public static final int CONTENT_TYPE_MOVIE = 3;
  public static final int CONTENT_TYPE_MUSIC = 2;
  public static final int CONTENT_TYPE_SONIFICATION = 4;
  public static final int CONTENT_TYPE_SPEECH = 1;
  public static final int CONTENT_TYPE_UNKNOWN = 0;
  public static final int CRYPTO_MODE_AES_CBC = 2;
  public static final int CRYPTO_MODE_AES_CTR = 1;
  public static final int CRYPTO_MODE_UNENCRYPTED = 0;
  public static final int DATA_TYPE_AD = 6;
  public static final int DATA_TYPE_CUSTOM_BASE = 10000;
  public static final int DATA_TYPE_DRM = 3;
  public static final int DATA_TYPE_MANIFEST = 4;
  public static final int DATA_TYPE_MEDIA = 1;
  public static final int DATA_TYPE_MEDIA_INITIALIZATION = 2;
  public static final int DATA_TYPE_MEDIA_PROGRESSIVE_LIVE = 7;
  public static final int DATA_TYPE_TIME_SYNCHRONIZATION = 5;
  public static final int DATA_TYPE_UNKNOWN = 0;
  public static final int DEFAULT_AUDIO_BUFFER_SIZE = 3538944;
  public static final int DEFAULT_BUFFER_SEGMENT_SIZE = 65536;
  public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
  public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
  public static final int DEFAULT_MUXED_BUFFER_SIZE = 16777216;
  public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
  public static final int DEFAULT_VIDEO_BUFFER_SIZE = 13107200;
  public static final int ENCODING_AC3 = 5;
  public static final int ENCODING_DOLBY_TRUEHD = 14;
  public static final int ENCODING_DTS = 7;
  public static final int ENCODING_DTS_HD = 8;
  public static final int ENCODING_E_AC3 = 6;
  public static final int ENCODING_INVALID = 0;
  public static final int ENCODING_PCM_16BIT = 2;
  public static final int ENCODING_PCM_24BIT = Integer.MIN_VALUE;
  public static final int ENCODING_PCM_32BIT = 1073741824;
  public static final int ENCODING_PCM_8BIT = 3;
  public static final int ENCODING_PCM_A_LAW = 536870912;
  public static final int ENCODING_PCM_FLOAT = 4;
  public static final int ENCODING_PCM_MU_LAW = 268435456;
  public static final int FLAG_AUDIBILITY_ENFORCED = 1;
  public static final int INDEX_UNSET = -1;
  public static final String LANGUAGE_UNDETERMINED = "und";
  public static final int LENGTH_UNSET = -1;
  public static final long MICROS_PER_SECOND = 1000000L;
  public static final int MSG_CUSTOM_BASE = 10000;
  public static final int MSG_SET_AUDIO_ATTRIBUTES = 3;
  public static final int MSG_SET_AUX_EFFECT_INFO = 5;
  public static final int MSG_SET_CAMERA_MOTION_LISTENER = 7;
  public static final int MSG_SET_SCALING_MODE = 4;
  public static final int MSG_SET_SURFACE = 1;
  public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 6;
  public static final int MSG_SET_VOLUME = 2;
  public static final long NANOS_PER_SECOND = 1000000000L;
  public static final int NETWORK_TYPE_2G = 3;
  public static final int NETWORK_TYPE_3G = 4;
  public static final int NETWORK_TYPE_4G = 5;
  public static final int NETWORK_TYPE_CELLULAR_UNKNOWN = 6;
  public static final int NETWORK_TYPE_ETHERNET = 7;
  public static final int NETWORK_TYPE_OFFLINE = 1;
  public static final int NETWORK_TYPE_OTHER = 8;
  public static final int NETWORK_TYPE_UNKNOWN = 0;
  public static final int NETWORK_TYPE_WIFI = 2;
  public static final int PERCENTAGE_UNSET = -1;
  public static final UUID PLAYREADY_UUID = new UUID(-7348484286925749626L, -6083546864340672619L);
  public static final int POSITION_UNSET = -1;
  public static final int PRIORITY_DOWNLOAD = -1000;
  public static final int PRIORITY_PLAYBACK = 0;
  public static final int RESULT_BUFFER_READ = -4;
  public static final int RESULT_END_OF_INPUT = -1;
  public static final int RESULT_FORMAT_READ = -5;
  public static final int RESULT_MAX_LENGTH_EXCEEDED = -2;
  public static final int RESULT_NOTHING_READ = -3;
  public static final String SANS_SERIF_NAME = "sans-serif";
  public static final int SELECTION_FLAG_AUTOSELECT = 4;
  public static final int SELECTION_FLAG_DEFAULT = 1;
  public static final int SELECTION_FLAG_FORCED = 2;
  public static final int SELECTION_REASON_ADAPTIVE = 3;
  public static final int SELECTION_REASON_CUSTOM_BASE = 10000;
  public static final int SELECTION_REASON_INITIAL = 1;
  public static final int SELECTION_REASON_MANUAL = 2;
  public static final int SELECTION_REASON_TRICK_PLAY = 4;
  public static final int SELECTION_REASON_UNKNOWN = 0;
  public static final String SERIF_NAME = "serif";
  public static final int STEREO_MODE_LEFT_RIGHT = 2;
  public static final int STEREO_MODE_MONO = 0;
  public static final int STEREO_MODE_STEREO_MESH = 3;
  public static final int STEREO_MODE_TOP_BOTTOM = 1;
  public static final int STREAM_TYPE_ALARM = 4;
  public static final int STREAM_TYPE_DEFAULT = 3;
  public static final int STREAM_TYPE_DTMF = 8;
  public static final int STREAM_TYPE_MUSIC = 3;
  public static final int STREAM_TYPE_NOTIFICATION = 5;
  public static final int STREAM_TYPE_RING = 2;
  public static final int STREAM_TYPE_SYSTEM = 1;
  public static final int STREAM_TYPE_USE_DEFAULT = Integer.MIN_VALUE;
  public static final int STREAM_TYPE_VOICE_CALL = 0;
  public static final long TIME_END_OF_SOURCE = Long.MIN_VALUE;
  public static final long TIME_UNSET = -9223372036854775807L;
  public static final int TRACK_TYPE_AUDIO = 1;
  public static final int TRACK_TYPE_CAMERA_MOTION = 5;
  public static final int TRACK_TYPE_CUSTOM_BASE = 10000;
  public static final int TRACK_TYPE_DEFAULT = 0;
  public static final int TRACK_TYPE_METADATA = 4;
  public static final int TRACK_TYPE_NONE = 6;
  public static final int TRACK_TYPE_TEXT = 3;
  public static final int TRACK_TYPE_UNKNOWN = -1;
  public static final int TRACK_TYPE_VIDEO = 2;
  public static final int TYPE_DASH = 0;
  public static final int TYPE_HLS = 2;
  public static final int TYPE_OTHER = 3;
  public static final int TYPE_SS = 1;
  public static final int USAGE_ALARM = 4;
  public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
  public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
  public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
  public static final int USAGE_ASSISTANT = 16;
  public static final int USAGE_GAME = 14;
  public static final int USAGE_MEDIA = 1;
  public static final int USAGE_NOTIFICATION = 5;
  public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
  public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
  public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
  public static final int USAGE_NOTIFICATION_EVENT = 10;
  public static final int USAGE_NOTIFICATION_RINGTONE = 6;
  public static final int USAGE_UNKNOWN = 0;
  public static final int USAGE_VOICE_COMMUNICATION = 2;
  public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
  public static final String UTF16_NAME = "UTF-16";
  public static final String UTF8_NAME = "UTF-8";
  public static final UUID UUID_NIL = new UUID(0L, 0L);
  public static final int VIDEO_SCALING_MODE_DEFAULT = 1;
  public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
  public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
  public static final UUID WIDEVINE_UUID;
  
  static
  {
    COMMON_PSSH_UUID = new UUID(1186680826959645954L, -5988876978535335093L);
    CLEARKEY_UUID = new UUID(-2129748144642739255L, 8654423357094679310L);
    WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);
  }
  
  @TargetApi(21)
  public static int generateAudioSessionIdV21(Context paramContext)
  {
    return ((AudioManager)paramContext.getSystemService("audio")).generateAudioSessionId();
  }
  
  public static long msToUs(long paramLong)
  {
    long l = paramLong;
    if (paramLong != -9223372036854775807L) {
      if (paramLong == Long.MIN_VALUE) {
        l = paramLong;
      } else {
        l = paramLong * 1000L;
      }
    }
    return l;
  }
  
  public static long usToMs(long paramLong)
  {
    long l = paramLong;
    if (paramLong != -9223372036854775807L) {
      if (paramLong == Long.MIN_VALUE) {
        l = paramLong;
      } else {
        l = paramLong / 1000L;
      }
    }
    return l;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AudioContentType {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AudioFlags {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AudioFocusGain {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AudioUsage {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BufferFlags {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ColorRange {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ColorSpace {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ColorTransfer {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ContentType {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface CryptoMode {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Encoding {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface NetworkType {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface PcmEncoding {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface SelectionFlags {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface StereoMode {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface StreamType {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface VideoScalingMode {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */