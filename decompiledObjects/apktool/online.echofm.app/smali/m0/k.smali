.class public final Lm0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/k$b;
    }
.end annotation


# static fields
.field public static final d:Lm0/k;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm0/k$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lm0/k$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lm0/k$b;->d()Lm0/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lm0/k;->d:Lm0/k;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lm0/k$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm0/k$b;->a(Lm0/k$b;)Z

    move-result v0

    iput-boolean v0, p0, Lm0/k;->a:Z

    invoke-static {p1}, Lm0/k$b;->b(Lm0/k$b;)Z

    move-result v0

    iput-boolean v0, p0, Lm0/k;->b:Z

    invoke-static {p1}, Lm0/k$b;->c(Lm0/k$b;)Z

    move-result p1

    iput-boolean p1, p0, Lm0/k;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lm0/k$b;Lm0/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lm0/k;-><init>(Lm0/k$b;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lm0/k;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Lm0/k;

    .line 18
    .line 19
    iget-boolean v2, p0, Lm0/k;->a:Z

    .line 20
    .line 21
    iget-boolean v3, p1, Lm0/k;->a:Z

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-boolean v2, p0, Lm0/k;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p1, Lm0/k;->b:Z

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget-boolean v2, p0, Lm0/k;->c:Z

    .line 32
    .line 33
    iget-boolean p1, p1, Lm0/k;->c:Z

    .line 34
    .line 35
    if-ne v2, p1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v0, v1

    .line 39
    :goto_0
    return v0

    .line 40
    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/k;->a:Z

    .line 2
    .line 3
    shl-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget-boolean v1, p0, Lm0/k;->b:Z

    .line 6
    .line 7
    shl-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget-boolean v1, p0, Lm0/k;->c:Z

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method
