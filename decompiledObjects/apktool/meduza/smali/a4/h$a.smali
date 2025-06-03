.class public final La4/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()V
    .locals 0

    return-void
.end method

.method public final synthetic b(La4/g$a;Lv3/i0;)La4/h$b;
    .locals 0

    sget-object p1, La4/h$b;->h:Le0/e;

    return-object p1
.end method

.method public final c(Landroid/os/Looper;Lw3/a0;)V
    .locals 0

    return-void
.end method

.method public final d(La4/g$a;Lv3/i0;)La4/e;
    .locals 2

    iget-object p1, p2, Lv3/i0;->w:La4/d;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, La4/n;

    new-instance p2, La4/e$a;

    new-instance v0, La4/y;

    invoke-direct {v0}, La4/y;-><init>()V

    const/16 v1, 0x1771

    invoke-direct {p2, v1, v0}, La4/e$a;-><init>(ILjava/lang/Throwable;)V

    invoke-direct {p1, p2}, La4/n;-><init>(La4/e$a;)V

    return-object p1
.end method

.method public final e(Lv3/i0;)I
    .locals 0

    iget-object p1, p1, Lv3/i0;->w:La4/d;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final synthetic release()V
    .locals 0

    return-void
.end method
