.class public final Lpa/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpa/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpa/g;->onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/embedding/engine/loader/FlutterLoader;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/loader/FlutterLoader;)V
    .locals 0

    iput-object p1, p0, Lpa/g$e;->a:Lio/flutter/embedding/engine/loader/FlutterLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpa/g$e;->a:Lio/flutter/embedding/engine/loader/FlutterLoader;

    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-static {p2}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lio/flutter/embedding/engine/loader/FlutterLoader;->getLookupKeyForAsset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getLookupKeyForAsset(...)"

    invoke-static {p1, p2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
