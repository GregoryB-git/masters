.class public synthetic Landroid/webkit/TracingController;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw v0
.end method

.method public static native synthetic getInstance()Landroid/webkit/TracingController;
    .annotation build Landroid/annotation/NonNull;
    .end annotation
.end method


# virtual methods
.method public abstract synthetic isTracing()Z
.end method

.method public abstract synthetic start(Landroid/webkit/TracingConfig;)V
    .param p1    # Landroid/webkit/TracingConfig;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract synthetic stop(Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z
    .param p1    # Ljava/io/OutputStream;
        .annotation build Landroid/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/annotation/NonNull;
        .end annotation
    .end param
.end method
