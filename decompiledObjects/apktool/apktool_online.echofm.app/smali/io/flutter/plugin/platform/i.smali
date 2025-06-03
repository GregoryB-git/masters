.class public final synthetic Lio/flutter/plugin/platform/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lio/flutter/plugin/platform/h$b;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/h$b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/i;->o:Lio/flutter/plugin/platform/h$b;

    iput p2, p0, Lio/flutter/plugin/platform/i;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/i;->o:Lio/flutter/plugin/platform/h$b;

    iget v1, p0, Lio/flutter/plugin/platform/i;->p:I

    invoke-static {v0, v1}, Lio/flutter/plugin/platform/h$b;->a(Lio/flutter/plugin/platform/h$b;I)V

    return-void
.end method
