.class public final Ln3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/c$b;,
        Ln3/c$c;
    }
.end annotation


# instance fields
.field public final a:Ln3/a;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ln3/a;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/c;->a:Ln3/a;

    iput-object p2, p0, Ln3/c;->b:Ljava/util/List;

    iput-object p3, p0, Ln3/c;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ln3/a;Ljava/util/List;Ljava/lang/Integer;Ln3/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Ln3/c;-><init>(Ln3/a;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Ln3/c$b;
    .locals 1

    .line 1
    new-instance v0, Ln3/c$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ln3/c$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ln3/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Ln3/c;

    .line 8
    .line 9
    iget-object v0, p0, Ln3/c;->a:Ln3/a;

    .line 10
    .line 11
    iget-object v2, p1, Ln3/c;->a:Ln3/a;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ln3/a;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ln3/c;->b:Ljava/util/List;

    .line 20
    .line 21
    iget-object v2, p1, Ln3/c;->b:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Ln3/c;->c:Ljava/lang/Integer;

    .line 30
    .line 31
    iget-object p1, p1, Ln3/c;->c:Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ln3/c;->a:Ln3/a;

    .line 2
    .line 3
    iget-object v1, p0, Ln3/c;->b:Ljava/util/List;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v0, v2, v3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput-object v1, v2, v0

    .line 13
    .line 14
    invoke-static {v2}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ln3/c;->a:Ln3/a;

    .line 2
    .line 3
    iget-object v1, p0, Ln3/c;->b:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Ln3/c;->c:Ljava/lang/Integer;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    new-array v3, v3, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aput-object v0, v3, v4

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object v1, v3, v0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    aput-object v2, v3, v0

    .line 18
    .line 19
    const-string v0, "(annotations=%s, entries=%s, primaryKeyId=%s)"

    .line 20
    .line 21
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
