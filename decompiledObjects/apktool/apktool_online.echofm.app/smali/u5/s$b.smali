.class public Lu5/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu5/s;


# direct methods
.method public constructor <init>(Lu5/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/s$b;->a:Lu5/s;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    const-string v0, "FlutterSurfaceView"

    .line 2
    .line 3
    const-string v1, "onFlutterUiDisplayed()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu5/s$b;->a:Lu5/s;

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/s$b;->a:Lu5/s;

    .line 16
    .line 17
    invoke-static {v0}, Lu5/s;->i(Lu5/s;)Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lu5/s$b;->a:Lu5/s;

    .line 24
    .line 25
    invoke-static {v0}, Lu5/s;->i(Lu5/s;)Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->k(Lio/flutter/embedding/engine/renderer/j;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
