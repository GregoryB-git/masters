.class public final Lb1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/z$a;
    }
.end annotation


# static fields
.field public static final q:Lb1/z;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;

.field public final f:Lb1/p;

.field public final o:Lb/d;

.field public final p:Lb1/z$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/z;

    invoke-direct {v0}, Lb1/z;-><init>()V

    sput-object v0, Lb1/z;->q:Lb1/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb1/z;->c:Z

    iput-boolean v0, p0, Lb1/z;->d:Z

    new-instance v0, Lb1/p;

    invoke-direct {v0, p0}, Lb1/p;-><init>(Lb1/o;)V

    iput-object v0, p0, Lb1/z;->f:Lb1/p;

    new-instance v0, Lb/d;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lb/d;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lb1/z;->o:Lb/d;

    new-instance v0, Lb1/z$b;

    invoke-direct {v0, p0}, Lb1/z$b;-><init>(Lb1/z;)V

    iput-object v0, p0, Lb1/z;->p:Lb1/z$b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Lb1/z;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lb1/z;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lb1/z;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/z;->f:Lb1/p;

    sget-object v1, Lb1/k$a;->ON_RESUME:Lb1/k$a;

    invoke-virtual {v0, v1}, Lb1/p;->f(Lb1/k$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb1/z;->c:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb1/z;->e:Landroid/os/Handler;

    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lb1/z;->o:Lb/d;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final getLifecycle()Lb1/k;
    .locals 1

    iget-object v0, p0, Lb1/z;->f:Lb1/p;

    return-object v0
.end method
