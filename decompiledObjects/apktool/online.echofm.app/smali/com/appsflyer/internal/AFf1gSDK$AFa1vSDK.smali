.class final enum Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFf1gSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AFa1vSDK"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;",
        ">;"
    }
.end annotation


# static fields
.field private static enum AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

.field private static enum AFInAppEventType:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

.field private static enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

.field private static enum AFLogger:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

.field private static final synthetic afErrorLog:[Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

.field private static enum valueOf:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;


# instance fields
.field values:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    const/4 v1, 0x0

    const-string v2, "uk"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    const/4 v2, 0x1

    const-string v3, "am"

    const-string v4, "ACCELEROMETER"

    invoke-direct {v0, v4, v2, v3}, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    const/4 v3, 0x2

    const-string v4, "mm"

    const-string v5, "MAGNETOMETER"

    invoke-direct {v0, v5, v3, v4}, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->valueOf:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    const/4 v4, 0x3

    const-string v5, "rs"

    const-string v6, "RESERVED"

    invoke-direct {v0, v6, v4, v5}, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    const/4 v5, 0x4

    const-string v6, "gs"

    const-string v7, "GYROSCOPE"

    invoke-direct {v0, v7, v5, v6}, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFLogger:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    const/4 v6, 0x5

    new-array v6, v6, [Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    sget-object v7, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    aput-object v7, v6, v1

    sget-object v1, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    aput-object v1, v6, v2

    sget-object v1, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->valueOf:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    aput-object v1, v6, v3

    sget-object v1, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->AFInAppEventParameterName:Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->afErrorLog:[Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->values:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->afErrorLog:[Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFf1gSDK$AFa1vSDK;

    return-object v0
.end method
