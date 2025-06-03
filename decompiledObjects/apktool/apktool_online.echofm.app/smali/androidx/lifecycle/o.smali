.class public Landroidx/lifecycle/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h;


# static fields
.field public static final w:Landroidx/lifecycle/o;


# instance fields
.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Landroid/os/Handler;

.field public final t:Landroidx/lifecycle/i;

.field public u:Ljava/lang/Runnable;

.field public v:Landroidx/lifecycle/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/o;

    invoke-direct {v0}, Landroidx/lifecycle/o;-><init>()V

    sput-object v0, Landroidx/lifecycle/o;->w:Landroidx/lifecycle/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/o;->o:I

    iput v0, p0, Landroidx/lifecycle/o;->p:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/o;->q:Z

    iput-boolean v0, p0, Landroidx/lifecycle/o;->r:Z

    new-instance v0, Landroidx/lifecycle/i;

    invoke-direct {v0, p0}, Landroidx/lifecycle/i;-><init>(Landroidx/lifecycle/h;)V

    iput-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    new-instance v0, Landroidx/lifecycle/o$a;

    invoke-direct {v0, p0}, Landroidx/lifecycle/o$a;-><init>(Landroidx/lifecycle/o;)V

    iput-object v0, p0, Landroidx/lifecycle/o;->u:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/o$b;

    invoke-direct {v0, p0}, Landroidx/lifecycle/o$b;-><init>(Landroidx/lifecycle/o;)V

    iput-object v0, p0, Landroidx/lifecycle/o;->v:Landroidx/lifecycle/q$a;

    return-void
.end method

.method public static i()Landroidx/lifecycle/h;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/o;->w:Landroidx/lifecycle/o;

    return-object v0
.end method

.method public static l(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/o;->w:Landroidx/lifecycle/o;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->e(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/lifecycle/o;->p:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/o;->p:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/o;->s:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/o;->u:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/o;->p:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/o;->p:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/o;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_RESUME:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i;->h(Landroidx/lifecycle/d$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/o;->q:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/o;->s:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/o;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/o;->o:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/o;->o:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/o;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_START:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i;->h(Landroidx/lifecycle/d$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/o;->r:Z

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/lifecycle/o;->o:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/o;->o:I

    invoke-virtual {p0}, Landroidx/lifecycle/o;->h()V

    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/o;->s:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_CREATE:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i;->h(Landroidx/lifecycle/d$b;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/o$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/o$c;-><init>(Landroidx/lifecycle/o;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/o;->p:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/o;->q:Z

    iget-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_PAUSE:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i;->h(Landroidx/lifecycle/d$b;)V

    :cond_0
    return-void
.end method

.method public g()Landroidx/lifecycle/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    return-object v0
.end method

.method public h()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/o;->o:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/o;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/o;->t:Landroidx/lifecycle/i;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_STOP:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i;->h(Landroidx/lifecycle/d$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/o;->r:Z

    :cond_0
    return-void
.end method
