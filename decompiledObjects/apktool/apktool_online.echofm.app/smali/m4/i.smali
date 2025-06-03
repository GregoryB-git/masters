.class public Lm4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/g;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lj4/c;

.field public final d:Lm4/f;


# direct methods
.method public constructor <init>(Lm4/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm4/i;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lm4/i;->b:Z

    .line 8
    .line 9
    iput-object p1, p0, Lm4/i;->d:Lm4/f;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm4/i;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lm4/i;->a:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lj4/b;

    .line 10
    .line 11
    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lj4/b;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public b(Lj4/c;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm4/i;->a:Z

    .line 3
    .line 4
    iput-object p1, p0, Lm4/i;->c:Lj4/c;

    .line 5
    .line 6
    iput-boolean p2, p0, Lm4/i;->b:Z

    .line 7
    .line 8
    return-void
.end method

.method public d(Ljava/lang/String;)Lj4/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm4/i;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm4/i;->d:Lm4/f;

    .line 5
    .line 6
    iget-object v1, p0, Lm4/i;->c:Lj4/c;

    .line 7
    .line 8
    iget-boolean v2, p0, Lm4/i;->b:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, v2}, Lm4/f;->i(Lj4/c;Ljava/lang/Object;Z)Lj4/e;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public e(Z)Lj4/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm4/i;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm4/i;->d:Lm4/f;

    .line 5
    .line 6
    iget-object v1, p0, Lm4/i;->c:Lj4/c;

    .line 7
    .line 8
    iget-boolean v2, p0, Lm4/i;->b:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, v2}, Lm4/f;->o(Lj4/c;ZZ)Lm4/f;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
