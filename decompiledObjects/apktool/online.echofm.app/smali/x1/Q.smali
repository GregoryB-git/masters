.class public final Lx1/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/Q$a;
    }
.end annotation


# static fields
.field public static final d:Lx1/Q$a;

.field public static volatile e:Lx1/Q;


# instance fields
.field public final a:LZ/a;

.field public final b:Lx1/P;

.field public c:Lx1/O;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx1/Q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lx1/Q$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx1/Q;->d:Lx1/Q$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LZ/a;Lx1/P;)V
    .locals 1

    .line 1
    const-string v0, "localBroadcastManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "profileCache"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lx1/Q;->a:LZ/a;

    .line 15
    .line 16
    iput-object p2, p0, Lx1/Q;->b:Lx1/P;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a()Lx1/Q;
    .locals 1

    .line 1
    sget-object v0, Lx1/Q;->e:Lx1/Q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(Lx1/Q;)V
    .locals 0

    .line 1
    sput-object p0, Lx1/Q;->e:Lx1/Q;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final c()Lx1/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/Q;->c:Lx1/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/Q;->b:Lx1/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/P;->b()Lx1/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lx1/Q;->g(Lx1/O;Z)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    return v1
.end method

.method public final e(Lx1/O;Lx1/O;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "com.facebook.sdk.EXTRA_OLD_PROFILE"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p1, "com.facebook.sdk.EXTRA_NEW_PROFILE"

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lx1/Q;->a:LZ/a;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LZ/a;->d(Landroid/content/Intent;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final f(Lx1/O;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lx1/Q;->g(Lx1/O;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final g(Lx1/O;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/Q;->c:Lx1/O;

    .line 2
    .line 3
    iput-object p1, p0, Lx1/Q;->c:Lx1/O;

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lx1/Q;->b:Lx1/P;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Lx1/P;->c(Lx1/O;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2}, Lx1/P;->a()V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    invoke-static {v0, p1}, LO1/P;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lx1/Q;->e(Lx1/O;Lx1/O;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
.end method
