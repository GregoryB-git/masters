.class public LO5/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO5/A$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public b:LO5/A$a;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xf0

    .line 5
    .line 6
    iput v0, p0, LO5/A;->a:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, LO5/A;->c:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;LO5/A$a;LO5/b;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LO5/A;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p1, "A request for permissions is already running, please wait for it to finish before doing another request."

    .line 6
    .line 7
    :goto_0
    invoke-interface {p3, p1}, LO5/b;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    const-string p1, "Unable to detect current Android Activity."

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iput-object p2, p0, LO5/A;->b:LO5/A$a;

    .line 17
    .line 18
    new-instance p2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string p3, "android.permission.POST_NOTIFICATIONS"

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    new-array p3, p3, [Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, [Ljava/lang/String;

    .line 36
    .line 37
    iget-boolean p3, p0, LO5/A;->c:Z

    .line 38
    .line 39
    if-nez p3, :cond_2

    .line 40
    .line 41
    const/16 p3, 0xf0

    .line 42
    .line 43
    invoke-static {p1, p2, p3}, Lw/a;->l(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, LO5/A;->c:Z

    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public b(I[Ljava/lang/String;[I)Z
    .locals 2

    .line 1
    iget-boolean p2, p0, LO5/A;->c:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    const/16 p2, 0xf0

    .line 7
    .line 8
    if-ne p1, p2, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, LO5/A;->b:LO5/A$a;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iput-boolean v0, p0, LO5/A;->c:Z

    .line 15
    .line 16
    array-length p2, p3

    .line 17
    const/4 v1, 0x1

    .line 18
    if-lez p2, :cond_0

    .line 19
    .line 20
    aget p2, p3, v0

    .line 21
    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_0
    invoke-interface {p1, v0}, LO5/A$a;->a(I)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    return v0
.end method
