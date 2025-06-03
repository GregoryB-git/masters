.class public Lk0/W0$a;
.super Lx0/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/W0;->E(Lx0/T;)Lk0/W0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final f:Ld0/I$c;

.field public final synthetic g:Lk0/W0;


# direct methods
.method public constructor <init>(Lk0/W0;Ld0/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/W0$a;->g:Lk0/W0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lx0/p;-><init>(Ld0/I;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ld0/I$c;

    .line 7
    .line 8
    invoke-direct {p1}, Ld0/I$c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lk0/W0$a;->f:Ld0/I$c;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public g(ILd0/I$b;Z)Ld0/I$b;
    .locals 10

    .line 1
    invoke-super {p0, p1, p2, p3}, Lx0/p;->g(ILd0/I$b;Z)Ld0/I$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p3, p1, Ld0/I$b;->c:I

    .line 6
    .line 7
    iget-object v0, p0, Lk0/W0$a;->f:Ld0/I$c;

    .line 8
    .line 9
    invoke-super {p0, p3, v0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3}, Ld0/I$c;->f()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    iget-object v1, p2, Ld0/I$b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, p2, Ld0/I$b;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget v3, p2, Ld0/I$b;->c:I

    .line 24
    .line 25
    iget-wide v4, p2, Ld0/I$b;->d:J

    .line 26
    .line 27
    iget-wide v6, p2, Ld0/I$b;->e:J

    .line 28
    .line 29
    sget-object v8, Ld0/a;->g:Ld0/a;

    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    move-object v0, p1

    .line 33
    invoke-virtual/range {v0 .. v9}, Ld0/I$b;->t(Ljava/lang/Object;Ljava/lang/Object;IJJLd0/a;Z)Ld0/I$b;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p2, 0x1

    .line 38
    iput-boolean p2, p1, Ld0/I$b;->f:Z

    .line 39
    .line 40
    :goto_0
    return-object p1
.end method
