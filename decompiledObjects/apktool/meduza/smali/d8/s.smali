.class public final Ld8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;
.implements Lt9/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt9/b<",
        "TT;>;",
        "Lt9/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Le0/d;

.field public static final d:Ld8/r;


# instance fields
.field public a:Lt9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/d;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    sput-object v0, Ld8/s;->c:Le0/d;

    new-instance v0, Ld8/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld8/r;-><init>(I)V

    sput-object v0, Ld8/s;->d:Ld8/r;

    return-void
.end method

.method public constructor <init>(Le0/d;Lt9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/s;->a:Lt9/a$a;

    iput-object p2, p0, Ld8/s;->b:Lt9/b;

    return-void
.end method


# virtual methods
.method public final a(Lt9/a$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/a$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ld8/s;->b:Lt9/b;

    sget-object v1, Ld8/s;->d:Ld8/r;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, Lt9/a$a;->h(Lt9/b;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Ld8/s;->b:Lt9/b;

    if-eq v2, v1, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ld8/s;->a:Lt9/a$a;

    new-instance v3, Lo9/l;

    const/4 v4, 0x6

    invoke-direct {v3, v4, v1, p1}, Lo9/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, p0, Ld8/s;->a:Lt9/a$a;

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Lt9/a$a;->h(Lt9/b;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Ld8/s;->b:Lt9/b;

    invoke-interface {v0}, Lt9/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
