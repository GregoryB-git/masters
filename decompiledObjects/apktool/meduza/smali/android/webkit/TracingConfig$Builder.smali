.class public synthetic Landroid/webkit/TracingConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw v0
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native synthetic addCategories(Ljava/util/Collection;)Landroid/webkit/TracingConfig$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/webkit/TracingConfig$Builder;"
        }
    .end annotation
.end method

.method public varargs native synthetic addCategories([I)Landroid/webkit/TracingConfig$Builder;
.end method

.method public native synthetic build()Landroid/webkit/TracingConfig;
.end method

.method public native synthetic setTracingMode(I)Landroid/webkit/TracingConfig$Builder;
.end method
