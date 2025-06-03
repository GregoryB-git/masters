.class public final enum Lcom/appsflyer/internal/AFc1aSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFc1aSDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
.end annotation


# static fields
.field private static final synthetic AFInAppEventParameterName:[Lcom/appsflyer/internal/AFc1aSDK;

.field public static final enum AFInAppEventType:Lcom/appsflyer/internal/AFc1aSDK;

.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

.field public static final enum values:Lcom/appsflyer/internal/AFc1aSDK;


# instance fields
.field public final valueOf:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/appsflyer/internal/AFc1aSDK;

    const/4 v1, 0x0

    const-string v2, "api"

    const-string v3, "API"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/internal/AFc1aSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFc1aSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFc1aSDK;

    new-instance v2, Lcom/appsflyer/internal/AFc1aSDK;

    const/4 v3, 0x1

    const-string v4, "rc"

    const-string v5, "RC"

    invoke-direct {v2, v5, v3, v4}, Lcom/appsflyer/internal/AFc1aSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFc1aSDK;->values:Lcom/appsflyer/internal/AFc1aSDK;

    new-instance v4, Lcom/appsflyer/internal/AFc1aSDK;

    const/4 v5, 0x2

    const-string v6, ""

    const-string v7, "DEFAULT"

    invoke-direct {v4, v7, v5, v6}, Lcom/appsflyer/internal/AFc1aSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    const/4 v6, 0x3

    new-array v6, v6, [Lcom/appsflyer/internal/AFc1aSDK;

    aput-object v0, v6, v1

    aput-object v2, v6, v3

    aput-object v4, v6, v5

    sput-object v6, Lcom/appsflyer/internal/AFc1aSDK;->AFInAppEventParameterName:[Lcom/appsflyer/internal/AFc1aSDK;

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

    iput-object p3, p0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1aSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFc1aSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFc1aSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFc1aSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFc1aSDK;->AFInAppEventParameterName:[Lcom/appsflyer/internal/AFc1aSDK;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFc1aSDK;

    return-object v0
.end method
