.class public final Lua/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lua/b;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lua/b;


# direct methods
.method public constructor <init>(Lua/b;)V
    .locals 0

    iput-object p1, p0, Lua/b$a;->a:Lua/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lua/b$a;->a:Lua/b;

    const/4 v0, 0x0

    iput-object v0, p1, Lua/b;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method

.method public final onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    iget-object p1, p0, Lua/b$a;->a:Lua/b;

    iput-object p2, p1, Lua/b;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method
