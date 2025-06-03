package com.google.android.datatransport.runtime;

import a;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

public final class AutoProtoEncoderDoNotUseEncoder
  implements Configurator
{
  public static final int CODEGEN_VERSION = 2;
  public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();
  
  public void configure(EncoderConfig<?> paramEncoderConfig)
  {
    paramEncoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
    paramEncoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.INSTANCE);
    paramEncoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.INSTANCE);
    paramEncoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.INSTANCE);
    paramEncoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.INSTANCE);
    paramEncoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.INSTANCE);
    paramEncoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.INSTANCE);
  }
  
  public static final class ClientMetricsEncoder
    implements ObjectEncoder<ClientMetrics>
  {
    private static final FieldDescriptor APPNAMESPACE_DESCRIPTOR = a.e(4, FieldDescriptor.builder("appNamespace"));
    private static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR;
    public static final ClientMetricsEncoder INSTANCE = new ClientMetricsEncoder();
    private static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR;
    private static final FieldDescriptor WINDOW_DESCRIPTOR = a.e(1, FieldDescriptor.builder("window"));
    
    static
    {
      LOGSOURCEMETRICS_DESCRIPTOR = a.e(2, FieldDescriptor.builder("logSourceMetrics"));
      GLOBALMETRICS_DESCRIPTOR = a.e(3, FieldDescriptor.builder("globalMetrics"));
    }
    
    public void encode(ClientMetrics paramClientMetrics, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(WINDOW_DESCRIPTOR, paramClientMetrics.getWindowInternal());
      paramObjectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, paramClientMetrics.getLogSourceMetricsList());
      paramObjectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, paramClientMetrics.getGlobalMetricsInternal());
      paramObjectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, paramClientMetrics.getAppNamespace());
    }
  }
  
  public static final class GlobalMetricsEncoder
    implements ObjectEncoder<GlobalMetrics>
  {
    public static final GlobalMetricsEncoder INSTANCE = new GlobalMetricsEncoder();
    private static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR = a.e(1, FieldDescriptor.builder("storageMetrics"));
    
    public void encode(GlobalMetrics paramGlobalMetrics, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(STORAGEMETRICS_DESCRIPTOR, paramGlobalMetrics.getStorageMetricsInternal());
    }
  }
  
  public static final class LogEventDroppedEncoder
    implements ObjectEncoder<LogEventDropped>
  {
    private static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = a.e(1, FieldDescriptor.builder("eventsDroppedCount"));
    public static final LogEventDroppedEncoder INSTANCE = new LogEventDroppedEncoder();
    private static final FieldDescriptor REASON_DESCRIPTOR = a.e(3, FieldDescriptor.builder("reason"));
    
    public void encode(LogEventDropped paramLogEventDropped, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, paramLogEventDropped.getEventsDroppedCount());
      paramObjectEncoderContext.add(REASON_DESCRIPTOR, paramLogEventDropped.getReason());
    }
  }
  
  public static final class LogSourceMetricsEncoder
    implements ObjectEncoder<LogSourceMetrics>
  {
    public static final LogSourceMetricsEncoder INSTANCE = new LogSourceMetricsEncoder();
    private static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = a.e(2, FieldDescriptor.builder("logEventDropped"));
    private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = a.e(1, FieldDescriptor.builder("logSource"));
    
    public void encode(LogSourceMetrics paramLogSourceMetrics, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(LOGSOURCE_DESCRIPTOR, paramLogSourceMetrics.getLogSource());
      paramObjectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, paramLogSourceMetrics.getLogEventDroppedList());
    }
  }
  
  public static final class ProtoEncoderDoNotUseEncoder
    implements ObjectEncoder<ProtoEncoderDoNotUse>
  {
    private static final FieldDescriptor CLIENTMETRICS_DESCRIPTOR = FieldDescriptor.of("clientMetrics");
    public static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
    
    public void encode(ProtoEncoderDoNotUse paramProtoEncoderDoNotUse, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(CLIENTMETRICS_DESCRIPTOR, paramProtoEncoderDoNotUse.getClientMetrics());
    }
  }
  
  public static final class StorageMetricsEncoder
    implements ObjectEncoder<StorageMetrics>
  {
    private static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = a.e(1, FieldDescriptor.builder("currentCacheSizeBytes"));
    public static final StorageMetricsEncoder INSTANCE = new StorageMetricsEncoder();
    private static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = a.e(2, FieldDescriptor.builder("maxCacheSizeBytes"));
    
    public void encode(StorageMetrics paramStorageMetrics, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, paramStorageMetrics.getCurrentCacheSizeBytes());
      paramObjectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, paramStorageMetrics.getMaxCacheSizeBytes());
    }
  }
  
  public static final class TimeWindowEncoder
    implements ObjectEncoder<TimeWindow>
  {
    private static final FieldDescriptor ENDMS_DESCRIPTOR = a.e(2, FieldDescriptor.builder("endMs"));
    public static final TimeWindowEncoder INSTANCE = new TimeWindowEncoder();
    private static final FieldDescriptor STARTMS_DESCRIPTOR = a.e(1, FieldDescriptor.builder("startMs"));
    
    public void encode(TimeWindow paramTimeWindow, ObjectEncoderContext paramObjectEncoderContext)
      throws IOException
    {
      paramObjectEncoderContext.add(STARTMS_DESCRIPTOR, paramTimeWindow.getStartMs());
      paramObjectEncoderContext.add(ENDMS_DESCRIPTOR, paramTimeWindow.getEndMs());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */