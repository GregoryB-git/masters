.class public final Lg0/n$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ld0/p$b;

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/n$c;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Ld0/p$b;

    .line 7
    .line 8
    invoke-direct {p1}, Ld0/p$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lg0/n$c;->b:Ld0/p$b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(ILg0/n$a;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg0/n$c;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lg0/n$c;->b:Ld0/p$b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ld0/p$b;->a(I)Ld0/p$b;

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lg0/n$c;->c:Z

    .line 15
    .line 16
    iget-object p1, p0, Lg0/n$c;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {p2, p1}, Lg0/n$a;->invoke(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public b(Lg0/n$b;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg0/n$c;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lg0/n$c;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lg0/n$c;->b:Ld0/p$b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ld0/p$b;->e()Ld0/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ld0/p$b;

    .line 16
    .line 17
    invoke-direct {v1}, Ld0/p$b;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lg0/n$c;->b:Ld0/p$b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p0, Lg0/n$c;->c:Z

    .line 24
    .line 25
    iget-object v1, p0, Lg0/n$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p1, v1, v0}, Lg0/n$b;->a(Ljava/lang/Object;Ld0/p;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public c(Lg0/n$b;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg0/n$c;->d:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lg0/n$c;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lg0/n$c;->c:Z

    .line 10
    .line 11
    iget-object v0, p0, Lg0/n$c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Lg0/n$c;->b:Ld0/p$b;

    .line 14
    .line 15
    invoke-virtual {v1}, Ld0/p$b;->e()Ld0/p;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, Lg0/n$b;->a(Ljava/lang/Object;Ld0/p;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lg0/n$c;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lg0/n$c;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lg0/n$c;

    .line 19
    .line 20
    iget-object p1, p1, Lg0/n$c;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/n$c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
