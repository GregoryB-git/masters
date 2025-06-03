package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */