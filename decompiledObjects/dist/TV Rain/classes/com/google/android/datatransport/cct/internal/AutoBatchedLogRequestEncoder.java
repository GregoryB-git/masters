package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

public final class AutoBatchedLogRequestEncoder
  implements Configurator
{
  public static final int CODEGEN_VERSION = 2;
  public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();
  
  public void configure(EncoderConfig<?> paramEncoderConfig)
  {
    Object localObject = BatchedLogRequestEncoder.INSTANCE;
    paramEncoderConfig.registerEncoder(BatchedLogRequest.class, (ObjectEncoder)localObject);
    paramEncoderConfig.registerEncoder(AutoValue_BatchedLogRequest.class, (ObjectEncoder)localObject);
    localObject = LogRequestEncoder.INSTANCE;
    paramEncoderConfig.registerEncoder(LogRequest.class, (ObjectEncoder)localObject);
    paramEncoderConfig.registerEncoder(AutoValue_LogRequest.class, (ObjectEncoder)localObject);
    localObject = ClientInfoEncoder.INSTANCE;
    paramEncoderConfig.registerEncoder(ClientInfo.class, (ObjectEncoder)localObject);
    paramEncoderConfig.registerEncoder(AutoValue_ClientInfo.class, (ObjectEncoder)localObject);
    localObject = AndroidClientInfoEncoder.INSTANCE;
    paramEncoderConfig.registerEncoder(AndroidClientInfo.class, (ObjectEncoder)localObject);
    paramEncoderConfig.registerEncoder(AutoValue_AndroidClientInfo.class, (ObjectEncoder)localObject);
    localObject = LogEventEncoder.INSTANCE;
    paramEncoderConfig.registerEncoder(LogEvent.class, (ObjectEncoder)localObject);
    paramEncoderConfig.registerEncoder(AutoValue_LogEvent.class, (ObjectEncoder)localObject);
    localObject = NetworkConnectionInfoEncoder.INSTANCE;
    paramEncoderConfig.registerEncoder(NetworkConnectionInfo.class, (ObjectEncoder)localObject);
    paramEncoderConfig.registerEncoder(AutoValue_NetworkConnectionInfo.class, (ObjectEncoder)localObject);
  }
  
  public static final class AndroidClientInfoEncoder
    implements ObjectEncoder<AndroidClientInfo>
  {
    private static final FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = FieldDescriptor.of("applicationBuild");
    private static final FieldDescriptor COUNTRY_DESCRIPTOR;
    private static final FieldDescriptor DEVICE_DESCRIPTOR;
    private static final FieldDescriptor FINGERPRINT_DESCRIPTOR;
    private static final FieldDescriptor HARDWARE_DESCRIPTOR;
    public static final AndroidClientInfoEncoder INSTANCE = new AndroidClientInfoEncoder();
    private static final FieldDescriptor LOCALE_DESCRIPTOR;
    private static final FieldDescriptor MANUFACTURER_DESCRIPTOR;
    private static final FieldDescriptor MCCMNC_DESCRIPTOR;
    private static final FieldDescriptor MODEL_DESCRIPTOR;
    private static final FieldDescriptor OSBUILD_DESCRIPTOR;
    private static final FieldDescriptor PRODUCT_DESCRIPTOR;
    private static final FieldDescriptor SDKVERSION_DESCRIPTOR = FieldDescriptor.of("sdkVersion");
    
    static
    {
      MODEL_DESCRIPTOR = FieldDescriptor.of("model");
      HARDWARE_DESCRIPTOR = FieldDescriptor.of("hardware");
      DEVICE_DESCRIPTOR = FieldDescriptor.of("device");
      PRODUCT_DESCRIPTOR = FieldDescriptor.of("product");
      OSBUILD_DESCRIPTOR = FieldDescriptor.of("osBuild");
      MANUFACTURER_DESCRIPTOR = FieldDescriptor.of("manufacturer");
      FINGERPRINT_DESCRIPTOR = FieldDescriptor.of("fingerprint");
      LOCALE_DESCRIPTOR = FieldDescriptor.of("locale");
      COUNTRY_DESCRIPTOR = FieldDescriptor.of("country");
      MCCMNC_DESCRIPTOR = FieldDescriptor.of("mccMnc");
    }
    
    public void encode(AndroidClientInfo paramAndroidClientInfo, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(SDKVERSION_DESCRIPTOR, paramAndroidClientInfo.getSdkVersion());
      paramObjectEncoderContext.add(MODEL_DESCRIPTOR, paramAndroidClientInfo.getModel());
      paramObjectEncoderContext.add(HARDWARE_DESCRIPTOR, paramAndroidClientInfo.getHardware());
      paramObjectEncoderContext.add(DEVICE_DESCRIPTOR, paramAndroidClientInfo.getDevice());
      paramObjectEncoderContext.add(PRODUCT_DESCRIPTOR, paramAndroidClientInfo.getProduct());
      paramObjectEncoderContext.add(OSBUILD_DESCRIPTOR, paramAndroidClientInfo.getOsBuild());
      paramObjectEncoderContext.add(MANUFACTURER_DESCRIPTOR, paramAndroidClientInfo.getManufacturer());
      paramObjectEncoderContext.add(FINGERPRINT_DESCRIPTOR, paramAndroidClientInfo.getFingerprint());
      paramObjectEncoderContext.add(LOCALE_DESCRIPTOR, paramAndroidClientInfo.getLocale());
      paramObjectEncoderContext.add(COUNTRY_DESCRIPTOR, paramAndroidClientInfo.getCountry());
      paramObjectEncoderContext.add(MCCMNC_DESCRIPTOR, paramAndroidClientInfo.getMccMnc());
      paramObjectEncoderContext.add(APPLICATIONBUILD_DESCRIPTOR, paramAndroidClientInfo.getApplicationBuild());
    }
  }
  
  public static final class BatchedLogRequestEncoder
    implements ObjectEncoder<BatchedLogRequest>
  {
    public static final BatchedLogRequestEncoder INSTANCE = new BatchedLogRequestEncoder();
    private static final FieldDescriptor LOGREQUEST_DESCRIPTOR = FieldDescriptor.of("logRequest");
    
    public void encode(BatchedLogRequest paramBatchedLogRequest, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(LOGREQUEST_DESCRIPTOR, paramBatchedLogRequest.getLogRequests());
    }
  }
  
  public static final class ClientInfoEncoder
    implements ObjectEncoder<ClientInfo>
  {
    private static final FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = FieldDescriptor.of("androidClientInfo");
    private static final FieldDescriptor CLIENTTYPE_DESCRIPTOR;
    public static final ClientInfoEncoder INSTANCE = new ClientInfoEncoder();
    
    static
    {
      CLIENTTYPE_DESCRIPTOR = FieldDescriptor.of("clientType");
    }
    
    public void encode(ClientInfo paramClientInfo, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(CLIENTTYPE_DESCRIPTOR, paramClientInfo.getClientType());
      paramObjectEncoderContext.add(ANDROIDCLIENTINFO_DESCRIPTOR, paramClientInfo.getAndroidClientInfo());
    }
  }
  
  public static final class LogEventEncoder
    implements ObjectEncoder<LogEvent>
  {
    private static final FieldDescriptor EVENTCODE_DESCRIPTOR;
    private static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR;
    private static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR;
    public static final LogEventEncoder INSTANCE = new LogEventEncoder();
    private static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = FieldDescriptor.of("networkConnectionInfo");
    private static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR;
    private static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR;
    private static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR;
    
    static
    {
      EVENTTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventTimeMs");
      EVENTCODE_DESCRIPTOR = FieldDescriptor.of("eventCode");
      EVENTUPTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventUptimeMs");
      SOURCEEXTENSION_DESCRIPTOR = FieldDescriptor.of("sourceExtension");
      SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = FieldDescriptor.of("sourceExtensionJsonProto3");
      TIMEZONEOFFSETSECONDS_DESCRIPTOR = FieldDescriptor.of("timezoneOffsetSeconds");
    }
    
    public void encode(LogEvent paramLogEvent, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(EVENTTIMEMS_DESCRIPTOR, paramLogEvent.getEventTimeMs());
      paramObjectEncoderContext.add(EVENTCODE_DESCRIPTOR, paramLogEvent.getEventCode());
      paramObjectEncoderContext.add(EVENTUPTIMEMS_DESCRIPTOR, paramLogEvent.getEventUptimeMs());
      paramObjectEncoderContext.add(SOURCEEXTENSION_DESCRIPTOR, paramLogEvent.getSourceExtension());
      paramObjectEncoderContext.add(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, paramLogEvent.getSourceExtensionJsonProto3());
      paramObjectEncoderContext.add(TIMEZONEOFFSETSECONDS_DESCRIPTOR, paramLogEvent.getTimezoneOffsetSeconds());
      paramObjectEncoderContext.add(NETWORKCONNECTIONINFO_DESCRIPTOR, paramLogEvent.getNetworkConnectionInfo());
    }
  }
  
  public static final class LogRequestEncoder
    implements ObjectEncoder<LogRequest>
  {
    private static final FieldDescriptor CLIENTINFO_DESCRIPTOR;
    public static final LogRequestEncoder INSTANCE = new LogRequestEncoder();
    private static final FieldDescriptor LOGEVENT_DESCRIPTOR = FieldDescriptor.of("logEvent");
    private static final FieldDescriptor LOGSOURCENAME_DESCRIPTOR;
    private static final FieldDescriptor LOGSOURCE_DESCRIPTOR;
    private static final FieldDescriptor QOSTIER_DESCRIPTOR = FieldDescriptor.of("qosTier");
    private static final FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = FieldDescriptor.of("requestTimeMs");
    private static final FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = FieldDescriptor.of("requestUptimeMs");
    
    static
    {
      CLIENTINFO_DESCRIPTOR = FieldDescriptor.of("clientInfo");
      LOGSOURCE_DESCRIPTOR = FieldDescriptor.of("logSource");
      LOGSOURCENAME_DESCRIPTOR = FieldDescriptor.of("logSourceName");
    }
    
    public void encode(LogRequest paramLogRequest, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(REQUESTTIMEMS_DESCRIPTOR, paramLogRequest.getRequestTimeMs());
      paramObjectEncoderContext.add(REQUESTUPTIMEMS_DESCRIPTOR, paramLogRequest.getRequestUptimeMs());
      paramObjectEncoderContext.add(CLIENTINFO_DESCRIPTOR, paramLogRequest.getClientInfo());
      paramObjectEncoderContext.add(LOGSOURCE_DESCRIPTOR, paramLogRequest.getLogSource());
      paramObjectEncoderContext.add(LOGSOURCENAME_DESCRIPTOR, paramLogRequest.getLogSourceName());
      paramObjectEncoderContext.add(LOGEVENT_DESCRIPTOR, paramLogRequest.getLogEvents());
      paramObjectEncoderContext.add(QOSTIER_DESCRIPTOR, paramLogRequest.getQosTier());
    }
  }
  
  public static final class NetworkConnectionInfoEncoder
    implements ObjectEncoder<NetworkConnectionInfo>
  {
    public static final NetworkConnectionInfoEncoder INSTANCE = new NetworkConnectionInfoEncoder();
    private static final FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = FieldDescriptor.of("mobileSubtype");
    private static final FieldDescriptor NETWORKTYPE_DESCRIPTOR = FieldDescriptor.of("networkType");
    
    public void encode(NetworkConnectionInfo paramNetworkConnectionInfo, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(NETWORKTYPE_DESCRIPTOR, paramNetworkConnectionInfo.getNetworkType());
      paramObjectEncoderContext.add(MOBILESUBTYPE_DESCRIPTOR, paramNetworkConnectionInfo.getMobileSubtype());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */