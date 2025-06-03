.class public final Lcom/appsflyer/internal/AFf1zSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFInAppEventParameterName:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final AFInAppEventType:Ljava/lang/String;

.field public final AFKeystoreWrapper:J

.field public final AFLogger:Ljava/lang/String;

.field public final afDebugLog:Ljava/lang/Throwable;

.field public final afInfoLog:Lcom/appsflyer/internal/AFf1wSDK;

.field public final valueOf:J

.field public final values:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJILcom/appsflyer/internal/AFf1wSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1zSDK;->AFInAppEventType:Ljava/lang/String;

    iput-object p2, p0, Lcom/appsflyer/internal/AFf1zSDK;->AFInAppEventParameterName:Ljava/lang/String;

    iput-wide p3, p0, Lcom/appsflyer/internal/AFf1zSDK;->AFKeystoreWrapper:J

    iput-wide p5, p0, Lcom/appsflyer/internal/AFf1zSDK;->valueOf:J

    iput p7, p0, Lcom/appsflyer/internal/AFf1zSDK;->values:I

    iput-object p8, p0, Lcom/appsflyer/internal/AFf1zSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1wSDK;

    iput-object p9, p0, Lcom/appsflyer/internal/AFf1zSDK;->AFLogger:Ljava/lang/String;

    iput-object p10, p0, Lcom/appsflyer/internal/AFf1zSDK;->afDebugLog:Ljava/lang/Throwable;

    return-void
.end method
