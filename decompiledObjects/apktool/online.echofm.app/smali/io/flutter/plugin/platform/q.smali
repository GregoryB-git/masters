.class public final synthetic Lio/flutter/plugin/platform/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lio/flutter/plugin/platform/r$a;

.field public final synthetic p:Lio/flutter/plugin/platform/y;

.field public final synthetic q:F

.field public final synthetic r:LD5/q$b;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/r$a;Lio/flutter/plugin/platform/y;FLD5/q$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/plugin/platform/q;->o:Lio/flutter/plugin/platform/r$a;

    .line 5
    .line 6
    iput p3, p0, Lio/flutter/plugin/platform/q;->q:F

    .line 7
    .line 8
    iput-object p4, p0, Lio/flutter/plugin/platform/q;->r:LD5/q$b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/q;->o:Lio/flutter/plugin/platform/r$a;

    iget-object v1, p0, Lio/flutter/plugin/platform/q;->p:Lio/flutter/plugin/platform/y;

    iget v2, p0, Lio/flutter/plugin/platform/q;->q:F

    iget-object v3, p0, Lio/flutter/plugin/platform/q;->r:LD5/q$b;

    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugin/platform/r$a;->j(Lio/flutter/plugin/platform/r$a;Lio/flutter/plugin/platform/y;FLD5/q$b;)V

    return-void
.end method
