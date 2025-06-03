.class public final Lz2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA2/c$e;


# instance fields
.field public final synthetic a:Lz2/x;


# direct methods
.method public constructor <init>(Lz2/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/w;->a:Lz2/x;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/w;->a:Lz2/x;

    .line 2
    .line 3
    iget-object v0, v0, Lz2/x;->n:Lz2/e;

    .line 4
    .line 5
    invoke-static {v0}, Lz2/e;->r(Lz2/e;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lz2/v;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lz2/v;-><init>(Lz2/w;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
