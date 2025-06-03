package com.appsflyer.internal;

import V5.m;
import V5.q;
import W5.C;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1pSDK
  extends AFa1aSDK
{
  @NotNull
  private static AFa1xSDK afErrorLog = new AFa1xSDK((byte)0);
  
  private AFc1pSDK(String paramString1, Map<String, String> paramMap, byte[] paramArrayOfByte, String paramString2, boolean paramBoolean)
  {
    super(paramString1, paramArrayOfByte, paramString2, paramMap, false);
  }
  
  @NotNull
  public static final AFc1pSDK AFInAppEventParameterName(@NotNull String paramString1, String paramString2, @NotNull String paramString3, @NotNull String paramString4)
  {
    Intrinsics.checkNotNullParameter(paramString1, "");
    Intrinsics.checkNotNullParameter(paramString3, "");
    Intrinsics.checkNotNullParameter(paramString4, "");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(String.format(AFc1oSDK.AFInAppEventParameterName, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }));
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append(paramString3);
    ((StringBuilder)localObject).append("?device_id=");
    ((StringBuilder)localObject).append(paramString2);
    String str = localObject.toString();
    localObject = String.valueOf(System.currentTimeMillis());
    m localm1 = q.a("Connection", "close");
    m localm2 = q.a("af_request_epoch_ms", localObject);
    Intrinsics.checkNotNullParameter(paramString1, "");
    Intrinsics.checkNotNullParameter(paramString3, "");
    Intrinsics.checkNotNullParameter(paramString4, "");
    Intrinsics.checkNotNullParameter(localObject, "");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString3);
    paramString1 = new AFc1pSDK(str, C.f(new m[] { localm1, localm2, q.a("af_sig", AFc1nSDK.valueOf(TextUtils.join("⁣", new String[] { localObject, paramString2, localStringBuilder.toString() }), paramString4)) }));
    paramString1.values(10000);
    return paramString1;
  }
  
  @Metadata
  public static final class AFa1xSDK {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1pSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */