.class public final synthetic LC3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LC3/o;

.field public final synthetic p:Ljava/util/concurrent/Callable;

.field public final synthetic q:LC3/p$b;


# direct methods
.method public synthetic constructor <init>(LC3/o;Ljava/util/concurrent/Callable;LC3/p$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC3/k;->o:LC3/o;

    .line 5
    .line 6
    iput-object p2, p0, LC3/k;->p:Ljava/util/concurrent/Callable;

    .line 7
    .line 8
    iput-object p3, p0, LC3/k;->q:LC3/p$b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LC3/k;->o:LC3/o;

    .line 2
    .line 3
    iget-object v1, p0, LC3/k;->p:Ljava/util/concurrent/Callable;

    .line 4
    .line 5
    iget-object v2, p0, LC3/k;->q:LC3/p$b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LC3/o;->g(LC3/o;Ljava/util/concurrent/Callable;LC3/p$b;)Ljava/util/concurrent/Future;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
