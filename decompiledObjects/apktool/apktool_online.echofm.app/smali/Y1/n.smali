.class public LY1/n;
.super LY1/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY1/n$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LY1/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final s:LY1/n$b;

.field public static t:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# instance fields
.field public final r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY1/n$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY1/n$b;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY1/n;->s:LY1/n$b;

    .line 8
    .line 9
    new-instance v0, LY1/n$a;

    .line 10
    .line 11
    invoke-direct {v0}, LY1/n$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LY1/n;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(LY1/u;)V
    .locals 1

    .line 1
    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LY1/A;-><init>(LY1/u;)V

    const-string p1, "device_auth"

    iput-object p1, p0, LY1/n;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LY1/A;-><init>(Landroid/os/Parcel;)V

    const-string p1, "device_auth"

    iput-object p1, p0, LY1/n;->r:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic p()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 1

    .line 1
    sget-object v0, LY1/n;->t:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic q(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 0

    .line 1
    sput-object p0, LY1/n;->t:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/n;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(LY1/u$e;)I
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LY1/n;->w(LY1/u$e;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1
.end method

.method public r()LY1/m;
    .locals 1

    .line 1
    new-instance v0, LY1/m;

    .line 2
    .line 3
    invoke-direct {v0}, LY1/m;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public t()V
    .locals 3

    .line 1
    sget-object v0, LY1/u$f;->w:LY1/u$f$c;

    .line 2
    .line 3
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LY1/u;->o()LY1/u$e;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "User canceled log in."

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, LY1/u$f$c;->a(LY1/u$e;Ljava/lang/String;)LY1/u$f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, LY1/u;->g(LY1/u$f;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public u(Ljava/lang/Exception;)V
    .locals 8

    .line 1
    const-string v0, "ex"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, LY1/u$f;->w:LY1/u$f$c;

    .line 7
    .line 8
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LY1/u;->o()LY1/u$e;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const/16 v6, 0x8

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static/range {v1 .. v7}, LY1/u$f$c;->d(LY1/u$f$c;LY1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LY1/u$f;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p1}, LY1/u;->g(LY1/u$f;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lx1/h;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 15

    .line 1
    const-string v0, "accessToken"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "applicationId"

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "userId"

    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lx1/a;

    .line 23
    .line 24
    const/16 v13, 0x400

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    move-object v1, v0

    .line 29
    move-object/from16 v5, p4

    .line 30
    .line 31
    move-object/from16 v6, p5

    .line 32
    .line 33
    move-object/from16 v7, p6

    .line 34
    .line 35
    move-object/from16 v8, p7

    .line 36
    .line 37
    move-object/from16 v9, p8

    .line 38
    .line 39
    move-object/from16 v10, p9

    .line 40
    .line 41
    move-object/from16 v11, p10

    .line 42
    .line 43
    invoke-direct/range {v1 .. v14}, Lx1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lx1/h;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    .line 44
    .line 45
    .line 46
    sget-object v1, LY1/u$f;->w:LY1/u$f$c;

    .line 47
    .line 48
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, LY1/u;->o()LY1/u$e;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2, v0}, LY1/u$f$c;->e(LY1/u$e;Lx1/a;)LY1/u$f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v0}, LY1/u;->g(LY1/u$f;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final w(LY1/u$e;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LY1/u;->i()Landroidx/fragment/app/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, LY1/n;->r()LY1/m;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/e;->n()Landroidx/fragment/app/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "login_with_facebook"

    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/d;->T1(Landroidx/fragment/app/n;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, LY1/m;->v2(LY1/u$e;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method
