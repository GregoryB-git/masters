.class public Lu5/D$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu5/D;->A(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lu5/D;


# direct methods
.method public constructor <init>(Lu5/D;Lio/flutter/embedding/engine/renderer/FlutterRenderer;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/D$e;->c:Lu5/D;

    .line 2
    .line 3
    iput-object p2, p0, Lu5/D$e;->a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 4
    .line 5
    iput-object p3, p0, Lu5/D$e;->b:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
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
    iget-object v0, p0, Lu5/D$e;->a:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->k(Lio/flutter/embedding/engine/renderer/j;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu5/D$e;->b:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/D$e;->c:Lu5/D;

    .line 12
    .line 13
    iget-object v1, v0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 14
    .line 15
    instance-of v1, v1, Lu5/r;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lu5/D;->i(Lu5/D;)Lu5/r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lu5/D$e;->c:Lu5/D;

    .line 26
    .line 27
    invoke-static {v0}, Lu5/D;->i(Lu5/D;)Lu5/r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lu5/r;->a()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lu5/D$e;->c:Lu5/D;

    .line 35
    .line 36
    invoke-static {v0}, Lu5/D;->j(Lu5/D;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method
