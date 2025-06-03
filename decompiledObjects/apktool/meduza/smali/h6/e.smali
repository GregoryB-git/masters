.class public final Lh6/e;
.super Le1/a;
.source "SourceFile"


# instance fields
.field public final j:Ljava/util/concurrent/Semaphore;

.field public final k:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 1

    invoke-direct {p0, p1}, Le1/a;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lh6/e;->j:Ljava/util/concurrent/Semaphore;

    iput-object p2, p0, Lh6/e;->k:Ljava/util/Set;

    return-void
.end method
