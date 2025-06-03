.class public final Lz2/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lz2/M;


# direct methods
.method public constructor <init>(Lz2/M;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/J;->o:Lz2/M;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz2/J;->o:Lz2/M;

    .line 2
    .line 3
    invoke-static {v0}, Lz2/M;->a1(Lz2/M;)Lz2/L;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lx2/b;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-direct {v1, v2}, Lx2/b;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lz2/L;->a(Lx2/b;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
