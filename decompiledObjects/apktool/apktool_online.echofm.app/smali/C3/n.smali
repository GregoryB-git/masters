.class public final synthetic LC3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/concurrent/Callable;

.field public final synthetic p:LC3/p$b;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;LC3/p$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC3/n;->o:Ljava/util/concurrent/Callable;

    .line 5
    .line 6
    iput-object p2, p0, LC3/n;->p:LC3/p$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LC3/n;->o:Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    iget-object v1, p0, LC3/n;->p:LC3/p$b;

    .line 4
    .line 5
    invoke-static {v0, v1}, LC3/o;->d(Ljava/util/concurrent/Callable;LC3/p$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
