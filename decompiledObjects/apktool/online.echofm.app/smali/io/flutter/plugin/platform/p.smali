.class public final synthetic Lio/flutter/plugin/platform/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lio/flutter/plugin/platform/r;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/p;->o:Lio/flutter/plugin/platform/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/p;->o:Lio/flutter/plugin/platform/r;

    invoke-static {v0}, Lio/flutter/plugin/platform/r;->e(Lio/flutter/plugin/platform/r;)V

    return-void
.end method
