.class public interface abstract Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static final cachedThreadPool:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public abstract didReinitializeFirebaseCore()LV2/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LV2/j;"
        }
    .end annotation
.end method

.method public abstract getPluginConstantsForFirebaseApp(Ls3/e;)LV2/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/e;",
            ")",
            "LV2/j;"
        }
    .end annotation
.end method
