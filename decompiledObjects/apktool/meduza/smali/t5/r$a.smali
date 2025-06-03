.class public final Lt5/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lt5/k$a;

.field public c:Lt5/l0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lt5/s$a;

    invoke-direct {v0}, Lt5/s$a;-><init>()V

    invoke-direct {p0, p1, v0}, Lt5/r$a;-><init>(Landroid/content/Context;Lt5/k$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt5/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lt5/r$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lt5/r$a;->b:Lt5/k$a;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Lt5/k;
    .locals 1

    invoke-virtual {p0}, Lt5/r$a;->b()Lt5/r;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lt5/r;
    .locals 3

    new-instance v0, Lt5/r;

    iget-object v1, p0, Lt5/r$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lt5/r$a;->b:Lt5/k$a;

    invoke-interface {v2}, Lt5/k$a;->a()Lt5/k;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lt5/r;-><init>(Landroid/content/Context;Lt5/k;)V

    iget-object v1, p0, Lt5/r$a;->c:Lt5/l0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lt5/r;->f(Lt5/l0;)V

    :cond_0
    return-object v0
.end method
