.class public Li5/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:LE5/k$d;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(LE5/k$d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Li5/e$a;->b:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p1, p0, Li5/e$a;->a:LE5/k$d;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic d(Li5/e$a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li5/e$a;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Li5/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Li5/e$a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li5/e$a;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Li5/c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Li5/c;-><init>(Li5/e$a;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li5/e$a;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Li5/d;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2, p3}, Li5/d;-><init>(Li5/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Li5/e$a;->b:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Li5/e$a;->a:LE5/k$d;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance v2, Li5/b;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Li5/b;-><init>(LE5/k$d;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final synthetic f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li5/e$a;->a:LE5/k$d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li5/e$a;->a:LE5/k$d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
