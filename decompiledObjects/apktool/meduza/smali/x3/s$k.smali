.class public final Lx3/s$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "k"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lx3/s$k$a;

.field public final synthetic c:Lx3/s;


# direct methods
.method public constructor <init>(Lx3/s;)V
    .locals 1

    iput-object p1, p0, Lx3/s$k;->c:Lx3/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lx3/s$k;->a:Landroid/os/Handler;

    new-instance p1, Lx3/s$k$a;

    invoke-direct {p1, p0}, Lx3/s$k$a;-><init>(Lx3/s$k;)V

    iput-object p1, p0, Lx3/s$k;->b:Lx3/s$k$a;

    return-void
.end method
