.class public final Lgb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/i2$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/g$d;
    }
.end annotation


# instance fields
.field public final a:Lgb/g$d;

.field public final b:Lgb/i2$a;

.field public final c:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Lgb/k3;Lgb/y0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lgb/g;->c:Ljava/util/ArrayDeque;

    iput-object p1, p0, Lgb/g;->b:Lgb/i2$a;

    iput-object p2, p0, Lgb/g;->a:Lgb/g$d;

    return-void
.end method


# virtual methods
.method public final a(Lgb/n3$a;)V
    .locals 2

    :goto_0
    invoke-interface {p1}, Lgb/n3$a;->next()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgb/g;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 2

    iget-object v0, p0, Lgb/g;->a:Lgb/g$d;

    new-instance v1, Lgb/g$b;

    invoke-direct {v1, p0, p1}, Lgb/g$b;-><init>(Lgb/g;Z)V

    invoke-interface {v0, v1}, Lgb/g$d;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(I)V
    .locals 2

    iget-object v0, p0, Lgb/g;->a:Lgb/g$d;

    new-instance v1, Lgb/g$a;

    invoke-direct {v1, p0, p1}, Lgb/g$a;-><init>(Lgb/g;I)V

    invoke-interface {v0, v1}, Lgb/g$d;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lgb/g;->a:Lgb/g$d;

    new-instance v1, Lgb/g$c;

    invoke-direct {v1, p0, p1}, Lgb/g$c;-><init>(Lgb/g;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lgb/g$d;->f(Ljava/lang/Runnable;)V

    return-void
.end method
