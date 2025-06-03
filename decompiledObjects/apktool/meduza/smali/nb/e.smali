.class public final Lnb/e;
.super Lnb/b;
.source "SourceFile"


# static fields
.field public static final o:Lnb/e$b;


# instance fields
.field public final f:Lnb/e$a;

.field public final g:Leb/k0$e;

.field public h:Leb/k0$c;

.field public i:Leb/k0;

.field public j:Leb/k0$c;

.field public k:Leb/k0;

.field public l:Leb/n;

.field public m:Leb/k0$j;

.field public n:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/e$b;

    invoke-direct {v0}, Lnb/e$b;-><init>()V

    sput-object v0, Lnb/e;->o:Lnb/e$b;

    return-void
.end method

.method public constructor <init>(Lnb/c;)V
    .locals 1

    invoke-direct {p0}, Lnb/b;-><init>()V

    new-instance v0, Lnb/e$a;

    invoke-direct {v0, p0}, Lnb/e$a;-><init>(Lnb/e;)V

    iput-object v0, p0, Lnb/e;->f:Lnb/e$a;

    iput-object v0, p0, Lnb/e;->i:Leb/k0;

    iput-object v0, p0, Lnb/e;->k:Leb/k0;

    iput-object p1, p0, Lnb/e;->g:Leb/k0$e;

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 1

    iget-object v0, p0, Lnb/e;->k:Leb/k0;

    invoke-virtual {v0}, Leb/k0;->f()V

    iget-object v0, p0, Lnb/e;->i:Leb/k0;

    invoke-virtual {v0}, Leb/k0;->f()V

    return-void
.end method

.method public final g()Leb/k0;
    .locals 2

    iget-object v0, p0, Lnb/e;->k:Leb/k0;

    iget-object v1, p0, Lnb/e;->f:Lnb/e$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnb/e;->i:Leb/k0;

    :cond_0
    return-object v0
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lnb/e;->g:Leb/k0$e;

    iget-object v1, p0, Lnb/e;->l:Leb/n;

    iget-object v2, p0, Lnb/e;->m:Leb/k0$j;

    invoke-virtual {v0, v1, v2}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    iget-object v0, p0, Lnb/e;->i:Leb/k0;

    invoke-virtual {v0}, Leb/k0;->f()V

    iget-object v0, p0, Lnb/e;->k:Leb/k0;

    iput-object v0, p0, Lnb/e;->i:Leb/k0;

    iget-object v0, p0, Lnb/e;->j:Leb/k0$c;

    iput-object v0, p0, Lnb/e;->h:Leb/k0$c;

    iget-object v0, p0, Lnb/e;->f:Lnb/e$a;

    iput-object v0, p0, Lnb/e;->k:Leb/k0;

    const/4 v0, 0x0

    iput-object v0, p0, Lnb/e;->j:Leb/k0$c;

    return-void
.end method

.method public final i(Leb/l0;)V
    .locals 2

    const-string v0, "newBalancerFactory"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lnb/e;->j:Leb/k0$c;

    invoke-virtual {p1, v0}, Leb/l0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lnb/e;->k:Leb/k0;

    invoke-virtual {v0}, Leb/k0;->f()V

    iget-object v0, p0, Lnb/e;->f:Lnb/e$a;

    iput-object v0, p0, Lnb/e;->k:Leb/k0;

    const/4 v0, 0x0

    iput-object v0, p0, Lnb/e;->j:Leb/k0$c;

    sget-object v0, Leb/n;->a:Leb/n;

    iput-object v0, p0, Lnb/e;->l:Leb/n;

    sget-object v0, Lnb/e;->o:Lnb/e$b;

    iput-object v0, p0, Lnb/e;->m:Leb/k0$j;

    iget-object v0, p0, Lnb/e;->h:Leb/k0$c;

    invoke-virtual {p1, v0}, Leb/l0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Lnb/f;

    invoke-direct {v0, p0}, Lnb/f;-><init>(Lnb/e;)V

    invoke-virtual {p1, v0}, Leb/k0$c;->a(Leb/k0$e;)Leb/k0;

    move-result-object v1

    iput-object v1, v0, Lnb/f;->a:Leb/k0;

    iput-object v1, p0, Lnb/e;->k:Leb/k0;

    iput-object p1, p0, Lnb/e;->j:Leb/k0$c;

    iget-boolean p1, p0, Lnb/e;->n:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lnb/e;->h()V

    :cond_2
    return-void
.end method
