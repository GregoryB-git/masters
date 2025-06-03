.class public final Lk0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/s$a;
    }
.end annotation


# instance fields
.field public final o:Lk0/e1;

.field public final p:Lk0/s$a;

.field public q:Lk0/Y0;

.field public r:Lk0/A0;

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lk0/s$a;Lg0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/s;->p:Lk0/s$a;

    .line 5
    .line 6
    new-instance p1, Lk0/e1;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lk0/e1;-><init>(Lg0/c;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lk0/s;->o:Lk0/e1;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lk0/s;->s:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public H()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk0/s;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk0/e1;->H()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lk0/s;->r:Lk0/A0;

    .line 13
    .line 14
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lk0/A0;

    .line 19
    .line 20
    invoke-interface {v0}, Lk0/A0;->H()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    :goto_0
    return-wide v0
.end method

.method public a(Lk0/Y0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/s;->q:Lk0/Y0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lk0/s;->r:Lk0/A0;

    .line 7
    .line 8
    iput-object p1, p0, Lk0/s;->q:Lk0/Y0;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lk0/s;->s:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public b(Lk0/Y0;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lk0/Y0;->B()Lk0/A0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lk0/s;->r:Lk0/A0;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p0, Lk0/s;->r:Lk0/A0;

    .line 14
    .line 15
    iput-object p1, p0, Lk0/s;->q:Lk0/Y0;

    .line 16
    .line 17
    iget-object p1, p0, Lk0/s;->o:Lk0/e1;

    .line 18
    .line 19
    invoke-virtual {p1}, Lk0/e1;->h()Ld0/C;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Lk0/A0;->k(Ld0/C;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "Multiple renderer media clocks enabled."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x3e8

    .line 35
    .line 36
    invoke-static {p1, v0}, Lk0/u;->d(Ljava/lang/RuntimeException;I)Lk0/u;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    throw p1

    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public c(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk0/e1;->a(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/s;->q:Lk0/Y0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Lk0/Y0;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lk0/s;->q:Lk0/Y0;

    .line 14
    .line 15
    invoke-interface {v0}, Lk0/Y0;->getState()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lk0/s;->q:Lk0/Y0;

    .line 23
    .line 24
    invoke-interface {v0}, Lk0/Y0;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Lk0/s;->q:Lk0/Y0;

    .line 33
    .line 34
    invoke-interface {p1}, Lk0/Y0;->p()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 44
    :goto_1
    return p1
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk0/s;->t:Z

    .line 3
    .line 4
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lk0/e1;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lk0/s;->t:Z

    .line 3
    .line 4
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lk0/e1;->c()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g(Z)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lk0/s;->i(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk0/s;->H()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
.end method

.method public h()Ld0/C;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/s;->r:Lk0/A0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lk0/A0;->h()Ld0/C;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 11
    .line 12
    invoke-virtual {v0}, Lk0/e1;->h()Ld0/C;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    return-object v0
.end method

.method public final i(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lk0/s;->d(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lk0/s;->s:Z

    .line 9
    .line 10
    iget-boolean p1, p0, Lk0/s;->t:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lk0/s;->o:Lk0/e1;

    .line 15
    .line 16
    invoke-virtual {p1}, Lk0/e1;->b()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    iget-object p1, p0, Lk0/s;->r:Lk0/A0;

    .line 21
    .line 22
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lk0/A0;

    .line 27
    .line 28
    invoke-interface {p1}, Lk0/A0;->H()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iget-boolean v2, p0, Lk0/s;->s:Z

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-object v2, p0, Lk0/s;->o:Lk0/e1;

    .line 37
    .line 38
    invoke-virtual {v2}, Lk0/e1;->H()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v2, v0, v2

    .line 43
    .line 44
    if-gez v2, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Lk0/s;->o:Lk0/e1;

    .line 47
    .line 48
    invoke-virtual {p1}, Lk0/e1;->c()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    const/4 v2, 0x0

    .line 53
    iput-boolean v2, p0, Lk0/s;->s:Z

    .line 54
    .line 55
    iget-boolean v2, p0, Lk0/s;->t:Z

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, Lk0/s;->o:Lk0/e1;

    .line 60
    .line 61
    invoke-virtual {v2}, Lk0/e1;->b()V

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-object v2, p0, Lk0/s;->o:Lk0/e1;

    .line 65
    .line 66
    invoke-virtual {v2, v0, v1}, Lk0/e1;->a(J)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Lk0/A0;->h()Ld0/C;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 74
    .line 75
    invoke-virtual {v0}, Lk0/e1;->h()Ld0/C;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v0}, Ld0/C;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lk0/e1;->k(Ld0/C;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lk0/s;->p:Lk0/s$a;

    .line 91
    .line 92
    invoke-interface {v0, p1}, Lk0/s$a;->j(Ld0/C;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-void
.end method

.method public k(Ld0/C;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/s;->r:Lk0/A0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lk0/A0;->k(Ld0/C;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lk0/s;->r:Lk0/A0;

    .line 9
    .line 10
    invoke-interface {p1}, Lk0/A0;->h()Ld0/C;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lk0/e1;->k(Ld0/C;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/s;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk0/s;->o:Lk0/e1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk0/e1;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lk0/s;->r:Lk0/A0;

    .line 13
    .line 14
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lk0/A0;

    .line 19
    .line 20
    invoke-interface {v0}, Lk0/A0;->r()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    return v0
.end method
