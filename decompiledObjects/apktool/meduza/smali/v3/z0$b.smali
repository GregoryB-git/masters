.class public final Lv3/z0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lz4/t;

.field public final b:Lz4/t$c;

.field public final c:Lv3/z0$a;


# direct methods
.method public constructor <init>(Lz4/p;Lv3/u0;Lv3/z0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/z0$b;->a:Lz4/t;

    iput-object p2, p0, Lv3/z0$b;->b:Lz4/t$c;

    iput-object p3, p0, Lv3/z0$b;->c:Lv3/z0$a;

    return-void
.end method
