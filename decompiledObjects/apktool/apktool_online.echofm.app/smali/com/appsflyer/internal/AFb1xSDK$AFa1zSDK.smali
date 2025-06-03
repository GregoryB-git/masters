.class final enum Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFb1xSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AFa1zSDK"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;",
        ">;"
    }
.end annotation


# static fields
.field private static enum AFInAppEventParameterName:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field public static final enum AFInAppEventType:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum AFLogger:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum AFVersionDeclaration:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum afDebugLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum afErrorLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum afInfoLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum afRDLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum afWarnLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum getLevel:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static final synthetic onInstallConversionDataLoadedNative:[Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum valueOf:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

.field private static enum values:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;


# instance fields
.field private final afErrorLogForExcManagerOnly:Ljava/lang/String;

.field private final init:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v1, "android_adobe_air"

    const-string v2, "com.appsflyer.adobeair.AppsFlyerExtension"

    const-string v3, "ADOBE_AIR"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->values:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v1, "android_adobe_mobile"

    const-string v2, "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"

    const-string v3, "ADOBE_MOBILE_SDK"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v1, "android_cocos2dx"

    const-string v2, "org.cocos2dx.lib.Cocos2dxActivity"

    const-string v3, "COCOS2DX"

    const/4 v6, 0x2

    invoke-direct {v0, v3, v6, v1, v2}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v1, "android_cordova"

    const-string v2, "com.appsflyer.cordova.plugin.AppsFlyerPlugin"

    const-string v3, "CORDOVA"

    const/4 v7, 0x3

    invoke-direct {v0, v3, v7, v1, v2}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->valueOf:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const/4 v1, 0x4

    const-string v2, "android_native"

    const-string v3, "DEFAULT"

    invoke-direct {v0, v3, v1, v2, v2}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_flutter"

    const-string v8, "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"

    const-string v9, "FLUTTER"

    const/4 v10, 0x5

    invoke-direct {v2, v9, v10, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afRDLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_mparticle"

    const-string v8, "com.mparticle.kits.AppsFlyerKit"

    const-string v9, "M_PARTICLE"

    const/4 v11, 0x6

    invoke-direct {v2, v9, v11, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afDebugLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_native_script"

    const-string v8, "com.tns.NativeScriptActivity"

    const-string v9, "NATIVE_SCRIPT"

    const/4 v12, 0x7

    invoke-direct {v2, v9, v12, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afInfoLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_expo"

    const-string v8, "expo.modules.devmenu.react.DevMenuAwareReactActivity"

    const-string v9, "EXPO"

    const/16 v13, 0x8

    invoke-direct {v2, v9, v13, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afErrorLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_reactNative"

    const-string v8, "com.appsflyer.reactnative.RNAppsFlyerModule"

    const-string v9, "REACT_NATIVE"

    const/16 v14, 0x9

    invoke-direct {v2, v9, v14, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFLogger:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_unity"

    const-string v8, "com.appsflyer.unity.AppsFlyerAndroidWrapper"

    const-string v9, "UNITY"

    const/16 v15, 0xa

    invoke-direct {v2, v9, v15, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_unreal"

    const-string v8, "com.epicgames.ue4.GameActivity"

    const-string v9, "UNREAL_ENGINE"

    const/16 v15, 0xb

    invoke-direct {v2, v9, v15, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_xamarin"

    const-string v8, "mono.android.Runtime"

    const-string v9, "XAMARIN"

    const/16 v15, 0xc

    invoke-direct {v2, v9, v15, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->getLevel:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    new-instance v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const-string v3, "android_capacitor"

    const-string v8, "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin"

    const-string v9, "CAPACITOR"

    const/16 v15, 0xd

    invoke-direct {v2, v9, v15, v3, v8}, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFLogger$LogLevel:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const/16 v3, 0xe

    new-array v3, v3, [Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    sget-object v8, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->values:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v8, v3, v4

    sget-object v4, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v4, v3, v5

    sget-object v4, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v4, v3, v6

    sget-object v4, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->valueOf:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v4, v3, v7

    aput-object v0, v3, v1

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afRDLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v0, v3, v10

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afDebugLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v0, v3, v11

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afInfoLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v0, v3, v12

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afErrorLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v0, v3, v13

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFLogger:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    aput-object v0, v3, v14

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afWarnLog:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const/16 v1, 0xa

    aput-object v0, v3, v1

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->AFVersionDeclaration:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const/16 v1, 0xb

    aput-object v0, v3, v1

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->getLevel:Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    const/16 v1, 0xc

    aput-object v0, v3, v1

    aput-object v2, v3, v15

    sput-object v3, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->onInstallConversionDataLoadedNative:[Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afErrorLogForExcManagerOnly:Ljava/lang/String;

    iput-object p4, p0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->init:Ljava/lang/String;

    return-void
.end method

.method public static synthetic AFInAppEventParameterName(Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->afErrorLogForExcManagerOnly:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic AFKeystoreWrapper(Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->init:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->onInstallConversionDataLoadedNative:[Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFb1xSDK$AFa1zSDK;

    return-object v0
.end method
