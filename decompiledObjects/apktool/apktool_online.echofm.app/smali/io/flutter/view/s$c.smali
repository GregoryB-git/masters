.class public Lio/flutter/view/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public o:J

.field public final synthetic p:Lio/flutter/view/s;


# direct methods
.method public constructor <init>(Lio/flutter/view/s;J)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/s$c;->p:Lio/flutter/view/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lio/flutter/view/s$c;->o:J

    return-void
.end method

.method public static synthetic a(Lio/flutter/view/s$c;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lio/flutter/view/s$c;->o:J

    return-wide p1
.end method


# virtual methods
.method public doFrame(J)V
    .locals 10

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/16 p1, 0x0

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    move-wide v4, p1

    goto :goto_0

    :cond_0
    move-wide v4, v0

    :goto_0
    iget-object p1, p0, Lio/flutter/view/s$c;->p:Lio/flutter/view/s;

    invoke-static {p1}, Lio/flutter/view/s;->c(Lio/flutter/view/s;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v3

    iget-object p1, p0, Lio/flutter/view/s$c;->p:Lio/flutter/view/s;

    invoke-static {p1}, Lio/flutter/view/s;->a(Lio/flutter/view/s;)J

    move-result-wide v6

    iget-wide v8, p0, Lio/flutter/view/s$c;->o:J

    invoke-virtual/range {v3 .. v9}, Lio/flutter/embedding/engine/FlutterJNI;->onVsync(JJJ)V

    iget-object p1, p0, Lio/flutter/view/s$c;->p:Lio/flutter/view/s;

    invoke-static {p1, p0}, Lio/flutter/view/s;->e(Lio/flutter/view/s;Lio/flutter/view/s$c;)Lio/flutter/view/s$c;

    return-void
.end method
