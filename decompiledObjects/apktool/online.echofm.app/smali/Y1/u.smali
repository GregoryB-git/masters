.class public LY1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY1/u$d;,
        LY1/u$a;,
        LY1/u$e;,
        LY1/u$f;,
        LY1/u$c;
    }
.end annotation


# static fields
.field public static final A:LY1/u$c;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LY1/u;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public o:[LY1/A;

.field public p:I

.field public q:Landroidx/fragment/app/Fragment;

.field public r:LY1/u$d;

.field public s:LY1/u$a;

.field public t:Z

.field public u:LY1/u$e;

.field public v:Ljava/util/Map;

.field public w:Ljava/util/Map;

.field public x:LY1/y;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY1/u$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY1/u$c;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY1/u;->A:LY1/u$c;

    .line 8
    .line 9
    new-instance v0, LY1/u$b;

    .line 10
    .line 11
    invoke-direct {v0}, LY1/u$b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LY1/u;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 8

    .line 1
    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LY1/u;->p:I

    const-class v0, LY1/A;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Landroid/os/Parcelable;

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v0

    move v4, v1

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_4

    aget-object v6, v0, v4

    instance-of v7, v6, LY1/A;

    if-eqz v7, :cond_1

    move-object v5, v6

    check-cast v5, LY1/A;

    :cond_1
    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v5, p0}, LY1/A;->m(LY1/u;)V

    :goto_1
    if-eqz v5, :cond_3

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    new-array v0, v1, [LY1/A;

    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, [LY1/A;

    iput-object v0, p0, LY1/u;->o:[LY1/A;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LY1/u;->p:I

    const-class v0, LY1/u$e;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, LY1/u$e;

    iput-object v0, p0, LY1/u;->u:LY1/u$e;

    invoke-static {p1}, LO1/P;->r0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v0, v5

    goto :goto_2

    :cond_5
    invoke-static {v0}, LW5/C;->o(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_2
    iput-object v0, p0, LY1/u;->v:Ljava/util/Map;

    invoke-static {p1}, LO1/P;->r0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {p1}, LW5/C;->o(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    :goto_3
    iput-object v5, p0, LY1/u;->w:Ljava/util/Map;

    return-void

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 2
    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LY1/u;->p:I

    invoke-virtual {p0, p1}, LY1/u;->x(Landroidx/fragment/app/Fragment;)V

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 8

    .line 1
    invoke-virtual {p0}, LY1/u;->j()LY1/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {v0}, LY1/A;->i()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, LY1/u;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    const-string v0, "no_internet_permission"

    .line 22
    .line 23
    const-string v2, "1"

    .line 24
    .line 25
    invoke-virtual {p0, v0, v2, v1}, LY1/u;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    iget-object v2, p0, LY1/u;->u:LY1/u$e;

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    invoke-virtual {v0, v2}, LY1/A;->o(LY1/u$e;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iput v1, p0, LY1/u;->y:I

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-virtual {p0}, LY1/u;->n()LY1/y;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v2}, LY1/u$e;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    if-lez v3, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0}, LY1/A;->f()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v2}, LY1/u$e;->q()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    const-string v2, "foa_mobile_login_method_start"

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const-string v2, "fb_mobile_login_method_start"

    .line 65
    .line 66
    :goto_0
    invoke-virtual {v5, v6, v0, v2}, LY1/y;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput v3, p0, LY1/u;->z:I

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    invoke-virtual {v0}, LY1/A;->f()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v2}, LY1/u$e;->q()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    const-string v2, "foa_mobile_login_method_not_tried"

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const-string v2, "fb_mobile_login_method_not_tried"

    .line 86
    .line 87
    :goto_1
    invoke-virtual {v5, v6, v7, v2}, LY1/y;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v2, "not_tried"

    .line 91
    .line 92
    invoke-virtual {v0}, LY1/A;->f()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p0, v2, v0, v4}, LY1/u;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    :goto_2
    if-lez v3, :cond_6

    .line 100
    .line 101
    move v1, v4

    .line 102
    :cond_6
    return v1
.end method

.method public final B()V
    .locals 7

    .line 1
    invoke-virtual {p0}, LY1/u;->j()LY1/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LY1/A;->f()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-virtual {v0}, LY1/A;->e()Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    const-string v3, "skipped"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v1, p0

    .line 20
    invoke-virtual/range {v1 .. v6}, LY1/u;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LY1/u;->o:[LY1/A;

    .line 24
    .line 25
    :cond_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget v1, p0, LY1/u;->p:I

    .line 28
    .line 29
    array-length v2, v0

    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    if-ge v1, v2, :cond_2

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    iput v1, p0, LY1/u;->p:I

    .line 37
    .line 38
    invoke-virtual {p0}, LY1/u;->A()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, LY1/u;->h()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method

.method public final C(LY1/u$f;)V
    .locals 7

    .line 1
    const-string v0, "pendingResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LY1/u$f;->p:Lx1/a;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lx1/a;->z:Lx1/a$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/a$c;->e()Lx1/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p1, LY1/u$f;->p:Lx1/a;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Lx1/a;->m()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1}, Lx1/a;->m()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object v0, LY1/u$f;->w:LY1/u$f$c;

    .line 35
    .line 36
    iget-object v1, p0, LY1/u;->u:LY1/u$e;

    .line 37
    .line 38
    iget-object v2, p1, LY1/u$f;->p:Lx1/a;

    .line 39
    .line 40
    iget-object p1, p1, LY1/u$f;->q:Lx1/i;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, p1}, LY1/u$f$c;->b(LY1/u$e;Lx1/a;Lx1/i;)LY1/u$f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    sget-object v0, LY1/u$f;->w:LY1/u$f$c;

    .line 50
    .line 51
    iget-object v1, p0, LY1/u;->u:LY1/u$e;

    .line 52
    .line 53
    const-string v2, "User logged in as different Facebook user."

    .line 54
    .line 55
    const/16 v5, 0x8

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-static/range {v0 .. v6}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    invoke-virtual {p0, p1}, LY1/u;->f(LY1/u$f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_1
    sget-object v0, LY1/u$f;->w:LY1/u$f$c;

    .line 69
    .line 70
    iget-object v1, p0, LY1/u;->u:LY1/u$e;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/16 v5, 0x8

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    const-string v2, "Caught exception"

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v0 .. v6}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, LY1/u;->f(LY1/u$f;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    return-void

    .line 90
    :cond_1
    new-instance p1, Lx1/o;

    .line 91
    .line 92
    const-string v0, "Can\'t validate without a token"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LY1/u;->v:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v1, p0, LY1/u;->v:Ljava/util/Map;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iput-object v0, p0, LY1/u;->v:Ljava/util/Map;

    .line 15
    .line 16
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    if-eqz p3, :cond_2

    .line 23
    .line 24
    new-instance p3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x2c

    .line 37
    .line 38
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_2
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final b(LY1/u$e;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    sget-object v0, Lx1/a;->z:Lx1/a$c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lx1/a$c;->g()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, LY1/u;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iput-object p1, p0, LY1/u;->u:LY1/u$e;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, LY1/u;->l(LY1/u$e;)[LY1/A;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LY1/u;->o:[LY1/A;

    .line 30
    .line 31
    invoke-virtual {p0}, LY1/u;->B()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    new-instance p1, Lx1/o;

    .line 36
    .line 37
    const-string v0, "Attempted to authorize while a request is pending."

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY1/u;->j()LY1/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, LY1/A;->b()V

    .line 9
    .line 10
    .line 11
    :goto_0
    return-void
.end method

.method public final d()Z
    .locals 10

    .line 1
    iget-boolean v0, p0, LY1/u;->t:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const-string v0, "android.permission.INTERNET"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LY1/u;->e(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, LY1/u;->i()Landroidx/fragment/app/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move-object v5, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sget v2, LM1/d;->c:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v5, v2

    .line 31
    :goto_0
    if-nez v0, :cond_2

    .line 32
    .line 33
    :goto_1
    move-object v6, v1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    sget v1, LM1/d;->b:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :goto_2
    sget-object v3, LY1/u$f;->w:LY1/u$f$c;

    .line 43
    .line 44
    iget-object v4, p0, LY1/u;->u:LY1/u$e;

    .line 45
    .line 46
    const/16 v8, 0x8

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-static/range {v3 .. v9}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, LY1/u;->f(LY1/u$f;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    return v0

    .line 59
    :cond_3
    iput-boolean v1, p0, LY1/u;->t:Z

    .line 60
    .line 61
    return v1
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final e(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "permission"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LY1/u;->i()Landroidx/fragment/app/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    return p1
.end method

.method public final f(LY1/u$f;)V
    .locals 2

    .line 1
    const-string v0, "outcome"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LY1/u;->j()LY1/A;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LY1/A;->f()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, LY1/A;->e()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v1, p1, v0}, LY1/u;->p(Ljava/lang/String;LY1/u$f;Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LY1/u;->v:Ljava/util/Map;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iput-object v0, p1, LY1/u$f;->u:Ljava/util/Map;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, LY1/u;->w:Ljava/util/Map;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iput-object v0, p1, LY1/u$f;->v:Ljava/util/Map;

    .line 34
    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, LY1/u;->o:[LY1/A;

    .line 37
    .line 38
    const/4 v1, -0x1

    .line 39
    iput v1, p0, LY1/u;->p:I

    .line 40
    .line 41
    iput-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 42
    .line 43
    iput-object v0, p0, LY1/u;->v:Ljava/util/Map;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput v0, p0, LY1/u;->y:I

    .line 47
    .line 48
    iput v0, p0, LY1/u;->z:I

    .line 49
    .line 50
    invoke-virtual {p0, p1}, LY1/u;->u(LY1/u$f;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final g(LY1/u$f;)V
    .locals 1

    .line 1
    const-string v0, "outcome"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LY1/u$f;->p:Lx1/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lx1/a;->z:Lx1/a$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/a$c;->g()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, LY1/u;->C(LY1/u$f;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, LY1/u;->f(LY1/u$f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    sget-object v0, LY1/u$f;->w:LY1/u$f$c;

    .line 2
    .line 3
    iget-object v1, p0, LY1/u;->u:LY1/u$e;

    .line 4
    .line 5
    const/16 v5, 0x8

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const-string v2, "Login attempt failed."

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static/range {v0 .. v6}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, LY1/u;->f(LY1/u$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final i()Landroidx/fragment/app/e;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->q:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()Landroidx/fragment/app/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    return-object v0
.end method

.method public final j()LY1/A;
    .locals 3

    .line 1
    iget v0, p0, LY1/u;->p:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ltz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, LY1/u;->o:[LY1/A;

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget-object v1, v2, v0

    .line 12
    .line 13
    :cond_1
    :goto_0
    return-object v1
.end method

.method public final k()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->q:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(LY1/u$e;)[LY1/A;
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LY1/u$e;->j()LY1/t;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, LY1/u$e;->r()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sget-boolean v2, Lx1/B;->s:Z

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {v1}, LY1/t;->l()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    new-instance v2, LY1/r;

    .line 32
    .line 33
    invoke-direct {v2, p0}, LY1/r;-><init>(LY1/u;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v1}, LY1/t;->j()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    new-instance v2, LY1/q;

    .line 47
    .line 48
    invoke-direct {v2, p0}, LY1/q;-><init>(LY1/u;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-boolean v2, Lx1/B;->s:Z

    .line 55
    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v1}, LY1/t;->m()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    new-instance v2, LY1/s;

    .line 65
    .line 66
    invoke-direct {v2, p0}, LY1/s;-><init>(LY1/u;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    :goto_1
    invoke-virtual {v1}, LY1/t;->e()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    new-instance v2, LY1/c;

    .line 77
    .line 78
    invoke-direct {v2, p0}, LY1/c;-><init>(LY1/u;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {v1}, LY1/t;->n()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    new-instance v2, LY1/G;

    .line 91
    .line 92
    invoke-direct {v2, p0}, LY1/G;-><init>(LY1/u;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {p1}, LY1/u$e;->r()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {v1}, LY1/t;->h()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    new-instance p1, LY1/n;

    .line 111
    .line 112
    invoke-direct {p1, p0}, LY1/n;-><init>(LY1/u;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_5
    const/4 p1, 0x0

    .line 119
    new-array p1, p1, [LY1/A;

    .line 120
    .line 121
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_6

    .line 126
    .line 127
    check-cast p1, [LY1/A;

    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 131
    .line 132
    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 133
    .line 134
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LY1/u;->p:I

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
.end method

.method public final n()LY1/y;
    .locals 3

    .line 1
    iget-object v0, p0, LY1/u;->x:LY1/y;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, LY1/y;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LY1/u;->u:LY1/u$e;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v2}, LY1/u$e;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_4

    .line 24
    .line 25
    :cond_1
    new-instance v0, LY1/y;

    .line 26
    .line 27
    invoke-virtual {p0}, LY1/u;->i()Landroidx/fragment/app/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_2
    iget-object v2, p0, LY1/u;->u:LY1/u$e;

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    invoke-virtual {v2}, LY1/u$e;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_1
    invoke-direct {v0, v1, v2}, LY1/y;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, LY1/u;->x:LY1/y;

    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final o()LY1/u$e;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Ljava/lang/String;LY1/u$f;Ljava/util/Map;)V
    .locals 7

    .line 1
    iget-object v0, p2, LY1/u$f;->o:LY1/u$f$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY1/u$f$a;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget-object v4, p2, LY1/u$f;->r:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p2, LY1/u$f;->s:Ljava/lang/String;

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v6, p3

    .line 14
    invoke-virtual/range {v1 .. v6}, LY1/u;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 10

    .line 1
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 2
    .line 3
    const-string v1, "fb_mobile_login_method_complete"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LY1/u;->n()LY1/y;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string p3, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    .line 12
    .line 13
    invoke-virtual {p2, v1, p3, p1}, LY1/y;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, LY1/u;->n()LY1/y;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0}, LY1/u$e;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0}, LY1/u$e;->q()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v1, "foa_mobile_login_method_complete"

    .line 32
    .line 33
    :cond_1
    move-object v9, v1

    .line 34
    move-object v4, p1

    .line 35
    move-object v5, p2

    .line 36
    move-object v6, p3

    .line 37
    move-object v7, p4

    .line 38
    move-object v8, p5

    .line 39
    invoke-virtual/range {v2 .. v9}, LY1/y;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->s:LY1/u$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, LY1/u$a;->a()V

    .line 7
    .line 8
    .line 9
    :goto_0
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->s:LY1/u$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, LY1/u$a;->b()V

    .line 7
    .line 8
    .line 9
    :goto_0
    return-void
.end method

.method public final u(LY1/u$f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->r:LY1/u$d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0, p1}, LY1/u$d;->a(LY1/u$f;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    return-void
.end method

.method public final v(IILandroid/content/Intent;)Z
    .locals 4

    .line 1
    iget v0, p0, LY1/u;->y:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LY1/u;->y:I

    .line 6
    .line 7
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/facebook/CustomTabMainActivity;->x:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, LY1/u;->B()V

    .line 23
    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    invoke-virtual {p0}, LY1/u;->j()LY1/A;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, LY1/A;->n()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-nez p3, :cond_1

    .line 39
    .line 40
    iget v2, p0, LY1/u;->y:I

    .line 41
    .line 42
    iget v3, p0, LY1/u;->z:I

    .line 43
    .line 44
    if-lt v2, v3, :cond_2

    .line 45
    .line 46
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, LY1/A;->j(IILandroid/content/Intent;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_2
    return v1
.end method

.method public final w(LY1/u$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY1/u;->s:LY1/u$a;

    .line 2
    .line 3
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY1/u;->o:[LY1/A;

    .line 7
    .line 8
    check-cast v0, [Landroid/os/Parcelable;

    .line 9
    .line 10
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, LY1/u;->p:I

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LY1/u;->u:LY1/u$e;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 21
    .line 22
    .line 23
    sget-object p2, LO1/P;->a:LO1/P;

    .line 24
    .line 25
    iget-object p2, p0, LY1/u;->v:Ljava/util/Map;

    .line 26
    .line 27
    invoke-static {p1, p2}, LO1/P;->G0(Landroid/os/Parcel;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, LY1/u;->w:Ljava/util/Map;

    .line 31
    .line 32
    invoke-static {p1, p2}, LO1/P;->G0(Landroid/os/Parcel;Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final x(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY1/u;->q:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LY1/u;->q:Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Lx1/o;

    .line 9
    .line 10
    const-string v0, "Can\'t set fragment once it is already set."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public final y(LY1/u$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY1/u;->r:LY1/u$d;

    .line 2
    .line 3
    return-void
.end method

.method public final z(LY1/u$e;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY1/u;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LY1/u;->b(LY1/u$e;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
