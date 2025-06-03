package com.yandex.metrica;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\0004\n\002\030\002\n\002\020\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020$\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\030\020\020JA\020\n\032\0020\t2\006\020\003\032\0020\0022\006\020\005\032\0020\0042\b\020\006\032\004\030\0010\0042\026\020\b\032\022\022\004\022\0020\004\022\006\022\004\030\0010\004\030\0010\007H\007¢\006\004\b\n\020\013J\017\020\r\032\0020\fH\007¢\006\004\b\r\020\016J\017\020\017\032\0020\tH\007¢\006\004\b\017\020\020J\027\020\023\032\0020\t2\006\020\022\032\0020\021H\007¢\006\004\b\023\020\024R\026\020\027\032\0020\0218\002@\002X\016¢\006\006\n\004\b\025\020\026¨\006\031"}, d2={"Lcom/yandex/metrica/ModulesFacade;", "", "", "type", "", "name", "value", "", "environment", "", "reportEvent", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "isActivatedForApp", "()Z", "sendEventsBuffer", "()V", "Lcom/yandex/metrica/impl/ob/Bf;", "proxy", "setProxy", "(Lcom/yandex/metrica/impl/ob/Bf;)V", "a", "Lcom/yandex/metrica/impl/ob/Bf;", "sProxy", "<init>", "mobmetricalib_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class ModulesFacade
{
  private static Bf a;
  
  static
  {
    Object localObject = P.g();
    Intrinsics.checkNotNullExpressionValue(localObject, "ClientServiceLocator.getInstance()");
    localObject = ((P)localObject).c();
    Intrinsics.checkNotNullExpressionValue(localObject, "ClientServiceLocator.get…stance().apiProxyExecutor");
    a = new Bf((ICommonExecutor)localObject);
  }
  
  @JvmStatic
  public static final boolean isActivatedForApp()
  {
    return a.a();
  }
  
  @JvmStatic
  public static final void reportEvent(int paramInt, @NotNull String paramString1, @Nullable String paramString2, @Nullable Map<String, String> paramMap)
  {
    a.a(paramInt, paramString1, paramString2, paramMap);
  }
  
  @JvmStatic
  public static final void sendEventsBuffer()
  {
    a.getClass();
    YandexMetrica.sendEventsBuffer();
  }
  
  @VisibleForTesting
  public final void setProxy(@NotNull Bf paramBf)
  {
    a = paramBf;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.ModulesFacade
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */