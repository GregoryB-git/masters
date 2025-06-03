.class public LF/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->d(Landroid/content/Context;LF/e;ILjava/util/concurrent/Executor;LF/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LF/a;


# direct methods
.method public constructor <init>(LF/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/f$b;->a:LF/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LF/f$e;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, LF/f$e;

    .line 4
    .line 5
    const/4 v0, -0x3

    .line 6
    invoke-direct {p1, v0}, LF/f$e;-><init>(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LF/f$b;->a:LF/a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LF/a;->b(LF/f$e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LF/f$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF/f$b;->a(LF/f$e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
