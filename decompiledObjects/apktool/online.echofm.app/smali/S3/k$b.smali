.class public LS3/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS3/k$b$a;,
        LS3/k$b$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/Map;

.field public final c:LS3/c$a$a;

.field public d:LS3/j;

.field public e:LS3/j;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;LS3/c$a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS3/k$b;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, LS3/k$b;->b:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, LS3/k$b;->c:LS3/c$a$a;

    .line 9
    .line 10
    return-void
.end method

.method public static b(Ljava/util/List;Ljava/util/Map;LS3/c$a$a;Ljava/util/Comparator;)LS3/k;
    .locals 3

    .line 1
    new-instance v0, LS3/k$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LS3/k$b;-><init>(Ljava/util/List;Ljava/util/Map;LS3/c$a$a;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, LS3/k$b$a;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-direct {p1, p2}, LS3/k$b$a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, LS3/k$b$a;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, LS3/k$b$b;

    .line 37
    .line 38
    iget v1, p2, LS3/k$b$b;->b:I

    .line 39
    .line 40
    sub-int/2addr p0, v1

    .line 41
    iget-boolean v2, p2, LS3/k$b$b;->a:Z

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    sget-object p2, LS3/h$a;->p:LS3/h$a;

    .line 46
    .line 47
    invoke-virtual {v0, p2, v1, p0}, LS3/k$b;->c(LS3/h$a;II)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    sget-object v2, LS3/h$a;->p:LS3/h$a;

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1, p0}, LS3/k$b;->c(LS3/h$a;II)V

    .line 54
    .line 55
    .line 56
    iget p2, p2, LS3/k$b$b;->b:I

    .line 57
    .line 58
    sub-int/2addr p0, p2

    .line 59
    sget-object v1, LS3/h$a;->o:LS3/h$a;

    .line 60
    .line 61
    invoke-virtual {v0, v1, p2, p0}, LS3/k$b;->c(LS3/h$a;II)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance p0, LS3/k;

    .line 66
    .line 67
    iget-object p1, v0, LS3/k$b;->d:LS3/j;

    .line 68
    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    invoke-static {}, LS3/g;->j()LS3/g;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_2
    const/4 p2, 0x0

    .line 76
    invoke-direct {p0, p1, p3, p2}, LS3/k;-><init>(LS3/h;Ljava/util/Comparator;LS3/k$a;)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method


# virtual methods
.method public final a(II)LS3/h;
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {}, LS3/g;->j()LS3/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    if-ne p2, v0, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, LS3/k$b;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p2, LS3/f;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, LS3/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p2, p1, v0, v1, v1}, LS3/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS3/h;LS3/h;)V

    .line 25
    .line 26
    .line 27
    return-object p2

    .line 28
    :cond_1
    div-int/lit8 p2, p2, 0x2

    .line 29
    .line 30
    add-int v0, p1, p2

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, LS3/k$b;->a(II)LS3/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    add-int/lit8 v1, v0, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v1, p2}, LS3/k$b;->a(II)LS3/h;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object v1, p0, LS3/k$b;->a:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, LS3/f;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, LS3/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v1, v0, v2, p1, p2}, LS3/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS3/h;LS3/h;)V

    .line 55
    .line 56
    .line 57
    return-object v1
.end method

.method public final c(LS3/h$a;II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0, p2}, LS3/k$b;->a(II)LS3/h;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object v0, p0, LS3/k$b;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    sget-object v0, LS3/h$a;->o:LS3/h$a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    new-instance p1, LS3/i;

    .line 21
    .line 22
    invoke-virtual {p0, p3}, LS3/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, p3, v0, v1, p2}, LS3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS3/h;LS3/h;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, LS3/f;

    .line 31
    .line 32
    invoke-virtual {p0, p3}, LS3/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, p3, v0, v1, p2}, LS3/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS3/h;LS3/h;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p2, p0, LS3/k$b;->d:LS3/j;

    .line 40
    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    iput-object p1, p0, LS3/k$b;->d:LS3/j;

    .line 44
    .line 45
    :goto_1
    iput-object p1, p0, LS3/k$b;->e:LS3/j;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    iget-object p2, p0, LS3/k$b;->e:LS3/j;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, LS3/j;->u(LS3/h;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :goto_2
    return-void
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LS3/k$b;->b:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, LS3/k$b;->c:LS3/c$a$a;

    .line 4
    .line 5
    invoke-interface {v1, p1}, LS3/c$a$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
