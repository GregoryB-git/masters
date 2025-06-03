.class public abstract LF/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/g$b;,
        LF/g$a;,
        LF/g$c;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;LF/e;IZILandroid/os/Handler;LF/g$c;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    new-instance v0, LF/a;

    .line 2
    .line 3
    invoke-direct {v0, p6, p5}, LF/a;-><init>(LF/g$c;Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p1, v0, p2, p4}, LF/f;->e(Landroid/content/Context;LF/e;LF/a;II)Landroid/graphics/Typeface;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p3, 0x0

    .line 14
    invoke-static {p0, p1, p2, p3, v0}, LF/f;->d(Landroid/content/Context;LF/e;ILjava/util/concurrent/Executor;LF/a;)Landroid/graphics/Typeface;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
