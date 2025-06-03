.class public Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;
.implements LA5/a;
.implements LB5/a;


# static fields
.field private static cachedDeepLinkResult:Lcom/appsflyer/deeplink/DeepLinkResult;

.field private static cachedOnAppOpenAttribution:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static cachedOnAttributionFailure:Ljava/lang/String;

.field private static cachedOnConversionDataFail:Ljava/lang/String;

.field private static cachedOnConversionDataSuccess:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static saveCallbacks:Z


# instance fields
.field private activity:Landroid/app/Activity;

.field private final afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

.field private final afDeepLinkListener:Lcom/appsflyer/deeplink/DeepLinkListener;

.field private final callbacksHandler:LE5/k$c;

.field private gcdCallback:Ljava/lang/Boolean;

.field private isFacebookDeferredApplinksEnabled:Ljava/lang/Boolean;

.field private isSetDisableAdvertisingIdentifiersEnable:Ljava/lang/Boolean;

.field private mApplication:Landroid/app/Application;

.field private mCallbackChannel:LE5/k;

.field private mCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mEventChannel:LE5/d;

.field private mIntent:Landroid/content/Intent;

.field private mMethodChannel:LE5/k;

.field private oaoaCallback:Ljava/lang/Boolean;

.field onNewIntentListener:LE5/n;

.field private udlCallback:Ljava/lang/Boolean;

.field final uiThreadHandler:Landroid/os/Handler;

.field private validatePurchaseCallback:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->uiThreadHandler:Landroid/os/Handler;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->gcdCallback:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->oaoaCallback:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->udlCallback:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->validatePurchaseCallback:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->isFacebookDeferredApplinksEnabled:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->isSetDisableAdvertisingIdentifiersEnable:Ljava/lang/Boolean;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mCallbacks:Ljava/util/Map;

    new-instance v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$1;

    invoke-direct {v0, p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$1;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->onNewIntentListener:LE5/n;

    new-instance v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;

    invoke-direct {v0, p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$2;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

    new-instance v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$3;

    invoke-direct {v0, p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$3;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afDeepLinkListener:Lcom/appsflyer/deeplink/DeepLinkListener;

    new-instance v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$4;

    invoke-direct {v0, p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$4;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->callbacksHandler:LE5/k$c;

    return-void
.end method

.method public static synthetic access$000(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    return-object p0
.end method

.method public static synthetic access$100()Z
    .locals 1

    sget-boolean v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->saveCallbacks:Z

    return v0
.end method

.method public static synthetic access$1002(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    sput-object p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnAttributionFailure:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1102(Lcom/appsflyer/deeplink/DeepLinkResult;)Lcom/appsflyer/deeplink/DeepLinkResult;
    .locals 0

    sput-object p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedDeepLinkResult:Lcom/appsflyer/deeplink/DeepLinkResult;

    return-object p0
.end method

.method public static synthetic access$1200(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->udlCallback:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic access$1300(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;LE5/k$d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->startListening(Ljava/lang/Object;LE5/k$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1400(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mCallbacks:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic access$1500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)LE5/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mCallbackChannel:LE5/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1600(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->validatePurchaseCallback:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic access$202(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    sput-object p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnConversionDataSuccess:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic access$300(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->gcdCallback:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic access$400(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->replaceNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$500(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->runOnUIThread(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$602(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    sput-object p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnConversionDataFail:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$700(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->buildJsonResponse(Ljava/lang/Object;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$802(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    sput-object p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnAppOpenAttribution:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic access$900(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->oaoaCallback:Ljava/lang/Boolean;

    return-object p0
.end method

.method private addPushNotificationDeepLinkPath(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-array v0, v0, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, [Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->addPushNotificationDeepLinkPath([Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private buildJsonResponse(Ljava/lang/Object;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "status"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "data"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-object v0
.end method

.method private enableFacebookDeferredApplinks(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "isFacebookDeferredApplinksEnabled"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->isFacebookDeferredApplinksEnabled:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x1

    .line 25
    :goto_0
    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->enableFacebookDeferredApplinks(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v0, 0x0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    const/4 p1, 0x0

    .line 36
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private generateInviteLink(LE5/j;LE5/k$d;)V
    .locals 10

    .line 1
    const-string v0, "channel"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "customerID"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "campaign"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    const-string v3, "referrerName"

    .line 26
    .line 27
    invoke-virtual {p1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    const-string v4, "referrerImageUrl"

    .line 34
    .line 35
    invoke-virtual {p1, v4}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    const-string v5, "baseDeeplink"

    .line 42
    .line 43
    invoke-virtual {p1, v5}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/String;

    .line 48
    .line 49
    const-string v6, "brandDomain"

    .line 50
    .line 51
    invoke-virtual {p1, v6}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/String;

    .line 56
    .line 57
    const-string v7, "customParams"

    .line 58
    .line 59
    invoke-virtual {p1, v7}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/util/Map;

    .line 64
    .line 65
    iget-object v7, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 66
    .line 67
    invoke-static {v7}, Lcom/appsflyer/share/ShareInviteHelper;->generateInviteUrl(Landroid/content/Context;)Lcom/appsflyer/share/LinkGenerator;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const-string v8, ""

    .line 72
    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-nez v9, :cond_0

    .line 80
    .line 81
    invoke-virtual {v7, v0}, Lcom/appsflyer/share/LinkGenerator;->setChannel(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 82
    .line 83
    .line 84
    :cond_0
    if-eqz v2, :cond_1

    .line 85
    .line 86
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_1

    .line 91
    .line 92
    invoke-virtual {v7, v2}, Lcom/appsflyer/share/LinkGenerator;->setCampaign(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 93
    .line 94
    .line 95
    :cond_1
    if-eqz v3, :cond_2

    .line 96
    .line 97
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {v7, v3}, Lcom/appsflyer/share/LinkGenerator;->setReferrerName(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 104
    .line 105
    .line 106
    :cond_2
    if-eqz v4, :cond_3

    .line 107
    .line 108
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    invoke-virtual {v7, v4}, Lcom/appsflyer/share/LinkGenerator;->setReferrerImageURL(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 115
    .line 116
    .line 117
    :cond_3
    if-eqz v1, :cond_4

    .line 118
    .line 119
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    invoke-virtual {v7, v1}, Lcom/appsflyer/share/LinkGenerator;->setReferrerCustomerId(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 126
    .line 127
    .line 128
    :cond_4
    if-eqz v5, :cond_5

    .line 129
    .line 130
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    invoke-virtual {v7, v5}, Lcom/appsflyer/share/LinkGenerator;->setBaseDeeplink(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 137
    .line 138
    .line 139
    :cond_5
    if-eqz v6, :cond_6

    .line 140
    .line 141
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    invoke-virtual {v7, v6}, Lcom/appsflyer/share/LinkGenerator;->setBrandDomain(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    .line 148
    .line 149
    .line 150
    :cond_6
    if-eqz p1, :cond_7

    .line 151
    .line 152
    invoke-interface {p1, v8}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_7

    .line 157
    .line 158
    invoke-virtual {v7, p1}, Lcom/appsflyer/share/LinkGenerator;->addParameters(Ljava/util/Map;)Lcom/appsflyer/share/LinkGenerator;

    .line 159
    .line 160
    .line 161
    :cond_7
    new-instance p1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$5;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 167
    .line 168
    invoke-virtual {v7, v0, p1}, Lcom/appsflyer/share/LinkGenerator;->generateLink(Landroid/content/Context;Lcom/appsflyer/share/LinkGenerator$ResponseListener;)V

    .line 169
    .line 170
    .line 171
    const/4 p1, 0x0

    .line 172
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method private getAppsFlyerUID(LE5/k$d;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private getHostName(LE5/k$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->getHostName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private getHostPrefix(LE5/k$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private getOutOfStore(LE5/k$d;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->getOutOfStore(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private getSdkVersion(LE5/k$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->getSdkVersion()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private initSdk(LE5/j;LE5/k$d;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "afDevKey"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    const-string v3, "AF Dev Key is empty"

    .line 25
    .line 26
    const-string v4, "AF dev key cannot be empty"

    .line 27
    .line 28
    invoke-interface {p2, v2, v3, v4}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const-string v3, "disableAdvertisingIdentifier"

    .line 32
    .line 33
    invoke-virtual {p1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x1

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, v4}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    .line 47
    .line 48
    .line 49
    :cond_2
    const-string v3, "GCD"

    .line 50
    .line 51
    invoke-virtual {p1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

    .line 64
    .line 65
    :cond_3
    const-string v3, "UDL"

    .line 66
    .line 67
    invoke-virtual {p1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    iget-object v3, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afDeepLinkListener:Lcom/appsflyer/deeplink/DeepLinkListener;

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Lcom/appsflyer/AppsFlyerLib;->subscribeForDeepLink(Lcom/appsflyer/deeplink/DeepLinkListener;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    const-string v3, "isDebug"

    .line 85
    .line 86
    invoke-virtual {p1, v3}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v5, 0x0

    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    sget-object v3, Lcom/appsflyer/AFLogger$LogLevel;->DEBUG:Lcom/appsflyer/AFLogger$LogLevel;

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Lcom/appsflyer/AppsFlyerLib;->setLogLevel(Lcom/appsflyer/AFLogger$LogLevel;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v4}, Lcom/appsflyer/AppsFlyerLib;->setDebugLog(Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    invoke-virtual {v0, v5}, Lcom/appsflyer/AppsFlyerLib;->setDebugLog(Z)V

    .line 109
    .line 110
    .line 111
    :goto_0
    new-instance v3, Lcom/appsflyer/internal/platform_extension/PluginInfo;

    .line 112
    .line 113
    sget-object v4, Lcom/appsflyer/internal/platform_extension/Plugin;->FLUTTER:Lcom/appsflyer/internal/platform_extension/Plugin;

    .line 114
    .line 115
    const-string v6, "6.12.2"

    .line 116
    .line 117
    invoke-direct {v3, v4, v6}, Lcom/appsflyer/internal/platform_extension/PluginInfo;-><init>(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v3}, Lcom/appsflyer/AppsFlyerLib;->setPluginInfo(Lcom/appsflyer/internal/platform_extension/PluginInfo;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 124
    .line 125
    invoke-virtual {v0, v1, v2, v3}, Lcom/appsflyer/AppsFlyerLib;->init(Ljava/lang/String;Lcom/appsflyer/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;

    .line 126
    .line 127
    .line 128
    const-string v1, "appInviteOneLink"

    .line 129
    .line 130
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Ljava/lang/String;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setAppInviteOneLink(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->start(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    sget-boolean p1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->saveCallbacks:Z

    .line 147
    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    sput-boolean v5, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->saveCallbacks:Z

    .line 151
    .line 152
    invoke-direct {p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->sendCachedCallbacksToDart()V

    .line 153
    .line 154
    .line 155
    :cond_7
    const-string p1, "success"

    .line 156
    .line 157
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method private static jsonToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private logCrossPromotionAndOpenStore(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    const-string v0, "appId"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "campaign"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "params"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/Map;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v2, v0, v1, p1}, Lcom/appsflyer/share/CrossPromotionHelper;->logAndOpenStore(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private logCrossPromotionImpression(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    const-string v0, "appId"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "campaign"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "data"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/Map;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v2, v0, v1, p1}, Lcom/appsflyer/share/CrossPromotionHelper;->logCrossPromoteImpression(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private logEvent(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "eventName"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "eventValues"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/util/Map;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1, p1}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private onAttachedToEngine(Landroid/content/Context;LE5/c;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    new-instance p1, LE5/d;

    const-string v0, "af-events"

    invoke-direct {p1, p2, v0}, LE5/d;-><init>(LE5/c;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mEventChannel:LE5/d;

    new-instance p1, LE5/k;

    const-string v0, "af-api"

    invoke-direct {p1, p2, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mMethodChannel:LE5/k;

    invoke-virtual {p1, p0}, LE5/k;->e(LE5/k$c;)V

    new-instance p1, LE5/k;

    const-string v0, "callbacks"

    invoke-direct {p1, p2, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mCallbackChannel:LE5/k;

    iget-object p2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->callbacksHandler:LE5/k$c;

    invoke-virtual {p1, p2}, LE5/k;->e(LE5/k$c;)V

    return-void
.end method

.method private registerValidatorListener()V
    .locals 3

    new-instance v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;

    invoke-direct {v0, p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$7;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;)V

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/appsflyer/AppsFlyerLib;->registerValidatorListener(Landroid/content/Context;Lcom/appsflyer/AppsFlyerInAppPurchaseValidatorListener;)V

    return-void
.end method

.method private replaceNullValues(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    :goto_1
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private runOnUIThread(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->uiThreadHandler:Landroid/os/Handler;

    new-instance v1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$6;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin$6;-><init>(Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private sendCachedCallbacksToDart()V
    .locals 3

    sget-object v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedDeepLinkResult:Lcom/appsflyer/deeplink/DeepLinkResult;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afDeepLinkListener:Lcom/appsflyer/deeplink/DeepLinkListener;

    invoke-interface {v2, v0}, Lcom/appsflyer/deeplink/DeepLinkListener;->onDeepLinking(Lcom/appsflyer/deeplink/DeepLinkResult;)V

    sput-object v1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedDeepLinkResult:Lcom/appsflyer/deeplink/DeepLinkResult;

    :cond_0
    sget-object v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnConversionDataSuccess:Ljava/util/Map;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

    invoke-interface {v2, v0}, Lcom/appsflyer/AppsFlyerConversionListener;->onConversionDataSuccess(Ljava/util/Map;)V

    sput-object v1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnConversionDataSuccess:Ljava/util/Map;

    :cond_1
    sget-object v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnAppOpenAttribution:Ljava/util/Map;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

    invoke-interface {v2, v0}, Lcom/appsflyer/AppsFlyerConversionListener;->onAppOpenAttribution(Ljava/util/Map;)V

    sput-object v1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnAppOpenAttribution:Ljava/util/Map;

    :cond_2
    sget-object v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnAttributionFailure:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

    invoke-interface {v2, v0}, Lcom/appsflyer/AppsFlyerConversionListener;->onAttributionFailure(Ljava/lang/String;)V

    sput-object v1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnAttributionFailure:Ljava/lang/String;

    :cond_3
    sget-object v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnConversionDataFail:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->afConversionListener:Lcom/appsflyer/AppsFlyerConversionListener;

    invoke-interface {v2, v0}, Lcom/appsflyer/AppsFlyerConversionListener;->onConversionDataFail(Ljava/lang/String;)V

    sput-object v1, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->cachedOnConversionDataFail:Ljava/lang/String;

    :cond_4
    return-void
.end method

.method private sendPushNotificationData(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/Map;

    .line 4
    .line 5
    const-string v0, "AppsFlyer"

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p1, "Push payload is null"

    .line 10
    .line 11
    :goto_0
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->jsonToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Lcom/appsflyer/AppsFlyerLib;->sendPushNotificationData(Landroid/app/Activity;)V

    .line 50
    .line 51
    .line 52
    move-object p1, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string p1, "The intent is null. Push payload has not been sent!"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string p1, "The activity is null. Push payload has not been sent!"

    .line 58
    .line 59
    :goto_1
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    invoke-interface {p2, v2}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catch_0
    const-string p1, "Can\'t parse pushPayload to bundle"

    .line 70
    .line 71
    goto :goto_0
.end method

.method private setAdditionalData(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "customData"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setAdditionalData(Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private setAndroidIdData(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "androidId"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setAndroidIdData(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private setAppInivteOneLinkID(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "oneLinkID"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2, p1}, Lcom/appsflyer/AppsFlyerLib;->setAppInviteOneLink(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mCallbacks:Ljava/util/Map;

    .line 26
    .line 27
    const-string p2, "setAppInviteOneLinkIDCallback"

    .line 28
    .line 29
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    const-string p1, "success"

    .line 36
    .line 37
    invoke-direct {p0, p1, p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->buildJsonResponse(Ljava/lang/Object;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0, v0, p2, p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->runOnUIThread(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 46
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    return-void
.end method

.method private setCollectAndroidId(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "isCollect"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setCollectAndroidID(Z)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private setCollectIMEI(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "isCollect"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setCollectIMEI(Z)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private setCurrencyCode(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "currencyCode"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setCurrencyCode(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private setCustomerIdAndLogSession(LE5/j;LE5/k$d;)V
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lcom/appsflyer/AppsFlyerLib;->setCustomerIdAndLogSession(Ljava/lang/String;Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private setCustomerUserId(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setCustomerUserId(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private setDisableAdvertisingIdentifiers(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->isSetDisableAdvertisingIdentifiersEnable:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x1

    .line 21
    :goto_0
    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    const/4 p1, 0x0

    .line 32
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private setDisableNetworkData(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setDisableNetworkData(Z)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private setHost(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string p2, "hostPrefix"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "hostName"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p2, p1}, Lcom/appsflyer/AppsFlyerLib;->setHost(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private setImeiData(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "imei"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setImeiData(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private setIsUpdate(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "isUpdate"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setIsUpdate(Z)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private setMinTimeBetweenSessions(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "seconds"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setMinTimeBetweenSessions(I)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private setOneLinkCustomDomain(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setOneLinkCustomDomain([Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private setOutOfStore(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setOutOfStore(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private setPartnerData(LE5/j;LE5/k$d;)V
    .locals 2

    .line 1
    const-string v0, "partnerId"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "partnersData"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/HashMap;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setPartnerData(Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private setPushNotification(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->sendPushNotificationData(Landroid/app/Activity;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private setResolveDeepLinkURLs(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setResolveDeepLinkURLs([Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private setSharingFilter(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilter([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private setSharingFilterForAllPartners(LE5/k$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForAllPartners()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private setSharingFilterForPartners(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-array v0, v0, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, [Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForPartners([Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private setUserEmails(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    const-string v0, "emails"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    const-string v1, "cryptType"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    sget-object p1, Lcom/appsflyer/AppsFlyerProperties$EmailsCryptType;->NONE:Lcom/appsflyer/AppsFlyerProperties$EmailsCryptType;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x1

    .line 27
    if-ne p1, v1, :cond_2

    .line 28
    .line 29
    sget-object p1, Lcom/appsflyer/AppsFlyerProperties$EmailsCryptType;->SHA256:Lcom/appsflyer/AppsFlyerProperties$EmailsCryptType;

    .line 30
    .line 31
    :goto_0
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x0

    .line 38
    new-array v2, v2, [Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lcom/appsflyer/AppsFlyerLib;->setUserEmails(Lcom/appsflyer/AppsFlyerProperties$EmailsCryptType;[Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    const/4 p1, 0x0

    .line 50
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/security/InvalidParameterException;

    .line 55
    .line 56
    const-string p2, "You can use only NONE or SHA256 for EmailsCryptType on android"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method private startListening(Ljava/lang/Object;LE5/k$d;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "onInstallConversionData"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->gcdCallback:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_0
    const-string v0, "onAppOpenAttribution"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->oaoaCallback:Ljava/lang/Boolean;

    .line 26
    .line 27
    :cond_1
    const-string v0, "onDeepLinking"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->udlCallback:Ljava/lang/Boolean;

    .line 38
    .line 39
    :cond_2
    const-string v0, "validatePurchase"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->validatePurchaseCallback:Ljava/lang/Boolean;

    .line 50
    .line 51
    :cond_3
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v1, "id"

    .line 57
    .line 58
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mCallbacks:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private stop(LE5/j;LE5/k$d;)V
    .locals 2

    .line 1
    const-string v0, "isStopped"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Lcom/appsflyer/AppsFlyerLib;->stop(ZLandroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private updateServerUninstallToken(LE5/j;LE5/k$d;)V
    .locals 2

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lcom/appsflyer/AppsFlyerLib;->updateServerUninstallToken(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private validateAndLogInAppPurchase(LE5/j;LE5/k$d;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->registerValidatorListener()V

    .line 2
    .line 3
    .line 4
    const-string v0, "publicKey"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "signature"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v4, v0

    .line 20
    check-cast v4, Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "purchaseData"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v5, v0

    .line 29
    check-cast v5, Ljava/lang/String;

    .line 30
    .line 31
    const-string v0, "price"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v6, v0

    .line 38
    check-cast v6, Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "currency"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v7, v0

    .line 47
    check-cast v7, Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "additionalParameters"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    move-object v8, p1

    .line 56
    check-cast v8, Ljava/util/Map;

    .line 57
    .line 58
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v2, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mContext:Landroid/content/Context;

    .line 63
    .line 64
    invoke-virtual/range {v1 .. v8}, Lcom/appsflyer/AppsFlyerLib;->validateAndLogInAppPurchase(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method private waitForCustomerUserId(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    const-string v0, "wait"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LE5/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->waitForCustomerUserId(Z)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public onAttachedToActivity(LB5/c;)V
    .locals 1

    .line 1
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mIntent:Landroid/content/Intent;

    .line 16
    .line 17
    invoke-interface {p1}, LB5/c;->c()Landroid/app/Activity;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mApplication:Landroid/app/Application;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->onNewIntentListener:LE5/n;

    .line 28
    .line 29
    invoke-interface {p1, v0}, LB5/c;->g(LE5/n;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->onAttachedToEngine(Landroid/content/Context;LE5/c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->saveCallbacks:Z

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mMethodChannel:LE5/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mMethodChannel:LE5/k;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mEventChannel:LE5/d;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LE5/d;->d(LE5/d$d;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->mEventChannel:LE5/d;

    .line 15
    .line 16
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p1, "AppsFlyer"

    const-string p2, "Activity isn\'t attached to the flutter engine"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "setAdditionalData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x27

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "getAppsFlyerUID"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x26

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "logEvent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x25

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "setHost"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x24

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "initSdk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x23

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "setCollectAndroidId"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x22

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "setIsUpdate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x21

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "addPushNotificationDeepLinkPath"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x20

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "getHostName"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x1f

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "setUserEmails"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x1e

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "setImeiData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x1d

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "setResolveDeepLinkURLs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x1c

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "generateInviteLink"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0x1b

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "setCustomerUserId"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0x1a

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "setCustomerIdAndLogSession"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x19

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "setSharingFilterForAllPartners"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0x18

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "waitForCustomerUserId"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v2, 0x17

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "setMinTimeBetweenSessions"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0x16

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "updateServerUninstallToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v2, 0x15

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "setSharingFilter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v2, 0x14

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "setAndroidIdData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "setDisableAdvertisingIdentifiers"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "stop"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "setDisableNetworkData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "logCrossPromotionImpression"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "getSDKVersion"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "setOutOfStore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_1b
    const-string v1, "logCrossPromotionAndOpenStore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_1c
    const-string v1, "setCollectIMEI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_1d
    const-string v1, "sendPushNotificationData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_1e
    const-string v1, "setCurrencyCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_1f
    const-string v1, "enableFacebookDeferredApplinks"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_20
    const-string v1, "getOutOfStore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_21
    const-string v1, "setOneLinkCustomDomain"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_22
    const-string v1, "setPartnerData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_0

    :cond_23
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_23
    const-string v1, "getHostPrefix"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_0

    :cond_24
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_24
    const-string v1, "setPushNotification"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_0

    :cond_25
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_25
    const-string v1, "setSharingFilterForPartners"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto :goto_0

    :cond_26
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_26
    const-string v1, "validateAndLogInAppAndroidPurchase"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto :goto_0

    :cond_27
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_27
    const-string v1, "setAppInviteOneLinkID"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto :goto_0

    :cond_28
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, LE5/k$d;->c()V

    goto/16 :goto_1

    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setAdditionalData(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-direct {p0, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->getAppsFlyerUID(LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->logEvent(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setHost(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->initSdk(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_5
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setCollectAndroidId(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_6
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setIsUpdate(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_7
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->addPushNotificationDeepLinkPath(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-direct {p0, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->getHostName(LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setUserEmails(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setImeiData(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_b
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setResolveDeepLinkURLs(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_c
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->generateInviteLink(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_d
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setCustomerUserId(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_e
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setCustomerIdAndLogSession(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_f
    invoke-direct {p0, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setSharingFilterForAllPartners(LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_10
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->waitForCustomerUserId(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_11
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setMinTimeBetweenSessions(LE5/j;LE5/k$d;)V

    goto/16 :goto_1

    :pswitch_12
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->updateServerUninstallToken(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_13
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setSharingFilter(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_14
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setAndroidIdData(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_15
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setDisableAdvertisingIdentifiers(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_16
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->stop(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_17
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setDisableNetworkData(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_18
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->logCrossPromotionImpression(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_19
    invoke-direct {p0, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->getSdkVersion(LE5/k$d;)V

    goto :goto_1

    :pswitch_1a
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setOutOfStore(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_1b
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->logCrossPromotionAndOpenStore(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_1c
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setCollectIMEI(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_1d
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->sendPushNotificationData(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_1e
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setCurrencyCode(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_1f
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->enableFacebookDeferredApplinks(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_20
    invoke-direct {p0, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->getOutOfStore(LE5/k$d;)V

    goto :goto_1

    :pswitch_21
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setOneLinkCustomDomain(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_22
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setPartnerData(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_23
    invoke-direct {p0, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->getHostPrefix(LE5/k$d;)V

    goto :goto_1

    :pswitch_24
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setPushNotification(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_25
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setSharingFilterForPartners(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_26
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->validateAndLogInAppPurchase(LE5/j;LE5/k$d;)V

    goto :goto_1

    :pswitch_27
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->setAppInivteOneLinkID(LE5/j;LE5/k$d;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x77f460cd -> :sswitch_27
        -0x76f44e89 -> :sswitch_26
        -0x6c83acfe -> :sswitch_25
        -0x69f04e59 -> :sswitch_24
        -0x58c991b0 -> :sswitch_23
        -0x55b2a930 -> :sswitch_22
        -0x4b93ec8d -> :sswitch_21
        -0x4ab589ee -> :sswitch_20
        -0x47049d40 -> :sswitch_1f
        -0x2ce0d0e0 -> :sswitch_1e
        -0x2abe11e9 -> :sswitch_1d
        -0x215330d0 -> :sswitch_1c
        -0x1e8b3119 -> :sswitch_1b
        -0x1c913be2 -> :sswitch_1a
        -0xb6e20cc -> :sswitch_19
        -0x898c1f0 -> :sswitch_18
        -0x72b010e -> :sswitch_17
        0x360802 -> :sswitch_16
        0xbeb2ec -> :sswitch_15
        0x164e172 -> :sswitch_14
        0x17bb632 -> :sswitch_13
        0x12a796c3 -> :sswitch_12
        0x22220988 -> :sswitch_11
        0x2714a7f8 -> :sswitch_10
        0x27d59fb5 -> :sswitch_f
        0x2b3ecc0e -> :sswitch_e
        0x2c8bf0c6 -> :sswitch_d
        0x374f09f8 -> :sswitch_c
        0x464aa954 -> :sswitch_b
        0x4a36bf14 -> :sswitch_a
        0x62fcc204 -> :sswitch_9
        0x69ed0dc9 -> :sswitch_8
        0x6bd96b51 -> :sswitch_7
        0x6cbfc915 -> :sswitch_6
        0x6fedca62 -> :sswitch_5
        0x7421050a -> :sswitch_4
        0x764b252a -> :sswitch_3
        0x769949b6 -> :sswitch_2
        0x7721d2d8 -> :sswitch_1
        0x7c792573 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReattachedToActivityForConfigChanges(LB5/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->sendCachedCallbacksToDart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/appsflyersdk/AppsflyerSdkPlugin;->onNewIntentListener:LE5/n;

    .line 5
    .line 6
    invoke-interface {p1, v0}, LB5/c;->g(LE5/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
