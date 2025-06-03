.class public final Lpa/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpa/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/flutter/plugin/common/BinaryMessenger;

.field public final c:Lpa/g$c;

.field public final d:Lpa/g$b;

.field public final e:Lio/flutter/view/TextureRegistry;

.field public final f:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Lpa/g$d;Lpa/g$e;Lio/flutter/view/TextureRegistry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpa/g$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lpa/g$a;->b:Lio/flutter/plugin/common/BinaryMessenger;

    iput-object p3, p0, Lpa/g$a;->c:Lpa/g$c;

    iput-object p4, p0, Lpa/g$a;->d:Lpa/g$b;

    iput-object p5, p0, Lpa/g$a;->e:Lio/flutter/view/TextureRegistry;

    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "better_player_channel"

    invoke-direct {p1, p2, p3}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p1, p0, Lpa/g$a;->f:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method
