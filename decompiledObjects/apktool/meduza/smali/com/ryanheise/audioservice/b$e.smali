.class public final Lcom/ryanheise/audioservice/b$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Object;

.field public final c:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ryanheise/audioservice/b$e;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ryanheise/audioservice/b$e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/ryanheise/audioservice/b$e;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method
