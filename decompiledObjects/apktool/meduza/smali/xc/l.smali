.class public final Lxc/l;
.super Lxc/z;
.source "SourceFile"


# instance fields
.field public e:Lxc/z;


# direct methods
.method public constructor <init>(Lxc/z;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lxc/z;-><init>()V

    iput-object p1, p0, Lxc/l;->e:Lxc/z;

    return-void
.end method


# virtual methods
.method public final a()Lxc/z;
    .locals 1

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0}, Lxc/z;->a()Lxc/z;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lxc/z;
    .locals 1

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0}, Lxc/z;->b()Lxc/z;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0}, Lxc/z;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lxc/z;
    .locals 1

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0, p1, p2}, Lxc/z;->d(J)Lxc/z;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0}, Lxc/z;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0}, Lxc/z;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lxc/z;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    invoke-virtual {v0, p1, p2, p3}, Lxc/z;->g(JLjava/util/concurrent/TimeUnit;)Lxc/z;

    move-result-object p1

    return-object p1
.end method
