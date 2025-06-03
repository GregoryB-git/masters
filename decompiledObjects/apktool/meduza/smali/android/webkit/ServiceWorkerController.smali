.class public synthetic Landroid/webkit/ServiceWorkerController;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw v0
.end method

.method public static native synthetic getInstance()Landroid/webkit/ServiceWorkerController;
    .annotation build Landroid/annotation/NonNull;
    .end annotation
.end method


# virtual methods
.method public abstract synthetic getServiceWorkerWebSettings()Landroid/webkit/ServiceWorkerWebSettings;
    .annotation build Landroid/annotation/NonNull;
    .end annotation
.end method

.method public abstract synthetic setServiceWorkerClient(Landroid/webkit/ServiceWorkerClient;)V
    .param p1    # Landroid/webkit/ServiceWorkerClient;
        .annotation build Landroid/annotation/Nullable;
        .end annotation
    .end param
.end method
