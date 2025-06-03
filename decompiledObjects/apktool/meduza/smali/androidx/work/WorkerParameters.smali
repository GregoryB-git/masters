.class public final Landroidx/work/WorkerParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/WorkerParameters$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/UUID;

.field public b:Landroidx/work/c;

.field public c:Ljava/util/concurrent/Executor;

.field public d:La3/b;

.field public e:Lo2/s;

.field public f:Lo2/e;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Landroidx/work/c;Ljava/util/List;Ljava/util/concurrent/ExecutorService;La3/b;Lo2/r;Ly2/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    iput-object p2, p0, Landroidx/work/WorkerParameters;->b:Landroidx/work/c;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p4, p0, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Landroidx/work/WorkerParameters;->d:La3/b;

    iput-object p6, p0, Landroidx/work/WorkerParameters;->e:Lo2/s;

    iput-object p7, p0, Landroidx/work/WorkerParameters;->f:Lo2/e;

    return-void
.end method
