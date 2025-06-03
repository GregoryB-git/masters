.class public final Lm0/b0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/z$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lm0/b0;


# direct methods
.method public constructor <init>(Lm0/b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/b0$c;->a:Lm0/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm0/b0;Lm0/b0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lm0/b0$c;-><init>(Lm0/b0;)V

    return-void
.end method


# virtual methods
.method public a(Lm0/z$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->R1(Lm0/b0;)Lm0/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lm0/x$a;->o(Lm0/z$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->R1(Lm0/b0;)Lm0/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lm0/x$a;->H(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->R1(Lm0/b0;)Lm0/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lm0/x$a;->I(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 9
    .line 10
    invoke-static {v0}, Lm0/b0;->R1(Lm0/b0;)Lm0/x$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lm0/x$a;->n(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public e(Lm0/z$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->R1(Lm0/b0;)Lm0/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lm0/x$a;->p(Lm0/z$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->U1(Lm0/b0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lm0/b0;->Q1(Lm0/b0;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm0/b0;->d2()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->T1(Lm0/b0;)Lk0/Y0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lk0/Y0$a;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->S1(Lm0/b0;)Lk0/Y0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lk0/Y0$a;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public k(IJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lm0/b0$c;->a:Lm0/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/b0;->R1(Lm0/b0;)Lm0/x$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move v2, p1

    .line 8
    move-wide v3, p2

    .line 9
    move-wide v5, p4

    .line 10
    invoke-virtual/range {v1 .. v6}, Lm0/x$a;->J(IJJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
