.class public final Lv3/z0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lz4/p;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayList;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lz4/t;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz4/p;

    invoke-direct {v0, p1, p2}, Lz4/p;-><init>(Lz4/t;Z)V

    iput-object v0, p0, Lv3/z0$c;->a:Lz4/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv3/z0$c;->c:Ljava/util/ArrayList;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/z0$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv3/z0$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lv3/r1;
    .locals 1

    iget-object v0, p0, Lv3/z0$c;->a:Lz4/p;

    iget-object v0, v0, Lz4/p;->w:Lz4/p$a;

    return-object v0
.end method
